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
    public static Paint f30840w;
    public long f30841a;
    public float f30842b;
    public float f30843c;
    public long d;
    public float e;
    public float f30844f;
    public int h;
    public int f30845n;
    public final RectF f30846r;
    public org.telegram.ui.Components.voip.h f30847s;

    public z80(Context context) {
        super(context);
        this.f30844f = 1.0f;
        this.f30846r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30840w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30840w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f30843c = f7;
        } else {
            this.f30843c = this.e;
        }
        if (f7 != 1.0f) {
            this.f30844f = 1.0f;
        }
        this.f30842b = f7;
        this.d = 0L;
        this.f30841a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30842b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30846r;
        if (i10 != 0 && this.e != 1.0f) {
            f30840w.setColor(i10);
            f30840w.setAlpha((int) (this.f30844f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30840w);
        }
        f30840w.setColor(this.f30845n);
        f30840w.setAlpha((int) (this.f30844f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30840w);
        if (this.f30844f > 0.0f) {
            if (this.f30847s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30847s = hVar;
                hVar.f29292k = false;
                hVar.f29295n = 0.8f;
                hVar.f29294m = 1.2f;
            }
            this.f30847s.f29288f = getMeasuredWidth();
            this.f30847s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30841a;
        this.f30841a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f30842b;
            if (f7 != f10) {
                float f11 = this.f30843c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f30843c = f10;
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
            float f13 = this.f30844f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30844f = f14;
                if (f14 <= 0.0f) {
                    this.f30844f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30845n = i10;
    }
}
