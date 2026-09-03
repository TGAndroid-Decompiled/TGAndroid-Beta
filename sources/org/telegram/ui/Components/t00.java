package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t00 extends View {
    public int B;
    public RectF C;
    public float D;
    public ValueAnimator E;
    public boolean f31226a;
    public boolean f31227b;
    public boolean f31228c;
    public String d;
    public TextPaint f31229e;
    public Paint f31230f;
    public Paint h;
    public Paint f31231n;
    public int f31232r;
    public int f31233s;
    public int v;
    public int f31234w;
    public int f31235x;
    public int f31236y;

    public final void a(boolean z4, boolean z10) {
        this.f31227b = z4;
        float f10 = 0.0f;
        if (this.f31226a && z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            float f11 = this.D;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 24));
            this.E.setDuration(300L);
            this.E.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.D = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i10 = this.f31234w;
        RectF rectF = this.C;
        Paint paint = this.h;
        Paint paint2 = this.f31231n;
        Paint paint3 = this.f31230f;
        TextPaint textPaint = this.f31229e;
        super.draw(canvas);
        float f11 = this.D;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.f31232r) + ((int) ((Color.red(this.f31233s) - Color.red(this.f31232r)) * f10)), Color.green(this.f31232r) + ((int) ((Color.green(this.f31233s) - Color.green(this.f31232r)) * f10)), Color.blue(this.f31232r) + ((int) ((Color.blue(this.f31233s) - Color.blue(this.f31232r)) * f10))));
            textPaint.setColor(Color.rgb(Color.red(this.f31233s) + ((int) ((Color.red(this.v) - Color.red(this.f31233s)) * f10)), Color.green(this.f31233s) + ((int) ((Color.green(this.v) - Color.green(this.f31233s)) * f10)), Color.blue(this.f31233s) + ((int) ((Color.blue(this.v) - Color.blue(this.f31233s)) * f10))));
        } else {
            textPaint.setColor(this.v);
            paint3.setColor(this.f31233s);
            f10 = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.f31233s);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i10 / 2.0f, i10 / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f10 * this.f31236y) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f12 = 2.0f - (this.D / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, AndroidUtilities.dpf2(7.0f), measuredHeight);
        canvas.translate(AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(9.0f));
        if (this.D > 0.5f) {
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
        this.f31226a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31226a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.C;
        int i12 = this.B;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.f31229e.measureText(str);
        }
        setMeasuredDimension((i12 * 2) + measureText + (this.f31235x << 1), AndroidUtilities.dp(4.0f) + this.f31234w);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i12, (paint.getStrokeWidth() / 2.0f) + i12);
        }
    }

    public void setChecked(boolean z4) {
        a(z4, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
