package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class i70 extends View {
    public static DecelerateInterpolator f34624w;
    public static Paint f34625x;
    public long f34626a;
    public float f34627b;
    public float f34628c;
    public long d;
    public float f34629e;
    public float f34630f;
    public int h;
    public int f34631n;
    public final RectF f34632r;
    public org.telegram.ui.Components.voip.n f34633s;

    public i70(Context context) {
        super(context);
        this.f34630f = 1.0f;
        this.f34632r = new RectF();
        if (f34624w == null) {
            f34624w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f34625x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f34625x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (!z9) {
            this.f34629e = f10;
            this.f34628c = f10;
        } else {
            this.f34628c = this.f34629e;
        }
        if (f10 != 1.0f) {
            this.f34630f = 1.0f;
        }
        this.f34627b = f10;
        this.d = 0L;
        this.f34626a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f34627b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.f34632r;
        if (i7 != 0 && this.f34629e != 1.0f) {
            f34625x.setColor(i7);
            f34625x.setAlpha((int) (this.f34630f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34625x);
        }
        f34625x.setColor(this.f34631n);
        f34625x.setAlpha((int) (this.f34630f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f34629e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f34625x);
        if (this.f34630f > 0.0f) {
            if (this.f34633s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(160, 0);
                this.f34633s = nVar;
                nVar.f39467k = false;
                nVar.f39470n = 0.8f;
                nVar.f39469m = 1.2f;
            }
            this.f34633s.f39463f = getMeasuredWidth();
            this.f34633s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f34626a;
        this.f34626a = currentTimeMillis;
        float f10 = this.f34629e;
        if (f10 != 1.0f) {
            float f11 = this.f34627b;
            if (f10 != f11) {
                float f12 = this.f34628c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f34629e = f11;
                        this.f34628c = f11;
                        this.d = 0L;
                    } else {
                        this.f34629e = (f34624w.getInterpolation(((float) j10) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f34629e > 1.0f ? 1 : (this.f34629e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f34630f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j3) / 200.0f);
                this.f34630f = f15;
                if (f15 <= 0.0f) {
                    this.f34630f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.f34631n = i7;
    }
}
