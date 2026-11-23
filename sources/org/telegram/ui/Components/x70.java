package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class x70 extends View {
    public static DecelerateInterpolator f41945w;
    public static Paint f41946x;
    public long f41947a;
    public float f41948b;
    public float f41949c;
    public long d;
    public float f41950e;
    public float f41951f;
    public int h;
    public int f41952n;
    public final RectF f41953r;
    public org.telegram.ui.Components.voip.n f41954s;

    public x70(Context context) {
        super(context);
        this.f41951f = 1.0f;
        this.f41953r = new RectF();
        if (f41945w == null) {
            f41945w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f41946x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f41946x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f41950e = f10;
            this.f41949c = f10;
        } else {
            this.f41949c = this.f41950e;
        }
        if (f10 != 1.0f) {
            this.f41951f = 1.0f;
        }
        this.f41948b = f10;
        this.d = 0L;
        this.f41947a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f41948b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f41953r;
        if (i7 != 0 && this.f41950e != 1.0f) {
            f41946x.setColor(i7);
            f41946x.setAlpha((int) (this.f41951f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41946x);
        }
        f41946x.setColor(this.f41952n);
        f41946x.setAlpha((int) (this.f41951f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f41950e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41946x);
        if (this.f41951f > 0.0f) {
            if (this.f41954s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f41954s = nVar;
                nVar.f41152k = false;
                nVar.f41155n = 0.8f;
                nVar.f41154m = 1.2f;
            }
            this.f41954s.f41148f = getMeasuredWidth();
            this.f41954s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f41947a;
        this.f41947a = currentTimeMillis;
        float f10 = this.f41950e;
        if (f10 != 1.0f) {
            float f11 = this.f41948b;
            if (f10 != f11) {
                float f12 = this.f41949c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f41950e = f11;
                        this.f41949c = f11;
                        this.d = 0L;
                    } else {
                        this.f41950e = (f41945w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f41950e > 1.0f ? 1 : (this.f41950e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f41951f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f41951f = f15;
                if (f15 <= 0.0f) {
                    this.f41951f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f41952n = i7;
    }
}
