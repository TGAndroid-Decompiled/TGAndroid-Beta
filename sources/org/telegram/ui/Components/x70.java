package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class x70 extends View {
    public static DecelerateInterpolator f41989w;
    public static Paint f41990x;
    public long f41991a;
    public float f41992b;
    public float f41993c;
    public long d;
    public float f41994e;
    public float f41995f;
    public int h;
    public int f41996n;
    public final RectF f41997r;
    public org.telegram.ui.Components.voip.n f41998s;

    public x70(Context context) {
        super(context);
        this.f41995f = 1.0f;
        this.f41997r = new RectF();
        if (f41989w == null) {
            f41989w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f41990x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f41990x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f41994e = f10;
            this.f41993c = f10;
        } else {
            this.f41993c = this.f41994e;
        }
        if (f10 != 1.0f) {
            this.f41995f = 1.0f;
        }
        this.f41992b = f10;
        this.d = 0L;
        this.f41991a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f41992b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f41997r;
        if (i7 != 0 && this.f41994e != 1.0f) {
            f41990x.setColor(i7);
            f41990x.setAlpha((int) (this.f41995f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41990x);
        }
        f41990x.setColor(this.f41996n);
        f41990x.setAlpha((int) (this.f41995f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f41994e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f41990x);
        if (this.f41995f > 0.0f) {
            if (this.f41998s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f41998s = nVar;
                nVar.f41191k = false;
                nVar.f41194n = 0.8f;
                nVar.f41193m = 1.2f;
            }
            this.f41998s.f41187f = getMeasuredWidth();
            this.f41998s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f41991a;
        this.f41991a = currentTimeMillis;
        float f10 = this.f41994e;
        if (f10 != 1.0f) {
            float f11 = this.f41992b;
            if (f10 != f11) {
                float f12 = this.f41993c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f41994e = f11;
                        this.f41993c = f11;
                        this.d = 0L;
                    } else {
                        this.f41994e = (f41989w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f41994e > 1.0f ? 1 : (this.f41994e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f41995f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f41995f = f15;
                if (f15 <= 0.0f) {
                    this.f41995f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f41996n = i7;
    }
}
