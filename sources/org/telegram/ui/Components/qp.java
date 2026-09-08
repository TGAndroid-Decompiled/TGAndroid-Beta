package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class qp extends kw0 {
    public final int f29815a;
    public boolean f29816b;
    public long f29817c;
    public boolean d;
    public float f29818e;
    public int f29819f;
    public final Paint f29820g;
    public final Object h;

    public qp() {
        this.f29815a = 0;
        this.f29817c = 0L;
        this.f29816b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f29820g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.2f));
    }

    @Override
    public final void b(int i10) {
        switch (this.f29815a) {
            case 0:
                if (this.f29819f != i10) {
                    ((Paint) this.h).setColor(i10);
                    this.f29820g.setColor(i10);
                }
                this.f29819f = i10;
                return;
            default:
                Paint paint = this.f29820g;
                if (paint != null) {
                    paint.setColor(i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f29815a) {
            case 0:
                return;
            default:
                this.f29816b = z10;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f29815a) {
            case 0:
                this.f29817c = System.currentTimeMillis();
                this.f29816b = true;
                invalidateSelf();
                return;
            default:
                this.f29817c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        float dp;
        float dpf2;
        switch (this.f29815a) {
            case 0:
                float min = Math.min(this.f29818e, 1.0f);
                pr prVar = pr.f29495i;
                int i10 = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i10 < 0) {
                    f7 = min / 0.3f;
                } else {
                    f7 = 1.0f;
                }
                float interpolation = prVar.getInterpolation(f7);
                pr prVar2 = pr.f29494g;
                if (i10 < 0) {
                    f10 = 0.0f;
                } else {
                    f10 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = prVar2.getInterpolation(f10);
                if (this.d) {
                    dp = com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f), AndroidUtilities.dp(2.1f) * interpolation);
                    dpf2 = (1.0f - prVar2.getInterpolation(this.f29818e / 2.0f)) * AndroidUtilities.dpf2(1.5f);
                } else {
                    dp = ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f)) * interpolation) + ((1.0f - interpolation) * AndroidUtilities.dp(2.1f));
                    dpf2 = AndroidUtilities.dpf2(1.5f) * pr.h.getInterpolation(this.f29818e / 2.0f);
                }
                float dp2 = AndroidUtilities.dp(11.0f) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(2.0f);
                float dpf23 = (AndroidUtilities.dpf2(0.5f) * interpolation) - (AndroidUtilities.dpf2(0.5f) * interpolation2);
                Paint paint = this.f29820g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.j6.f20686d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.j6.f20668c2;
                }
                if (paint.getStrokeWidth() != AndroidUtilities.dp(0.8f)) {
                    paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(0.2f) + (paint.getStrokeWidth() / 2.0f) + dpf2 + (AndroidUtilities.dp(9.0f) * i11) + getBounds().left, AndroidUtilities.dpf2(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, dpf23, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(11.0f) - dpf23);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(dp, dp2, dpf22, paint2);
                    canvas.restore();
                }
                if (this.f29816b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - this.f29817c;
                    this.f29817c = currentTimeMillis;
                    if (j3 > 50) {
                        j3 = 50;
                    }
                    float f11 = (((float) j3) / 500.0f) + this.f29818e;
                    this.f29818e = f11;
                    if (f11 >= 2.0f) {
                        this.f29818e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f29820g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.j6.f20686d2;
                }
                Paint paint4 = paint3;
                float f12 = 2.0f;
                if (paint4.getStrokeWidth() != AndroidUtilities.dp(2.0f)) {
                    paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
                }
                canvas.save();
                int dp3 = AndroidUtilities.dp(14.0f) / 2;
                if (this.f29816b) {
                    f12 = 1.0f;
                }
                canvas.translate(0.0f, AndroidUtilities.dp(f12) + dp3);
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i12 == 0) {
                        paint4.setAlpha((int) (this.f29819f * this.f29818e));
                    } else if (i12 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.f29818e) * this.f29819f));
                    } else {
                        paint4.setAlpha(this.f29819f);
                    }
                    float dp4 = (AndroidUtilities.dp(4.0f) * this.f29818e) + (AndroidUtilities.dp(4.0f) * i12);
                    float f13 = -dp4;
                    rectF2.set(f13, f13, dp4, dp4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j10 = currentTimeMillis2 - this.f29817c;
                    this.f29817c = currentTimeMillis2;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    this.f29818e = (((float) j10) / 800.0f) + this.f29818e;
                    while (true) {
                        float f14 = this.f29818e;
                        if (f14 > 1.0f) {
                            this.f29818e = f14 - 1.0f;
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
        switch (this.f29815a) {
            case 0:
                this.f29816b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f29815a) {
            case 0:
                return AndroidUtilities.dp(18.0f);
            default:
                return AndroidUtilities.dp(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f29815a) {
            case 0:
                return AndroidUtilities.dp(20.0f);
            default:
                return AndroidUtilities.dp(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29815a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29815a) {
            case 0:
                return;
            default:
                this.f29819f = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f29815a;
    }

    public qp(boolean z10) {
        this.f29815a = 1;
        this.f29816b = false;
        this.f29817c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f29819f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.f29820g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    private final void f(int i10) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
