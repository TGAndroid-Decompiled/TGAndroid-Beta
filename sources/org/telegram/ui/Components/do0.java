package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class do0 extends Drawable {
    public final Paint f25750b;
    public boolean f25753f;
    public int f25756j;
    public boolean f25759m;
    public i2.g0 f25761o;
    public float f25762p;
    public float f25763q;
    public float f25764r;
    public int f25749a = 255;
    public final Path f25751c = new Path();
    public final RectF d = new RectF();
    public long f25752e = -1;
    public float f25754g = 0.0f;
    public float h = 0.0f;
    public final float[] f25755i = new float[2];
    public int f25757k = 0;
    public boolean f25758l = false;
    public final g6 f25760n = new g6(1.0f, new bd0(this, 21), 0, 350, hs.h);

    public do0() {
        Paint paint = new Paint(1);
        this.f25750b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i10) {
        Paint paint = this.f25750b;
        paint.setColor(i10);
        this.f25749a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i10) {
        c(i10, true, false);
    }

    public final void c(int i10, boolean z10, boolean z11) {
        if (this.f25757k == i10) {
            if (i10 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f25761o);
                this.f25761o = null;
            }
        } else if (!z11 && i10 == 2) {
            if (this.f25761o == null) {
                i2.g0 g0Var = new i2.g0(this, i10, z10, 2);
                this.f25761o = g0Var;
                AndroidUtilities.runOnUIThread(g0Var, 65L);
            }
        } else {
            i2.g0 g0Var2 = this.f25761o;
            if (g0Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(g0Var2);
            }
            g6 g6Var = this.f25760n;
            boolean z12 = false;
            if (g6Var.f26599c < 1.0f && z10) {
                c(this.f25757k, false, false);
            }
            if (i10 == 2) {
                this.f25754g = 180.0f;
                this.f25752e = -1L;
            } else if (this.f25757k == 2) {
                if (i10 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i11 = this.f25757k;
                this.f25756j = i11;
                this.f25757k = i10;
                if (i11 == 2 && i10 != 2) {
                    z12 = true;
                }
                this.f25758l = z12;
                g6Var.d(0.0f, true);
            } else {
                this.f25757k = i10;
                this.f25756j = i10;
                this.f25758l = false;
                g6Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.f25762p, this.f25763q);
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
        this.f25762p = Math.min(bounds.width(), bounds.height());
        this.f25763q = bounds.centerX();
        this.f25764r = bounds.centerY();
        int i10 = this.f25749a;
        if (i10 < 255) {
            float f18 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f18, i10, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f25758l) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        float d12 = this.f25760n.d(f7, false);
        int i11 = this.f25757k;
        int i12 = this.f25756j;
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
        int i13 = this.f25756j;
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
            if (this.f25756j == 2) {
                f12 = 1.0f;
            } else {
                f12 = d12;
            }
        } else if (this.f25756j == 2) {
            f12 = 1.0f - d12;
        } else {
            f12 = 0.0f;
        }
        int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f25750b;
        if (i14 > 0) {
            boolean z12 = true;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f10);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f10);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f25762p * 0.208f, f10);
            r19 = z12;
            if (lerp3 >= this.f25762p * 0.075f) {
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
            canvas2.rotate(f10 * 45.0f, this.f25763q, this.f25764r);
            float d13 = d(0.914f);
            float d14 = d(0.7638f);
            if (this.f25756j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f19 = (d * f12) + (d14 * f11) + (d13 * f10);
            float e7 = e(0.5f);
            float d15 = d(0.658f);
            float d16 = d(0.2409f);
            r23 = 0;
            if (this.f25756j == 2) {
                d10 = d(0.75f);
            } else {
                d10 = d(0.2409f);
            }
            float f20 = (d10 * f12) + (d16 * f11) + (d15 * f10);
            float e10 = e(0.5f);
            if (v7.z6.a(f19, e7, f20, e10) <= this.f25762p * 0.075f) {
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
            if (this.f25756j == 2) {
                d11 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f11);
            } else {
                d11 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f10 * f13, this.f25763q, this.f25764r);
            float d17 = (d(0.2452f) * f11) + d11;
            float lerp4 = AndroidUtilities.lerp(e(f16), e(f17), f11);
            float e11 = e(f16);
            float d18 = (d(0.2452f) * f11) + d11;
            float lerp5 = AndroidUtilities.lerp(e(f16), e(0.75f), f11);
            if (Math.max(v7.z6.a(d17, lerp4, d11, e11), v7.z6.a(d18, lerp5, d11, e11)) > this.f25762p * 0.075f) {
                Path path = this.f25751c;
                path.rewind();
                path.moveTo(d17, lerp4);
                path.lineTo(d11, e11);
                path.lineTo(d18, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f14 > f15) {
            if (this.f25752e < 0 && f14 > 0.8f) {
                this.f25752e = System.currentTimeMillis();
                this.f25759m = this.f25758l;
            }
            if (this.f25752e > 0) {
                float[] fArr = this.f25755i;
                jq.a(fArr, ((float) (System.currentTimeMillis() - this.f25752e)) % 5400.0f);
                float f21 = fArr[r23];
                float f22 = fArr[r19];
                if (this.f25757k != 2 && !this.f25758l) {
                    float max = Math.max(f15, (((float) Math.floor((f21 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f22 = Math.min(f22, this.h + max);
                    f21 = AndroidUtilities.lerp(f22, Math.min(f21, max + this.h), f14);
                }
                float f23 = this.h;
                float f24 = this.f25754g;
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
                boolean z13 = this.f25758l;
                if (z13 && !this.f25759m) {
                    this.f25759m = z13;
                    this.f25753f = z10;
                }
                if (this.f25753f && !z10) {
                    z11 = r23;
                    this.f25753f = z11;
                } else {
                    z11 = r23;
                }
                if (z13 && z10 && !this.f25753f) {
                    this.f25758l = z11;
                }
                float d19 = d(f17);
                float e12 = e(f17);
                float d20 = d(0.75f);
                float e13 = e(0.75f);
                float f29 = f21;
                RectF rectF = this.d;
                rectF.set(d19, e12, d20, e13);
                canvas2.drawArc(rectF, this.f25754g + f29, f22 - f29, false, paint);
                invalidateSelf();
            }
        }
        if (this.f25749a < 255) {
            canvas.restore();
        }
        if (d12 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f7) {
        return com.google.android.gms.internal.vision.e2.b(0.5f, f7, this.f25762p, this.f25764r);
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
        this.f25749a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25750b.setColorFilter(colorFilter);
    }
}
