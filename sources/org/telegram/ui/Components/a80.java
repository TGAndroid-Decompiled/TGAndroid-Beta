package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class a80 extends View {
    public static DecelerateInterpolator f24327w;
    public static Paint f24328x;
    public long f24329a;
    public float f24330b;
    public float f24331c;
    public long d;
    public float e;
    public float f24332f;
    public int h;
    public int f24333n;
    public final RectF f24334r;
    public org.telegram.ui.Components.voip.g f24335s;

    public a80(Context context) {
        super(context);
        this.f24332f = 1.0f;
        this.f24334r = new RectF();
        if (f24327w == null) {
            f24327w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f24328x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f24328x.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f7) {
        if (!z10) {
            this.e = f7;
            this.f24331c = f7;
        } else {
            this.f24331c = this.e;
        }
        if (f7 != 1.0f) {
            this.f24332f = 1.0f;
        }
        this.f24330b = f7;
        this.d = 0L;
        this.f24329a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f24330b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f24334r;
        if (i10 != 0 && this.e != 1.0f) {
            f24328x.setColor(i10);
            f24328x.setAlpha((int) (this.f24332f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24328x);
        }
        f24328x.setColor(this.f24333n);
        f24328x.setAlpha((int) (this.f24332f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24328x);
        if (this.f24332f > 0.0f) {
            if (this.f24335s == null) {
                org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(160, 0);
                this.f24335s = gVar;
                gVar.f31440k = false;
                gVar.f31443n = 0.8f;
                gVar.f31442m = 1.2f;
            }
            this.f24335s.f31436f = getMeasuredWidth();
            this.f24335s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24329a;
        this.f24329a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f24330b;
            if (f7 != f10) {
                float f11 = this.f24331c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f24331c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (f24327w.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f24332f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f24332f = f14;
                if (f14 <= 0.0f) {
                    this.f24332f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f24333n = i10;
    }
}
