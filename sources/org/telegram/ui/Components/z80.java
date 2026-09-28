package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class z80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30841w;
    public long f30842a;
    public float f30843b;
    public float f30844c;
    public long d;
    public float e;
    public float f30845f;
    public int h;
    public int f30846n;
    public final RectF f30847r;
    public org.telegram.ui.Components.voip.h f30848s;

    public z80(Context context) {
        super(context);
        this.f30845f = 1.0f;
        this.f30847r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30841w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30841w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f30844c = f7;
        } else {
            this.f30844c = this.e;
        }
        if (f7 != 1.0f) {
            this.f30845f = 1.0f;
        }
        this.f30843b = f7;
        this.d = 0L;
        this.f30842a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30843b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30847r;
        if (i10 != 0 && this.e != 1.0f) {
            f30841w.setColor(i10);
            f30841w.setAlpha((int) (this.f30845f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30841w);
        }
        f30841w.setColor(this.f30846n);
        f30841w.setAlpha((int) (this.f30845f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30841w);
        if (this.f30845f > 0.0f) {
            if (this.f30848s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30848s = hVar;
                hVar.f29293k = false;
                hVar.f29296n = 0.8f;
                hVar.f29295m = 1.2f;
            }
            this.f30848s.f29289f = getMeasuredWidth();
            this.f30848s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30842a;
        this.f30842a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f30843b;
            if (f7 != f10) {
                float f11 = this.f30844c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f30844c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f30845f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30845f = f14;
                if (f14 <= 0.0f) {
                    this.f30845f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30846n = i10;
    }
}
