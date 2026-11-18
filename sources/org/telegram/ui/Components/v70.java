package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class v70 extends View {
    public static DecelerateInterpolator f40510w;
    public static Paint f40511x;
    public long f40512a;
    public float f40513b;
    public float f40514c;
    public long d;
    public float f40515e;
    public float f40516f;
    public int h;
    public int f40517n;
    public final RectF f40518r;
    public org.telegram.ui.Components.voip.n f40519s;

    public v70(Context context) {
        super(context);
        this.f40516f = 1.0f;
        this.f40518r = new RectF();
        if (f40510w == null) {
            f40510w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f40511x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f40511x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f40515e = f10;
            this.f40514c = f10;
        } else {
            this.f40514c = this.f40515e;
        }
        if (f10 != 1.0f) {
            this.f40516f = 1.0f;
        }
        this.f40513b = f10;
        this.d = 0L;
        this.f40512a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f40513b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f40518r;
        if (i7 != 0 && this.f40515e != 1.0f) {
            f40511x.setColor(i7);
            f40511x.setAlpha((int) (this.f40516f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f40511x);
        }
        f40511x.setColor(this.f40517n);
        f40511x.setAlpha((int) (this.f40516f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f40515e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f40511x);
        if (this.f40516f > 0.0f) {
            if (this.f40519s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f40519s = nVar;
                nVar.f41054k = false;
                nVar.f41057n = 0.8f;
                nVar.f41056m = 1.2f;
            }
            this.f40519s.f41050f = getMeasuredWidth();
            this.f40519s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f40512a;
        this.f40512a = currentTimeMillis;
        float f10 = this.f40515e;
        if (f10 != 1.0f) {
            float f11 = this.f40513b;
            if (f10 != f11) {
                float f12 = this.f40514c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f40515e = f11;
                        this.f40514c = f11;
                        this.d = 0L;
                    } else {
                        this.f40515e = (f40510w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f40515e > 1.0f ? 1 : (this.f40515e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f40516f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f40516f = f15;
                if (f15 <= 0.0f) {
                    this.f40516f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f40517n = i7;
    }
}
