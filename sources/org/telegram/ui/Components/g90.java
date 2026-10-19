package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class g90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f26543w;
    public long f26544a;
    public float f26545b;
    public float f26546c;
    public long d;
    public float e;
    public float f26547f;
    public int h;
    public int f26548n;
    public final RectF f26549r;
    public org.telegram.ui.Components.voip.h f26550s;

    public g90(Context context) {
        super(context);
        this.f26547f = 1.0f;
        this.f26549r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26543w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26543w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26546c = f7;
        } else {
            this.f26546c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26547f = 1.0f;
        }
        this.f26545b = f7;
        this.d = 0L;
        this.f26544a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26545b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26549r;
        if (i10 != 0 && this.e != 1.0f) {
            f26543w.setColor(i10);
            f26543w.setAlpha((int) (this.f26547f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26543w);
        }
        f26543w.setColor(this.f26548n);
        f26543w.setAlpha((int) (this.f26547f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26543w);
        if (this.f26547f > 0.0f) {
            if (this.f26550s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26550s = hVar;
                hVar.f31480k = false;
                hVar.f31483n = 0.8f;
                hVar.f31482m = 1.2f;
            }
            this.f26550s.f31476f = getMeasuredWidth();
            this.f26550s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26544a;
        this.f26544a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26545b;
            if (f7 != f10) {
                float f11 = this.f26546c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f26546c = f10;
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
            float f13 = this.f26547f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f26547f = f14;
                if (f14 <= 0.0f) {
                    this.f26547f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26548n = i10;
    }
}
