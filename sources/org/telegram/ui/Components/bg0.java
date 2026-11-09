package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
public final class bg0 extends Button {
    public final RectF f32253a;
    public final Paint f32254b;
    public boolean f32255c;
    public float d;
    public long f32256e;
    public int f32257f;

    public bg0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setOutlineProvider(null);
        c8.sa.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = org.telegram.messenger.g0.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.f32253a = new RectF();
        Paint paint = new Paint(1);
        this.f32254b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        if (this.f32255c != z9) {
            this.f32255c = z9;
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f32256e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f32255c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(11.0f);
        RectF rectF = this.f32253a;
        rectF.set(measuredWidth, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(8.0f) + measuredWidth, org.telegram.messenger.g0.L(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f32254b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f32257f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f32256e - System.currentTimeMillis()) < 1000) {
            long j3 = currentTimeMillis - this.f32256e;
            int i7 = (int) (this.f32257f + (((float) (360 * j3)) / 2000.0f));
            this.f32257f = i7 - ((i7 / 360) * 360);
            if (this.f32255c) {
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
        this.f32256e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i7) {
        this.f32254b.setColor(i7);
    }
}
