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
    public static Paint f22590w;
    public long f22591a;
    public float f22592b;
    public float f22593c;
    public long d;
    public float e;
    public float f22594f;
    public int h;
    public int f22595n;
    public final RectF f22596r;
    public org.telegram.ui.Components.voip.h f22597s;

    public a90(Context context) {
        super(context);
        this.f22594f = 1.0f;
        this.f22596r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f22590w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f22590w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f22593c = f7;
        } else {
            this.f22593c = this.e;
        }
        if (f7 != 1.0f) {
            this.f22594f = 1.0f;
        }
        this.f22592b = f7;
        this.d = 0L;
        this.f22591a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f22592b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f22596r;
        if (i10 != 0 && this.e != 1.0f) {
            f22590w.setColor(i10);
            f22590w.setAlpha((int) (this.f22594f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f22590w);
        }
        f22590w.setColor(this.f22595n);
        f22590w.setAlpha((int) (this.f22594f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f22590w);
        if (this.f22594f > 0.0f) {
            if (this.f22597s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f22597s = hVar;
                hVar.f29289k = false;
                hVar.f29292n = 0.8f;
                hVar.f29291m = 1.2f;
            }
            this.f22597s.f29285f = getMeasuredWidth();
            this.f22597s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22591a;
        this.f22591a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f22592b;
            if (f7 != f10) {
                float f11 = this.f22593c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f22593c = f10;
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
            float f13 = this.f22594f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f22594f = f14;
                if (f14 <= 0.0f) {
                    this.f22594f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f22595n = i10;
    }
}
