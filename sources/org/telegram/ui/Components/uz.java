package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class uz extends View {
    public int E;
    public int F;
    public RectF G;
    public float H;
    public ValueAnimator I;
    public boolean f40504a;
    public boolean f40505b;
    public boolean f40506c;
    public String d;
    public TextPaint f40507e;
    public Paint f40508f;
    public Paint h;
    public Paint f40509n;
    public int f40510r;
    public int f40511s;
    public int f40512w;
    public int f40513x;
    public int f40514y;

    public final void a(boolean z10, boolean z11) {
        this.f40505b = z10;
        float f10 = 0.0f;
        if (this.f40504a && z11) {
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
            ofFloat.addUpdateListener(new w(this, 26));
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
        int i7 = this.f40513x;
        RectF rectF = this.G;
        Paint paint = this.h;
        Paint paint2 = this.f40509n;
        Paint paint3 = this.f40508f;
        TextPaint textPaint = this.f40507e;
        super.draw(canvas);
        float f11 = this.H;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f40510r) + ((int) ((Color.red(this.f40511s) - Color.red(this.f40510r)) * f10)), Color.green(this.f40510r) + ((int) ((Color.green(this.f40511s) - Color.green(this.f40510r)) * f10)), Color.blue(this.f40510r) + ((int) ((Color.blue(this.f40511s) - Color.blue(this.f40510r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f40511s) + ((int) ((Color.red(this.f40512w) - Color.red(this.f40511s)) * f10)), Color.green(this.f40511s) + ((int) ((Color.green(this.f40512w) - Color.green(this.f40511s)) * f10)), Color.blue(this.f40511s) + ((int) ((Color.blue(this.f40512w) - Color.blue(this.f40511s)) * f10))));
        } else {
            textPaint.setColor(this.f40512w);
            paint3.setColor(this.f40511s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f40511s);
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
            paint2.setColor(this.f40512w);
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
        this.f40504a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40504a = false;
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
            measureText = (int) this.f40507e.measureText(str);
        }
        setMeasuredDimension((i11 * 2) + measureText + (this.f40514y << 1), org.telegram.messenger.g0.L(4.0f) + this.f40513x);
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
