package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.Text;

public final class ChannelRecommendationsCell {
    public final ChatMessageCell cell;
    public float channelsScrollWidth;
    public long chatId;
    public final ButtonBounce closeBounce;
    public int currentAccount;
    public long dialogId;
    public Text headerText;
    public final AnimatedFloat loadingAlpha;
    public LoadingDrawable loadingDrawable;
    public ChatActionCell$$ExternalSyntheticLambda8 longPressRunnable;
    public ChannelBlock longPressedBlock;
    public float lx;
    public boolean maybeScrolling;
    public MessageObject msg;
    public float scrollX;
    public final Scroller scroller;
    public boolean scrolling;
    public StaticLayout serviceText;
    public int serviceTextHeight;
    public float serviceTextLeft;
    public float serviceTextRight;
    public VelocityTracker velocityTracker;
    public final TextPaint serviceTextPaint = new TextPaint(1);
    public final Paint backgroundPaint = new Paint(1);
    public final Path backgroundPath = new Path();
    public final float lastBackgroundPathExpandT = -1.0f;
    public int blockWidth = AndroidUtilities.dp(66.0f);
    public final ArrayList channels = new ArrayList();
    public final Path loadingPath = new Path();
    public final RectF backgroundBounds = new RectF();
    public final RectF closeBounds = new RectF();
    public final Paint closePaint = new Paint(1);
    public boolean loading = true;

