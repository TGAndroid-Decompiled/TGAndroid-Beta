package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class s90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f30501w;
    public long f30502a;
    public float f30503b;
    public float f30504c;
    public long d;
    public float f30505e;
    public float f30506f;
    public int h;
    public int f30507n;
    public final RectF f30508r;
    public org.telegram.ui.Components.voip.h f30509s;

    public s90(Context context) {
        super(context);
        this.f30506f = 1.0f;
        this.f30508r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f30501w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f30501w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f30505e = f7;
            this.f30504c = f7;
        } else {
            this.f30504c = this.f30505e;
        }
        if (f7 != 1.0f) {
            this.f30506f = 1.0f;
        }
        this.f30503b = f7;
        this.d = 0L;
        this.f30502a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f30503b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f30508r;
        if (i10 != 0 && this.f30505e != 1.0f) {
            f30501w.setColor(i10);
            f30501w.setAlpha((int) (this.f30506f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30501w);
        }
        f30501w.setColor(this.f30507n);
        f30501w.setAlpha((int) (this.f30506f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f30505e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f30501w);
        if (this.f30506f > 0.0f) {
            if (this.f30509s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f30509s = hVar;
                hVar.f31691k = false;
                hVar.f31694n = 0.8f;
                hVar.f31693m = 1.2f;
            }
            this.f30509s.f31687f = getMeasuredWidth();
            this.f30509s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30502a;
        this.f30502a = currentTimeMillis;
        float f7 = this.f30505e;
        if (f7 != 1.0f) {
            float f10 = this.f30503b;
            if (f7 != f10) {
                float f11 = this.f30504c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f30505e = f10;
                        this.f30504c = f10;
                        this.d = 0L;
                    } else {
                        this.f30505e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f30505e > 1.0f ? 1 : (this.f30505e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f30506f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f30506f = f14;
                if (f14 <= 0.0f) {
                    this.f30506f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f30507n = i10;
    }
}
