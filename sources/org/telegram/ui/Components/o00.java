package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o00 extends View {
    public int A;
    public RectF B;
    public float C;
    public ValueAnimator D;
    public boolean f31205a;
    public boolean f31206b;
    public boolean f31207c;
    public String d;
    public TextPaint f31208e;
    public Paint f31209f;
    public Paint h;
    public Paint f31210n;
    public int f31211r;
    public int f31212s;
    public int v;
    public int f31213w;
    public int f31214x;
    public int f31215y;

    public final void a(boolean z10, boolean z11) {
        this.f31206b = z10;
        float f9 = 0.0f;
        if (this.f31205a && z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.D.cancel();
            }
            float f10 = this.C;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new j6(this, 24));
            this.D.setDuration(300L);
            this.D.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.C = f9;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        Canvas canvas2;
        int i10 = this.f31213w;
        RectF rectF = this.B;
        Paint paint = this.h;
        Paint paint2 = this.f31210n;
        Paint paint3 = this.f31209f;
        TextPaint textPaint = this.f31208e;
        super.draw(canvas);
        float f10 = this.C;
        if (f10 <= 0.5f) {
            f9 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f31211r) + ((int) ((Color.red(this.f31212s) - Color.red(this.f31211r)) * f9)), Color.green(this.f31211r) + ((int) ((Color.green(this.f31212s) - Color.green(this.f31211r)) * f9)), Color.blue(this.f31211r) + ((int) ((Color.blue(this.f31212s) - Color.blue(this.f31211r)) * f9))));
            textPaint.setColor(Color.rgb(Color.red(this.f31212s) + ((int) ((Color.red(this.v) - Color.red(this.f31212s)) * f9)), Color.green(this.f31212s) + ((int) ((Color.green(this.v) - Color.green(this.f31212s)) * f9)), Color.blue(this.f31212s) + ((int) ((Color.blue(this.v) - Color.blue(this.f31212s)) * f9))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f31212s);
            f9 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f31212s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f9 * this.f31215y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f11 = 2.0f - (this.C / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.C > 0.5f) {
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
        this.f31205a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31205a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.B;
        int i12 = this.A;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f31208e.measureText(str);
        }
        setMeasuredDimension((i12 * 2) + measureText + (this.f31214x << 1), AndroidUtilities.dp(4.0f) + this.f31213w);
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
