package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class x70 extends View {
    public static DecelerateInterpolator f41996w;
    public static Paint f41997x;
    public long f41998a;
    public float f41999b;
    public float f42000c;
    public long d;
    public float f42001e;
    public float f42002f;
    public int h;
    public int f42003n;
    public final RectF f42004r;
    public org.telegram.ui.Components.voip.n f42005s;

    public x70(Context context) {
        super(context);
        this.f42002f = 1.0f;
        this.f42004r = new RectF();
        if (f41996w == null) {
            f41996w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f41997x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f41997x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f42001e = f10;
            this.f42000c = f10;
        } else {
            this.f42000c = this.f42001e;
        }
        if (f10 != 1.0f) {
            this.f42002f = 1.0f;
        }
        this.f41999b = f10;
        this.d = 0L;
        this.f41998a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f41999b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f42004r;
        if (i7 != 0 && this.f42001e != 1.0f) {
            f41997x.setColor(i7);
            f41997x.setAlpha((int) (this.f42002f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41997x);
        }
        f41997x.setColor(this.f42003n);
        f41997x.setAlpha((int) (this.f42002f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f42001e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41997x);
        if (this.f42002f > 0.0f) {
            if (this.f42005s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f42005s = nVar;
                nVar.f41189k = false;
                nVar.f41192n = 0.8f;
                nVar.f41191m = 1.2f;
            }
            this.f42005s.f41185f = getMeasuredWidth();
            this.f42005s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f41998a;
        this.f41998a = currentTimeMillis;
        float f10 = this.f42001e;
        if (f10 != 1.0f) {
            float f11 = this.f41999b;
            if (f10 != f11) {
                float f12 = this.f42000c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f42001e = f11;
                        this.f42000c = f11;
                        this.d = 0L;
                    } else {
                        this.f42001e = (f41996w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f42001e > 1.0f ? 1 : (this.f42001e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f42002f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f42002f = f15;
                if (f15 <= 0.0f) {
                    this.f42002f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f42003n = i7;
    }
}
