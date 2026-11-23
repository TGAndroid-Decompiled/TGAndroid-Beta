package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class x70 extends View {
    public static DecelerateInterpolator f41988w;
    public static Paint f41989x;
    public long f41990a;
    public float f41991b;
    public float f41992c;
    public long d;
    public float f41993e;
    public float f41994f;
    public int h;
    public int f41995n;
    public final RectF f41996r;
    public org.telegram.ui.Components.voip.n f41997s;

    public x70(Context context) {
        super(context);
        this.f41994f = 1.0f;
        this.f41996r = new RectF();
        if (f41988w == null) {
            f41988w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f41989x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f41989x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f41993e = f10;
            this.f41992c = f10;
        } else {
            this.f41992c = this.f41993e;
        }
        if (f10 != 1.0f) {
            this.f41994f = 1.0f;
        }
        this.f41991b = f10;
        this.d = 0L;
        this.f41990a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f41991b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f41996r;
        if (i7 != 0 && this.f41993e != 1.0f) {
            f41989x.setColor(i7);
            f41989x.setAlpha((int) (this.f41994f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41989x);
        }
        f41989x.setColor(this.f41995n);
        f41989x.setAlpha((int) (this.f41994f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f41993e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41989x);
        if (this.f41994f > 0.0f) {
            if (this.f41997s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f41997s = nVar;
                nVar.f41190k = false;
                nVar.f41193n = 0.8f;
                nVar.f41192m = 1.2f;
            }
            this.f41997s.f41186f = getMeasuredWidth();
            this.f41997s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f41990a;
        this.f41990a = currentTimeMillis;
        float f10 = this.f41993e;
        if (f10 != 1.0f) {
            float f11 = this.f41991b;
            if (f10 != f11) {
                float f12 = this.f41992c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f41993e = f11;
                        this.f41992c = f11;
                        this.d = 0L;
                    } else {
                        this.f41993e = (f41988w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f41993e > 1.0f ? 1 : (this.f41993e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f41994f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f41994f = f15;
                if (f15 <= 0.0f) {
                    this.f41994f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f41995n = i7;
    }
}
