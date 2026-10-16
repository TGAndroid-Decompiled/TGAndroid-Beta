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
    public static Paint f27321w;
    public long f27322a;
    public float f27323b;
    public float f27324c;
    public long d;
    public float e;
    public float f27325f;
    public int h;
    public int f27326n;
    public final RectF f27327r;
    public org.telegram.ui.Components.voip.h f27328s;

    public n90(Context context) {
        super(context);
        this.f27325f = 1.0f;
        this.f27327r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f27321w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f27321w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f27324c = f7;
        } else {
            this.f27324c = this.e;
        }
        if (f7 != 1.0f) {
            this.f27325f = 1.0f;
        }
        this.f27323b = f7;
        this.d = 0L;
        this.f27322a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f27323b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f27327r;
        if (i10 != 0 && this.e != 1.0f) {
            f27321w.setColor(i10);
            f27321w.setAlpha((int) (this.f27325f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27321w);
        }
        f27321w.setColor(this.f27326n);
        f27321w.setAlpha((int) (this.f27325f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f27321w);
        if (this.f27325f > 0.0f) {
            if (this.f27328s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f27328s = hVar;
                hVar.f29869k = false;
                hVar.f29872n = 0.8f;
                hVar.f29871m = 1.2f;
            }
            this.f27328s.f29865f = getMeasuredWidth();
            this.f27328s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f27322a;
        this.f27322a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f27323b;
            if (f7 != f10) {
                float f11 = this.f27324c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f27324c = f10;
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
            float f13 = this.f27325f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f27325f = f14;
                if (f14 <= 0.0f) {
                    this.f27325f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f27326n = i10;
    }
}
