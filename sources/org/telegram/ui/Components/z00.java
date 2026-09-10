package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z00 extends View {
    public int E;
    public RectF F;
    public float G;
    public ValueAnimator H;
    public boolean f29551a;
    public boolean f29552b;
    public boolean f29553c;
    public String d;
    public TextPaint e;
    public Paint f29554f;
    public Paint h;
    public Paint f29555n;
    public int f29556r;
    public int f29557s;
    public int v;
    public int f29558w;
    public int f29559x;
    public int f29560y;

    public final void a(boolean z10, boolean z11) {
        this.f29552b = z10;
        float f7 = 0.0f;
        if (this.f29551a && z11) {
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
            ofFloat.addUpdateListener(new j6(this, 24));
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
        int i10 = this.f29558w;
        RectF rectF = this.F;
        Paint paint = this.h;
        Paint paint2 = this.f29555n;
        Paint paint3 = this.f29554f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f10 = this.G;
        if (f10 <= 0.5f) {
            f7 = f10 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f29556r) + ((int) ((Color.red(this.f29557s) - Color.red(this.f29556r)) * f7)), Color.green(this.f29556r) + ((int) ((Color.green(this.f29557s) - Color.green(this.f29556r)) * f7)), Color.blue(this.f29556r) + ((int) ((Color.blue(this.f29557s) - Color.blue(this.f29556r)) * f7))));
            textPaint.setColor(Color.rgb(Color.red(this.f29557s) + ((int) ((Color.red(this.v) - Color.red(this.f29557s)) * f7)), Color.green(this.f29557s) + ((int) ((Color.green(this.v) - Color.green(this.f29557s)) * f7)), Color.blue(this.f29557s) + ((int) ((Color.blue(this.v) - Color.blue(this.f29557s)) * f7))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f29557s);
            f7 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f29557s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f7 * this.f29560y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
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
        this.f29551a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29551a = false;
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
        setMeasuredDimension((i12 * 2) + measureText + (this.f29559x << 1), AndroidUtilities.dp(4.0f) + this.f29558w);
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
