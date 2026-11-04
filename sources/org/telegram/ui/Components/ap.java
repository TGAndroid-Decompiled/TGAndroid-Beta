package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class ap extends nu0 {
    public final int f31960a;
    public boolean f31961b;
    public long f31962c;
    public boolean d;
    public float f31963e;
    public int f31964f;
    public final Paint f31965g;
    public final Object h;

    public ap() {
        this.f31960a = 0;
        this.f31962c = 0L;
        this.f31961b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f31965g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.2f));
    }

    @Override
    public final void b(int i3) {
        switch (this.f31960a) {
            case 0:
                if (this.f31964f != i3) {
                    ((Paint) this.h).setColor(i3);
                    this.f31965g.setColor(i3);
                }
                this.f31964f = i3;
                return;
            default:
                Paint paint = this.f31965g;
                if (paint != null) {
                    paint.setColor(i3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f31960a) {
            case 0:
                return;
            default:
                this.f31961b = z10;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f31960a) {
            case 0:
                this.f31962c = System.currentTimeMillis();
                this.f31961b = true;
                invalidateSelf();
                return;
            default:
                this.f31962c = System.currentTimeMillis();
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
        switch (this.f31960a) {
            case 0:
                float min = Math.min(this.f31963e, 1.0f);
                xq xqVar = xq.f40454i;
                int i3 = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i3 < 0) {
                    f10 = min / 0.3f;
                } else {
                    f10 = 1.0f;
                }
                float interpolation = xqVar.getInterpolation(f10);
                xq xqVar2 = xq.f40453g;
                if (i3 < 0) {
                    f11 = 0.0f;
                } else {
                    f11 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = xqVar2.getInterpolation(f11);
                if (this.d) {
                    L = com.google.android.recaptcha.internal.a.y(1.0f, interpolation, org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f), org.telegram.messenger.g0.L(2.1f) * interpolation);
                    N = (1.0f - xqVar2.getInterpolation(this.f31963e / 2.0f)) * org.telegram.messenger.g0.N(1.5f);
                } else {
                    L = ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f)) * interpolation) + ((1.0f - interpolation) * org.telegram.messenger.g0.L(2.1f));
                    N = org.telegram.messenger.g0.N(1.5f) * xq.h.getInterpolation(this.f31963e / 2.0f);
                }
                float f13 = 11.0f;
                float L2 = org.telegram.messenger.g0.L(11.0f) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(2.0f);
                float N3 = (org.telegram.messenger.g0.N(0.5f) * interpolation) - (org.telegram.messenger.g0.N(0.5f) * interpolation2);
                Paint paint = this.f31965g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.k6.f27874d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.k6.c2;
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
                if (this.f31961b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - this.f31962c;
                    this.f31962c = currentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f14 = (((float) j10) / 500.0f) + this.f31963e;
                    this.f31963e = f14;
                    if (f14 >= 2.0f) {
                        this.f31963e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f31965g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.k6.f27874d2;
                }
                Paint paint4 = paint3;
                float f15 = 2.0f;
                if (paint4.getStrokeWidth() != org.telegram.messenger.g0.L(2.0f)) {
                    paint4.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                }
                canvas.save();
                int L3 = org.telegram.messenger.g0.L(14.0f) / 2;
                if (this.f31961b) {
                    f15 = 1.0f;
                }
                canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) + L3);
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        paint4.setAlpha((int) (this.f31964f * this.f31963e));
                    } else if (i11 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.f31963e) * this.f31964f));
                    } else {
                        paint4.setAlpha(this.f31964f);
                    }
                    float L4 = (org.telegram.messenger.g0.L(4.0f) * this.f31963e) + (org.telegram.messenger.g0.L(4.0f) * i11);
                    float f16 = -L4;
                    rectF2.set(f16, f16, L4, L4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = currentTimeMillis2 - this.f31962c;
                    this.f31962c = currentTimeMillis2;
                    if (j11 > 50) {
                        j11 = 50;
                    }
                    this.f31963e = (((float) j11) / 800.0f) + this.f31963e;
                    while (true) {
                        float f17 = this.f31963e;
                        if (f17 > 1.0f) {
                            this.f31963e = f17 - 1.0f;
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
        switch (this.f31960a) {
            case 0:
                this.f31961b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f31960a) {
            case 0:
                return org.telegram.messenger.g0.L(18.0f);
            default:
                return org.telegram.messenger.g0.L(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f31960a) {
            case 0:
                return org.telegram.messenger.g0.L(20.0f);
            default:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31960a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f31960a) {
            case 0:
                return;
            default:
                this.f31964f = i3;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f31960a;
    }

    public ap(boolean z10) {
        this.f31960a = 1;
        this.f31961b = false;
        this.f31962c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f31964f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.f31965g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    private final void f(int i3) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
