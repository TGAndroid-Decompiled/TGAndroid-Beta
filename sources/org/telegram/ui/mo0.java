package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class mo0 {
    public final View f47725i;
    public boolean f47732p;
    public final org.telegram.ui.Components.xp f47733q;
    public final org.telegram.ui.Components.je0 f47734r;
    public final PhotoViewer f47735s;
    public final PhotoViewer f47736t;
    public long f47719a = 0;
    public float f47720b = 0.0f;
    public float f47721c = 0.0f;
    public float d = 0.0f;
    public long f47722e = 0;
    public float f47723f = 0.0f;
    public final RectF f47724g = new RectF();
    public int h = -1;
    public final int f47726j = org.telegram.messenger.g0.L(64.0f);
    public int f47727k = -2;
    public float f47728l = 1.0f;
    public final float[] f47729m = new float[3];
    public final float[] f47730n = new float[3];
    public float f47731o = 1.0f;

    public mo0(PhotoViewer photoViewer, View view) {
        this.f47736t = photoViewer;
        this.f47735s = photoViewer;
        if (PhotoViewer.Y8 == null) {
            PhotoViewer.Y8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.Z8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.Z8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.Z8.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.Z8.setColor(-1);
        }
        this.f47725i = view;
        int i3 = 0;
        while (true) {
            float[] fArr = this.f47730n;
            if (i3 < fArr.length) {
                this.f47729m[i3] = 1.0f;
                fArr[i3] = 1.0f;
                i3++;
            } else {
                a();
                org.telegram.ui.Components.je0 je0Var = new org.telegram.ui.Components.je0(28);
                this.f47734r = je0Var;
                je0Var.h = 200;
                this.f47733q = new org.telegram.ui.Components.xp(photoViewer.E.getDrawable(2131231006).mutate(), je0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i3 = 0;
        while (true) {
            float[] fArr = this.f47730n;
            if (i3 < fArr.length) {
                if (fArr[i3] != 1.0f) {
                    z10 = false;
                    break;
                }
                i3++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f47732p) {
            this.f47732p = z10;
            PhotoViewer photoViewer = this.f47736t;
            if (this == photoViewer.X0[0]) {
                photoViewer.u3();
            }
        }
    }

    public final int b() {
        int i3;
        int i10 = org.telegram.messenger.g0.f22608q.y;
        PhotoViewer photoViewer = this.f47735s;
        if (!photoViewer.f41531s) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i3) - ((int) (this.f47726j * this.f47731o))) / 2) + 0.0f);
        if (photoViewer.f41402d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i3;
        Drawable drawable;
        float f10 = this.f47726j;
        int i10 = (int) (this.f47731o * f10);
        int width = (this.f47735s.f41420f0.getWidth() - ((int) (f10 * this.f47731o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f47729m;
            if (i11 >= fArr.length) {
                break;
            }
            if (i11 == 2) {
                f11 = org.telegram.messenger.g0.G.getInterpolation(fArr[i11]) * f11;
            } else {
                f11 *= fArr[i11];
            }
            i11++;
        }
        int i12 = this.f47727k;
        Drawable drawable2 = this.f47733q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.V8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f47728l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.V8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable2 = drawableArr2[i13];
                }
                if (drawable2 != null) {
                    if (this.f47727k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f47728l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i3 = this.f47727k) != 0 && i3 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f47727k != -2) {
            PhotoViewer.Z8.setAlpha((int) (this.f47728l * 255.0f * f11));
        } else {
            PhotoViewer.Z8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f47724g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f47720b - 90.0f, Math.max(4.0f, this.f47723f * 360.0f), false, PhotoViewer.Z8);
        g(true);
    }

    public final void d(int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i3) {
            return;
        }
        View view = this.f47725i;
        org.telegram.ui.Components.je0 je0Var = this.f47734r;
        if (je0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i3 == 3) {
                je0Var.a(false, z12);
            } else if (i3 == 4) {
                je0Var.a(true, z12);
            }
            je0Var.f35054f = view;
            je0Var.invalidateSelf();
        }
        this.f47719a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i3) {
            this.f47727k = i10;
            this.f47728l = 1.0f;
        } else {
            this.f47727k = -2;
        }
        this.h = i3;
        PhotoViewer photoViewer = this.f47736t;
        if (this == photoViewer.X0[0]) {
            photoViewer.u3();
        }
        view.invalidate();
    }

    public final void e(int i3, float f10, boolean z10) {
        float[] fArr = this.f47730n;
        if (fArr[i3] != f10) {
            fArr[i3] = f10;
            if (!z10) {
                this.f47729m[i3] = f10;
            }
            a();
            this.f47725i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f47723f = f10;
            this.d = f10;
        } else {
            this.d = this.f47723f;
        }
        this.f47721c = f10;
        this.f47722e = 0L;
        this.f47725i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f47719a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f47719a = currentTimeMillis;
        int i3 = 0;
        if (z10) {
            if (this.f47723f == 1.0f && this.f47721c == 1.0f) {
                z11 = false;
            } else {
                this.f47720b = (((float) (360 * j10)) / 3000.0f) + this.f47720b;
                float f10 = this.f47721c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.f47722e + j10;
                    this.f47722e = j11;
                    if (j11 >= 300) {
                        float f11 = this.f47721c;
                        this.f47723f = f11;
                        this.d = f11;
                        this.f47722e = 0L;
                    } else {
                        this.f47723f = (PhotoViewer.Y8.getInterpolation(((float) j11) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f47728l;
            if (f12 > 0.0f && this.f47727k != -2) {
                float f13 = f12 - (((float) j10) / 200.0f);
                this.f47728l = f13;
                if (f13 <= 0.0f) {
                    this.f47728l = 0.0f;
                    this.f47727k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f47730n;
            if (i3 >= fArr.length) {
                break;
            }
            float f14 = fArr[i3];
            float[] fArr2 = this.f47729m;
            float f15 = fArr2[i3];
            if (f14 > f15) {
                fArr2[i3] = org.telegram.ui.Cells.f1.h((float) j10, 200.0f, f15, 1.0f);
            } else if (f14 < f15) {
                fArr2[i3] = org.telegram.ui.Cells.f1.y((float) j10, 200.0f, f15, 0.0f);
            } else {
                i3++;
            }
            z11 = true;
            i3++;
        }
        if (z11) {
            this.f47725i.postInvalidateOnAnimation();
        }
    }
}
