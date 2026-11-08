package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class h70 extends View {
    public static DecelerateInterpolator f34140w;
    public static Paint f34141x;
    public long f34142a;
    public float f34143b;
    public float f34144c;
    public long d;
    public float f34145e;
    public float f34146f;
    public int h;
    public int f34147n;
    public final RectF f34148r;
    public org.telegram.ui.Components.voip.n f34149s;

    public h70(Context context) {
        super(context);
        this.f34146f = 1.0f;
        this.f34148r = new RectF();
        if (f34140w == null) {
            f34140w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f34141x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f34141x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (!z9) {
            this.f34145e = f10;
            this.f34144c = f10;
        } else {
            this.f34144c = this.f34145e;
        }
        if (f10 != 1.0f) {
            this.f34146f = 1.0f;
        }
        this.f34143b = f10;
        this.d = 0L;
        this.f34142a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f34143b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f34148r;
        if (i7 != 0 && this.f34145e != 1.0f) {
            f34141x.setColor(i7);
            f34141x.setAlpha((int) (this.f34146f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34141x);
        }
        f34141x.setColor(this.f34147n);
        f34141x.setAlpha((int) (this.f34146f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f34145e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34141x);
        if (this.f34146f > 0.0f) {
            if (this.f34149s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f34149s = nVar;
                nVar.f39378k = false;
                nVar.f39381n = 0.8f;
                nVar.f39380m = 1.2f;
            }
            this.f34149s.f39374f = getMeasuredWidth();
            this.f34149s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34142a;
        this.f34142a = currentTimeMillis;
        float f10 = this.f34145e;
        if (f10 != 1.0f) {
            float f11 = this.f34143b;
            if (f10 != f11) {
                float f12 = this.f34144c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f34145e = f11;
                        this.f34144c = f11;
                        this.d = 0L;
                    } else {
                        this.f34145e = (f34140w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f34145e > 1.0f ? 1 : (this.f34145e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f34146f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f34146f = f15;
                if (f15 <= 0.0f) {
                    this.f34146f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f34147n = i7;
    }
}
