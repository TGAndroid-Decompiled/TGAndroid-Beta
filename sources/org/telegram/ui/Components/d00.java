package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d00 extends View {
    public int A;
    public RectF B;
    public float C;
    public ValueAnimator D;
    public boolean f27608a;
    public boolean f27609b;
    public boolean f27610c;
    public String d;
    public TextPaint f27611e;
    public Paint f27612f;
    public Paint h;
    public Paint f27613n;
    public int f27614r;
    public int f27615s;
    public int v;
    public int f27616w;
    public int f27617x;
    public int f27618y;

    public final void a(boolean z10, boolean z11) {
        this.f27609b = z10;
        float f10 = 0.0f;
        if (this.f27608a && z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.D.cancel();
            }
            float f11 = this.C;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 24));
            this.D.setDuration(300L);
            this.D.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.C = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i9 = this.f27616w;
        RectF rectF = this.B;
        Paint paint = this.h;
        Paint paint2 = this.f27613n;
        Paint paint3 = this.f27612f;
        TextPaint textPaint = this.f27611e;
        super.draw(canvas);
        float f11 = this.C;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f27614r) + ((int) ((Color.red(this.f27615s) - Color.red(this.f27614r)) * f10)), Color.green(this.f27614r) + ((int) ((Color.green(this.f27615s) - Color.green(this.f27614r)) * f10)), Color.blue(this.f27614r) + ((int) ((Color.blue(this.f27615s) - Color.blue(this.f27614r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f27615s) + ((int) ((Color.red(this.v) - Color.red(this.f27615s)) * f10)), Color.green(this.f27615s) + ((int) ((Color.green(this.v) - Color.green(this.f27615s)) * f10)), Color.blue(this.f27615s) + ((int) ((Color.blue(this.v) - Color.blue(this.f27615s)) * f10))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f27615s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f27615s);
        canvas.drawRoundRect(rectF, i9 / 2.0f, i9 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i9 / 2.0f, i9 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.f27618y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.C / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.C > 0.5f) {
            paint2.setColor(this.v);
            float f13 = 1.0f - f12;
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dpf2(7.0f) - (AndroidUtilities.dp(4.0f) * f13)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(4.0f) * f13)), paint2);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(8.0f) * f13) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(8.0f) * f13)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27608a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27608a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.B;
        int i11 = this.A;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f27611e.measureText(str);
        }
        setMeasuredDimension((i11 * 2) + measureText + (this.f27617x << 1), AndroidUtilities.dp(4.0f) + this.f27616w);
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
