package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class im0 extends Drawable {
    public final Paint f27019b;
    public boolean f27021f;
    public int f27024j;
    public boolean f27027m;
    public i2.j0 f27029o;
    public float f27030p;
    public float f27031q;
    public float f27032r;
    public int f27018a = 255;
    public final Path f27020c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float f27022g = 0.0f;
    public float h = 0.0f;
    public final float[] f27023i = new float[2];
    public int f27025k = 0;
    public boolean f27026l = false;
    public final t5 f27028n = new t5(1.0f, new eb0(this, 22), 0, 350, gr.h);

    public im0() {
        Paint paint = new Paint(1);
        this.f27019b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f27019b;
        paint.setColor(i10);
        this.f27018a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f27025k == i10) {
            if (i10 != 2) {
                org.telegram.messenger.i0.r(this.f27029o);
                this.f27029o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f27029o == null) {
                i2.j0 j0Var = new i2.j0(this, i10, z10, 4);
                this.f27029o = j0Var;
                org.telegram.messenger.i0.h3(j0Var, 65L);
            }
        } else {
            i2.j0 j0Var2 = this.f27029o;
            if (j0Var2 != null) {
                org.telegram.messenger.i0.r(j0Var2);
            }
            t5 t5Var = this.f27028n;
            boolean z12 = false;
            if (t5Var.f30445c < 1.0f && z10) {
                c(this.f27025k, false, false);
            }
            if (i10 == 2) {
                this.f27022g = 180.0f;
                this.e = -1L;
            } else if (this.f27025k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f27025k;
                this.f27024j = i11;
                this.f27025k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f27026l = z12;
                t5Var.e(true, 0.0f);
            } else {
                this.f27025k = i10;
                this.f27024j = i10;
                this.f27026l = false;
                t5Var.e(true, 1.0f);
            }
            invalidateSelf();
        }
    }

    public final float d(float f7) {
        return sc.e.z(0.5f, f7, this.f27030p, this.f27031q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        ?? r19;
        float f13;
        float d;
        ?? r23;
        float d10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        boolean z11;
        float d11;
        Rect bounds = getBounds();
        this.f27030p = Math.min(bounds.width(), bounds.height());
        this.f27031q = bounds.centerX();
        this.f27032r = bounds.centerY();
        int i10 = this.f27018a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f27026l) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        float e = this.f27028n.e(false, f7);
        int i11 = this.f27025k;
        int i12 = this.f27024j;
        if (i11 == 0) {
            if (i12 == 0) {
                f10 = 1.0f;
            } else {
                f10 = e;
            }
        } else if (i12 == 0) {
            f10 = 1.0f - e;
        } else {
            f10 = 0.0f;
        }
        int i13 = this.f27024j;
        if (i11 == 1) {
            if (i13 == 1) {
                f11 = 1.0f;
            } else {
                f11 = e;
            }
        } else if (i13 == 1) {
            f11 = 1.0f - e;
        } else {
            f11 = 0.0f;
        }
        if (i11 == 2) {
            if (this.f27024j == 2) {
                f12 = 1.0f;
            } else {
                f12 = e;
            }
        } else if (this.f27024j == 2) {
            f12 = 1.0f - e;
        } else {
            f12 = 0.0f;
        }
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f27019b;
        if (i14 > 0) {
            boolean z12 = true;
            float T1 = org.telegram.messenger.i0.T1(d(0.25f), d(0.444f), f10);
            float T12 = org.telegram.messenger.i0.T1(e(0.5f), e(0.444f), f10);
            float T13 = org.telegram.messenger.i0.T1(0.0f, this.f27030p * 0.208f, f10);
            r19 = z12;
            if (T13 >= this.f27030p * 0.075f) {
                canvas2.drawCircle(T1, T12, T13, paint);
                r19 = z12;
            }
        } else {
            r19 = 1;
        }
        if (i14 <= 0 && f11 <= 0.0f) {
            f13 = 45.0f;
            f15 = 0.0f;
            r23 = 0;
            f17 = 0.25f;
            f14 = f12;
            f16 = 0.5f;
        } else {
            canvas2.save();
            f13 = 45.0f;
            canvas2.rotate(f10 * 45.0f, this.f27031q, this.f27032r);
            float d12 = d(0.914f);
            float d13 = d(0.7638f);
            if (this.f27024j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d13 * f11) + (d12 * f10);
            float e7 = e(0.5f);
            float d14 = d(0.658f);
            float d15 = d(0.2409f);
            r23 = 0;
            if (this.f27024j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d15 * f11) + (d14 * f10);
            float e10 = e(0.5f);
            if (w7.z8.a(f19, e7, f20, e10) <= this.f27030p * 0.075f) {
                f14 = f12;
                f15 = 0.0f;
                f16 = 0.5f;
                f17 = 0.25f;
            } else {
                f14 = f12;
                f15 = 0.0f;
                f16 = 0.5f;
                f17 = 0.25f;
                canvas2.drawLine(f19, e7, f20, e10, paint);
            }
            canvas2.restore();
        }
        if (f11 > f15) {
            if (this.f27024j == 2) {
                d11 = org.telegram.messenger.i0.T1(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f27031q, this.f27032r);
            float d16 = (d(0.2452f) * f11) + d11;
            float T14 = org.telegram.messenger.i0.T1(e(f16), e(f17), f11);
            float e11 = e(f16);
            float d17 = (d(0.2452f) * f11) + d11;
            float T15 = org.telegram.messenger.i0.T1(e(f16), e(0.75f), f11);
            if (Math.max(w7.z8.a(d16, T14, d11, e11), w7.z8.a(d17, T15, d11, e11)) > this.f27030p * 0.075f) {
                Path path = this.f27020c;
                path.rewind();
                path.moveTo(d16, T14);
                path.lineTo(d11, e11);
                path.lineTo(d17, T15);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f14 > f15) {
            if (this.e < 0 && f14 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.f27027m = this.f27026l;
            }
            if (this.e > 0) {
                float[] fArr = this.f27023i;
                kp.a(((float) (System.currentTimeMillis() - this.e)) % 5400.0f, fArr);
                float f21 = fArr[r23];
                float f22 = fArr[r19];
                if (this.f27025k != 2 && !this.f27026l) {
                    float max = Math.max(f15, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = org.telegram.messenger.i0.T1(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f27022g;
                float f25 = f24 + f21;
                float f26 = f24 + f22;
                float f27 = f25 % 360.0f;
                if (f27 < 0.0f) {
                    f27 += 360.0f;
                }
                float f28 = f26 % 360.0f;
                if (f28 < 0.0f) {
                    f28 += 360.0f;
                }
                if (f27 <= f28 ? f23 < f27 || f23 > f28 : f23 < f27 && f23 > f28) {
                    z10 = r23;
                } else {
                    z10 = r19;
                }
                boolean z13 = this.f27026l;
                if (z13 && !this.f27027m) {
                    this.f27027m = z13;
                    this.f27021f = z10;
                }
                if (this.f27021f && !z10) {
                    z11 = r23;
                    this.f27021f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f27021f) {
                    this.f27026l = z11;
                }
                float d18 = d(f17);
                float e12 = e(f17);
                float d19 = d(0.75f);
                float e13 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d18, e12, d19, e13);
                canvas2.drawArc(rectF, this.f27022g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f27018a < 255) {
            canvas.restore();
        }
        if (e < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return sc.e.z(0.5f, f7, this.f27030p, this.f27032r);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27018a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27019b.setColorFilter(colorFilter);
    }
}
