package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class en0 extends Drawable {
    public final Paint f24640b;
    public boolean f24642f;
    public int f24645j;
    public boolean f24648m;
    public lh.n6 f24650o;
    public float f24651p;
    public float f24652q;
    public float f24653r;
    public int f24639a = 255;
    public final Path f24641c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float f24643g = 0.0f;
    public float h = 0.0f;
    public final float[] f24644i = new float[2];
    public int f24646k = 0;
    public boolean f24647l = false;
    public final z5 f24649n = new z5(1.0f, new dc0(this, 21), 0, 350, mr.h);

    public en0() {
        Paint paint = new Paint(1);
        this.f24640b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f24640b;
        paint.setColor(i10);
        this.f24639a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z4, boolean z10) {
        if (this.f24646k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f24650o);
                this.f24650o = null;
            }
        } else if (!z10 && i10 == 2) {
            if (this.f24650o == null) {
                lh.n6 n6Var = new lh.n6(this, i10, z4);
                this.f24650o = n6Var;
                AndroidUtilities.runOnUIThread(n6Var, 65L);
            }
        } else {
            lh.n6 n6Var2 = this.f24650o;
            if (n6Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(n6Var2);
            }
            z5 z5Var = this.f24649n;
            boolean z11 = false;
            if (z5Var.f31253c < 1.0f && z4) {
                c(this.f24646k, false, false);
            }
            if (i10 == 2) {
                this.f24643g = 180.0f;
                this.e = -1L;
            } else if (this.f24646k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z4) {
                int i11 = this.f24646k;
                this.f24645j = i11;
                this.f24646k = i10;
                if (i11 == 2 && i10 != 2) {
                    z11 = true;
                }
                this.f24647l = z11;
                z5Var.d(0.0f, true);
            } else {
                this.f24646k = i10;
                this.f24645j = i10;
                this.f24647l = false;
                z5Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f10) {
        return org.telegram.ui.ai.c(0.5f, f10, this.f24651p, this.f24652q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        char c3;
        float f14;
        float d;
        char c10;
        float d10;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z4;
        boolean z10;
        float d11;
        Rect bounds = getBounds();
        this.f24651p = Math.min(bounds.width(), bounds.height());
        this.f24652q = bounds.centerX();
        this.f24653r = bounds.centerY();
        int i10 = this.f24639a;
        if (i10 < 255) {
            float f19 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f19, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f24647l) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float d12 = this.f24649n.d(f10, false);
        int i11 = this.f24646k;
        int i12 = this.f24645j;
        if (i11 == 0) {
            if (i12 == 0) {
                f11 = 1.0f;
            } else {
                f11 = d12;
            }
        } else if (i12 == 0) {
            f11 = 1.0f - d12;
        } else {
            f11 = 0.0f;
        }
        int i13 = this.f24645j;
        if (i11 == 1) {
            if (i13 == 1) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (i13 == 1) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        if (i11 == 2) {
            if (this.f24645j == 2) {
                f13 = 1.0f;
            } else {
                f13 = d12;
            }
        } else if (this.f24645j == 2) {
            f13 = 1.0f - d12;
        } else {
            f13 = 0.0f;
        }
        Paint paint = this.f24640b;
        int i14 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            c3 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f11);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f11);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f24651p * 0.208f, f11);
            if (lerp3 >= this.f24651p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c3 = 1;
        }
        if (i14 <= 0 && f12 <= 0.0f) {
            f15 = f13;
            f16 = 0.5f;
            f17 = 0.25f;
            f18 = 0.0f;
            f14 = 45.0f;
            c10 = 0;
        } else {
            canvas2.save();
            f14 = 45.0f;
            canvas2.rotate(f11 * 45.0f, this.f24652q, this.f24653r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f24645j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f20 = (d * f13) + (d14 * f12) + (d13 * f11);
            float e = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            c10 = 0;
            if (this.f24645j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f21 = (d10 * f13) + (d16 * f12) + (d15 * f11);
            float e6 = e(0.5f);
            if (k7.n6.a(f20, e, f21, e6) <= this.f24651p * 0.075f) {
                f15 = f13;
                f16 = 0.5f;
                f17 = 0.25f;
                f18 = 0.0f;
            } else {
                f15 = f13;
                f16 = 0.5f;
                f17 = 0.25f;
                f18 = 0.0f;
                canvas2.drawLine(f20, e, f21, e6, paint);
            }
            canvas2.restore();
        }
        if (f12 > f18) {
            if (this.f24645j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f12);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f11 * f14, this.f24652q, this.f24653r);
            float d17 = (d(0.2452f) * f12) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f16), e(f17), f12);
            float e10 = e(f16);
            float d18 = (d(0.2452f) * f12) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f16), e(0.75f), f12);
            if (Math.max(k7.n6.a(d17, lerp4, d11, e10), k7.n6.a(d18, lerp5, d11, e10)) > this.f24651p * 0.075f) {
                Path path = this.f24641c;
                path.rewind();
                path.moveTo(d17, lerp4);
                path.lineTo(d11, e10);
                path.lineTo(d18, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f15 > f18) {
            if (this.e < 0 && f15 > 0.8f) {
                this.e = System.currentTimeMillis();
                this.f24648m = this.f24647l;
            }
            if (this.e > 0) {
                float[] fArr = this.f24644i;
                qp.a(fArr, ((float) (System.currentTimeMillis() - this.e)) % 5400.0f);
                float f22 = fArr[c10];
                float f23 = fArr[c3];
                if (this.f24646k != 2 && !this.f24647l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = AndroidUtilities.lerp(f23, Math.min(f22, max + this.h), f15);
                }
                float f24 = this.h;
                float f25 = this.f24643g;
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
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z11 = this.f24647l;
                if (z11 && !this.f24648m) {
                    this.f24648m = z11;
                    this.f24642f = z4;
                }
                if (this.f24642f && !z4) {
                    z10 = false;
                    this.f24642f = false;
                } else {
                    z10 = false;
                }
                if (z11 && z4 && !this.f24642f) {
                    this.f24647l = z10;
                }
                float d19 = d(f17);
                float e11 = e(f17);
                float d20 = d(0.75f);
                float e12 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d19, e11, d20, e12);
                canvas2.drawArc(rectF, this.f24643g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.f24639a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return org.telegram.ui.ai.c(0.5f, f10, this.f24651p, this.f24653r);
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
        this.f24639a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24640b.setColorFilter(colorFilter);
    }
}
