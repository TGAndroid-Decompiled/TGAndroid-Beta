package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class im0 extends Drawable {
    public final Paint f29465b;
    public boolean f29468f;
    public int f29471j;
    public boolean f29474m;
    public gh.q6 f29476o;
    public float f29477p;
    public float f29478q;
    public float f29479r;
    public int f29464a = 255;
    public final Path f29466c = new Path();
    public final RectF d = new RectF();
    public long f29467e = -1;
    public float f29469g = 0.0f;
    public float h = 0.0f;
    public final float[] f29470i = new float[2];
    public int f29472k = 0;
    public boolean f29473l = false;
    public final y5 f29475n = new y5(1.0f, new ib0(this, 21), 0, 350, gr.h);

    public im0() {
        Paint paint = new Paint(1);
        this.f29465b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public final void a(int i9) {
        Paint paint = this.f29465b;
        paint.setColor(i9);
        this.f29464a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i9) {
        c(i9, true, false);
    }

    public final void c(int i9, boolean z10, boolean z11) {
        if (this.f29472k == i9) {
            if (i9 != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.f29476o);
                this.f29476o = null;
            }
        } else if (!z11 && i9 == 2) {
            if (this.f29476o == null) {
                gh.q6 q6Var = new gh.q6(this, i9, z10);
                this.f29476o = q6Var;
                AndroidUtilities.runOnUIThread(q6Var, 65L);
            }
        } else {
            gh.q6 q6Var2 = this.f29476o;
            if (q6Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(q6Var2);
            }
            y5 y5Var = this.f29475n;
            boolean z12 = false;
            if (y5Var.f34854c < 1.0f && z10) {
                c(this.f29472k, false, false);
            }
            if (i9 == 2) {
                this.f29469g = 180.0f;
                this.f29467e = -1L;
            } else if (this.f29472k == 2) {
                if (i9 == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z10) {
                int i10 = this.f29472k;
                this.f29471j = i10;
                this.f29472k = i9;
                if (i10 == 2 && i9 != 2) {
                    z12 = true;
                }
                this.f29473l = z12;
                y5Var.d(0.0f, true);
            } else {
                this.f29472k = i9;
                this.f29471j = i9;
                this.f29473l = false;
                y5Var.d(1.0f, true);
            }
            invalidateSelf();
        }
    }

    public final float d(float f10) {
        return j3.r0.C(0.5f, f10, this.f29477p, this.f29478q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        char c10;
        float f14;
        float d;
        char c11;
        float d9;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        boolean z11;
        float d10;
        Rect bounds = getBounds();
        this.f29477p = Math.min(bounds.width(), bounds.height());
        this.f29478q = bounds.centerX();
        this.f29479r = bounds.centerY();
        int i9 = this.f29464a;
        if (i9 < 255) {
            float f19 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f19, i9, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.f29473l) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float d11 = this.f29475n.d(f10, false);
        int i10 = this.f29472k;
        int i11 = this.f29471j;
        if (i10 == 0) {
            if (i11 == 0) {
                f11 = 1.0f;
            } else {
                f11 = d11;
            }
        } else if (i11 == 0) {
            f11 = 1.0f - d11;
        } else {
            f11 = 0.0f;
        }
        int i12 = this.f29471j;
        if (i10 == 1) {
            if (i12 == 1) {
                f12 = 1.0f;
            } else {
                f12 = d11;
            }
        } else if (i12 == 1) {
            f12 = 1.0f - d11;
        } else {
            f12 = 0.0f;
        }
        if (i10 == 2) {
            if (this.f29471j == 2) {
                f13 = 1.0f;
            } else {
                f13 = d11;
            }
        } else if (this.f29471j == 2) {
            f13 = 1.0f - d11;
        } else {
            f13 = 0.0f;
        }
        Paint paint = this.f29465b;
        int i13 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i13 > 0) {
            c10 = 1;
            float lerp = AndroidUtilities.lerp(d(0.25f), d(0.444f), f11);
            float lerp2 = AndroidUtilities.lerp(e(0.5f), e(0.444f), f11);
            float lerp3 = AndroidUtilities.lerp(0.0f, this.f29477p * 0.208f, f11);
            if (lerp3 >= this.f29477p * 0.075f) {
                canvas2.drawCircle(lerp, lerp2, lerp3, paint);
            }
        } else {
            c10 = 1;
        }
        if (i13 <= 0 && f12 <= 0.0f) {
            f15 = f13;
            f16 = 0.5f;
            f17 = 0.25f;
            f18 = 0.0f;
            f14 = 45.0f;
            c11 = 0;
        } else {
            canvas2.save();
            f14 = 45.0f;
            canvas2.rotate(f11 * 45.0f, this.f29478q, this.f29479r);
            float d12 = d(0.914f);
            float d13 = d(0.7638f);
            if (this.f29471j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f20 = (d * f13) + (d13 * f12) + (d12 * f11);
            float e10 = e(0.5f);
            float d14 = d(0.658f);
            float d15 = d(0.2409f);
            c11 = 0;
            if (this.f29471j == 2) {
                d9 = d(0.75f);
            } else {
                d9 = d(0.2409f);
            }
            float f21 = (d9 * f13) + (d15 * f12) + (d14 * f11);
            float e11 = e(0.5f);
            if (g7.w.a(f20, e10, f21, e11) <= this.f29477p * 0.075f) {
                f15 = f13;
                f16 = 0.5f;
                f17 = 0.25f;
                f18 = 0.0f;
            } else {
                f15 = f13;
                f16 = 0.5f;
                f17 = 0.25f;
                f18 = 0.0f;
                canvas2.drawLine(f20, e10, f21, e11, paint);
            }
            canvas2.restore();
        }
        if (f12 > f18) {
            if (this.f29471j == 2) {
                d10 = AndroidUtilities.lerp(d(0.75f), d(0.2409f), f12);
            } else {
                d10 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f11 * f14, this.f29478q, this.f29479r);
            float d16 = (d(0.2452f) * f12) + d10;
            float lerp4 = AndroidUtilities.lerp(e(f16), e(f17), f12);
            float e12 = e(f16);
            float d17 = (d(0.2452f) * f12) + d10;
            float lerp5 = AndroidUtilities.lerp(e(f16), e(0.75f), f12);
            if (Math.max(g7.w.a(d16, lerp4, d10, e12), g7.w.a(d17, lerp5, d10, e12)) > this.f29477p * 0.075f) {
                Path path = this.f29466c;
                path.rewind();
                path.moveTo(d16, lerp4);
                path.lineTo(d10, e12);
                path.lineTo(d17, lerp5);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f15 > f18) {
            if (this.f29467e < 0 && f15 > 0.8f) {
                this.f29467e = System.currentTimeMillis();
                this.f29474m = this.f29473l;
            }
            if (this.f29467e > 0) {
                float[] fArr = this.f29470i;
                jp.a(fArr, ((float) (System.currentTimeMillis() - this.f29467e)) % 5400.0f);
                float f22 = fArr[c11];
                float f23 = fArr[c10];
                if (this.f29472k != 2 && !this.f29473l) {
                    float max = Math.max(0.0f, (((float) Math.floor((f22 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f23 = Math.min(f23, this.h + max);
                    f22 = AndroidUtilities.lerp(f23, Math.min(f22, max + this.h), f15);
                }
                float f24 = this.h;
                float f25 = this.f29469g;
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
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = this.f29473l;
                if (z12 && !this.f29474m) {
                    this.f29474m = z12;
                    this.f29468f = z10;
                }
                if (this.f29468f && !z10) {
                    z11 = false;
                    this.f29468f = false;
                } else {
                    z11 = false;
                }
                if (z12 && z10 && !this.f29468f) {
                    this.f29473l = z11;
                }
                float d18 = d(f17);
                float e13 = e(f17);
                float d19 = d(0.75f);
                float e14 = e(0.75f);
                float f30 = f22;
                RectF rectF = this.d;
                rectF.set(d18, e13, d19, e14);
                canvas2.drawArc(rectF, this.f29469g + f30, f23 - f30, false, paint);
                invalidateSelf();
            }
        }
        if (this.f29464a < 255) {
            canvas.restore();
        }
        if (d11 < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f10) {
        return j3.r0.C(0.5f, f10, this.f29477p, this.f29479r);
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
    public final void setAlpha(int i9) {
        this.f29464a = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29465b.setColorFilter(colorFilter);
    }
}
