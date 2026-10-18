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
    public static Paint f26527w;
    public long f26528a;
    public float f26529b;
    public float f26530c;
    public long d;
    public float e;
    public float f26531f;
    public int h;
    public int f26532n;
    public final RectF f26533r;
    public org.telegram.ui.Components.voip.h f26534s;

    public g90(Context context) {
        super(context);
        this.f26531f = 1.0f;
        this.f26533r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26527w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26527w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26530c = f7;
        } else {
            this.f26530c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26531f = 1.0f;
        }
        this.f26529b = f7;
        this.d = 0L;
        this.f26528a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26529b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26533r;
        if (i10 != 0 && this.e != 1.0f) {
            f26527w.setColor(i10);
            f26527w.setAlpha((int) (this.f26531f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26527w);
        }
        f26527w.setColor(this.f26532n);
        f26527w.setAlpha((int) (this.f26531f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26527w);
        if (this.f26531f > 0.0f) {
            if (this.f26534s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26534s = hVar;
                hVar.f31478k = false;
                hVar.f31481n = 0.8f;
                hVar.f31480m = 1.2f;
            }
            this.f26534s.f31474f = getMeasuredWidth();
            this.f26534s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26528a;
        this.f26528a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26529b;
            if (f7 != f10) {
                float f11 = this.f26530c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f26530c = f10;
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
            float f13 = this.f26531f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f26531f = f14;
                if (f14 <= 0.0f) {
                    this.f26531f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26532n = i10;
    }
}
