package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
public final class ag0 extends Button {
    public final RectF f31802a;
    public final Paint f31803b;
    public boolean f31804c;
    public float d;
    public long f31805e;
    public int f31806f;

    public ag0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setOutlineProvider(null);
        c8.ra.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = org.telegram.messenger.g0.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.f31802a = new RectF();
        Paint paint = new Paint(1);
        this.f31803b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        if (this.f31804c != z9) {
            this.f31804c = z9;
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f31805e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f31804c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f);
        RectF rectF = this.f31802a;
        rectF.set(measuredWidth, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f) + measuredWidth, org.telegram.messenger.g0.L(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f31803b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f31806f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f31805e - System.currentTimeMillis()) < 1000) {
            long j3 = currentTimeMillis - this.f31805e;
            int i7 = (int) (this.f31806f + (((float) (360 * j3)) / 2000.0f));
            this.f31806f = i7 - ((i7 / 360) * 360);
            if (this.f31804c) {
                float f10 = this.d;
                if (f10 < 1.0f) {
                    float f11 = (((float) j3) / 200.0f) + f10;
                    this.d = f11;
                    if (f11 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else {
                float f12 = this.d;
                if (f12 > 0.0f) {
                    float f13 = f12 - (((float) j3) / 200.0f);
                    this.d = f13;
                    if (f13 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
        }
        this.f31805e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i7) {
        this.f31803b.setColor(i7);
    }
}
