package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class yz extends View {
    public int D;
    public int E;
    public RectF F;
    public float G;
    public ValueAnimator H;
    public boolean f32928a;
    public boolean f32929b;
    public boolean f32930c;
    public String d;
    public TextPaint e;
    public Paint f32931f;
    public Paint h;
    public Paint f32932n;
    public int f32933r;
    public int f32934s;
    public int f32935w;
    public int f32936x;
    public int f32937y;

    public final void a(boolean z10, boolean z11) {
        this.f32929b = z10;
        float f7 = 0.0f;
        if (this.f32928a && z11) {
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
            ofFloat.addUpdateListener(new a6(this, 24));
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
        int i10 = this.f32936x;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.f32932n;
        Paint paint3 = this.f32931f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f10 = this.G;
        if (f10 <= 0.5f) {
            f7 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f32933r) + ((int) ((Color.red(this.f32934s) - Color.red(this.f32933r)) * f7)), Color.green(this.f32933r) + ((int) ((Color.green(this.f32934s) - Color.green(this.f32933r)) * f7)), Color.blue(this.f32933r) + ((int) ((Color.blue(this.f32934s) - Color.blue(this.f32933r)) * f7))));
            textPaint.setColor(Color.rgb(Color.red(this.f32934s) + ((int) ((Color.red(this.f32935w) - Color.red(this.f32934s)) * f7)), Color.green(this.f32934s) + ((int) ((Color.green(this.f32935w) - Color.green(this.f32934s)) * f7)), Color.blue(this.f32934s) + ((int) ((Color.blue(this.f32935w) - Color.blue(this.f32934s)) * f7))));
        } else {
            textPaint.setColor(this.f32935w);
            paint3.setColor(this.f32934s);
            f7 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f32934s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f7 * this.D) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f11 = 2.0f - (this.G / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, org.telegram.messenger.i0.N(7.0f), measuredHeight);
        canvas.translate(org.telegram.messenger.i0.L(12.0f), measuredHeight - org.telegram.messenger.i0.L(9.0f));
        if (this.G > 0.5f) {
            paint2.setColor(this.f32935w);
            float f12 = 1.0f - f11;
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.i0.N(7.0f), (int) org.telegram.messenger.i0.N(13.0f), (int) (org.telegram.messenger.i0.N(7.0f) - (org.telegram.messenger.i0.L(4.0f) * f12)), (int) (org.telegram.messenger.i0.N(13.0f) - (org.telegram.messenger.i0.L(4.0f) * f12)), paint2);
            canvas2.drawLine((int) org.telegram.messenger.i0.N(7.0f), (int) org.telegram.messenger.i0.N(13.0f), (int) ((org.telegram.messenger.i0.L(8.0f) * f12) + org.telegram.messenger.i0.N(7.0f)), (int) (org.telegram.messenger.i0.N(13.0f) - (org.telegram.messenger.i0.L(8.0f) * f12)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32928a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32928a = false;
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
            measureText = (int) this.e.measureText(str);
        }
        setMeasuredDimension((i12 * 2) + measureText + (this.f32937y << 1), org.telegram.messenger.i0.L(4.0f) + this.f32936x);
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
