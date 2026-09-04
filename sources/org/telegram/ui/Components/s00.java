package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s00 extends View {
    public int E;
    public RectF F;
    public float G;
    public ValueAnimator H;
    public boolean f30137a;
    public boolean f30138b;
    public boolean f30139c;
    public String d;
    public TextPaint f30140e;
    public Paint f30141f;
    public Paint h;
    public Paint f30142n;
    public int f30143r;
    public int f30144s;
    public int v;
    public int f30145w;
    public int f30146x;
    public int f30147y;

    public final void a(boolean z10, boolean z11) {
        this.f30138b = z10;
        float f7 = 0.0f;
        if (this.f30137a && z11) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            float f10 = this.G;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new l6(this, 24));
            this.H.setDuration(300L);
            this.H.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.G = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        int i10 = this.f30145w;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.f30142n;
        Paint paint3 = this.f30141f;
        TextPaint textPaint = this.f30140e;
        super.draw(canvas);
        float f10 = this.G;
        if (f10 <= 0.5f) {
            f7 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f30143r) + ((int) ((Color.red(this.f30144s) - Color.red(this.f30143r)) * f7)), Color.green(this.f30143r) + ((int) ((Color.green(this.f30144s) - Color.green(this.f30143r)) * f7)), Color.blue(this.f30143r) + ((int) ((Color.blue(this.f30144s) - Color.blue(this.f30143r)) * f7))));
            textPaint.setColor(Color.rgb(Color.red(this.f30144s) + ((int) ((Color.red(this.v) - Color.red(this.f30144s)) * f7)), Color.green(this.f30144s) + ((int) ((Color.green(this.v) - Color.green(this.f30144s)) * f7)), Color.blue(this.f30144s) + ((int) ((Color.blue(this.v) - Color.blue(this.f30144s)) * f7))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f30144s);
            f7 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f30144s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f7 * this.f30147y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f11 = 2.0f - (this.G / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.G > 0.5f) {
            paint2.setColor(this.v);
            float f12 = 1.0f - f11;
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) - (AndroidUtilities.dp(4.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(4.0f) * f12)), paint2);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(8.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(8.0f) * f12)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30137a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30137a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.F;
        int i12 = this.E;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f30140e.measureText(str);
        }
        setMeasuredDimension((i12 * 2) + measureText + (this.f30146x << 1), AndroidUtilities.dp(4.0f) + this.f30145w);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i12, (paint.getStrokeWidth() / 2.0f) + i12);
        }
    }

    public void setChecked(boolean z10) {
        a(z10, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
