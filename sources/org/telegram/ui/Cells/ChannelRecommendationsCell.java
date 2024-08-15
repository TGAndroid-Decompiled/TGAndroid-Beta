package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.Text;
public class ChannelRecommendationsCell {
    private ChatMessageCell cell;
    private float channelsScrollWidth;
    public long chatId;
    private final ButtonBounce closeBounce;
    private int currentAccount;
    private TLRPC$Chat currentChat;
    private long dialogId;
    private Text headerText;
    private final AnimatedFloat loadingAlpha;
    private LoadingDrawable loadingDrawable;
    private Runnable longPressRunnable;
    private ChannelBlock longPressedBlock;
    private float lx;
    private float ly;
    private boolean maybeScrolling;
    private MessageObject msg;
    private float scrollX;
    private final Scroller scroller;
    private boolean scrolling;
    private StaticLayout serviceText;
    private int serviceTextHeight;
    private float serviceTextLeft;
    private float serviceTextRight;
    private VelocityTracker velocityTracker;
    private final TextPaint serviceTextPaint = new TextPaint(1);
    private final Paint backgroundPaint = new Paint(1);
    private final Path backgroundPath = new Path();
    private float lastBackgroundPathExpandT = -1.0f;
    private int blockWidth = AndroidUtilities.dp(66.0f);
    private final ArrayList<ChannelBlock> channels = new ArrayList<>();
    private final Path loadingPath = new Path();
    private final RectF backgroundBounds = new RectF();
    private final RectF closeBounds = new RectF();
    private final Paint closePaint = new Paint(1);
    private boolean loading = true;

