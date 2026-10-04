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
    public static Paint f24489w;
    public long f24490a;
    public float f24491b;
    public float f24492c;
    public long d;
    public float f24493e;
    public float f24494f;
    public int h;
    public int f24495n;
    public final RectF f24496r;
    public org.telegram.ui.Components.voip.h f24497s;

    public a90(Context context) {
        super(context);
        this.f24494f = 1.0f;
        this.f24496r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f24489w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f24489w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f24493e = f7;
            this.f24492c = f7;
        } else {
            this.f24492c = this.f24493e;
        }
        if (f7 != 1.0f) {
            this.f24494f = 1.0f;
        }
        this.f24491b = f7;
        this.d = 0L;
        this.f24490a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f24491b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f24496r;
        if (i10 != 0 && this.f24493e != 1.0f) {
            f24489w.setColor(i10);
            f24489w.setAlpha((int) (this.f24494f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24489w);
        }
        f24489w.setColor(this.f24495n);
        f24489w.setAlpha((int) (this.f24494f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f24493e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f24489w);
        if (this.f24494f > 0.0f) {
            if (this.f24497s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f24497s = hVar;
                hVar.f31885k = false;
                hVar.f31888n = 0.8f;
                hVar.f31887m = 1.2f;
            }
            this.f24497s.f31881f = getMeasuredWidth();
            this.f24497s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24490a;
        this.f24490a = currentTimeMillis;
        float f7 = this.f24493e;
        if (f7 != 1.0f) {
            float f10 = this.f24491b;
            if (f7 != f10) {
                float f11 = this.f24492c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f24493e = f10;
                        this.f24492c = f10;
                        this.d = 0L;
                    } else {
                        this.f24493e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f24493e > 1.0f ? 1 : (this.f24493e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f24494f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f24494f = f14;
                if (f14 <= 0.0f) {
                    this.f24494f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f24495n = i10;
    }
}
