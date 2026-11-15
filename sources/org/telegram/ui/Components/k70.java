package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class k70 extends View {
    public static DecelerateInterpolator f36318w;
    public static Paint f36319x;
    public long f36320a;
    public float f36321b;
    public float f36322c;
    public long d;
    public float f36323e;
    public float f36324f;
    public int h;
    public int f36325n;
    public final RectF f36326r;
    public org.telegram.ui.Components.voip.n f36327s;

    public k70(Context context) {
        super(context);
        this.f36324f = 1.0f;
        this.f36326r = new RectF();
        if (f36318w == null) {
            f36318w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f36319x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f36319x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f36323e = f10;
            this.f36322c = f10;
        } else {
            this.f36322c = this.f36323e;
        }
        if (f10 != 1.0f) {
            this.f36324f = 1.0f;
        }
        this.f36321b = f10;
        this.d = 0L;
        this.f36320a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f36321b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f36326r;
        if (i7 != 0 && this.f36323e != 1.0f) {
            f36319x.setColor(i7);
            f36319x.setAlpha((int) (this.f36324f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f36319x);
        }
        f36319x.setColor(this.f36325n);
        f36319x.setAlpha((int) (this.f36324f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f36323e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f36319x);
        if (this.f36324f > 0.0f) {
            if (this.f36327s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f36327s = nVar;
                nVar.f40799k = false;
                nVar.f40802n = 0.8f;
                nVar.f40801m = 1.2f;
            }
            this.f36327s.f40795f = getMeasuredWidth();
            this.f36327s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f36320a;
        this.f36320a = currentTimeMillis;
        float f10 = this.f36323e;
        if (f10 != 1.0f) {
            float f11 = this.f36321b;
            if (f10 != f11) {
                float f12 = this.f36322c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f36323e = f11;
                        this.f36322c = f11;
                        this.d = 0L;
                    } else {
                        this.f36323e = (f36318w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f36323e > 1.0f ? 1 : (this.f36323e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f36324f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f36324f = f15;
                if (f15 <= 0.0f) {
                    this.f36324f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f36325n = i7;
    }
}
