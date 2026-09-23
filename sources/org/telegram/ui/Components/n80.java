package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class n80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f26369w;
    public long f26370a;
    public float f26371b;
    public float f26372c;
    public long d;
    public float e;
    public float f26373f;
    public int h;
    public int f26374n;
    public final RectF f26375r;
    public org.telegram.ui.Components.voip.h f26376s;

    public n80(Context context) {
        super(context);
        this.f26373f = 1.0f;
        this.f26375r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26369w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26369w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26372c = f7;
        } else {
            this.f26372c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26373f = 1.0f;
        }
        this.f26371b = f7;
        this.d = 0L;
        this.f26370a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26371b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26375r;
        if (i10 != 0 && this.e != 1.0f) {
            f26369w.setColor(i10);
            f26369w.setAlpha((int) (this.f26373f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26369w);
        }
        f26369w.setColor(this.f26374n);
        f26369w.setAlpha((int) (this.f26373f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26369w);
        if (this.f26373f > 0.0f) {
            if (this.f26376s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26376s = hVar;
                hVar.f28940k = false;
                hVar.f28943n = 0.8f;
                hVar.f28942m = 1.2f;
            }
            this.f26376s.f28936f = getMeasuredWidth();
            this.f26376s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f26370a;
        this.f26370a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26371b;
            if (f7 != f10) {
                float f11 = this.f26372c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f26372c = f10;
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
            float f13 = this.f26373f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f26373f = f14;
                if (f14 <= 0.0f) {
                    this.f26373f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26374n = i10;
    }
}
