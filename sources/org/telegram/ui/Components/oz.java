package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class oz extends View {
    public int E;
    public int F;
    public RectF G;
    public float H;
    public ValueAnimator I;
    public boolean f38119a;
    public boolean f38120b;
    public boolean f38121c;
    public String d;
    public TextPaint f38122e;
    public Paint f38123f;
    public Paint h;
    public Paint f38124n;
    public int f38125r;
    public int f38126s;
    public int f38127w;
    public int f38128x;
    public int f38129y;

    public final void a(boolean z10, boolean z11) {
        this.f38120b = z10;
        float f10 = 0.0f;
        if (this.f38119a && z11) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            float f11 = this.H;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new c6(this, 24));
            this.I.setDuration(300L);
            this.I.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.H = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i7 = this.f38128x;
        RectF rectF = this.G;
        Paint paint = this.h;
        Paint paint2 = this.f38124n;
        Paint paint3 = this.f38123f;
        TextPaint textPaint = this.f38122e;
        super.draw(canvas);
        float f11 = this.H;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f38125r) + ((int) ((Color.red(this.f38126s) - Color.red(this.f38125r)) * f10)), Color.green(this.f38125r) + ((int) ((Color.green(this.f38126s) - Color.green(this.f38125r)) * f10)), Color.blue(this.f38125r) + ((int) ((Color.blue(this.f38126s) - Color.blue(this.f38125r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f38126s) + ((int) ((Color.red(this.f38127w) - Color.red(this.f38126s)) * f10)), Color.green(this.f38126s) + ((int) ((Color.green(this.f38127w) - Color.green(this.f38126s)) * f10)), Color.blue(this.f38126s) + ((int) ((Color.blue(this.f38127w) - Color.blue(this.f38126s)) * f10))));
        } else {
            textPaint.setColor(this.f38127w);
            paint3.setColor(this.f38126s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f38126s);
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.E) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.H / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, org.telegram.messenger.g0.N(7.0f), measuredHeight);
        canvas.translate(org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(9.0f));
        if (this.H > 0.5f) {
            paint2.setColor(this.f38127w);
            float f13 = 1.0f - f12;
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.N(7.0f) - (org.telegram.messenger.g0.L(4.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(4.0f) * f13)), paint2);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(8.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(8.0f) * f13)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38119a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38119a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.G;
        int i11 = this.F;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f38122e.measureText(str);
        }
        setMeasuredDimension((i11 * 2) + measureText + (this.f38129y << 1), org.telegram.messenger.g0.L(4.0f) + this.f38128x);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i11, (paint.getStrokeWidth() / 2.0f) + i11);
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
