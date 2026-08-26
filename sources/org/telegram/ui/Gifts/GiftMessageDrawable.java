package org.telegram.ui.Gifts;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public final class GiftMessageDrawable extends Drawable {
    public final AvatarDrawable avatarDrawable;
    public final int avatarLeftPadding;
    public final ImageReceiver avatarReceiver;
    public final int avatarSize;
    public NinePatchDrawable bubble;
    public NinePatchDrawable bubbleBorder;
    public AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
    public final float firstBaselineTop;
    public boolean hasAvatar;
    public final float lastBaselineBottom;
    public int lastMeasuredWidth;
    public int measuredHeight;
    public int measuredWidth;
    public CharSequence message;
    public final int minHeight;
    public View parentView;
    public float textDrawX;
    public float textDrawY;
    public StaticLayout textLayout;
    public final int textPaddingH;
    public final TextPaint textPaint;

    public GiftMessageDrawable() {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.avatarReceiver = imageReceiver;
        this.avatarDrawable = new AvatarDrawable();
        int iDp = AndroidUtilities.dp(10.66f);
        this.avatarSize = iDp * 2;
        this.avatarLeftPadding = AndroidUtilities.dp(4.0f);
        this.firstBaselineTop = AndroidUtilities.dpf2(15.33f);
        this.lastBaselineBottom = AndroidUtilities.dpf2(7.33f);
        this.textPaddingH = AndroidUtilities.dp(8.0f);
        this.minHeight = (int) AndroidUtilities.dpf2(22.66f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(iDp);
    }

    @Override
    public final void draw(Canvas canvas) {
        ensureNinePatches();
        Rect bounds = getBounds();
        canvas.save();
        boolean z = this.hasAvatar;
        float f = z ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.bubble;
        int i = bounds.left;
        int i2 = this.avatarLeftPadding;
        int i3 = this.avatarSize;
        int i4 = i + (z ? i2 + i3 : 0);
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Rect rect = DrawableUtils.tmpRect;
        if (ninePatchDrawable.getPadding(rect)) {
            ninePatchDrawable.setBounds(i4 - rect.left, i5 - rect.top, i6 + rect.right, i7 + rect.bottom);
        } else {
            ninePatchDrawable.setBounds(i4, i5, i6, i7);
        }
        this.bubble.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.bubbleBorder;
        int i8 = bounds.left + (this.hasAvatar ? i2 + i3 : 0);
        int i9 = bounds.top;
        int i10 = bounds.right;
        int i11 = bounds.bottom;
        if (ninePatchDrawable2.getPadding(rect)) {
            ninePatchDrawable2.setBounds(i8 - rect.left, i9 - rect.top, i10 + rect.right, i11 + rect.bottom);
        } else {
            ninePatchDrawable2.setBounds(i8, i9, i10, i11);
        }
        this.bubbleBorder.draw(canvas);
        if (this.textLayout != null) {
            canvas.save();
            canvas.translate(bounds.left + this.textDrawX, bounds.top + this.textDrawY);
            this.textLayout.draw(canvas);
            View view = this.parentView;
            if (view != null && (this.message instanceof Spanned)) {
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate = AnimatedEmojiSpan.update(0, view, false, this.emojiGroupedSpans, this.textLayout);
                this.emojiGroupedSpans = emojiGroupedSpansUpdate;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, emojiGroupedSpansUpdate, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f > 0.0f) {
            int i12 = bounds.left;
            int i13 = bounds.bottom - i3;
            ImageReceiver imageReceiver = this.avatarReceiver;
            float f2 = i3;
            imageReceiver.setImageCoords(i12, i13, f2, f2);
            canvas.save();
            canvas.scale(f, f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void ensureNinePatches() {
        if (this.bubble == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i = (intrinsicHeight * 4) / 144;
            this.bubble = NinePatchBuilder.createNinePatch(bitmapCreateBitmap, new Rect((intrinsicWidth * 27) / 168, i, (intrinsicWidth * 5) / 168, i), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.bubbleBorder == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f = intrinsicWidth2;
            float f2 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f, 0.0f, 0.0f, f2, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f, f2, paint);
            int i2 = (intrinsicHeight2 * 4) / 144;
            this.bubbleBorder = NinePatchBuilder.createNinePatch(bitmapCreateBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i2, (intrinsicWidth2 * 5) / 168, i2), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    @Override
    public final int getMinimumHeight() {
        return this.measuredHeight;
    }

    @Override
    public final int getMinimumWidth() {
        return this.measuredWidth;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    public final void measure(int i) {
        float f;
        int i2;
        float f2;
        int iCeil;
        ensureNinePatches();
        if (i != this.lastMeasuredWidth || this.textLayout == null) {
            this.lastMeasuredWidth = i;
            int i3 = !this.hasAvatar ? 0 : this.avatarLeftPadding + this.avatarSize;
            int i4 = this.textPaddingH;
            int i5 = i3 + i4;
            int i6 = (i - i5) - i4;
            int i7 = this.minHeight;
            if (i6 <= 0 || TextUtils.isEmpty(this.message)) {
                this.textLayout = null;
                this.measuredWidth = i7;
                this.measuredHeight = i7;
                return;
            }
            CharSequence charSequence = this.message;
            TextPaint textPaint = this.textPaint;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float fMax = 0.0f;
            for (int i8 = 0; i8 < lineCount; i8++) {
                fMax = Math.max(fMax, staticLayout.getLineWidth(i8));
            }
            if (lineCount > 1 && (iCeil = (int) Math.ceil(fMax)) < i6) {
                i2 = 1;
                f = fMax;
                StaticLayout staticLayout2 = new StaticLayout(this.message, textPaint, iCeil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    float fMax2 = 0.0f;
                    for (int i9 = 0; i9 < staticLayout2.getLineCount(); i9++) {
                        fMax2 = Math.max(fMax2, staticLayout2.getLineWidth(i9));
                    }
                    f2 = fMax2;
                    staticLayout = staticLayout2;
                }
                this.textLayout = staticLayout;
                this.textDrawX = i5;
                this.measuredWidth = ((int) Math.ceil(f2)) + i5 + i4;
                int lineCount2 = this.textLayout.getLineCount() - i2;
                float lineBaseline = this.textLayout.getLineBaseline(0);
                float lineBaseline2 = this.textLayout.getLineBaseline(lineCount2) - lineBaseline;
                float f3 = this.firstBaselineTop;
                this.measuredHeight = Math.max(i7, (int) Math.ceil(lineBaseline2 + f3 + this.lastBaselineBottom));
                this.textDrawY = f3 - lineBaseline;
            }
            f = fMax;
            i2 = 1;
            f2 = f;
            this.textLayout = staticLayout;
            this.textDrawX = i5;
            this.measuredWidth = ((int) Math.ceil(f2)) + i5 + i4;
            int lineCount3 = this.textLayout.getLineCount() - i2;
            float lineBaseline3 = this.textLayout.getLineBaseline(0);
            float lineBaseline4 = this.textLayout.getLineBaseline(lineCount3) - lineBaseline3;
            float f4 = this.firstBaselineTop;
            this.measuredHeight = Math.max(i7, (int) Math.ceil(lineBaseline4 + f4 + this.lastBaselineBottom));
            this.textDrawY = f4 - lineBaseline3;
        }
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setUser(TLObject tLObject) {
        boolean z = tLObject != null;
        this.hasAvatar = z;
        if (z) {
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(tLObject);
            boolean z2 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.avatarReceiver;
            if (z2) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", avatarDrawable, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", avatarDrawable, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(avatarDrawable);
            }
        }
        this.lastMeasuredWidth = -1;
    }
}