    public ChannelRecommendationsCell(ChatMessageCell chatMessageCell) {
        this.cell = chatMessageCell;
        this.scroller = new Scroller(chatMessageCell.getContext());
        this.closeBounce = new ButtonBounce(chatMessageCell);
        this.loadingAlpha = new AnimatedFloat(chatMessageCell, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public void setMessageObject(MessageObject messageObject) {
        StaticLayout staticLayout;
        int i;
        int i2;
        this.currentAccount = messageObject.currentAccount;
        this.msg = messageObject;
        this.dialogId = messageObject.getDialogId();
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        this.chatId = -this.dialogId;
        this.serviceTextPaint.setTypeface(AndroidUtilities.bold());
        this.serviceTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.serviceTextPaint.setColor(this.cell.getThemedColor(Theme.key_chat_serviceText));
        this.serviceText = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), this.serviceTextPaint, this.msg.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.serviceTextLeft = staticLayout.getWidth();
        this.serviceTextRight = 0.0f;
        for (int i3 = 0; i3 < this.serviceText.getLineCount(); i3++) {
            this.serviceTextLeft = Math.min(this.serviceTextLeft, this.serviceText.getLineLeft(i3));
            this.serviceTextRight = Math.max(this.serviceTextRight, this.serviceText.getLineRight(i3));
        }
        this.serviceTextHeight = this.serviceText.getHeight();
        this.closePaint.setStyle(Paint.Style.STROKE);
        this.closePaint.setStrokeCap(Paint.Cap.ROUND);
        this.closePaint.setStrokeJoin(Paint.Join.ROUND);
        this.closePaint.setColor(this.cell.getThemedColor(Theme.key_dialogEmptyImage));
        this.cell.totalHeight = AndroidUtilities.dp(14.66f) + this.serviceTextHeight;
        if (this.headerText == null) {
            this.headerText = new Text(LocaleController.getString(R.string.SimilarChannels), 14.0f, AndroidUtilities.bold()).hackClipBounds();
        }
        for (int i4 = 0; i4 < this.channels.size(); i4++) {
            this.channels.get(i4).detach();
        }
        this.channels.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(-this.dialogId);
        ArrayList arrayList = (channelRecommendations == null || channelRecommendations.chats == null) ? new ArrayList() : new ArrayList(channelRecommendations.chats);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            if (!ChatObject.isNotInChat((TLRPC$Chat) arrayList.get(i5))) {
                arrayList.remove(i5);
                i5--;
            }
            i5++;
        }
        boolean z = arrayList.isEmpty() || (!UserConfig.getInstance(this.currentAccount).isPremium() && arrayList.size() == 1);
        this.loading = z;
        if (!z) {
            int size = arrayList.size();
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.currentAccount).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i6 = 0; i6 < min; i6++) {
                this.channels.add(new ChannelBlock(this.currentAccount, this.cell, (TLRPC$Chat) arrayList.get(i6)));
            }
            if (min < arrayList.size()) {
                TLRPC$Chat[] tLRPC$ChatArr = new TLRPC$Chat[3];
                TLRPC$Chat tLRPC$Chat = null;
                tLRPC$ChatArr[0] = (min < 0 || min >= arrayList.size()) ? null : (TLRPC$Chat) arrayList.get(min);
                tLRPC$ChatArr[1] = (min < 0 || (i2 = min + 1) >= arrayList.size()) ? null : (TLRPC$Chat) arrayList.get(i2);
                if (min >= 0 && (i = min + 2) < arrayList.size()) {
                    tLRPC$Chat = (TLRPC$Chat) arrayList.get(i);
                }
                tLRPC$ChatArr[2] = tLRPC$Chat;
                this.channels.add(new ChannelBlock(this.currentAccount, this.cell, tLRPC$ChatArr, (arrayList.size() + channelRecommendations.more) - min));
            }
        }
        if (isExpanded()) {
            this.cell.totalHeight += AndroidUtilities.dp(144.0f);
            this.backgroundPaint.setColor(this.cell.getThemedColor(Theme.key_chat_inBubble));
        }
        float size2 = (this.blockWidth * this.channels.size()) + (AndroidUtilities.dp(9.0f) * (this.channels.size() - 1));
        this.channelsScrollWidth = size2;
        this.scrollX = Utilities.clamp(this.scrollX, size2, 0.0f);
    }

    public boolean isExpanded() {
        return this.msg.channelJoinedExpanded && this.channels.size() > 0;
    }

    public void update() {
        MessageObject messageObject = this.msg;
        if (messageObject == null) {
            return;
        }
        setMessageObject(messageObject);
        this.cell.invalidateOutbounds();
    }

    public void onAttachedToWindow() {
        for (int i = 0; i < this.channels.size(); i++) {
            this.channels.get(i).attach();
        }
    }

    public void onDetachedFromWindow() {
        for (int i = 0; i < this.channels.size(); i++) {
            this.channels.get(i).detach();
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        int dp;
        if (this.msg == null || this.cell == null) {
            return;
        }
        computeScroll();
        if (this.serviceText != null) {
            canvas.save();
            float width = (this.cell.getWidth() - this.serviceText.getWidth()) / 2.0f;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((this.serviceTextLeft + width) - AndroidUtilities.dp(8.66f), AndroidUtilities.dp(4.0f), this.serviceTextRight + width + AndroidUtilities.dp(8.66f), AndroidUtilities.dp(10.66f) + this.serviceTextHeight);
            this.cell.drawServiceBackground(canvas, rectF, AndroidUtilities.dp(11.0f), 1.0f);
            canvas.translate(width, AndroidUtilities.dp(7.33f));
            this.serviceText.draw(canvas);
            canvas.restore();
            f = AndroidUtilities.dp(10.66f) + this.serviceTextHeight + 0.0f;
        } else {
            f = 0.0f;
        }
        if (this.cell.transitionParams.animateRecommendationsExpanded) {
            if (isExpanded()) {
                f2 = this.cell.transitionParams.animateChangeProgress;
            } else {
                f2 = 1.0f - this.cell.transitionParams.animateChangeProgress;
            }
        } else {
            f2 = isExpanded() ? 1.0f : 0.0f;
        }
        float clamp = Utilities.clamp((f2 - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int width2 = this.cell.getWidth() - AndroidUtilities.dp(18.0f);
            this.blockWidth = (int) (width2 > AndroidUtilities.dp(441.0f) ? AndroidUtilities.dp(66.0f) : Math.max((width2 / 4.5f) - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(66.0f)));
            this.channelsScrollWidth = (dp * this.channels.size()) + (AndroidUtilities.dp(9.0f) * (this.channels.size() - 1));
            int min = (int) Math.min(width2, this.blockWidth * 6.5f);
            this.backgroundBounds.set((this.cell.getWidth() - min) / 2.0f, AndroidUtilities.dp(10.0f) + f, (this.cell.getWidth() + min) / 2.0f, f + AndroidUtilities.dp(138.0f));
            this.scrollX = Utilities.clamp(this.scrollX, this.channelsScrollWidth - (this.backgroundBounds.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            checkBackgroundPath(clamp);
            canvas.save();
            float f3 = (0.6f * clamp) + 0.4f;
            canvas.scale(f3, f3, this.backgroundBounds.centerX(), this.backgroundBounds.top - AndroidUtilities.dp(6.0f));
            this.backgroundPaint.setAlpha((int) (clamp * 255.0f));
            this.backgroundPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), ColorUtils.setAlphaComponent(-16777216, (int) (27.0f * clamp)));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
            canvas.clipPath(this.backgroundPath);
            Text text = this.headerText;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(17.0f) + this.backgroundBounds.left, AndroidUtilities.dp(20.0f) + this.backgroundBounds.top, this.cell.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), clamp);
            }
            float f4 = this.loadingAlpha.set(this.loading);
            float dp2 = (this.backgroundBounds.left + AndroidUtilities.dp(7.0f)) - this.scrollX;
            float dp3 = this.blockWidth + AndroidUtilities.dp(9.0f);
            int floor = (int) Math.floor(((this.backgroundBounds.left - min) - dp2) / dp3);
            int ceil = (int) Math.ceil((this.backgroundBounds.right - dp2) / dp3);
            if (f4 < 1.0f) {
                for (int max = Math.max(0, floor); max < Math.min(ceil + 1, this.channels.size()); max++) {
                    ChannelBlock channelBlock = this.channels.get(max);
                    canvas.save();
                    canvas.translate((max * dp3) + dp2, this.backgroundBounds.bottom - ChannelBlock.height());
                    float f5 = (1.0f - f4) * clamp;
                    channelBlock.draw(canvas, this.blockWidth, f5);
                    channelBlock.drawText(canvas, this.blockWidth, f5);
                    canvas.restore();
                }
            }
            if (f4 > 0.0f) {
                this.loadingPath.rewind();
                for (int max2 = Math.max(0, floor); max2 < ceil; max2++) {
                    ChannelBlock.fillPath(this.loadingPath, this.blockWidth, (max2 * dp3) + dp2);
                }
                if (this.loadingDrawable == null) {
                    LoadingDrawable loadingDrawable = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable;
                    loadingDrawable.usePath(this.loadingPath);
                    this.loadingDrawable.setAppearByGradient(false);
                }
                int themedColor = this.cell.getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
                this.loadingDrawable.setColors(Theme.multAlpha(themedColor, 0.05f), Theme.multAlpha(themedColor, 0.15f), Theme.multAlpha(themedColor, 0.1f), Theme.multAlpha(themedColor, 0.3f));
                this.loadingDrawable.setGradientScale(1.5f);
                this.loadingDrawable.setAlpha((int) (f4 * 255.0f));
                canvas.save();
                canvas.translate(0.0f, this.backgroundBounds.bottom - ChannelBlock.height());
                this.loadingDrawable.draw(canvas);
                canvas.restore();
            }
            float scale = this.closeBounce.getScale(0.02f);
            float dp4 = this.backgroundBounds.right - AndroidUtilities.dp(20.0f);
            float dp5 = this.backgroundBounds.top + AndroidUtilities.dp(20.0f);
            canvas.save();
            canvas.scale(scale, scale, dp4, dp5);
            this.closePaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
            canvas.drawLine(dp4 - AndroidUtilities.dp(4.0f), dp5 - AndroidUtilities.dp(4.0f), dp4 + AndroidUtilities.dp(4.0f), dp5 + AndroidUtilities.dp(4.0f), this.closePaint);
            canvas.drawLine(dp4 - AndroidUtilities.dp(4.0f), dp5 + AndroidUtilities.dp(4.0f), dp4 + AndroidUtilities.dp(4.0f), dp5 - AndroidUtilities.dp(4.0f), this.closePaint);
            this.closeBounds.set(dp4 - AndroidUtilities.dp(12.0f), dp5 - AndroidUtilities.dp(12.0f), dp4 + AndroidUtilities.dp(12.0f), dp5 + AndroidUtilities.dp(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    private void checkBackgroundPath(float f) {
        if (Math.abs(f - this.lastBackgroundPathExpandT) < 0.001f) {
            return;
        }
        float dp = AndroidUtilities.dp(16.66f) * 2.0f;
        float f2 = this.backgroundBounds.bottom;
        this.backgroundPath.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        RectF rectF2 = this.backgroundBounds;
        float f3 = rectF2.left;
        float f4 = rectF2.top;
        rectF.set(f3, f4, f3 + dp, f4 + dp);
        this.backgroundPath.arcTo(rectF, -90.0f, -90.0f);
        float f5 = this.backgroundBounds.left;
        float f6 = f2 - dp;
        rectF.set(f5, f6, f5 + dp, f2);
        this.backgroundPath.arcTo(rectF, -180.0f, -90.0f);
        float f7 = this.backgroundBounds.right;
        rectF.set(f7 - dp, f6, f7, f2);
        this.backgroundPath.arcTo(rectF, -270.0f, -90.0f);
        RectF rectF3 = this.backgroundBounds;
        float f8 = rectF3.right;
        float f9 = rectF3.top;
        rectF.set(f8 - dp, f9, f8, dp + f9);
        this.backgroundPath.arcTo(rectF, 0.0f, -90.0f);
        this.backgroundPath.lineTo(this.backgroundBounds.centerX() + AndroidUtilities.dp(8.0f), this.backgroundBounds.top);
        this.backgroundPath.lineTo(this.backgroundBounds.centerX(), this.backgroundBounds.top - AndroidUtilities.dp(6.0f));
        this.backgroundPath.lineTo(this.backgroundBounds.centerX() - AndroidUtilities.dp(8.0f), this.backgroundBounds.top);
        this.backgroundPath.close();
    }

    public static class ChannelBlock {
        public final AvatarDrawable[] avatarDrawable;
        public final ImageReceiver[] avatarImageReceiver;
        public final ButtonBounce bounce;
        private final ChatMessageCell cell;
        public final TLRPC$Chat chat;
        public final boolean isLock;
        private final CharSequence name;
        private StaticLayout nameText;
        private final TextPaint nameTextPaint;
        private final Paint subscribersBackgroundDimPaint;
        private final Paint subscribersBackgroundPaint;
        private int subscribersBackgroundPaintBitmapHeight;
        private int subscribersBackgroundPaintBitmapWidth;
        private Matrix subscribersBackgroundPaintMatrix;
        private BitmapShader subscribersBackgroundPaintShader;
        private boolean subscribersColorSet;
        private boolean subscribersColorSetFromThumb;
        private final Drawable subscribersDrawable;
        private final Paint subscribersStrokePaint;
        private final Text subscribersText;

        public static int height() {
            return AndroidUtilities.dp(99.0f);
        }

        public static int avatarSize() {
            return AndroidUtilities.dp(54.0f);
        }

        public ChannelBlock(int i, final ChatMessageCell chatMessageCell, TLRPC$Chat[] tLRPC$ChatArr, int i2) {
            TLRPC$Chat tLRPC$Chat;
            this.nameTextPaint = new TextPaint(1);
            this.subscribersStrokePaint = new Paint(1);
            this.subscribersBackgroundPaint = new Paint(1);
            this.subscribersBackgroundDimPaint = new Paint(1);
            this.cell = chatMessageCell;
            this.chat = tLRPC$ChatArr[0];
            this.bounce = new ButtonBounce(chatMessageCell) {
                @Override
                public void invalidate() {
                    chatMessageCell.invalidateOutbounds();
                }
            };
            this.avatarImageReceiver = new ImageReceiver[3];
            this.avatarDrawable = new AvatarDrawable[3];
            for (int i3 = 0; i3 < 3; i3++) {
                this.avatarImageReceiver[i3] = new ImageReceiver(chatMessageCell);
                this.avatarImageReceiver[i3].setParentView(chatMessageCell);
                this.avatarImageReceiver[i3].setRoundRadius(avatarSize());
                this.avatarDrawable[i3] = new AvatarDrawable();
                if (i3 < tLRPC$ChatArr.length && (tLRPC$Chat = tLRPC$ChatArr[i3]) != null) {
                    this.avatarDrawable[i3].setInfo(i, tLRPC$Chat);
                    this.avatarImageReceiver[i3].setForUserOrChat(tLRPC$ChatArr[i3], this.avatarDrawable[i3]);
                } else {
                    final Paint paint = new Paint(1);
                    final int blendOver = Theme.blendOver(chatMessageCell.getThemedColor(Theme.key_chat_inBubble), Theme.multAlpha(chatMessageCell.getThemedColor(Theme.key_windowBackgroundWhiteGrayText), 0.5f));
                    paint.setColor(blendOver);
                    this.avatarImageReceiver[i3].setImageBitmap(new Drawable() {
                        @Override
                        public int getOpacity() {
                            return -2;
                        }

                        @Override
                        public void draw(Canvas canvas) {
                            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                        }

                        @Override
                        public void setAlpha(int i4) {
                            paint.setAlpha(Theme.multAlpha(blendOver, i4 / 255.0f));
                        }

                        @Override
                        public void setColorFilter(ColorFilter colorFilter) {
                            paint.setColorFilter(colorFilter);
                        }
                    });
                }
            }
            if (chatMessageCell.isCellAttachedToWindow()) {
                attach();
            }
            this.nameTextPaint.setTextSize(AndroidUtilities.dp(11.0f));
            boolean isPremium = UserConfig.getInstance(chatMessageCell.currentAccount).isPremium();
            this.name = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
            this.subscribersStrokePaint.setStyle(Paint.Style.STROKE);
            this.isLock = true;
            this.subscribersDrawable = isPremium ? null : chatMessageCell.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            TLRPC$Chat tLRPC$Chat2 = this.chat;
            if (tLRPC$Chat2 == null || tLRPC$Chat2.participants_count <= 1) {
                this.subscribersText = null;
                return;
            }
            this.subscribersText = new Text("+" + i2, 9.33f, AndroidUtilities.bold());
        }

        private void checkNameText(int i) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder maxLines;
            StaticLayout.Builder ellipsize;
            StaticLayout.Builder breakStrategy;
            StaticLayout.Builder alignment;
            StaticLayout build;
            StaticLayout staticLayout = this.nameText;
            if (staticLayout == null || staticLayout.getWidth() != i) {
                if (Build.VERSION.SDK_INT >= 23) {
                    CharSequence charSequence = this.name;
                    obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.nameTextPaint, i);
                    maxLines = obtain.setMaxLines(2);
                    ellipsize = maxLines.setEllipsize(TextUtils.TruncateAt.END);
                    breakStrategy = ellipsize.setBreakStrategy(0);
                    alignment = breakStrategy.setAlignment(Layout.Alignment.ALIGN_CENTER);
                    build = alignment.build();
                    this.nameText = build;
                    return;
                }
                this.nameText = StaticLayoutEx.createStaticLayout(this.name, this.nameTextPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i - AndroidUtilities.dp(16.0f), 2, false);
            }
        }

        public ChannelBlock(int i, final ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat) {
            int i2;
            TextPaint textPaint = new TextPaint(1);
            this.nameTextPaint = textPaint;
            this.subscribersStrokePaint = new Paint(1);
            this.subscribersBackgroundPaint = new Paint(1);
            this.subscribersBackgroundDimPaint = new Paint(1);
            this.cell = chatMessageCell;
            this.chat = tLRPC$Chat;
            this.bounce = new ButtonBounce(chatMessageCell) {
                @Override
                public void invalidate() {
                    chatMessageCell.invalidateOutbounds();
                }
            };
            this.avatarImageReceiver = r2;
            ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
            ImageReceiver[] imageReceiverArr = {imageReceiver};
            imageReceiver.setParentView(chatMessageCell);
            imageReceiverArr[0].setRoundRadius(avatarSize());
            if (chatMessageCell.isCellAttachedToWindow()) {
                attach();
            }
            this.avatarDrawable = r3;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            AvatarDrawable[] avatarDrawableArr = {avatarDrawable};
            avatarDrawable.setInfo(i, tLRPC$Chat);
            imageReceiverArr[0].setForUserOrChat(tLRPC$Chat, avatarDrawableArr[0]);
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            String str = tLRPC$Chat != null ? tLRPC$Chat.title : "";
            try {
                str = Emoji.replaceEmoji(str, textPaint.getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            this.name = str;
            this.subscribersStrokePaint.setStyle(Paint.Style.STROKE);
            this.isLock = false;
            this.subscribersDrawable = chatMessageCell.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
            if (tLRPC$Chat == null || (i2 = tLRPC$Chat.participants_count) <= 1) {
                this.subscribersText = null;
            } else {
                this.subscribersText = new Text(LocaleController.formatShortNumber(i2, null), 9.33f, AndroidUtilities.bold());
            }
        }

        public void drawText(Canvas canvas, int i, float f) {
            TextPaint textPaint;
            canvas.save();
            float scale = this.bounce.getScale(0.075f);
            float f2 = i;
            canvas.scale(scale, scale, f2 / 2.0f, height() / 2.0f);
            checkNameText(i);
            if (this.nameText != null) {
                canvas.save();
                canvas.translate((i - this.nameText.getWidth()) / 2.0f, AndroidUtilities.dp(66.33f));
                if (this.avatarImageReceiver.length <= 1) {
                    this.nameTextPaint.setColor(this.cell.getThemedColor(Theme.key_chat_messageTextIn));
                } else {
                    this.nameTextPaint.setColor(this.cell.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                }
                this.nameTextPaint.setAlpha((int) (textPaint.getAlpha() * f));
                this.nameText.draw(canvas);
                canvas.restore();
            }
            Text text = this.subscribersText;
            if (text != null) {
                text.ellipsize(i - AndroidUtilities.dp(32.0f));
                float dp = (f2 - (AndroidUtilities.dp(this.subscribersDrawable != null ? 17.0f : 8.0f) + this.subscribersText.getWidth())) / 2.0f;
                float dp2 = AndroidUtilities.dp(4.165f) + avatarSize();
                Drawable drawable = this.subscribersDrawable;
                if (drawable != null) {
                    drawable.setBounds((int) ((this.isLock ? this.subscribersText.getWidth() + AndroidUtilities.dp(1.33f) : 0.0f) + dp + AndroidUtilities.dp(3.0f)), (int) (dp2 - ((this.subscribersDrawable.getIntrinsicHeight() / 2.0f) * 0.625f)), (int) ((this.isLock ? this.subscribersText.getWidth() + AndroidUtilities.dp(1.33f) : 0.0f) + dp + AndroidUtilities.dp(3.0f) + (this.subscribersDrawable.getIntrinsicWidth() * 0.625f)), (int) (((this.subscribersDrawable.getIntrinsicHeight() / 2.0f) * 0.625f) + dp2));
                    this.subscribersDrawable.draw(canvas);
                }
                this.subscribersText.draw(canvas, dp + AndroidUtilities.dp(!this.isLock ? 12.66f : 4.0f), dp2, -1, f);
            }
            canvas.restore();
        }

        public void draw(Canvas canvas, int i, float f) {
            float[] fArr;
            float f2;
            float[] fArr2;
            float f3;
            canvas.save();
            float scale = this.bounce.getScale(0.075f);
            float f4 = i;
            float f5 = f4 / 2.0f;
            canvas.scale(scale, scale, f5, height() / 2.0f);
            this.subscribersStrokePaint.setStrokeWidth(AndroidUtilities.dp(2.66f));
            this.subscribersStrokePaint.setColor(this.cell.getThemedColor(Theme.key_chat_inBubble));
            for (int length = this.avatarImageReceiver.length - 1; length >= 0; length--) {
                float dp = (f5 - ((AndroidUtilities.dp(7.0f) * (this.avatarImageReceiver.length - 1)) / 2.0f)) + (AndroidUtilities.dp(7.0f) * length);
                float dp2 = AndroidUtilities.dp(10.0f) + (avatarSize() / 2.0f);
                if (this.avatarImageReceiver.length > 1) {
                    canvas.drawCircle(dp, dp2, avatarSize() / 2.0f, this.subscribersStrokePaint);
                }
                this.avatarImageReceiver[length].setImageCoords(dp - (avatarSize() / 2.0f), dp2 - (avatarSize() / 2.0f), avatarSize(), avatarSize());
                this.avatarImageReceiver[length].setAlpha(f);
                this.avatarImageReceiver[length].draw(canvas);
            }
            Text text = this.subscribersText;
            if (text != null) {
                text.ellipsize(i - AndroidUtilities.dp(32.0f));
                float dp3 = AndroidUtilities.dp(this.subscribersDrawable != null ? 17.0f : 8.0f) + this.subscribersText.getWidth();
                float dp4 = AndroidUtilities.dp(10.0f) + avatarSize() + AndroidUtilities.dp(1.0f);
                AndroidUtilities.rectTmp.set((f4 - dp3) / 2.0f, dp4 - AndroidUtilities.dp(14.33f), (f4 + dp3) / 2.0f, dp4);
                boolean z = this.subscribersColorSet;
                if (!z && this.isLock) {
                    this.subscribersBackgroundPaint.setColor(Theme.blendOver(this.cell.getThemedColor(Theme.key_chat_inBubble), Theme.multAlpha(this.cell.getThemedColor(Theme.key_windowBackgroundWhiteGrayText), 0.85f)));
                    this.subscribersColorSet = true;
                } else if (!z && (this.avatarImageReceiver[0].getStaticThumb() instanceof BitmapDrawable)) {
                    Bitmap bitmap = ((BitmapDrawable) this.avatarImageReceiver[0].getStaticThumb()).getBitmap();
                    try {
                        fArr2 = new float[3];
                        ColorUtils.colorToHSL(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2), fArr2);
                        f3 = fArr2[1];
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (f3 > 0.05f && f3 < 0.95f) {
                        float f6 = fArr2[2];
                        if (f6 > 0.02f && f6 < 0.98f) {
                            fArr2[1] = 0.25f;
                            fArr2[2] = Theme.isCurrentThemeDark() ? 0.35f : 0.65f;
                            this.subscribersBackgroundPaint.setColor(ColorUtils.HSLToColor(fArr2));
                            this.subscribersColorSet = true;
                        }
                    }
                    fArr2[1] = 0.0f;
                    fArr2[2] = Theme.isCurrentThemeDark() ? 0.38f : 0.7f;
                    this.subscribersBackgroundPaint.setColor(ColorUtils.HSLToColor(fArr2));
                    this.subscribersColorSet = true;
                } else if (!this.subscribersColorSet && !this.subscribersColorSetFromThumb) {
                    try {
                        fArr = new float[3];
                        ColorUtils.colorToHSL(ColorUtils.blendARGB(this.avatarDrawable[0].getColor(), this.avatarDrawable[0].getColor2(), 0.5f), fArr);
                        f2 = fArr[1];
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (f2 > 0.05f && f2 < 0.95f) {
                        fArr[1] = Utilities.clamp(f2 - 0.06f, 0.4f, 0.0f);
                        fArr[2] = Utilities.clamp(fArr[2] - 0.08f, 0.5f, 0.2f);
                        this.subscribersBackgroundPaint.setColor(ColorUtils.HSLToColor(fArr));
                        this.subscribersColorSetFromThumb = true;
                    }
                    fArr[2] = Utilities.clamp(fArr[2] - 0.1f, 0.6f, 0.3f);
                    this.subscribersBackgroundPaint.setColor(ColorUtils.HSLToColor(fArr));
                    this.subscribersColorSetFromThumb = true;
                }
                if (this.subscribersBackgroundPaintShader != null) {
                    this.subscribersBackgroundPaintMatrix.reset();
                    this.subscribersBackgroundPaintMatrix.postScale(avatarSize() / this.subscribersBackgroundPaintBitmapWidth, avatarSize() / this.subscribersBackgroundPaintBitmapHeight);
                    RectF rectF = AndroidUtilities.rectTmp;
                    this.subscribersBackgroundPaintMatrix.postTranslate(f5 - (avatarSize() / 2.0f), rectF.bottom - avatarSize());
                    this.subscribersBackgroundPaintShader.setLocalMatrix(this.subscribersBackgroundPaintMatrix);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.subscribersBackgroundPaint);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.subscribersBackgroundDimPaint);
                } else {
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.subscribersBackgroundPaint);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.inset((-AndroidUtilities.dp(1.0f)) / 2.0f, (-AndroidUtilities.dp(1.0f)) / 2.0f);
                this.subscribersStrokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.subscribersStrokePaint);
            }
            canvas.restore();
        }

        public static void fillPath(Path path, int i, float f) {
            float f2 = i;
            path.addCircle((f2 / 2.0f) + f, AndroidUtilities.dp(10.0f) + (avatarSize() / 2.0f), avatarSize() / 2.0f, Path.Direction.CW);
            float f3 = 0.4f * f2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((f2 - f3) / 2.0f) + f, AndroidUtilities.dp(69.0f), ((f3 + f2) / 2.0f) + f, AndroidUtilities.dp(79.0f));
            path.addRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), Path.Direction.CW);
            float f4 = 0.35f * f2;
            rectF.set(((f2 - f4) / 2.0f) + f, AndroidUtilities.dp(83.0f), f + ((f2 + f4) / 2.0f), AndroidUtilities.dp(91.0f));
            path.addRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), Path.Direction.CW);
        }

        public void attach() {
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.avatarImageReceiver;
                if (i >= imageReceiverArr.length) {
                    return;
                }
                imageReceiverArr[i].onAttachedToWindow();
                i++;
            }
        }

        public void detach() {
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.avatarImageReceiver;
                if (i >= imageReceiverArr.length) {
                    return;
                }
                imageReceiverArr[i].onDetachedFromWindow();
                i++;
            }
        }
    }

    public boolean checkTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChannelRecommendationsCell.checkTouchEvent(android.view.MotionEvent):boolean");
    }

    public void lambda$checkTouchEvent$0(ChannelBlock channelBlock) {
        ChannelBlock channelBlock2 = this.longPressedBlock;
        if (channelBlock == channelBlock2) {
            channelBlock2.bounce.setPressed(false);
            ChannelBlock channelBlock3 = this.longPressedBlock;
            if (channelBlock3.isLock) {
                if (this.cell.getDelegate() != null) {
                    this.cell.getDelegate().didPressMoreChannelRecommendations(this.cell);
                }
            } else {
                didClickChannel(channelBlock3.chat, true);
            }
        }
        this.longPressedBlock = null;
        this.longPressRunnable = null;
        this.scrolling = false;
        this.maybeScrolling = false;
        this.closeBounce.setPressed(false);
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    public void didClickClose() {
        if (this.cell.getDelegate() != null) {
            this.cell.getDelegate().didPressChannelRecommendationsClose(this.cell);
        }
    }

    public void didClickChannel(TLRPC$Chat tLRPC$Chat, boolean z) {
        if (this.cell.getDelegate() != null) {
            this.cell.getDelegate().didPressChannelRecommendation(this.cell, tLRPC$Chat, z);
        }
    }

    private void unselectBlocks() {
        for (int i = 0; i < this.channels.size(); i++) {
            this.channels.get(i).bounce.setPressed(false);
        }
    }

    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            float currX = this.scroller.getCurrX();
            this.scrollX = currX;
            this.scrollX = Utilities.clamp(currX, this.channelsScrollWidth - (this.backgroundBounds.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.cell.invalidateOutbounds();
        }
    }

    private void scroll(float f) {
        this.scrollX = Utilities.clamp(this.scrollX + f, this.channelsScrollWidth - (this.backgroundBounds.width() - AndroidUtilities.dp(14.0f)), 0.0f);
        this.cell.invalidateOutbounds();
    }
}
