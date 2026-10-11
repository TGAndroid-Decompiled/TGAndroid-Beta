package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class o90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f29420w;
    public long f29421a;
    public float f29422b;
    public float f29423c;
    public long d;
    public float f29424e;
    public float f29425f;
    public int h;
    public int f29426n;
    public final RectF f29427r;
    public org.telegram.ui.Components.voip.h f29428s;

    public o90(Context context) {
        super(context);
        this.f29425f = 1.0f;
        this.f29427r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f29420w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f29420w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f29424e = f7;
            this.f29423c = f7;
        } else {
            this.f29423c = this.f29424e;
        }
        if (f7 != 1.0f) {
            this.f29425f = 1.0f;
        }
        this.f29422b = f7;
        this.d = 0L;
        this.f29421a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f29422b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f29427r;
        if (i10 != 0 && this.f29424e != 1.0f) {
            f29420w.setColor(i10);
            f29420w.setAlpha((int) (this.f29425f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29420w);
        }
        f29420w.setColor(this.f29426n);
        f29420w.setAlpha((int) (this.f29425f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f29424e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29420w);
        if (this.f29425f > 0.0f) {
            if (this.f29428s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f29428s = hVar;
                hVar.f32069k = false;
                hVar.f32072n = 0.8f;
                hVar.f32071m = 1.2f;
            }
            this.f29428s.f32065f = getMeasuredWidth();
            this.f29428s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f29421a;
        this.f29421a = currentTimeMillis;
        float f7 = this.f29424e;
        if (f7 != 1.0f) {
            float f10 = this.f29422b;
            if (f7 != f10) {
                float f11 = this.f29423c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f29424e = f10;
                        this.f29423c = f10;
                        this.d = 0L;
                    } else {
                        this.f29424e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f29424e > 1.0f ? 1 : (this.f29424e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f29425f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f29425f = f14;
                if (f14 <= 0.0f) {
                    this.f29425f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f29426n = i10;
    }
}
