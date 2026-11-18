package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class vz extends View {
    public int E;
    public int F;
    public RectF G;
    public float H;
    public ValueAnimator I;
    public boolean f41498a;
    public boolean f41499b;
    public boolean f41500c;
    public String d;
    public TextPaint f41501e;
    public Paint f41502f;
    public Paint h;
    public Paint f41503n;
    public int f41504r;
    public int f41505s;
    public int f41506w;
    public int f41507x;
    public int f41508y;

    public final void a(boolean z10, boolean z11) {
        this.f41499b = z10;
        float f10 = 0.0f;
        if (this.f41498a && z11) {
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
        int i7 = this.f41507x;
        RectF rectF = this.G;
        Paint paint = this.h;
        Paint paint2 = this.f41503n;
        Paint paint3 = this.f41502f;
        TextPaint textPaint = this.f41501e;
        super.draw(canvas);
        float f11 = this.H;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f41504r) + ((int) ((Color.red(this.f41505s) - Color.red(this.f41504r)) * f10)), Color.green(this.f41504r) + ((int) ((Color.green(this.f41505s) - Color.green(this.f41504r)) * f10)), Color.blue(this.f41504r) + ((int) ((Color.blue(this.f41505s) - Color.blue(this.f41504r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f41505s) + ((int) ((Color.red(this.f41506w) - Color.red(this.f41505s)) * f10)), Color.green(this.f41505s) + ((int) ((Color.green(this.f41506w) - Color.green(this.f41505s)) * f10)), Color.blue(this.f41505s) + ((int) ((Color.blue(this.f41506w) - Color.blue(this.f41505s)) * f10))));
        } else {
            textPaint.setColor(this.f41506w);
            paint3.setColor(this.f41505s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f41505s);
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
            paint2.setColor(this.f41506w);
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
        this.f41498a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41498a = false;
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
            measureText = (int) this.f41501e.measureText(str);
        }
        setMeasuredDimension((i11 * 2) + measureText + (this.f41508y << 1), org.telegram.messenger.g0.L(4.0f) + this.f41507x);
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
