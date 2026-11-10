package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class kz extends View {
    public int D;
    public int E;
    public RectF F;
    public float G;
    public ValueAnimator H;
    public boolean f35463a;
    public boolean f35464b;
    public boolean f35465c;
    public String d;
    public TextPaint f35466e;
    public Paint f35467f;
    public Paint h;
    public Paint f35468n;
    public int f35469r;
    public int f35470s;
    public int f35471w;
    public int f35472x;
    public int f35473y;

    public final void a(boolean z9, boolean z10) {
        this.f35464b = z9;
        float f10 = 0.0f;
        if (this.f35463a && z10) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            float f11 = this.G;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new d6(this, 24));
            this.H.setDuration(300L);
            this.H.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.G = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i7 = this.f35472x;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.f35468n;
        Paint paint3 = this.f35467f;
        TextPaint textPaint = this.f35466e;
        super.draw(canvas);
        float f11 = this.G;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f35469r) + ((int) ((Color.red(this.f35470s) - Color.red(this.f35469r)) * f10)), Color.green(this.f35469r) + ((int) ((Color.green(this.f35470s) - Color.green(this.f35469r)) * f10)), Color.blue(this.f35469r) + ((int) ((Color.blue(this.f35470s) - Color.blue(this.f35469r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f35470s) + ((int) ((Color.red(this.f35471w) - Color.red(this.f35470s)) * f10)), Color.green(this.f35470s) + ((int) ((Color.green(this.f35471w) - Color.green(this.f35470s)) * f10)), Color.blue(this.f35470s) + ((int) ((Color.blue(this.f35471w) - Color.blue(this.f35470s)) * f10))));
        } else {
            textPaint.setColor(this.f35471w);
            paint3.setColor(this.f35470s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f35470s);
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i7 / 2.0f, i7 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.D) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.G / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, org.telegram.messenger.g0.N(7.0f), measuredHeight);
        canvas.translate(org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(9.0f));
        if (this.G > 0.5f) {
            paint2.setColor(this.f35471w);
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
        this.f35463a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35463a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.F;
        int i11 = this.E;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f35466e.measureText(str);
        }
        setMeasuredDimension((i11 * 2) + measureText + (this.f35473y << 1), org.telegram.messenger.g0.L(4.0f) + this.f35472x);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i11, (paint.getStrokeWidth() / 2.0f) + i11);
        }
    }

    public void setChecked(boolean z9) {
        a(z9, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
