package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class vm0 extends Drawable {
    public final Paint f33578b;
    public boolean f33581f;
    public int f33584j;
    public boolean f33587m;
    public jh.n6 f33589o;
    public float f33590p;
    public float f33591q;
    public float f33592r;
    public int f33577a = 255;
    public final Path f33579c = new Path();
    public final RectF d = new RectF();
    public long f33580e = -1;
    public float f33582g = 0.0f;
    public float h = 0.0f;
    public final float[] f33583i = new float[2];
    public int f33585k = 0;
    public boolean f33586l = false;
    public final d6 f33588n = new d6(1.0f, new xb0(this, 21), 0, 350, jr.h);

    public vm0() {
        Paint paint = new Paint(1);
        this.f33578b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f33578b;
        paint.setColor(i10);
        this.f33577a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f33585k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f33589o);
                this.f33589o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f33589o == null) {
                jh.n6 n6Var = new jh.n6(this, i10, z10);
                this.f33589o = n6Var;
                AndroidUtilities.runOnUIThread(n6Var, 65L);
            }
        } else {
            jh.n6 n6Var2 = this.f33589o;
            if (n6Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(n6Var2);
            }
            d6 d6Var = this.f33588n;
            boolean z12 = false;
            if (d6Var.f27666c < 1.0f && z10) {
                c(this.f33585k, false, false);
            }
            if (i10 == 2) {
                this.f33582g = 180.0f;
                this.f33580e = -1L;
            } else if (this.f33585k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f33585k;
                this.f33584j = i11;
                this.f33585k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f33586l = z12;
                d6Var.d(0.0f, true);
            } else {
                this.f33585k = i10;
                this.f33584j = i10;
                this.f33586l = false;
                d6Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f9) {
        return org.telegram.ui.th.b(0.5f, f9, this.f33590p, this.f33591q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f9;
        float f10;
        float f11;
        float f12;
        char c3;
        float f13;
        float d;
        char c6;
        float d10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        boolean z11;
        float d11;
        Rect bounds = getBounds();
        this.f33590p = Math.min(bounds.width(), bounds.height());
        this.f33591q = bounds.centerX();
        this.f33592r = bounds.centerY();
        int i10 = this.f33577a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f33586l) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        float d12 = this.f33588n.d(f9, false);
        int i11 = this.f33585k;
        int i12 = this.f33584j;
        if (i11 == 0) {
            if (i12 == 0) {
                f10 = 1.0f;
            } else {
                f10 = d12;
            }
        } else if (i12 == 0) {
            f10 = 1.0f - d12;
        } else {
            f10 = 0.0f;
        }
        int i13 = this.f33584j;
        if (i11 == 1) {
            if (i13 == 1) {
                f11 = 1.0f;
            } else {
                f11 = d12;
            }
        } else if (i13 == 1) {
            f11 = 1.0f - d12;
        } else {
            f11 = 0.0f;
        }
        if (i11 == 2) {
            if (this.f33584j == 2) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (this.f33584j == 2) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        Paint paint = this.f33578b;
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            c3 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f33590p * 0.208f, f10);
            if (lerp3 >= this.f33590p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c3 = 1;
        }
        if (i14 <= 0 && f11 <= 0.0f) {
            f14 = f12;
            f15 = 0.5f;
            f16 = 0.25f;
            f17 = 0.0f;
            f13 = 45.0f;
            c6 = 0;
        } else {
            canvas2.save();
            f13 = 45.0f;
            canvas2.rotate(f10 * 45.0f, this.f33591q, this.f33592r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f33584j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d14 * f11) + (d13 * f10);
            float e10 = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            c6 = 0;
            if (this.f33584j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d16 * f11) + (d15 * f10);
            float e11 = e(0.5f);
            if (i7.z5.a(f19, e10, f20, e11) <= this.f33590p * 0.075f) {
                f14 = f12;
                f15 = 0.5f;
                f16 = 0.25f;
                f17 = 0.0f;
            } else {
                f14 = f12;
                f15 = 0.5f;
                f16 = 0.25f;
                f17 = 0.0f;
                canvas2.drawLine(f19, e10, f20, e11, paint);
            }
            canvas2.restore();
        }
        if (f11 > f17) {
            if (this.f33584j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f33591q, this.f33592r);
            float d17 = (d(0.2452f) * f11) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f15), e(f16), f11);
            float e12 = e(f15);
            float d18 = (d(0.2452f) * f11) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f15), e(0.75f), f11);
            if (Math.max(i7.z5.a(d17, lerp4, d11, e12), i7.z5.a(d18, lerp5, d11, e12)) > this.f33590p * 0.075f) {
                Path path = this.f33579c;
                path.rewind();
                path.moveTo(d17, lerp4);
                path.lineTo(d11, e12);
                path.lineTo(d18, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f14 > f17) {
            if (this.f33580e < 0 && f14 > 0.8f) {
                this.f33580e = System.currentTimeMillis();
                this.f33587m = this.f33586l;
            }
            if (this.f33580e > 0) {
                float[] fArr = this.f33583i;
                np.a(fArr, ((float) (System.currentTimeMillis() - this.f33580e)) % 5400.0f);
                float f21 = fArr[c6];
                float f22 = fArr[c3];
                if (this.f33585k != 2 && !this.f33586l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f33582g;
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
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = this.f33586l;
                if (z12 && !this.f33587m) {
                    this.f33587m = z12;
                    this.f33581f = z10;
                }
                if (this.f33581f && !z10) {
                    z11 = false;
                    this.f33581f = false;
                } else {
                    z11 = false;
                }
                if (z12 && z10 && !this.f33581f) {
                    this.f33586l = z11;
                }
                float d19 = d(f16);
                float e13 = e(f16);
                float d20 = d(0.75f);
                float e14 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d19, e13, d20, e14);
                canvas2.drawArc(rectF, this.f33582g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f33577a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f9) {
        return org.telegram.ui.th.b(0.5f, f9, this.f33590p, this.f33592r);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33577a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33578b.setColorFilter(colorFilter);
    }
}
