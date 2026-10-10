package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class p90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f29722w;
    public long f29723a;
    public float f29724b;
    public float f29725c;
    public long d;
    public float f29726e;
    public float f29727f;
    public int h;
    public int f29728n;
    public final RectF f29729r;
    public org.telegram.ui.Components.voip.h f29730s;

    public p90(Context context) {
        super(context);
        this.f29727f = 1.0f;
        this.f29729r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f29722w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f29722w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.f29726e = f7;
            this.f29725c = f7;
        } else {
            this.f29725c = this.f29726e;
        }
        if (f7 != 1.0f) {
            this.f29727f = 1.0f;
        }
        this.f29724b = f7;
        this.d = 0L;
        this.f29723a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f29724b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f29729r;
        if (i10 != 0 && this.f29726e != 1.0f) {
            f29722w.setColor(i10);
            f29722w.setAlpha((int) (this.f29727f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29722w);
        }
        f29722w.setColor(this.f29728n);
        f29722w.setAlpha((int) (this.f29727f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f29726e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29722w);
        if (this.f29727f > 0.0f) {
            if (this.f29730s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f29730s = hVar;
                hVar.f32024k = false;
                hVar.f32027n = 0.8f;
                hVar.f32026m = 1.2f;
            }
            this.f29730s.f32020f = getMeasuredWidth();
            this.f29730s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f29723a;
        this.f29723a = currentTimeMillis;
        float f7 = this.f29726e;
        if (f7 != 1.0f) {
            float f10 = this.f29724b;
            if (f7 != f10) {
                float f11 = this.f29725c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.f29726e = f10;
                        this.f29725c = f10;
                        this.d = 0L;
                    } else {
                        this.f29726e = (v.getInterpolation(((float) j10) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.f29726e > 1.0f ? 1 : (this.f29726e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f29727f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j3) / 200.0f);
                this.f29727f = f14;
                if (f14 <= 0.0f) {
                    this.f29727f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f29728n = i10;
    }
}
