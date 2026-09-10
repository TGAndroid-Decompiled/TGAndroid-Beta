package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class w80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f28710w;
    public long f28711a;
    public float f28712b;
    public float f28713c;
    public long d;
    public float e;
    public float f28714f;
    public int h;
    public int f28715n;
    public final RectF f28716r;
    public org.telegram.ui.Components.voip.h f28717s;

    public w80(Context context) {
        super(context);
        this.f28714f = 1.0f;
        this.f28716r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f28710w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f28710w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f28713c = f7;
        } else {
            this.f28713c = this.e;
        }
        if (f7 != 1.0f) {
            this.f28714f = 1.0f;
        }
        this.f28712b = f7;
        this.d = 0L;
        this.f28711a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f28712b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f28716r;
        if (i10 != 0 && this.e != 1.0f) {
            f28710w.setColor(i10);
            f28710w.setAlpha((int) (this.f28714f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28710w);
        }
        f28710w.setColor(this.f28715n);
        f28710w.setAlpha((int) (this.f28714f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28710w);
        if (this.f28714f > 0.0f) {
            if (this.f28717s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f28717s = hVar;
                hVar.f28151k = false;
                hVar.f28154n = 0.8f;
                hVar.f28153m = 1.2f;
            }
            this.f28717s.f28147f = getMeasuredWidth();
            this.f28717s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f28711a;
        this.f28711a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f28712b;
            if (f7 != f10) {
                float f11 = this.f28713c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f28713c = f10;
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
            float f13 = this.f28714f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f28714f = f14;
                if (f14 <= 0.0f) {
                    this.f28714f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f28715n = i10;
    }
}
