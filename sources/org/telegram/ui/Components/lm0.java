package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class lm0 extends Drawable {

    public final Paint f30414b;

    public boolean f30417f;

    public int f30420j;

    public boolean f30423m;

    public hh.p6 f30425o;

    public float f30426p;

    public float f30427q;

    public float f30428r;

    public int f30413a = 255;

    public final Path f30415c = new Path();
    public final RectF d = new RectF();

    public long f30416e = -1;

    public float f30418g = 0.0f;
    public float h = 0.0f;

    public final float[] f30419i = new float[2];

    public int f30421k = 0;

    public boolean f30422l = false;

    public final y5 f30424n = new y5(1.0f, new mb0(this, 21), 0, 350, er.h);

    public lm0() {
        Paint paint = new Paint(1);
        this.f30414b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f30414b;
        paint.setColor(i10);
        this.f30413a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f30421k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f30425o);
                this.f30425o = null;
                return;
            }
            return;
        }
        if (!z11 && i10 == 2) {
            if (this.f30425o == null) {
                hh.p6 p6Var = new hh.p6(this, i10, z10);
                this.f30425o = p6Var;
                AndroidUtilities.runOnUIThread(p6Var, 65L);
                return;
            }
            return;
        }
        hh.p6 p6Var2 = this.f30425o;
        if (p6Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(p6Var2);
        }
        y5 y5Var = this.f30424n;
        boolean z12 = false;
        if (y5Var.f34812c < 1.0f && z10) {
            c(this.f30421k, false, false);
        }
        if (i10 == 2) {
            this.f30418g = 180.0f;
            this.f30416e = -1L;
        } else if (this.f30421k == 2) {
            if (i10 == 0) {
                this.h = -45.0f;
            } else {
                this.h = 0.0f;
            }
        }
        if (z10) {
            int i11 = this.f30421k;
            this.f30420j = i11;
            this.f30421k = i10;
            if (i11 == 2 && i10 != 2) {
                z12 = true;
            }
            this.f30422l = z12;
            y5Var.d(0.0f, true);
        } else {
            this.f30421k = i10;
            this.f30420j = i10;
            this.f30422l = false;
            y5Var.d(1.0f, true);
        }
        invalidateSelf();
    }

    public final float d(float f10) {
        return org.telegram.ui.Cells.pa.b(0.5f, f10, this.f30426p, this.f30427q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        char c10;
        float f13;
        char c11;
        float f14;
        float f15;
        float f16;
        boolean z10;
        Rect bounds = getBounds();
        this.f30426p = Math.min(bounds.width(), bounds.height());
        this.f30427q = bounds.centerX();
        this.f30428r = bounds.centerY();
        int i10 = this.f30413a;
        if (i10 < 255) {
            float f17 = bounds.left;
            float f18 = bounds.top;
            float f19 = bounds.right;
            float f20 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f17, f18, f19, f20, i10, 31);
        } else {
            canvas2 = canvas;
        }
        float fD = this.f30424n.d(this.f30422l ? 0.0f : 1.0f, false);
        int i11 = this.f30421k;
        int i12 = this.f30420j;
        if (i11 == 0) {
            f10 = i12 == 0 ? 1.0f : fD;
        } else {
            f10 = i12 == 0 ? 1.0f - fD : 0.0f;
        }
        int i13 = this.f30420j;
        if (i11 == 1) {
            f11 = i13 == 1 ? 1.0f : fD;
        } else {
            f11 = i13 == 1 ? 1.0f - fD : 0.0f;
        }
        if (i11 == 2) {
            f12 = this.f30420j == 2 ? 1.0f : fD;
        } else {
            f12 = this.f30420j == 2 ? 1.0f - fD : 0.0f;
        }
        Paint paint = this.f30414b;
        if (f10 > 0.0f) {
            c10 = 1;
            float fLerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float fLerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float fLerp3 = AndroidUtilities.lerp(0.0f, this.f30426p * 0.208f, f10);
            if (fLerp3 >= this.f30426p * 0.075f) {
                canvas2.drawCircle(fLerp, fLerp2, fLerp3, paint);
            }
        } else {
            c10 = 1;
        }
        if (f10 > 0.0f || f11 > 0.0f) {
            canvas2.save();
            f13 = 45.0f;
            canvas2.rotate(f10 * 45.0f, this.f30427q, this.f30428r);
            float fD2 = d(0.914f);
            float fD3 = ((this.f30420j == 2 ? d(0.75f) : d(0.2409f)) * f12) + (d(0.7638f) * f11) + (fD2 * f10);
            float fE = e(0.5f);
            float fD4 = d(0.658f);
            c11 = 0;
            float fD5 = ((this.f30420j == 2 ? d(0.75f) : d(0.2409f)) * f12) + (d(0.2409f) * f11) + (fD4 * f10);
            float fE2 = e(0.5f);
            if (h7.y.a(fD3, fE, fD5, fE2) <= this.f30426p * 0.075f) {
                f14 = 0.5f;
                f15 = 0.25f;
                f16 = 0.0f;
            } else {
                f14 = 0.5f;
                f15 = 0.25f;
                f16 = 0.0f;
                canvas2.drawLine(fD3, fE, fD5, fE2, paint);
            }
            canvas2.restore();
        } else {
            f12 = f12;
            f14 = 0.5f;
            f15 = 0.25f;
            f16 = 0.0f;
            f13 = 45.0f;
            c11 = 0;
        }
        if (f11 > f16) {
            float fLerp4 = this.f30420j == 2 ? AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11) : d(0.2409f);
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f30427q, this.f30428r);
            float fD6 = (d(0.2452f) * f11) + fLerp4;
            float fLerp5 = AndroidUtilities.lerp(e(f14), e(f15), f11);
            float fE3 = e(f14);
            float fD7 = (d(0.2452f) * f11) + fLerp4;
            float fLerp6 = AndroidUtilities.lerp(e(f14), e(0.75f), f11);
            if (Math.max(h7.y.a(fD6, fLerp5, fLerp4, fE3), h7.y.a(fD7, fLerp6, fLerp4, fE3)) > this.f30426p * 0.075f) {
                Path path = this.f30415c;
                path.rewind();
                path.moveTo(fD6, fLerp5);
                path.lineTo(fLerp4, fE3);
                path.lineTo(fD7, fLerp6);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f12 > f16) {
            if (this.f30416e < 0 && f12 > 0.8f) {
                this.f30416e = System.currentTimeMillis();
                this.f30423m = this.f30422l;
            }
            if (this.f30416e > 0) {
                float fCurrentTimeMillis = (System.currentTimeMillis() - this.f30416e) % 5400.0f;
                float[] fArr = this.f30419i;
                hp.a(fArr, fCurrentTimeMillis);
                float fLerp7 = fArr[c11];
                float fMin = fArr[c10];
                if (this.f30421k != 2 && !this.f30422l) {
                    float fMax = Math.max(0.0f, (((float) Math.floor((fLerp7 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    fMin = Math.min(fMin, this.h + fMax);
                    fLerp7 = AndroidUtilities.lerp(fMin, Math.min(fLerp7, fMax + this.h), f12);
                }
                float f21 = this.h;
                float f22 = this.f30418g;
                float f23 = f22 + fLerp7;
                float f24 = f22 + fMin;
                float f25 = f23 % 360.0f;
                if (f25 < 0.0f) {
                    f25 += 360.0f;
                }
                float f26 = f24 % 360.0f;
                if (f26 < 0.0f) {
                    f26 += 360.0f;
                }
                boolean z11 = f25 <= f26 ? !(f21 < f25 || f21 > f26) : !(f21 < f25 && f21 > f26);
                boolean z12 = this.f30422l;
                if (z12 && !this.f30423m) {
                    this.f30423m = z12;
                    this.f30417f = z11;
                }
                if (!this.f30417f || z11) {
                    z10 = false;
                } else {
                    z10 = false;
                    this.f30417f = false;
                }
                if (z12 && z11 && !this.f30417f) {
                    this.f30422l = z10;
                }
                float fD8 = d(f15);
                float fE4 = e(f15);
                float fD9 = d(0.75f);
                float fE5 = e(0.75f);
                float f27 = fLerp7;
                RectF rectF = this.d;
                rectF.set(fD8, fE4, fD9, fE5);
                canvas2.drawArc(rectF, this.f30418g + f27, fMin - f27, false, paint);
                invalidateSelf();
            }
        }
        if (this.f30413a < 255) {
            canvas.restore();
        }
        if (fD < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return org.telegram.ui.Cells.pa.b(0.5f, f10, this.f30426p, this.f30428r);
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
        this.f30413a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30414b.setColorFilter(colorFilter);
    }
}
