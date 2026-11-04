package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class d70 extends View {
    public static DecelerateInterpolator f32973w;
    public static Paint f32974x;
    public long f32975a;
    public float f32976b;
    public float f32977c;
    public long d;
    public float f32978e;
    public float f32979f;
    public int h;
    public int f32980n;
    public final RectF f32981r;
    public org.telegram.ui.Components.voip.g f32982s;

    public d70(Context context) {
        super(context);
        this.f32979f = 1.0f;
        this.f32981r = new RectF();
        if (f32973w == null) {
            f32973w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f32974x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f32974x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f10) {
        if (!z10) {
            this.f32978e = f10;
            this.f32977c = f10;
        } else {
            this.f32977c = this.f32978e;
        }
        if (f10 != 1.0f) {
            this.f32979f = 1.0f;
        }
        this.f32976b = f10;
        this.d = 0L;
        this.f32975a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f32976b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3 = this.h;
        RectF rectF = this.f32981r;
        if (i3 != 0 && this.f32978e != 1.0f) {
            f32974x.setColor(i3);
            f32974x.setAlpha((int) (this.f32979f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f32974x);
        }
        f32974x.setColor(this.f32980n);
        f32974x.setAlpha((int) (this.f32979f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f32978e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f32974x);
        if (this.f32979f > 0.0f) {
            if (this.f32982s == null) {
                org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(160, 0);
                this.f32982s = gVar;
                gVar.f39353k = false;
                gVar.f39356n = 0.8f;
                gVar.f39355m = 1.2f;
            }
            this.f32982s.f39349f = getMeasuredWidth();
            this.f32982s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f32975a;
        this.f32975a = currentTimeMillis;
        float f10 = this.f32978e;
        if (f10 != 1.0f) {
            float f11 = this.f32976b;
            if (f10 != f11) {
                float f12 = this.f32977c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f32978e = f11;
                        this.f32977c = f11;
                        this.d = 0L;
                    } else {
                        this.f32978e = (f32973w.getInterpolation(((float) j11) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f32978e > 1.0f ? 1 : (this.f32978e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f32979f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j10) / 200.0f);
                this.f32979f = f15;
                if (f15 <= 0.0f) {
                    this.f32979f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i3) {
        this.h = i3;
    }

    public void setProgressColor(int i3) {
        this.f32980n = i3;
    }
}
