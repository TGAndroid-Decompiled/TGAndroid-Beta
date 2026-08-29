package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class i80 extends View {
    public static DecelerateInterpolator v;
    public static Paint f29340w;
    public long f29341a;
    public float f29342b;
    public float f29343c;
    public long d;
    public float f29344e;
    public float f29345f;
    public int h;
    public int f29346n;
    public final RectF f29347r;
    public org.telegram.ui.Components.voip.h f29348s;

    public i80(Context context) {
        super(context);
        this.f29345f = 1.0f;
        this.f29347r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f29340w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f29340w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f9, boolean z10) {
        if (!z10) {
            this.f29344e = f9;
            this.f29343c = f9;
        } else {
            this.f29343c = this.f29344e;
        }
        if (f9 != 1.0f) {
            this.f29345f = 1.0f;
        }
        this.f29342b = f9;
        this.d = 0L;
        this.f29341a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f29342b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f29347r;
        if (i10 != 0 && this.f29344e != 1.0f) {
            f29340w.setColor(i10);
            f29340w.setAlpha((int) (this.f29345f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29340w);
        }
        f29340w.setColor(this.f29346n);
        f29340w.setAlpha((int) (this.f29345f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f29344e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29340w);
        if (this.f29345f > 0.0f) {
            if (this.f29348s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f29348s = hVar;
                hVar.f33724k = false;
                hVar.f33727n = 0.8f;
                hVar.f33726m = 1.2f;
            }
            this.f29348s.f33720f = getMeasuredWidth();
            this.f29348s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29341a;
        this.f29341a = currentTimeMillis;
        float f9 = this.f29344e;
        if (f9 != 1.0f) {
            float f10 = this.f29342b;
            if (f9 != f10) {
                float f11 = this.f29343c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f29344e = f10;
                        this.f29343c = f10;
                        this.d = 0L;
                    } else {
                        this.f29344e = (v.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f29344e > 1.0f ? 1 : (this.f29344e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f29345f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f29345f = f14;
                if (f14 <= 0.0f) {
                    this.f29345f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f29346n = i10;
    }
}
