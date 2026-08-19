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
import androidx.core.graphics.ColorUtils;
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
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CommunityAvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicSeparator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
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
    private static Map monthsToEmoticon;
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
    private ArrayList botButtons;
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
    private ArrayList lineHeights;
    private ArrayList lineWidths;
    private LoadingDrawable loadingDrawable;
    private boolean offerExpired;
    private View.OnClickListener onActionClick;
    private int overriddenMaxWidth;
    private int overrideBackground;
    private Paint overrideBackgroundPaint;
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
    public List spoilers;
    private Stack spoilersPool;
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
    private float viewTop;
    private float viewTranslationX;
    private boolean visiblePartSet;
    private Drawable wallpaperPreviewDrawable;
    private boolean wasLayout;

    public interface ChatActionCellDelegate {

        public abstract class CC {
            public static boolean $default$canDrawOutboundsContent(ChatActionCellDelegate chatActionCellDelegate) {
                return true;
            }

            public static void $default$didClickButton(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static void $default$didClickImage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static boolean $default$didLongPress(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, float f, float f2) {
                return false;
            }

            public static void $default$didOpenPremiumGift(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
            }

            public static void $default$didOpenPremiumGiftChannel(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, String str, boolean z) {
            }

            public static void $default$didPressReaction(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            public static void $default$didPressReplyMessage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i) {
            }

            public static void $default$didPressTaskLink(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i, int i2) {
            }

            public static void $default$forceUpdate(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, boolean z) {
            }

            public static BaseFragment $default$getBaseFragment(ChatActionCellDelegate chatActionCellDelegate) {
                return null;
            }

            public static long $default$getDialogId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static long $default$getTopicId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static void $default$needOpenInviteLink(ChatActionCellDelegate chatActionCellDelegate, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
            }

            public static void $default$needOpenUserProfile(ChatActionCellDelegate chatActionCellDelegate, long j) {
            }

            public static void $default$needShowEffectOverlay(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
            }

            public static void $default$onTopicClick(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }
        }

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

    @Override
    public boolean drawPinnedBottom() {
        return IMessageCell.CC.$default$drawPinnedBottom(this);
    }

    @Override
    public boolean drawPinnedTop() {
        return IMessageCell.CC.$default$drawPinnedTop(this);
    }

    @Override
    public ImageReceiver getAvatarImage() {
        return IMessageCell.CC.$default$getAvatarImage(this);
    }

    @Override
    public float getCheckBoxTranslation() {
        return IMessageCell.CC.$default$getCheckBoxTranslation(this);
    }

    @Override
    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return IMessageCell.CC.$default$getCurrentPosition(this);
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

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public float getSlidingOffsetX() {
        return IMessageCell.CC.$default$getSlidingOffsetX(this);
    }

    public boolean isFloating() {
        return false;
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void setAnimationRunning(boolean z, boolean z2) {
        IMessageCell.CC.$default$setAnimationRunning(this, z, z2);
    }

    @Override
    public boolean shouldDrawAlphaLayer() {
        return IMessageCell.CC.$default$shouldDrawAlphaLayer(this);
    }

    @Override
    public boolean willRemovedAfterAnimation() {
        return IMessageCell.CC.$default$willRemovedAfterAnimation(this);
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

    public void setSpoilersSuppressed(boolean z) {
        Iterator it = this.spoilers.iterator();
        while (it.hasNext()) {
            ((SpoilerEffect) it.next()).setSuppressUpdates(z);
        }
    }

    public void setInvalidateWithParent(View view) {
        this.invalidateWithParent = view;
    }

    public boolean hasButton() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !isButtonLayout(messageObject) || this.giftPremiumButtonLayout == null) ? false : true;
    }

    public void setShowTopic(boolean z) {
        if (this.showTopicSeparator != z) {
            this.showTopicSeparator = z;
            invalidateOutbounds();
            invalidate();
        }
    }

    class TextLayout {
        public AnimatedEmojiSpan.EmojiGroupedSpans emoji;
        public StaticLayout layout;
        public TextPaint paint;
        public int width;
        public float x;
        public float y;
        public List spoilers = new ArrayList();
        public final AtomicReference patchedLayout = new AtomicReference();

        TextLayout() {
        }

        public void setText(CharSequence charSequence, TextPaint textPaint, int i) {
            this.paint = textPaint;
            this.width = i;
            this.layout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
            if (ChatActionCell.this.currentMessageObject == null || !ChatActionCell.this.currentMessageObject.isSpoilersRevealed) {
                SpoilerEffect.addSpoilers(ChatActionCell.this, this.layout, -1, i, null, this.spoilers);
            } else {
                List list = this.spoilers;
                if (list != null) {
                    list.clear();
                }
            }
            attach();
        }

        public void attach() {
            this.emoji = AnimatedEmojiSpan.update(0, (View) ChatActionCell.this, false, this.emoji, this.layout);
        }

        public void detach() {
            AnimatedEmojiSpan.release(ChatActionCell.this, this.emoji);
        }
    }

    public static void $r8$lambda$S4gH4ePZEjRTmNvvEda8UXaxC9w(ChatActionCell chatActionCell, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ChatActionCellDelegate chatActionCellDelegate;
        if (!z) {
            chatActionCell.getClass();
            return;
        }
        RLottieDrawable lottieAnimation = chatActionCell.imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            MessageObject messageObject = chatActionCell.currentMessageObject;
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
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(lottieAnimation));
            if (messageObject.wasUnread || chatActionCell.forceWasUnread) {
                messageObject.wasUnread = false;
                chatActionCell.forceWasUnread = false;
                try {
                    chatActionCell.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (chatActionCell.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) chatActionCell.getContext()).getFireworksOverlay().start();
                }
                TLRPC.VideoSize videoSize = chatActionCell.giftEffectAnimation;
                if (videoSize == null || (chatActionCellDelegate = chatActionCell.delegate) == null) {
                    return;
                }
                chatActionCellDelegate.needShowEffectOverlay(chatActionCell, chatActionCell.giftSticker, videoSize);
            }
        }
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public ChatActionCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.bounce = new ButtonBounce(this);
        this.currentAccount = UserConfig.selectedAccount;
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false);
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
        this.giftTitlePaint = new TextPaint(1);
        this.giftTextPaint = new TextPaint(1);
        this.giftSubtitlePaint = new TextPaint(1);
        this.radialProgress = new RadialProgress2(this);
        this.giftStickerDelegate = new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                ChatActionCell.$r8$lambda$S4gH4ePZEjRTmNvvEda8UXaxC9w(this.f$0, imageReceiver, z2, z3, z4);
            }

            @Override
            public void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.starsPath = new Path();
        this.botButtons = new ArrayList();
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
        view.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(-16777216, 0.1f), 7, AndroidUtilities.dp(16.0f)));
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

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public ChatActionCellDelegate getDelegate() {
        return this.delegate;
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        String dateChat;
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        if (!z) {
            dateChat = LocaleController.formatDateChat(i);
        } else if (i == 2147483646) {
            dateChat = LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline);
        } else {
            dateChat = LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
        }
        this.customDate = i;
        CharSequence charSequence = this.customText;
        if (charSequence == null || !TextUtils.equals(dateChat, charSequence)) {
            this.customText = dateChat;
            this.accessibilityText = null;
            updateTextInternal(z2);
        }
    }

    private void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(this.customText, getMeasuredWidth());
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
    }

    public void setCustomText(CharSequence charSequence) {
        this.customText = charSequence;
        if (charSequence != null) {
            updateTextInternal(false);
        }
    }

    public void setOverrideColor(int i, int i2) {
        this.overrideBackground = i;
        this.overrideText = i2;
    }

    public void setMessageObject(MessageObject messageObject) {
        setMessageObject(messageObject, false);
    }

    public void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC.TL_messageReactions tL_messageReactions;
        String str;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.Document document;
        TLRPC.Document document2;
        ArrayList<Long> arrayList;
        TLRPC.Document document3;
        Object obj;
        long j;
        String tonGiftEmoji;
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
        TLRPC.Document document4;
        String str2;
        int i5;
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
                textLayout.detach();
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
            boolean z8 = !z6;
            this.starGiftLayout.set(messageObject2, z8);
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
            if (messageObject2.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                this.avatarDrawable.setInfo(this.currentAccount, user);
                TL_stories.StoryItem storyItem = messageObject2.messageOwner.media.storyItem;
                if (storyItem != null && storyItem.noforwards) {
                    this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
                } else {
                    StoriesUtilities.setImage(this.imageReceiver, storyItem);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
            } else {
                int i6 = messageObject2.type;
                if (i6 == 22) {
                    if (messageObject2.strippedThumb == null) {
                        int size = messageObject2.photoThumbs.size();
                        for (int i7 = 0; i7 < size && !(messageObject2.photoThumbs.get(i7) instanceof TLRPC.TL_photoStrippedSize); i7++) {
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
                        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
                        this.imageReceiver.clearImage();
                        Drawable backgroundDrawableFromTheme = PreviewView.getBackgroundDrawableFromTheme(this.currentAccount, ChatThemeController.getWallpaperEmoticon(wallPaper), zIsDark, false);
                        this.wallpaperPreviewDrawable = backgroundDrawableFromTheme;
                        if (backgroundDrawableFromTheme != null) {
                            backgroundDrawableFromTheme.setCallback(this);
                        }
                    } else if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null) {
                        this.imageReceiver.setImage(ImageLocation.getForPath(str2), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = messageObject2.photoThumbsObject;
                        if (tLObject instanceof TLRPC.Document) {
                            document4 = (TLRPC.Document) tLObject;
                        } else {
                            document4 = wallPaper.document;
                        }
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
                } else if (i6 == 21) {
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject2.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                    ArrayList<TLRPC.VideoSize> arrayList2 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList2 == null || arrayList2.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize2, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject2.messageOwner.action.photo;
                    if (messageObject2.strippedThumb != null) {
                        photoSize2 = null;
                        break;
                    }
                    int size2 = messageObject2.photoThumbs.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            photoSize2 = null;
                            break;
                        }
                        photoSize2 = messageObject2.photoThumbs.get(i8);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        } else {
                            i8++;
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
                        this.radialProgress.setProgress(f, z5);
                        this.radialProgress.setIcon(4, z5, z5);
                    } else {
                        this.radialProgress.setIcon(3, z5, z5);
                    }
                } else if (i6 == 31 || i6 == 33 || i6 == 30 || i6 == 18 || i6 == 25 || i6 == 35) {
                    this.imageReceiver.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject2.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        this.offerExpired = tL_messageActionNoForwardsRequest.expired || ((long) messageObject2.messageOwner.date) + MessagesController.getInstance(this.currentAccount).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                        if (!messageObject2.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.offerExpired) {
                            BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                            builder.addSharingOfferKeyboard();
                            this.botInlineButtons = builder.build();
                        }
                    } else {
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
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
                            if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift2 != null) {
                                    TLRPC.Document giftDocument2 = TlUtils.getGiftDocument(starGift2);
                                    if (this.cardBackground == null) {
                                        this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                    }
                                    this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                    document = giftDocument2;
                                }
                                str = null;
                                obj = null;
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                if (starGift3 != null) {
                                    document = starGift3.sticker;
                                } else {
                                    document = null;
                                }
                                obj = messageObject2;
                                tL_messages_stickerSet = null;
                                str = null;
                            } else {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                    if (tL_messageActionStarGiftUnique.refunded) {
                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                        if (starGift4 != null) {
                                            document = starGift4.getDocument();
                                        } else {
                                            document = null;
                                        }
                                        obj = messageObject2;
                                        tL_messages_stickerSet = null;
                                        str = null;
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
                                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str);
                                if (stickerSetByName == null) {
                                    stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str);
                                }
                                if (stickerSetByName != null) {
                                    TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                    int i9 = messageAction3.months;
                                    if (messageObject2.type == 30) {
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                            tonGiftEmoji = StarsIntroActivity.getTonGiftEmoji(messageAction3.cryptoAmount);
                                        } else {
                                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                                j = ((TLRPC.TL_messageActionGiftStars) messageAction3).stars;
                                            } else {
                                                j = ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                            }
                                            if (j <= 1000) {
                                                tonGiftEmoji = "2⃣";
                                            } else if (j < 2500) {
                                                tonGiftEmoji = "3⃣";
                                            } else {
                                                tonGiftEmoji = "4⃣";
                                            }
                                        }
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < stickerSetByName.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i10);
                                                if (!TextUtils.equals(tL_stickerPack.emoticon, tonGiftEmoji) || tL_stickerPack.documents.isEmpty()) {
                                                    i10++;
                                                } else {
                                                    long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 < stickerSetByName.documents.size()) {
                                                            document2 = stickerSetByName.documents.get(i11);
                                                            if (document2 == null || document2.id != jLongValue) {
                                                                i11++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            document3 = null;
                                            if (document3 == null && !stickerSetByName.documents.isEmpty()) {
                                                document3 = stickerSetByName.documents.get(0);
                                            }
                                            document = document3;
                                            tL_messages_stickerSet = stickerSetByName;
                                            obj = tL_messages_stickerSet;
                                        }
                                    } else {
                                        String str3 = (String) monthsToEmoticon.get(Integer.valueOf(i9));
                                        ArrayList<TLRPC.TL_stickerPack> arrayList3 = stickerSetByName.packs;
                                        int size3 = arrayList3.size();
                                        document2 = null;
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            TLRPC.TL_stickerPack tL_stickerPack2 = arrayList3.get(i12);
                                            i12++;
                                            TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                            if (Objects.equals(tL_stickerPack3.emoticon, str3)) {
                                                ArrayList<Long> arrayList4 = tL_stickerPack3.documents;
                                                int size4 = arrayList4.size();
                                                int i13 = 0;
                                                while (i13 < size4) {
                                                    Long l = arrayList4.get(i13);
                                                    i13++;
                                                    long jLongValue2 = l.longValue();
                                                    ArrayList<TLRPC.Document> arrayList5 = stickerSetByName.documents;
                                                    int size5 = arrayList5.size();
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 >= size5) {
                                                            arrayList = arrayList4;
                                                            break;
                                                        }
                                                        TLRPC.Document document5 = arrayList5.get(i14);
                                                        int i15 = i14 + 1;
                                                        TLRPC.Document document6 = document5;
                                                        ArrayList<TLRPC.Document> arrayList6 = arrayList5;
                                                        arrayList = arrayList4;
                                                        if (document6.id == jLongValue2) {
                                                            document2 = document6;
                                                            break;
                                                        } else {
                                                            arrayList4 = arrayList;
                                                            i14 = i15;
                                                            arrayList5 = arrayList6;
                                                        }
                                                    }
                                                    if (document2 != null) {
                                                        break;
                                                    } else {
                                                        arrayList4 = arrayList;
                                                    }
                                                }
                                            }
                                            if (document2 != null) {
                                                break;
                                            }
                                        }
                                    }
                                    document3 = document2;
                                    if (document3 == null) {
                                        document3 = stickerSetByName.documents.get(0);
                                    }
                                    document = document3;
                                    tL_messages_stickerSet = stickerSetByName;
                                    obj = tL_messages_stickerSet;
                                } else {
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
                                        botButton = new BotButton(new Runnable() {
                                            @Override
                                            public final void run() {
                                                this.f$0.invalidateOutbounds();
                                            }
                                        });
                                        botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button;
                                        iconRes = button.getIconRes();
                                        if (iconRes != 0) {
                                            Drawable drawable = getResources().getDrawable(iconRes);
                                            botButton.iconDrawable = drawable;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        botButton.height = AndroidUtilities.dp(40.0f);
                                        int i16 = botButton.positionFlags | 8;
                                        botButton.positionFlags = i16;
                                        if (i4 == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int flag = BitwiseUtils.setFlag(i16, 1, z3);
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
                                if (!z6 || messageObject2.type != 18) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                    this.imageReceiver.setAutoRepeat(0);
                                    this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject2.stableId)), svgThumb, "tgs", obj, 1);
                                }
                            } else if (str != null) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                                if (tL_messages_stickerSet == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                mediaDataController.loadStickersByEmojiOrName(str, false, z2);
                            }
                        }
                        tL_messages_stickerSet = null;
                        str = null;
                        obj = null;
                        source = this.botInlineButtons;
                        if (source != null) {
                            rowsCount = source.getRowsCount();
                            while (i3 < rowsCount) {
                                columnsCount = this.botInlineButtons.getColumnsCount(i3);
                                while (i4 < columnsCount) {
                                    BotInlineKeyboard.Button button2 = this.botInlineButtons.getButton(i3, i4);
                                    botButton = new BotButton(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.invalidateOutbounds();
                                        }
                                    });
                                    botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button2;
                                    iconRes = button2.getIconRes();
                                    if (iconRes != 0) {
                                        Drawable drawable2 = getResources().getDrawable(iconRes);
                                        botButton.iconDrawable = drawable2;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    }
                                    botButton.height = AndroidUtilities.dp(40.0f);
                                    int i17 = botButton.positionFlags | 8;
                                    botButton.positionFlags = i17;
                                    if (i4 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    int flag2 = BitwiseUtils.setFlag(i17, 1, z3);
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
                            if (!z6) {
                                SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject2.stableId)), svgThumb2, "tgs", obj, 1);
                            } else {
                                SvgHelper.SvgDrawable svgThumb3 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject2.stableId)), svgThumb3, "tgs", obj, 1);
                            }
                        } else if (str != null) {
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                            if (tL_messages_stickerSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            mediaDataController2.loadStickersByEmojiOrName(str, false, z2);
                        }
                    }
                    tL_messages_stickerSet = null;
                    document = null;
                    str = null;
                    obj = null;
                    source = this.botInlineButtons;
                    if (source != null) {
                        rowsCount = source.getRowsCount();
                        while (i3 < rowsCount) {
                            columnsCount = this.botInlineButtons.getColumnsCount(i3);
                            while (i4 < columnsCount) {
                                BotInlineKeyboard.Button button3 = this.botInlineButtons.getButton(i3, i4);
                                botButton = new BotButton(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.invalidateOutbounds();
                                    }
                                });
                                botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button3;
                                iconRes = button3.getIconRes();
                                if (iconRes != 0) {
                                    Drawable drawable3 = getResources().getDrawable(iconRes);
                                    botButton.iconDrawable = drawable3;
                                    drawable3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                botButton.height = AndroidUtilities.dp(40.0f);
                                int i18 = botButton.positionFlags | 8;
                                botButton.positionFlags = i18;
                                if (i4 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int flag3 = BitwiseUtils.setFlag(i18, 1, z3);
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
                        if (!z6) {
                            SvgHelper.SvgDrawable svgThumb4 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject2.stableId)), svgThumb4, "tgs", obj, 1);
                        } else {
                            SvgHelper.SvgDrawable svgThumb5 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject2.stableId)), svgThumb5, "tgs", obj, 1);
                        }
                    } else if (str != null) {
                        MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                        if (tL_messages_stickerSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mediaDataController3.loadStickersByEmojiOrName(str, false, z2);
                    }
                } else if (i6 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject2.messageOwner.action).community_id));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    this.imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.imageReceiver.setAutoRepeatCount(1);
                    this.avatarDrawable.setInfo(chat);
                    this.imageReceiver.setForUserOrChat(chat, new CommunityAvatarDrawable(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i6 == 11) {
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
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size6) {
                                photoSize = null;
                                break;
                            }
                            photoSize = messageObject2.photoThumbs.get(i19);
                            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            } else {
                                i19++;
                            }
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
            if (this.firstInChat && this.isAllChats && this.isSideMenued && (this.isForum || this.isMonoForum || this.isBotForum)) {
                this.topicSeparatorTopPadding = AndroidUtilities.dp(33.0f);
                if (this.topicSeparator == null) {
                    TopicSeparator topicSeparator = new TopicSeparator(this.currentAccount, this, this.themeDelegate, true);
                    this.topicSeparator = topicSeparator;
                    topicSeparator.setOnClickListener(new Runnable() {
                        @Override
                        public final void run() {
                            ChatActionCell.m1475$r8$lambda$cDTZBrfYD_jYF1ibOtCKrrbAMk(this.f$0);
                        }
                    });
                }
                if (!this.topicSeparator.update(this.currentMessageObject)) {
                    this.topicSeparator.detach();
                    this.topicSeparator = null;
                    i5 = 0;
                    this.topicSeparatorTopPadding = 0;
                } else {
                    if (this.attachedToWindow) {
                        this.topicSeparator.attach();
                    }
                    i5 = 0;
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
            int i20 = this.topicSeparatorTopPadding;
            if (paddingTop != i20) {
                setPadding(i5, i20, i5, i5);
            }
            View view = this.rippleView;
            if (!isButtonLayout(messageObject) || this.starGiftLayout.has()) {
                i5 = 8;
            }
            view.setVisibility(i5);
            ForumUtilities.applyTopicToMessage(messageObject2);
            requestLayout();
        }
    }

    public static void m1475$r8$lambda$cDTZBrfYD_jYF1ibOtCKrrbAMk(ChatActionCell chatActionCell) {
        ChatActionCellDelegate chatActionCellDelegate = chatActionCell.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.onTopicClick(chatActionCell);
        }
    }

    private float getUploadingInfoProgress(MessageObject messageObject) {
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

    @Override
    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public ReactionsLayoutInBubble getReactionsLayout() {
        return this.reactionsLayoutInBubble;
    }

    @Override
    public void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.didPressReaction(this, reactionCount, z, f, f2);
        }
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
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
    protected boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.rippleView;
        RectF rectF = this.giftButtonRect;
        view.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.detach();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.avatarStoryParams.onDetachFromWindow();
        this.transitionParams.onDetach();
        this.starGiftLayout.detach();
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

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
    }

    @Override
    protected void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.attach();
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
        this.starGiftLayout.attach();
        this.reactionsLayoutInBubble.onAttachToWindow();
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.attach();
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            suggestBirthdayActionLayout.attach();
        }
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
            ((StarParticlesView.Drawable.Particle) this.starParticlesDrawable.particles.get(i)).lifeTime += System.currentTimeMillis() - this.starParticlesDrawable.pausedTime;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ImageUpdater imageUpdater;
        TextLayout textLayout;
        TextLayout textLayout2;
        TLRPC.Message message;
        boolean z;
        StaticLayout staticLayout;
        List list;
        char c;
        TLRPC.Message message2;
        int i;
        MessageObject messageObject = this.currentMessageObject;
        float x = motionEvent.getX() - (this.sideMenuWidth / 2.0f);
        this.lastTouchX = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.lastTouchY = y;
        boolean zCheckBotButtonMotionEvent = true;
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
        if (topicSeparator != null && topicSeparator.onTouchEvent(motionEvent, false)) {
            return true;
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null && suggestBirthdayActionLayout.onTouchEvent(motionEvent)) {
            return true;
        }
        if ((this.starGiftLayout.has() && this.starGiftLayout.onTouchEvent(this.starGiftLayoutX, this.starGiftLayoutY, motionEvent)) || this.reactionsLayoutInBubble.checkTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.delegate != null) {
                if ((messageObject.type == 11 || isButtonLayout(messageObject)) && this.imageReceiver.isInsideImage(x, y)) {
                    this.imagePressed = true;
                    z = true;
                } else {
                    z = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i = messageObject.type) == 21 || i == 22) && this.backgroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z = true;
                }
                TextLayout textLayout3 = this.giftPremiumText;
                if (textLayout3 == null || !this.giftPremiumTextCollapsed) {
                    c = 0;
                } else {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = textLayout3.x;
                    float f2 = textLayout3.y;
                    float width = textLayout3.layout.getWidth() + f;
                    TextLayout textLayout4 = this.giftPremiumText;
                    c = 0;
                    rectF.set(f, f2, width, textLayout4.y + textLayout4.layout.getHeight());
                    if (rectF.contains(x, y)) {
                        this.textPressed = true;
                        z = true;
                    }
                }
                if (isButtonLayout(messageObject) && this.giftPremiumButtonLayout != null && (this.giftButtonRect.contains(x, y) || (this.buttonClickableAsImage && this.backgroundRect.contains(x, y)))) {
                    View view = this.rippleView;
                    this.giftButtonPressed = true;
                    view.setPressed(true);
                    this.bounce.setPressed(true);
                    z = true;
                }
                if (!z && isMessageActionSuggestedPostApproval()) {
                    this.textPressed = true;
                    z = true;
                }
                if (!z) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    TLRPC.MessageAction messageAction = (messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action;
                    Class[] clsArr = new Class[2];
                    clsArr[c] = TLRPC.TL_messageActionSuggestedPostRefund.class;
                    clsArr[1] = TLRPC.TL_messageActionSuggestedPostSuccess.class;
                    if (TlUtils.isInstance(messageAction, clsArr)) {
                        this.textPressed = true;
                        z = true;
                    }
                }
                if (z) {
                    startCheckLongPress();
                }
            } else {
                z = false;
            }
        } else {
            if (motionEvent.getAction() != 2) {
                cancelCheckLongPress();
            }
            if (this.actionPressed) {
                if (motionEvent.getAction() == 2) {
                    if (x < this.backgroundLeft || x > this.backgroundRight) {
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
            } else if (this.textPressed) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    View view2 = this.rippleView;
                    this.textPressed = false;
                    view2.setPressed(false);
                    this.bounce.setPressed(false);
                    if (this.delegate != null && messageObject.replyMessageObject != null && (message = messageObject.messageOwner) != null && TlUtils.isInstance(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
                    } else {
                        if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout2 = this.giftPremiumText) != null) {
                            int height = textLayout2.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                            this.giftPremiumTextUncollapsed = true;
                            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                            if (chatActionCellDelegate != null) {
                                chatActionCellDelegate.forceUpdate(this, false);
                                if (getParent() instanceof RecyclerListView) {
                                    ((RecyclerListView) getParent()).smoothScrollBy(0, height + AndroidUtilities.dp(24.0f));
                                }
                            }
                            return true;
                        }
                        if (this.birthdayLayout != null && this.backgroundRect.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.birthdayLayout.open();
                            return true;
                        }
                    }
                } else if (action == 2) {
                    TextLayout textLayout5 = this.giftPremiumText;
                    if (textLayout5 == null || !this.giftPremiumTextCollapsed) {
                        this.textPressed = false;
                    } else {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f3 = textLayout5.x;
                        float f4 = textLayout5.y;
                        float width2 = textLayout5.layout.getWidth() + f3;
                        TextLayout textLayout6 = this.giftPremiumText;
                        rectF2.set(f3, f4, width2, textLayout6.y + textLayout6.layout.getHeight());
                        if (!rectF2.contains(x, y)) {
                            this.textPressed = false;
                        }
                    }
                    z = true;
                } else if (action == 3) {
                    this.textPressed = false;
                    this.bounce.setPressed(false);
                }
            } else if (this.giftButtonPressed) {
                int action2 = motionEvent.getAction();
                if (action2 == 1) {
                    this.imagePressed = false;
                    View view3 = this.rippleView;
                    this.giftButtonPressed = false;
                    view3.setPressed(false);
                    this.bounce.setPressed(false);
                    if (this.delegate != null) {
                        int i2 = messageObject.type;
                        if (i2 == 37) {
                            playSoundEffect(0);
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment != null) {
                                new CommunitySheet(safeLastFragment, ((TLRPC.TL_messageActionChangeCommunity) messageObject.messageOwner.action).community_id).show();
                            }
                        } else if (i2 == 31) {
                            playSoundEffect(0);
                            openStarsGiftTransaction();
                        } else if (i2 == 25) {
                            playSoundEffect(0);
                            openPremiumGiftChannel();
                        } else if (i2 == 18) {
                            playSoundEffect(0);
                            openPremiumGiftPreview();
                        } else if (i2 == 30) {
                            playSoundEffect(0);
                            openStarsGiftTransaction();
                        } else {
                            TLRPC.Message message3 = messageObject.messageOwner;
                            if (message3 != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                                    playSoundEffect(0);
                                    openStarsNeedSheet();
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
                        View view4 = this.rippleView;
                        this.giftButtonPressed = false;
                        view4.setPressed(false);
                        this.bounce.setPressed(false);
                    }
                } else if (!isButtonLayout(messageObject) || (!this.giftButtonRect.contains(x, y) && !this.backgroundRect.contains(x, y))) {
                    View view5 = this.rippleView;
                    this.giftButtonPressed = false;
                    view5.setPressed(false);
                    this.bounce.setPressed(false);
                }
            } else if (this.imagePressed) {
                int action3 = motionEvent.getAction();
                if (action3 == 1) {
                    this.imagePressed = false;
                    if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout = this.giftPremiumText) != null) {
                        int height2 = textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                        this.giftPremiumTextUncollapsed = true;
                        ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
                        if (chatActionCellDelegate2 != null) {
                            chatActionCellDelegate2.forceUpdate(this, false);
                            if (getParent() instanceof RecyclerListView) {
                                ((RecyclerListView) getParent()).smoothScrollBy(0, height2 + AndroidUtilities.dp(16.0f));
                            }
                        }
                        return true;
                    }
                    int i3 = messageObject.type;
                    if (i3 == 31) {
                        openStarsGiftTransaction();
                    } else if (i3 == 25) {
                        openPremiumGiftChannel();
                    } else if (i3 == 18) {
                        openPremiumGiftPreview();
                    } else if (i3 == 30) {
                        openStarsGiftTransaction();
                    } else if (this.delegate != null) {
                        if (i3 == 21 && (imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id)) != null) {
                            imageUpdater.cancel();
                        } else {
                            this.delegate.didClickImage(this);
                            playSoundEffect(0);
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
        if (z || (motionEvent.getAction() != 0 && ((this.pressedLink == null && this.spoilerPressed == null) || motionEvent.getAction() != 1))) {
            zCheckBotButtonMotionEvent = z;
        } else {
            TextLayout textLayout7 = this.giftPremiumText;
            if (textLayout7 != null && (list = textLayout7.spoilers) != null && !list.isEmpty() && !this.isSpoilerRevealing) {
                for (SpoilerEffect spoilerEffect : this.giftPremiumText.spoilers) {
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
                                spoilerEffect2.setOnRippleEndCallback(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChatActionCell.m1476$r8$lambda$mUNFCe4MBIqd3uzNBOTkDvvGtw(this.f$0);
                                    }
                                });
                                float fSqrt = (float) Math.sqrt(Math.pow(this.giftPremiumText.layout.getWidth(), 2.0d) + Math.pow(this.giftPremiumText.layout.getHeight(), 2.0d));
                                SpoilerEffect spoilerEffect3 = this.spoilerPressed;
                                TextLayout textLayout9 = this.giftPremiumText;
                                spoilerEffect3.startRipple((int) (x - textLayout9.x), (int) (y - textLayout9.y), fSqrt);
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
                zCheckBotButtonMotionEvent = z;
            } else {
                int i4 = this.textX;
                if (x >= i4) {
                    int i5 = this.textY;
                    float f5 = i5;
                    if (y >= f5 && x <= i4 + this.textWidth && y <= i5 + this.textHeight) {
                        float f6 = y - f5;
                        float f7 = x - this.textXLeft;
                        if (!z) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f6);
                            int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f7);
                            float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                            if (lineLeft > f7 || lineLeft + this.textLayout.getLineWidth(lineForVertical) < f7) {
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
                                    } else {
                                        this.pressedLink = null;
                                    }
                                } else {
                                    this.pressedLink = null;
                                }
                            }
                        }
                    } else {
                        this.pressedLink = null;
                    }
                    zCheckBotButtonMotionEvent = z;
                } else {
                    this.pressedLink = null;
                    zCheckBotButtonMotionEvent = z;
                }
            }
        }
        if (!zCheckBotButtonMotionEvent) {
            zCheckBotButtonMotionEvent = checkBotButtonMotionEvent(motionEvent);
        }
        return !zCheckBotButtonMotionEvent ? super.onTouchEvent(motionEvent) : zCheckBotButtonMotionEvent;
    }

    public static void m1476$r8$lambda$mUNFCe4MBIqd3uzNBOTkDvvGtw(final ChatActionCell chatActionCell) {
        chatActionCell.getClass();
        chatActionCell.post(new Runnable() {
            @Override
            public final void run() {
                ChatActionCell.$r8$lambda$Z1V1srFE968YUdSOBQotJ1HPj0Q(this.f$0);
            }
        });
    }

    public static void $r8$lambda$Z1V1srFE968YUdSOBQotJ1HPj0Q(ChatActionCell chatActionCell) {
        chatActionCell.isSpoilerRevealing = false;
        chatActionCell.getMessageObject().isSpoilersRevealed = true;
        List list = chatActionCell.giftPremiumText.spoilers;
        if (list != null) {
            list.clear();
        }
        chatActionCell.invalidate();
    }

    private void openPremiumGiftChannel() {
        if (this.delegate != null) {
            final TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell chatActionCell = this.f$0;
                    chatActionCell.delegate.didOpenPremiumGiftChannel(chatActionCell, tL_messageActionGiftCode.slug, false);
                }
            });
        }
    }

    private boolean isSelfGiftCode() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.onActionClick = onClickListener;
    }

    private boolean isGiftCode() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode);
    }

    private void openPremiumGiftPreview() {
        final TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        TLRPC.MessageAction messageAction = this.currentMessageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        final String str = (!isGiftCode() || isSelfGiftCode()) ? null : ((TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action).slug;
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell chatActionCell = this.f$0;
                    chatActionCell.delegate.didOpenPremiumGift(chatActionCell, tL_premiumGiftOption, str, false);
                }
            });
        }
    }

    private void openStarsGiftTransaction() {
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
            StarsIntroActivity.showTransactionSheet(context, i, message2.date, message2.from_id, message2.peer_id, (TLRPC.TL_messageActionGiftStars) message2.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            int i2 = this.currentAccount;
            TLRPC.Message message3 = this.currentMessageObject.messageOwner;
            StarsIntroActivity.showTransactionSheet(context2, i2, message3.date, message3.from_id, message3.peer_id, (TLRPC.TL_messageActionPrizeStars) message3.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            int i3 = this.currentAccount;
            TLRPC.Message message4 = this.currentMessageObject.messageOwner;
            StarsIntroActivity.showTransactionSheet(context3, i3, message4.date, message4.from_id, message4.peer_id, (TLRPC.TL_messageActionGiftTon) message4.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(this.currentMessageObject).show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.fire_on, LocaleController.getString(R.string.UniqueGiftNotFoundBurned)).show();
                return;
            }
            new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(this.currentMessageObject).show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null).show();
                }
            }
        }
    }

    private void openStarsNeedSheet() {
        MessageSuggestionParams messageSuggestionParamsObtainSuggestionOffer = this.currentMessageObject.obtainSuggestionOffer();
        AmountUtils$Amount amountUtils$Amount = messageSuggestionParamsObtainSuggestionOffer.amount;
        if (amountUtils$Amount == null || amountUtils$Amount.currency != AmountUtils$Currency.STARS) {
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(getContext(), this.themeDelegate, messageSuggestionParamsObtainSuggestionOffer.amount.asDecimal(), 13, ForumUtilities.getMonoForumTitle(this.currentAccount, this.currentMessageObject.getDialogId(), true), null, this.currentMessageObject.getDialogId()).show();
    }

    public void openLink(CharacterStyle characterStyle) {
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

    public void setOverrideTextMaxWidth(int i) {
        this.overriddenMaxWidth = i;
    }

    private boolean isMessageActionSuggestedPostApproval() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    private void createLayout(CharSequence charSequence, int i) {
        TextPaint textPaint;
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
        if (isMessageActionSuggestedPostApproval() || ((messageObject = this.currentMessageObject) != null && ((i2 = messageObject.type) == 34 || i2 == 35))) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText3");
        } else if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText2");
        } else {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.linkColor = textPaint2.getColor();
        if (isMessageActionSuggestedPostApproval()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint2.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequenceReplaceEmoji = charSequence;
        }
        CharSequence charSequence2 = charSequenceReplaceEmoji;
        this.textLayout = new StaticLayout(charSequenceReplaceEmoji, textPaint2, i4, isMessageActionSuggestedPostApproval() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.titleLayout = null;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.titleLayout = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
            this.titleHeight = height + AndroidUtilities.dp(12.0f);
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
            this.textY = iDp2 + this.titleHeight + AndroidUtilities.dp(11.0f);
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

    @Override
    protected void onMeasure(int i, int i2) {
        int iDp;
        float f;
        float f2;
        float f3;
        float height;
        float f4;
        float fDp;
        TLRPC.Message message;
        int i3;
        int i4;
        int i5;
        int iDp2;
        int i6;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.topicSeparatorTopPadding + this.textHeight + AndroidUtilities.dp(14.0f));
            return;
        }
        int iDp3 = 0;
        if (isButtonLayout(messageObject)) {
            this.giftRectSize = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i6 = messageObject.type) == 18 || i6 == 30 || isMessageActionSuggestedPostApproval())) || messageObject.type == 35) {
                this.giftRectSize = (int) (this.giftRectSize * 1.2f);
            }
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(192.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(220.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 37) {
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
            buildLayout();
        }
        if (messageObject == null) {
            iDp = 0;
        } else {
            if (messageObject.type == 11) {
                i5 = AndroidUtilities.roundMessageSize;
                iDp2 = AndroidUtilities.dp(10.0f);
            } else if (isButtonLayout(messageObject)) {
                i5 = this.giftRectSize;
                iDp2 = AndroidUtilities.dp(12.0f);
            } else {
                iDp = 0;
            }
            iDp = i5 + iDp2;
        }
        if (this.starGiftLayout.has()) {
            iDp3 = (this.starGiftLayout.repost ? 0 : this.textY + this.textHeight + AndroidUtilities.dp(16.0f)) + ((int) this.starGiftLayout.getHeight()) + AndroidUtilities.dp(8.0f);
            ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble.isEmpty) {
                reactionsLayoutInBubble.totalHeight = reactionsLayoutInBubble.height + AndroidUtilities.dp(8.0f);
                i4 = this.reactionsLayoutInBubble.totalHeight;
                iDp3 += i4;
            }
            f = 14.0f;
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                iDp3 = suggestBirthdayActionLayout.height() + AndroidUtilities.dp(12.0f);
                ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble2.isEmpty) {
                    reactionsLayoutInBubble2.totalHeight = reactionsLayoutInBubble2.height + AndroidUtilities.dp(8.0f);
                    i4 = this.reactionsLayoutInBubble.totalHeight;
                    iDp3 += i4;
                }
            } else if (isButtonLayout(messageObject)) {
                boolean zIsGiftChannel = isGiftChannel(messageObject);
                f = 14.0f;
                int imageSize = getImageSize(messageObject);
                if (isNewStyleButtonLayout()) {
                    f3 = 30.0f;
                    f2 = 12.0f;
                    int iDp4 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    int iDp5 = AndroidUtilities.dp(16.0f);
                    if (imageSize > 0) {
                        iDp5 = (iDp5 * 2) + imageSize;
                    }
                    int i7 = iDp4 + iDp5;
                    TextLayout textLayout = this.giftPremiumText;
                    height = i7 + (textLayout == null ? 0 : textLayout.layout.getHeight() + AndroidUtilities.dp(4.0f));
                } else {
                    f2 = 12.0f;
                    f3 = 30.0f;
                    float fDp2 = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + imageSize + AndroidUtilities.dp(4.0f);
                    TextLayout textLayout2 = this.giftPremiumText;
                    height = fDp2 + (textLayout2 == null ? 0 : textLayout2.layout.getHeight() + AndroidUtilities.dp(4.0f));
                }
                this.giftPremiumAdditionalHeight = 0;
                StaticLayout staticLayout = this.giftPremiumTitleLayout;
                if (staticLayout != null) {
                    float height2 = height + staticLayout.getHeight();
                    if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                        f4 = 10.0f;
                        this.giftPremiumAdditionalHeight += this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1);
                    } else {
                        f4 = 10.0f;
                    }
                    fDp = height2 + AndroidUtilities.dp(zIsGiftChannel ? 6.0f : 0.0f);
                    StaticLayout staticLayout2 = this.giftPremiumSubtitleLayout;
                    if (staticLayout2 != null) {
                        fDp += staticLayout2.getHeight() + AndroidUtilities.dp(9.0f);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        fDp += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    f4 = 10.0f;
                    fDp = height - AndroidUtilities.dp(f2);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f3);
                }
                TextLayout textLayout3 = this.giftPremiumText;
                int height3 = textLayout3 == null ? 0 : textLayout3.layout.getHeight();
                if (this.giftPremiumText == null) {
                    this.giftPremiumAdditionalHeight = 0;
                } else if (this.giftPremiumSubtitleLayout != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(f4) + height3;
                } else {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.giftPremiumAdditionalHeight += height3 - AndroidUtilities.dp(this.giftPremiumButtonLayout == null ? 0.0f : 10.0f);
                    } else if (this.currentMessageObject.type == 30) {
                        this.giftPremiumAdditionalHeight += height3 - AndroidUtilities.dp(20.0f);
                    } else if (this.giftPremiumTextCollapsed) {
                        this.giftPremiumAdditionalHeight += height3;
                    } else if (this.giftPremiumText.layout.getLineCount() > 2) {
                        this.giftPremiumAdditionalHeight += ((this.giftPremiumText.layout.getLineBottom(0) - this.giftPremiumText.layout.getLineTop(0)) * this.giftPremiumText.layout.getLineCount()) - 2;
                    }
                }
                if (this.giftPremiumReleasedText != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(24.0f);
                }
                int iDp6 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(zIsGiftChannel ? 14.0f : 0.0f);
                this.giftPremiumAdditionalHeight = iDp6;
                iDp += iDp6;
                int iDp7 = this.textHeight + iDp + AndroidUtilities.dp(14.0f);
                StaticLayout staticLayout3 = this.giftPremiumButtonLayout;
                if (staticLayout3 != null) {
                    float height4 = fDp + ((((iDp7 - fDp) - staticLayout3.getHeight()) - AndroidUtilities.dp(8.0f)) / 2.0f);
                    if (this.currentMessageObject.isStarGiftAction()) {
                        height4 += AndroidUtilities.dp(4.0f);
                    }
                    float f5 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    RectF rectF = this.giftButtonRect;
                    float fDp3 = f5 - AndroidUtilities.dp(18.0f);
                    float fDp4 = height4 - AndroidUtilities.dp(8.0f);
                    float fDp5 = f5 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
                    StaticLayout staticLayout4 = this.giftPremiumButtonLayout;
                    rectF.set(fDp3, fDp4, fDp5, height4 + (staticLayout4 != null ? staticLayout4.getHeight() : 0) + AndroidUtilities.dp(8.0f));
                } else {
                    iDp -= AndroidUtilities.dp(40.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.currentMessageObject;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        iDp -= AndroidUtilities.dp(8.0f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(8.0f);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                this.starParticlesDrawable.rect.set(this.giftButtonRect);
                this.starParticlesDrawable.rect2.set(this.giftButtonRect);
                if (this.starsSize != measuredWidth) {
                    this.starsSize = measuredWidth;
                    this.starParticlesDrawable.resetPositions();
                }
                if (isNewStyleButtonLayout()) {
                    int iDp8 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    this.backgroundRectHeight = 0;
                    int iDp9 = imageSize > 0 ? (AndroidUtilities.dp(16.0f) * 2) + imageSize : AndroidUtilities.dp(16.0f);
                    this.backgroundRectHeight = iDp9;
                    StaticLayout staticLayout5 = this.giftPremiumSubtitleLayout;
                    if (staticLayout5 != null) {
                        this.backgroundRectHeight = iDp9 + staticLayout5.getHeight() + AndroidUtilities.dp(f4);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight += AndroidUtilities.dp(15.0f);
                    }
                    int i8 = this.backgroundRectHeight + height3;
                    this.backgroundRectHeight = i8;
                    float f6 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = i8 + iDp8 + AndroidUtilities.dp(7.0f);
                        this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + this.giftPremiumButtonLayout.getHeight() + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight = (int) (this.backgroundRectHeight + AndroidUtilities.dp(4.0f) + this.giftButtonRect.height());
                    } else if (!isMessageActionSuggestedPostApproval() && (messageObject == null || ((i3 = messageObject.type) != 34 && i3 != 33 && i3 != 35))) {
                        this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + AndroidUtilities.dp(17.0f) + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight += AndroidUtilities.dp(17.0f);
                    }
                    int iDp10 = this.backgroundRectHeight + AndroidUtilities.dp(15.0f);
                    this.backgroundRectHeight = iDp10;
                    int iDp11 = iDp8 + iDp10 + AndroidUtilities.dp(6.0f);
                    ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                    if (!reactionsLayoutInBubble3.isEmpty) {
                        reactionsLayoutInBubble3.totalHeight = reactionsLayoutInBubble3.height + AndroidUtilities.dp(8.0f);
                        iDp11 += this.reactionsLayoutInBubble.totalHeight;
                    }
                    iDp3 = iDp11;
                    if (this.botInlineButtons != null) {
                        iDp3 += AndroidUtilities.dp(44.0f);
                    }
                }
                this.giftButtonRect.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
            f = 14.0f;
        }
        if (this.currentMessageObject != null) {
            ReactionsLayoutInBubble reactionsLayoutInBubble4 = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble4.isEmpty) {
                reactionsLayoutInBubble4.totalHeight = reactionsLayoutInBubble4.height + AndroidUtilities.dp(8.0f);
                iDp += this.reactionsLayoutInBubble.totalHeight;
            }
        }
        if (isMessageActionSuggestedPostApproval()) {
            iDp += this.titleHeight + AndroidUtilities.dp(24.0f);
        }
        if (messageObject != null && isNewStyleButtonLayout()) {
            setMeasuredDimension(iMax, this.topicSeparatorTopPadding + iDp3);
        } else {
            setMeasuredDimension(iMax, this.topicSeparatorTopPadding + this.textHeight + iDp + AndroidUtilities.dp(f));
        }
        this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
    }

    private boolean isNewStyleButtonLayout() {
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

    private int getImageSize(MessageObject messageObject) {
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

    private void buildLayout() {
        CharSequence charSequenceCreateActionTextWithTopic;
        CharSequence charSequence;
        int i;
        long dialogId;
        TLRPC.User user;
        CharSequence charSequenceReplaceTags;
        long dialogId2;
        TLRPC.User user2;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z;
        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto;
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
        int i2;
        long peerDialogId;
        boolean z3;
        String str;
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
        int i3;
        char c;
        TLRPC.User user5;
        TLRPC.MessageAction messageAction2;
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift;
        long j;
        long clientUserId;
        TLRPC.Peer peer;
        boolean z4;
        boolean z5;
        long fromChatId2;
        SpannableStringBuilder spannableStringBuilder3;
        TLObject userOrChat;
        long peerDialogId2;
        long j2;
        boolean z6;
        int i4;
        TL_stars.StarGift starGift;
        String str2;
        boolean z7;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        CharSequence charSequenceReplaceTags4;
        String string6;
        TL_stars.StarGift starGift2;
        CharSequence string7;
        CharSequence string8;
        CharSequence charSequence4;
        TL_stars.StarGift starGift3;
        CharSequence charSequenceReplaceSingleTagToLink;
        String publicUsername;
        char c2;
        Object objValueOf;
        TLRPC.Peer peer2;
        String string9;
        TLRPC.MessageAction messageAction3;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction4;
        int i5;
        TLRPC.MessageMedia messageMedia;
        this.giftRectEmpty = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            if (!messageObject.isExpiredStory()) {
                ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                charSequenceCreateActionTextWithTopic = (chatActionCellDelegate != null && chatActionCellDelegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject)) ? ForumUtilities.createActionTextWithTopic(MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true)), messageObject) : null;
            } else if (messageObject.messageOwner.media.user_id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                charSequenceCreateActionTextWithTopic = StoriesUtilities.createExpiredStoryString(true, R.string.ExpiredStoryMention, new Object[0]);
            } else {
                charSequenceCreateActionTextWithTopic = StoriesUtilities.createExpiredStoryString(true, R.string.ExpiredStoryMentioned, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            }
            if (charSequenceCreateActionTextWithTopic == null) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2 != null && (messageMedia = message2.media) != null && messageMedia.ttl_seconds != 0) {
                    if (messageMedia.photo != null) {
                        charSequenceCreateActionTextWithTopic = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        if ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) {
                            if (messageMedia.voice) {
                                charSequenceCreateActionTextWithTopic = LocaleController.getString(R.string.AttachVoiceExpired);
                            } else if (messageMedia.round) {
                                charSequenceCreateActionTextWithTopic = LocaleController.getString(R.string.AttachRoundExpired);
                            } else {
                                charSequenceCreateActionTextWithTopic = LocaleController.getString(R.string.AttachVideoExpired);
                            }
                        } else {
                            charSequenceCreateActionTextWithTopic = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                        }
                    }
                } else {
                    charSequenceCreateActionTextWithTopic = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                }
            }
        } else {
            charSequenceCreateActionTextWithTopic = this.customText;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && messageObject2.isRepostPreview) {
            charSequenceCreateActionTextWithTopic = "";
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageAction4 = message.action) != null) {
            if (messageAction4 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i5 = R.drawable.mini_checklist_add;
            } else if (messageAction4 instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction4;
                if (tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size()) {
                    i5 = R.drawable.mini_checklist_undone;
                } else {
                    i5 = R.drawable.mini_checklist_done;
                }
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
                spannableStringBuilder4.insert(0, (CharSequence) "i ");
                spannableStringBuilder4.setSpan(new ColoredImageSpan(i5), 0, 1, 33);
                charSequenceCreateActionTextWithTopic = spannableStringBuilder4;
            }
        }
        createLayout(charSequenceCreateActionTextWithTopic, this.previousWidth);
        if (this.birthdayLayout != null) {
            this.textLayout = null;
            this.textHeight = 0;
            this.titleLayout = null;
            this.titleHeight = 0;
            this.textY = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction5 = message3.action;
                if ((messageAction5 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction5).balance_too_low) {
                    createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, !ChatObject.canManageMonoForum(this.currentAccount, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.giftRectSize, false, true);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                    this.giftRectEmpty = true;
                } else {
                    charSequence = charSequenceCreateActionTextWithTopic;
                    if (message3 != null) {
                        messageAction3 = message3.action;
                        if (!(messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                            createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else {
                            i = messageObject.type;
                            if (i == 11) {
                                ImageReceiver imageReceiver = this.imageReceiver;
                                float f = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                                float fDp = this.textHeight + AndroidUtilities.dp(19.0f);
                                float f2 = AndroidUtilities.roundMessageSize;
                                imageReceiver.setImageCoords(f, fDp, f2, f2);
                            } else if (i == 25) {
                                createGiftPremiumChannelLayouts();
                            } else if (i == 30) {
                                user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                                messageAction2 = messageObject.messageOwner.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                    CharSequence pluralStringComma = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                    if (this.currentMessageObject.isOutOwner()) {
                                        string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                    }
                                    createGiftPremiumLayouts(pluralStringComma, null, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).refunded) {
                                    long clientUserId2 = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action;
                                    if (messageObject.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                        clientUserId2 = messageObject.getDialogId();
                                    }
                                    TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(clientUserId2));
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                    if (user6 != null && user6.photo != null) {
                                        spannableStringBuilder5.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan.setUser(user6);
                                        spannableStringBuilder5.setSpan(avatarSpan, spannableStringBuilder5.length() - 2, spannableStringBuilder5.length() - 1, 33);
                                    }
                                    spannableStringBuilder5.append((CharSequence) UserObject.getForcedFirstName(user6));
                                    createGiftPremiumLayouts(spannableStringBuilder5, null, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.giftRectSize, true, false);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null || (tL_messageActionStarGift.prepaid_upgrade && !(peer instanceof TLRPC.TL_peerChannel))) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (messageObject.getDialogId() == clientUserId || z4) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    fromChatId2 = messageObject.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade && (peer2 = tL_messageActionStarGift.from_id) != null) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat2 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                                        j2 = peerDialogId2;
                                    } else {
                                        j2 = peerDialogId2;
                                        if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                            z6 = true;
                                        }
                                        if (j2 == 0 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat2)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan2 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan2.setObject(userOrChat2);
                                                spannableStringBuilder3.setSpan(avatarSpan2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat2));
                                        } else if (z5) {
                                            if (tL_messageActionStarGift.gift_num <= 0 && (starGift = tL_messageActionStarGift.gift) != null && (str2 = starGift.title) != null) {
                                                spannableStringBuilder3.append((CharSequence) str2).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i4 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i4 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan3 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan3.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        }
                                        z7 = !((messageObject.isOutOwner() || z5) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
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
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (!z7 && j > 0) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z5) {
                                                if (!tL_messageActionStarGift.converted && j > 0) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z6) {
                                                if (messageObject.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject.isOutOwner()) {
                                                if (!z7 && j > 0) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j, UserObject.getForcedFirstName(user5)));
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null && starGift2.limited) {
                                            int i6 = R.string.Gift2Limited1OfRibbon;
                                            int i7 = starGift2.availability_total;
                                            if (i7 > 1500) {
                                                c2 = 0;
                                                objValueOf = AndroidUtilities.formatWholeNumber(i7, 0);
                                            } else {
                                                c2 = 0;
                                                objValueOf = Integer.valueOf(i7);
                                            }
                                            Object[] objArr = new Object[1];
                                            objArr[c2] = objValueOf;
                                            string7 = LocaleController.formatString(i6, objArr);
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject.isOutOwner() || tL_messageActionStarGift.forceIn || z6) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject.isOutOwner() && z6) {
                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                spannableStringBuilder7.append((CharSequence) "^  ");
                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan.setScale(0.8f, 0.8f);
                                                spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 33);
                                                spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder7;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                            charSequenceReplaceSingleTagToLink = null;
                                        } else {
                                            charSequenceReplaceSingleTagToLink = StarGiftSheet.replaceSingleTagToLink(LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@" + publicUsername), null);
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                                    }
                                    z6 = false;
                                    if (j2 == 0) {
                                        if (z5) {
                                            if (tL_messageActionStarGift.gift_num <= 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i4 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i4 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan4 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan4.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan4, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        }
                                    } else if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan5 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan5.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan5, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                    if (messageObject.isOutOwner()) {
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
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (!z7) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z5) {
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
                                            } else if (z6) {
                                                if (messageObject.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject.isOutOwner()) {
                                                if (!z7) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject.isOutOwner()) {
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
                                        if (!messageObject.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                            spannableStringBuilder9.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan3.setScale(0.8f, 0.8f);
                                            spannableStringBuilder9.setSpan(coloredImageSpan3, 0, 1, 33);
                                            spannableStringBuilder9.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder9;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        charSequenceReplaceSingleTagToLink = null;
                                    } else {
                                        charSequenceReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else {
                                dialogId = 0;
                                if (i == 33) {
                                    tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
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
                                                i3 = 1;
                                                c = 0;
                                                shortDuration2 = shortDuration2.substring(0, shortDuration2.length() - 1);
                                            } else {
                                                i3 = 1;
                                                c = 0;
                                            }
                                            int i8 = R.string.GiftOfferStatusPending;
                                            Object[] objArr2 = new Object[i3];
                                            objArr2[c] = shortDuration2;
                                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i8, objArr2)));
                                        }
                                    }
                                    createGiftPremiumLayouts(null, null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                    this.giftRectEmpty = false;
                                } else if (i == 34) {
                                    createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                    this.giftRectEmpty = true;
                                } else if (i == 35) {
                                    tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                                    if (tL_messageActionNoForwardsRequest.new_value) {
                                        if (messageObject.isOut()) {
                                            charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                        } else {
                                            charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                        }
                                        spannableStringBuilder.append(charSequenceReplaceTags3);
                                    } else {
                                        if (messageObject.isOut()) {
                                            charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                        } else {
                                            charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                        }
                                        spannableStringBuilder.append(charSequenceReplaceTags2);
                                    }
                                    if (tL_messageActionNoForwardsRequest.new_value) {
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        String string10 = LocaleController.getString(R.string.SharingOfferDisable1);
                                        int i9 = R.drawable.floating_check;
                                        spannableStringBuilder.append(createOption(string10, i9));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable2), i9));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable3), i9));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable4), i9));
                                    } else {
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        String string11 = LocaleController.getString(R.string.SharingOfferEnable1);
                                        int i10 = R.drawable.floating_check;
                                        spannableStringBuilder.append(createOption(string11, i10));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable2), i10));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable3), i10));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable4), i10));
                                    }
                                    createGiftPremiumLayouts(null, null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                    this.giftRectEmpty = true;
                                } else if (i == 31) {
                                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                    str = starGift4.title + " #" + LocaleController.formatNumber(starGift4.num, ',');
                                    fromChatId = messageObject.getFromChatId();
                                    if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, str);
                                    } else {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), str);
                                    }
                                    createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (i == 37) {
                                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                    peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                                    if (peerDialogId > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    String shortName2 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                                    String shortName3 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity.community_id);
                                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                                    spannableStringBuilder10.append(CommunityUtils.buildServiceMessageText(messageObject, shortName3, shortName2, zIsChannelAndNotMegaGroup, z3));
                                    createGiftPremiumLayouts(null, null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (i == 18) {
                                    messageAction = message3.action;
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
                                    CharSequence charSequence5 = string4;
                                    if (isGiftCode() || isSelfGiftCode()) {
                                        i2 = R.string.ActionGiftPremiumView;
                                    } else {
                                        i2 = R.string.GiftPremiumUseGiftBtn;
                                    }
                                    createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence5, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                                } else if (i == 21) {
                                    tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                    if (!messageObject.isOutOwner()) {
                                        dialogId = messageObject.getDialogId();
                                    }
                                    user3 = messagesController.getUser(Long.valueOf(dialogId));
                                    if (tL_messageActionSuggestProfilePhoto.video && ((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty())) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
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
                                    if (!tL_messageActionSuggestProfilePhoto.video || ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) != null && !arrayList.isEmpty())) {
                                        string3 = LocaleController.getString(R.string.ViewVideoAction);
                                    } else {
                                        string3 = LocaleController.getString(R.string.ViewPhotoAction);
                                    }
                                    createGiftPremiumLayouts(null, null, null, charSequence6, false, string3, 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (i == 22) {
                                    MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                                    if (messageObject.isOutOwner()) {
                                        dialogId2 = 0;
                                    } else {
                                        dialogId2 = messageObject.getDialogId();
                                    }
                                    user2 = messagesController2.getUser(Long.valueOf(dialogId2));
                                    if (messageObject.getDialogId() < 0) {
                                        charSequence3 = messageObject.messageText;
                                    } else {
                                        if (messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                                            charSequence2 = messageObject.messageText;
                                            string = LocaleController.getString(R.string.RemoveWallpaperAction);
                                            z = false;
                                        } else {
                                            if (user2 == null && user2.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                charSequence3 = messageObject.messageText;
                                            } else {
                                                charSequence2 = messageObject.messageText;
                                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                            }
                                            z = true;
                                        }
                                        createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                        this.textLayout = null;
                                        this.textHeight = 0;
                                        this.titleLayout = null;
                                        this.titleHeight = 0;
                                        this.textY = 0;
                                    }
                                    charSequence2 = charSequence3;
                                    string = null;
                                    z = true;
                                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (messageObject.isStoryMention()) {
                                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                                    if (user.self) {
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name));
                                    } else {
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                    }
                                    createGiftPremiumLayouts(null, null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            }
                        }
                    } else {
                        i = messageObject.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver2 = this.imageReceiver;
                            float f3 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp2 = this.textHeight + AndroidUtilities.dp(19.0f);
                            float f4 = AndroidUtilities.roundMessageSize;
                            imageReceiver2.setImageCoords(f3, fDp2, f4, f4);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction2 = messageObject.messageOwner.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma2 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma2, null, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                            } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat3 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    } else {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    }
                                    if (j2 == 0) {
                                        if (z5) {
                                            if (tL_messageActionStarGift.gift_num <= 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i4 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i4 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan6 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan6.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan6, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        }
                                    } else if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan7 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan7.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan7, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                    if (messageObject.isOutOwner()) {
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
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (!z7) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z5) {
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
                                            } else if (z6) {
                                                if (messageObject.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject.isOutOwner()) {
                                                if (!z7) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject.isOutOwner()) {
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
                                        if (!messageObject.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder();
                                            spannableStringBuilder13.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan5 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan5.setScale(0.8f, 0.8f);
                                            spannableStringBuilder13.setSpan(coloredImageSpan5, 0, 1, 33);
                                            spannableStringBuilder13.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder13;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        charSequenceReplaceSingleTagToLink = null;
                                    } else {
                                        charSequenceReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                j = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat4 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                } else {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                }
                                if (j2 == 0) {
                                    if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan8 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan8.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan8, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                } else if (z5) {
                                    if (tL_messageActionStarGift.gift_num <= 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i4 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i4 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan9 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan9.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan9, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                }
                                if (messageObject.isOutOwner()) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z5) {
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
                                    } else if (z6) {
                                        if (messageObject.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z7) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                    }
                                }
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject.isOutOwner()) {
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
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder();
                                        spannableStringBuilder15.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan7 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan7.setScale(0.8f, 0.8f);
                                        spannableStringBuilder15.setSpan(coloredImageSpan7, 0, 1, 33);
                                        spannableStringBuilder15.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder15;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else {
                            dialogId = 0;
                            if (i == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
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
                                            i3 = 1;
                                            c = 0;
                                            shortDuration2 = shortDuration2.substring(0, shortDuration2.length() - 1);
                                        } else {
                                            i3 = 1;
                                            c = 0;
                                        }
                                        int i11 = R.string.GiftOfferStatusPending;
                                        Object[] objArr3 = new Object[i3];
                                        objArr3[c] = shortDuration2;
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i11, objArr3)));
                                    }
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = false;
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject.isOut()) {
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
                                    spannableStringBuilder.append(createOption(string12, i12));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable2), i12));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable3), i12));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable4), i12));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string13 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i13 = R.drawable.floating_check;
                                    spannableStringBuilder.append(createOption(string13, i13));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable2), i13));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable3), i13));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable4), i13));
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 31) {
                                TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                str = starGift5.title + " #" + LocaleController.formatNumber(starGift5.num, ',');
                                fromChatId = messageObject.getFromChatId();
                                if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, str);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), str);
                                }
                                createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity2 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                                if (peerDialogId > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName4 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                                String shortName5 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity2.community_id);
                                SpannableStringBuilder spannableStringBuilder16 = new SpannableStringBuilder();
                                spannableStringBuilder16.append(CommunityUtils.buildServiceMessageText(messageObject, shortName5, shortName4, zIsChannelAndNotMegaGroup2, z3));
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder16, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 18) {
                                messageAction = message3.action;
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
                                if (isGiftCode()) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence7, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                                if (!messageObject.isOutOwner()) {
                                    dialogId = messageObject.getDialogId();
                                }
                                user3 = messagesController3.getUser(Long.valueOf(dialogId));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
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
                                if (!tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, null, charSequence8, false, string3, 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController4 = MessagesController.getInstance(this.currentAccount);
                                if (messageObject.isOutOwner()) {
                                    dialogId2 = 0;
                                } else {
                                    dialogId2 = messageObject.getDialogId();
                                }
                                user2 = messagesController4.getUser(Long.valueOf(dialogId2));
                                if (messageObject.getDialogId() < 0) {
                                    charSequence3 = messageObject.messageText;
                                } else {
                                    if (messageObject.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z = true;
                                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z = true;
                                createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (messageObject.isStoryMention()) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                createGiftPremiumLayouts(null, null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
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
                charSequence = charSequenceCreateActionTextWithTopic;
                if (message3 != null) {
                    messageAction3 = message3.action;
                    if (!(messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
                        i = messageObject.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver3 = this.imageReceiver;
                            float f5 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp3 = this.textHeight + AndroidUtilities.dp(19.0f);
                            float f6 = AndroidUtilities.roundMessageSize;
                            imageReceiver3.setImageCoords(f5, fDp3, f6, f6);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction2 = messageObject.messageOwner.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma3 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma3, null, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                            } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat5 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    } else {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    }
                                    if (j2 == 0) {
                                        if (z5) {
                                            if (tL_messageActionStarGift.gift_num <= 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i4 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i4 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan10 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan10.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan10, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        }
                                    } else if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan11 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan11.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan11, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                    if (messageObject.isOutOwner()) {
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
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (!z7) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z5) {
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
                                            } else if (z6) {
                                                if (messageObject.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject.isOutOwner()) {
                                                if (!z7) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject.isOutOwner()) {
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
                                        if (!messageObject.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder18 = new SpannableStringBuilder();
                                            spannableStringBuilder18.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan9 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan9.setScale(0.8f, 0.8f);
                                            spannableStringBuilder18.setSpan(coloredImageSpan9, 0, 1, 33);
                                            spannableStringBuilder18.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder18;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        charSequenceReplaceSingleTagToLink = null;
                                    } else {
                                        charSequenceReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                j = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat6 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                } else {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                }
                                if (j2 == 0) {
                                    if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan12 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan12.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan12, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                } else if (z5) {
                                    if (tL_messageActionStarGift.gift_num <= 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i4 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i4 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan13 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan13.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan13, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                }
                                if (messageObject.isOutOwner()) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z5) {
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
                                    } else if (z6) {
                                        if (messageObject.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z7) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                    }
                                }
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject.isOutOwner()) {
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
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder110 = new SpannableStringBuilder();
                                        spannableStringBuilder110.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan11 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan11.setScale(0.8f, 0.8f);
                                        spannableStringBuilder110.setSpan(coloredImageSpan11, 0, 1, 33);
                                        spannableStringBuilder110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder110;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else {
                            dialogId = 0;
                            if (i == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
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
                                            i3 = 1;
                                            c = 0;
                                            shortDuration2 = shortDuration2.substring(0, shortDuration2.length() - 1);
                                        } else {
                                            i3 = 1;
                                            c = 0;
                                        }
                                        int i14 = R.string.GiftOfferStatusPending;
                                        Object[] objArr4 = new Object[i3];
                                        objArr4[c] = shortDuration2;
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i14, objArr4)));
                                    }
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = false;
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string14 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i15 = R.drawable.floating_check;
                                    spannableStringBuilder.append(createOption(string14, i15));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable2), i15));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable3), i15));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable4), i15));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string15 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i16 = R.drawable.floating_check;
                                    spannableStringBuilder.append(createOption(string15, i16));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable2), i16));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable3), i16));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable4), i16));
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 31) {
                                TL_stars.StarGift starGift6 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                str = starGift6.title + " #" + LocaleController.formatNumber(starGift6.num, ',');
                                fromChatId = messageObject.getFromChatId();
                                if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, str);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), str);
                                }
                                createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity3 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                                if (peerDialogId > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName6 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                                String shortName7 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity3.community_id);
                                SpannableStringBuilder spannableStringBuilder111 = new SpannableStringBuilder();
                                spannableStringBuilder111.append(CommunityUtils.buildServiceMessageText(messageObject, shortName7, shortName6, zIsChannelAndNotMegaGroup3, z3));
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 18) {
                                messageAction = message3.action;
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
                                if (isGiftCode()) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence9, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController5 = MessagesController.getInstance(this.currentAccount);
                                if (!messageObject.isOutOwner()) {
                                    dialogId = messageObject.getDialogId();
                                }
                                user3 = messagesController5.getUser(Long.valueOf(dialogId));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
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
                                if (!tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, null, charSequence10, false, string3, 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController6 = MessagesController.getInstance(this.currentAccount);
                                if (messageObject.isOutOwner()) {
                                    dialogId2 = 0;
                                } else {
                                    dialogId2 = messageObject.getDialogId();
                                }
                                user2 = messagesController6.getUser(Long.valueOf(dialogId2));
                                if (messageObject.getDialogId() < 0) {
                                    charSequence3 = messageObject.messageText;
                                } else {
                                    if (messageObject.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z = true;
                                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z = true;
                                createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (messageObject.isStoryMention()) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                createGiftPremiumLayouts(null, null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        }
                    } else {
                        i = messageObject.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver4 = this.imageReceiver;
                            float f7 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp4 = this.textHeight + AndroidUtilities.dp(19.0f);
                            float f8 = AndroidUtilities.roundMessageSize;
                            imageReceiver4.setImageCoords(f7, fDp4, f8, f8);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction2 = messageObject.messageOwner.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma4 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma4, null, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                            } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat7 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    } else {
                                        j2 = peerDialogId2;
                                        z6 = false;
                                    }
                                    if (j2 == 0) {
                                        if (z5) {
                                            if (tL_messageActionStarGift.gift_num <= 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i4 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i4 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan14 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan14.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan14, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        }
                                    } else if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan15 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan15.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan15, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                    if (messageObject.isOutOwner()) {
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
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                } else if (!z7) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z5) {
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
                                            } else if (z6) {
                                                if (messageObject.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject.isOutOwner()) {
                                                if (!z7) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject.isOutOwner()) {
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
                                        if (!messageObject.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder113 = new SpannableStringBuilder();
                                            spannableStringBuilder113.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan13 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan13.setScale(0.8f, 0.8f);
                                            spannableStringBuilder113.setSpan(coloredImageSpan13, 0, 1, 33);
                                            spannableStringBuilder113.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder113;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        charSequenceReplaceSingleTagToLink = null;
                                    } else {
                                        charSequenceReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                j = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat8 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                } else {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                }
                                if (j2 == 0) {
                                    if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan16 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan16.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan16, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                } else if (z5) {
                                    if (tL_messageActionStarGift.gift_num <= 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i4 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i4 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan17 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan17.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan17, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                }
                                if (messageObject.isOutOwner()) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z5) {
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
                                    } else if (z6) {
                                        if (messageObject.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z7) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                    }
                                }
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject.isOutOwner()) {
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
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder115 = new SpannableStringBuilder();
                                        spannableStringBuilder115.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan15 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan15.setScale(0.8f, 0.8f);
                                        spannableStringBuilder115.setSpan(coloredImageSpan15, 0, 1, 33);
                                        spannableStringBuilder115.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder115;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else {
                            dialogId = 0;
                            if (i == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
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
                                            i3 = 1;
                                            c = 0;
                                            shortDuration2 = shortDuration2.substring(0, shortDuration2.length() - 1);
                                        } else {
                                            i3 = 1;
                                            c = 0;
                                        }
                                        int i17 = R.string.GiftOfferStatusPending;
                                        Object[] objArr5 = new Object[i3];
                                        objArr5[c] = shortDuration2;
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i17, objArr5)));
                                    }
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = false;
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string16 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i18 = R.drawable.floating_check;
                                    spannableStringBuilder.append(createOption(string16, i18));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable2), i18));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable3), i18));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable4), i18));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string17 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i19 = R.drawable.floating_check;
                                    spannableStringBuilder.append(createOption(string17, i19));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable2), i19));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable3), i19));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable4), i19));
                                }
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 31) {
                                TL_stars.StarGift starGift7 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                str = starGift7.title + " #" + LocaleController.formatNumber(starGift7.num, ',');
                                fromChatId = messageObject.getFromChatId();
                                if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, str);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), str);
                                }
                                createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity4 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                                if (peerDialogId > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName8 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                                String shortName9 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity4.community_id);
                                SpannableStringBuilder spannableStringBuilder116 = new SpannableStringBuilder();
                                spannableStringBuilder116.append(CommunityUtils.buildServiceMessageText(messageObject, shortName9, shortName8, zIsChannelAndNotMegaGroup4, z3));
                                createGiftPremiumLayouts(null, null, null, spannableStringBuilder116, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 18) {
                                messageAction = message3.action;
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
                                if (isGiftCode()) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence11, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController7 = MessagesController.getInstance(this.currentAccount);
                                if (!messageObject.isOutOwner()) {
                                    dialogId = messageObject.getDialogId();
                                }
                                user3 = messagesController7.getUser(Long.valueOf(dialogId));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
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
                                if (!tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, null, charSequence12, false, string3, 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController8 = MessagesController.getInstance(this.currentAccount);
                                if (messageObject.isOutOwner()) {
                                    dialogId2 = 0;
                                } else {
                                    dialogId2 = messageObject.getDialogId();
                                }
                                user2 = messagesController8.getUser(Long.valueOf(dialogId2));
                                if (messageObject.getDialogId() < 0) {
                                    charSequence3 = messageObject.messageText;
                                } else {
                                    if (messageObject.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z = true;
                                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z = true;
                                createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (messageObject.isStoryMention()) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                createGiftPremiumLayouts(null, null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        }
                    }
                } else {
                    i = messageObject.type;
                    if (i == 11) {
                        ImageReceiver imageReceiver5 = this.imageReceiver;
                        float f9 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                        float fDp5 = this.textHeight + AndroidUtilities.dp(19.0f);
                        float f10 = AndroidUtilities.roundMessageSize;
                        imageReceiver5.setImageCoords(f9, fDp5, f10, f10);
                    } else if (i == 25) {
                        createGiftPremiumChannelLayouts();
                    } else if (i == 30) {
                        user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                        messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                            CharSequence pluralStringComma5 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                            if (this.currentMessageObject.isOutOwner()) {
                                string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                            } else {
                                string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                            }
                            createGiftPremiumLayouts(pluralStringComma5, null, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                        } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                j = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat9 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                } else {
                                    j2 = peerDialogId2;
                                    z6 = false;
                                }
                                if (j2 == 0) {
                                    if (z5) {
                                        if (tL_messageActionStarGift.gift_num <= 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i4 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i4 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan18 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan18.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan18, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    }
                                } else if (z5) {
                                    if (tL_messageActionStarGift.gift_num <= 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i4 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i4 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan19 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan19.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan19, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                }
                                if (messageObject.isOutOwner()) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z5) {
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
                                        } else if (z6) {
                                            if (messageObject.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject.isOutOwner()) {
                                            if (!z7) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z5) {
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
                                    } else if (z6) {
                                        if (messageObject.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z7) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                    }
                                }
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject.isOutOwner()) {
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
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder118 = new SpannableStringBuilder();
                                        spannableStringBuilder118.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan17 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan17.setScale(0.8f, 0.8f);
                                        spannableStringBuilder118.setSpan(coloredImageSpan17, 0, 1, 33);
                                        spannableStringBuilder118.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder118;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                            j = tL_messageActionStarGift.convert_stars;
                            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (messageObject.getDialogId() == clientUserId) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            fromChatId2 = messageObject.getFromChatId();
                            if (!tL_messageActionStarGift.prepaid_upgrade) {
                                fromChatId2 = DialogObject.getPeerDialogId(peer2);
                            }
                            spannableStringBuilder3 = new SpannableStringBuilder();
                            userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                            peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                            TLObject userOrChat10 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                            if (tL_messageActionStarGift.can_upgrade) {
                                j2 = peerDialogId2;
                                z6 = false;
                            } else {
                                j2 = peerDialogId2;
                                z6 = false;
                            }
                            if (j2 == 0) {
                                if (z5) {
                                    if (tL_messageActionStarGift.gift_num <= 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i4 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i4 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan110 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan110.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan110, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                }
                            } else if (z5) {
                                if (tL_messageActionStarGift.gift_num <= 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                            } else {
                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                    i4 = R.string.Gift2ActionUpgradeTitle;
                                } else {
                                    i4 = R.string.Gift2ActionTitle;
                                }
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i4)).append((CharSequence) " ");
                                if (DialogObject.hasPhoto(userOrChat)) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    AvatarSpan avatarSpan111 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                    avatarSpan111.setObject(userOrChat);
                                    spannableStringBuilder3.setSpan(avatarSpan111, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                            }
                            if (messageObject.isOutOwner()) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z5) {
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
                                    } else if (z6) {
                                        if (messageObject.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z7) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z4) {
                                    if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                } else if (z5) {
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
                                } else if (z6) {
                                    if (messageObject.isOutOwner()) {
                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                    }
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                } else if (messageObject.isOutOwner()) {
                                    if (!z7) {
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
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                } else if (tL_messageActionStarGift.saved) {
                                    if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                    } else {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                    }
                                } else if (!z7) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                } else {
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j));
                                }
                            }
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null) {
                                string7 = null;
                            } else {
                                string7 = null;
                            }
                            string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                            if (messageObject.isOutOwner()) {
                                charSequence4 = string8;
                                charSequence4 = string8;
                                charSequence4 = string8;
                                if (!messageObject.isOutOwner()) {
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
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder1110 = new SpannableStringBuilder();
                                    spannableStringBuilder1110.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan19 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan19.setScale(0.8f, 0.8f);
                                    spannableStringBuilder1110.setSpan(coloredImageSpan19, 0, 1, 33);
                                    spannableStringBuilder1110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence4 = spannableStringBuilder1110;
                                }
                            }
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                charSequenceReplaceSingleTagToLink = null;
                            } else {
                                charSequenceReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true, false);
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                            createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else {
                            createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                    } else {
                        dialogId = 0;
                        if (i == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
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
                                        i3 = 1;
                                        c = 0;
                                        shortDuration2 = shortDuration2.substring(0, shortDuration2.length() - 1);
                                    } else {
                                        i3 = 1;
                                        c = 0;
                                    }
                                    int i110 = R.string.GiftOfferStatusPending;
                                    Object[] objArr6 = new Object[i3];
                                    objArr6[c] = shortDuration2;
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i110, objArr6)));
                                }
                            }
                            createGiftPremiumLayouts(null, null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = false;
                        } else if (i == 34) {
                            createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                if (messageObject.isOut()) {
                                    charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                } else {
                                    charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags3);
                            } else {
                                if (messageObject.isOut()) {
                                    charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                } else {
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags2);
                            }
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string18 = LocaleController.getString(R.string.SharingOfferDisable1);
                                int i111 = R.drawable.floating_check;
                                spannableStringBuilder.append(createOption(string18, i111));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable2), i111));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable3), i111));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferDisable4), i111));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string19 = LocaleController.getString(R.string.SharingOfferEnable1);
                                int i112 = R.drawable.floating_check;
                                spannableStringBuilder.append(createOption(string19, i112));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable2), i112));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable3), i112));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append(createOption(LocaleController.getString(R.string.SharingOfferEnable4), i112));
                            }
                            createGiftPremiumLayouts(null, null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 31) {
                            TL_stars.StarGift starGift8 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                            str = starGift8.title + " #" + LocaleController.formatNumber(starGift8.num, ',');
                            fromChatId = messageObject.getFromChatId();
                            if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, str);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), str);
                            }
                            createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 37) {
                            TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity5 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                            peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                            boolean zIsChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                            if (peerDialogId > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String shortName10 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                            String shortName11 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity5.community_id);
                            SpannableStringBuilder spannableStringBuilder1111 = new SpannableStringBuilder();
                            spannableStringBuilder1111.append(CommunityUtils.buildServiceMessageText(messageObject, shortName11, shortName10, zIsChannelAndNotMegaGroup5, z3));
                            createGiftPremiumLayouts(null, null, null, spannableStringBuilder1111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 18) {
                            messageAction = message3.action;
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
                            if (isGiftCode()) {
                                i2 = R.string.ActionGiftPremiumView;
                            } else {
                                i2 = R.string.ActionGiftPremiumView;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence13, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                            MessagesController messagesController9 = MessagesController.getInstance(this.currentAccount);
                            if (!messageObject.isOutOwner()) {
                                dialogId = messageObject.getDialogId();
                            }
                            user3 = messagesController9.getUser(Long.valueOf(dialogId));
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
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
                            if (!tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            createGiftPremiumLayouts(null, null, null, charSequence14, false, string3, 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController10 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject.isOutOwner()) {
                                dialogId2 = 0;
                            } else {
                                dialogId2 = messageObject.getDialogId();
                            }
                            user2 = messagesController10.getUser(Long.valueOf(dialogId2));
                            if (messageObject.getDialogId() < 0) {
                                charSequence3 = messageObject.messageText;
                            } else {
                                if (messageObject.isOutOwner()) {
                                }
                                if (user2 == null) {
                                }
                                charSequence2 = messageObject.messageText;
                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                z = true;
                                createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                            charSequence2 = charSequence3;
                            string = null;
                            z = true;
                            createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (messageObject.isStoryMention()) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                            }
                            createGiftPremiumLayouts(null, null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
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
        this.reactionsLayoutInBubble.x = AndroidUtilities.dp(12.0f);
        this.reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
    }

    private CharSequence createOption(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ChatActionCell$$ExternalSyntheticApiModelOutline1.m();
            spannableStringBuilder.setSpan(ChatActionCell$$ExternalSyntheticApiModelOutline0.m(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private void createGiftPremiumChannelLayouts() {
        String string;
        SpannableStringBuilder spannableStringBuilder;
        int iDp = this.giftRectSize - AndroidUtilities.dp(16.0f);
        this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            string = LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize);
        } else {
            string = LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        }
        String pluralString = i == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i, new Object[0]);
        if (z) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, pluralString)));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, pluralString)));
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, pluralString)));
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
            textLayout.detach();
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
        this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
    }

    private void createGiftPremiumLayouts(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, CharSequence charSequence5, int i, CharSequence charSequence6, int i2, boolean z2, boolean z3) {
        ?? r4;
        int i3;
        ?? ReplaceEmoji;
        ?? SubSequence;
        int iCutInFancyHalf;
        CharSequence charSequence7 = charSequence4;
        int iDp = i2 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 30) {
            iDp -= AndroidUtilities.dp(16.0f);
        }
        int i4 = iDp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null && messageObject2.type == 30) {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            spannableStringBuilderValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
            r4 = 0;
            this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, this.giftTitlePaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.giftPremiumTitleLayout = null;
        }
        if (charSequence2 != null) {
            this.giftSubtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
            this.giftPremiumSubtitleLayout = new StaticLayout(charSequence2, this.giftSubtitlePaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.giftPremiumSubtitleLayout = null;
        }
        if (charSequence3 != null) {
            Text text = new Text(charSequence3, 10.0f);
            this.giftPremiumReleasedText = text;
            text.paint.linkColor = -1;
        } else {
            this.giftPremiumReleasedText = null;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && messageObject3.type == 35) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (isNewStyleButtonLayout() || (i3 = this.currentMessageObject.type) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33)) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int iDp2 = i4 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (iCutInFancyHalf = HintView2.cutInFancyHalf(charSequence7, this.giftTextPaint)) < iDp2 && iCutInFancyHalf > iDp2 / 5.0f) {
            iDp2 = iCutInFancyHalf;
        }
        if (charSequence7 == null) {
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null) {
                textLayout.detach();
                this.giftPremiumText = null;
            }
            this.giftPremiumTextCollapsed = r4;
        } else {
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout();
            }
            try {
                ReplaceEmoji = Emoji.replaceEmoji(charSequence7, this.giftTextPaint.getFontMetricsInt(), r4);
            } catch (Exception unused) {
                ReplaceEmoji = charSequence7;
            }
            this.giftPremiumText.setText(ReplaceEmoji, this.giftTextPaint, iDp2);
            if (z && this.giftPremiumText.layout.getLineCount() > 3) {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(R.string.Gift2CaptionMore), this.giftTextPaint.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - this.giftPremiumText.layout.getLineTop(2);
                this.giftPremiumTextMoreX = (int) this.giftPremiumText.layout.getLineRight(2);
            } else {
                this.giftPremiumTextCollapsed = r4;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = r4;
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
        if (charSequence5 != null) {
            ?? ValueOf = SpannableStringBuilder.valueOf(charSequence5);
            ValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), r4, ValueOf.length(), 33);
            StaticLayout staticLayout = new StaticLayout(ValueOf, (TextPaint) getThemedPaint("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.buttonClickableAsImage = z2 && !this.giftPremiumTextCollapsed;
            this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
        } else {
            this.giftPremiumButtonLayout = null;
            this.buttonClickableAsImage = r4;
            this.giftPremiumButtonWidth = 0.0f;
        }
        if (charSequence6 != null) {
            if (this.giftRibbonPaintEffect == null) {
                this.giftRibbonPaintEffect = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.giftRibbonPath == null) {
                Path path = new Path();
                this.giftRibbonPath = path;
                GiftSheet.RibbonDrawable.fillRibbonPath(path, 1.35f, r4);
            }
            Text text2 = new Text(charSequence6, i, AndroidUtilities.bold());
            this.giftRibbonText = text2;
            text2.ellipsize(AndroidUtilities.dp(62.0f));
            return;
        }
        this.giftRibbonPath = null;
        this.giftRibbonText = null;
    }

    private float measureLayoutWidth(Layout layout) {
        float f = 0.0f;
        for (int i = 0; i < layout.getLineCount(); i++) {
            float fCeil = (int) Math.ceil(layout.getLineWidth(i));
            if (fCeil > f) {
                f = fCeil;
            }
        }
        return f;
    }

    public boolean showingCancelButton() {
        RadialProgress2 radialProgress2 = this.radialProgress;
        return radialProgress2 != null && radialProgress2.getIcon() == 3;
    }

    public int getCustomDate() {
        return this.customDate;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        ChatActionCell chatActionCell;
        float fDp;
        int iDp;
        int i4;
        float fDp2;
        float f5;
        float fDp3;
        float f6;
        TextLayout textLayout;
        float f7;
        float f8;
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
        float fDp4;
        float fDp5;
        Theme.ResourcesProvider resourcesProvider2;
        Theme.ResourcesProvider resourcesProvider3;
        boolean zIsCurrentThemeDark;
        ColorMatrix colorMatrix;
        float f11;
        float f12;
        float f13;
        Theme.ResourcesProvider resourcesProvider4;
        boolean zIsCurrentThemeDark2;
        int i5;
        int i6;
        float f14;
        ChatActionCell chatActionCell2;
        float uploadingInfoProgress;
        TextLayout textLayout3;
        int i7;
        float transitionProgress;
        SpannableStringBuilder spannableStringBuilder;
        int iIndexOf;
        int i8;
        TextLayout textLayout4;
        int i9;
        Text text2;
        float height2;
        float f15;
        ChatActionCellDelegate chatActionCellDelegate;
        StaticLayout staticLayout2;
        ColorFilter adaptiveEmojiColorFilter;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f16 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int imageSize = this.stickerSize;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                imageSize = getImageSize(messageObject);
                int iDp2 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f);
                float fDp6 = (this.previousWidth - imageSize) / 2.0f;
                float fDp7 = iDp2;
                if (messageObject.isStoryMention()) {
                    f = 1.0f;
                    f2 = 16.0f;
                    this.avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                } else {
                    f = 1.0f;
                    f2 = 16.0f;
                }
                float f17 = imageSize;
                f3 = 12.0f;
                this.avatarStoryParams.originalAvatarRect.set(fDp6, fDp7, fDp6 + f17, f17 + fDp7);
                int i10 = messageObject.type;
                if (i10 == 31 || i10 == 33 || i10 == 34 || i10 == 35) {
                    fDp6 += AndroidUtilities.dp(10.0f);
                    fDp7 += AndroidUtilities.dp(10.0f);
                    imageSize -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    fDp6 += AndroidUtilities.dp(2.0f);
                }
                this.imageReceiver.setImageCoords(fDp6, fDp7, Math.max(0, imageSize), Math.max(0, imageSize));
                int i11 = messageObject.type;
                if (i11 == 31 || i11 == 33 || i11 == 34 || i11 == 35) {
                    imageSize += AndroidUtilities.dp(20.0f);
                }
            } else {
                f = 1.0f;
                f2 = 16.0f;
                f3 = 12.0f;
                int i12 = messageObject.type;
                if (i12 == 11) {
                    ImageReceiver imageReceiver = this.imageReceiver;
                    int i13 = this.previousWidth;
                    int i14 = this.stickerSize;
                    float f18 = i14;
                    imageReceiver.setImageCoords((i13 - i14) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), f18, f18);
                } else if (i12 == 25) {
                    imageSize = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f19 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f19, f19);
                } else if (messageObject.isStarGiftAction()) {
                    float f20 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f) + AndroidUtilities.dp(2.0f), f20, f20);
                } else if (messageObject.type == 30) {
                    imageSize = (int) (this.stickerSize * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && !(message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f21 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f21, f21);
                    } else {
                        float f22 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(12.0f), f22, f22);
                    }
                } else {
                    imageSize = (int) (this.stickerSize * 1.0f);
                    float f23 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(4.0f), f23, f23);
                }
            }
            TextPaint textPaint = (TextPaint) getThemedPaint("paintChatActionText");
            this.textPaint = textPaint;
            if (textPaint != null) {
                TextPaint textPaint2 = this.giftTitlePaint;
                if (textPaint2 != null && textPaint2.getColor() != this.textPaint.getColor()) {
                    this.giftTitlePaint.setColor(this.textPaint.getColor());
                }
                TextPaint textPaint3 = this.giftSubtitlePaint;
                if (textPaint3 != null && textPaint3.getColor() != this.textPaint.getColor()) {
                    this.giftSubtitlePaint.setColor(this.textPaint.getColor());
                    this.giftSubtitlePaint.linkColor = this.textPaint.getColor();
                }
                TextPaint textPaint4 = this.giftTextPaint;
                if (textPaint4 != null && textPaint4.getColor() != this.textPaint.getColor()) {
                    this.giftTextPaint.setColor(this.textPaint.getColor());
                    this.giftTextPaint.linkColor = this.textPaint.getColor();
                }
            }
        } else {
            f = 1.0f;
            f2 = 16.0f;
            f3 = 12.0f;
        }
        int i15 = imageSize;
        drawBackground(canvas2, false);
        if (this.starGiftLayout.has()) {
            canvas2.save();
            f4 = 2.0f;
            float width = (getWidth() - this.starGiftLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float fDp8 = this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(f2);
            this.starGiftLayoutY = fDp8;
            canvas2.translate(width, fDp8);
            this.starGiftLayout.draw(canvas2);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                this.starGiftLayout.drawOutbounds(canvas2);
            }
            canvas2.restore();
        } else {
            f4 = 2.0f;
            if (this.birthdayLayout != null) {
                canvas2.save();
                this.birthdayLayout.draw(canvas2);
                canvas2.restore();
            } else {
                if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
                    GiftSheet.CardBackground cardBackground = this.cardBackground;
                    if (cardBackground != null && ((i = messageObject.type) == 31 || i == 37 || i == 33)) {
                        cardBackground.setBounds((int) (this.imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth() + AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight() + AndroidUtilities.dp(14.0f)));
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
                    this.radialProgress.setProgressRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth(), this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight());
                    int i16 = messageObject.type;
                    if (i16 == 21) {
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
                    } else if (i16 == 22) {
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
                    i3 = 21;
                } else {
                    canvas2.save();
                    canvas2.translate(this.textXLeft, this.textY);
                    if (this.textLayout.getPaint() != this.textPaint) {
                        buildLayout();
                    }
                    canvas2.save();
                    SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
                    SpoilerEffect.layoutDrawMaybe(this.textLayout, canvas2);
                    ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                    if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                        StaticLayout staticLayout3 = this.textLayout;
                        i2 = 22;
                        i3 = 21;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout3, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : getAdaptiveEmojiColorFilter(staticLayout3.getPaint().getColor()));
                    } else {
                        i2 = 22;
                        i3 = 21;
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
                        buildLayout();
                    }
                    canvas2.save();
                    SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
                    SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas2);
                    chatActionCellDelegate = this.delegate;
                    if (chatActionCellDelegate != null || chatActionCellDelegate.canDrawOutboundsContent()) {
                        StaticLayout staticLayout4 = this.titleLayout;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                        List list = this.spoilers;
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
                    float fDp9 = (this.previousWidth - this.giftRectSize) / f4;
                    if (messageObject.type != i2) {
                        fDp9 += AndroidUtilities.dp(8.0f);
                    }
                    float f24 = fDp9;
                    if (isNewStyleButtonLayout()) {
                        RectF rectF = this.backgroundRect;
                        fDp = rectF != null ? rectF.top : this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                        iDp = i15 > 0 ? (AndroidUtilities.dp(f2) * 2) + i15 : AndroidUtilities.dp(f2);
                    } else {
                        float f25 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                        if (messageObject.type != i3) {
                            i15 = this.stickerSize;
                        }
                        fDp = f25 + i15 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == i3) {
                            fDp += AndroidUtilities.dp(f2);
                        }
                        if (messageObject.isStarGiftAction()) {
                            iDp = AndroidUtilities.dp(f3);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            fDp -= AndroidUtilities.dp(3.66f);
                        }
                        i4 = messageObject.type;
                        if (i4 != 31 || i4 == 37 || i4 == 33) {
                            fDp -= AndroidUtilities.dp(3.66f);
                        }
                        canvas2.translate(f24, fDp);
                        if (this.giftPremiumTitleLayout != null) {
                            canvas2.save();
                            canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumTitleLayout.getWidth()) / f4, 0.0f);
                            this.giftPremiumTitleLayout.draw(canvas2);
                            canvas2.restore();
                            height2 = this.giftPremiumTitleLayout.getHeight() + fDp;
                            if (this.giftPremiumSubtitleLayout != null) {
                                canvas2.save();
                                canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumSubtitleLayout.getWidth()) / f4, this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(4.0f));
                                this.giftPremiumSubtitleLayout.draw(canvas2);
                                canvas2.restore();
                                height2 += this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(10.0f);
                            }
                            if (messageObject.type == 25) {
                                f15 = 6.0f;
                            } else {
                                f15 = 0.0f;
                            }
                            fDp2 = height2 + AndroidUtilities.dp(f15);
                        } else {
                            fDp2 = fDp - AndroidUtilities.dp(4.0f);
                        }
                        float fDp10 = fDp2;
                        canvas2.restore();
                        if (this.giftPremiumTitleLayout != null || (text2 = this.giftPremiumReleasedText) == null) {
                            f5 = 8.0f;
                        } else {
                            float width2 = text2.getWidth() + AndroidUtilities.dp(f3);
                            float fDp11 = (((this.giftRectSize - AndroidUtilities.dp(f2)) - width2) / f4) + f24;
                            float height3 = fDp + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(14.0f);
                            if (this.giftReleasedBackgroundPaint == null) {
                                this.giftReleasedBackgroundPaint = new Paint(1);
                            }
                            this.giftReleasedBackgroundPaint.setColor(Theme.isCurrentThemeDark() ? 285212671 : 268435456);
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            f5 = 8.0f;
                            rectF2.set(fDp11, height3 - AndroidUtilities.dp(8.0f), width2 + fDp11, AndroidUtilities.dp(8.0f) + height3);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                            this.giftPremiumReleasedText.draw(canvas, AndroidUtilities.dp(6.0f) + fDp11, height3, -855638017, 1.0f);
                            canvas2 = canvas;
                            fDp10 += AndroidUtilities.dp(24.0f);
                        }
                        fDp3 = fDp10 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 18) {
                            fDp3 += AndroidUtilities.dp(f4);
                        }
                        canvas2.save();
                        canvas2.translate(f24, fDp3);
                        if (messageObject.type == i2) {
                            if (this.radialProgress.getTransitionProgress() == 1.0f) {
                                i6 = 4;
                                if (this.radialProgress.getIcon() != 4) {
                                    if (this.giftPremiumText != null) {
                                        canvas2.save();
                                        canvas2.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                                        TextLayout textLayout5 = this.giftPremiumText;
                                        textLayout5.x = ((this.giftRectSize - textLayout5.layout.getWidth()) / f4) + f24;
                                        this.giftPremiumText.y = fDp3;
                                        int color = this.giftTextPaint.getColor();
                                        TextLayout textLayout6 = this.giftPremiumText;
                                        f14 = f24;
                                        f6 = 0.0f;
                                        SpoilerEffect.renderWithRipple(this, false, color, 0, textLayout6.patchedLayout, 1, textLayout6.layout, textLayout6.spoilers, canvas, false);
                                        TextLayout textLayout7 = this.giftPremiumText;
                                        chatActionCell2 = this;
                                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout7.layout, textLayout7.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f6 = 0.0f;
                                        chatActionCell = this;
                                        f8 = f24;
                                    }
                                    f7 = 1.0f;
                                }
                                chatActionCell = chatActionCell2;
                                f8 = f14;
                                f7 = 1.0f;
                            } else {
                                i6 = 4;
                            }
                            chatActionCell2 = this;
                            f14 = f24;
                            f6 = 0.0f;
                            if (chatActionCell2.settingWallpaperLayout == null) {
                                TextPaint textPaint5 = new TextPaint();
                                chatActionCell2.settingWallpaperPaint = textPaint5;
                                textPaint5.setTextSize(AndroidUtilities.dp(13.0f));
                                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                                iIndexOf = spannableStringBuilder.toString().indexOf("...");
                                if (iIndexOf < 0) {
                                    iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                    i8 = 1;
                                } else {
                                    i8 = 3;
                                }
                                if (iIndexOf >= 0) {
                                    SpannableString spannableString = new SpannableString("…");
                                    UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                                    uploadingDotsSpannable.fixTop = true;
                                    uploadingDotsSpannable.setParent(chatActionCell2, false);
                                    spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), 33);
                                    spannableStringBuilder.replace(iIndexOf, i8 + iIndexOf, (CharSequence) spannableString);
                                }
                                TextPaint textPaint6 = chatActionCell2.settingWallpaperPaint;
                                textLayout4 = chatActionCell2.giftPremiumText;
                                if (textLayout4 == null) {
                                    i9 = 1;
                                } else {
                                    i9 = textLayout4.width;
                                }
                                chatActionCell2.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint6, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            uploadingInfoProgress = chatActionCell2.getUploadingInfoProgress(messageObject);
                            if (chatActionCell2.settingWallpaperProgressTextLayout != null || chatActionCell2.settingWallpaperProgress != uploadingInfoProgress) {
                                chatActionCell2.settingWallpaperProgress = uploadingInfoProgress;
                                String str = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                                TextPaint textPaint7 = chatActionCell2.giftTextPaint;
                                textLayout3 = chatActionCell2.giftPremiumText;
                                if (textLayout3 == null) {
                                    i7 = 1;
                                } else {
                                    i7 = textLayout3.width;
                                }
                                chatActionCell2.settingWallpaperProgressTextLayout = new StaticLayout(str, textPaint7, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            chatActionCell2.settingWallpaperPaint.setColor(chatActionCell2.giftTextPaint.getColor());
                            if (chatActionCell2.radialProgress.getIcon() == i6) {
                                transitionProgress = chatActionCell2.radialProgress.getTransitionProgress();
                                int color2 = chatActionCell2.giftTextPaint.getColor();
                                float f26 = 1.0f - transitionProgress;
                                chatActionCell2.settingWallpaperPaint.setAlpha((int) (Color.alpha(color2) * f26));
                                chatActionCell2.giftTextPaint.setAlpha((int) (Color.alpha(color2) * transitionProgress));
                                TextPaint textPaint8 = chatActionCell2.giftTextPaint;
                                textPaint8.linkColor = textPaint8.getColor();
                                if (chatActionCell2.giftPremiumText != null) {
                                    float f27 = (transitionProgress * 0.2f) + 0.8f;
                                    canvas2.save();
                                    canvas2.scale(f27, f27, chatActionCell2.giftRectSize / f4, chatActionCell2.giftPremiumText.layout.getHeight() / f4);
                                    canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                                    TextLayout textLayout8 = chatActionCell2.giftPremiumText;
                                    textLayout8.x = f14 + ((chatActionCell2.giftRectSize - textLayout8.layout.getWidth()) / f4);
                                    chatActionCell2.giftPremiumText.y = fDp3;
                                    int color3 = chatActionCell2.giftTextPaint.getColor();
                                    TextLayout textLayout9 = chatActionCell2.giftPremiumText;
                                    SpoilerEffect.renderWithRipple(chatActionCell2, false, color3, 0, textLayout9.patchedLayout, 1, textLayout9.layout, textLayout9.spoilers, canvas, false);
                                    TextLayout textLayout10 = chatActionCell2.giftPremiumText;
                                    StaticLayout staticLayout5 = textLayout10.layout;
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = textLayout10.emoji;
                                    ColorFilter adaptiveEmojiColorFilter2 = chatActionCell2.getAdaptiveEmojiColorFilter(chatActionCell2.giftTextPaint.getColor());
                                    chatActionCell2 = chatActionCell2;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, emojiGroupedSpans2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter2);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                }
                                chatActionCell2.giftTextPaint.setAlpha((int) (Color.alpha(color2) * f26));
                                TextPaint textPaint9 = chatActionCell2.giftTextPaint;
                                textPaint9.linkColor = textPaint9.getColor();
                                float f28 = (f26 * 0.2f) + 0.8f;
                                canvas2.save();
                                canvas2.scale(f28, f28, chatActionCell2.giftRectSize / f4, chatActionCell2.settingWallpaperLayout.getHeight() / f4);
                                canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / f4, 0.0f);
                                SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperLayout, canvas2);
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate(0.0f, chatActionCell2.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                                canvas2.scale(f28, f28, chatActionCell2.giftRectSize / f4, chatActionCell2.settingWallpaperProgressTextLayout.getHeight() / f4);
                                canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / f4, 0.0f);
                                SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperProgressTextLayout, canvas2);
                                canvas2.restore();
                                chatActionCell2.giftTextPaint.setColor(color2);
                                chatActionCell2.giftTextPaint.linkColor = color2;
                            } else {
                                canvas2.save();
                                canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / f4, 0.0f);
                                chatActionCell2.settingWallpaperLayout.draw(canvas2);
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / f4, chatActionCell2.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                                SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperProgressTextLayout, canvas2);
                                canvas2.restore();
                            }
                            chatActionCell = chatActionCell2;
                            f8 = f14;
                            f7 = 1.0f;
                        } else {
                            f6 = 0.0f;
                            textLayout = this.giftPremiumText;
                            if (textLayout != null) {
                                height = textLayout.layout.getHeight();
                                if (f16 < 1.0f) {
                                    height = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height, f16);
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height);
                                    canvas2.saveLayerAlpha(rectF3, 255, 31);
                                } else {
                                    canvas2.save();
                                }
                                canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                                this.giftPremiumText.x = f24 + (((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumText.layout.getWidth()) / f4);
                                TextLayout textLayout11 = this.giftPremiumText;
                                textLayout11.y = fDp3;
                                int color4 = textLayout11.paint.getColor();
                                TextLayout textLayout12 = this.giftPremiumText;
                                f9 = height;
                                f8 = f24;
                                SpoilerEffect.renderWithRipple(this, false, color4, 0, textLayout12.patchedLayout, 1, textLayout12.layout, textLayout12.spoilers, canvas, false);
                                TextLayout textLayout13 = this.giftPremiumText;
                                chatActionCell = this;
                                f7 = 1.0f;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout13.layout, textLayout13.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas2 = canvas;
                                if (f16 < 1.0f && chatActionCell.giftPremiumTextMore != null) {
                                    canvas2.save();
                                    if (chatActionCell.giftPremiumTextClip == null) {
                                        chatActionCell.giftPremiumTextClip = new GradientClip();
                                    }
                                    canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(f2)) - chatActionCell.giftPremiumText.layout.getWidth())) / f4, 0.0f);
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(f5), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), chatActionCell.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), chatActionCell.giftPremiumTextMoreY);
                                    float f29 = 1.0f - f16;
                                    chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF4, f29);
                                    rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f2), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(f5), chatActionCell.giftPremiumTextMoreY);
                                    chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 2, f29);
                                    rectF4.set(0.0f, f9 - AndroidUtilities.dp(f3), chatActionCell.getWidth(), f9);
                                    chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 3, f29 * 4.0f * (1.0f - f29));
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                if (f16 < 1.0f && (text = chatActionCell.giftPremiumTextMore) != null) {
                                    text.draw(canvas2, (chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / f4)) - AndroidUtilities.dp(1.0f), chatActionCell.giftPremiumText.paint.getColor(), 1.0f - f16);
                                }
                            } else {
                                chatActionCell = this;
                                f7 = 1.0f;
                                f8 = f24;
                            }
                        }
                        canvas2.restore();
                        if (chatActionCell.giftPremiumTitleLayout == null) {
                            AndroidUtilities.dp(f5);
                        }
                        textLayout2 = chatActionCell.giftPremiumText;
                        if (textLayout2 != null) {
                            AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f16);
                        }
                        staticLayout = chatActionCell.giftPremiumButtonLayout;
                        if (staticLayout != null) {
                            staticLayout.getHeight();
                        }
                        chatActionCell.getHeight();
                        AndroidUtilities.dp(f5);
                        resourcesProvider = chatActionCell.themeDelegate;
                        if (resourcesProvider != null) {
                            resourcesProvider.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                        } else {
                            Theme.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
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
                                Paint paint = chatActionCell.dimPaint;
                                if (zIsCurrentThemeDark2) {
                                    i5 = 620756991;
                                } else {
                                    i5 = 268435456;
                                }
                                paint.setColor(i5);
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                                chatActionCell.dimPaint.setColor(color5);
                            }
                            if (chatActionCell.getMessageObject().type == 31 && chatActionCell.getMessageObject().type != 37 && chatActionCell.getMessageObject().type != 33 && chatActionCell.getMessageObject().type != 21 && chatActionCell.getMessageObject().type != 22 && chatActionCell.getMessageObject().type != 24) {
                                chatActionCell.starsPath.rewind();
                                chatActionCell.starsPath.addRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(chatActionCell.starsPath);
                                chatActionCell.starParticlesDrawable.onDraw(canvas2);
                                if (!chatActionCell.starParticlesDrawable.paused) {
                                    chatActionCell.invalidate();
                                }
                                canvas2.restore();
                            } else {
                                chatActionCell.invalidate();
                            }
                        }
                        z = messageObject.settingAvatar;
                        if (z) {
                            f13 = chatActionCell.progressToProgress;
                            if (f13 != f7) {
                                chatActionCell.progressToProgress = f13 + 0.10666667f;
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
                            int iDp3 = AndroidUtilities.dp(f2);
                            canvas2.save();
                            float f30 = chatActionCell.progressToProgress;
                            canvas2.scale(f30, f30, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            chatActionCell.progressView.setSize(iDp3);
                            chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                            chatActionCell.progressView.draw(canvas2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            canvas2.restore();
                        }
                        if (chatActionCell.progressToProgress != 1.0f && chatActionCell.giftPremiumButtonLayout != null) {
                            canvas2.save();
                            float f31 = 1.0f - chatActionCell.progressToProgress;
                            canvas2.scale(f31, f31, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            canvas2.translate(f8, chatActionCell.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                            canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(f2)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / f4, f6);
                            chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                            canvas2.restore();
                        }
                        if (messageObject.flickerLoading) {
                            if (chatActionCell.loadingDrawable == null) {
                                LoadingDrawable loadingDrawable2 = new LoadingDrawable(chatActionCell.themeDelegate);
                                chatActionCell.loadingDrawable = loadingDrawable2;
                                loadingDrawable2.setGradientScale(2.0f);
                                chatActionCell.loadingDrawable.setAppearByGradient(true);
                                chatActionCell.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
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
                            fDp4 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                            fDp5 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                            resourcesProvider2 = chatActionCell.themeDelegate;
                            if (resourcesProvider2 != null) {
                                resourcesProvider2.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp4, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp5);
                            } else {
                                Theme.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp4, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp5);
                            }
                            canvas2.save();
                            canvas2.translate(fDp4, fDp5);
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
                                if (zIsCurrentThemeDark) {
                                    f12 = 0.15f;
                                } else {
                                    f12 = 0.1f;
                                }
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
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
                    fDp += iDp;
                    i4 = messageObject.type;
                    if (i4 != 31) {
                        fDp -= AndroidUtilities.dp(3.66f);
                    } else {
                        fDp -= AndroidUtilities.dp(3.66f);
                    }
                    canvas2.translate(f24, fDp);
                    if (this.giftPremiumTitleLayout != null) {
                        canvas2.save();
                        canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumTitleLayout.getWidth()) / f4, 0.0f);
                        this.giftPremiumTitleLayout.draw(canvas2);
                        canvas2.restore();
                        height2 = this.giftPremiumTitleLayout.getHeight() + fDp;
                        if (this.giftPremiumSubtitleLayout != null) {
                            canvas2.save();
                            canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumSubtitleLayout.getWidth()) / f4, this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            this.giftPremiumSubtitleLayout.draw(canvas2);
                            canvas2.restore();
                            height2 += this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(10.0f);
                        }
                        if (messageObject.type == 25) {
                            f15 = 6.0f;
                        } else {
                            f15 = 0.0f;
                        }
                        fDp2 = height2 + AndroidUtilities.dp(f15);
                    } else {
                        fDp2 = fDp - AndroidUtilities.dp(4.0f);
                    }
                    float fDp12 = fDp2;
                    canvas2.restore();
                    if (this.giftPremiumTitleLayout != null) {
                        f5 = 8.0f;
                    } else {
                        f5 = 8.0f;
                    }
                    fDp3 = fDp12 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        fDp3 += AndroidUtilities.dp(f4);
                    }
                    canvas2.save();
                    canvas2.translate(f24, fDp3);
                    if (messageObject.type == i2) {
                        if (this.radialProgress.getTransitionProgress() == 1.0f) {
                            i6 = 4;
                            if (this.radialProgress.getIcon() != 4) {
                                if (this.giftPremiumText != null) {
                                    canvas2.save();
                                    canvas2.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                                    TextLayout textLayout14 = this.giftPremiumText;
                                    textLayout14.x = ((this.giftRectSize - textLayout14.layout.getWidth()) / f4) + f24;
                                    this.giftPremiumText.y = fDp3;
                                    int color6 = this.giftTextPaint.getColor();
                                    TextLayout textLayout15 = this.giftPremiumText;
                                    f14 = f24;
                                    f6 = 0.0f;
                                    SpoilerEffect.renderWithRipple(this, false, color6, 0, textLayout15.patchedLayout, 1, textLayout15.layout, textLayout15.spoilers, canvas, false);
                                    TextLayout textLayout16 = this.giftPremiumText;
                                    chatActionCell2 = this;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout16.layout, textLayout16.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                    canvas2 = canvas;
                                    canvas2.restore();
                                } else {
                                    f6 = 0.0f;
                                    chatActionCell = this;
                                    f8 = f24;
                                }
                                f7 = 1.0f;
                            }
                            chatActionCell = chatActionCell2;
                            f8 = f14;
                            f7 = 1.0f;
                        } else {
                            i6 = 4;
                        }
                        chatActionCell2 = this;
                        f14 = f24;
                        f6 = 0.0f;
                        if (chatActionCell2.settingWallpaperLayout == null) {
                            TextPaint textPaint10 = new TextPaint();
                            chatActionCell2.settingWallpaperPaint = textPaint10;
                            textPaint10.setTextSize(AndroidUtilities.dp(13.0f));
                            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            iIndexOf = spannableStringBuilder.toString().indexOf("...");
                            if (iIndexOf < 0) {
                                iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                i8 = 1;
                            } else {
                                i8 = 3;
                            }
                            if (iIndexOf >= 0) {
                                SpannableString spannableString2 = new SpannableString("…");
                                UploadingDotsSpannable uploadingDotsSpannable2 = new UploadingDotsSpannable();
                                uploadingDotsSpannable2.fixTop = true;
                                uploadingDotsSpannable2.setParent(chatActionCell2, false);
                                spannableString2.setSpan(uploadingDotsSpannable2, 0, spannableString2.length(), 33);
                                spannableStringBuilder.replace(iIndexOf, i8 + iIndexOf, (CharSequence) spannableString2);
                            }
                            TextPaint textPaint11 = chatActionCell2.settingWallpaperPaint;
                            textLayout4 = chatActionCell2.giftPremiumText;
                            if (textLayout4 == null) {
                                i9 = 1;
                            } else {
                                i9 = textLayout4.width;
                            }
                            chatActionCell2.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint11, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        uploadingInfoProgress = chatActionCell2.getUploadingInfoProgress(messageObject);
                        if (chatActionCell2.settingWallpaperProgressTextLayout != null) {
                            chatActionCell2.settingWallpaperProgress = uploadingInfoProgress;
                            String str2 = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                            TextPaint textPaint12 = chatActionCell2.giftTextPaint;
                            textLayout3 = chatActionCell2.giftPremiumText;
                            if (textLayout3 == null) {
                                i7 = 1;
                            } else {
                                i7 = textLayout3.width;
                            }
                            chatActionCell2.settingWallpaperProgressTextLayout = new StaticLayout(str2, textPaint12, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            chatActionCell2.settingWallpaperProgress = uploadingInfoProgress;
                            String str3 = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                            TextPaint textPaint13 = chatActionCell2.giftTextPaint;
                            textLayout3 = chatActionCell2.giftPremiumText;
                            if (textLayout3 == null) {
                                i7 = 1;
                            } else {
                                i7 = textLayout3.width;
                            }
                            chatActionCell2.settingWallpaperProgressTextLayout = new StaticLayout(str3, textPaint13, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        chatActionCell2.settingWallpaperPaint.setColor(chatActionCell2.giftTextPaint.getColor());
                        if (chatActionCell2.radialProgress.getIcon() == i6) {
                            transitionProgress = chatActionCell2.radialProgress.getTransitionProgress();
                            int color7 = chatActionCell2.giftTextPaint.getColor();
                            float f210 = 1.0f - transitionProgress;
                            chatActionCell2.settingWallpaperPaint.setAlpha((int) (Color.alpha(color7) * f210));
                            chatActionCell2.giftTextPaint.setAlpha((int) (Color.alpha(color7) * transitionProgress));
                            TextPaint textPaint14 = chatActionCell2.giftTextPaint;
                            textPaint14.linkColor = textPaint14.getColor();
                            if (chatActionCell2.giftPremiumText != null) {
                                float f211 = (transitionProgress * 0.2f) + 0.8f;
                                canvas2.save();
                                canvas2.scale(f211, f211, chatActionCell2.giftRectSize / f4, chatActionCell2.giftPremiumText.layout.getHeight() / f4);
                                canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                                TextLayout textLayout17 = chatActionCell2.giftPremiumText;
                                textLayout17.x = f14 + ((chatActionCell2.giftRectSize - textLayout17.layout.getWidth()) / f4);
                                chatActionCell2.giftPremiumText.y = fDp3;
                                int color8 = chatActionCell2.giftTextPaint.getColor();
                                TextLayout textLayout18 = chatActionCell2.giftPremiumText;
                                SpoilerEffect.renderWithRipple(chatActionCell2, false, color8, 0, textLayout18.patchedLayout, 1, textLayout18.layout, textLayout18.spoilers, canvas, false);
                                TextLayout textLayout19 = chatActionCell2.giftPremiumText;
                                StaticLayout staticLayout6 = textLayout19.layout;
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans3 = textLayout19.emoji;
                                ColorFilter adaptiveEmojiColorFilter3 = chatActionCell2.getAdaptiveEmojiColorFilter(chatActionCell2.giftTextPaint.getColor());
                                chatActionCell2 = chatActionCell2;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, emojiGroupedSpans3, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter3);
                                canvas2 = canvas;
                                canvas2.restore();
                            }
                            chatActionCell2.giftTextPaint.setAlpha((int) (Color.alpha(color7) * f210));
                            TextPaint textPaint15 = chatActionCell2.giftTextPaint;
                            textPaint15.linkColor = textPaint15.getColor();
                            float f212 = (f210 * 0.2f) + 0.8f;
                            canvas2.save();
                            canvas2.scale(f212, f212, chatActionCell2.giftRectSize / f4, chatActionCell2.settingWallpaperLayout.getHeight() / f4);
                            canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / f4, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperLayout, canvas2);
                            canvas2.restore();
                            canvas2.save();
                            canvas2.translate(0.0f, chatActionCell2.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            canvas2.scale(f212, f212, chatActionCell2.giftRectSize / f4, chatActionCell2.settingWallpaperProgressTextLayout.getHeight() / f4);
                            canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / f4, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperProgressTextLayout, canvas2);
                            canvas2.restore();
                            chatActionCell2.giftTextPaint.setColor(color7);
                            chatActionCell2.giftTextPaint.linkColor = color7;
                        } else {
                            canvas2.save();
                            canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / f4, 0.0f);
                            chatActionCell2.settingWallpaperLayout.draw(canvas2);
                            canvas2.restore();
                            canvas2.save();
                            canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / f4, chatActionCell2.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            SpoilerEffect.layoutDrawMaybe(chatActionCell2.settingWallpaperProgressTextLayout, canvas2);
                            canvas2.restore();
                        }
                        chatActionCell = chatActionCell2;
                        f8 = f14;
                        f7 = 1.0f;
                    } else {
                        f6 = 0.0f;
                        textLayout = this.giftPremiumText;
                        if (textLayout != null) {
                            height = textLayout.layout.getHeight();
                            if (f16 < 1.0f) {
                                height = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height, f16);
                                RectF rectF5 = AndroidUtilities.rectTmp;
                                rectF5.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height);
                                canvas2.saveLayerAlpha(rectF5, 255, 31);
                            } else {
                                canvas2.save();
                            }
                            canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumText.layout.getWidth()) / f4, 0.0f);
                            this.giftPremiumText.x = f24 + (((this.giftRectSize - AndroidUtilities.dp(f2)) - this.giftPremiumText.layout.getWidth()) / f4);
                            TextLayout textLayout110 = this.giftPremiumText;
                            textLayout110.y = fDp3;
                            int color9 = textLayout110.paint.getColor();
                            TextLayout textLayout111 = this.giftPremiumText;
                            f9 = height;
                            f8 = f24;
                            SpoilerEffect.renderWithRipple(this, false, color9, 0, textLayout111.patchedLayout, 1, textLayout111.layout, textLayout111.spoilers, canvas, false);
                            TextLayout textLayout112 = this.giftPremiumText;
                            chatActionCell = this;
                            f7 = 1.0f;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout112.layout, textLayout112.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                            canvas2 = canvas;
                            if (f16 < 1.0f) {
                                canvas2.save();
                                if (chatActionCell.giftPremiumTextClip == null) {
                                    chatActionCell.giftPremiumTextClip = new GradientClip();
                                }
                                canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(f2)) - chatActionCell.giftPremiumText.layout.getWidth())) / f4, 0.0f);
                                RectF rectF6 = AndroidUtilities.rectTmp;
                                rectF6.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(f5), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), chatActionCell.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), chatActionCell.giftPremiumTextMoreY);
                                float f213 = 1.0f - f16;
                                chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF6, f213);
                                rectF6.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f2), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(f5), chatActionCell.giftPremiumTextMoreY);
                                chatActionCell.giftPremiumTextClip.draw(canvas2, rectF6, 2, f213);
                                rectF6.set(0.0f, f9 - AndroidUtilities.dp(f3), chatActionCell.getWidth(), f9);
                                chatActionCell.giftPremiumTextClip.draw(canvas2, rectF6, 3, f213 * 4.0f * (1.0f - f213));
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (f16 < 1.0f) {
                                text.draw(canvas2, (chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / f4)) - AndroidUtilities.dp(1.0f), chatActionCell.giftPremiumText.paint.getColor(), 1.0f - f16);
                            }
                        } else {
                            chatActionCell = this;
                            f7 = 1.0f;
                            f8 = f24;
                        }
                    }
                    canvas2.restore();
                    if (chatActionCell.giftPremiumTitleLayout == null) {
                        AndroidUtilities.dp(f5);
                    }
                    textLayout2 = chatActionCell.giftPremiumText;
                    if (textLayout2 != null) {
                        AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f16);
                    }
                    staticLayout = chatActionCell.giftPremiumButtonLayout;
                    if (staticLayout != null) {
                        staticLayout.getHeight();
                    }
                    chatActionCell.getHeight();
                    AndroidUtilities.dp(f5);
                    resourcesProvider = chatActionCell.themeDelegate;
                    if (resourcesProvider != null) {
                        resourcesProvider.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                    } else {
                        Theme.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
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
                            int color10 = chatActionCell.dimPaint.getColor();
                            Paint paint2 = chatActionCell.dimPaint;
                            if (zIsCurrentThemeDark2) {
                                i5 = 620756991;
                            } else {
                                i5 = 268435456;
                            }
                            paint2.setColor(i5);
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                            chatActionCell.dimPaint.setColor(color10);
                        } else {
                            resourcesProvider4 = chatActionCell.themeDelegate;
                            if (resourcesProvider4 != null) {
                                zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                            } else {
                                zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                            }
                            int color11 = chatActionCell.dimPaint.getColor();
                            Paint paint3 = chatActionCell.dimPaint;
                            if (zIsCurrentThemeDark2) {
                                i5 = 620756991;
                            } else {
                                i5 = 268435456;
                            }
                            paint3.setColor(i5);
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                            chatActionCell.dimPaint.setColor(color11);
                        }
                        if (chatActionCell.getMessageObject().type == 31) {
                            chatActionCell.invalidate();
                        } else {
                            chatActionCell.invalidate();
                        }
                    }
                    z = messageObject.settingAvatar;
                    if (z) {
                        f13 = chatActionCell.progressToProgress;
                        if (f13 != f7) {
                            chatActionCell.progressToProgress = f13 + 0.10666667f;
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
                        int iDp4 = AndroidUtilities.dp(f2);
                        canvas2.save();
                        float f32 = chatActionCell.progressToProgress;
                        canvas2.scale(f32, f32, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        chatActionCell.progressView.setSize(iDp4);
                        chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                        chatActionCell.progressView.draw(canvas2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        canvas2.restore();
                    }
                    if (chatActionCell.progressToProgress != 1.0f) {
                        canvas2.save();
                        float f33 = 1.0f - chatActionCell.progressToProgress;
                        canvas2.scale(f33, f33, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        canvas2.translate(f8, chatActionCell.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                        canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(f2)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / f4, f6);
                        chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                        canvas2.restore();
                    }
                    if (messageObject.flickerLoading) {
                        if (chatActionCell.loadingDrawable == null) {
                            LoadingDrawable loadingDrawable3 = new LoadingDrawable(chatActionCell.themeDelegate);
                            chatActionCell.loadingDrawable = loadingDrawable3;
                            loadingDrawable3.setGradientScale(2.0f);
                            chatActionCell.loadingDrawable.setAppearByGradient(true);
                            chatActionCell.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
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
                        fDp4 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                        fDp5 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                        resourcesProvider2 = chatActionCell.themeDelegate;
                        if (resourcesProvider2 != null) {
                            resourcesProvider2.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp4, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp5);
                        } else {
                            Theme.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp4, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp5);
                        }
                        canvas2.save();
                        canvas2.translate(fDp4, fDp5);
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
                            if (zIsCurrentThemeDark) {
                                f12 = 0.15f;
                            } else {
                                f12 = 0.1f;
                            }
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
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
                            if (zIsCurrentThemeDark) {
                                f12 = 0.15f;
                            } else {
                                f12 = 0.1f;
                            }
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
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
                } else {
                    chatActionCell = this;
                }
                chatActionCell.drawReactions(canvas2, false, null);
                chatActionCell.transitionParams.recordDrawingState();
                canvas2.restore();
            }
        }
        if (this.textPaint != null) {
            i2 = 22;
            i3 = 21;
        } else {
            i2 = 22;
            i3 = 21;
        }
        if (this.textPaint != null) {
            canvas2.save();
            canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas2.save();
            SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas2);
            chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate != null) {
                StaticLayout staticLayout7 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans4 = this.animatedEmojiStack;
                List list2 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout7, emojiGroupedSpans4, 0.0f, list2, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
            } else {
                StaticLayout staticLayout8 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans5 = this.animatedEmojiStack;
                List list3 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout8, emojiGroupedSpans5, 0.0f, list3, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
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
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.rippleView) {
            float scale = this.bounce.getScale(0.02f);
            canvas.save();
            canvas.scale(scale, scale, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    private void checkLeftRightBounds() {
        this.backgroundLeft = (int) Math.min(this.backgroundLeft, this.rect.left);
        this.backgroundRight = (int) Math.max(this.backgroundRight, this.rect.right);
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
            int themedColor = getThemedColor(i3);
            if (this.overrideBackgroundPaint == null) {
                Paint paint3 = new Paint(1);
                this.overrideBackgroundPaint = paint3;
                paint3.setColor(themedColor);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
                this.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(getThemedColor(this.overrideText));
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
            int i4 = 0;
            for (int i5 = 0; i5 < lineCount; i5++) {
                int iCeil = (int) Math.ceil(this.textLayout.getLineWidth(i5));
                if (i5 != 0 && (i2 = i4 - iCeil) > 0) {
                    if (i2 <= (iDp2 * 1.5f) + iDp3) {
                    }
                    this.lineWidths.add(Integer.valueOf(i4));
                }
                i4 = iCeil;
                this.lineWidths.add(Integer.valueOf(i4));
            }
            f = 6.0f;
            f2 = 8.0f;
            for (int i6 = lineCount - 2; i6 >= 0; i6--) {
                int iIntValue = ((Integer) this.lineWidths.get(i6)).intValue();
                int i7 = i4 - iIntValue;
                if (i7 <= 0 || i7 > (iDp2 * 1.5f) + iDp3) {
                    i4 = iIntValue;
                }
                this.lineWidths.set(i6, Integer.valueOf(i4));
            }
            int iDp4 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int iDp5 = AndroidUtilities.dp(3.0f);
            int iDp6 = AndroidUtilities.dp(6.0f);
            int i8 = iDp2 - iDp5;
            f3 = 2.0f;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            f4 = 4.0f;
            float f7 = measuredWidth;
            this.backgroundPath.moveTo(f7, iDp4);
            int i9 = 0;
            int i10 = 0;
            while (i9 < lineCount) {
                int iIntValue2 = ((Integer) this.lineWidths.get(i9)).intValue();
                int i11 = i10;
                int lineBottom = this.textLayout.getLineBottom(i9);
                int i12 = lineCount - 1;
                int iIntValue3 = i9 < i12 ? ((Integer) this.lineWidths.get(i9 + 1)).intValue() : 0;
                int iDp7 = lineBottom - i11;
                if (i9 == 0 || iIntValue2 > i4) {
                    iDp7 += AndroidUtilities.dp(3.0f);
                }
                if (i9 == i12 || iIntValue2 > iIntValue3) {
                    iDp7 += AndroidUtilities.dp(3.0f);
                }
                int i13 = iDp7;
                float f8 = f7 + (iIntValue2 / 2.0f);
                int i14 = (i9 == i12 || iIntValue2 >= iIntValue3 || i9 == 0 || iIntValue2 >= i4) ? iDp3 : iDp6;
                if (i9 == 0 || iIntValue2 > i4) {
                    f6 = f8;
                    this.rect.set((f6 - iDp5) - iDp2, iDp4, f6 + i8, (iDp2 * 2) + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else if (iIntValue2 < i4) {
                    f6 = f8;
                    float f9 = f6 + i8;
                    int i15 = i14 * 2;
                    this.rect.set(f9, iDp4, i15 + f9, i15 + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                } else {
                    f6 = f8;
                }
                iDp4 += i13;
                if (i9 == i12 || iIntValue2 >= iIntValue3) {
                    iDp = i13;
                } else {
                    iDp4 -= AndroidUtilities.dp(3.0f);
                    iDp = i13 - AndroidUtilities.dp(3.0f);
                }
                if (i9 != 0 && iIntValue2 < i4) {
                    iDp4 -= AndroidUtilities.dp(3.0f);
                    iDp -= AndroidUtilities.dp(3.0f);
                }
                this.lineHeights.add(Integer.valueOf(iDp));
                if (i9 == i12 || iIntValue2 > iIntValue3) {
                    this.rect.set((f6 - iDp5) - iDp2, iDp4 - (iDp2 * 2), f6 + i8, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (iIntValue2 < iIntValue3) {
                    float f10 = f6 + i8;
                    int i16 = i14 * 2;
                    this.rect.set(f10, iDp4 - i16, i16 + f10, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i9++;
                i4 = iIntValue2;
                i10 = lineBottom;
                f7 = f7;
                lineCount = lineCount;
                iDp3 = iDp3;
                iDp6 = iDp6;
                themedPaint2 = themedPaint2;
            }
            paint = themedPaint2;
            float f11 = f7;
            int i17 = iDp3;
            int i18 = iDp6;
            int i19 = lineCount - 1;
            int i20 = i19;
            while (i20 >= 0) {
                int iIntValue4 = i20 != 0 ? ((Integer) this.lineWidths.get(i20 - 1)).intValue() : 0;
                int iIntValue5 = ((Integer) this.lineWidths.get(i20)).intValue();
                int iIntValue6 = i20 != i19 ? ((Integer) this.lineWidths.get(i20 + 1)).intValue() : 0;
                this.textLayout.getLineBottom(i20);
                float f12 = measuredWidth - (iIntValue5 / 2);
                int i21 = (i20 == i19 || iIntValue5 >= iIntValue6 || i20 == 0 || iIntValue5 >= iIntValue4) ? i17 : i18;
                if (i20 == i19 || iIntValue5 > iIntValue6) {
                    f5 = f12;
                    this.rect.set(f5 - i8, iDp4 - (iDp2 * 2), f5 + iDp5 + iDp2, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (iIntValue5 < iIntValue6) {
                    float f13 = f12 - i8;
                    int i22 = i21 * 2;
                    f5 = f12;
                    this.rect.set(f13 - i22, iDp4 - i22, f13, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                } else {
                    f5 = f12;
                }
                iDp4 -= ((Integer) this.lineHeights.get(i20)).intValue();
                if (i20 == 0 || iIntValue5 > iIntValue4) {
                    this.rect.set(f5 - i8, iDp4, f5 + iDp5 + iDp2, (iDp2 * 2) + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (iIntValue5 < iIntValue4) {
                    float f14 = f5 - i8;
                    int i23 = i21 * 2;
                    this.rect.set(f14 - i23, iDp4, f14, i23 + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i20--;
            }
            this.backgroundPath.close();
            if (isMessageActionSuggestedPostApproval() && !isNewStyleButtonLayout()) {
                this.rect.left = (f11 - (this.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                RectF rectF = this.rect;
                rectF.top = iDp4;
                rectF.right = f11 + (this.textWidth / 2.0f) + AndroidUtilities.dp(17.0f);
                this.rect.bottom = iDp4 + this.textHeight + this.titleHeight + AndroidUtilities.dp(28.0f);
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
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(f4));
        }
        if (z && (getAlpha() != 1.0f || isFloating())) {
            alpha = themedPaint.getAlpha();
            alpha2 = paint.getAlpha();
            themedPaint.setAlpha((int) (alpha * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
            paint2 = paint;
            paint2.setAlpha((int) (alpha2 * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
        } else {
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
                    this.dimPaint.setAlpha((int) (alpha3 * getAlpha()));
                }
                canvas2.drawPath(this.backgroundPath, this.dimPaint);
                this.dimPaint.setAlpha(alpha3);
            }
        } else {
            canvas2 = canvas;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (this.starGiftLayout.has()) {
            float width = this.starGiftLayout.getWidth() + AndroidUtilities.dp(f2);
            float width2 = (getWidth() - width) / f3;
            float fDp = this.starGiftLayout.repost ? 0.0f : this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(width2, fDp, width + width2, this.starGiftLayout.getHeight() + fDp + AndroidUtilities.dp(f2));
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
                float width3 = (getWidth() - fWidth) / f3;
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(width3, AndroidUtilities.dp(f4), fWidth + width3, AndroidUtilities.dp(f4) + fHeight);
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), themedPaint);
                if (hasGradientService()) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint2);
                }
            } else if (isButtonLayout(messageObject2)) {
                float width4 = (getWidth() - this.giftRectSize) / f3;
                float f15 = this.textY + this.textHeight;
                if (isNewStyleButtonLayout()) {
                    float fDp2 = f15 + AndroidUtilities.dp(f4);
                    AndroidUtilities.rectTmp.set(width4, fDp2, this.giftRectSize + width4, this.backgroundRectHeight + fDp2);
                } else {
                    float fDp3 = f15 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f16 = this.giftRectSize;
                    rectF3.set(width4, fDp3, width4 + f16, f16 + fDp3 + this.giftPremiumAdditionalHeight);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !this.giftPremiumTextCollapsed && (textLayout = this.giftPremiumText) != null && this.giftPremiumTextCollapsedHeight > 0) {
                    AndroidUtilities.rectTmp.bottom -= (textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight) * (1.0f - this.giftPremiumTextExpandedAnimated.get());
                }
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i = messageObject2.type) == 33 || i == 35) && this.botInlineButtons != null)) {
                    Arrays.fill(this.radii, AndroidUtilities.dp(16.0f));
                    float[] fArr = this.radii;
                    float fDp4 = AndroidUtilities.dp(f);
                    fArr[7] = fDp4;
                    fArr[6] = fDp4;
                    fArr[5] = fDp4;
                    fArr[4] = fDp4;
                    this.backgroundPath2.rewind();
                    this.backgroundPath2.addRoundRect(this.backgroundRect, this.radii, Path.Direction.CW);
                    canvas2.drawPath(this.backgroundPath2, themedPaint);
                    if (hasGradientService()) {
                        canvas2.drawPath(this.backgroundPath2, paint2);
                    }
                } else {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), themedPaint);
                    if (hasGradientService()) {
                        canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    }
                }
            }
        }
        if (alpha >= 0) {
            themedPaint.setAlpha(alpha);
            paint2.setAlpha(alpha2);
        }
    }

    private void drawBotButtons(Canvas canvas, ArrayList arrayList) {
        float f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        float f2 = 4.0f;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        float width = (getWidth() - this.giftRectSize) / 2.0f;
        float fDp = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight + AndroidUtilities.dp(4.0f);
        float fDp2 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            BotButton botButton = (BotButton) arrayList.get(i);
            float pressScale = botButton.getPressScale();
            float fDp3 = ((AndroidUtilities.dp(f2) + fDp2) * i) + width;
            float f3 = fDp3 + fDp2;
            this.rect.set(fDp3, fDp, f3, botButton.height + fDp);
            canvas.save();
            if (pressScale != 1.0f) {
                f = 4.0f;
                canvas.scale(pressScale, pressScale, this.rect.centerX(), this.rect.centerY());
            } else {
                f = 4.0f;
            }
            Arrays.fill(this.botButtonRadii, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
            if (botButton.hasPositionFlag(9)) {
                float[] fArr = this.botButtonRadii;
                float fDp4 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = fDp4;
                fArr[6] = fDp4;
            }
            if (botButton.hasPositionFlag(10)) {
                float[] fArr2 = this.botButtonRadii;
                float fDp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr2[5] = fDp5;
                fArr2[4] = fDp5;
            }
            this.botButtonPath.rewind();
            this.botButtonPath.addRoundRect(this.rect, this.botButtonRadii, Path.Direction.CW);
            canvas.drawPath(this.botButtonPath, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawPath(this.botButtonPath, Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas.save();
            canvas.clipPath(this.botButtonPath);
            Drawable drawable = botButton.selectorDrawable;
            if (drawable != null) {
                int i2 = (int) fDp;
                drawable.setBounds((int) fDp3, i2, (int) f3, botButton.height + i2);
                botButton.selectorDrawable.setAlpha(255);
                botButton.selectorDrawable.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            int iDp = botButton.iconDrawable != null ? AndroidUtilities.dp(26.0f) : 0;
            float f4 = iDp;
            float width2 = fDp3 + (((fDp2 - (botButton.title.getWidth() + (botButton.iconDrawable != null ? AndroidUtilities.dp(f) : 0))) - f4) / 2.0f);
            Drawable drawable2 = botButton.iconDrawable;
            if (drawable2 != null) {
                int i3 = (int) width2;
                drawable2.setBounds(i3, (int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp), i3 + AndroidUtilities.dp(24.0f), ((int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp)) + AndroidUtilities.dp(24.0f));
                botButton.iconDrawable.setAlpha(botButton.isLocked ? 128 : 255);
                botButton.iconDrawable.draw(canvas);
                width2 += f4;
            }
            botButton.title.ellipsize(Math.max(1, (((int) fDp2) - AndroidUtilities.dp(15.0f)) - iDp));
            botButton.title.draw(canvas, width2, (AndroidUtilities.dp(40.0f) / 2.0f) + fDp, botButton.isLocked ? 0.5f : 1.0f);
            canvas.restore();
            canvas.restore();
            i++;
            f2 = 4.0f;
        }
    }

    private boolean checkBotButtonMotionEvent(MotionEvent motionEvent) {
        int i;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        if (this.botButtons.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        float width = (getWidth() - this.giftRectSize) / 2.0f;
        float fDp = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight + AndroidUtilities.dp(4.0f);
        float fDp2 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        if (motionEvent.getAction() == 0) {
            this.pressedBotButton = -1;
            for (int i2 = 0; i2 < this.botButtons.size(); i2++) {
                BotButton botButton = (BotButton) this.botButtons.get(i2);
                float fDp3 = ((AndroidUtilities.dp(4.0f) + fDp2) * i2) + width;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(fDp3, fDp, fDp3 + fDp2, botButton.height + fDp);
                float f = x;
                float f2 = y;
                if (rectF.contains(f, f2)) {
                    this.pressedBotButton = i2;
                    invalidateOutbounds();
                    if (botButton.selectorDrawable == null) {
                        Drawable drawableCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(getThemedColor(Theme.key_chat_serviceBackgroundSelector), 6, 6);
                        botButton.selectorDrawable = drawableCreateRadSelectorDrawable;
                        drawableCreateRadSelectorDrawable.setCallback(this);
                    }
                    botButton.selectorDrawable.setHotspot(f, f2);
                    botButton.selectorDrawable.setState(this.pressedState);
                    botButton.setPressed(!botButton.isLocked);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedBotButton != -1) {
                playSoundEffect(0);
                BotButton botButton2 = (BotButton) this.botButtons.get(this.pressedBotButton);
                Drawable drawable = botButton2.selectorDrawable;
                if (drawable != null) {
                    drawable.setState(StateSet.NOTHING);
                }
                botButton2.setPressed(false);
                if (this.delegate != null && !botButton2.isLocked && (buttonCustom = botButton2.buttonCustom) != null) {
                    didPressCustomBotButton(buttonCustom);
                }
                this.pressedBotButton = -1;
                invalidateOutbounds();
                return false;
            }
        } else if (motionEvent.getAction() == 3 && (i = this.pressedBotButton) != -1) {
            BotButton botButton3 = (BotButton) this.botButtons.get(i);
            Drawable drawable2 = botButton3.selectorDrawable;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
            }
            botButton3.setPressed(false);
            this.pressedBotButton = -1;
            invalidateOutbounds();
        }
        return false;
    }

    private void didPressCustomBotButton(BotInlineKeyboard.ButtonCustom buttonCustom) {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        if (getMessageObject() == null) {
            return;
        }
        int i = buttonCustom.id;
        if (i == 5) {
            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
            final BaseFragment baseFragment = chatActionCellDelegate != null ? chatActionCellDelegate.getBaseFragment() : null;
            if (baseFragment == null || this.currentMessageObject == null) {
                return;
            }
            AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.currentMessageObject.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell.$r8$lambda$YjVhgTFR7wz13rDH56J1BL_NPw8(this.f$0, baseFragment);
                }
            });
            return;
        }
        if (i == 6) {
            MessageObject messageObject3 = this.currentMessageObject;
            if (messageObject3 == null || (message3 = messageObject3.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                GiftOfferSheet.openOfferAcceptAlert(LaunchActivity.getLastFragment(), getContext(), this.themeDelegate, this.currentAccount, this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction);
                return;
            }
            return;
        }
        if (i == 7) {
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            BaseFragment baseFragment2 = chatActionCellDelegate2 != null ? chatActionCellDelegate2.getBaseFragment() : null;
            if (baseFragment2 == null || (messageObject2 = this.currentMessageObject) == null || (message2 = messageObject2.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction2 = message2.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                AlertsCreator.showSimpleConfirmAlert(baseFragment2, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable() {
                    @Override
                    public final void run() {
                        ChatActionCell chatActionCell = this.f$0;
                        MessagesController.getInstance(chatActionCell.currentAccount).toggleChatNoForwards(chatActionCell.currentMessageObject.getDialogId(), chatActionCell.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                    }
                });
                return;
            }
            return;
        }
        if (i == 8) {
            ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
            BaseFragment baseFragment3 = chatActionCellDelegate3 != null ? chatActionCellDelegate3.getBaseFragment() : null;
            if (baseFragment3 == null || (messageObject = this.currentMessageObject) == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                AlertsCreator.showSimpleConfirmAlert(baseFragment3, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable() {
                    @Override
                    public final void run() {
                        ChatActionCell chatActionCell = this.f$0;
                        MessagesController.getInstance(chatActionCell.currentAccount).toggleChatNoForwards(chatActionCell.currentMessageObject.getDialogId(), chatActionCell.currentMessageObject.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                    }
                });
            }
        }
    }

    public static void $r8$lambda$YjVhgTFR7wz13rDH56J1BL_NPw8(final ChatActionCell chatActionCell, final BaseFragment baseFragment) {
        chatActionCell.getClass();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = chatActionCell.getMessageObject().getId();
        tL_resolveStarGiftOffer.decline = true;
        ConnectionsManager.getInstance(chatActionCell.currentAccount).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatActionCell.$r8$lambda$fNOzERVbA3_Y9cA6qsZ5gSaCsfM(this.f$0, baseFragment, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$fNOzERVbA3_Y9cA6qsZ5gSaCsfM(ChatActionCell chatActionCell, final BaseFragment baseFragment, TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(chatActionCell.currentAccount).processUpdates(updates, false);
        } else {
            chatActionCell.getClass();
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BulletinFactory.of(baseFragment).showForError(tL_error);
                }
            });
        }
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
        Canvas canvas2;
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.draw(canvas2, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public void drawReactionsLayoutOverlay(Canvas canvas, boolean z) {
        Canvas canvas2;
        float alpha = z ? getAlpha() : 1.0f;
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.drawOverlay(canvas2, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    @Override
    public int getBoundsLeft() {
        if (this.starGiftLayout.has()) {
            int width = ((int) (getWidth() - (this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f)))) / 2;
            return this.starGiftLayout.repost ? width : Math.min(this.backgroundLeft, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return (this.sideMenuWidth / 2) + ((getWidth() - this.giftRectSize) / 2);
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
        if (this.starGiftLayout.has()) {
            int width = ((int) (getWidth() + (this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f)))) / 2;
            return this.starGiftLayout.repost ? width : Math.max(this.backgroundRight, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return (this.sideMenuWidth / 2) + ((getWidth() + this.giftRectSize) / 2);
        }
        int iMax = this.backgroundRight;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            iMax = Math.max((int) this.imageReceiver.getImageX2(), iMax);
        }
        return (this.sideMenuWidth / 2) + iMax;
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
    public int getObserverTag() {
        return this.TAG;
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
            for (final CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view) {
                        if (ChatActionCell.this.delegate != null) {
                            ChatActionCell.this.openLink(characterStyle);
                        }
                    }
                }, spanStart, spanEnd, 33);
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

    public void setInvalidateColors(boolean z) {
        if (this.invalidateColors == z) {
            return;
        }
        this.invalidateColors = z;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.themeDelegate);
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public void drawOutboundsContent(Canvas canvas) {
        canvas.save();
        canvas.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        canvas.save();
        canvas.translate(this.textXLeft, this.textY);
        StaticLayout staticLayout = this.textLayout;
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor()) : null);
        canvas.restore();
        if (this.starGiftLayout.has()) {
            canvas.save();
            canvas.translate((getWidth() - this.starGiftLayout.getWidth()) / 2.0f, this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(16.0f));
            this.starGiftLayout.drawOutbounds(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.topicSeparator != null) {
            float alpha = getAlpha();
            Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            }
            this.topicSeparator.draw(canvas, getWidth(), this.sideMenuWidth, 0.0f, 1.0f, alpha, this.showTopicSeparator);
        }
        drawBotButtons(canvas, this.botButtons);
    }

    private boolean isButtonLayout(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i = messageObject.type;
        return i == 30 || i == 18 || i == 25 || isNewStyleButtonLayout();
    }

    private boolean isGiftChannel(MessageObject messageObject) {
        return messageObject != null && messageObject.type == 25;
    }

    public void setInvalidatesParent(boolean z) {
        this.invalidatesParent = z;
    }

    public void setInvalidateListener(Runnable runnable) {
        this.invalidateListener = runnable;
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
        if (chatActionCellDelegate == null || !chatActionCellDelegate.canDrawOutboundsContent()) {
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
                return;
            }
            return;
        }
        super.invalidate();
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

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.wallpaperPreviewDrawable || super.verifyDrawable(drawable);
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i) {
        if (i != this.adaptiveEmojiColor || this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = i;
            this.adaptiveEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter;
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return this.reactionsLayoutInBubble.getReactionButton(visibleReaction);
    }

    public class TransitionParams {
        public boolean animateChange;
        public float animateChangeProgress = 1.0f;
        public boolean wasDraw;

        public boolean supportChangeAnimation() {
            return true;
        }

        public TransitionParams() {
        }

        public void recordDrawingState() {
            this.wasDraw = true;
            ChatActionCell.this.reactionsLayoutInBubble.recordDrawingState();
        }

        public boolean animateChange() {
            if (this.wasDraw) {
                return ChatActionCell.this.reactionsLayoutInBubble.animateChange();
            }
            return false;
        }

        public void onDetach() {
            this.wasDraw = false;
        }

        public void resetAnimation() {
            this.animateChange = false;
            this.animateChangeProgress = 1.0f;
        }
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.setScrimReaction(num);
    }

    public void drawScrimReaction(Canvas canvas, Integer num, float f, boolean z) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        this.reactionsLayoutInBubble.setScrimProgress(f, z);
        this.reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, num);
    }

    public void drawScrimReactionPreview(View view, Canvas canvas, int i, Integer num, float f) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        this.reactionsLayoutInBubble.setScrimProgress(f);
        this.reactionsLayoutInBubble.drawPreview(view, canvas, i, num);
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
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
    }
}
