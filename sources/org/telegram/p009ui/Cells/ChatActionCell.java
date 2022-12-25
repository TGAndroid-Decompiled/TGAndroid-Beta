package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedEmojiSpan;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.Forum.ForumUtilities;
import org.telegram.p009ui.Components.Premium.StarParticlesView;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.TypefaceSpan;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.Components.spoilers.SpoilerEffect;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_premiumGiftOption;
import org.telegram.tgnet.TLRPC$VideoSize;

public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    private static Map<Integer, String> monthsToEmoticon;
    private int TAG;
    private SpannableStringBuilder accessibilityText;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private AvatarDrawable avatarDrawable;
    private int backgroundHeight;
    private Path backgroundPath;
    private boolean canDrawInParent;
    private int currentAccount;
    private MessageObject currentMessageObject;
    private ImageLocation currentVideoLocation;
    private int customDate;
    private CharSequence customText;
    private ChatActionCellDelegate delegate;
    private boolean forceWasUnread;
    private boolean giftButtonPressed;
    private RectF giftButtonRect;
    private TLRPC$VideoSize giftEffectAnimation;
    private StaticLayout giftPremiumButtonLayout;
    private float giftPremiumButtonWidth;
    private StaticLayout giftPremiumSubtitleLayout;
    private StaticLayout giftPremiumTitleLayout;
    private int giftRectSize;
    private TLRPC$Document giftSticker;
    private ImageReceiver.ImageReceiverDelegate giftStickerDelegate;
    private TextPaint giftSubtitlePaint;
    private TextPaint giftTitlePaint;
    private boolean hasReplyMessage;
    private boolean imagePressed;
    private ImageReceiver imageReceiver;
    private boolean invalidateColors;
    private boolean invalidatePath;
    private float lastTouchX;
    private float lastTouchY;
    private ArrayList<Integer> lineHeights;
    private ArrayList<Integer> lineWidths;
    private String overrideBackground;
    private Paint overrideBackgroundPaint;
    private String overrideText;
    private TextPaint overrideTextPaint;
    private URLSpan pressedLink;
    private int previousWidth;
    private RectF rect;
    private View rippleView;
    public List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    private StarParticlesView.Drawable starParticlesDrawable;
    private Path starsPath;
    private int starsSize;
    private int stickerSize;
    private int textHeight;
    private StaticLayout textLayout;
    TextPaint textPaint;
    private int textWidth;
    private int textX;
    private int textXLeft;
    private int textY;
    private ThemeDelegate themeDelegate;
    private float viewTop;
    private boolean visiblePartSet;
    private boolean wasLayout;

    public interface ChatActionCellDelegate {

        public final class CC {
            public static boolean $default$canDrawOutboundsContent(ChatActionCellDelegate chatActionCellDelegate) {
                return true;
            }

            public static void $default$didClickImage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static boolean $default$didLongPress(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, float f, float f2) {
                return false;
            }

            public static void $default$didOpenPremiumGift(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, boolean z) {
            }

            public static void $default$didPressReplyMessage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i) {
            }

            public static BaseFragment $default$getBaseFragment(ChatActionCellDelegate chatActionCellDelegate) {
                return null;
            }

            public static long $default$getDialogId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static int $default$getTopicId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0;
            }

            public static void $default$needOpenInviteLink(ChatActionCellDelegate chatActionCellDelegate, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
            }

            public static void $default$needOpenUserProfile(ChatActionCellDelegate chatActionCellDelegate, long j) {
            }

            public static void $default$needShowEffectOverlay(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize) {
            }
        }

        boolean canDrawOutboundsContent();

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, boolean z);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        BaseFragment getBaseFragment();

        long getDialogId();

        int getTopicId();

        void needOpenInviteLink(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void needOpenUserProfile(long j);

        void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize);
    }

    public interface ThemeDelegate extends Theme.ResourcesProvider {
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

    static {
        HashMap hashMap = new HashMap();
        monthsToEmoticon = hashMap;
        hashMap.put(1, "1⃣");
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
        } else if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i == NotificationCenter.didUpdatePremiumGiftStickers) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null) {
                setMessageObject(messageObject2, true);
            }
        } else if (i == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack) && (messageObject = this.currentMessageObject) != null) {
            setMessageObject(messageObject, true);
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            spoilerEffect.setSuppressUpdates(z);
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
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda2(lottieAnimation));
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
                TLRPC$VideoSize tLRPC$VideoSize = this.giftEffectAnimation;
                if (tLRPC$VideoSize == null || (chatActionCellDelegate = this.delegate) == null) {
                    return;
                }
                chatActionCellDelegate.needShowEffectOverlay(this, this.giftSticker, tLRPC$VideoSize);
                return;
            }
            return;
        }
        lottieAnimation.stop();
        lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public ChatActionCell(Context context, boolean z, ThemeDelegate themeDelegate) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.giftButtonRect = new RectF();
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.lineWidths = new ArrayList<>();
        this.lineHeights = new ArrayList<>();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.giftTitlePaint = new TextPaint(1);
        this.giftSubtitlePaint = new TextPaint(1);
        this.giftStickerDelegate = new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                ChatActionCell.this.lambda$new$0(imageReceiver, z2, z3, z4);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.starsPath = new Path();
        this.canDrawInParent = z;
        this.themeDelegate = themeDelegate;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable();
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.giftTitlePaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.giftSubtitlePaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21"), 7, AndroidUtilities.m35dp(16.0f)));
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
        drawable.f1110k3 = 0.98f;
        drawable.f1109k2 = 0.98f;
        drawable.f1108k1 = 0.98f;
        drawable.paused = false;
        drawable.speedScale = 0.0f;
        drawable.minLifeTime = 750L;
        drawable.randLifeTime = 750;
        drawable.init();
    }

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        String formatDateChat;
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        if (!z) {
            formatDateChat = LocaleController.formatDateChat(i);
        } else if (i == 2147483646) {
            formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", C1010R.string.MessageScheduledUntilOnline);
        } else {
            formatDateChat = LocaleController.formatString("MessageScheduledOn", C1010R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
        }
        this.customDate = i;
        CharSequence charSequence = this.customText;
        if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
            this.customText = formatDateChat;
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
                    ChatActionCell.this.requestLayout();
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

    public void setOverrideColor(String str, String str2) {
        this.overrideBackground = str;
        this.overrideText = str2;
    }

    public void setMessageObject(MessageObject messageObject) {
        setMessageObject(messageObject, false);
    }

    public void setMessageObject(org.telegram.messenger.MessageObject r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Cells.ChatActionCell.setMessageObject(org.telegram.messenger.MessageObject, boolean):void");
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
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
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    protected void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
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
            this.starParticlesDrawable.particles.get(i).lifeTime += System.currentTimeMillis() - this.starParticlesDrawable.pausedTime;
        }
        invalidate();
    }

    @Override
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Cells.ChatActionCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void openPremiumGiftPreview() {
        final TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption = new TLRPC$TL_premiumGiftOption();
        TLRPC$MessageAction tLRPC$MessageAction = this.currentMessageObject.messageOwner.action;
        tLRPC$TL_premiumGiftOption.amount = tLRPC$MessageAction.amount;
        tLRPC$TL_premiumGiftOption.months = tLRPC$MessageAction.months;
        tLRPC$TL_premiumGiftOption.currency = tLRPC$MessageAction.currency;
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftPreview$1(tLRPC$TL_premiumGiftOption);
                }
            });
        }
    }

    public void lambda$openPremiumGiftPreview$1(TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption) {
        this.delegate.didOpenPremiumGift(this, tLRPC$TL_premiumGiftOption, false);
    }

    public void openLink(CharacterStyle characterStyle) {
        if (this.delegate == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.pressedLink;
            if (uRLSpan instanceof URLSpanNoUnderline) {
                TLObject object = ((URLSpanNoUnderline) uRLSpan).getObject();
                if (object instanceof TLRPC$TL_forumTopic) {
                    ForumUtilities.openTopic(this.delegate.getBaseFragment(), -this.delegate.getDialogId(), (TLRPC$TL_forumTopic) object, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.pressedLink;
            if (uRLSpan2 instanceof URLSpanNoUnderline) {
                TLObject object2 = ((URLSpanNoUnderline) uRLSpan2).getObject();
                if (object2 instanceof TLRPC$TL_chatInviteExported) {
                    this.delegate.needOpenInviteLink((TLRPC$TL_chatInviteExported) object2);
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

    private void createLayout(CharSequence charSequence, int i) {
        TextPaint textPaint;
        ChatActionCellDelegate chatActionCellDelegate;
        int m35dp = i - AndroidUtilities.m35dp(30.0f);
        this.invalidatePath = true;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText2");
        } else {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        }
        this.textLayout = new StaticLayout(charSequence, textPaint, m35dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        if (charSequence instanceof Spannable) {
            SpoilerEffect.addSpoilers(this, this.textLayout, (Spannable) charSequence, this.spoilersPool, this.spoilers);
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        this.textHeight = 0;
        this.textWidth = 0;
        try {
            int lineCount = this.textLayout.getLineCount();
            for (int i2 = 0; i2 < lineCount; i2++) {
                try {
                    float lineWidth = this.textLayout.getLineWidth(i2);
                    float f = m35dp;
                    if (lineWidth > f) {
                        lineWidth = f;
                    }
                    this.textHeight = (int) Math.max(this.textHeight, Math.ceil(this.textLayout.getLineBottom(i2)));
                    this.textWidth = (int) Math.max(this.textWidth, Math.ceil(lineWidth));
                } catch (Exception e) {
                    FileLog.m31e(e);
                    return;
                }
            }
        } catch (Exception e2) {
            FileLog.m31e(e2);
        }
        this.textX = (i - this.textWidth) / 2;
        this.textY = AndroidUtilities.m35dp(7.0f);
        this.textXLeft = (i - this.textLayout.getWidth()) / 2;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3;
        int m35dp;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.textHeight + AndroidUtilities.m35dp(14.0f));
            return;
        }
        if (messageObject != null && messageObject.type == 18) {
            int min = Math.min((int) ((AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x) * 0.6f), ((AndroidUtilities.displaySize.y - C1069ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.m35dp(64.0f));
            this.giftRectSize = min;
            this.stickerSize = min - AndroidUtilities.m35dp(106.0f);
        }
        int max = Math.max(AndroidUtilities.m35dp(30.0f), View.MeasureSpec.getSize(i));
        if (this.previousWidth != max) {
            this.wasLayout = true;
            this.previousWidth = max;
            buildLayout();
        }
        int i4 = 0;
        if (messageObject != null) {
            int i5 = messageObject.type;
            if (i5 == 11) {
                i3 = AndroidUtilities.roundMessageSize;
                m35dp = AndroidUtilities.m35dp(10.0f);
            } else if (i5 == 18) {
                i3 = this.giftRectSize;
                m35dp = AndroidUtilities.m35dp(12.0f);
            }
            i4 = i3 + m35dp;
        }
        setMeasuredDimension(max, this.textHeight + i4 + AndroidUtilities.m35dp(14.0f));
        if (messageObject == null || messageObject.type != 18) {
            return;
        }
        float m35dp2 = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + this.stickerSize + AndroidUtilities.m35dp(4.0f) + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.m35dp(4.0f) + this.giftPremiumSubtitleLayout.getHeight();
        float measuredHeight = m35dp2 + ((((getMeasuredHeight() - m35dp2) - this.giftPremiumButtonLayout.getHeight()) - AndroidUtilities.m35dp(8.0f)) / 2.0f);
        float f = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
        this.giftButtonRect.set(f - AndroidUtilities.m35dp(18.0f), measuredHeight - AndroidUtilities.m35dp(8.0f), f + this.giftPremiumButtonWidth + AndroidUtilities.m35dp(18.0f), measuredHeight + this.giftPremiumButtonLayout.getHeight() + AndroidUtilities.m35dp(8.0f));
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        this.starParticlesDrawable.rect.set(this.giftButtonRect);
        this.starParticlesDrawable.rect2.set(this.giftButtonRect);
        if (this.starsSize != measuredWidth) {
            this.starsSize = measuredWidth;
            this.starParticlesDrawable.resetPositions();
        }
    }

    private void buildLayout() {
        CharSequence charSequence;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            charSequence = (this.delegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject)) ? ForumUtilities.createActionTextWithTopic(MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.messageOwner, true)), messageObject) : null;
            if (charSequence == null) {
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                if (tLRPC$Message != null && (tLRPC$MessageMedia = tLRPC$Message.media) != null && tLRPC$MessageMedia.ttl_seconds != 0) {
                    if (tLRPC$MessageMedia.photo instanceof TLRPC$TL_photoEmpty) {
                        charSequence = LocaleController.getString("AttachPhotoExpired", C1010R.string.AttachPhotoExpired);
                    } else if (tLRPC$MessageMedia.document instanceof TLRPC$TL_documentEmpty) {
                        charSequence = LocaleController.getString("AttachVideoExpired", C1010R.string.AttachVideoExpired);
                    } else {
                        charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                    }
                } else {
                    charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                }
            }
        } else {
            charSequence = this.customText;
        }
        createLayout(charSequence, this.previousWidth);
        if (messageObject != null) {
            int i = messageObject.type;
            if (i == 11) {
                int i2 = AndroidUtilities.roundMessageSize;
                this.imageReceiver.setImageCoords((this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f, this.textHeight + AndroidUtilities.m35dp(19.0f), i2, i2);
            } else if (i == 18) {
                createGiftPremiumLayouts(LocaleController.getString(C1010R.string.ActionGiftPremiumTitle), LocaleController.formatString(C1010R.string.ActionGiftPremiumSubtitle, LocaleController.formatPluralString("Months", messageObject.messageOwner.action.months, new Object[0])), LocaleController.getString(C1010R.string.ActionGiftPremiumView), this.giftRectSize);
            }
        }
    }

    private void createGiftPremiumLayouts(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, valueOf.length(), 33);
        this.giftPremiumTitleLayout = new StaticLayout(valueOf, this.giftTitlePaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.giftPremiumSubtitleLayout = new StaticLayout(charSequence2, this.giftSubtitlePaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
        valueOf2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, valueOf2.length(), 33);
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) getThemedPaint("paintChatActionText"), i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.giftPremiumButtonLayout = staticLayout;
        this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
    }

    private float measureLayoutWidth(Layout layout) {
        float f = 0.0f;
        for (int i = 0; i < layout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(layout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    public int getCustomDate() {
        return this.customDate;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        TextPaint textPaint;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 18) {
            int m35dp = this.giftRectSize - AndroidUtilities.m35dp(106.0f);
            this.stickerSize = m35dp;
            this.imageReceiver.setImageCoords((this.previousWidth - m35dp) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), m35dp, m35dp);
            if (this.textPaint != null && (textPaint = this.giftTitlePaint) != null && this.giftSubtitlePaint != null) {
                if (textPaint.getColor() != this.textPaint.getColor()) {
                    this.giftTitlePaint.setColor(this.textPaint.getColor());
                }
                if (this.giftSubtitlePaint.getColor() != this.textPaint.getColor()) {
                    this.giftSubtitlePaint.setColor(this.textPaint.getColor());
                }
            }
        }
        if (messageObject != null && ((i = messageObject.type) == 11 || i == 18)) {
            this.imageReceiver.draw(canvas);
        }
        if (this.textLayout == null) {
            return;
        }
        drawBackground(canvas, false);
        if (this.textPaint != null) {
            canvas.save();
            canvas.translate(this.textXLeft, this.textY);
            if (this.textLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            this.textLayout.draw(canvas);
            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate == null || chatActionCellDelegate.canDrawOutboundsContent()) {
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            canvas.restore();
            for (SpoilerEffect spoilerEffect : this.spoilers) {
                spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                spoilerEffect.draw(canvas);
            }
            canvas.restore();
        }
        if (messageObject == null || messageObject.type != 18) {
            return;
        }
        canvas.save();
        int i2 = this.previousWidth;
        int i3 = this.giftRectSize;
        float f = (i2 - i3) / 2.0f;
        float m35dp2 = this.textY + this.textHeight + (i3 * 0.075f) + this.stickerSize + AndroidUtilities.m35dp(4.0f);
        canvas.translate(f, m35dp2);
        this.giftPremiumTitleLayout.draw(canvas);
        canvas.restore();
        float height = m35dp2 + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.m35dp(4.0f);
        canvas.save();
        canvas.translate(f, height);
        this.giftPremiumSubtitleLayout.draw(canvas);
        canvas.restore();
        float height2 = height + this.giftPremiumSubtitleLayout.getHeight();
        float height3 = height2 + ((((getHeight() - height2) - this.giftPremiumButtonLayout.getHeight()) - AndroidUtilities.m35dp(8.0f)) / 2.0f);
        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), getThemedPaint("paintChatActionBackground"));
        if (hasGradientService()) {
            canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
        }
        this.starsPath.rewind();
        this.starsPath.addRoundRect(this.giftButtonRect, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.starsPath);
        this.starParticlesDrawable.onDraw(canvas);
        if (!this.starParticlesDrawable.paused) {
            invalidate();
        }
        canvas.restore();
        canvas.save();
        canvas.translate(f, height3);
        this.giftPremiumButtonLayout.draw(canvas);
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        int i;
        int i2;
        int i3;
        Paint paint3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        this.textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        String str = this.overrideBackground;
        if (str != null) {
            int themedColor = getThemedColor(str);
            if (this.overrideBackgroundPaint == null) {
                Paint paint4 = new Paint(1);
                this.overrideBackgroundPaint = paint4;
                paint4.setColor(themedColor);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.overrideTextPaint.setTextSize(AndroidUtilities.m35dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(getThemedColor(this.overrideText));
            }
            themedPaint = this.overrideBackgroundPaint;
            this.textPaint = this.overrideTextPaint;
        }
        if (this.invalidatePath) {
            this.invalidatePath = false;
            this.lineWidths.clear();
            int lineCount = this.textLayout.getLineCount();
            int m35dp = AndroidUtilities.m35dp(11.0f);
            int m35dp2 = AndroidUtilities.m35dp(8.0f);
            int i12 = 0;
            for (int i13 = 0; i13 < lineCount; i13++) {
                int ceil = (int) Math.ceil(this.textLayout.getLineWidth(i13));
                if (i13 == 0 || (i11 = i12 - ceil) <= 0 || i11 > m35dp + m35dp2) {
                    i12 = ceil;
                }
                this.lineWidths.add(Integer.valueOf(i12));
            }
            for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                int intValue = this.lineWidths.get(i14).intValue();
                int i15 = i12 - intValue;
                if (i15 <= 0 || i15 > m35dp + m35dp2) {
                    i12 = intValue;
                }
                this.lineWidths.set(i14, Integer.valueOf(i12));
            }
            int m35dp3 = AndroidUtilities.m35dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int m35dp4 = AndroidUtilities.m35dp(3.0f);
            int m35dp5 = AndroidUtilities.m35dp(6.0f);
            int i16 = m35dp - m35dp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f4 = measuredWidth;
            this.backgroundPath.moveTo(f4, m35dp3);
            int i17 = 0;
            int i18 = 0;
            while (i17 < lineCount) {
                int intValue2 = this.lineWidths.get(i17).intValue();
                int lineBottom = this.textLayout.getLineBottom(i17);
                int i19 = m35dp2;
                int i20 = lineCount - 1;
                if (i17 < i20) {
                    paint3 = themedPaint;
                    i4 = this.lineWidths.get(i17 + 1).intValue();
                } else {
                    paint3 = themedPaint;
                    i4 = 0;
                }
                int i21 = lineBottom - i18;
                if (i17 == 0 || intValue2 > i12) {
                    f = 3.0f;
                    i21 += AndroidUtilities.m35dp(3.0f);
                } else {
                    f = 3.0f;
                }
                if (i17 == i20 || intValue2 > i4) {
                    i21 += AndroidUtilities.m35dp(f);
                }
                float f5 = (intValue2 / 2.0f) + f4;
                int i22 = (i17 == i20 || intValue2 >= i4 || i17 == 0 || intValue2 >= i12) ? i19 : m35dp5;
                if (i17 == 0 || intValue2 > i12) {
                    f2 = f4;
                    i5 = lineCount;
                    i6 = i12;
                    i7 = measuredWidth;
                    i8 = lineBottom;
                    this.rect.set((f5 - m35dp4) - m35dp, m35dp3, i16 + f5, (m35dp * 2) + m35dp3);
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else {
                    f2 = f4;
                    if (intValue2 < i12) {
                        i8 = lineBottom;
                        float f6 = i16 + f5;
                        i7 = measuredWidth;
                        i5 = lineCount;
                        i6 = i12;
                        this.rect.set(f6, m35dp3, (i22 * 2) + f6, i10 + m35dp3);
                        this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                    } else {
                        i5 = lineCount;
                        i6 = i12;
                        i7 = measuredWidth;
                        i8 = lineBottom;
                    }
                }
                m35dp3 += i21;
                if (i17 == i20 || intValue2 >= i4) {
                    f3 = 3.0f;
                } else {
                    f3 = 3.0f;
                    m35dp3 -= AndroidUtilities.m35dp(3.0f);
                    i21 -= AndroidUtilities.m35dp(3.0f);
                }
                if (i17 != 0 && intValue2 < i6) {
                    m35dp3 -= AndroidUtilities.m35dp(f3);
                    i21 -= AndroidUtilities.m35dp(f3);
                }
                this.lineHeights.add(Integer.valueOf(i21));
                if (i17 == i20 || intValue2 > i4) {
                    this.rect.set((f5 - m35dp4) - m35dp, m35dp3 - (m35dp * 2), f5 + i16, m35dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (intValue2 < i4) {
                    float f7 = f5 + i16;
                    this.rect.set(f7, m35dp3 - i9, (i22 * 2) + f7, m35dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i17++;
                i12 = intValue2;
                m35dp2 = i19;
                themedPaint = paint3;
                f4 = f2;
                i18 = i8;
                measuredWidth = i7;
                lineCount = i5;
            }
            paint = themedPaint;
            int i23 = m35dp2;
            int i24 = measuredWidth;
            int i25 = lineCount - 1;
            int i26 = i25;
            while (i26 >= 0) {
                int intValue3 = i26 != 0 ? this.lineWidths.get(i26 - 1).intValue() : 0;
                int intValue4 = this.lineWidths.get(i26).intValue();
                int intValue5 = i26 != i25 ? this.lineWidths.get(i26 + 1).intValue() : 0;
                this.textLayout.getLineBottom(i26);
                float f8 = i24 - (intValue4 / 2);
                int i27 = (i26 == i25 || intValue4 >= intValue5 || i26 == 0 || intValue4 >= intValue3) ? i23 : m35dp5;
                if (i26 == i25 || intValue4 > intValue5) {
                    this.rect.set(f8 - i16, m35dp3 - (m35dp * 2), m35dp4 + f8 + m35dp, m35dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (intValue4 < intValue5) {
                    float f9 = f8 - i16;
                    this.rect.set(f9 - (i27 * 2), m35dp3 - i3, f9, m35dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                m35dp3 -= this.lineHeights.get(i26).intValue();
                if (i26 == 0 || intValue4 > intValue3) {
                    this.rect.set(f8 - i16, m35dp3, f8 + m35dp4 + m35dp, (m35dp * 2) + m35dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (intValue4 < intValue3) {
                    float f10 = f8 - i16;
                    this.rect.set(f10 - (i27 * 2), m35dp3, f10, i2 + m35dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i26--;
            }
            this.backgroundPath.close();
        } else {
            paint = themedPaint;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        ThemeDelegate themeDelegate = this.themeDelegate;
        if (themeDelegate != null) {
            themeDelegate.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.m35dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.m35dp(4.0f));
        }
        int i28 = -1;
        if (!z || getAlpha() == 1.0f) {
            paint2 = paint;
            i = -1;
        } else {
            i28 = paint.getAlpha();
            i = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
            paint2 = paint;
            paint2.setAlpha((int) (i28 * getAlpha()));
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (i * getAlpha()));
        }
        canvas.drawPath(this.backgroundPath, paint2);
        if (hasGradientService()) {
            canvas.drawPath(this.backgroundPath, Theme.chat_actionBackgroundGradientDarkenPaint);
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 18) {
            float width = (getWidth() - this.giftRectSize) / 2.0f;
            float m35dp6 = this.textY + this.textHeight + AndroidUtilities.m35dp(12.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            int i29 = this.giftRectSize;
            rectF.set(width, m35dp6, i29 + width, i29 + m35dp6);
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), paint2);
            if (hasGradientService()) {
                canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
        }
        if (i28 >= 0) {
            paint2.setAlpha(i28);
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(i);
        }
    }

    public boolean hasGradientService() {
        ThemeDelegate themeDelegate;
        return this.overrideBackgroundPaint == null && ((themeDelegate = this.themeDelegate) == null ? Theme.hasGradientService() : themeDelegate.hasGradientService());
    }

    @Override
    public void onSuccessDownload(String str) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        TLRPC$PhotoSize tLRPC$PhotoSize = null;
        int i = 0;
        int size = messageObject.photoThumbs.size();
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC$PhotoSize tLRPC$PhotoSize2 = messageObject.photoThumbs.get(i);
            if (tLRPC$PhotoSize2 instanceof TLRPC$TL_photoStrippedSize) {
                tLRPC$PhotoSize = tLRPC$PhotoSize2;
                break;
            }
            i++;
        }
        this.imageReceiver.setImage(this.currentVideoLocation, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharacterStyle[] characterStyleArr;
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
                    {
                        ChatActionCell.this = this;
                    }

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

    private int getThemedColor(String str) {
        ThemeDelegate themeDelegate = this.themeDelegate;
        Integer color = themeDelegate != null ? themeDelegate.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    private Paint getThemedPaint(String str) {
        ThemeDelegate themeDelegate = this.themeDelegate;
        Paint paint = themeDelegate != null ? themeDelegate.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public void drawOutboundsContent(Canvas canvas) {
        canvas.save();
        canvas.translate(this.textXLeft, this.textY);
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }
}
