package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class FlatCheckBox extends View {
    public final int HEIGHT;
    public final int INNER_PADDING;
    public final int P;
    public final int TRANSLETE_TEXT;
    public boolean attached;
    public ValueAnimator checkAnimator;
    public final Paint checkPaint;
    public boolean checked;
    public int colorActive;
    public int colorInactive;
    public int colorTextActive;
    public boolean enabled;
    public final Paint fillPaint;
    public final Paint outLinePaint;
    public float progress;
    public final RectF rectF;
    public String text;
    public final TextPaint textPaint;

    public FlatCheckBox(Context context) {
        super(context);
        this.enabled = true;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.fillPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.outLinePaint = paint;
        Paint paint2 = new Paint(1);
        this.checkPaint = paint2;
        this.HEIGHT = AndroidUtilities.dp(35.0f);
        this.INNER_PADDING = AndroidUtilities.dp(22.0f);
        this.TRANSLETE_TEXT = AndroidUtilities.dp(8.0f);
        this.P = AndroidUtilities.dp(3.5f);
        this.rectF = new RectF();
        this.progress = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Canvas canvas2;
        super.draw(canvas);
        float f2 = this.progress;
        Paint paint = this.fillPaint;
        TextPaint textPaint = this.textPaint;
        if (f2 <= 0.5f) {
            f = f2 / 0.5f;
            paint.setColor(Color.rgb(Color.red(this.colorActive) + ((int) ((Color.red(this.colorInactive) - Color.red(this.colorActive)) * f)), Color.green(this.colorActive) + ((int) ((Color.green(this.colorInactive) - Color.green(this.colorActive)) * f)), Color.blue(this.colorActive) + ((int) ((Color.blue(this.colorInactive) - Color.blue(this.colorActive)) * f))));
            textPaint.setColor(Color.rgb(Color.red(this.colorInactive) + ((int) ((Color.red(this.colorTextActive) - Color.red(this.colorInactive)) * f)), Color.green(this.colorInactive) + ((int) ((Color.green(this.colorTextActive) - Color.green(this.colorInactive)) * f)), Color.blue(this.colorInactive) + ((int) ((Color.blue(this.colorTextActive) - Color.blue(this.colorInactive)) * f))));
        } else {
            textPaint.setColor(this.colorTextActive);
            paint.setColor(this.colorInactive);
            f = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        Paint paint2 = this.outLinePaint;
        paint2.setColor(this.colorInactive);
        RectF rectF = this.rectF;
        int i = this.HEIGHT;
        float f3 = i / 2.0f;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = i / 2.0f;
        canvas.drawRoundRect(rectF, f4, f4, paint2);
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, (f * this.TRANSLETE_TEXT) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f5 = 2.0f - (this.progress / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.progress > 0.5f) {
            Paint paint3 = this.checkPaint;
            paint3.setColor(this.colorTextActive);
            float f6 = 1.0f - f5;
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) - (AndroidUtilities.dp(4.0f) * f6)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(4.0f) * f6)), paint3);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(8.0f) * f6) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(8.0f) * f6)), paint3);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        String str = this.text;
        int iMeasureText = (str == null ? 0 : (int) this.textPaint.measureText(str)) + (this.INNER_PADDING << 1);
        int i3 = this.P;
        setMeasuredDimension((i3 * 2) + iMeasureText, AndroidUtilities.dp(4.0f) + this.HEIGHT);
        if (getMeasuredWidth() != 0) {
            RectF rectF = this.rectF;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Paint paint = this.outLinePaint;
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i3, (paint.getStrokeWidth() / 2.0f) + i3);
        }
    }

    public void setChecked(boolean z) {
        setChecked(z, true);
    }

    public void setText(String str) {
        this.text = str;
        requestLayout();
    }

    public final void setChecked(boolean z, boolean z2) {
        this.checked = z;
        if (!this.attached || !z2) {
            this.progress = z ? 1.0f : 0.0f;
            return;
        }
        ValueAnimator valueAnimator = this.checkAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.checkAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, z ? 1.0f : 0.0f);
        this.checkAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 12));
        this.checkAnimator.setDuration(300L);
        this.checkAnimator.start();
    }
}
