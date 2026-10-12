package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class n90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f27630w;
    public long f27631a;
    public float f27632b;
    public float f27633c;
    public long d;
    public float e;
    public float f27634f;
    public int h;
    public int f27635n;
    public final RectF f27636r;
    public org.telegram.ui.Components.voip.h f27637s;

    public n90(Context context) {
        super(context);
        this.f27634f = 1.0f;
        this.f27636r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f27630w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f27630w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f27633c = f7;
        } else {
            this.f27633c = this.e;
        }
        if (f7 != 1.0f) {
            this.f27634f = 1.0f;
        }
        this.f27632b = f7;
        this.d = 0L;
        this.f27631a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f27632b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f27636r;
        if (i10 != 0 && this.e != 1.0f) {
            f27630w.setColor(i10);
            f27630w.setAlpha((int) (this.f27634f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27630w);
        }
        f27630w.setColor(this.f27635n);
        f27630w.setAlpha((int) (this.f27634f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27630w);
        if (this.f27634f > 0.0f) {
            if (this.f27637s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f27637s = hVar;
                hVar.f30200k = false;
                hVar.f30203n = 0.8f;
                hVar.f30202m = 1.2f;
            }
            this.f27637s.f30196f = getMeasuredWidth();
            this.f27637s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f27631a;
        this.f27631a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f27632b;
            if (f7 != f10) {
                float f11 = this.f27633c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f27633c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (v.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f27634f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f27634f = f14;
                if (f14 <= 0.0f) {
                    this.f27634f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f27635n = i10;
    }
}
