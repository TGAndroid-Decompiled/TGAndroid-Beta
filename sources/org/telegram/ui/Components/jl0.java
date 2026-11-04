package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class jl0 extends Drawable {
    public final Paint f35102b;
    public boolean f35105f;
    public int f35108j;
    public boolean f35111m;
    public ci.c8 f35113o;
    public float f35114p;
    public float f35115q;
    public float f35116r;
    public int f35101a = 255;
    public final Path f35103c = new Path();
    public final RectF d = new RectF();
    public long f35104e = -1;
    public float f35106g = 0.0f;
    public float h = 0.0f;
    public final float[] f35107i = new float[2];
    public int f35109k = 0;
    public boolean f35110l = false;
    public final u5 f35112n = new u5(1.0f, new jb0(this, 19), 0, 350, xq.h);

    public jl0() {
        Paint paint = new Paint(1);
        this.f35102b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.333f));
    }

    public final void a(int i3) {
        Paint paint = this.f35102b;
        paint.setColor(i3);
        this.f35101a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i3) {
        c(i3, true, false);
    }

    public final void c(int i3, boolean z10, boolean z11) {
        if (this.f35109k == i3) {
            if (i3 != 2) {
                org.telegram.messenger.g0.r(this.f35113o);
                this.f35113o = null;
            }
        } else if (!z11 && i3 == 2) {
            if (this.f35113o == null) {
                ci.c8 c8Var = new ci.c8(this, i3, z10, 5);
                this.f35113o = c8Var;
                org.telegram.messenger.g0.i3(c8Var, 65L);
            }
        } else {
            ci.c8 c8Var2 = this.f35113o;
            if (c8Var2 != null) {
                org.telegram.messenger.g0.r(c8Var2);
            }
            u5 u5Var = this.f35112n;
            boolean z12 = false;
            if (u5Var.f38645c < 1.0f && z10) {
                c(this.f35109k, false, false);
            }
            if (i3 == 2) {
                this.f35106g = 180.0f;
                this.f35104e = -1L;
            } else if (this.f35109k == 2) {
                if (i3 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i10 = this.f35109k;
                this.f35108j = i10;
                this.f35109k = i3;
                if (i10 == 2 && i3 != 2) {
                    z12 = true;
                }
                this.f35110l = z12;
                u5Var.e(true, 0.0f);
            } else {
                this.f35109k = i3;
                this.f35108j = i3;
                this.f35110l = false;
                u5Var.e(true, 1.0f);
            }
            invalidateSelf();
        }
    }

    public final float d(float f10) {
        return a1.g.D(0.5f, f10, this.f35114p, this.f35115q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        ?? r19;
        float f14;
        float d;
        ?? r23;
        float d10;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        boolean z11;
        float d11;
        Rect bounds = getBounds();
        this.f35114p = Math.min(bounds.width(), bounds.height());
        this.f35115q = bounds.centerX();
        this.f35116r = bounds.centerY();
        int i3 = this.f35101a;
        if (i3 < 255) {
            float f19 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f19, i3, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f35110l) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float e10 = this.f35112n.e(false, f10);
        int i10 = this.f35109k;
        int i11 = this.f35108j;
        if (i10 == 0) {
            if (i11 == 0) {
                f11 = 1.0f;
            } else {
                f11 = e10;
            }
        } else if (i11 == 0) {
            f11 = 1.0f - e10;
        } else {
            f11 = 0.0f;
        }
        int i12 = this.f35108j;
        if (i10 == 1) {
            if (i12 == 1) {
                f12 = 1.0f;
            } else {
                f12 = e10;
            }
        } else if (i12 == 1) {
            f12 = 1.0f - e10;
        } else {
            f12 = 0.0f;
        }
        if (i10 == 2) {
            if (this.f35108j == 2) {
                f13 = 1.0f;
            } else {
                f13 = e10;
            }
        } else if (this.f35108j == 2) {
            f13 = 1.0f - e10;
        } else {
            f13 = 0.0f;
        }
        int i13 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        Paint paint = this.f35102b;
        if (i13 > 0) {
            boolean z12 = true;
            float T1 = org.telegram.messenger.g0.T1(d(0.25f), d(0.444f), f11);
            float T12 = org.telegram.messenger.g0.T1(e(0.5f), e(0.444f), f11);
            float T13 = org.telegram.messenger.g0.T1(0.0f, this.f35114p * 0.208f, f11);
            r19 = z12;
            if (T13 >= this.f35114p * 0.075f) {
                canvas2.drawCircle(T1, T12, T13, paint);
                r19 = z12;
            }
        } else {
            r19 = 1;
        }
        if (i13 <= 0 && f12 <= 0.0f) {
            f14 = 45.0f;
            f16 = 0.0f;
            r23 = 0;
            f18 = 0.25f;
            f15 = f13;
            f17 = 0.5f;
        } else {
            canvas2.save();
            f14 = 45.0f;
            canvas2.rotate(f11 * 45.0f, this.f35115q, this.f35116r);
            float d12 = d(0.914f);
            float d13 = d(0.7638f);
            if (this.f35108j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f20 = (d * f13) + (d13 * f12) + (d12 * f11);
            float e11 = e(0.5f);
            float d14 = d(0.658f);
            float d15 = d(0.2409f);
            r23 = 0;
            if (this.f35108j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f21 = (d10 * f13) + (d15 * f12) + (d14 * f11);
            float e12 = e(0.5f);
            if (a7.h.a(f20, e11, f21, e12) <= this.f35114p * 0.075f) {
                f15 = f13;
                f16 = 0.0f;
                f17 = 0.5f;
                f18 = 0.25f;
            } else {
                f15 = f13;
                f16 = 0.0f;
                f17 = 0.5f;
                f18 = 0.25f;
                canvas2.drawLine(f20, e11, f21, e12, paint);
            }
            canvas2.restore();
        }
        if (f12 > f16) {
            if (this.f35108j == 2) {
                d11 = org.telegram.messenger.g0.T1(d(0.75f), d(0.2409f), f12);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f11 * f14, this.f35115q, this.f35116r);
            float d16 = (d(0.2452f) * f12) + d11;
            float T14 = org.telegram.messenger.g0.T1(e(f17), e(f18), f12);
            float e13 = e(f17);
            float d17 = (d(0.2452f) * f12) + d11;
            float T15 = org.telegram.messenger.g0.T1(e(f17), e(0.75f), f12);
            if (Math.max(a7.h.a(d16, T14, d11, e13), a7.h.a(d17, T15, d11, e13)) > this.f35114p * 0.075f) {
                Path path = this.f35103c;
                path.rewind();
                path.moveTo(d16, T14);
                path.lineTo(d11, e13);
                path.lineTo(d17, T15);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f15 > f16) {
            if (this.f35104e < 0 && f15 > 0.8f) {
                this.f35104e = System.currentTimeMillis();
                this.f35111m = this.f35110l;
            }
            if (this.f35104e > 0) {
                float[] fArr = this.f35107i;
                cp.a(((float) (System.currentTimeMillis() - this.f35104e)) % 5400.0f, fArr);
                float f22 = fArr[r23];
                float f23 = fArr[r19];
                if (this.f35109k != 2 && !this.f35110l) {
                    float max = Math.max(f16, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = org.telegram.messenger.g0.T1(f23, Math.min(f22, max + this.h), f15);
                }
                float f24 = this.h;
                float f25 = this.f35106g;
                float f26 = f25 + f22;
                float f27 = f25 + f23;
                float f28 = f26 % 360.0f;
                if (f28 < 0.0f) {
                    f28 += 360.0f;
                }
                float f29 = f27 % 360.0f;
                if (f29 < 0.0f) {
                    f29 += 360.0f;
                }
                if (f28 <= f29 ? f24 < f28 || f24 > f29 : f24 < f28 && f24 > f29) {
                    z10 = r23;
                } else {
                    z10 = r19;
                }
                boolean z13 = this.f35110l;
                if (z13 && !this.f35111m) {
                    this.f35111m = z13;
                    this.f35105f = z10;
                }
                if (this.f35105f && !z10) {
                    z11 = r23;
                    this.f35105f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f35105f) {
                    this.f35110l = z11;
                }
                float d18 = d(f18);
                float e14 = e(f18);
                float d19 = d(0.75f);
                float e15 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d18, e14, d19, e15);
                canvas2.drawArc(rectF, this.f35106g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.f35101a < 255) {
            canvas.restore();
        }
        if (e10 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return a1.g.D(0.5f, f10, this.f35114p, this.f35116r);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f35101a = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35102b.setColorFilter(colorFilter);
    }
}
