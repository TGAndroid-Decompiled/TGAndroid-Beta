package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class k70 extends View {
    public static DecelerateInterpolator f36308w;
    public static Paint f36309x;
    public long f36310a;
    public float f36311b;
    public float f36312c;
    public long d;
    public float f36313e;
    public float f36314f;
    public int h;
    public int f36315n;
    public final RectF f36316r;
    public org.telegram.ui.Components.voip.n f36317s;

    public k70(Context context) {
        super(context);
        this.f36314f = 1.0f;
        this.f36316r = new RectF();
        if (f36308w == null) {
            f36308w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f36309x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f36309x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f36313e = f10;
            this.f36312c = f10;
        } else {
            this.f36312c = this.f36313e;
        }
        if (f10 != 1.0f) {
            this.f36314f = 1.0f;
        }
        this.f36311b = f10;
        this.d = 0L;
        this.f36310a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f36311b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f36316r;
        if (i7 != 0 && this.f36313e != 1.0f) {
            f36309x.setColor(i7);
            f36309x.setAlpha((int) (this.f36314f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f36309x);
        }
        f36309x.setColor(this.f36315n);
        f36309x.setAlpha((int) (this.f36314f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f36313e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f36309x);
        if (this.f36314f > 0.0f) {
            if (this.f36317s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f36317s = nVar;
                nVar.f40802k = false;
                nVar.f40805n = 0.8f;
                nVar.f40804m = 1.2f;
            }
            this.f36317s.f40798f = getMeasuredWidth();
            this.f36317s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f36310a;
        this.f36310a = currentTimeMillis;
        float f10 = this.f36313e;
        if (f10 != 1.0f) {
            float f11 = this.f36311b;
            if (f10 != f11) {
                float f12 = this.f36312c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f36313e = f11;
                        this.f36312c = f11;
                        this.d = 0L;
                    } else {
                        this.f36313e = (f36308w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f36313e > 1.0f ? 1 : (this.f36313e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f36314f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f36314f = f15;
                if (f15 <= 0.0f) {
                    this.f36314f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f36315n = i7;
    }
}