    public ChannelRecommendationsCell(ChatMessageCell chatMessageCell) {
        this.cell = chatMessageCell;
        this.scroller = new Scroller(chatMessageCell.getContext());
        this.closeBounce = new ButtonBounce(chatMessageCell);
        this.loadingAlpha = new AnimatedFloat(chatMessageCell, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public final boolean checkTouchEvent(MotionEvent motionEvent) {
        ChatMessageCell chatMessageCell;
        ArrayList arrayList;
        ChannelBlock channelBlock;
        VelocityTracker velocityTracker;
        boolean z;
        if (this.msg != null && (chatMessageCell = this.cell) != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.backgroundBounds;
            float fDp = (rectF.left + AndroidUtilities.dp(7.0f)) - this.scrollX;
            int i = 0;
            while (true) {
                arrayList = this.channels;
                if (i >= arrayList.size()) {
                    channelBlock = null;
                    break;
                }
                channelBlock = (ChannelBlock) arrayList.get(i);
                if (motionEvent.getX() >= fDp && motionEvent.getX() <= this.blockWidth + fDp && motionEvent.getY() >= rectF.bottom - AndroidUtilities.dp(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                fDp += AndroidUtilities.dp(9.0f) + this.blockWidth;
                i++;
            }
            boolean zContains = this.closeBounds.contains(motionEvent.getX(), motionEvent.getY());
            ButtonBounce buttonBounce = this.closeBounce;
            if (action == 0) {
                this.scroller.abortAnimation();
                if (this.loading) {
                    z = false;
                } else {
                    float x = motionEvent.getX();
                    this.lx = x;
                    if (rectF.contains(x, motionEvent.getY())) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this.maybeScrolling = z;
                if (z && chatMessageCell.getParent() != null) {
                    chatMessageCell.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.scrolling = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                }
                this.velocityTracker = VelocityTracker.obtain();
                if (channelBlock != null) {
                    channelBlock.bounce.setPressed(true);
                }
                if (zContains) {
                    buttonBounce.setPressed(true);
                }
                ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda8 = this.longPressRunnable;
                if (chatActionCell$$ExternalSyntheticLambda8 != null) {
                    AndroidUtilities.cancelRunOnUIThread(chatActionCell$$ExternalSyntheticLambda8);
                    this.longPressRunnable = null;
                }
                this.longPressedBlock = channelBlock;
                if (channelBlock != null) {
                    ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda9 = new ChatActionCell$$ExternalSyntheticLambda8(13, this, channelBlock);
                    this.longPressRunnable = chatActionCell$$ExternalSyntheticLambda9;
                    AndroidUtilities.runOnUIThread(chatActionCell$$ExternalSyntheticLambda9, ViewConfiguration.getLongPressTimeout());
                }
                return this.maybeScrolling;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.maybeScrolling && Math.abs(motionEvent.getX() - this.lx) >= AndroidUtilities.touchSlop) || this.scrolling) {
                    ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda10 = this.longPressRunnable;
                    if (chatActionCell$$ExternalSyntheticLambda10 != null) {
                        AndroidUtilities.cancelRunOnUIThread(chatActionCell$$ExternalSyntheticLambda10);
                        this.longPressRunnable = null;
                    }
                    this.scrolling = true;
                    this.scrollX = Utilities.clamp(this.scrollX + (this.lx - motionEvent.getX()), this.channelsScrollWidth - (rectF.width() - AndroidUtilities.dp(14.0f)), 0.0f);
                    chatMessageCell.invalidateOutbounds();
                    this.lx = motionEvent.getX();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((ChannelBlock) arrayList.get(i2)).bounce.setPressed(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda11 = this.longPressRunnable;
                if (chatActionCell$$ExternalSyntheticLambda11 != null) {
                    AndroidUtilities.cancelRunOnUIThread(chatActionCell$$ExternalSyntheticLambda11);
                    this.longPressRunnable = null;
                }
                VelocityTracker velocityTracker4 = this.velocityTracker;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z2 = this.scrolling;
                this.scrolling = false;
                if (action == 1) {
                    if (z2 || channelBlock == null || !channelBlock.bounce.isPressed()) {
                        if (z2 && (velocityTracker = this.velocityTracker) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.scroller.fling((int) this.scrollX, 0, (int) (-this.velocityTracker.getXVelocity()), 0, -2147483647, Integer.MAX_VALUE, 0, 0);
                        } else if (buttonBounce.isPressed() && chatMessageCell.getDelegate() != null) {
                            chatMessageCell.getDelegate().didPressChannelRecommendationsClose(chatMessageCell);
                        }
                    } else if (channelBlock.isLock) {
                        if (chatMessageCell.getDelegate() != null) {
                            chatMessageCell.getDelegate().didPressMoreChannelRecommendations(chatMessageCell);
                        }
                    } else if (chatMessageCell.getDelegate() != null) {
                        chatMessageCell.getDelegate().didPressChannelRecommendation(chatMessageCell, channelBlock.chat, false);
                    }
                }
                buttonBounce.setPressed(false);
                this.maybeScrolling = false;
                VelocityTracker velocityTracker5 = this.velocityTracker;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.velocityTracker = null;
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((ChannelBlock) arrayList.get(i3)).bounce.setPressed(false);
                }
                return z2;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        ChatMessageCell chatMessageCell;
        float f;
        float fDp;
        float f2;
        float f3;
        float f4;
        Canvas canvas2;
        float f5;
        int i;
        float f6;
        if (this.msg == null || (chatMessageCell = this.cell) == null) {
            return;
        }
        Scroller scroller = this.scroller;
        boolean zComputeScrollOffset = scroller.computeScrollOffset();
        RectF rectF = this.backgroundBounds;
        if (zComputeScrollOffset) {
            float currX = scroller.getCurrX();
            this.scrollX = currX;
            this.scrollX = Utilities.clamp(currX, this.channelsScrollWidth - (rectF.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            chatMessageCell.invalidateOutbounds();
        }
        if (this.serviceText != null) {
            canvas.save();
            float width = (chatMessageCell.getWidth() - this.serviceText.getWidth()) / 2.0f;
            RectF rectF2 = AndroidUtilities.rectTmp;
            f = 14.0f;
            rectF2.set((this.serviceTextLeft + width) - AndroidUtilities.dp(8.66f), AndroidUtilities.dp(4.0f), this.serviceTextRight + width + AndroidUtilities.dp(8.66f), AndroidUtilities.dp(10.66f) + this.serviceTextHeight);
            chatMessageCell.drawServiceBackground(canvas, rectF2, AndroidUtilities.dp(11.0f), 1.0f);
            canvas.translate(width, AndroidUtilities.dp(7.33f));
            this.serviceText.draw(canvas);
            canvas.restore();
            fDp = AndroidUtilities.dp(10.66f) + this.serviceTextHeight + 0.0f;
        } else {
            f = 14.0f;
            fDp = 0.0f;
        }
        float fClamp = Utilities.clamp(((chatMessageCell.transitionParams.animateRecommendationsExpanded ? isExpanded() ? chatMessageCell.transitionParams.animateChangeProgress : 1.0f - chatMessageCell.transitionParams.animateChangeProgress : isExpanded() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (fClamp > 0.0f) {
            int width2 = chatMessageCell.getWidth() - AndroidUtilities.dp(18.0f);
            int iDp = (int) (width2 > AndroidUtilities.dp(441.0f) ? AndroidUtilities.dp(66.0f) : Math.max((width2 / 4.5f) - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(66.0f)));
            this.blockWidth = iDp;
            ArrayList arrayList = this.channels;
            this.channelsScrollWidth = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * iDp);
            int iMin = (int) Math.min(width2, this.blockWidth * 6.5f);
            rectF.set((chatMessageCell.getWidth() - iMin) / 2.0f, AndroidUtilities.dp(10.0f) + fDp, (chatMessageCell.getWidth() + iMin) / 2.0f, fDp + AndroidUtilities.dp(138.0f));
            this.scrollX = Utilities.clamp(this.scrollX, this.channelsScrollWidth - (rectF.width() - AndroidUtilities.dp(f)), 0.0f);
            float fAbs = Math.abs(fClamp - this.lastBackgroundPathExpandT);
            Path path = this.backgroundPath;
            if (fAbs < 0.001f) {
                f2 = 6.0f;
                f3 = 8.0f;
                f4 = 2.0f;
            } else {
                float fDp2 = AndroidUtilities.dp(16.66f) * 2.0f;
                float f7 = rectF.bottom;
                path.rewind();
                f2 = 6.0f;
                RectF rectF3 = AndroidUtilities.rectTmp;
                f3 = 8.0f;
                float f8 = rectF.left;
                f4 = 2.0f;
                float f9 = rectF.top;
                rectF3.set(f8, f9, f8 + fDp2, f9 + fDp2);
                path.arcTo(rectF3, -90.0f, -90.0f);
                float f10 = rectF.left;
                float f11 = f7 - fDp2;
                rectF3.set(f10, f11, f10 + fDp2, f7);
                path.arcTo(rectF3, -180.0f, -90.0f);
                float f12 = rectF.right;
                rectF3.set(f12 - fDp2, f11, f12, f7);
                path.arcTo(rectF3, -270.0f, -90.0f);
                float f13 = rectF.right;
                float f14 = rectF.top;
                rectF3.set(f13 - fDp2, f14, f13, fDp2 + f14);
                path.arcTo(rectF3, 0.0f, -90.0f);
                path.lineTo(rectF.centerX() + AndroidUtilities.dp(8.0f), rectF.top);
                path.lineTo(rectF.centerX(), rectF.top - AndroidUtilities.dp(6.0f));
                path.lineTo(rectF.centerX() - AndroidUtilities.dp(8.0f), rectF.top);
                path.close();
            }
            canvas.save();
            float f15 = (fClamp * 0.6f) + 0.4f;
            canvas.scale(f15, f15, rectF.centerX(), rectF.top - AndroidUtilities.dp(f2));
            Paint paint = this.backgroundPaint;
            paint.setAlpha((int) (fClamp * 255.0f));
            paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), ColorUtils.setAlphaComponent(-16777216, (int) (27.0f * fClamp)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            Text text = this.headerText;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(17.0f) + rectF.left, rectF.top + AndroidUtilities.dp(20.0f), chatMessageCell.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), fClamp);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            float f16 = this.loadingAlpha.set(this.loading);
            float fDp3 = (rectF.left + AndroidUtilities.dp(7.0f)) - this.scrollX;
            float fDp4 = AndroidUtilities.dp(9.0f) + this.blockWidth;
            int iFloor = (int) Math.floor(((rectF.left - iMin) - fDp3) / fDp4);
            int iCeil = (int) Math.ceil((rectF.right - fDp3) / fDp4);
            if (f16 < 1.0f) {
                int iMax = Math.max(0, iFloor);
                f5 = 20.0f;
                while (true) {
                    int i2 = iMax;
                    if (i2 >= Math.min(iCeil + 1, arrayList.size())) {
                        break;
                    }
                    ChannelBlock channelBlock = (ChannelBlock) arrayList.get(i2);
                    canvas2.save();
                    canvas2.translate((i2 * fDp4) + fDp3, rectF.bottom - AndroidUtilities.dp(99.0f));
                    int i3 = this.blockWidth;
                    float f17 = (1.0f - f16) * fClamp;
                    channelBlock.getClass();
                    canvas2.save();
                    ButtonBounce buttonBounce = channelBlock.bounce;
                    float scale = buttonBounce.getScale(0.075f);
                    float f18 = i3;
                    float f19 = f18 / f4;
                    canvas2.scale(scale, scale, f19, AndroidUtilities.dp(99.0f) / f4);
                    Paint paint2 = channelBlock.subscribersStrokePaint;
                    paint2.setStrokeWidth(AndroidUtilities.dp(2.66f));
                    int i4 = Theme.key_chat_inBubble;
                    float f20 = fDp4;
                    ChatMessageCell chatMessageCell2 = channelBlock.cell;
                    paint2.setColor(chatMessageCell2.getThemedColor(i4));
                    int i5 = iFloor;
                    ImageReceiver[] imageReceiverArr = channelBlock.avatarImageReceiver;
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i6 = length;
                        float length2 = (f19 - (((imageReceiverArr.length - 1) * AndroidUtilities.dp(7.0f)) / f4)) + (AndroidUtilities.dp(7.0f) * i6);
                        int i7 = iCeil;
                        float fDp5 = (AndroidUtilities.dp(54.0f) / f4) + AndroidUtilities.dp(10.0f);
                        float f21 = f18;
                        float f22 = f19;
                        if (imageReceiverArr.length > 1) {
                            canvas2.drawCircle(length2, fDp5, AndroidUtilities.dp(54.0f) / f4, paint2);
                        }
                        imageReceiverArr[i6].setImageCoords(length2 - (AndroidUtilities.dp(54.0f) / f4), fDp5 - (AndroidUtilities.dp(54.0f) / f4), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f));
                        imageReceiverArr[i6].setAlpha(f17);
                        imageReceiverArr[i6].draw(canvas2);
                        length = i6 - 1;
                        iCeil = i7;
                        f18 = f21;
                        f19 = f22;
                        i2 = i2;
                    }
                    int i8 = iCeil;
                    float f23 = f18;
                    int i9 = i2;
                    Text text2 = channelBlock.subscribersText;
                    if (text2 != null) {
                        text2.ellipsize(i3 - AndroidUtilities.dp(32.0f));
                        float width3 = text2.getWidth() + AndroidUtilities.dp(channelBlock.subscribersDrawable != null ? 17.0f : 8.0f);
                        float fDp6 = AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(10.0f);
                        AndroidUtilities.rectTmp.set((f23 - width3) / f4, fDp6 - AndroidUtilities.dp(14.33f), (f23 + width3) / f4, fDp6);
                        boolean z = channelBlock.subscribersColorSet;
                        Paint paint3 = channelBlock.subscribersBackgroundPaint;
                        if (!z && channelBlock.isLock) {
                            paint3.setColor(Theme.blendOver(chatMessageCell2.getThemedColor(Theme.key_chat_inBubble), Theme.multAlpha(0.85f, chatMessageCell2.getThemedColor(Theme.key_windowBackgroundWhiteGrayText))));
                            channelBlock.subscribersColorSet = true;
                        } else if (z || !(imageReceiverArr[0].getStaticThumb() instanceof BitmapDrawable)) {
                            if (!channelBlock.subscribersColorSet && !channelBlock.subscribersColorSetFromThumb) {
                                try {
                                    int iBlendARGB = ColorUtils.blendARGB(0.5f, channelBlock.avatarDrawable[0].getColor(), channelBlock.avatarDrawable[0].getColor2());
                                    float[] fArr = new float[3];
                                    ColorUtils.RGBToHSL(fArr, Color.red(iBlendARGB), Color.green(iBlendARGB), Color.blue(iBlendARGB));
                                    float f24 = fArr[1];
                                    if (f24 <= 0.05f || f24 >= 0.95f) {
                                        fArr[2] = Utilities.clamp(fArr[2] - 0.1f, 0.6f, 0.3f);
                                    } else {
                                        fArr[1] = Utilities.clamp(f24 - 0.06f, 0.4f, 0.0f);
                                        fArr[2] = Utilities.clamp(fArr[2] - 0.08f, 0.5f, 0.2f);
                                    }
                                    try {
                                        paint3.setColor(ColorUtils.HSLToColor(fArr));
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                channelBlock.subscribersColorSetFromThumb = true;
                            }
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), paint3);
                            rectF4.inset((-AndroidUtilities.dp(1.0f)) / f4, (-AndroidUtilities.dp(1.0f)) / f4);
                            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
                            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), paint2);
                        } else {
                            Bitmap bitmap = ((BitmapDrawable) imageReceiverArr[0].getStaticThumb()).getBitmap();
                            try {
                                int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                float[] fArr2 = new float[3];
                                ColorUtils.RGBToHSL(fArr2, Color.red(pixel), Color.green(pixel), Color.blue(pixel));
                                float f25 = fArr2[1];
                                if (f25 <= 0.05f || f25 >= 0.95f) {
                                    fArr2[1] = 0.0f;
                                    if (Theme.currentTheme.isDark()) {
                                        f6 = 0.38f;
                                    } else {
                                        f6 = 0.7f;
                                    }
                                    fArr2[2] = f6;
                                } else {
                                    float f26 = fArr2[2];
                                    if (f26 <= 0.02f || f26 >= 0.98f) {
                                        fArr2[1] = 0.0f;
                                        if (Theme.currentTheme.isDark()) {
                                            f6 = 0.38f;
                                        } else {
                                            f6 = 0.7f;
                                        }
                                        fArr2[2] = f6;
                                    } else {
                                        fArr2[1] = 0.25f;
                                        fArr2[2] = Theme.currentTheme.isDark() ? 0.35f : 0.65f;
                                    }
                                }
                                paint3.setColor(ColorUtils.HSLToColor(fArr2));
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            channelBlock.subscribersColorSet = true;
                        }
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), paint3);
                        rectF5.inset((-AndroidUtilities.dp(1.0f)) / f4, (-AndroidUtilities.dp(1.0f)) / f4);
                        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), paint2);
                    }
                    canvas2.restore();
                    int i10 = this.blockWidth;
                    canvas2.save();
                    float scale2 = buttonBounce.getScale(0.075f);
                    float f27 = i10;
                    canvas2.scale(scale2, scale2, f27 / f4, AndroidUtilities.dp(99.0f) / f4);
                    StaticLayout staticLayout = channelBlock.nameText;
                    TextPaint textPaint = channelBlock.nameTextPaint;
                    if (staticLayout != null && staticLayout.getWidth() == i10) {
                        i = i10;
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        CharSequence charSequence = channelBlock.name;
                        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout.Builder breakStrategy = maxLines.setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        channelBlock.nameText = breakStrategy.setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                        i = i10;
                    } else {
                        i = i10;
                        channelBlock.nameText = StaticLayoutEx.createStaticLayout(channelBlock.name, channelBlock.nameTextPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i10 - AndroidUtilities.dp(16.0f), 2, false);
                    }
                    if (channelBlock.nameText != null) {
                        canvas2.save();
                        canvas2.translate((i - channelBlock.nameText.getWidth()) / f4, AndroidUtilities.dp(66.33f));
                        if (imageReceiverArr.length <= 1) {
                            textPaint.setColor(chatMessageCell2.getThemedColor(Theme.key_chat_messageTextIn));
                        } else {
                            textPaint.setColor(chatMessageCell2.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        }
                        textPaint.setAlpha((int) (textPaint.getAlpha() * f17));
                        channelBlock.nameText.draw(canvas2);
                        canvas2.restore();
                    }
                    if (text2 != null) {
                        text2.ellipsize(i - AndroidUtilities.dp(32.0f));
                        Drawable drawable = channelBlock.subscribersDrawable;
                        float width4 = (f27 - (text2.getWidth() + AndroidUtilities.dp(drawable != null ? 17.0f : 8.0f))) / f4;
                        float fDp7 = AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(4.165f);
                        boolean z2 = channelBlock.isLock;
                        if (drawable != null) {
                            drawable.setBounds((int) ((z2 ? text2.getWidth() + AndroidUtilities.dp(1.33f) : 0.0f) + width4 + AndroidUtilities.dp(3.0f)), (int) TextureRenderer$$ExternalSyntheticOutline0.m(drawable.getIntrinsicHeight(), 2.0f, 0.625f, fDp7), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z2 ? text2.getWidth() + AndroidUtilities.dp(1.33f) : 0.0f) + width4 + AndroidUtilities.dp(3.0f)), (int) zzir.m(drawable.getIntrinsicHeight(), 2.0f, 0.625f, fDp7));
                            drawable.draw(canvas2);
                        }
                        Canvas canvas3 = canvas2;
                        channelBlock.subscribersText.draw(canvas3, width4 + AndroidUtilities.dp(!z2 ? 12.66f : 4.0f), fDp7, -1, f17);
                        canvas2 = canvas3;
                    }
                    canvas2.restore();
                    canvas2.restore();
                    iMax = i9 + 1;
                    iFloor = i5;
                    iCeil = i8;
                    fDp4 = f20;
                    f4 = 2.0f;
                }
            } else {
                f5 = 20.0f;
            }
            float f28 = fDp4;
            int i11 = iFloor;
            int i12 = iCeil;
            if (f16 > 0.0f) {
                Path path2 = this.loadingPath;
                path2.rewind();
                for (int iMax2 = Math.max(0, i11); iMax2 < i12; iMax2++) {
                    float f29 = (iMax2 * f28) + fDp3;
                    float f30 = this.blockWidth;
                    float fDp8 = (AndroidUtilities.dp(54.0f) / 2.0f) + AndroidUtilities.dp(10.0f);
                    float fDp9 = AndroidUtilities.dp(54.0f) / 2.0f;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f30 / 2.0f) + f29, fDp8, fDp9, direction);
                    float f31 = f30 * 0.4f;
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(ImageReceiver$$ExternalSyntheticOutline0.m(f30, f31, 2.0f, f29), AndroidUtilities.dp(69.0f), AacUtil.m(f30, f31, 2.0f, f29), AndroidUtilities.dp(79.0f));
                    path2.addRoundRect(rectF6, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), direction);
                    float f32 = 0.35f * f30;
                    rectF6.set(ImageReceiver$$ExternalSyntheticOutline0.m(f30, f32, 2.0f, f29), AndroidUtilities.dp(83.0f), AacUtil.m(f30, f32, 2.0f, f29), AndroidUtilities.dp(91.0f));
                    path2.addRoundRect(rectF6, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), direction);
                }
                if (this.loadingDrawable == null) {
                    LoadingDrawable loadingDrawable = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable;
                    loadingDrawable.usePath(path2);
                    this.loadingDrawable.setAppearByGradient(false);
                }
                int themedColor = chatMessageCell.getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
                this.loadingDrawable.setColors(Theme.multAlpha(0.05f, themedColor), Theme.multAlpha(0.15f, themedColor), Theme.multAlpha(0.1f, themedColor), Theme.multAlpha(0.3f, themedColor));
                this.loadingDrawable.setGradientScale(1.5f);
                this.loadingDrawable.setAlpha((int) (f16 * 255.0f));
                canvas2.save();
                canvas2.translate(0.0f, rectF.bottom - AndroidUtilities.dp(99.0f));
                this.loadingDrawable.draw(canvas2);
                canvas2.restore();
            }
            float scale3 = this.closeBounce.getScale(0.02f);
            float fDp10 = rectF.right - AndroidUtilities.dp(f5);
            float fDp11 = rectF.top + AndroidUtilities.dp(f5);
            canvas2.save();
            canvas2.scale(scale3, scale3, fDp10, fDp11);
            Paint paint4 = this.closePaint;
            paint4.setStrokeWidth(AndroidUtilities.dp(1.33f));
            canvas2.drawLine(fDp10 - AndroidUtilities.dp(4.0f), fDp11 - AndroidUtilities.dp(4.0f), fDp10 + AndroidUtilities.dp(4.0f), fDp11 + AndroidUtilities.dp(4.0f), paint4);
            canvas.drawLine(fDp10 - AndroidUtilities.dp(4.0f), fDp11 + AndroidUtilities.dp(4.0f), fDp10 + AndroidUtilities.dp(4.0f), fDp11 - AndroidUtilities.dp(4.0f), paint4);
            this.closeBounds.set(fDp10 - AndroidUtilities.dp(12.0f), fDp11 - AndroidUtilities.dp(12.0f), fDp10 + AndroidUtilities.dp(12.0f), fDp11 + AndroidUtilities.dp(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean isExpanded() {
        return this.msg.channelJoinedExpanded && this.channels.size() > 0;
    }

    public final void setMessageObject(MessageObject messageObject) {
        ArrayList arrayList;
        int i;
        int i2;
        this.currentAccount = messageObject.currentAccount;
        this.msg = messageObject;
        this.dialogId = messageObject.getDialogId();
        MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        this.chatId = -this.dialogId;
        TextPaint textPaint = this.serviceTextPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i3 = Theme.key_chat_serviceText;
        ChatMessageCell chatMessageCell = this.cell;
        textPaint.setColor(chatMessageCell.getThemedColor(i3));
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.msg.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.serviceText = staticLayout;
        this.serviceTextLeft = staticLayout.getWidth();
        this.serviceTextRight = 0.0f;
        for (int i4 = 0; i4 < this.serviceText.getLineCount(); i4++) {
            this.serviceTextLeft = Math.min(this.serviceTextLeft, this.serviceText.getLineLeft(i4));
            this.serviceTextRight = Math.max(this.serviceTextRight, this.serviceText.getLineRight(i4));
        }
        this.serviceTextHeight = this.serviceText.getHeight();
        Paint paint = this.closePaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(chatMessageCell.getThemedColor(Theme.key_dialogEmptyImage));
        chatMessageCell.totalHeight = AndroidUtilities.dp(14.66f) + this.serviceTextHeight;
        int i5 = 0;
        while (true) {
            arrayList = this.channels;
            if (i5 >= arrayList.size()) {
                break;
            }
            ChannelBlock channelBlock = (ChannelBlock) arrayList.get(i5);
            int i6 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = channelBlock.avatarImageReceiver;
                if (i6 < imageReceiverArr.length) {
                    imageReceiverArr[i6].onDetachedFromWindow();
                    i6++;
                }
            }
            i5++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.dialogId);
        ArrayList arrayList2 = (channelRecommendations == null || channelRecommendations.chats == null) ? new ArrayList() : new ArrayList(channelRecommendations.chats);
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                arrayList2.remove(i7);
                i7--;
            }
            i7++;
        }
        boolean z = arrayList2.isEmpty() || (!UserConfig.getInstance(this.currentAccount).isPremium() && arrayList2.size() == 1);
        this.loading = z;
        if (!z) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.currentAccount).recommendedChannelsLimitDefault);
            }
            int iMin = Math.min(size, 10);
            for (int i8 = 0; i8 < iMin; i8++) {
                arrayList.add(new ChannelBlock(this.currentAccount, chatMessageCell, (TLObject) arrayList2.get(i8)));
            }
            if (iMin < arrayList2.size()) {
                TLObject tLObject2 = null;
                TLObject tLObject3 = (iMin < 0 || iMin >= arrayList2.size()) ? null : (TLObject) arrayList2.get(iMin);
                TLObject tLObject4 = (iMin < 0 || (i2 = iMin + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i2);
                if (iMin >= 0 && (i = iMin + 2) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i);
                }
                arrayList.add(new ChannelBlock(this.currentAccount, chatMessageCell, new TLObject[]{tLObject3, tLObject4, tLObject2}, (arrayList2.size() + channelRecommendations.more) - iMin));
            }
        }
        if (this.headerText == null) {
            this.headerText = new Text(LocaleController.getString(this.dialogId > 0 ? R.string.SimilarBots : R.string.SimilarChannels), 14.0f, AndroidUtilities.bold()).hackClipBounds();
        }
        if (isExpanded()) {
            chatMessageCell.totalHeight = AndroidUtilities.dp(144.0f) + chatMessageCell.totalHeight;
            this.backgroundPaint.setColor(chatMessageCell.getThemedColor(Theme.key_chat_inBubble));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.blockWidth);
        this.channelsScrollWidth = size2;
        this.scrollX = Utilities.clamp(this.scrollX, size2, 0.0f);
    }

    public final class ChannelBlock {
        public final AvatarDrawable[] avatarDrawable;
        public final ImageReceiver[] avatarImageReceiver;
        public final ButtonBounce bounce;
        public final ChatMessageCell cell;
        public final TLObject chat;
        public final boolean isLock;
        public final CharSequence name;
        public StaticLayout nameText;
        public final TextPaint nameTextPaint;
        public final Paint subscribersBackgroundPaint;
        public boolean subscribersColorSet;
        public boolean subscribersColorSetFromThumb;
        public final Drawable subscribersDrawable;
        public final Paint subscribersStrokePaint;
        public final Text subscribersText;

        public ChannelBlock(int i, final ChatMessageCell chatMessageCell, TLObject[] tLObjectArr, int i2) {
            TLObject tLObject;
            this.nameTextPaint = new TextPaint(1);
            this.subscribersStrokePaint = new Paint(1);
            this.subscribersBackgroundPaint = new Paint(1);
            new Paint(1);
            this.cell = chatMessageCell;
            int i3 = 0;
            this.chat = tLObjectArr[0];
            final int i4 = 0;
            this.bounce = new ButtonBounce(chatMessageCell) {
                @Override
                public final void invalidate() {
                    switch (i4) {
                        case 0:
                            chatMessageCell.invalidateOutbounds();
                            break;
                        default:
                            chatMessageCell.invalidateOutbounds();
                            break;
                    }
                }
            };
            this.avatarImageReceiver = new ImageReceiver[3];
            this.avatarDrawable = new AvatarDrawable[3];
            for (int i5 = 0; i5 < 3; i5++) {
                this.avatarImageReceiver[i5] = new ImageReceiver(chatMessageCell);
                this.avatarImageReceiver[i5].setParentView(chatMessageCell);
                this.avatarImageReceiver[i5].setRoundRadius(AndroidUtilities.dp(54.0f));
                this.avatarDrawable[i5] = new AvatarDrawable();
                if (i5 >= tLObjectArr.length || (tLObject = tLObjectArr[i5]) == null) {
                    Paint paint = new Paint(1);
                    int iBlendOver = Theme.blendOver(chatMessageCell.getThemedColor(Theme.key_chat_inBubble), Theme.multAlpha(0.5f, chatMessageCell.getThemedColor(Theme.key_windowBackgroundWhiteGrayText)));
                    paint.setColor(iBlendOver);
                    this.avatarImageReceiver[i5].setImageBitmap(new SessionCell.CircleGradientDrawable(paint, iBlendOver));
                } else {
                    this.avatarDrawable[i5].setInfo(i, tLObject);
                    this.avatarImageReceiver[i5].setForUserOrChat(tLObjectArr[i5], this.avatarDrawable[i5]);
                }
            }
            if (chatMessageCell.isCellAttachedToWindow()) {
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.avatarImageReceiver;
                    if (i3 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i3].onAttachedToWindow();
                    i3++;
                }
            }
            this.nameTextPaint.setTextSize(AndroidUtilities.dp(11.0f));
            boolean zIsPremium = UserConfig.getInstance(chatMessageCell.currentAccount).isPremium();
            this.name = LocaleController.getString(zIsPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
            this.subscribersStrokePaint.setStyle(Paint.Style.STROKE);
            this.isLock = true;
            this.subscribersDrawable = zIsPremium ? null : chatMessageCell.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            if (getSubscribersCount(this.chat) == null) {
                this.subscribersText = null;
            } else {
                this.subscribersText = new Text(DiffUtil.m(i2, "+"), 9.33f, AndroidUtilities.bold());
            }
        }

        public static String getSubscribersCount(TLObject tLObject) {
            int i;
            if (tLObject instanceof TLRPC.Chat) {
                int i2 = ((TLRPC.Chat) tLObject).participants_count;
                if (i2 <= 1) {
                    return null;
                }
                return LocaleController.formatShortNumber(i2, null);
            }
            if (!(tLObject instanceof TLRPC.User) || (i = ((TLRPC.User) tLObject).bot_active_users) <= 1) {
                return null;
            }
            return LocaleController.formatShortNumber(i, null);
        }

        public ChannelBlock(int i, final ChatMessageCell chatMessageCell, TLObject tLObject) {
            CharSequence userName;
            TextPaint textPaint = new TextPaint(1);
            this.nameTextPaint = textPaint;
            this.subscribersStrokePaint = new Paint(1);
            this.subscribersBackgroundPaint = new Paint(1);
            new Paint(1);
            this.cell = chatMessageCell;
            this.chat = tLObject;
            final int i2 = 1;
            this.bounce = new ButtonBounce(chatMessageCell) {
                @Override
                public final void invalidate() {
                    switch (i2) {
                        case 0:
                            chatMessageCell.invalidateOutbounds();
                            break;
                        default:
                            chatMessageCell.invalidateOutbounds();
                            break;
                    }
                }
            };
            ImageReceiver[] imageReceiverArr = {imageReceiver};
            this.avatarImageReceiver = imageReceiverArr;
            ImageReceiver imageReceiver = new ImageReceiver(chatMessageCell);
            imageReceiver.setParentView(chatMessageCell);
            imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
            if (chatMessageCell.isCellAttachedToWindow()) {
                int i3 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr2 = this.avatarImageReceiver;
                    if (i3 >= imageReceiverArr2.length) {
                        break;
                    }
                    imageReceiverArr2[i3].onAttachedToWindow();
                    i3++;
                }
            }
            AvatarDrawable[] avatarDrawableArr = {avatarDrawable};
            this.avatarDrawable = avatarDrawableArr;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(i, tLObject);
            imageReceiverArr[0].setForUserOrChat(tLObject, avatarDrawableArr[0]);
            textPaint.setTextSize(AndroidUtilities.dp(11.0f));
            if (tLObject instanceof TLRPC.Chat) {
                userName = ((TLRPC.Chat) tLObject).title;
            } else if (tLObject instanceof TLRPC.User) {
                userName = UserObject.getUserName((TLRPC.User) tLObject);
            } else {
                userName = "";
            }
            try {
                userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            this.name = userName;
            this.subscribersStrokePaint.setStyle(Paint.Style.STROKE);
            this.isLock = false;
            this.subscribersDrawable = chatMessageCell.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
            if (getSubscribersCount(tLObject) == null) {
                this.subscribersText = null;
            } else {
                this.subscribersText = new Text(getSubscribersCount(tLObject), 9.33f, AndroidUtilities.bold());
            }
        }
    }
}
