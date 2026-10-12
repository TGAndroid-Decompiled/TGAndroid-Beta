package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class s90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30505w;
    public long f30506a;
    public float f30507b;
    public float f30508c;
    public long d;
    public float f30509e;
    public float f30510f;
    public int h;
    public int f30511n;
    public final RectF f30512r;
    public org.telegram.ui.Components.voip.h f30513s;

    public s90(Context context) {
        super(context);
        this.f30510f = 1.0f;
        this.f30512r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30505w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30505w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f30509e = f7;
            this.f30508c = f7;
        } else {
            this.f30508c = this.f30509e;
        }
        if (f7 != 1.0f) {
            this.f30510f = 1.0f;
        }
        this.f30507b = f7;
        this.d = 0L;
        this.f30506a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30507b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30512r;
        if (i10 != 0 && this.f30509e != 1.0f) {
            f30505w.setColor(i10);
            f30505w.setAlpha((int) (this.f30510f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30505w);
        }
        f30505w.setColor(this.f30511n);
        f30505w.setAlpha((int) (this.f30510f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f30509e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30505w);
        if (this.f30510f > 0.0f) {
            if (this.f30513s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30513s = hVar;
                hVar.f31706k = false;
                hVar.f31709n = 0.8f;
                hVar.f31708m = 1.2f;
            }
            this.f30513s.f31702f = getMeasuredWidth();
            this.f30513s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30506a;
        this.f30506a = currentTimeMillis;
        float f7 = this.f30509e;
        if (f7 != 1.0f) {
            float f10 = this.f30507b;
            if (f7 != f10) {
                float f11 = this.f30508c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f30509e = f10;
                        this.f30508c = f10;
                        this.d = 0L;
                    } else {
                        this.f30509e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f30509e > 1.0f ? 1 : (this.f30509e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f30510f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30510f = f14;
                if (f14 <= 0.0f) {
                    this.f30510f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30511n = i10;
    }
}
