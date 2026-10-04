package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class qn0 extends Drawable {
    public final Paint f30106b;
    public boolean f30109f;
    public int f30112j;
    public boolean f30115m;
    public i2.g0 f30117o;
    public float f30118p;
    public float f30119q;
    public float f30120r;
    public int f30105a = 255;
    public final Path f30107c = new Path();
    public final RectF d = new RectF();
    public long f30108e = -1;
    public float f30110g = 0.0f;
    public float h = 0.0f;
    public final float[] f30111i = new float[2];
    public int f30113k = 0;
    public boolean f30114l = false;
    public final e6 f30116n = new e6(1.0f, new lc0(this, 22), 0, 350, tr.h);

    public qn0() {
        Paint paint = new Paint(1);
        this.f30106b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f30106b;
        paint.setColor(i10);
        this.f30105a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f30113k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f30117o);
                this.f30117o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f30117o == null) {
                i2.g0 g0Var = new i2.g0(this, i10, z10, 2);
                this.f30117o = g0Var;
                AndroidUtilities.runOnUIThread(g0Var, 65L);
            }
        } else {
            i2.g0 g0Var2 = this.f30117o;
            if (g0Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(g0Var2);
            }
            e6 e6Var = this.f30116n;
            boolean z12 = false;
            if (e6Var.f25939c < 1.0f && z10) {
                c(this.f30113k, false, false);
            }
            if (i10 == 2) {
                this.f30110g = 180.0f;
                this.f30108e = -1L;
            } else if (this.f30113k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f30113k;
                this.f30112j = i11;
                this.f30113k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f30114l = z12;
                e6Var.d(0.0f, true);
            } else {
                this.f30113k = i10;
                this.f30112j = i10;
                this.f30114l = false;
                e6Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.f30118p, this.f30119q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        char c10;
        float f13;
        float d;
        char c11;
        float d10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        boolean z11;
        float d11;
        Rect bounds = getBounds();
        this.f30118p = Math.min(bounds.width(), bounds.height());
        this.f30119q = bounds.centerX();
        this.f30120r = bounds.centerY();
        int i10 = this.f30105a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f30114l) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        float d12 = this.f30116n.d(f7, false);
        int i11 = this.f30113k;
        int i12 = this.f30112j;
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
        int i13 = this.f30112j;
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
            if (this.f30112j == 2) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (this.f30112j == 2) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        Paint paint = this.f30106b;
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            c10 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f30118p * 0.208f, f10);
            if (lerp3 >= this.f30118p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c10 = 1;
        }
        if (i14 <= 0 && f11 <= 0.0f) {
            f14 = f12;
            f15 = 0.5f;
            f16 = 0.25f;
            f17 = 0.0f;
            f13 = 45.0f;
            c11 = 0;
        } else {
            canvas2.save();
            f13 = 45.0f;
            canvas2.rotate(f10 * 45.0f, this.f30119q, this.f30120r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f30112j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d14 * f11) + (d13 * f10);
            float e7 = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            c11 = 0;
            if (this.f30112j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d16 * f11) + (d15 * f10);
            float e10 = e(0.5f);
            if (v7.z6.a(f19, e7, f20, e10) <= this.f30118p * 0.075f) {
                f14 = f12;
                f15 = 0.5f;
                f16 = 0.25f;
                f17 = 0.0f;
            } else {
                f14 = f12;
                f15 = 0.5f;
                f16 = 0.25f;
                f17 = 0.0f;
                canvas2.drawLine(f19, e7, f20, e10, paint);
            }
            canvas2.restore();
        }
        if (f11 > f17) {
            if (this.f30112j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f30119q, this.f30120r);
            float d17 = (d(0.2452f) * f11) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f15), e(f16), f11);
            float e11 = e(f15);
            float d18 = (d(0.2452f) * f11) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f15), e(0.75f), f11);
            if (Math.max(v7.z6.a(d17, lerp4, d11, e11), v7.z6.a(d18, lerp5, d11, e11)) > this.f30118p * 0.075f) {
                Path path = this.f30107c;
                path.rewind();
                path.moveTo(d17, lerp4);
                path.lineTo(d11, e11);
                path.lineTo(d18, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f14 > f17) {
            if (this.f30108e < 0 && f14 > 0.8f) {
                this.f30108e = System.currentTimeMillis();
                this.f30115m = this.f30114l;
            }
            if (this.f30108e > 0) {
                float[] fArr = this.f30111i;
                wp.a(fArr, ((float) (System.currentTimeMillis() - this.f30108e)) % 5400.0f);
                float f21 = fArr[c11];
                float f22 = fArr[c10];
                if (this.f30113k != 2 && !this.f30114l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f30110g;
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
                boolean z12 = this.f30114l;
                if (z12 && !this.f30115m) {
                    this.f30115m = z12;
                    this.f30109f = z10;
                }
                if (this.f30109f && !z10) {
                    z11 = false;
                    this.f30109f = false;
                } else {
                    z11 = false;
                }
                if (z12 && z10 && !this.f30109f) {
                    this.f30114l = z11;
                }
                float d19 = d(f16);
                float e12 = e(f16);
                float d20 = d(0.75f);
                float e13 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d19, e12, d20, e13);
                canvas2.drawArc(rectF, this.f30110g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f30105a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.f30118p, this.f30120r);
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
        this.f30105a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30106b.setColorFilter(colorFilter);
    }
}
