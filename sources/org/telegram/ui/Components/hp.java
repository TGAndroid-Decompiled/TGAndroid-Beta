package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class hp extends tv0 {
    public final int f29165a;
    public boolean f29166b;
    public long f29167c;
    public boolean d;
    public float f29168e;
    public int f29169f;
    public final Paint f29170g;
    public final Object h;

    public hp() {
        this.f29165a = 0;
        this.f29167c = 0L;
        this.f29166b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f29170g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.2f));
    }

    @Override
    public final void b(int i9) {
        switch (this.f29165a) {
            case 0:
                if (this.f29169f != i9) {
                    ((Paint) this.h).setColor(i9);
                    this.f29170g.setColor(i9);
                }
                this.f29169f = i9;
                return;
            default:
                Paint paint = this.f29170g;
                if (paint != null) {
                    paint.setColor(i9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f29165a) {
            case 0:
                return;
            default:
                this.f29166b = z10;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f29165a) {
            case 0:
                this.f29167c = System.currentTimeMillis();
                this.f29166b = true;
                invalidateSelf();
                return;
            default:
                this.f29167c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float dp;
        float dpf2;
        switch (this.f29165a) {
            case 0:
                float min = Math.min(this.f29168e, 1.0f);
                gr grVar = gr.f28846i;
                int i9 = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i9 < 0) {
                    f10 = min / 0.3f;
                } else {
                    f10 = 1.0f;
                }
                float interpolation = grVar.getInterpolation(f10);
                gr grVar2 = gr.f28845g;
                if (i9 < 0) {
                    f11 = 0.0f;
                } else {
                    f11 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = grVar2.getInterpolation(f11);
                if (this.d) {
                    dp = e2.c.z(1.0f, interpolation, AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f), AndroidUtilities.dp(2.1f) * interpolation);
                    dpf2 = (1.0f - grVar2.getInterpolation(this.f29168e / 2.0f)) * AndroidUtilities.dpf2(1.5f);
                } else {
                    dp = ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f)) * interpolation) + ((1.0f - interpolation) * AndroidUtilities.dp(2.1f));
                    dpf2 = AndroidUtilities.dpf2(1.5f) * gr.h.getInterpolation(this.f29168e / 2.0f);
                }
                float dp2 = AndroidUtilities.dp(11.0f) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(2.0f);
                float dpf23 = (AndroidUtilities.dpf2(0.5f) * interpolation) - (AndroidUtilities.dpf2(0.5f) * interpolation2);
                Paint paint = this.f29170g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.f6.f22997d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.f6.f22979c2;
                }
                if (paint.getStrokeWidth() != AndroidUtilities.dp(0.8f)) {
                    paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
                }
                for (int i10 = 0; i10 < 2; i10++) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(0.2f) + (paint.getStrokeWidth() / 2.0f) + dpf2 + (AndroidUtilities.dp(9.0f) * i10) + getBounds().left, AndroidUtilities.dpf2(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, dpf23, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(11.0f) - dpf23);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(dp, dp2, dpf22, paint2);
                    canvas.restore();
                }
                if (this.f29166b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - this.f29167c;
                    this.f29167c = currentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f12 = (((float) j10) / 500.0f) + this.f29168e;
                    this.f29168e = f12;
                    if (f12 >= 2.0f) {
                        this.f29168e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f29170g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.f6.f22997d2;
                }
                Paint paint4 = paint3;
                float f13 = 2.0f;
                if (paint4.getStrokeWidth() != AndroidUtilities.dp(2.0f)) {
                    paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
                }
                canvas.save();
                int dp3 = AndroidUtilities.dp(14.0f) / 2;
                if (this.f29166b) {
                    f13 = 1.0f;
                }
                canvas.translate(0.0f, AndroidUtilities.dp(f13) + dp3);
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        paint4.setAlpha((int) (this.f29169f * this.f29168e));
                    } else if (i11 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.f29168e) * this.f29169f));
                    } else {
                        paint4.setAlpha(this.f29169f);
                    }
                    float dp4 = (AndroidUtilities.dp(4.0f) * this.f29168e) + (AndroidUtilities.dp(4.0f) * i11);
                    float f14 = -dp4;
                    rectF2.set(f14, f14, dp4, dp4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = currentTimeMillis2 - this.f29167c;
                    this.f29167c = currentTimeMillis2;
                    if (j11 > 50) {
                        j11 = 50;
                    }
                    this.f29168e = (((float) j11) / 800.0f) + this.f29168e;
                    while (true) {
                        float f15 = this.f29168e;
                        if (f15 > 1.0f) {
                            this.f29168e = f15 - 1.0f;
                        } else {
                            a();
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void e() {
        switch (this.f29165a) {
            case 0:
                this.f29166b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f29165a) {
            case 0:
                return AndroidUtilities.dp(18.0f);
            default:
                return AndroidUtilities.dp(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f29165a) {
            case 0:
                return AndroidUtilities.dp(20.0f);
            default:
                return AndroidUtilities.dp(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29165a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f29165a) {
            case 0:
                return;
            default:
                this.f29169f = i9;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f29165a;
    }

    public hp(boolean z10) {
        this.f29165a = 1;
        this.f29166b = false;
        this.f29167c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f29169f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.f29170g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    private final void f(int i9) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
