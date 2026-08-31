package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class p80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f29983w;
    public long f29984a;
    public float f29985b;
    public float f29986c;
    public long d;
    public float f29987e;
    public float f29988f;
    public int h;
    public int f29989n;
    public final RectF f29990r;
    public org.telegram.ui.Components.voip.h f29991s;

    public p80(Context context) {
        super(context);
        this.f29988f = 1.0f;
        this.f29990r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f29983w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f29983w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z4) {
        if (!z4) {
            this.f29987e = f10;
            this.f29986c = f10;
        } else {
            this.f29986c = this.f29987e;
        }
        if (f10 != 1.0f) {
            this.f29988f = 1.0f;
        }
        this.f29985b = f10;
        this.d = 0L;
        this.f29984a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f29985b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f29990r;
        if (i10 != 0 && this.f29987e != 1.0f) {
            f29983w.setColor(i10);
            f29983w.setAlpha((int) (this.f29988f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29983w);
        }
        f29983w.setColor(this.f29989n);
        f29983w.setAlpha((int) (this.f29988f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f29987e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29983w);
        if (this.f29988f > 0.0f) {
            if (this.f29991s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f29991s = hVar;
                hVar.f32059k = false;
                hVar.f32062n = 0.8f;
                hVar.f32061m = 1.2f;
            }
            this.f29991s.f32055f = getMeasuredWidth();
            this.f29991s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29984a;
        this.f29984a = currentTimeMillis;
        float f10 = this.f29987e;
        if (f10 != 1.0f) {
            float f11 = this.f29985b;
            if (f10 != f11) {
                float f12 = this.f29986c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f29987e = f11;
                        this.f29986c = f11;
                        this.d = 0L;
                    } else {
                        this.f29987e = (v.getInterpolation(((float) j11) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f29987e > 1.0f ? 1 : (this.f29987e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f14 = this.f29988f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j10) / 200.0f);
                this.f29988f = f15;
                if (f15 <= 0.0f) {
                    this.f29988f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f29989n = i10;
    }
}
