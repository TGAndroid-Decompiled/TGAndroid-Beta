package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class a90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f24484w;
    public long f24485a;
    public float f24486b;
    public float f24487c;
    public long d;
    public float f24488e;
    public float f24489f;
    public int h;
    public int f24490n;
    public final RectF f24491r;
    public org.telegram.ui.Components.voip.h f24492s;

    public a90(Context context) {
        super(context);
        this.f24489f = 1.0f;
        this.f24491r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f24484w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f24484w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f24488e = f7;
            this.f24487c = f7;
        } else {
            this.f24487c = this.f24488e;
        }
        if (f7 != 1.0f) {
            this.f24489f = 1.0f;
        }
        this.f24486b = f7;
        this.d = 0L;
        this.f24485a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f24486b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f24491r;
        if (i10 != 0 && this.f24488e != 1.0f) {
            f24484w.setColor(i10);
            f24484w.setAlpha((int) (this.f24489f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24484w);
        }
        f24484w.setColor(this.f24490n);
        f24484w.setAlpha((int) (this.f24489f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f24488e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24484w);
        if (this.f24489f > 0.0f) {
            if (this.f24492s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f24492s = hVar;
                hVar.f31878k = false;
                hVar.f31881n = 0.8f;
                hVar.f31880m = 1.2f;
            }
            this.f24492s.f31874f = getMeasuredWidth();
            this.f24492s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24485a;
        this.f24485a = currentTimeMillis;
        float f7 = this.f24488e;
        if (f7 != 1.0f) {
            float f10 = this.f24486b;
            if (f7 != f10) {
                float f11 = this.f24487c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f24488e = f10;
                        this.f24487c = f10;
                        this.d = 0L;
                    } else {
                        this.f24488e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f24488e > 1.0f ? 1 : (this.f24488e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f24489f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f24489f = f14;
                if (f14 <= 0.0f) {
                    this.f24489f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f24490n = i10;
    }
}
