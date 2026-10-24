package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class f90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f26255w;
    public long f26256a;
    public float f26257b;
    public float f26258c;
    public long d;
    public float e;
    public float f26259f;
    public int h;
    public int f26260n;
    public final RectF f26261r;
    public org.telegram.ui.Components.voip.h f26262s;

    public f90(Context context) {
        super(context);
        this.f26259f = 1.0f;
        this.f26261r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26255w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26255w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26258c = f7;
        } else {
            this.f26258c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26259f = 1.0f;
        }
        this.f26257b = f7;
        this.d = 0L;
        this.f26256a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26257b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26261r;
        if (i10 != 0 && this.e != 1.0f) {
            f26255w.setColor(i10);
            f26255w.setAlpha((int) (this.f26259f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26255w);
        }
        f26255w.setColor(this.f26260n);
        f26255w.setAlpha((int) (this.f26259f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26255w);
        if (this.f26259f > 0.0f) {
            if (this.f26262s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26262s = hVar;
                hVar.f31587k = false;
                hVar.f31590n = 0.8f;
                hVar.f31589m = 1.2f;
            }
            this.f26262s.f31583f = getMeasuredWidth();
            this.f26262s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26256a;
        this.f26256a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26257b;
            if (f7 != f10) {
                float f11 = this.f26258c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f26258c = f10;
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
            float f13 = this.f26259f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f26259f = f14;
                if (f14 <= 0.0f) {
                    this.f26259f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26260n = i10;
    }
}
