package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class a80 extends View {
    public static DecelerateInterpolator f24307w;
    public static Paint f24308x;
    public long f24309a;
    public float f24310b;
    public float f24311c;
    public long d;
    public float e;
    public float f24312f;
    public int h;
    public int f24313n;
    public final RectF f24314r;
    public org.telegram.ui.Components.voip.g f24315s;

    public a80(Context context) {
        super(context);
        this.f24312f = 1.0f;
        this.f24314r = new RectF();
        if (f24307w == null) {
            f24307w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f24308x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f24308x.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f7) {
        if (!z10) {
            this.e = f7;
            this.f24311c = f7;
        } else {
            this.f24311c = this.e;
        }
        if (f7 != 1.0f) {
            this.f24312f = 1.0f;
        }
        this.f24310b = f7;
        this.d = 0L;
        this.f24309a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f24310b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f24314r;
        if (i10 != 0 && this.e != 1.0f) {
            f24308x.setColor(i10);
            f24308x.setAlpha((int) (this.f24312f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24308x);
        }
        f24308x.setColor(this.f24313n);
        f24308x.setAlpha((int) (this.f24312f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24308x);
        if (this.f24312f > 0.0f) {
            if (this.f24315s == null) {
                org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(160, 0);
                this.f24315s = gVar;
                gVar.f31498k = false;
                gVar.f31501n = 0.8f;
                gVar.f31500m = 1.2f;
            }
            this.f24315s.f31494f = getMeasuredWidth();
            this.f24315s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24309a;
        this.f24309a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f24310b;
            if (f7 != f10) {
                float f11 = this.f24311c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f24311c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (f24307w.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f24312f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f24312f = f14;
                if (f14 <= 0.0f) {
                    this.f24312f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f24313n = i10;
    }
}
