package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class h70 extends View {
    public static DecelerateInterpolator f34203w;
    public static Paint f34204x;
    public long f34205a;
    public float f34206b;
    public float f34207c;
    public long d;
    public float f34208e;
    public float f34209f;
    public int h;
    public int f34210n;
    public final RectF f34211r;
    public org.telegram.ui.Components.voip.n f34212s;

    public h70(Context context) {
        super(context);
        this.f34209f = 1.0f;
        this.f34211r = new RectF();
        if (f34203w == null) {
            f34203w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f34204x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f34204x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (!z9) {
            this.f34208e = f10;
            this.f34207c = f10;
        } else {
            this.f34207c = this.f34208e;
        }
        if (f10 != 1.0f) {
            this.f34209f = 1.0f;
        }
        this.f34206b = f10;
        this.d = 0L;
        this.f34205a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f34206b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f34211r;
        if (i7 != 0 && this.f34208e != 1.0f) {
            f34204x.setColor(i7);
            f34204x.setAlpha((int) (this.f34209f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34204x);
        }
        f34204x.setColor(this.f34210n);
        f34204x.setAlpha((int) (this.f34209f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f34208e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34204x);
        if (this.f34209f > 0.0f) {
            if (this.f34212s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f34212s = nVar;
                nVar.f39343k = false;
                nVar.f39346n = 0.8f;
                nVar.f39345m = 1.2f;
            }
            this.f34212s.f39339f = getMeasuredWidth();
            this.f34212s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34205a;
        this.f34205a = currentTimeMillis;
        float f10 = this.f34208e;
        if (f10 != 1.0f) {
            float f11 = this.f34206b;
            if (f10 != f11) {
                float f12 = this.f34207c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f34208e = f11;
                        this.f34207c = f11;
                        this.d = 0L;
                    } else {
                        this.f34208e = (f34203w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f34208e > 1.0f ? 1 : (this.f34208e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f34209f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f34209f = f15;
                if (f15 <= 0.0f) {
                    this.f34209f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f34210n = i7;
    }
}
