package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class ip extends rv0 {
    public final int f27136a;
    public boolean f27137b;
    public long f27138c;
    public boolean d;
    public float e;
    public int f27139f;
    public final Paint f27140g;
    public final Object h;

    public ip() {
        this.f27136a = 0;
        this.f27138c = 0L;
        this.f27137b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f27140g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.2f));
    }

    @Override
    public final void b(int i10) {
        switch (this.f27136a) {
            case 0:
                if (this.f27139f != i10) {
                    ((Paint) this.h).setColor(i10);
                    this.f27140g.setColor(i10);
                }
                this.f27139f = i10;
                return;
            default:
                Paint paint = this.f27140g;
                if (paint != null) {
                    paint.setColor(i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f27136a) {
            case 0:
                return;
            default:
                this.f27137b = z10;
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f27136a) {
            case 0:
                this.f27138c = System.currentTimeMillis();
                this.f27137b = true;
                invalidateSelf();
                return;
            default:
                this.f27138c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        float L;
        float N;
        float f11;
        switch (this.f27136a) {
            case 0:
                float min = Math.min(this.e, 1.0f);
                gr grVar = gr.f26525i;
                int i10 = (min > 0.3f ? 1 : (min == 0.3f ? 0 : -1));
                if (i10 < 0) {
                    f7 = min / 0.3f;
                } else {
                    f7 = 1.0f;
                }
                float interpolation = grVar.getInterpolation(f7);
                gr grVar2 = gr.f26524g;
                if (i10 < 0) {
                    f10 = 0.0f;
                } else {
                    f10 = (min - 0.3f) / 0.7f;
                }
                float interpolation2 = grVar2.getInterpolation(f10);
                if (this.d) {
                    L = c3.i0.z(1.0f, interpolation, org.telegram.messenger.i0.L(7.0f) - org.telegram.messenger.i0.L(2.1f), org.telegram.messenger.i0.L(2.1f) * interpolation);
                    N = (1.0f - grVar2.getInterpolation(this.e / 2.0f)) * org.telegram.messenger.i0.N(1.5f);
                } else {
                    L = ((org.telegram.messenger.i0.L(7.0f) - org.telegram.messenger.i0.L(2.1f)) * interpolation) + ((1.0f - interpolation) * org.telegram.messenger.i0.L(2.1f));
                    N = org.telegram.messenger.i0.N(1.5f) * gr.h.getInterpolation(this.e / 2.0f);
                }
                float f12 = 11.0f;
                float L2 = org.telegram.messenger.i0.L(11.0f) / 2.0f;
                float N2 = org.telegram.messenger.i0.N(2.0f);
                float N3 = (org.telegram.messenger.i0.N(0.5f) * interpolation) - (org.telegram.messenger.i0.N(0.5f) * interpolation2);
                Paint paint = this.f27140g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.t6.f20926d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.t6.f20907c2;
                }
                if (paint.getStrokeWidth() != org.telegram.messenger.i0.L(0.8f)) {
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(0.8f));
                }
                int i11 = 0;
                while (i11 < 2) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (org.telegram.messenger.i0.L(9.0f) * i11) + getBounds().left, org.telegram.messenger.i0.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, N3, org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(f11) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i11++;
                    f12 = f12;
                }
                if (this.f27137b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - this.f27138c;
                    this.f27138c = currentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f13 = (((float) j10) / 500.0f) + this.e;
                    this.e = f13;
                    if (f13 >= 2.0f) {
                        this.e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f27140g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.t6.f20926d2;
                }
                Paint paint4 = paint3;
                float f14 = 2.0f;
                if (paint4.getStrokeWidth() != org.telegram.messenger.i0.L(2.0f)) {
                    paint4.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                }
                canvas.save();
                int L3 = org.telegram.messenger.i0.L(14.0f) / 2;
                if (this.f27137b) {
                    f14 = 1.0f;
                }
                canvas.translate(0.0f, org.telegram.messenger.i0.L(f14) + L3);
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i12 == 0) {
                        paint4.setAlpha((int) (this.f27139f * this.e));
                    } else if (i12 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.e) * this.f27139f));
                    } else {
                        paint4.setAlpha(this.f27139f);
                    }
                    float L4 = (org.telegram.messenger.i0.L(4.0f) * this.e) + (org.telegram.messenger.i0.L(4.0f) * i12);
                    float f15 = -L4;
                    rectF2.set(f15, f15, L4, L4);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = currentTimeMillis2 - this.f27138c;
                    this.f27138c = currentTimeMillis2;
                    if (j11 > 50) {
                        j11 = 50;
                    }
                    this.e = (((float) j11) / 800.0f) + this.e;
                    while (true) {
                        float f16 = this.e;
                        if (f16 > 1.0f) {
                            this.e = f16 - 1.0f;
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
        switch (this.f27136a) {
            case 0:
                this.f27137b = false;
                return;
            default:
                this.d = false;
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f27136a) {
            case 0:
                return org.telegram.messenger.i0.L(18.0f);
            default:
                return org.telegram.messenger.i0.L(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f27136a) {
            case 0:
                return org.telegram.messenger.i0.L(20.0f);
            default:
                return org.telegram.messenger.i0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27136a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27136a) {
            case 0:
                return;
            default:
                this.f27139f = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f27136a;
    }

    public ip(boolean z10) {
        this.f27136a = 1;
        this.f27137b = false;
        this.f27138c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f27139f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.f27140g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
