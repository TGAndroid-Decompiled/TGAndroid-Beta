package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ul0 extends Drawable {
    public final Paint f40479b;
    public boolean f40482f;
    public int f40485j;
    public boolean f40488m;
    public di.x7 f40490o;
    public float f40491p;
    public float f40492q;
    public float f40493r;
    public int f40478a = 255;
    public final Path f40480c = new Path();
    public final RectF d = new RectF();
    public long f40481e = -1;
    public float f40483g = 0.0f;
    public float h = 0.0f;
    public final float[] f40484i = new float[2];
    public int f40486k = 0;
    public boolean f40487l = false;
    public final d6 f40489n = new d6(1.0f, new hb0(this, 20), 0, 350, nr.h);

    public ul0() {
        Paint paint = new Paint(1);
        this.f40479b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.333f));
    }

    public final void a(int i7) {
        Paint paint = this.f40479b;
        paint.setColor(i7);
        this.f40478a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i7) {
        c(i7, true, false);
    }

    public final void c(int i7, boolean z10, boolean z11) {
        if (this.f40486k == i7) {
            if (i7 != 2) {
                org.telegram.messenger.g0.r(this.f40490o);
                this.f40490o = null;
            }
        } else if (!z11 && i7 == 2) {
            if (this.f40490o == null) {
                di.x7 x7Var = new di.x7(this, i7, z10, 5);
                this.f40490o = x7Var;
                org.telegram.messenger.g0.h3(x7Var, 65L);
            }
        } else {
            di.x7 x7Var2 = this.f40490o;
            if (x7Var2 != null) {
                org.telegram.messenger.g0.r(x7Var2);
            }
            d6 d6Var = this.f40489n;
            boolean z12 = false;
            if (d6Var.f34386c < 1.0f && z10) {
                c(this.f40486k, false, false);
            }
            if (i7 == 2) {
                this.f40483g = 180.0f;
                this.f40481e = -1L;
            } else if (this.f40486k == 2) {
                if (i7 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i10 = this.f40486k;
                this.f40485j = i10;
                this.f40486k = i7;
                if (i10 == 2 && i7 != 2) {
                    z12 = true;
                }
                this.f40487l = z12;
                d6Var.e(true, 0.0f);
            } else {
                this.f40486k = i7;
                this.f40485j = i7;
                this.f40487l = false;
                d6Var.e(true, 1.0f);
            }
            invalidateSelf();
        }
    }

    public final float d(float f10) {
        return com.google.android.gms.internal.vision.e2.t(0.5f, f10, this.f40491p, this.f40492q);
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
        float d2;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        boolean z11;
        float d10;
        Rect bounds = getBounds();
        this.f40491p = Math.min(bounds.width(), bounds.height());
        this.f40492q = bounds.centerX();
        this.f40493r = bounds.centerY();
        int i7 = this.f40478a;
        if (i7 < 255) {
            float f19 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f19, i7, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f40487l) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float e10 = this.f40489n.e(false, f10);
        int i10 = this.f40486k;
        int i11 = this.f40485j;
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
        int i12 = this.f40485j;
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
            if (this.f40485j == 2) {
                f13 = 1.0f;
            } else {
                f13 = e10;
            }
        } else if (this.f40485j == 2) {
            f13 = 1.0f - e10;
        } else {
            f13 = 0.0f;
        }
        int i13 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        Paint paint = this.f40479b;
        if (i13 > 0) {
            boolean z12 = true;
            float T1 = org.telegram.messenger.g0.T1(d(0.25f), d(0.444f), f11);
            float T12 = org.telegram.messenger.g0.T1(e(0.5f), e(0.444f), f11);
            float T13 = org.telegram.messenger.g0.T1(0.0f, this.f40491p * 0.208f, f11);
            r19 = z12;
            if (T13 >= this.f40491p * 0.075f) {
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
            canvas2.rotate(f11 * 45.0f, this.f40492q, this.f40493r);
            float d11 = d(0.914f);
            float d12 = d(0.7638f);
            if (this.f40485j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f20 = (d * f13) + (d12 * f12) + (d11 * f11);
            float e11 = e(0.5f);
            float d13 = d(0.658f);
            float d14 = d(0.2409f);
            r23 = 0;
            if (this.f40485j == 2) {
                d2 = d(0.75f);
            } else {
                d2 = d(0.2409f);
            }
            float f21 = (d2 * f13) + (d14 * f12) + (d13 * f11);
            float e12 = e(0.5f);
            if (a8.w9.a(f20, e11, f21, e12) <= this.f40491p * 0.075f) {
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
            if (this.f40485j == 2) {
                d10 = org.telegram.messenger.g0.T1(d(0.75f), d(0.2409f), f12);
            } else {
                d10 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f11 * f14, this.f40492q, this.f40493r);
            float d15 = (d(0.2452f) * f12) + d10;
            float T14 = org.telegram.messenger.g0.T1(e(f17), e(f18), f12);
            float e13 = e(f17);
            float d16 = (d(0.2452f) * f12) + d10;
            float T15 = org.telegram.messenger.g0.T1(e(f17), e(0.75f), f12);
            if (Math.max(a8.w9.a(d15, T14, d10, e13), a8.w9.a(d16, T15, d10, e13)) > this.f40491p * 0.075f) {
                Path path = this.f40480c;
                path.rewind();
                path.moveTo(d15, T14);
                path.lineTo(d10, e13);
                path.lineTo(d16, T15);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f15 > f16) {
            if (this.f40481e < 0 && f15 > 0.8f) {
                this.f40481e = System.currentTimeMillis();
                this.f40488m = this.f40487l;
            }
            if (this.f40481e > 0) {
                float[] fArr = this.f40484i;
                up.a(((float) (System.currentTimeMillis() - this.f40481e)) % 5400.0f, fArr);
                float f22 = fArr[r23];
                float f23 = fArr[r19];
                if (this.f40486k != 2 && !this.f40487l) {
                    float max = Math.max(f16, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = org.telegram.messenger.g0.T1(f23, Math.min(f22, max + this.h), f15);
                }
                float f24 = this.h;
                float f25 = this.f40483g;
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
                boolean z13 = this.f40487l;
                if (z13 && !this.f40488m) {
                    this.f40488m = z13;
                    this.f40482f = z10;
                }
                if (this.f40482f && !z10) {
                    z11 = r23;
                    this.f40482f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f40482f) {
                    this.f40487l = z11;
                }
                float d17 = d(f18);
                float e14 = e(f18);
                float d18 = d(0.75f);
                float e15 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d17, e14, d18, e15);
                canvas2.drawArc(rectF, this.f40483g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.f40478a < 255) {
            canvas.restore();
        }
        if (e10 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return com.google.android.gms.internal.vision.e2.t(0.5f, f10, this.f40491p, this.f40493r);
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
    public final void setAlpha(int i7) {
        this.f40478a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40479b.setColorFilter(colorFilter);
    }
}
