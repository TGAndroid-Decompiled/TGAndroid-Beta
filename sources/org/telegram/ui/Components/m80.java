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
    public static Paint f28433w;
    public long f28434a;
    public float f28435b;
    public float f28436c;
    public long d;
    public float f28437e;
    public float f28438f;
    public int h;
    public int f28439n;
    public final RectF f28440r;
    public org.telegram.ui.Components.voip.h f28441s;

    public m80(Context context) {
        super(context);
        this.f28438f = 1.0f;
        this.f28440r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f28433w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f28433w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f28437e = f7;
            this.f28436c = f7;
        } else {
            this.f28436c = this.f28437e;
        }
        if (f7 != 1.0f) {
            this.f28438f = 1.0f;
        }
        this.f28435b = f7;
        this.d = 0L;
        this.f28434a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f28435b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f28440r;
        if (i10 != 0 && this.f28437e != 1.0f) {
            f28433w.setColor(i10);
            f28433w.setAlpha((int) (this.f28438f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28433w);
        }
        f28433w.setColor(this.f28439n);
        f28433w.setAlpha((int) (this.f28438f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f28437e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f28433w);
        if (this.f28438f > 0.0f) {
            if (this.f28441s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f28441s = hVar;
                hVar.f31534k = false;
                hVar.f31537n = 0.8f;
                hVar.f31536m = 1.2f;
            }
            this.f28441s.f31530f = getMeasuredWidth();
            this.f28441s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f28434a;
        this.f28434a = currentTimeMillis;
        float f7 = this.f28437e;
        if (f7 != 1.0f) {
            float f10 = this.f28435b;
            if (f7 != f10) {
                float f11 = this.f28436c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f28437e = f10;
                        this.f28436c = f10;
                        this.d = 0L;
                    } else {
                        this.f28437e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f28437e > 1.0f ? 1 : (this.f28437e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f28438f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f28438f = f14;
                if (f14 <= 0.0f) {
                    this.f28438f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f28439n = i10;
    }
}
