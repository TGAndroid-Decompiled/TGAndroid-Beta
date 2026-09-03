package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class o80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f27483w;
    public long f27484a;
    public float f27485b;
    public float f27486c;
    public long d;
    public float e;
    public float f27487f;
    public int h;
    public int f27488n;
    public final RectF f27489r;
    public org.telegram.ui.Components.voip.h f27490s;

    public o80(Context context) {
        super(context);
        this.f27487f = 1.0f;
        this.f27489r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f27483w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f27483w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z4) {
        if (!z4) {
            this.e = f10;
            this.f27486c = f10;
        } else {
            this.f27486c = this.e;
        }
        if (f10 != 1.0f) {
            this.f27487f = 1.0f;
        }
        this.f27485b = f10;
        this.d = 0L;
        this.f27484a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f27485b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f27489r;
        if (i10 != 0 && this.e != 1.0f) {
            f27483w.setColor(i10);
            f27483w.setAlpha((int) (this.f27487f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27483w);
        }
        f27483w.setColor(this.f27488n);
        f27483w.setAlpha((int) (this.f27487f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27483w);
        if (this.f27487f > 0.0f) {
            if (this.f27490s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f27490s = hVar;
                hVar.f29632k = false;
                hVar.f29635n = 0.8f;
                hVar.f29634m = 1.2f;
            }
            this.f27490s.f29628f = getMeasuredWidth();
            this.f27490s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f27484a;
        this.f27484a = currentTimeMillis;
        float f10 = this.e;
        if (f10 != 1.0f) {
            float f11 = this.f27485b;
            if (f10 != f11) {
                float f12 = this.f27486c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f11;
                        this.f27486c = f11;
                        this.d = 0L;
                    } else {
                        this.e = (v.getInterpolation(((float) j11) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f14 = this.f27487f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j10) / 200.0f);
                this.f27487f = f15;
                if (f15 <= 0.0f) {
                    this.f27487f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f27488n = i10;
    }
}
