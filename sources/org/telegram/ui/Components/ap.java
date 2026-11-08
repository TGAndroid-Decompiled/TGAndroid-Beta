package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class ap extends ou0 {
    public final int f31877a;
    public boolean f31878b;
    public long f31879c;
    public boolean d;
    public float f31880e;
    public int f31881f;
    public final Paint f31882g;
    public final Object h;

    public ap() {
        this.f31877a = 0;
        this.f31879c = 0L;
        this.f31878b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f31882g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.2f));
    }

    @Override
    public final void b(int i7) {
        switch (this.f31877a) {
            case 0:
                if (this.f31881f != i7) {
                    ((Paint) this.h).setColor(i7);
                    this.f31882g.setColor(i7);
                }
                this.f31881f = i7;
                return;
            default:
                Paint paint = this.f31882g;
                if (paint != null) {
                    paint.setColor(i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z9) {
        switch (this.f31877a) {
            case 0:
                return;
            default:
                this.f31878b = z9;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f31877a) {
            case 0:
                this.f31879c = System.currentTimeMillis();
                this.f31878b = true;
                invalidateSelf();
                return;
            default:
                this.f31879c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float L;
        float N;
        float f12;
        switch (this.f31877a) {
            case 0:
                float min = Math.min(this.f31880e, 1.0f);
                xq xqVar = xq.f40368i;
                int i7 = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i7 < 0) {
                    f10 = min / 0.3f;
                } else {
                    f10 = 1.0f;
                }
                float interpolation = xqVar.getInterpolation(f10);
                xq xqVar2 = xq.f40367g;
                if (i7 < 0) {
                    f11 = 0.0f;
                } else {
                    f11 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = xqVar2.getInterpolation(f11);
                if (this.d) {
                    L = com.google.android.recaptcha.internal.a.z(1.0f, interpolation, org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f), org.telegram.messenger.g0.L(2.1f) * interpolation);
                    N = (1.0f - xqVar2.getInterpolation(this.f31880e / 2.0f)) * org.telegram.messenger.g0.N(1.5f);
                } else {
                    L = ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f)) * interpolation) + ((1.0f - interpolation) * org.telegram.messenger.g0.L(2.1f));
                    N = org.telegram.messenger.g0.N(1.5f) * xq.h.getInterpolation(this.f31880e / 2.0f);
                }
                float f13 = 11.0f;
                float L2 = org.telegram.messenger.g0.L(11.0f) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(2.0f);
                float N3 = (org.telegram.messenger.g0.N(0.5f) * interpolation) - (org.telegram.messenger.g0.N(0.5f) * interpolation2);
                Paint paint = this.f31882g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.k6.d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.k6.f27830c2;
                }
                if (paint.getStrokeWidth() != org.telegram.messenger.g0.L(0.8f)) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
                }
                int i10 = 0;
                while (i10 < 2) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (org.telegram.messenger.g0.L(9.0f) * i10) + getBounds().left, org.telegram.messenger.g0.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, N3, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f12) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i10++;
                    f13 = f13;
                }
                if (this.f31878b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - this.f31879c;
                    this.f31879c = currentTimeMillis;
                    if (j3 > 50) {
                        j3 = 50;
                    }
                    float f14 = (((float) j3) / 500.0f) + this.f31880e;
                    this.f31880e = f14;
                    if (f14 >= 2.0f) {
                        this.f31880e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f31882g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.k6.d2;
                }
                Paint paint4 = paint3;
                float f15 = 2.0f;
                if (paint4.getStrokeWidth() != org.telegram.messenger.g0.L(2.0f)) {
                    paint4.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                }
                canvas.save();
                int L3 = org.telegram.messenger.g0.L(14.0f) / 2;
                if (this.f31878b) {
                    f15 = 1.0f;
                }
                canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) + L3);
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        paint4.setAlpha((int) (this.f31881f * this.f31880e));
                    } else if (i11 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.f31880e) * this.f31881f));
                    } else {
                        paint4.setAlpha(this.f31881f);
                    }
                    float L4 = (org.telegram.messenger.g0.L(4.0f) * this.f31880e) + (org.telegram.messenger.g0.L(4.0f) * i11);
                    float f16 = -L4;
                    rectF2.set(f16, f16, L4, L4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j10 = currentTimeMillis2 - this.f31879c;
                    this.f31879c = currentTimeMillis2;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    this.f31880e = (((float) j10) / 800.0f) + this.f31880e;
                    while (true) {
                        float f17 = this.f31880e;
                        if (f17 > 1.0f) {
                            this.f31880e = f17 - 1.0f;
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
        switch (this.f31877a) {
            case 0:
                this.f31878b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f31877a) {
            case 0:
                return org.telegram.messenger.g0.L(18.0f);
            default:
                return org.telegram.messenger.g0.L(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f31877a) {
            case 0:
                return org.telegram.messenger.g0.L(20.0f);
            default:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31877a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f31877a) {
            case 0:
                return;
            default:
                this.f31881f = i7;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f31877a;
    }

    public ap(boolean z9) {
        this.f31877a = 1;
        this.f31878b = false;
        this.f31879c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f31881f = 255;
        if (z9) {
            Paint paint = new Paint(1);
            this.f31882g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    private final void f(int i7) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z9) {
    }
}
