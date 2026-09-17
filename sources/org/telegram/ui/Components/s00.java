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
    public boolean f27729a;
    public boolean f27730b;
    public boolean f27731c;
    public String d;
    public TextPaint e;
    public Paint f27732f;
    public Paint h;
    public Paint f27733n;
    public int f27734r;
    public int f27735s;
    public int v;
    public int f27736w;
    public int f27737x;
    public int f27738y;

    public final void a(boolean z10, boolean z11) {
        this.f27730b = z10;
        float f7 = 0.0f;
        if (this.f27729a && z11) {
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
            ofFloat.addUpdateListener(new i6(this, 24));
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
        int i10 = this.f27736w;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.f27733n;
        Paint paint3 = this.f27732f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f10 = this.G;
        if (f10 <= 0.5f) {
            f7 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f27734r) + ((int) ((Color.red(this.f27735s) - Color.red(this.f27734r)) * f7)), Color.green(this.f27734r) + ((int) ((Color.green(this.f27735s) - Color.green(this.f27734r)) * f7)), Color.blue(this.f27734r) + ((int) ((Color.blue(this.f27735s) - Color.blue(this.f27734r)) * f7))));
            textPaint.setColor(Color.rgb(Color.red(this.f27735s) + ((int) ((Color.red(this.v) - Color.red(this.f27735s)) * f7)), Color.green(this.f27735s) + ((int) ((Color.green(this.v) - Color.green(this.f27735s)) * f7)), Color.blue(this.f27735s) + ((int) ((Color.blue(this.v) - Color.blue(this.f27735s)) * f7))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f27735s);
            f7 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f27735s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f7 * this.f27738y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
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
        this.f27729a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27729a = false;
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
        setMeasuredDimension((i12 * 2) + measureText + (this.f27737x << 1), AndroidUtilities.dp(4.0f) + this.f27736w);
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
