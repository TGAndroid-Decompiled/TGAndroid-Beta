package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class m80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f28406w;
    public long f28407a;
    public float f28408b;
    public float f28409c;
    public long d;
    public float f28410e;
    public float f28411f;
    public int h;
    public int f28412n;
    public final RectF f28413r;
    public org.telegram.ui.Components.voip.h f28414s;

    public m80(Context context) {
        super(context);
        this.f28411f = 1.0f;
        this.f28413r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f28406w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f28406w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f28410e = f7;
            this.f28409c = f7;
        } else {
            this.f28409c = this.f28410e;
        }
        if (f7 != 1.0f) {
            this.f28411f = 1.0f;
        }
        this.f28408b = f7;
        this.d = 0L;
        this.f28407a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f28408b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f28413r;
        if (i10 != 0 && this.f28410e != 1.0f) {
            f28406w.setColor(i10);
            f28406w.setAlpha((int) (this.f28411f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28406w);
        }
        f28406w.setColor(this.f28412n);
        f28406w.setAlpha((int) (this.f28411f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f28410e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28406w);
        if (this.f28411f > 0.0f) {
            if (this.f28414s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f28414s = hVar;
                hVar.f31507k = false;
                hVar.f31510n = 0.8f;
                hVar.f31509m = 1.2f;
            }
            this.f28414s.f31503f = getMeasuredWidth();
            this.f28414s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f28407a;
        this.f28407a = currentTimeMillis;
        float f7 = this.f28410e;
        if (f7 != 1.0f) {
            float f10 = this.f28408b;
            if (f7 != f10) {
                float f11 = this.f28409c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f28410e = f10;
                        this.f28409c = f10;
                        this.d = 0L;
                    } else {
                        this.f28410e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f28410e > 1.0f ? 1 : (this.f28410e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f28411f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f28411f = f14;
                if (f14 <= 0.0f) {
                    this.f28411f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f28412n = i10;
    }
}
