package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class z70 extends View {
    public static DecelerateInterpolator v;

    public static Paint f35178w;

    public long f35179a;

    public float f35180b;

    public float f35181c;
    public long d;

    public float f35182e;

    public float f35183f;
    public int h;

    public int f35184n;

    public final RectF f35185r;

    public org.telegram.ui.Components.voip.h f35186s;

    public z70(Context context) {
        super(context);
        this.f35183f = 1.0f;
        this.f35185r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f35178w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f35178w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z10) {
        if (z10) {
            this.f35181c = this.f35182e;
        } else {
            this.f35182e = f10;
            this.f35181c = f10;
        }
        if (f10 != 1.0f) {
            this.f35183f = 1.0f;
        }
        this.f35180b = f10;
        this.d = 0L;
        this.f35179a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f35180b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f35185r;
        if (i10 != 0 && this.f35182e != 1.0f) {
            f35178w.setColor(i10);
            f35178w.setAlpha((int) (this.f35183f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f35178w);
        }
        f35178w.setColor(this.f35184n);
        f35178w.setAlpha((int) (this.f35183f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f35182e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f35178w);
        if (this.f35183f > 0.0f) {
            if (this.f35186s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f35186s = hVar;
                hVar.f33595k = false;
                hVar.f33598n = 0.8f;
                hVar.f33597m = 1.2f;
            }
            this.f35186s.f33591f = getMeasuredWidth();
            this.f35186s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f35179a;
        this.f35179a = jCurrentTimeMillis;
        float f10 = this.f35182e;
        if (f10 != 1.0f) {
            float f11 = this.f35180b;
            if (f10 != f11) {
                float f12 = this.f35181c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f35182e = f11;
                        this.f35181c = f11;
                        this.d = 0L;
                    } else {
                        this.f35182e = (v.getInterpolation(j11 / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        float f14 = this.f35182e;
        if (f14 < 1.0f || f14 != 1.0f) {
            return;
        }
        float f15 = this.f35183f;
        if (f15 != 0.0f) {
            float f16 = f15 - (j10 / 200.0f);
            this.f35183f = f16;
            if (f16 <= 0.0f) {
                this.f35183f = 0.0f;
            }
            invalidate();
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f35184n = i10;
    }
}
