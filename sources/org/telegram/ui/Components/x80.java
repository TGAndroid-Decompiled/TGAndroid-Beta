package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class x80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30280w;
    public long f30281a;
    public float f30282b;
    public float f30283c;
    public long d;
    public float e;
    public float f30284f;
    public int h;
    public int f30285n;
    public final RectF f30286r;
    public org.telegram.ui.Components.voip.h f30287s;

    public x80(Context context) {
        super(context);
        this.f30284f = 1.0f;
        this.f30286r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30280w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30280w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f30283c = f7;
        } else {
            this.f30283c = this.e;
        }
        if (f7 != 1.0f) {
            this.f30284f = 1.0f;
        }
        this.f30282b = f7;
        this.d = 0L;
        this.f30281a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30282b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30286r;
        if (i10 != 0 && this.e != 1.0f) {
            f30280w.setColor(i10);
            f30280w.setAlpha((int) (this.f30284f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30280w);
        }
        f30280w.setColor(this.f30285n);
        f30280w.setAlpha((int) (this.f30284f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30280w);
        if (this.f30284f > 0.0f) {
            if (this.f30287s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30287s = hVar;
                hVar.f29371k = false;
                hVar.f29374n = 0.8f;
                hVar.f29373m = 1.2f;
            }
            this.f30287s.f29367f = getMeasuredWidth();
            this.f30287s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30281a;
        this.f30281a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f30282b;
            if (f7 != f10) {
                float f11 = this.f30283c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f30283c = f10;
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
            float f13 = this.f30284f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30284f = f14;
                if (f14 <= 0.0f) {
                    this.f30284f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30285n = i10;
    }
}
