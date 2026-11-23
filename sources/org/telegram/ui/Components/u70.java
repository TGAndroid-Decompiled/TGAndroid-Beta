package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class u70 extends View {
    public static DecelerateInterpolator f40289w;
    public static Paint f40290x;
    public long f40291a;
    public float f40292b;
    public float f40293c;
    public long d;
    public float f40294e;
    public float f40295f;
    public int h;
    public int f40296n;
    public final RectF f40297r;
    public org.telegram.ui.Components.voip.n f40298s;

    public u70(Context context) {
        super(context);
        this.f40295f = 1.0f;
        this.f40297r = new RectF();
        if (f40289w == null) {
            f40289w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f40290x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f40290x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f40294e = f10;
            this.f40293c = f10;
        } else {
            this.f40293c = this.f40294e;
        }
        if (f10 != 1.0f) {
            this.f40295f = 1.0f;
        }
        this.f40292b = f10;
        this.d = 0L;
        this.f40291a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f40292b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f40297r;
        if (i7 != 0 && this.f40294e != 1.0f) {
            f40290x.setColor(i7);
            f40290x.setAlpha((int) (this.f40295f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f40290x);
        }
        f40290x.setColor(this.f40296n);
        f40290x.setAlpha((int) (this.f40295f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f40294e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f40290x);
        if (this.f40295f > 0.0f) {
            if (this.f40298s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f40298s = nVar;
                nVar.f41078k = false;
                nVar.f41081n = 0.8f;
                nVar.f41080m = 1.2f;
            }
            this.f40298s.f41074f = getMeasuredWidth();
            this.f40298s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f40291a;
        this.f40291a = currentTimeMillis;
        float f10 = this.f40294e;
        if (f10 != 1.0f) {
            float f11 = this.f40292b;
            if (f10 != f11) {
                float f12 = this.f40293c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f40294e = f11;
                        this.f40293c = f11;
                        this.d = 0L;
                    } else {
                        this.f40294e = (f40289w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f40294e > 1.0f ? 1 : (this.f40294e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f40295f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f40295f = f15;
                if (f15 <= 0.0f) {
                    this.f40295f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f40296n = i7;
    }
}
