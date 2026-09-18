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
    public static Paint f26102w;
    public long f26103a;
    public float f26104b;
    public float f26105c;
    public long d;
    public float e;
    public float f26106f;
    public int h;
    public int f26107n;
    public final RectF f26108r;
    public org.telegram.ui.Components.voip.h f26109s;

    public m80(Context context) {
        super(context);
        this.f26106f = 1.0f;
        this.f26108r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f26102w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f26102w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f26105c = f7;
        } else {
            this.f26105c = this.e;
        }
        if (f7 != 1.0f) {
            this.f26106f = 1.0f;
        }
        this.f26104b = f7;
        this.d = 0L;
        this.f26103a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f26104b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f26108r;
        if (i10 != 0 && this.e != 1.0f) {
            f26102w.setColor(i10);
            f26102w.setAlpha((int) (this.f26106f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26102w);
        }
        f26102w.setColor(this.f26107n);
        f26102w.setAlpha((int) (this.f26106f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f26102w);
        if (this.f26106f > 0.0f) {
            if (this.f26109s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f26109s = hVar;
                hVar.f28949k = false;
                hVar.f28952n = 0.8f;
                hVar.f28951m = 1.2f;
            }
            this.f26109s.f28945f = getMeasuredWidth();
            this.f26109s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f26103a;
        this.f26103a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f26104b;
            if (f7 != f10) {
                float f11 = this.f26105c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.f26105c = f10;
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
            float f13 = this.f26106f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f26106f = f14;
                if (f14 <= 0.0f) {
                    this.f26106f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f26107n = i10;
    }
}
