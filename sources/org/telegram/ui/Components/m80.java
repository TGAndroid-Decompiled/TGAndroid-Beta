package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class m80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f26117w;
    public long f26118a;
    public float f26119b;
    public float f26120c;
    public long d;
    public float e;
    public float f26121f;
    public int h;
    public int f26122n;
    public final RectF f26123r;
    public org.telegram.ui.Components.voip.h f26124s;

    public m80(Context context) {
        super(context);
        this.f26121f = 1.0f;
        this.f26123r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26117w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26117w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26120c = f7;
        } else {
            this.f26120c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26121f = 1.0f;
        }
        this.f26119b = f7;
        this.d = 0L;
        this.f26118a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26119b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26123r;
        if (i10 != 0 && this.e != 1.0f) {
            f26117w.setColor(i10);
            f26117w.setAlpha((int) (this.f26121f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26117w);
        }
        f26117w.setColor(this.f26122n);
        f26117w.setAlpha((int) (this.f26121f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26117w);
        if (this.f26121f > 0.0f) {
            if (this.f26124s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26124s = hVar;
                hVar.f28966k = false;
                hVar.f28969n = 0.8f;
                hVar.f28968m = 1.2f;
            }
            this.f26124s.f28962f = getMeasuredWidth();
            this.f26124s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f26118a;
        this.f26118a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26119b;
            if (f7 != f10) {
                float f11 = this.f26120c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f26120c = f10;
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
            float f13 = this.f26121f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f26121f = f14;
                if (f14 <= 0.0f) {
                    this.f26121f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26122n = i10;
    }
}
