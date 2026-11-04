package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
public final class dg0 extends Button {
    public final RectF f33097a;
    public final Paint f33098b;
    public boolean f33099c;
    public float d;
    public long f33100e;
    public int f33101f;

    public dg0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setOutlineProvider(null);
        b8.tf.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = org.telegram.messenger.g0.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.f33097a = new RectF();
        Paint paint = new Paint(1);
        this.f33098b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f33099c != z10) {
            this.f33099c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f33100e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f33099c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f);
        RectF rectF = this.f33097a;
        rectF.set(measuredWidth, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f) + measuredWidth, org.telegram.messenger.g0.L(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f33098b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f33101f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f33100e - System.currentTimeMillis()) < 1000) {
            long j10 = currentTimeMillis - this.f33100e;
            int i3 = (int) (this.f33101f + (((float) (360 * j10)) / 2000.0f));
            this.f33101f = i3 - ((i3 / 360) * 360);
            if (this.f33099c) {
                float f10 = this.d;
                if (f10 < 1.0f) {
                    float f11 = (((float) j10) / 200.0f) + f10;
                    this.d = f11;
                    if (f11 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else {
                float f12 = this.d;
                if (f12 > 0.0f) {
                    float f13 = f12 - (((float) j10) / 200.0f);
                    this.d = f13;
                    if (f13 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
        }
        this.f33100e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i3) {
        this.f33098b.setColor(i3);
    }
}
