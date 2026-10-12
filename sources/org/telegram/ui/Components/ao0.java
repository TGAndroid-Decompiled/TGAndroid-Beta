package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ao0 extends Drawable {
    public final Paint f23585b;
    public boolean f23587f;
    public int f23590j;
    public boolean f23593m;
    public i2.i0 f23595o;
    public float f23596p;
    public float f23597q;
    public float f23598r;
    public int f23584a = 255;
    public final Path f23586c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float f23588g = 0.0f;
    public float h = 0.0f;
    public final float[] f23589i = new float[2];
    public int f23591k = 0;
    public boolean f23592l = false;
    public final g6 f23594n = new g6(1.0f, new yc0(this, 22), 0, 350, es.h);

    public ao0() {
        Paint paint = new Paint(1);
        this.f23585b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f23585b;
        paint.setColor(i10);
        this.f23584a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f23591k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f23595o);
                this.f23595o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f23595o == null) {
                i2.i0 i0Var = new i2.i0(this, i10, z10, 2);
                this.f23595o = i0Var;
                AndroidUtilities.runOnUIThread(i0Var, 65L);
            }
        } else {
            i2.i0 i0Var2 = this.f23595o;
            if (i0Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(i0Var2);
            }
            g6 g6Var = this.f23594n;
            boolean z12 = false;
            if (g6Var.f25190c < 1.0f && z10) {
                c(this.f23591k, false, false);
            }
            if (i10 == 2) {
                this.f23588g = 180.0f;
                this.e = -1L;
            } else if (this.f23591k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f23591k;
                this.f23590j = i11;
                this.f23591k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f23592l = z12;
                g6Var.d(0.0f, true);
            } else {
                this.f23591k = i10;
                this.f23590j = i10;
                this.f23592l = false;
                g6Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f7) {
        return com.google.android.gms.internal.play_billing.k3.D(0.5f, f7, this.f23596p, this.f23597q);
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
        this.f23596p = Math.min(bounds.width(), bounds.height());
        this.f23597q = bounds.centerX();
        this.f23598r = bounds.centerY();
        int i10 = this.f23584a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f23592l) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        float d12 = this.f23594n.d(f7, false);
        int i11 = this.f23591k;
        int i12 = this.f23590j;
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
        int i13 = this.f23590j;
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
            if (this.f23590j == 2) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (this.f23590j == 2) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f23585b;
        if (i14 > 0) {
            boolean z12 = true;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f23596p * 0.208f, f10);
            r19 = z12;
            if (lerp3 >= this.f23596p * 0.075f) {
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
            canvas2.rotate(f10 * 45.0f, this.f23597q, this.f23598r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f23590j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d14 * f11) + (d13 * f10);
            float e = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            r23 = 0;
            if (this.f23590j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d16 * f11) + (d15 * f10);
            float e7 = e(0.5f);
            if (v7.f7.a(f19, e, f20, e7) <= this.f23596p * 0.075f) {
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
            if (this.f23590j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f23597q, this.f23598r);
            float d17 = (d(0.2452f) * f11) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f16), e(f17), f11);
            float e10 = e(f16);
            float d18 = (d(0.2452f) * f11) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f16), e(0.75f), f11);
            if (Math.max(v7.f7.a(d17, lerp4, d11, e10), v7.f7.a(d18, lerp5, d11, e10)) > this.f23596p * 0.075f) {
                Path path = this.f23586c;
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
                this.f23593m = this.f23592l;
            }
            if (this.e > 0) {
                float[] fArr = this.f23589i;
                gq.a(fArr, ((float) (System.currentTimeMillis() - this.e)) % 5400.0f);
                float f21 = fArr[r23];
                float f22 = fArr[r19];
                if (this.f23591k != 2 && !this.f23592l) {
                    float max = Math.max(f15, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f23588g;
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
                boolean z13 = this.f23592l;
                if (z13 && !this.f23593m) {
                    this.f23593m = z13;
                    this.f23587f = z10;
                }
                if (this.f23587f && !z10) {
                    z11 = r23;
                    this.f23587f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f23587f) {
                    this.f23592l = z11;
                }
                float d19 = d(f17);
                float e11 = e(f17);
                float d20 = d(0.75f);
                float e12 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d19, e11, d20, e12);
                canvas2.drawArc(rectF, this.f23588g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f23584a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return com.google.android.gms.internal.play_billing.k3.D(0.5f, f7, this.f23596p, this.f23598r);
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
        this.f23584a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23585b.setColorFilter(colorFilter);
    }
}
