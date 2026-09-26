package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class y80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30584w;
    public long f30585a;
    public float f30586b;
    public float f30587c;
    public long d;
    public float e;
    public float f30588f;
    public int h;
    public int f30589n;
    public final RectF f30590r;
    public org.telegram.ui.Components.voip.h f30591s;

    public y80(Context context) {
        super(context);
        this.f30588f = 1.0f;
        this.f30590r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30584w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30584w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f30587c = f7;
        } else {
            this.f30587c = this.e;
        }
        if (f7 != 1.0f) {
            this.f30588f = 1.0f;
        }
        this.f30586b = f7;
        this.d = 0L;
        this.f30585a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30586b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30590r;
        if (i10 != 0 && this.e != 1.0f) {
            f30584w.setColor(i10);
            f30584w.setAlpha((int) (this.f30588f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30584w);
        }
        f30584w.setColor(this.f30589n);
        f30584w.setAlpha((int) (this.f30588f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30584w);
        if (this.f30588f > 0.0f) {
            if (this.f30591s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30591s = hVar;
                hVar.f29288k = false;
                hVar.f29291n = 0.8f;
                hVar.f29290m = 1.2f;
            }
            this.f30591s.f29284f = getMeasuredWidth();
            this.f30591s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30585a;
        this.f30585a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f30586b;
            if (f7 != f10) {
                float f11 = this.f30587c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f30587c = f10;
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
            float f13 = this.f30588f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30588f = f14;
                if (f14 <= 0.0f) {
                    this.f30588f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30589n = i10;
    }
}
