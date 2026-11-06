package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class h70 extends View {
    public static DecelerateInterpolator f34176w;
    public static Paint f34177x;
    public long f34178a;
    public float f34179b;
    public float f34180c;
    public long d;
    public float f34181e;
    public float f34182f;
    public int h;
    public int f34183n;
    public final RectF f34184r;
    public org.telegram.ui.Components.voip.n f34185s;

    public h70(Context context) {
        super(context);
        this.f34182f = 1.0f;
        this.f34184r = new RectF();
        if (f34176w == null) {
            f34176w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f34177x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f34177x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (!z9) {
            this.f34181e = f10;
            this.f34180c = f10;
        } else {
            this.f34180c = this.f34181e;
        }
        if (f10 != 1.0f) {
            this.f34182f = 1.0f;
        }
        this.f34179b = f10;
        this.d = 0L;
        this.f34178a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f34179b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f34184r;
        if (i7 != 0 && this.f34181e != 1.0f) {
            f34177x.setColor(i7);
            f34177x.setAlpha((int) (this.f34182f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34177x);
        }
        f34177x.setColor(this.f34183n);
        f34177x.setAlpha((int) (this.f34182f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f34181e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34177x);
        if (this.f34182f > 0.0f) {
            if (this.f34185s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f34185s = nVar;
                nVar.f39322k = false;
                nVar.f39325n = 0.8f;
                nVar.f39324m = 1.2f;
            }
            this.f34185s.f39318f = getMeasuredWidth();
            this.f34185s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34178a;
        this.f34178a = currentTimeMillis;
        float f10 = this.f34181e;
        if (f10 != 1.0f) {
            float f11 = this.f34179b;
            if (f10 != f11) {
                float f12 = this.f34180c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f34181e = f11;
                        this.f34180c = f11;
                        this.d = 0L;
                    } else {
                        this.f34181e = (f34176w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f34181e > 1.0f ? 1 : (this.f34181e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f34182f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f34182f = f15;
                if (f15 <= 0.0f) {
                    this.f34182f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f34183n = i7;
    }
}
