package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class vn0 extends Drawable {
    public final Paint f31322b;
    public boolean f31324f;
    public int f31327j;
    public boolean f31330m;
    public ai.y8 f31332o;
    public float f31333p;
    public float f31334q;
    public float f31335r;
    public int f31321a = 255;
    public final Path f31323c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float f31325g = 0.0f;
    public float h = 0.0f;
    public final float[] f31326i = new float[2];
    public int f31328k = 0;
    public boolean f31329l = false;
    public final f6 f31331n = new f6(1.0f, new rc0(this, 21), 0, 350, bs.h);

    public vn0() {
        Paint paint = new Paint(1);
        this.f31322b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f31322b;
        paint.setColor(i10);
        this.f31321a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f31328k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f31332o);
                this.f31332o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f31332o == null) {
                ai.y8 y8Var = new ai.y8(this, i10, z10, 3);
                this.f31332o = y8Var;
                AndroidUtilities.runOnUIThread(y8Var, 65L);
            }
        } else {
            ai.y8 y8Var2 = this.f31332o;
            if (y8Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(y8Var2);
            }
            f6 f6Var = this.f31331n;
            boolean z12 = false;
            if (f6Var.f26093c < 1.0f && z10) {
                c(this.f31328k, false, false);
            }
            if (i10 == 2) {
                this.f31325g = 180.0f;
                this.e = -1L;
            } else if (this.f31328k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f31328k;
                this.f31327j = i11;
                this.f31328k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f31329l = z12;
                f6Var.d(0.0f, true);
            } else {
                this.f31328k = i10;
                this.f31327j = i10;
                this.f31329l = false;
                f6Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f7) {
        return com.google.android.gms.internal.cast.a6.D(0.5f, f7, this.f31333p, this.f31334q);
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
        this.f31333p = Math.min(bounds.width(), bounds.height());
        this.f31334q = bounds.centerX();
        this.f31335r = bounds.centerY();
        int i10 = this.f31321a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f31329l) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        float d12 = this.f31331n.d(f7, false);
        int i11 = this.f31328k;
        int i12 = this.f31327j;
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
        int i13 = this.f31327j;
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
            if (this.f31327j == 2) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (this.f31327j == 2) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f31322b;
        if (i14 > 0) {
            boolean z12 = true;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f31333p * 0.208f, f10);
            r19 = z12;
            if (lerp3 >= this.f31333p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
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
            canvas2.rotate(f10 * 45.0f, this.f31334q, this.f31335r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f31327j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d14 * f11) + (d13 * f10);
            float e = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            r23 = 0;
            if (this.f31327j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d16 * f11) + (d15 * f10);
            float e7 = e(0.5f);
            if (v7.f7.a(f19, e, f20, e7) <= this.f31333p * 0.075f) {
                f14 = f12;
                f15 = 0.0f;
                f16 = 0.5f;
                f17 = 0.25f;
            } else {
                f14 = f12;
                f15 = 0.0f;
                f16 = 0.5f;
                f17 = 0.25f;
                canvas2.drawLine(f19, e, f20, e7, paint);
            }
            canvas2.restore();
        }
        if (f11 > f15) {
            if (this.f31327j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f31334q, this.f31335r);
            float d17 = (d(0.2452f) * f11) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f16), e(f17), f11);
            float e10 = e(f16);
            float d18 = (d(0.2452f) * f11) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f16), e(0.75f), f11);
            if (Math.max(v7.f7.a(d17, lerp4, d11, e10), v7.f7.a(d18, lerp5, d11, e10)) > this.f31333p * 0.075f) {
                Path path = this.f31323c;
                path.rewind();
                path.moveTo(d17, lerp4);
                path.lineTo(d11, e10);
                path.lineTo(d18, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f14 > f15) {
            if (this.e < 0 && f14 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.f31330m = this.f31329l;
            }
            if (this.e > 0) {
                float[] fArr = this.f31326i;
                dq.a(fArr, ((float) (System.currentTimeMillis() - this.e)) % 5400.0f);
                float f21 = fArr[r23];
                float f22 = fArr[r19];
                if (this.f31328k != 2 && !this.f31329l) {
                    float max = Math.max(f15, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f31325g;
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
                boolean z13 = this.f31329l;
                if (z13 && !this.f31330m) {
                    this.f31330m = z13;
                    this.f31324f = z10;
                }
                if (this.f31324f && !z10) {
                    z11 = r23;
                    this.f31324f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f31324f) {
                    this.f31329l = z11;
                }
                float d19 = d(f17);
                float e11 = e(f17);
                float d20 = d(0.75f);
                float e12 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d19, e11, d20, e12);
                canvas2.drawArc(rectF, this.f31325g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f31321a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return com.google.android.gms.internal.cast.a6.D(0.5f, f7, this.f31333p, this.f31335r);
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
        this.f31321a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31322b.setColorFilter(colorFilter);
    }
}
