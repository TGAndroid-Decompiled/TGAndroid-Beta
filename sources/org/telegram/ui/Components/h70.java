package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class h70 extends View {
    public static DecelerateInterpolator f34224w;
    public static Paint f34225x;
    public long f34226a;
    public float f34227b;
    public float f34228c;
    public long d;
    public float f34229e;
    public float f34230f;
    public int h;
    public int f34231n;
    public final RectF f34232r;
    public org.telegram.ui.Components.voip.n f34233s;

    public h70(Context context) {
        super(context);
        this.f34230f = 1.0f;
        this.f34232r = new RectF();
        if (f34224w == null) {
            f34224w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f34225x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f34225x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (!z9) {
            this.f34229e = f10;
            this.f34228c = f10;
        } else {
            this.f34228c = this.f34229e;
        }
        if (f10 != 1.0f) {
            this.f34230f = 1.0f;
        }
        this.f34227b = f10;
        this.d = 0L;
        this.f34226a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f34227b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f34232r;
        if (i7 != 0 && this.f34229e != 1.0f) {
            f34225x.setColor(i7);
            f34225x.setAlpha((int) (this.f34230f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34225x);
        }
        f34225x.setColor(this.f34231n);
        f34225x.setAlpha((int) (this.f34230f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f34229e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34225x);
        if (this.f34230f > 0.0f) {
            if (this.f34233s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f34233s = nVar;
                nVar.f39325k = false;
                nVar.f39328n = 0.8f;
                nVar.f39327m = 1.2f;
            }
            this.f34233s.f39321f = getMeasuredWidth();
            this.f34233s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34226a;
        this.f34226a = currentTimeMillis;
        float f10 = this.f34229e;
        if (f10 != 1.0f) {
            float f11 = this.f34227b;
            if (f10 != f11) {
                float f12 = this.f34228c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f34229e = f11;
                        this.f34228c = f11;
                        this.d = 0L;
                    } else {
                        this.f34229e = (f34224w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f34229e > 1.0f ? 1 : (this.f34229e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f34230f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f34230f = f15;
                if (f15 <= 0.0f) {
                    this.f34230f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f34231n = i7;
    }
}
