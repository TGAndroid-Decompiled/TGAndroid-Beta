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

    public void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        ChatActionCellDelegate chatActionCellDelegate;
        if (!z || (lottieAnimation = this.imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.playedGiftAnimation) {
            messageObject.playedGiftAnimation = true;
            lottieAnimation.setCurrentFrame(0, false);
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(lottieAnimation));
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
                return;
            }
            return;
        }
        if (lottieAnimation.getCurrentFrame() < 1) {
            lottieAnimation.stop();
            lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
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
                this.f$0.lambda$new$0(imageReceiver, z2, z3, z4);
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
        TLRPC.Document document;
        Object obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str2;
        TLRPC.Document document2;
        long j;
        String tonGiftEmoji;
        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName;
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
        boolean z6;
        float f;
        TLRPC.Message message;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        TLRPC.Document document4;
        String str3;
        int i5;
        StaticLayout staticLayout;
        if (messageObject == null) {
            return;
        }
        if (this.currentMessageObject != messageObject || (!((staticLayout = this.textLayout) == null || TextUtils.equals(staticLayout.getText(), messageObject.messageText)) || (!(this.hasReplyMessage || messageObject.replyMessageObject == null) || z || messageObject.type == 21 || messageObject.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.botButtons.clear();
            this.botInlineButtons = null;
            this.accessibilityText = null;
            MessageObject messageObject2 = this.currentMessageObject;
            boolean z7 = messageObject2 == null || messageObject2.stableId != messageObject.stableId;
            if (messageObject2 != null) {
                messageObject.playedGiftAnimation = messageObject2.playedGiftAnimation;
            }
            this.currentMessageObject = messageObject;
            messageObject.forceUpdate = false;
            this.hasReplyMessage = messageObject.replyMessageObject != null;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.previousWidth = 0;
            this.isSpoilerRevealing = false;
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null && z7) {
                textLayout.detach();
                this.giftPremiumText = null;
                this.giftPremiumTextUncollapsed = false;
            }
            if (z7 || messageObject.reactionsChanged) {
                messageObject.reactionsChanged = false;
                TLRPC.Message message2 = messageObject.messageOwner;
                boolean z8 = (message2 == null || (tL_messageReactions = message2.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject.shouldDrawReactions()) {
                    this.reactionsLayoutInBubble.setMessage(messageObject, !messageObject.shouldDrawReactionsInLayout(), z8, this.themeDelegate);
                } else {
                    this.reactionsLayoutInBubble.setMessage(null, false, false, this.themeDelegate);
                }
            }
            if (messageObject.type == 32) {
                if (this.birthdayLayout == null) {
                    this.birthdayLayout = new SuggestBirthdayActionLayout(this.currentAccount, this, this.themeDelegate);
                    if (isCellAttachedToWindow()) {
                        this.birthdayLayout.attach();
                    }
                }
                this.birthdayLayout.set(messageObject);
            } else {
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
                if (suggestBirthdayActionLayout != null) {
                    suggestBirthdayActionLayout.detach();
                    this.birthdayLayout = null;
                }
            }
            boolean z9 = !z7;
            this.starGiftLayout.set(messageObject, z9);
            this.imageReceiver.setAutoRepeatCount(0);
            this.imageReceiver.clearDecorators();
            if (messageObject.type != 22) {
                this.wallpaperPreviewDrawable = null;
            }
            if (messageObject.actionDeleteGroupEventId != -1) {
                ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
                this.overriddenMaxWidth = Math.max(AndroidUtilities.dp(250.0f), HintView2.cutInFancyHalf(messageObject.messageText, (TextPaint) getThemedPaint("paintChatActionText")));
                ProfileActivity.ShowDrawable showDrawableFindDrawable = ChannelAdminLogActivity.findDrawable(messageObject.messageText);
                if (showDrawableFindDrawable != null) {
                    showDrawableFindDrawable.setView(this);
                }
            } else {
                ScaleStateListAnimator.reset(this);
                this.overriddenMaxWidth = 0;
            }
            if (messageObject.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                this.avatarDrawable.setInfo(this.currentAccount, user);
                TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
                if (storyItem != null && storyItem.noforwards) {
                    this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
                } else {
                    StoriesUtilities.setImage(this.imageReceiver, storyItem);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
            } else {
                int i6 = messageObject.type;
                if (i6 == 22) {
                    if (messageObject.strippedThumb == null) {
                        int size = messageObject.photoThumbs.size();
                        for (int i7 = 0; i7 < size && !(messageObject.photoThumbs.get(i7) instanceof TLRPC.TL_photoStrippedSize); i7++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        } else {
                            message = messageObject.messageOwner;
                            if (message != null || (messageAction = message.action) == null) {
                                wallPaper = null;
                            } else {
                                wallPaper = messageAction.wallpaper;
                            }
                        }
                    } else {
                        message = messageObject.messageOwner;
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
                    } else if (wallPaper != null && (str3 = wallPaper.uploadingImage) != null) {
                        this.imageReceiver.setImage(ImageLocation.getForPath(str3), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = messageObject.photoThumbsObject;
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
                        this.radialProgress.setProgress(1.0f, z9);
                        this.radialProgress.setIcon(4, z9, z9);
                    } else {
                        this.radialProgress.setIcon(3, z9, z9);
                    }
                } else if (i6 == 21) {
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                    ArrayList<TLRPC.VideoSize> arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize2, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject.messageOwner.action.photo;
                    if (messageObject.strippedThumb != null) {
                        photoSize2 = null;
                        break;
                    }
                    int size2 = messageObject.photoThumbs.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            photoSize2 = null;
                            break;
                        }
                        photoSize2 = messageObject.photoThumbs.get(i8);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 1000);
                    if (closestPhotoSizeWithSize == null) {
                        z5 = z9;
                        z6 = false;
                    } else if (closestVideoSizeWithSize2 != null) {
                        z5 = z9;
                        z6 = false;
                        this.imageReceiver.setImage(forPhoto, "g", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    } else {
                        z5 = z9;
                        z6 = false;
                        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    }
                    this.imageReceiver.setAllowStartLottieAnimation(z6);
                    ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                    if (imageUpdater != null) {
                        f = 1.0f;
                        if (imageUpdater.getCurrentImageProgress() != 1.0f) {
                            boolean z10 = z5;
                            this.radialProgress.setIcon(3, z10, z10);
                        }
                    } else {
                        f = 1.0f;
                    }
                    this.radialProgress.setProgress(f, z5);
                    this.radialProgress.setIcon(4, z5, z5);
                } else if (i6 == 31 || i6 == 33 || i6 == 30 || i6 == 18 || i6 == 25 || i6 == 35) {
                    this.imageReceiver.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        this.offerExpired = tL_messageActionNoForwardsRequest.expired || ((long) messageObject.messageOwner.date) + MessagesController.getInstance(this.currentAccount).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                        if (!messageObject.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.offerExpired) {
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
                            if (!messageObject.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.offerExpired) {
                                BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                                builder2.addGiftOfferKeyboard();
                                this.botInlineButtons = builder2.build();
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
                                tL_messages_stickerSet = null;
                                obj = null;
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                if (starGift3 != null) {
                                    document3 = starGift3.sticker;
                                } else {
                                    document3 = null;
                                }
                                z7 = z7;
                                document = document3;
                                obj = messageObject;
                                str2 = null;
                                tL_messages_stickerSet = null;
                            } else {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                    if (tL_messageActionStarGiftUnique.refunded) {
                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                        if (starGift4 != null) {
                                            document3 = starGift4.getDocument();
                                        } else {
                                            document3 = null;
                                        }
                                        z7 = z7;
                                        document = document3;
                                        obj = messageObject;
                                        str2 = null;
                                        tL_messages_stickerSet = null;
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
                                String str4 = str;
                                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str4);
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSetByName;
                                if (stickerSetByName == null) {
                                    stickerSetByEmojiOrName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str4);
                                }
                                if (tL_messages_stickerSet2 != null) {
                                    TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                                    int i9 = messageAction3.months;
                                    if (messageObject.type == 30) {
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                            tL_messages_stickerSet2 = stickerSetByEmojiOrName;
                                            tonGiftEmoji = StarsIntroActivity.getTonGiftEmoji(messageAction3.cryptoAmount);
                                        } else {
                                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                                tL_messages_stickerSet2 = stickerSetByEmojiOrName;
                                                j = ((TLRPC.TL_messageActionGiftStars) messageAction3).stars;
                                            } else {
                                                tL_messages_stickerSet2 = stickerSetByEmojiOrName;
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
                                            if (i10 < tL_messages_stickerSet2.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i10);
                                                if (!TextUtils.equals(tL_stickerPack.emoticon, tonGiftEmoji) || tL_stickerPack.documents.isEmpty()) {
                                                    i10++;
                                                    z7 = z7;
                                                } else {
                                                    long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 < tL_messages_stickerSet2.documents.size()) {
                                                            TLRPC.Document document5 = tL_messages_stickerSet2.documents.get(i11);
                                                            z7 = z7;
                                                            if (document5 == null || document5.id != jLongValue) {
                                                                i11++;
                                                                z7 = z7;
                                                            } else {
                                                                document2 = document5;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z7 = z7;
                                            document2 = null;
                                        }
                                    } else {
                                        tL_messages_stickerSet2 = stickerSetByEmojiOrName;
                                        z7 = z7;
                                        String str5 = (String) monthsToEmoticon.get(Integer.valueOf(i9));
                                        document2 = null;
                                        for (TLRPC.TL_stickerPack tL_stickerPack2 : tL_messages_stickerSet2.packs) {
                                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                                Iterator<Long> it = tL_stickerPack2.documents.iterator();
                                                while (it.hasNext()) {
                                                    long jLongValue2 = it.next().longValue();
                                                    for (TLRPC.Document document6 : tL_messages_stickerSet2.documents) {
                                                        if (document6.id == jLongValue2) {
                                                            document2 = document6;
                                                            break;
                                                        }
                                                    }
                                                    if (document2 != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (document2 != null) {
                                                break;
                                            }
                                        }
                                    }
                                    document = (document2 != null || tL_messages_stickerSet2.documents.isEmpty()) ? document2 : tL_messages_stickerSet2.documents.get(0);
                                    str2 = str4;
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    obj = tL_messages_stickerSet2;
                                } else {
                                    tL_messages_stickerSet2 = stickerSetByEmojiOrName;
                                    z7 = z7;
                                    document = null;
                                    obj = null;
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    str2 = str4;
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
                                        int i12 = botButton.positionFlags | 8;
                                        botButton.positionFlags = i12;
                                        if (i4 == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int flag = BitwiseUtils.setFlag(i12, 1, z3);
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
                            this.forceWasUnread = messageObject.wasUnread;
                            this.giftSticker = document;
                            if (document != null) {
                                this.imageReceiver.setAllowStartLottieAnimation(true);
                                i = messageObject.type;
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
                                if (!z7 || messageObject.type != 18) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                    this.imageReceiver.setAutoRepeat(0);
                                    this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject.stableId)), svgThumb, "tgs", obj, 1);
                                }
                            } else if (str2 != null) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                                if (tL_messages_stickerSet == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                mediaDataController.loadStickersByEmojiOrName(str2, false, z2);
                            }
                        }
                        document = giftDocument;
                        str2 = null;
                        tL_messages_stickerSet = null;
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
                                    int i13 = botButton.positionFlags | 8;
                                    botButton.positionFlags = i13;
                                    if (i4 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    int flag2 = BitwiseUtils.setFlag(i13, 1, z3);
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
                        this.forceWasUnread = messageObject.wasUnread;
                        this.giftSticker = document;
                        if (document != null) {
                            this.imageReceiver.setAllowStartLottieAnimation(true);
                            i = messageObject.type;
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
                            if (!z7) {
                                SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject.stableId)), svgThumb2, "tgs", obj, 1);
                            } else {
                                SvgHelper.SvgDrawable svgThumb3 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject.stableId)), svgThumb3, "tgs", obj, 1);
                            }
                        } else if (str2 != null) {
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                            if (tL_messages_stickerSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            mediaDataController2.loadStickersByEmojiOrName(str2, false, z2);
                        }
                    }
                    str2 = null;
                    document = null;
                    tL_messages_stickerSet = null;
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
                                int i14 = botButton.positionFlags | 8;
                                botButton.positionFlags = i14;
                                if (i4 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int flag3 = BitwiseUtils.setFlag(i14, 1, z3);
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
                    this.forceWasUnread = messageObject.wasUnread;
                    this.giftSticker = document;
                    if (document != null) {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        i = messageObject.type;
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
                        if (!z7) {
                            SvgHelper.SvgDrawable svgThumb4 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject.stableId)), svgThumb4, "tgs", obj, 1);
                        } else {
                            SvgHelper.SvgDrawable svgThumb5 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", 160, 160, Integer.valueOf(messageObject.stableId)), svgThumb5, "tgs", obj, 1);
                        }
                    } else if (str2 != null) {
                        MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                        if (tL_messages_stickerSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mediaDataController3.loadStickersByEmojiOrName(str2, false, z2);
                    }
                } else if (i6 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject.messageOwner.action).community_id));
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
                    this.avatarDrawable.setInfo(messageObject.getDialogId(), null, null);
                    if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject, 0);
                    } else {
                        if (messageObject.strippedThumb != null) {
                            photoSize = null;
                            break;
                        }
                        int size3 = messageObject.photoThumbs.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size3) {
                                photoSize = null;
                                break;
                            }
                            photoSize = messageObject.photoThumbs.get(i15);
                            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            TLRPC.Photo photo2 = messageObject.messageOwner.action.photo;
                            if (photo2.video_sizes.isEmpty() || !SharedConfig.isAutoplayGifs()) {
                                closestVideoSizeWithSize = null;
                            } else {
                                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, closestVideoSizeWithSize.size)) {
                                    this.currentVideoLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                                    DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(closestVideoSizeWithSize), messageObject, this);
                                    closestVideoSizeWithSize = null;
                                }
                            }
                            if (closestVideoSizeWithSize != null) {
                                this.imageReceiver.setImage(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2), "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
                            } else {
                                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
                            }
                        } else {
                            this.imageReceiver.setImageBitmap(this.avatarDrawable);
                        }
                    }
                    this.imageReceiver.setVisible(!PhotoViewer.isShowingImage(messageObject), false);
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
                            this.f$0.lambda$setMessageObject$1();
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
            int i16 = this.topicSeparatorTopPadding;
            if (paddingTop != i16) {
                setPadding(i5, i16, i5, i5);
            }
            this.rippleView.setVisibility((!isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
            ForumUtilities.applyTopicToMessage(messageObject);
            requestLayout();
        }
    }

    public void lambda$setMessageObject$1() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.onTopicClick(this);
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
        boolean z2;
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
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i = messageObject.type) == 21 || i == 22) && this.backgroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z2 = true;
                }
                TextLayout textLayout3 = this.giftPremiumText;
                if (textLayout3 != null && this.giftPremiumTextCollapsed) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = textLayout3.x;
                    float f2 = textLayout3.y;
                    float width = textLayout3.layout.getWidth() + f;
                    TextLayout textLayout4 = this.giftPremiumText;
                    rectF.set(f, f2, width, textLayout4.y + textLayout4.layout.getHeight());
                    if (rectF.contains(x, y)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (isButtonLayout(messageObject) && this.giftPremiumButtonLayout != null && (this.giftButtonRect.contains(x, y) || (this.buttonClickableAsImage && this.backgroundRect.contains(x, y)))) {
                    View view = this.rippleView;
                    this.giftButtonPressed = true;
                    view.setPressed(true);
                    this.bounce.setPressed(true);
                    z2 = true;
                }
                if (!z2 && isMessageActionSuggestedPostApproval()) {
                    this.textPressed = true;
                    z2 = true;
                }
                if (!z2) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (TlUtils.isInstance((messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    startCheckLongPress();
                }
                z = z2;
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
            } else {
                if (this.textPressed) {
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
                                    TLRPC.MessageAction messageAction = message3.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
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
                                        this.f$0.lambda$onTouchEvent$3();
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

    public void lambda$onTouchEvent$3() {
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onTouchEvent$2();
            }
        });
    }

    public void lambda$onTouchEvent$2() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        List list = this.giftPremiumText.spoilers;
        if (list != null) {
            list.clear();
        }
        invalidate();
    }

    private void openPremiumGiftChannel() {
        if (this.delegate != null) {
            final TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openPremiumGiftChannel$4(tL_messageActionGiftCode);
                }
            });
        }
    }

    public void lambda$openPremiumGiftChannel$4(TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode) {
        this.delegate.didOpenPremiumGiftChannel(this, tL_messageActionGiftCode.slug, false);
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
                    this.f$0.lambda$openPremiumGiftPreview$5(tL_premiumGiftOption, str);
                }
            });
        }
    }

    public void lambda$openPremiumGiftPreview$5(TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.delegate.didOpenPremiumGift(this, tL_premiumGiftOption, str, false);
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
        ChatActionCellDelegate chatActionCellDelegate;
        TLRPC.Message message;
        MessageObject messageObject;
        int i2;
        CharSequence charSequenceReplaceEmoji = charSequence;
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
            if (charSequenceReplaceEmoji instanceof Spannable) {
                Spannable spannable = (Spannable) charSequenceReplaceEmoji;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint2.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        }
        CharSequence charSequence2 = charSequenceReplaceEmoji;
        this.textLayout = new StaticLayout(charSequence2, textPaint2, i4, isMessageActionSuggestedPostApproval() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        float height;
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
                int imageSize = getImageSize(messageObject);
                if (isNewStyleButtonLayout()) {
                    int iDp4 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    int iDp5 = AndroidUtilities.dp(16.0f);
                    if (imageSize > 0) {
                        iDp5 = (iDp5 * 2) + imageSize;
                    }
                    int i7 = iDp4 + iDp5;
                    TextLayout textLayout = this.giftPremiumText;
                    height = i7 + (textLayout == null ? 0 : textLayout.layout.getHeight() + AndroidUtilities.dp(4.0f));
                } else {
                    float fDp2 = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + imageSize + AndroidUtilities.dp(4.0f);
                    TextLayout textLayout2 = this.giftPremiumText;
                    height = fDp2 + (textLayout2 == null ? 0 : textLayout2.layout.getHeight() + AndroidUtilities.dp(4.0f));
                }
                this.giftPremiumAdditionalHeight = 0;
                StaticLayout staticLayout = this.giftPremiumTitleLayout;
                if (staticLayout != null) {
                    float height2 = height + staticLayout.getHeight();
                    if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                        this.giftPremiumAdditionalHeight += this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1);
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
                    fDp = height - AndroidUtilities.dp(12.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                }
                TextLayout textLayout3 = this.giftPremiumText;
                int height3 = textLayout3 == null ? 0 : textLayout3.layout.getHeight();
                if (this.giftPremiumText == null) {
                    this.giftPremiumAdditionalHeight = 0;
                } else if (this.giftPremiumSubtitleLayout != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(10.0f) + height3;
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
                    float f = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    RectF rectF = this.giftButtonRect;
                    float fDp3 = f - AndroidUtilities.dp(18.0f);
                    float fDp4 = height4 - AndroidUtilities.dp(8.0f);
                    float fDp5 = f + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
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
                        this.backgroundRectHeight = iDp9 + staticLayout5.getHeight() + AndroidUtilities.dp(10.0f);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight += AndroidUtilities.dp(15.0f);
                    }
                    int i8 = this.backgroundRectHeight + height3;
                    this.backgroundRectHeight = i8;
                    float f2 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = i8 + iDp8 + AndroidUtilities.dp(7.0f);
                        this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + this.giftPremiumButtonLayout.getHeight() + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight = (int) (this.backgroundRectHeight + AndroidUtilities.dp(4.0f) + this.giftButtonRect.height());
                    } else if (!isMessageActionSuggestedPostApproval() && (messageObject == null || ((i3 = messageObject.type) != 34 && i3 != 33 && i3 != 35))) {
                        this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + AndroidUtilities.dp(17.0f) + (AndroidUtilities.dp(8.0f) * 2));
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
            setMeasuredDimension(iMax, this.topicSeparatorTopPadding + this.textHeight + iDp + AndroidUtilities.dp(14.0f));
        }
        this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
    }

    private boolean isNewStyleButtonLayout() {
        MessageObject messageObject;
        int i;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && (i = (messageObject = this.currentMessageObject).type) != 31 && i != 37 && i != 33 && i != 35 && i != 34 && i != 21 && i != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.currentMessageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (tL_messageActionSuggestedPostApproval.balance_too_low || tL_messageActionSuggestedPostApproval.rejected) {
                    }
                }
            }
            return false;
        }
        return true;
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
        int i;
        TLRPC.User user;
        CharSequence charSequenceReplaceTags;
        long dialogId;
        TLRPC.User user2;
        CharSequence charSequence;
        CharSequence string;
        CharSequence charSequence2;
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
        CharSequence charSequenceReplaceAnimatedEmoji;
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
        long j3;
        boolean z6;
        int i4;
        TL_stars.StarGift starGift;
        String str2;
        boolean z7;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        long j4;
        CharSequence charSequenceReplaceTags4;
        String string6;
        TL_stars.StarGift starGift2;
        CharSequence string7;
        CharSequence string8;
        CharSequence charSequence3;
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
                } else if (message3 != null) {
                    messageAction3 = message3.action;
                    if (!(messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                        createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                                    j2 = j;
                                    j3 = 0;
                                } else {
                                    j2 = j;
                                    j3 = 0;
                                    if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                        z6 = true;
                                    }
                                    if (peerDialogId2 == j3 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
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
                                        } else if (!z4) {
                                            j4 = j2;
                                            if (z5) {
                                                if (!tL_messageActionStarGift.converted && j4 > 0) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
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
                                                if (!z7 && j4 > 0) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j4, UserObject.getForcedFirstName(user5)));
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else {
                                            long j5 = j2;
                                            if (!z7 && j5 > 0) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j5));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        }
                                    }
                                    CharSequence charSequence4 = charSequenceReplaceTags4;
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
                                        charSequence3 = string8;
                                        charSequence3 = string8;
                                        charSequence3 = string8;
                                        if (!messageObject.isOutOwner() && z6) {
                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                            spannableStringBuilder7.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan.setScale(0.8f, 0.8f);
                                            spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 33);
                                            spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence3 = spannableStringBuilder7;
                                        }
                                    }
                                    CharSequence charSequence5 = charSequence3;
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                        charSequenceReplaceSingleTagToLink = null;
                                    } else {
                                        charSequenceReplaceSingleTagToLink = StarGiftSheet.replaceSingleTagToLink(LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@" + publicUsername), null);
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence4, false, charSequence5, 11, string7, this.giftRectSize, true, false);
                                }
                                z6 = false;
                                if (peerDialogId2 == j3) {
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
                                        } else if (!z4) {
                                            j4 = j2;
                                            if (z5) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else {
                                            long j6 = j2;
                                            if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j7 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                }
                                CharSequence charSequence6 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                        spannableStringBuilder8.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan2.setScale(0.8f, 0.8f);
                                        spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 33);
                                        spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder8;
                                    }
                                } else {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                        spannableStringBuilder9.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan3.setScale(0.8f, 0.8f);
                                        spannableStringBuilder9.setSpan(coloredImageSpan3, 0, 1, 33);
                                        spannableStringBuilder9.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder9;
                                    }
                                }
                                CharSequence charSequence7 = charSequence3;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence6, false, charSequence7, 11, string7, this.giftRectSize, true, false);
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
                        } else if (i == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                            spannableStringBuilder2 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
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
                            createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                                charSequenceReplaceAnimatedEmoji = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(tL_textWithEntities.text);
                                this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                MessageObject.addEntitiesToText(spannableStringBuilder11, tL_textWithEntities.entities, false, false, true, true);
                                charSequenceReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder11, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities.entities, this.giftTextPaint.getFontMetricsInt());
                            }
                            if (charSequenceReplaceAnimatedEmoji == null) {
                                string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                            } else {
                                string4 = charSequenceReplaceAnimatedEmoji;
                            }
                            if (isGiftCode() || isSelfGiftCode()) {
                                i2 = R.string.ActionGiftPremiumView;
                            } else {
                                i2 = R.string.GiftPremiumUseGiftBtn;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, string4, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                            if (messageObject.isOutOwner()) {
                                dialogId2 = 0;
                            } else {
                                dialogId2 = messageObject.getDialogId();
                            }
                            user3 = messagesController.getUser(Long.valueOf(dialogId2));
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
                            CharSequence charSequence8 = string2;
                            if (!tL_messageActionSuggestProfilePhoto.video || ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) != null && !arrayList.isEmpty())) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewPhotoAction);
                            }
                            createGiftPremiumLayouts(null, null, null, charSequence8, false, string3, 11, null, this.giftRectSize, true, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject.isOutOwner()) {
                                dialogId = 0;
                            } else {
                                dialogId = messageObject.getDialogId();
                            }
                            user2 = messagesController2.getUser(Long.valueOf(dialogId));
                            if (messageObject.getDialogId() < 0) {
                                charSequence2 = messageObject.messageText;
                            } else {
                                if (messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                                    charSequence = messageObject.messageText;
                                    string = LocaleController.getString(R.string.RemoveWallpaperAction);
                                    z = false;
                                } else {
                                    if (user2 == null && user2.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        charSequence2 = messageObject.messageText;
                                    } else {
                                        charSequence = messageObject.messageText;
                                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    }
                                    z = true;
                                }
                                createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                            charSequence = charSequence2;
                            string = null;
                            z = true;
                            createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
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
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                } else {
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                }
                                if (peerDialogId2 == j3) {
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
                                        } else if (!z4) {
                                            j4 = j2;
                                            if (z5) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else {
                                            long j8 = j2;
                                            if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j9 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                }
                                CharSequence charSequence9 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder();
                                        spannableStringBuilder12.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan4 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan4.setScale(0.8f, 0.8f);
                                        spannableStringBuilder12.setSpan(coloredImageSpan4, 0, 1, 33);
                                        spannableStringBuilder12.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder12;
                                    }
                                } else {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder();
                                        spannableStringBuilder13.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan5 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan5.setScale(0.8f, 0.8f);
                                        spannableStringBuilder13.setSpan(coloredImageSpan5, 0, 1, 33);
                                        spannableStringBuilder13.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder13;
                                    }
                                }
                                CharSequence charSequence10 = charSequence3;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence9, false, charSequence10, 11, string7, this.giftRectSize, true, false);
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
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            } else {
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            }
                            if (peerDialogId2 == j3) {
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
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j10 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (!z4) {
                                    j4 = j2;
                                    if (z5) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else {
                                    long j11 = j2;
                                    if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                }
                            }
                            CharSequence charSequence11 = charSequenceReplaceTags4;
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null) {
                                string7 = null;
                            } else {
                                string7 = null;
                            }
                            string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                            if (messageObject.isOutOwner()) {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder14 = new SpannableStringBuilder();
                                    spannableStringBuilder14.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan6 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan6.setScale(0.8f, 0.8f);
                                    spannableStringBuilder14.setSpan(coloredImageSpan6, 0, 1, 33);
                                    spannableStringBuilder14.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder14;
                                }
                            } else {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder();
                                    spannableStringBuilder15.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan7 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan7.setScale(0.8f, 0.8f);
                                    spannableStringBuilder15.setSpan(coloredImageSpan7, 0, 1, 33);
                                    spannableStringBuilder15.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder15;
                                }
                            }
                            CharSequence charSequence12 = charSequence3;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                charSequenceReplaceSingleTagToLink = null;
                            } else {
                                charSequenceReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence11, false, charSequence12, 11, string7, this.giftRectSize, true, false);
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
                    } else if (i == 33) {
                        tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
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
                        createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                            charSequenceReplaceAnimatedEmoji = null;
                        } else {
                            charSequenceReplaceAnimatedEmoji = null;
                        }
                        if (charSequenceReplaceAnimatedEmoji == null) {
                            string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                        } else {
                            string4 = charSequenceReplaceAnimatedEmoji;
                        }
                        if (isGiftCode()) {
                            i2 = R.string.ActionGiftPremiumView;
                        } else {
                            i2 = R.string.ActionGiftPremiumView;
                        }
                        createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, string4, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                    } else if (i == 21) {
                        tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                        MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId2 = 0;
                        } else {
                            dialogId2 = messageObject.getDialogId();
                        }
                        user3 = messagesController3.getUser(Long.valueOf(dialogId2));
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
                        CharSequence charSequence13 = string2;
                        if (!tL_messageActionSuggestProfilePhoto.video) {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        } else {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        }
                        createGiftPremiumLayouts(null, null, null, charSequence13, false, string3, 11, null, this.giftRectSize, true, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 22) {
                        MessagesController messagesController4 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId = 0;
                        } else {
                            dialogId = messageObject.getDialogId();
                        }
                        user2 = messagesController4.getUser(Long.valueOf(dialogId));
                        if (messageObject.getDialogId() < 0) {
                            charSequence2 = messageObject.messageText;
                        } else {
                            if (messageObject.isOutOwner()) {
                            }
                            if (user2 == null) {
                            }
                            charSequence = messageObject.messageText;
                            string = LocaleController.getString(R.string.ViewWallpaperAction);
                            z = true;
                            createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                        charSequence = charSequence2;
                        string = null;
                        z = true;
                        createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
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
            } else if (message3 != null) {
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
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                } else {
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                }
                                if (peerDialogId2 == j3) {
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
                                        } else if (!z4) {
                                            j4 = j2;
                                            if (z5) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else {
                                            long j12 = j2;
                                            if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j13 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
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
                                if (messageObject.isOutOwner()) {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder17 = new SpannableStringBuilder();
                                        spannableStringBuilder17.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan8 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan8.setScale(0.8f, 0.8f);
                                        spannableStringBuilder17.setSpan(coloredImageSpan8, 0, 1, 33);
                                        spannableStringBuilder17.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder17;
                                    }
                                } else {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder18 = new SpannableStringBuilder();
                                        spannableStringBuilder18.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan9 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan9.setScale(0.8f, 0.8f);
                                        spannableStringBuilder18.setSpan(coloredImageSpan9, 0, 1, 33);
                                        spannableStringBuilder18.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder18;
                                    }
                                }
                                CharSequence charSequence15 = charSequence3;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence14, false, charSequence15, 11, string7, this.giftRectSize, true, false);
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
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            } else {
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            }
                            if (peerDialogId2 == j3) {
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
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j14 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (!z4) {
                                    j4 = j2;
                                    if (z5) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else {
                                    long j15 = j2;
                                    if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                }
                            }
                            CharSequence charSequence16 = charSequenceReplaceTags4;
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null) {
                                string7 = null;
                            } else {
                                string7 = null;
                            }
                            string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                            if (messageObject.isOutOwner()) {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder19 = new SpannableStringBuilder();
                                    spannableStringBuilder19.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan10 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan10.setScale(0.8f, 0.8f);
                                    spannableStringBuilder19.setSpan(coloredImageSpan10, 0, 1, 33);
                                    spannableStringBuilder19.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder19;
                                }
                            } else {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder110 = new SpannableStringBuilder();
                                    spannableStringBuilder110.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan11 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan11.setScale(0.8f, 0.8f);
                                    spannableStringBuilder110.setSpan(coloredImageSpan11, 0, 1, 33);
                                    spannableStringBuilder110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder110;
                                }
                            }
                            CharSequence charSequence17 = charSequence3;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                charSequenceReplaceSingleTagToLink = null;
                            } else {
                                charSequenceReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence16, false, charSequence17, 11, string7, this.giftRectSize, true, false);
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
                    } else if (i == 33) {
                        tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
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
                        createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                            charSequenceReplaceAnimatedEmoji = null;
                        } else {
                            charSequenceReplaceAnimatedEmoji = null;
                        }
                        if (charSequenceReplaceAnimatedEmoji == null) {
                            string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                        } else {
                            string4 = charSequenceReplaceAnimatedEmoji;
                        }
                        if (isGiftCode()) {
                            i2 = R.string.ActionGiftPremiumView;
                        } else {
                            i2 = R.string.ActionGiftPremiumView;
                        }
                        createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, string4, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                    } else if (i == 21) {
                        tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                        MessagesController messagesController5 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId2 = 0;
                        } else {
                            dialogId2 = messageObject.getDialogId();
                        }
                        user3 = messagesController5.getUser(Long.valueOf(dialogId2));
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
                        CharSequence charSequence18 = string2;
                        if (!tL_messageActionSuggestProfilePhoto.video) {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        } else {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        }
                        createGiftPremiumLayouts(null, null, null, charSequence18, false, string3, 11, null, this.giftRectSize, true, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 22) {
                        MessagesController messagesController6 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId = 0;
                        } else {
                            dialogId = messageObject.getDialogId();
                        }
                        user2 = messagesController6.getUser(Long.valueOf(dialogId));
                        if (messageObject.getDialogId() < 0) {
                            charSequence2 = messageObject.messageText;
                        } else {
                            if (messageObject.isOutOwner()) {
                            }
                            if (user2 == null) {
                            }
                            charSequence = messageObject.messageText;
                            string = LocaleController.getString(R.string.ViewWallpaperAction);
                            z = true;
                            createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                        charSequence = charSequence2;
                        string = null;
                        z = true;
                        createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
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
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                } else {
                                    j2 = j;
                                    j3 = 0;
                                    z6 = false;
                                }
                                if (peerDialogId2 == j3) {
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
                                        } else if (!z4) {
                                            j4 = j2;
                                            if (z5) {
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
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (!z7) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else {
                                            long j16 = j2;
                                            if (!z7) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j17 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                }
                                CharSequence charSequence19 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder();
                                        spannableStringBuilder112.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan12 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan12.setScale(0.8f, 0.8f);
                                        spannableStringBuilder112.setSpan(coloredImageSpan12, 0, 1, 33);
                                        spannableStringBuilder112.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder112;
                                    }
                                } else {
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    charSequence3 = string8;
                                    if (!messageObject.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder113 = new SpannableStringBuilder();
                                        spannableStringBuilder113.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan13 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan13.setScale(0.8f, 0.8f);
                                        spannableStringBuilder113.setSpan(coloredImageSpan13, 0, 1, 33);
                                        spannableStringBuilder113.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence3 = spannableStringBuilder113;
                                    }
                                }
                                CharSequence charSequence110 = charSequence3;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    charSequenceReplaceSingleTagToLink = null;
                                } else {
                                    charSequenceReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence19, false, charSequence110, 11, string7, this.giftRectSize, true, false);
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
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            } else {
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            }
                            if (peerDialogId2 == j3) {
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
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j18 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (!z4) {
                                    j4 = j2;
                                    if (z5) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else {
                                    long j19 = j2;
                                    if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                }
                            }
                            CharSequence charSequence111 = charSequenceReplaceTags4;
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null) {
                                string7 = null;
                            } else {
                                string7 = null;
                            }
                            string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                            if (messageObject.isOutOwner()) {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder114 = new SpannableStringBuilder();
                                    spannableStringBuilder114.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan14 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan14.setScale(0.8f, 0.8f);
                                    spannableStringBuilder114.setSpan(coloredImageSpan14, 0, 1, 33);
                                    spannableStringBuilder114.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder114;
                                }
                            } else {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder115 = new SpannableStringBuilder();
                                    spannableStringBuilder115.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan15 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan15.setScale(0.8f, 0.8f);
                                    spannableStringBuilder115.setSpan(coloredImageSpan15, 0, 1, 33);
                                    spannableStringBuilder115.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder115;
                                }
                            }
                            CharSequence charSequence112 = charSequence3;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                charSequenceReplaceSingleTagToLink = null;
                            } else {
                                charSequenceReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence111, false, charSequence112, 11, string7, this.giftRectSize, true, false);
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
                    } else if (i == 33) {
                        tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
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
                        createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                            charSequenceReplaceAnimatedEmoji = null;
                        } else {
                            charSequenceReplaceAnimatedEmoji = null;
                        }
                        if (charSequenceReplaceAnimatedEmoji == null) {
                            string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                        } else {
                            string4 = charSequenceReplaceAnimatedEmoji;
                        }
                        if (isGiftCode()) {
                            i2 = R.string.ActionGiftPremiumView;
                        } else {
                            i2 = R.string.ActionGiftPremiumView;
                        }
                        createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, string4, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                    } else if (i == 21) {
                        tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                        MessagesController messagesController7 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId2 = 0;
                        } else {
                            dialogId2 = messageObject.getDialogId();
                        }
                        user3 = messagesController7.getUser(Long.valueOf(dialogId2));
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
                        CharSequence charSequence113 = string2;
                        if (!tL_messageActionSuggestProfilePhoto.video) {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        } else {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        }
                        createGiftPremiumLayouts(null, null, null, charSequence113, false, string3, 11, null, this.giftRectSize, true, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 22) {
                        MessagesController messagesController8 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject.isOutOwner()) {
                            dialogId = 0;
                        } else {
                            dialogId = messageObject.getDialogId();
                        }
                        user2 = messagesController8.getUser(Long.valueOf(dialogId));
                        if (messageObject.getDialogId() < 0) {
                            charSequence2 = messageObject.messageText;
                        } else {
                            if (messageObject.isOutOwner()) {
                            }
                            if (user2 == null) {
                            }
                            charSequence = messageObject.messageText;
                            string = LocaleController.getString(R.string.ViewWallpaperAction);
                            z = true;
                            createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                        charSequence = charSequence2;
                        string = null;
                        z = true;
                        createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
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
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            } else {
                                j2 = j;
                                j3 = 0;
                                z6 = false;
                            }
                            if (peerDialogId2 == j3) {
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
                                    } else if (!z4) {
                                        j4 = j2;
                                        if (z5) {
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
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (!z7) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else {
                                        long j110 = j2;
                                        if (!z7) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (!z4) {
                                    j4 = j2;
                                    if (z5) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else {
                                    long j111 = j2;
                                    if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
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
                            if (messageObject.isOutOwner()) {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder117 = new SpannableStringBuilder();
                                    spannableStringBuilder117.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan16 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan16.setScale(0.8f, 0.8f);
                                    spannableStringBuilder117.setSpan(coloredImageSpan16, 0, 1, 33);
                                    spannableStringBuilder117.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder117;
                                }
                            } else {
                                charSequence3 = string8;
                                charSequence3 = string8;
                                charSequence3 = string8;
                                if (!messageObject.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder118 = new SpannableStringBuilder();
                                    spannableStringBuilder118.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan17 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan17.setScale(0.8f, 0.8f);
                                    spannableStringBuilder118.setSpan(coloredImageSpan17, 0, 1, 33);
                                    spannableStringBuilder118.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence3 = spannableStringBuilder118;
                                }
                            }
                            CharSequence charSequence115 = charSequence3;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                charSequenceReplaceSingleTagToLink = null;
                            } else {
                                charSequenceReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence114, false, charSequence115, 11, string7, this.giftRectSize, true, false);
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
                            j2 = j;
                            j3 = 0;
                            z6 = false;
                        } else {
                            j2 = j;
                            j3 = 0;
                            z6 = false;
                        }
                        if (peerDialogId2 == j3) {
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
                                } else if (!z4) {
                                    j4 = j2;
                                    if (z5) {
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
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z7) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else {
                                    long j112 = j2;
                                    if (!z7) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                }
                            } else if (tL_messageActionStarGift.auction_acquired) {
                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                            } else if (!z4) {
                                j4 = j2;
                                if (z5) {
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
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                } else if (tL_messageActionStarGift.saved) {
                                    if (!z7) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                    } else {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                    }
                                } else if (!z7) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                } else {
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                }
                            } else if (tL_messageActionStarGift.converted) {
                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                            } else {
                                long j113 = j2;
                                if (!z7) {
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                } else {
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                }
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
                        if (messageObject.isOutOwner()) {
                            charSequence3 = string8;
                            charSequence3 = string8;
                            charSequence3 = string8;
                            if (!messageObject.isOutOwner()) {
                                SpannableStringBuilder spannableStringBuilder119 = new SpannableStringBuilder();
                                spannableStringBuilder119.append((CharSequence) "^  ");
                                ColoredImageSpan coloredImageSpan18 = new ColoredImageSpan(R.drawable.gift_unpack);
                                coloredImageSpan18.setScale(0.8f, 0.8f);
                                spannableStringBuilder119.setSpan(coloredImageSpan18, 0, 1, 33);
                                spannableStringBuilder119.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                charSequence3 = spannableStringBuilder119;
                            }
                        } else {
                            charSequence3 = string8;
                            charSequence3 = string8;
                            charSequence3 = string8;
                            if (!messageObject.isOutOwner()) {
                                SpannableStringBuilder spannableStringBuilder1110 = new SpannableStringBuilder();
                                spannableStringBuilder1110.append((CharSequence) "^  ");
                                ColoredImageSpan coloredImageSpan19 = new ColoredImageSpan(R.drawable.gift_unpack);
                                coloredImageSpan19.setScale(0.8f, 0.8f);
                                spannableStringBuilder1110.setSpan(coloredImageSpan19, 0, 1, 33);
                                spannableStringBuilder1110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                charSequence3 = spannableStringBuilder1110;
                            }
                        }
                        CharSequence charSequence117 = charSequence3;
                        starGift3 = tL_messageActionStarGift.gift;
                        if (starGift3 != null) {
                            charSequenceReplaceSingleTagToLink = null;
                        } else {
                            charSequenceReplaceSingleTagToLink = null;
                        }
                        createGiftPremiumLayouts(spannableStringBuilder3, null, charSequenceReplaceSingleTagToLink, charSequence116, false, charSequence117, 11, string7, this.giftRectSize, true, false);
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
                } else if (i == 33) {
                    tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                    spannableStringBuilder2 = new SpannableStringBuilder(charSequenceCreateActionTextWithTopic);
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
                    createGiftPremiumLayouts(null, null, null, charSequenceCreateActionTextWithTopic, false, null, 11, null, this.giftRectSize, false, true);
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
                        charSequenceReplaceAnimatedEmoji = null;
                    } else {
                        charSequenceReplaceAnimatedEmoji = null;
                    }
                    if (charSequenceReplaceAnimatedEmoji == null) {
                        string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                    } else {
                        string4 = charSequenceReplaceAnimatedEmoji;
                    }
                    if (isGiftCode()) {
                        i2 = R.string.ActionGiftPremiumView;
                    } else {
                        i2 = R.string.ActionGiftPremiumView;
                    }
                    createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, string4, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false, false);
                } else if (i == 21) {
                    tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    MessagesController messagesController9 = MessagesController.getInstance(this.currentAccount);
                    if (messageObject.isOutOwner()) {
                        dialogId2 = 0;
                    } else {
                        dialogId2 = messageObject.getDialogId();
                    }
                    user3 = messagesController9.getUser(Long.valueOf(dialogId2));
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
                    CharSequence charSequence118 = string2;
                    if (!tL_messageActionSuggestProfilePhoto.video) {
                        string3 = LocaleController.getString(R.string.ViewVideoAction);
                    } else {
                        string3 = LocaleController.getString(R.string.ViewVideoAction);
                    }
                    createGiftPremiumLayouts(null, null, null, charSequence118, false, string3, 11, null, this.giftRectSize, true, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                } else if (i == 22) {
                    MessagesController messagesController10 = MessagesController.getInstance(this.currentAccount);
                    if (messageObject.isOutOwner()) {
                        dialogId = 0;
                    } else {
                        dialogId = messageObject.getDialogId();
                    }
                    user2 = messagesController10.getUser(Long.valueOf(dialogId));
                    if (messageObject.getDialogId() < 0) {
                        charSequence2 = messageObject.messageText;
                    } else {
                        if (messageObject.isOutOwner()) {
                        }
                        if (user2 == null) {
                        }
                        charSequence = messageObject.messageText;
                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                        z = true;
                        createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    }
                    charSequence = charSequence2;
                    string = null;
                    z = true;
                    createGiftPremiumLayouts(null, null, null, charSequence, false, string, 11, null, this.giftRectSize, z, false);
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
        ?? r6;
        int i3;
        int i4;
        boolean z4;
        int iCutInFancyHalf;
        CharSequence charSequenceSubSequence = charSequence4;
        int iDp = i2 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 30) {
            iDp -= AndroidUtilities.dp(16.0f);
        }
        if (charSequence != null) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null && messageObject2.type == 30) {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            spannableStringBuilderValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
            r6 = 0;
            this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, this.giftTitlePaint, iDp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r6 = 0;
            this.giftPremiumTitleLayout = null;
        }
        if (charSequence2 != null) {
            this.giftSubtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
            this.giftPremiumSubtitleLayout = new StaticLayout(charSequence2, this.giftSubtitlePaint, iDp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.giftPremiumSubtitleLayout = r6;
        }
        if (charSequence3 != null) {
            Text text = new Text(charSequence3, 10.0f);
            this.giftPremiumReleasedText = text;
            text.paint.linkColor = -1;
        } else {
            this.giftPremiumReleasedText = r6;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && messageObject3.type == 35) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (isNewStyleButtonLayout() || (i3 = this.currentMessageObject.type) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33)) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int iDp2 = iDp - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (iCutInFancyHalf = HintView2.cutInFancyHalf(charSequenceSubSequence, this.giftTextPaint)) < iDp2 && iCutInFancyHalf > iDp2 / 5.0f) {
            iDp2 = iCutInFancyHalf;
        }
        if (charSequenceSubSequence == null) {
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null) {
                textLayout.detach();
                this.giftPremiumText = r6;
            }
            i4 = 0;
            this.giftPremiumTextCollapsed = false;
        } else {
            i4 = 0;
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout();
            }
            try {
                charSequenceSubSequence = Emoji.replaceEmoji(charSequenceSubSequence, this.giftTextPaint.getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            this.giftPremiumText.setText(charSequenceSubSequence, this.giftTextPaint, iDp2);
            if (z && this.giftPremiumText.layout.getLineCount() > 3) {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(R.string.Gift2CaptionMore), this.giftTextPaint.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - this.giftPremiumText.layout.getLineTop(2);
                this.giftPremiumTextMoreX = (int) this.giftPremiumText.layout.getLineRight(2);
            } else {
                this.giftPremiumTextCollapsed = false;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = 0;
            }
            if (this.giftPremiumTextCollapsed) {
                int lineEnd = this.giftPremiumText.layout.getLineEnd(2) - 1;
                TextLayout textLayout2 = this.giftPremiumText;
                if (lineEnd >= 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, lineEnd);
                }
                textLayout2.setText(charSequenceSubSequence, this.giftTextPaint, iDp2);
            }
        }
        if (charSequence5 != null) {
            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(charSequence5);
            spannableStringBuilderValueOf2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i4, spannableStringBuilderValueOf2.length(), 33);
            int i5 = iDp;
            z4 = false;
            StaticLayout staticLayout = new StaticLayout(spannableStringBuilderValueOf2, (TextPaint) getThemedPaint("paintChatActionText"), i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.buttonClickableAsImage = z2 && !this.giftPremiumTextCollapsed;
            this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
        } else {
            z4 = false;
            this.giftPremiumButtonLayout = r6;
            this.buttonClickableAsImage = false;
            this.giftPremiumButtonWidth = 0.0f;
        }
        if (charSequence6 != null) {
            if (this.giftRibbonPaintEffect == null) {
                this.giftRibbonPaintEffect = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.giftRibbonPath == null) {
                Path path = new Path();
                this.giftRibbonPath = path;
                GiftSheet.RibbonDrawable.fillRibbonPath(path, 1.35f, z4);
            }
            Text text2 = new Text(charSequence6, i, AndroidUtilities.bold());
            this.giftRibbonText = text2;
            text2.ellipsize(AndroidUtilities.dp(62.0f));
            return;
        }
        this.giftRibbonPath = r6;
        this.giftRibbonText = r6;
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
        int i;
        float f;
        float fDp;
        float f2;
        float fDp2;
        int i2;
        float fDp3;
        float f3;
        float fDp4;
        float f4;
        float f5;
        float f6;
        TextLayout textLayout;
        float height;
        float f7;
        float f8;
        Text text;
        TextLayout textLayout2;
        StaticLayout staticLayout;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        float f9;
        float f10;
        float fClamp;
        LoadingDrawable loadingDrawable;
        Paint themedPaint;
        Paint themedPaint2;
        float fDp5;
        float fDp6;
        Theme.ResourcesProvider resourcesProvider2;
        Theme.ResourcesProvider resourcesProvider3;
        boolean zIsCurrentThemeDark;
        ColorMatrix colorMatrix;
        float f11;
        float f12;
        float f13;
        int i3;
        int i4;
        Theme.ResourcesProvider resourcesProvider4;
        boolean zIsCurrentThemeDark2;
        int i5;
        int i6;
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
        float f14;
        RectF rectF;
        float fDp7;
        int iDp;
        ChatActionCellDelegate chatActionCellDelegate;
        StaticLayout staticLayout2;
        ColorFilter adaptiveEmojiColorFilter;
        canvas.save();
        canvas.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f15 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int imageSize = this.stickerSize;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                imageSize = getImageSize(messageObject);
                int iDp2 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f);
                float fDp8 = (this.previousWidth - imageSize) / 2.0f;
                float fDp9 = iDp2;
                if (messageObject.isStoryMention()) {
                    this.avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                }
                float f16 = imageSize;
                this.avatarStoryParams.originalAvatarRect.set(fDp8, fDp9, fDp8 + f16, f16 + fDp9);
                int i10 = messageObject.type;
                if (i10 == 31 || i10 == 33 || i10 == 34 || i10 == 35) {
                    fDp8 += AndroidUtilities.dp(10.0f);
                    fDp9 += AndroidUtilities.dp(10.0f);
                    imageSize -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    fDp8 += AndroidUtilities.dp(2.0f);
                }
                this.imageReceiver.setImageCoords(fDp8, fDp9, Math.max(0, imageSize), Math.max(0, imageSize));
                int i11 = messageObject.type;
                if (i11 == 31 || i11 == 33 || i11 == 34 || i11 == 35) {
                    imageSize += AndroidUtilities.dp(20.0f);
                }
            } else {
                int i12 = messageObject.type;
                if (i12 == 11) {
                    ImageReceiver imageReceiver = this.imageReceiver;
                    int i13 = this.previousWidth;
                    int i14 = this.stickerSize;
                    float f17 = i14;
                    imageReceiver.setImageCoords((i13 - i14) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), f17, f17);
                } else if (i12 == 25) {
                    imageSize = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f18 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f18, f18);
                } else if (messageObject.isStarGiftAction()) {
                    float f19 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f) + AndroidUtilities.dp(2.0f), f19, f19);
                } else if (messageObject.type == 30) {
                    imageSize = (int) (this.stickerSize * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && !(message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f20 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f20, f20);
                    } else {
                        float f21 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(12.0f), f21, f21);
                    }
                } else {
                    imageSize = (int) (this.stickerSize * 1.0f);
                    float f22 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(4.0f), f22, f22);
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
        }
        int i15 = imageSize;
        drawBackground(canvas, false);
        if (this.starGiftLayout.has()) {
            canvas.save();
            float width = (getWidth() - this.starGiftLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float fDp10 = this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(16.0f);
            this.starGiftLayoutY = fDp10;
            canvas.translate(width, fDp10);
            this.starGiftLayout.draw(canvas);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                this.starGiftLayout.drawOutbounds(canvas);
            }
            canvas.restore();
        } else if (this.birthdayLayout != null) {
            canvas.save();
            this.birthdayLayout.draw(canvas);
            canvas.restore();
        } else {
            if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
                GiftSheet.CardBackground cardBackground = this.cardBackground;
                if (cardBackground != null && ((i = messageObject.type) == 31 || i == 37 || i == 33)) {
                    cardBackground.setBounds((int) (this.imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth() + AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight() + AndroidUtilities.dp(14.0f)));
                    this.cardBackground.draw(canvas);
                }
                if (this.wallpaperPreviewDrawable != null) {
                    canvas.save();
                    canvas.translate(this.imageReceiver.getImageX(), this.imageReceiver.getImageY());
                    Path path = this.clipPath;
                    if (path == null) {
                        this.clipPath = new Path();
                    } else {
                        path.rewind();
                    }
                    this.clipPath.addCircle(this.imageReceiver.getImageWidth() / 2.0f, this.imageReceiver.getImageHeight() / 2.0f, this.imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    this.wallpaperPreviewDrawable.setBounds(0, 0, (int) this.imageReceiver.getImageWidth(), (int) this.imageReceiver.getImageHeight());
                    this.wallpaperPreviewDrawable.draw(canvas);
                    canvas.restore();
                } else if (messageObject.isStoryMention()) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    long j = messageMedia.user_id;
                    StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
                    avatarStoryParams.storyId = messageMedia.id;
                    StoriesUtilities.drawAvatarWithStory(j, canvas, this.imageReceiver, avatarStoryParams);
                } else {
                    this.imageReceiver.draw(canvas);
                }
                if (messageObject.type == 37) {
                    DrawableUtils.drawCommunityCardDrawable(canvas, Theme.dialogs_communityCardsDrawable, this.imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), this.imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
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
                        if (imageUpdater.getCurrentImageProgress() == 1.0f) {
                            this.radialProgress.setIcon(4, true, true);
                        } else {
                            this.radialProgress.setIcon(3, true, true);
                        }
                    }
                    this.radialProgress.draw(canvas);
                } else if (i16 == 22) {
                    float uploadingInfoProgress2 = getUploadingInfoProgress(messageObject);
                    this.radialProgress.setProgress(uploadingInfoProgress2, true);
                    this.radialProgress.setCircleRadius(AndroidUtilities.dp(26.0f));
                    this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                    this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                    if (uploadingInfoProgress2 == 1.0f) {
                        this.radialProgress.setIcon(4, true, true);
                    } else {
                        this.radialProgress.setIcon(3, true, true);
                    }
                    this.radialProgress.draw(canvas);
                }
            }
            if (this.textPaint != null || this.textLayout == null) {
                f = 16.0f;
            } else {
                canvas.save();
                canvas.translate(this.textXLeft, this.textY);
                if (this.textLayout.getPaint() != this.textPaint) {
                    buildLayout();
                }
                canvas.save();
                SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
                SpoilerEffect.layoutDrawMaybe(this.textLayout, canvas);
                ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                    StaticLayout staticLayout3 = this.textLayout;
                    f = 16.0f;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : getAdaptiveEmojiColorFilter(staticLayout3.getPaint().getColor()));
                } else {
                    f = 16.0f;
                }
                canvas.restore();
                for (SpoilerEffect spoilerEffect : this.spoilers) {
                    spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                    spoilerEffect.draw(canvas);
                }
                canvas.restore();
            }
            if (this.textPaint != null && this.titleLayout != null) {
                canvas.save();
                canvas.translate(this.titleXLeft, this.textY - this.titleHeight);
                if (this.titleLayout.getPaint() != this.textPaint) {
                    buildLayout();
                }
                canvas.save();
                SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
                SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas);
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
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, emojiGroupedSpans, 0.0f, list, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                }
                canvas.restore();
                for (SpoilerEffect spoilerEffect2 : this.spoilers) {
                    spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                    spoilerEffect2.draw(canvas);
                }
                canvas.restore();
            }
            if (!this.starGiftLayout.has() && isButtonLayout(messageObject)) {
                canvas.save();
                fDp = (this.previousWidth - this.giftRectSize) / 2.0f;
                if (messageObject.type != 22) {
                    fDp += AndroidUtilities.dp(8.0f);
                }
                f2 = fDp;
                if (isNewStyleButtonLayout()) {
                    rectF = this.backgroundRect;
                    if (rectF != null) {
                        fDp7 = rectF.top;
                    } else {
                        fDp7 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    }
                    if (i15 > 0) {
                        iDp = (AndroidUtilities.dp(f) * 2) + i15;
                    } else {
                        iDp = AndroidUtilities.dp(f);
                    }
                    fDp2 = fDp7 + iDp;
                } else {
                    float f23 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                    if (messageObject.type != 21) {
                        i15 = this.stickerSize;
                    }
                    fDp2 = f23 + i15 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 21) {
                        fDp2 += AndroidUtilities.dp(f);
                    }
                    if (messageObject.isStarGiftAction()) {
                        fDp2 += AndroidUtilities.dp(12.0f);
                    } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                        fDp2 -= AndroidUtilities.dp(3.66f);
                    }
                }
                i2 = messageObject.type;
                if (i2 != 31 || i2 == 37 || i2 == 33) {
                    fDp2 -= AndroidUtilities.dp(3.66f);
                }
                canvas.translate(f2, fDp2);
                if (this.giftPremiumTitleLayout != null) {
                    canvas.save();
                    canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                    this.giftPremiumTitleLayout.draw(canvas);
                    canvas.restore();
                    height2 = this.giftPremiumTitleLayout.getHeight() + fDp2;
                    if (this.giftPremiumSubtitleLayout != null) {
                        canvas.save();
                        canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(4.0f));
                        this.giftPremiumSubtitleLayout.draw(canvas);
                        canvas.restore();
                        height2 += this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(10.0f);
                    }
                    if (messageObject.type == 25) {
                        f14 = 6.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    fDp3 = height2 + AndroidUtilities.dp(f14);
                } else {
                    fDp3 = fDp2 - AndroidUtilities.dp(4.0f);
                }
                float fDp11 = fDp3;
                canvas.restore();
                if (this.giftPremiumTitleLayout != null || (text2 = this.giftPremiumReleasedText) == null) {
                    f3 = 0.0f;
                } else {
                    float width2 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                    float fDp12 = (((this.giftRectSize - AndroidUtilities.dp(f)) - width2) / 2.0f) + f2;
                    float fDp13 = AndroidUtilities.dp(14.0f) + fDp2 + this.giftPremiumTitleLayout.getHeight();
                    if (this.giftReleasedBackgroundPaint == null) {
                        this.giftReleasedBackgroundPaint = new Paint(1);
                    }
                    this.giftReleasedBackgroundPaint.setColor(Theme.isCurrentThemeDark() ? 285212671 : 268435456);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp12, fDp13 - AndroidUtilities.dp(8.0f), width2 + fDp12, AndroidUtilities.dp(8.0f) + fDp13);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                    f3 = 0.0f;
                    this.giftPremiumReleasedText.draw(canvas, fDp12 + AndroidUtilities.dp(6.0f), fDp13, -855638017, 1.0f);
                    fDp11 += AndroidUtilities.dp(24.0f);
                }
                fDp4 = fDp11 + AndroidUtilities.dp(4.0f);
                if (messageObject.type == 18) {
                    fDp4 += AndroidUtilities.dp(2.0f);
                }
                f4 = fDp4;
                canvas.save();
                canvas.translate(f2, f4);
                if (messageObject.type == 22) {
                    if (this.radialProgress.getTransitionProgress() == 1.0f) {
                        i6 = 4;
                        if (this.radialProgress.getIcon() != 4) {
                            if (this.giftPremiumText != null) {
                                canvas.save();
                                canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, f3);
                                TextLayout textLayout5 = this.giftPremiumText;
                                textLayout5.x = ((this.giftRectSize - textLayout5.layout.getWidth()) / 2.0f) + f2;
                                this.giftPremiumText.y = f4;
                                int color = this.giftTextPaint.getColor();
                                TextLayout textLayout6 = this.giftPremiumText;
                                f6 = 1.0f;
                                SpoilerEffect.renderWithRipple(this, false, color, 0, textLayout6.patchedLayout, 1, textLayout6.layout, textLayout6.spoilers, canvas, false);
                                TextLayout textLayout7 = this.giftPremiumText;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout7.layout, textLayout7.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas.restore();
                                f8 = f2;
                            } else {
                                f6 = 1.0f;
                                f8 = f2;
                            }
                        }
                    } else {
                        i6 = 4;
                    }
                    f6 = 1.0f;
                    if (this.settingWallpaperLayout == null) {
                        TextPaint textPaint5 = new TextPaint();
                        this.settingWallpaperPaint = textPaint5;
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
                            uploadingDotsSpannable.setParent(this, false);
                            spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(iIndexOf, iIndexOf + i8, (CharSequence) spannableString);
                        }
                        TextPaint textPaint6 = this.settingWallpaperPaint;
                        textLayout4 = this.giftPremiumText;
                        if (textLayout4 == null) {
                            i9 = 1;
                        } else {
                            i9 = textLayout4.width;
                        }
                        this.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint6, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    uploadingInfoProgress = getUploadingInfoProgress(messageObject);
                    if (this.settingWallpaperProgressTextLayout != null || this.settingWallpaperProgress != uploadingInfoProgress) {
                        this.settingWallpaperProgress = uploadingInfoProgress;
                        String str = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                        TextPaint textPaint7 = this.giftTextPaint;
                        textLayout3 = this.giftPremiumText;
                        if (textLayout3 == null) {
                            i7 = 1;
                        } else {
                            i7 = textLayout3.width;
                        }
                        this.settingWallpaperProgressTextLayout = new StaticLayout(str, textPaint7, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.settingWallpaperPaint.setColor(this.giftTextPaint.getColor());
                    if (this.radialProgress.getIcon() == i6) {
                        transitionProgress = this.radialProgress.getTransitionProgress();
                        int color2 = this.giftTextPaint.getColor();
                        float f24 = 1.0f - transitionProgress;
                        this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color2) * f24));
                        this.giftTextPaint.setAlpha((int) (Color.alpha(color2) * transitionProgress));
                        TextPaint textPaint8 = this.giftTextPaint;
                        textPaint8.linkColor = textPaint8.getColor();
                        if (this.giftPremiumText != null) {
                            float f25 = (transitionProgress * 0.2f) + 0.8f;
                            canvas.save();
                            canvas.scale(f25, f25, this.giftRectSize / 2.0f, this.giftPremiumText.layout.getHeight() / 2.0f);
                            canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                            TextLayout textLayout8 = this.giftPremiumText;
                            textLayout8.x = ((this.giftRectSize - textLayout8.layout.getWidth()) / 2.0f) + f2;
                            this.giftPremiumText.y = f4;
                            int color3 = this.giftTextPaint.getColor();
                            TextLayout textLayout9 = this.giftPremiumText;
                            f5 = f2;
                            SpoilerEffect.renderWithRipple(this, false, color3, 0, textLayout9.patchedLayout, 1, textLayout9.layout, textLayout9.spoilers, canvas, false);
                            TextLayout textLayout10 = this.giftPremiumText;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout10.layout, textLayout10.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                            canvas.restore();
                        } else {
                            f5 = f2;
                        }
                        this.giftTextPaint.setAlpha((int) (Color.alpha(color2) * f24));
                        TextPaint textPaint9 = this.giftTextPaint;
                        textPaint9.linkColor = textPaint9.getColor();
                        float f26 = (f24 * 0.2f) + 0.8f;
                        canvas.save();
                        canvas.scale(f26, f26, this.giftRectSize / 2.0f, this.settingWallpaperLayout.getHeight() / 2.0f);
                        canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                        SpoilerEffect.layoutDrawMaybe(this.settingWallpaperLayout, canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                        canvas.scale(f26, f26, this.giftRectSize / 2.0f, this.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                        canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                        SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                        canvas.restore();
                        this.giftTextPaint.setColor(color2);
                        this.giftTextPaint.linkColor = color2;
                    } else {
                        f5 = f2;
                        canvas.save();
                        canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                        this.settingWallpaperLayout.draw(canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                        SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                        canvas.restore();
                    }
                    f8 = f5;
                } else {
                    f5 = f2;
                    f6 = 1.0f;
                    textLayout = this.giftPremiumText;
                    if (textLayout != null) {
                        height = textLayout.layout.getHeight();
                        if (f15 < 1.0f) {
                            height = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height, f15);
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height);
                            canvas.saveLayerAlpha(rectF3, 255, 31);
                        } else {
                            canvas.save();
                        }
                        f7 = height;
                        canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                        this.giftPremiumText.x = f5 + (((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f);
                        TextLayout textLayout11 = this.giftPremiumText;
                        textLayout11.y = f4;
                        int color4 = textLayout11.paint.getColor();
                        TextLayout textLayout12 = this.giftPremiumText;
                        f8 = f5;
                        SpoilerEffect.renderWithRipple(this, false, color4, 0, textLayout12.patchedLayout, 1, textLayout12.layout, textLayout12.spoilers, canvas, false);
                        TextLayout textLayout13 = this.giftPremiumText;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout13.layout, textLayout13.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                        if (f15 < 1.0f && this.giftPremiumTextMore != null) {
                            canvas.save();
                            if (this.giftPremiumTextClip == null) {
                                this.giftPremiumTextClip = new GradientClip();
                            }
                            canvas.translate((-((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreY);
                            float f27 = 1.0f - f15;
                            this.giftPremiumTextClip.clipOut(canvas, rectF4, f27);
                            rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), this.giftPremiumTextMoreY);
                            this.giftPremiumTextClip.draw(canvas, rectF4, 2, f27);
                            rectF4.set(0.0f, f7 - AndroidUtilities.dp(12.0f), getWidth(), f7);
                            this.giftPremiumTextClip.draw(canvas, rectF4, 3, f27 * 4.0f * (1.0f - f27));
                            canvas.restore();
                        }
                        canvas.restore();
                        if (f15 < 1.0f && (text = this.giftPremiumTextMore) != null) {
                            text.draw(canvas, AndroidUtilities.dp(5.0f) + (this.giftPremiumTextMoreX - text.getCurrentWidth()), (this.giftPremiumTextMoreY - (this.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), this.giftPremiumText.paint.getColor(), 1.0f - f15);
                        }
                    } else {
                        f8 = f5;
                    }
                }
                canvas.restore();
                if (this.giftPremiumTitleLayout == null) {
                    AndroidUtilities.dp(8.0f);
                }
                textLayout2 = this.giftPremiumText;
                if (textLayout2 != null) {
                    AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f15);
                }
                staticLayout = this.giftPremiumButtonLayout;
                if (staticLayout != null) {
                    staticLayout.getHeight();
                }
                getHeight();
                AndroidUtilities.dp(8.0f);
                resourcesProvider = this.themeDelegate;
                if (resourcesProvider != null) {
                    resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
                } else {
                    Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
                }
                float scale = this.bounce.getScale(0.02f);
                canvas.save();
                canvas.scale(scale, scale, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                if (this.giftPremiumButtonLayout != null) {
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackgroundSelected"));
                    if (hasGradientService()) {
                        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackgroundDarken"));
                    }
                    if (this.dimAmount > 0.0f) {
                        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                    }
                    if (getMessageObject().type != 31) {
                        i3 = 37;
                        if (getMessageObject().type != 37) {
                            i4 = 33;
                            if (getMessageObject().type == 33) {
                            }
                            if (getMessageObject().type == 31 && getMessageObject().type != i3 && getMessageObject().type != i4 && getMessageObject().type != 21 && getMessageObject().type != 22 && getMessageObject().type != 24) {
                                this.starsPath.rewind();
                                this.starsPath.addRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), Path.Direction.CW);
                                canvas.save();
                                canvas.clipPath(this.starsPath);
                                this.starParticlesDrawable.onDraw(canvas);
                                if (!this.starParticlesDrawable.paused) {
                                    invalidate();
                                }
                                canvas.restore();
                            } else {
                                invalidate();
                            }
                        }
                        resourcesProvider4 = this.themeDelegate;
                        if (resourcesProvider4 != null) {
                            zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                        } else {
                            zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                        }
                        int color5 = this.dimPaint.getColor();
                        Paint paint = this.dimPaint;
                        if (zIsCurrentThemeDark2) {
                            i5 = 620756991;
                        } else {
                            i5 = 268435456;
                        }
                        paint.setColor(i5);
                        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                        this.dimPaint.setColor(color5);
                        if (getMessageObject().type == 31) {
                            invalidate();
                        } else {
                            invalidate();
                        }
                    } else {
                        i3 = 37;
                    }
                    i4 = 33;
                    resourcesProvider4 = this.themeDelegate;
                    if (resourcesProvider4 != null) {
                        zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                    } else {
                        zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                    }
                    int color6 = this.dimPaint.getColor();
                    Paint paint2 = this.dimPaint;
                    if (zIsCurrentThemeDark2) {
                        i5 = 620756991;
                    } else {
                        i5 = 268435456;
                    }
                    paint2.setColor(i5);
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                    this.dimPaint.setColor(color6);
                    if (getMessageObject().type == 31) {
                        invalidate();
                    } else {
                        invalidate();
                    }
                }
                z = messageObject.settingAvatar;
                if (z) {
                    f13 = this.progressToProgress;
                    if (f13 != f6) {
                        this.progressToProgress = f13 + 0.10666667f;
                    } else if (z) {
                        f9 = this.progressToProgress;
                        f10 = 0.0f;
                        if (f9 != 0.0f) {
                            this.progressToProgress = f9 - 0.10666667f;
                        }
                    }
                    f10 = 0.0f;
                } else if (z) {
                    f10 = 0.0f;
                } else {
                    f9 = this.progressToProgress;
                    f10 = 0.0f;
                    if (f9 != 0.0f) {
                        this.progressToProgress = f9 - 0.10666667f;
                    }
                }
                fClamp = Utilities.clamp(this.progressToProgress, f6, f10);
                this.progressToProgress = fClamp;
                if (fClamp != f10) {
                    if (this.progressView == null) {
                        this.progressView = new RadialProgressView(getContext());
                    }
                    int iDp3 = AndroidUtilities.dp(f);
                    canvas.save();
                    float f28 = this.progressToProgress;
                    canvas.scale(f28, f28, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                    this.progressView.setSize(iDp3);
                    this.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                    this.progressView.draw(canvas, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                    canvas.restore();
                }
                if (this.progressToProgress != f6 && this.giftPremiumButtonLayout != null) {
                    canvas.save();
                    float f29 = f6 - this.progressToProgress;
                    canvas.scale(f29, f29, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                    canvas.translate(f8, this.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                    canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, 0.0f);
                    this.giftPremiumButtonLayout.draw(canvas);
                    canvas.restore();
                }
                if (messageObject.flickerLoading) {
                    if (this.loadingDrawable == null) {
                        LoadingDrawable loadingDrawable2 = new LoadingDrawable(this.themeDelegate);
                        this.loadingDrawable = loadingDrawable2;
                        loadingDrawable2.setGradientScale(2.0f);
                        this.loadingDrawable.setAppearByGradient(true);
                        this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                        this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(f6));
                    }
                    this.loadingDrawable.resetDisappear();
                    this.loadingDrawable.setBounds(this.giftButtonRect);
                    this.loadingDrawable.setRadiiDp(16.0f);
                    this.loadingDrawable.draw(canvas);
                } else {
                    loadingDrawable = this.loadingDrawable;
                    if (loadingDrawable != null) {
                        loadingDrawable.setBounds(this.giftButtonRect);
                        this.loadingDrawable.setRadiiDp(16.0f);
                        this.loadingDrawable.disappear();
                        this.loadingDrawable.draw(canvas);
                        if (this.loadingDrawable.isDisappeared()) {
                            this.loadingDrawable.reset();
                        }
                    }
                }
                canvas.restore();
                if (this.backgroundRect != null && this.giftRibbonPath != null && this.giftRibbonText != null) {
                    themedPaint = getThemedPaint("paintChatActionBackground");
                    themedPaint2 = getThemedPaint("paintChatActionBackgroundDarken");
                    fDp5 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                    fDp6 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                    resourcesProvider2 = this.themeDelegate;
                    if (resourcesProvider2 != null) {
                        resourcesProvider2.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + fDp5, this.viewTop + AndroidUtilities.dp(4.0f) + fDp6);
                    } else {
                        Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + fDp5, this.viewTop + AndroidUtilities.dp(4.0f) + fDp6);
                    }
                    canvas.save();
                    canvas.translate(fDp5, fDp6);
                    ColorFilter colorFilter = themedPaint.getColorFilter();
                    PathEffect pathEffect = themedPaint.getPathEffect();
                    resourcesProvider3 = this.themeDelegate;
                    if (resourcesProvider3 != null) {
                        zIsCurrentThemeDark = resourcesProvider3.isDark();
                    } else {
                        zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                    }
                    if (this.giftRibbonPaintFilter != null || this.giftRibbonPaintFilterDark != zIsCurrentThemeDark) {
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
                        this.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                        this.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                    }
                    themedPaint.setColorFilter(this.giftRibbonPaintFilter);
                    themedPaint.setPathEffect(this.giftRibbonPaintEffect);
                    canvas.drawPath(this.giftRibbonPath, themedPaint);
                    themedPaint.setColorFilter(colorFilter);
                    themedPaint.setPathEffect(pathEffect);
                    if (hasGradientService()) {
                        PathEffect pathEffect2 = themedPaint2.getPathEffect();
                        themedPaint2.setPathEffect(this.giftRibbonPaintEffect);
                        canvas.drawPath(this.giftRibbonPath, themedPaint2);
                        themedPaint2.setPathEffect(pathEffect2);
                    }
                    canvas.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                    this.giftRibbonText.draw(canvas, AndroidUtilities.dp(40.43f) - (this.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                    canvas.restore();
                }
            }
            drawReactions(canvas, false, null);
            this.transitionParams.recordDrawingState();
            canvas.restore();
        }
        if (this.textPaint != null) {
            f = 16.0f;
        } else {
            f = 16.0f;
        }
        if (this.textPaint != null) {
            canvas.save();
            canvas.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas);
            chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate != null) {
                StaticLayout staticLayout5 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.animatedEmojiStack;
                List list2 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, emojiGroupedSpans2, 0.0f, list2, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
            } else {
                StaticLayout staticLayout6 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans3 = this.animatedEmojiStack;
                List list3 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, emojiGroupedSpans3, 0.0f, list3, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
            }
            canvas.restore();
            while (r0.hasNext()) {
                spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                spoilerEffect2.draw(canvas);
            }
            canvas.restore();
        }
        if (!this.starGiftLayout.has()) {
            canvas.save();
            fDp = (this.previousWidth - this.giftRectSize) / 2.0f;
            if (messageObject.type != 22) {
                fDp += AndroidUtilities.dp(8.0f);
            }
            f2 = fDp;
            if (isNewStyleButtonLayout()) {
                rectF = this.backgroundRect;
                if (rectF != null) {
                    fDp7 = rectF.top;
                } else {
                    fDp7 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                }
                if (i15 > 0) {
                    iDp = (AndroidUtilities.dp(f) * 2) + i15;
                } else {
                    iDp = AndroidUtilities.dp(f);
                }
                fDp2 = fDp7 + iDp;
            } else {
                float f210 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                if (messageObject.type != 21) {
                    i15 = this.stickerSize;
                }
                fDp2 = f210 + i15 + AndroidUtilities.dp(4.0f);
                if (messageObject.type == 21) {
                    fDp2 += AndroidUtilities.dp(f);
                }
                if (messageObject.isStarGiftAction()) {
                    fDp2 += AndroidUtilities.dp(12.0f);
                } else if (messageObject.type == 30) {
                    fDp2 -= AndroidUtilities.dp(3.66f);
                }
            }
            i2 = messageObject.type;
            if (i2 != 31) {
            }
            fDp2 -= AndroidUtilities.dp(3.66f);
            canvas.translate(f2, fDp2);
            if (this.giftPremiumTitleLayout != null) {
                canvas.save();
                canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                this.giftPremiumTitleLayout.draw(canvas);
                canvas.restore();
                height2 = this.giftPremiumTitleLayout.getHeight() + fDp2;
                if (this.giftPremiumSubtitleLayout != null) {
                    canvas.save();
                    canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(4.0f));
                    this.giftPremiumSubtitleLayout.draw(canvas);
                    canvas.restore();
                    height2 += this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(10.0f);
                }
                if (messageObject.type == 25) {
                    f14 = 6.0f;
                } else {
                    f14 = 0.0f;
                }
                fDp3 = height2 + AndroidUtilities.dp(f14);
            } else {
                fDp3 = fDp2 - AndroidUtilities.dp(4.0f);
            }
            float fDp14 = fDp3;
            canvas.restore();
            if (this.giftPremiumTitleLayout != null) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            fDp4 = fDp14 + AndroidUtilities.dp(4.0f);
            if (messageObject.type == 18) {
                fDp4 += AndroidUtilities.dp(2.0f);
            }
            f4 = fDp4;
            canvas.save();
            canvas.translate(f2, f4);
            if (messageObject.type == 22) {
                if (this.radialProgress.getTransitionProgress() == 1.0f) {
                    i6 = 4;
                    if (this.radialProgress.getIcon() != 4) {
                        if (this.giftPremiumText != null) {
                            canvas.save();
                            canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, f3);
                            TextLayout textLayout14 = this.giftPremiumText;
                            textLayout14.x = ((this.giftRectSize - textLayout14.layout.getWidth()) / 2.0f) + f2;
                            this.giftPremiumText.y = f4;
                            int color7 = this.giftTextPaint.getColor();
                            TextLayout textLayout15 = this.giftPremiumText;
                            f6 = 1.0f;
                            SpoilerEffect.renderWithRipple(this, false, color7, 0, textLayout15.patchedLayout, 1, textLayout15.layout, textLayout15.spoilers, canvas, false);
                            TextLayout textLayout16 = this.giftPremiumText;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout16.layout, textLayout16.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                            canvas.restore();
                            f8 = f2;
                        } else {
                            f6 = 1.0f;
                            f8 = f2;
                        }
                    }
                } else {
                    i6 = 4;
                }
                f6 = 1.0f;
                if (this.settingWallpaperLayout == null) {
                    TextPaint textPaint10 = new TextPaint();
                    this.settingWallpaperPaint = textPaint10;
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
                        uploadingDotsSpannable2.setParent(this, false);
                        spannableString2.setSpan(uploadingDotsSpannable2, 0, spannableString2.length(), 33);
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + i8, (CharSequence) spannableString2);
                    }
                    TextPaint textPaint11 = this.settingWallpaperPaint;
                    textLayout4 = this.giftPremiumText;
                    if (textLayout4 == null) {
                        i9 = 1;
                    } else {
                        i9 = textLayout4.width;
                    }
                    this.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint11, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                uploadingInfoProgress = getUploadingInfoProgress(messageObject);
                if (this.settingWallpaperProgressTextLayout != null) {
                    this.settingWallpaperProgress = uploadingInfoProgress;
                    String str2 = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                    TextPaint textPaint12 = this.giftTextPaint;
                    textLayout3 = this.giftPremiumText;
                    if (textLayout3 == null) {
                        i7 = 1;
                    } else {
                        i7 = textLayout3.width;
                    }
                    this.settingWallpaperProgressTextLayout = new StaticLayout(str2, textPaint12, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.settingWallpaperProgress = uploadingInfoProgress;
                    String str3 = ((int) (uploadingInfoProgress * 100.0f)) + "%";
                    TextPaint textPaint13 = this.giftTextPaint;
                    textLayout3 = this.giftPremiumText;
                    if (textLayout3 == null) {
                        i7 = 1;
                    } else {
                        i7 = textLayout3.width;
                    }
                    this.settingWallpaperProgressTextLayout = new StaticLayout(str3, textPaint13, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.settingWallpaperPaint.setColor(this.giftTextPaint.getColor());
                if (this.radialProgress.getIcon() == i6) {
                    transitionProgress = this.radialProgress.getTransitionProgress();
                    int color8 = this.giftTextPaint.getColor();
                    float f211 = 1.0f - transitionProgress;
                    this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color8) * f211));
                    this.giftTextPaint.setAlpha((int) (Color.alpha(color8) * transitionProgress));
                    TextPaint textPaint14 = this.giftTextPaint;
                    textPaint14.linkColor = textPaint14.getColor();
                    if (this.giftPremiumText != null) {
                        float f212 = (transitionProgress * 0.2f) + 0.8f;
                        canvas.save();
                        canvas.scale(f212, f212, this.giftRectSize / 2.0f, this.giftPremiumText.layout.getHeight() / 2.0f);
                        canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                        TextLayout textLayout17 = this.giftPremiumText;
                        textLayout17.x = ((this.giftRectSize - textLayout17.layout.getWidth()) / 2.0f) + f2;
                        this.giftPremiumText.y = f4;
                        int color9 = this.giftTextPaint.getColor();
                        TextLayout textLayout18 = this.giftPremiumText;
                        f5 = f2;
                        SpoilerEffect.renderWithRipple(this, false, color9, 0, textLayout18.patchedLayout, 1, textLayout18.layout, textLayout18.spoilers, canvas, false);
                        TextLayout textLayout19 = this.giftPremiumText;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout19.layout, textLayout19.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                        canvas.restore();
                    } else {
                        f5 = f2;
                    }
                    this.giftTextPaint.setAlpha((int) (Color.alpha(color8) * f211));
                    TextPaint textPaint15 = this.giftTextPaint;
                    textPaint15.linkColor = textPaint15.getColor();
                    float f213 = (f211 * 0.2f) + 0.8f;
                    canvas.save();
                    canvas.scale(f213, f213, this.giftRectSize / 2.0f, this.settingWallpaperLayout.getHeight() / 2.0f);
                    canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                    SpoilerEffect.layoutDrawMaybe(this.settingWallpaperLayout, canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                    canvas.scale(f213, f213, this.giftRectSize / 2.0f, this.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                    canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                    SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                    canvas.restore();
                    this.giftTextPaint.setColor(color8);
                    this.giftTextPaint.linkColor = color8;
                } else {
                    f5 = f2;
                    canvas.save();
                    canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                    this.settingWallpaperLayout.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                    SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                    canvas.restore();
                }
                f8 = f5;
            } else {
                f5 = f2;
                f6 = 1.0f;
                textLayout = this.giftPremiumText;
                if (textLayout != null) {
                    height = textLayout.layout.getHeight();
                    if (f15 < 1.0f) {
                        height = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height, f15);
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height);
                        canvas.saveLayerAlpha(rectF5, 255, 31);
                    } else {
                        canvas.save();
                    }
                    f7 = height;
                    canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                    this.giftPremiumText.x = f5 + (((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f);
                    TextLayout textLayout110 = this.giftPremiumText;
                    textLayout110.y = f4;
                    int color10 = textLayout110.paint.getColor();
                    TextLayout textLayout111 = this.giftPremiumText;
                    f8 = f5;
                    SpoilerEffect.renderWithRipple(this, false, color10, 0, textLayout111.patchedLayout, 1, textLayout111.layout, textLayout111.spoilers, canvas, false);
                    TextLayout textLayout112 = this.giftPremiumText;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout112.layout, textLayout112.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                    if (f15 < 1.0f) {
                        canvas.save();
                        if (this.giftPremiumTextClip == null) {
                            this.giftPremiumTextClip = new GradientClip();
                        }
                        canvas.translate((-((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                        RectF rectF6 = AndroidUtilities.rectTmp;
                        rectF6.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreY);
                        float f214 = 1.0f - f15;
                        this.giftPremiumTextClip.clipOut(canvas, rectF6, f214);
                        rectF6.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), this.giftPremiumTextMoreY);
                        this.giftPremiumTextClip.draw(canvas, rectF6, 2, f214);
                        rectF6.set(0.0f, f7 - AndroidUtilities.dp(12.0f), getWidth(), f7);
                        this.giftPremiumTextClip.draw(canvas, rectF6, 3, f214 * 4.0f * (1.0f - f214));
                        canvas.restore();
                    }
                    canvas.restore();
                    if (f15 < 1.0f) {
                        text.draw(canvas, AndroidUtilities.dp(5.0f) + (this.giftPremiumTextMoreX - text.getCurrentWidth()), (this.giftPremiumTextMoreY - (this.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), this.giftPremiumText.paint.getColor(), 1.0f - f15);
                    }
                } else {
                    f8 = f5;
                }
            }
            canvas.restore();
            if (this.giftPremiumTitleLayout == null) {
                AndroidUtilities.dp(8.0f);
            }
            textLayout2 = this.giftPremiumText;
            if (textLayout2 != null) {
                AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f15);
            }
            staticLayout = this.giftPremiumButtonLayout;
            if (staticLayout != null) {
                staticLayout.getHeight();
            }
            getHeight();
            AndroidUtilities.dp(8.0f);
            resourcesProvider = this.themeDelegate;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            }
            float scale2 = this.bounce.getScale(0.02f);
            canvas.save();
            canvas.scale(scale2, scale2, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
            if (this.giftPremiumButtonLayout != null) {
                canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackgroundSelected"));
                if (hasGradientService()) {
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackgroundDarken"));
                }
                if (this.dimAmount > 0.0f) {
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                }
                if (getMessageObject().type != 31) {
                    i3 = 37;
                    if (getMessageObject().type != 37) {
                        i4 = 33;
                        if (getMessageObject().type == 33) {
                        }
                        if (getMessageObject().type == 31) {
                            invalidate();
                        } else {
                            invalidate();
                        }
                    }
                    resourcesProvider4 = this.themeDelegate;
                    if (resourcesProvider4 != null) {
                        zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                    } else {
                        zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                    }
                    int color11 = this.dimPaint.getColor();
                    Paint paint3 = this.dimPaint;
                    if (zIsCurrentThemeDark2) {
                        i5 = 620756991;
                    } else {
                        i5 = 268435456;
                    }
                    paint3.setColor(i5);
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                    this.dimPaint.setColor(color11);
                    if (getMessageObject().type == 31) {
                        invalidate();
                    } else {
                        invalidate();
                    }
                } else {
                    i3 = 37;
                }
                i4 = 33;
                resourcesProvider4 = this.themeDelegate;
                if (resourcesProvider4 != null) {
                    zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                } else {
                    zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                }
                int color12 = this.dimPaint.getColor();
                Paint paint4 = this.dimPaint;
                if (zIsCurrentThemeDark2) {
                    i5 = 620756991;
                } else {
                    i5 = 268435456;
                }
                paint4.setColor(i5);
                canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.dimPaint);
                this.dimPaint.setColor(color12);
                if (getMessageObject().type == 31) {
                    invalidate();
                } else {
                    invalidate();
                }
            }
            z = messageObject.settingAvatar;
            if (z) {
                f13 = this.progressToProgress;
                if (f13 != f6) {
                    this.progressToProgress = f13 + 0.10666667f;
                } else if (z) {
                    f9 = this.progressToProgress;
                    f10 = 0.0f;
                    if (f9 != 0.0f) {
                        this.progressToProgress = f9 - 0.10666667f;
                    }
                }
                f10 = 0.0f;
            } else if (z) {
                f9 = this.progressToProgress;
                f10 = 0.0f;
                if (f9 != 0.0f) {
                    this.progressToProgress = f9 - 0.10666667f;
                }
            } else {
                f10 = 0.0f;
            }
            fClamp = Utilities.clamp(this.progressToProgress, f6, f10);
            this.progressToProgress = fClamp;
            if (fClamp != f10) {
                if (this.progressView == null) {
                    this.progressView = new RadialProgressView(getContext());
                }
                int iDp4 = AndroidUtilities.dp(f);
                canvas.save();
                float f215 = this.progressToProgress;
                canvas.scale(f215, f215, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                this.progressView.setSize(iDp4);
                this.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                this.progressView.draw(canvas, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                canvas.restore();
            }
            if (this.progressToProgress != f6) {
                canvas.save();
                float f216 = f6 - this.progressToProgress;
                canvas.scale(f216, f216, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                canvas.translate(f8, this.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, 0.0f);
                this.giftPremiumButtonLayout.draw(canvas);
                canvas.restore();
            }
            if (messageObject.flickerLoading) {
                if (this.loadingDrawable == null) {
                    LoadingDrawable loadingDrawable3 = new LoadingDrawable(this.themeDelegate);
                    this.loadingDrawable = loadingDrawable3;
                    loadingDrawable3.setGradientScale(2.0f);
                    this.loadingDrawable.setAppearByGradient(true);
                    this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                    this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(f6));
                }
                this.loadingDrawable.resetDisappear();
                this.loadingDrawable.setBounds(this.giftButtonRect);
                this.loadingDrawable.setRadiiDp(16.0f);
                this.loadingDrawable.draw(canvas);
            } else {
                loadingDrawable = this.loadingDrawable;
                if (loadingDrawable != null) {
                    loadingDrawable.setBounds(this.giftButtonRect);
                    this.loadingDrawable.setRadiiDp(16.0f);
                    this.loadingDrawable.disappear();
                    this.loadingDrawable.draw(canvas);
                    if (this.loadingDrawable.isDisappeared()) {
                        this.loadingDrawable.reset();
                    }
                }
            }
            canvas.restore();
            if (this.backgroundRect != null) {
                themedPaint = getThemedPaint("paintChatActionBackground");
                themedPaint2 = getThemedPaint("paintChatActionBackgroundDarken");
                fDp5 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                fDp6 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                resourcesProvider2 = this.themeDelegate;
                if (resourcesProvider2 != null) {
                    resourcesProvider2.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + fDp5, this.viewTop + AndroidUtilities.dp(4.0f) + fDp6);
                } else {
                    Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + fDp5, this.viewTop + AndroidUtilities.dp(4.0f) + fDp6);
                }
                canvas.save();
                canvas.translate(fDp5, fDp6);
                ColorFilter colorFilter2 = themedPaint.getColorFilter();
                PathEffect pathEffect3 = themedPaint.getPathEffect();
                resourcesProvider3 = this.themeDelegate;
                if (resourcesProvider3 != null) {
                    zIsCurrentThemeDark = resourcesProvider3.isDark();
                } else {
                    zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                }
                if (this.giftRibbonPaintFilter != null) {
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
                    this.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                    this.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
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
                    this.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                    this.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                }
                themedPaint.setColorFilter(this.giftRibbonPaintFilter);
                themedPaint.setPathEffect(this.giftRibbonPaintEffect);
                canvas.drawPath(this.giftRibbonPath, themedPaint);
                themedPaint.setColorFilter(colorFilter2);
                themedPaint.setPathEffect(pathEffect3);
                if (hasGradientService()) {
                    PathEffect pathEffect4 = themedPaint2.getPathEffect();
                    themedPaint2.setPathEffect(this.giftRibbonPaintEffect);
                    canvas.drawPath(this.giftRibbonPath, themedPaint2);
                    themedPaint2.setPathEffect(pathEffect4);
                }
                canvas.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                this.giftRibbonText.draw(canvas, AndroidUtilities.dp(40.43f) - (this.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                canvas.restore();
            }
        }
        drawReactions(canvas, false, null);
        this.transitionParams.recordDrawingState();
        canvas.restore();
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
        Paint paint2;
        Paint paint3;
        Paint paint4;
        int alpha;
        int alpha2;
        Canvas canvas2;
        float fDp;
        int i;
        TextLayout textLayout;
        float f;
        float f2;
        int i2;
        int i3;
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
        int i4 = this.overrideBackground;
        if (i4 >= 0) {
            int themedColor = getThemedColor(i4);
            if (this.overrideBackgroundPaint == null) {
                Paint paint5 = new Paint(1);
                this.overrideBackgroundPaint = paint5;
                paint5.setColor(themedColor);
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
            int iDp = AndroidUtilities.dp(11.0f);
            int iDp2 = AndroidUtilities.dp(8.0f);
            int i5 = 0;
            for (int i6 = 0; i6 < lineCount; i6++) {
                int iCeil = (int) Math.ceil(this.textLayout.getLineWidth(i6));
                if (i6 == 0 || (i3 = i5 - iCeil) <= 0 || i3 > (iDp * 1.5f) + iDp2) {
                    i5 = iCeil;
                }
                this.lineWidths.add(Integer.valueOf(i5));
            }
            for (int i7 = lineCount - 2; i7 >= 0; i7--) {
                int iIntValue = ((Integer) this.lineWidths.get(i7)).intValue();
                int i8 = i5 - iIntValue;
                if (i8 <= 0 || i8 > (iDp * 1.5f) + iDp2) {
                    i5 = iIntValue;
                }
                this.lineWidths.set(i7, Integer.valueOf(i5));
            }
            int iDp3 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int iDp4 = AndroidUtilities.dp(3.0f);
            int iDp5 = AndroidUtilities.dp(6.0f);
            int i9 = iDp - iDp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f3 = measuredWidth;
            this.backgroundPath.moveTo(f3, iDp3);
            int i10 = 0;
            int i11 = 0;
            while (i10 < lineCount) {
                int iIntValue2 = ((Integer) this.lineWidths.get(i10)).intValue();
                int i12 = iDp5;
                int lineBottom = this.textLayout.getLineBottom(i10);
                int i13 = lineCount - 1;
                int iIntValue3 = i10 < i13 ? ((Integer) this.lineWidths.get(i10 + 1)).intValue() : 0;
                int iDp6 = lineBottom - i11;
                if (i10 == 0 || iIntValue2 > i5) {
                    f = 3.0f;
                    iDp6 += AndroidUtilities.dp(3.0f);
                } else {
                    f = 3.0f;
                }
                if (i10 == i13 || iIntValue2 > iIntValue3) {
                    iDp6 += AndroidUtilities.dp(f);
                }
                float f4 = (iIntValue2 / 2.0f) + f3;
                int i14 = (i10 == i13 || iIntValue2 >= iIntValue3 || i10 == 0 || iIntValue2 >= i5) ? iDp2 : i12;
                if (i10 == 0 || iIntValue2 > i5) {
                    this.rect.set((f4 - iDp4) - iDp, iDp3, i9 + f4, (iDp * 2) + iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else if (iIntValue2 < i5) {
                    float f5 = i9 + f4;
                    int i15 = i14 * 2;
                    this.rect.set(f5, iDp3, i15 + f5, i15 + iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                }
                iDp3 += iDp6;
                if (i10 == i13 || iIntValue2 >= iIntValue3) {
                    f2 = 3.0f;
                } else {
                    f2 = 3.0f;
                    iDp3 -= AndroidUtilities.dp(3.0f);
                    iDp6 -= AndroidUtilities.dp(3.0f);
                }
                if (i10 != 0 && iIntValue2 < i2) {
                    i2 = i5;
                    iDp3 -= AndroidUtilities.dp(f2);
                    iDp6 -= AndroidUtilities.dp(f2);
                }
                i2 = i5;
                this.lineHeights.add(Integer.valueOf(iDp6));
                if (i10 == i13 || iIntValue2 > iIntValue3) {
                    this.rect.set((f4 - iDp4) - iDp, iDp3 - (iDp * 2), f4 + i9, iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (iIntValue2 < iIntValue3) {
                    float f6 = f4 + i9;
                    int i16 = i14 * 2;
                    this.rect.set(f6, iDp3 - i16, i16 + f6, iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i10++;
                i5 = iIntValue2;
                iDp5 = i12;
                themedPaint2 = themedPaint2;
                themedPaint = themedPaint;
                i11 = lineBottom;
                f3 = f3;
                measuredWidth = measuredWidth;
                lineCount = lineCount;
            }
            paint = themedPaint;
            paint2 = themedPaint2;
            int i17 = measuredWidth;
            float f7 = f3;
            int i18 = iDp5;
            int i19 = lineCount - 1;
            int i20 = i19;
            while (i20 >= 0) {
                int iIntValue4 = i20 != 0 ? ((Integer) this.lineWidths.get(i20 - 1)).intValue() : 0;
                int iIntValue5 = ((Integer) this.lineWidths.get(i20)).intValue();
                int iIntValue6 = i20 != i19 ? ((Integer) this.lineWidths.get(i20 + 1)).intValue() : 0;
                this.textLayout.getLineBottom(i20);
                float f8 = i17 - (iIntValue5 / 2);
                int i21 = (i20 == i19 || iIntValue5 >= iIntValue6 || i20 == 0 || iIntValue5 >= iIntValue4) ? iDp2 : i18;
                if (i20 == i19 || iIntValue5 > iIntValue6) {
                    this.rect.set(f8 - i9, iDp3 - (iDp * 2), iDp4 + f8 + iDp, iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (iIntValue5 < iIntValue6) {
                    float f9 = f8 - i9;
                    int i22 = i21 * 2;
                    this.rect.set(f9 - i22, iDp3 - i22, f9, iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                iDp3 -= ((Integer) this.lineHeights.get(i20)).intValue();
                if (i20 == 0 || iIntValue5 > iIntValue4) {
                    this.rect.set(f8 - i9, iDp3, f8 + iDp4 + iDp, (iDp * 2) + iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (iIntValue5 < iIntValue4) {
                    float f10 = f8 - i9;
                    int i23 = i21 * 2;
                    this.rect.set(f10 - i23, iDp3, f10, i23 + iDp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i20--;
            }
            this.backgroundPath.close();
            if (isMessageActionSuggestedPostApproval() && !isNewStyleButtonLayout()) {
                this.rect.left = (f7 - (this.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                RectF rectF = this.rect;
                rectF.top = iDp3;
                rectF.right = f7 + (this.textWidth / 2.0f) + AndroidUtilities.dp(17.0f);
                this.rect.bottom = iDp3 + this.textHeight + this.titleHeight + AndroidUtilities.dp(28.0f);
                this.backgroundPath.reset();
                this.backgroundPath.addRoundRect(this.rect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                this.backgroundPath.close();
            }
        } else {
            paint = themedPaint;
            paint2 = themedPaint2;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        if (z && (getAlpha() != 1.0f || isFloating())) {
            alpha = paint.getAlpha();
            alpha2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (alpha * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
            paint3 = paint2;
            paint3.setAlpha((int) (alpha2 * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
        } else {
            paint3 = paint2;
            paint4 = paint;
            if (isFloating()) {
                alpha = paint4.getAlpha();
                alpha2 = paint3.getAlpha();
                paint4.setAlpha((int) (alpha * (isFloating() ? 0.75f : 1.0f)));
                paint3.setAlpha((int) (alpha2 * (isFloating() ? 0.75f : 1.0f)));
            } else {
                alpha = -1;
                alpha2 = -1;
            }
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isRepostPreview) {
            canvas2 = canvas;
            canvas2.drawPath(this.backgroundPath, paint4);
            if (hasGradientService() && paint3.getAlpha() > 0) {
                canvas2.drawPath(this.backgroundPath, paint3);
            }
            fDp = 0.0f;
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
            fDp = 0.0f;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (this.starGiftLayout.has()) {
            float width = this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f);
            float width2 = (getWidth() - width) / 2.0f;
            if (!this.starGiftLayout.repost) {
                fDp = this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(width2, fDp, width + width2, this.starGiftLayout.getHeight() + fDp + AndroidUtilities.dp(8.0f));
            if (this.backgroundRect == null) {
                this.backgroundRect = new RectF();
            }
            this.backgroundRect.set(rectF2);
            canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
            if (hasGradientService()) {
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
            }
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                float fWidth = suggestBirthdayActionLayout.width();
                float fHeight = this.birthdayLayout.height();
                float width3 = (getWidth() - fWidth) / 2.0f;
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(width3, AndroidUtilities.dp(4.0f), fWidth + width3, AndroidUtilities.dp(4.0f) + fHeight);
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (hasGradientService()) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (isButtonLayout(messageObject2)) {
                float width4 = (getWidth() - this.giftRectSize) / 2.0f;
                float f11 = this.textY + this.textHeight;
                if (isNewStyleButtonLayout()) {
                    float fDp2 = f11 + AndroidUtilities.dp(4.0f);
                    AndroidUtilities.rectTmp.set(width4, fDp2, this.giftRectSize + width4, this.backgroundRectHeight + fDp2);
                } else {
                    float fDp3 = f11 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f12 = this.giftRectSize;
                    rectF3.set(width4, fDp3, width4 + f12, f12 + fDp3 + this.giftPremiumAdditionalHeight);
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
                    float fDp4 = AndroidUtilities.dp(6.0f);
                    fArr[7] = fDp4;
                    fArr[6] = fDp4;
                    fArr[5] = fDp4;
                    fArr[4] = fDp4;
                    this.backgroundPath2.rewind();
                    this.backgroundPath2.addRoundRect(this.backgroundRect, this.radii, Path.Direction.CW);
                    canvas2.drawPath(this.backgroundPath2, paint4);
                    if (hasGradientService()) {
                        canvas2.drawPath(this.backgroundPath2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (hasGradientService()) {
                        canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                }
            }
        }
        if (alpha >= 0) {
            paint4.setAlpha(alpha);
            paint3.setAlpha(alpha2);
        }
    }

    private void drawBotButtons(Canvas canvas, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        float f = 4.0f;
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
            float fDp3 = ((AndroidUtilities.dp(f) + fDp2) * i) + width;
            float f2 = fDp3 + fDp2;
            this.rect.set(fDp3, fDp, f2, botButton.height + fDp);
            canvas.save();
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.rect.centerX(), this.rect.centerY());
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
                drawable.setBounds((int) fDp3, i2, (int) f2, botButton.height + i2);
                botButton.selectorDrawable.setAlpha(255);
                botButton.selectorDrawable.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            int iDp = botButton.iconDrawable != null ? AndroidUtilities.dp(26.0f) : 0;
            float f3 = iDp;
            float width2 = fDp3 + (((fDp2 - (botButton.title.getWidth() + (botButton.iconDrawable != null ? AndroidUtilities.dp(f) : 0))) - f3) / 2.0f);
            Drawable drawable2 = botButton.iconDrawable;
            if (drawable2 != null) {
                int i3 = (int) width2;
                drawable2.setBounds(i3, (int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp), i3 + AndroidUtilities.dp(24.0f), ((int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp)) + AndroidUtilities.dp(24.0f));
                botButton.iconDrawable.setAlpha(botButton.isLocked ? 128 : 255);
                botButton.iconDrawable.draw(canvas);
                width2 += f3;
            }
            botButton.title.ellipsize(Math.max(1, (((int) fDp2) - AndroidUtilities.dp(15.0f)) - iDp));
            botButton.title.draw(canvas, width2, (AndroidUtilities.dp(40.0f) / 2.0f) + fDp, botButton.isLocked ? 0.5f : 1.0f);
            canvas.restore();
            canvas.restore();
            i++;
            f = 4.0f;
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
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.pressedBotButton == -1) {
                return false;
            }
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
        if (motionEvent.getAction() != 3 || (i = this.pressedBotButton) == -1) {
            return false;
        }
        BotButton botButton3 = (BotButton) this.botButtons.get(i);
        Drawable drawable2 = botButton3.selectorDrawable;
        if (drawable2 != null) {
            drawable2.setState(StateSet.NOTHING);
        }
        botButton3.setPressed(false);
        this.pressedBotButton = -1;
        invalidateOutbounds();
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
                    this.f$0.lambda$didPressCustomBotButton$8(baseFragment);
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
                        this.f$0.lambda$didPressCustomBotButton$9(tL_messageActionNoForwardsRequest);
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
                        this.f$0.lambda$didPressCustomBotButton$10(tL_messageActionNoForwardsRequest2);
                    }
                });
            }
        }
    }

    public void lambda$didPressCustomBotButton$8(final BaseFragment baseFragment) {
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = getMessageObject().getId();
        tL_resolveStarGiftOffer.decline = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$didPressCustomBotButton$7(baseFragment, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$didPressCustomBotButton$7(final BaseFragment baseFragment, TLRPC.Updates updates, final TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell.lambda$didPressCustomBotButton$6(baseFragment, tL_error);
                }
            });
        }
    }

    public static void lambda$didPressCustomBotButton$6(BaseFragment baseFragment, TLRPC.TL_error tL_error) {
        BulletinFactory.of(baseFragment).showForError(tL_error);
    }

    public void lambda$didPressCustomBotButton$9(TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest) {
        MessagesController.getInstance(this.currentAccount).toggleChatNoForwards(this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
    }

    public void lambda$didPressCustomBotButton$10(TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest) {
        MessagesController.getInstance(this.currentAccount).toggleChatNoForwards(this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.new_value, null);
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
        Theme.ResourcesProvider resourcesProvider;
        return this.overrideBackgroundPaint == null && ((resourcesProvider = this.themeDelegate) == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService());
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
        int i;
        return messageObject != null && ((i = messageObject.type) == 30 || i == 18 || i == 25 || isNewStyleButtonLayout());
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
