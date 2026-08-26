package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class VideoCompressButton extends View {
    public final Paint clearPaint;
    public boolean disabled;
    public final AnimatedFloat disabledT;
    public final Paint fillPaint;
    public final AnimatedTextView.AnimatedTextDrawable sizeTextDrawable;
    public final int[] sizes;
    public final Paint strokePaint;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public VideoCompressButton(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.fillPaint = paint2;
        Paint paint3 = new Paint(1);
        this.clearPaint = paint3;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.disabledT = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        this.sizes = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.4f;
        animatedTextDrawable.animateDuration = 360L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        Typeface typeface = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dpf2(10.6f));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.gravity = 17;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, false, false, false);
        this.sizeTextDrawable = animatedTextDrawable2;
        animatedTextDrawable2.moveAmplitude = 0.2f;
        animatedTextDrawable2.animateDuration = 360L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        Typeface typeface2 = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint2 = animatedTextDrawable2.textPaint;
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(-1);
        animatedTextDrawable2.alpha = Color.alpha(-1);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dpf2(8.6f));
        animatedTextDrawable2.setCallback(this);
        animatedTextDrawable2.gravity = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        textPaint2.setXfermode(new PorterDuffXfermode(mode));
        animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f = this.disabledT.set(this.disabled);
        Paint paint = this.strokePaint;
        float f2 = (1.0f - (f * 0.35f)) * 255.0f;
        int i = (int) f2;
        paint.setAlpha(i);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float fDpf2 = AndroidUtilities.dpf2(21.33f);
        float fDpf3 = AndroidUtilities.dpf2(6.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        float fMax = Math.max(fDpf2, animatedTextDrawable.getCurrentWidth() + fDpf3);
        float fDpf4 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - fMax) / 2.0f, (getHeight() - fDpf4) / 2.0f, (getWidth() + fMax) / 2.0f, (getHeight() + fDpf4) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - fDpf4) / 2.0f), getWidth(), (int) ((getHeight() + fDpf4) / 2.0f));
        animatedTextDrawable.setBounds(rect);
        animatedTextDrawable.alpha = i;
        animatedTextDrawable.draw(canvas);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.sizeTextDrawable;
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - (animatedTextDrawable2.getCurrentWidth() + (AndroidUtilities.dpf2(2.0f) * animatedTextDrawable2.isNotEmpty()))), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + AndroidUtilities.dpf2(8.33f)));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.clearPaint);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.fillPaint;
        paint2.setAlpha((int) (animatedTextDrawable2.isNotEmpty() * f2));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        animatedTextDrawable2.setBounds(rect);
        animatedTextDrawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z) {
        this.disabled = false;
        this.textDrawable.setText(z ? "HD" : "SD", true, true);
        this.sizeTextDrawable.setText("", false, true);
    }

    public final void setState(int i, boolean z, boolean z2) {
        this.disabled = !z || z2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.sizeTextDrawable;
        if (z2) {
            animatedTextDrawable.setText("GIF", true, true);
            animatedTextDrawable2.setText("", true, true);
        } else {
            animatedTextDrawable.setText(i >= 720 ? "HD" : "SD", true, true);
            int[] iArr = this.sizes;
            int length = iArr.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                } else if (i >= iArr[length]) {
                    break;
                } else {
                    length--;
                }
            }
            if (length < 0) {
                animatedTextDrawable2.setText("", true, true);
            } else if (length == 6) {
                animatedTextDrawable2.setText("2K", TextUtils.isEmpty(animatedTextDrawable2.currentText), true);
            } else if (length == 7) {
                animatedTextDrawable2.setText("4K", TextUtils.isEmpty(animatedTextDrawable2.currentText), true);
            } else {
                animatedTextDrawable2.setText("" + iArr[length], TextUtils.isEmpty(animatedTextDrawable2.currentText), true);
            }
        }
        setClickable(!this.disabled);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.textDrawable == drawable || this.sizeTextDrawable == drawable || super.verifyDrawable(drawable);
    }
}
