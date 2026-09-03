package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class p80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30001w;
    public long f30002a;
    public float f30003b;
    public float f30004c;
    public long d;
    public float f30005e;
    public float f30006f;
    public int h;
    public int f30007n;
    public final RectF f30008r;
    public org.telegram.ui.Components.voip.h f30009s;

    public p80(Context context) {
        super(context);
        this.f30006f = 1.0f;
        this.f30008r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30001w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30001w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z4) {
        if (!z4) {
            this.f30005e = f10;
            this.f30004c = f10;
        } else {
            this.f30004c = this.f30005e;
        }
        if (f10 != 1.0f) {
            this.f30006f = 1.0f;
        }
        this.f30003b = f10;
        this.d = 0L;
        this.f30002a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30003b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30008r;
        if (i10 != 0 && this.f30005e != 1.0f) {
            f30001w.setColor(i10);
            f30001w.setAlpha((int) (this.f30006f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30001w);
        }
        f30001w.setColor(this.f30007n);
        f30001w.setAlpha((int) (this.f30006f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f30005e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30001w);
        if (this.f30006f > 0.0f) {
            if (this.f30009s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30009s = hVar;
                hVar.f32064k = false;
                hVar.f32067n = 0.8f;
                hVar.f32066m = 1.2f;
            }
            this.f30009s.f32060f = getMeasuredWidth();
            this.f30009s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f30002a;
        this.f30002a = currentTimeMillis;
        float f10 = this.f30005e;
        if (f10 != 1.0f) {
            float f11 = this.f30003b;
            if (f10 != f11) {
                float f12 = this.f30004c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f30005e = f11;
                        this.f30004c = f11;
                        this.d = 0L;
                    } else {
                        this.f30005e = (v.getInterpolation(((float) j11) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f30005e > 1.0f ? 1 : (this.f30005e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f14 = this.f30006f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j10) / 200.0f);
                this.f30006f = f15;
                if (f15 <= 0.0f) {
                    this.f30006f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30007n = i10;
    }
}
