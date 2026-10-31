package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class fq0 {
    public final View f37323i;
    public boolean f37330p;
    public final org.telegram.ui.Components.eq f37331q;
    public final org.telegram.ui.Components.kf0 f37332r;
    public final PhotoViewer f37333s;
    public final PhotoViewer f37334t;
    public long f37318a = 0;
    public float f37319b = 0.0f;
    public float f37320c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f37321f = 0.0f;
    public final RectF f37322g = new RectF();
    public int h = -1;
    public final int f37324j = org.telegram.messenger.i0.L(64.0f);
    public int f37325k = -2;
    public float f37326l = 1.0f;
    public final float[] f37327m = new float[3];
    public final float[] f37328n = new float[3];
    public float f37329o = 1.0f;

    public fq0(PhotoViewer photoViewer, View view) {
        this.f37334t = photoViewer;
        this.f37333s = photoViewer;
        if (PhotoViewer.X8 == null) {
            PhotoViewer.X8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.Y8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.Y8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.Y8.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
            PhotoViewer.Y8.setColor(-1);
        }
        this.f37323i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f37328n;
            if (i10 < fArr.length) {
                this.f37327m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.kf0 kf0Var = new org.telegram.ui.Components.kf0(28);
                this.f37332r = kf0Var;
                kf0Var.h = 200;
                this.f37331q = new org.telegram.ui.Components.eq(photoViewer.D.getDrawable(2131231006).mutate(), kf0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f37328n;
            if (i10 < fArr.length) {
                if (fArr[i10] != 1.0f) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f37330p) {
            this.f37330p = z10;
            PhotoViewer photoViewer = this.f37334t;
            if (this == photoViewer.W0[0]) {
                photoViewer.u3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = org.telegram.messenger.i0.f16026q.y;
        PhotoViewer photoViewer = this.f37333s;
        if (!photoViewer.f33592s) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f37324j * this.f37329o))) / 2) + 0.0f);
        if (photoViewer.f33454c2 == 1) {
            return i12 - org.telegram.messenger.i0.L(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f7 = this.f37324j;
        int i11 = (int) (this.f37329o * f7);
        int width = (this.f37333s.f33470e0.getWidth() - ((int) (f7 * this.f37329o))) / 2;
        int b10 = b();
        float f10 = 1.0f;
        int i12 = 0;
        while (true) {
            float[] fArr = this.f37327m;
            if (i12 >= fArr.length) {
                break;
            }
            if (i12 == 2) {
                f10 = org.telegram.messenger.i0.G.getInterpolation(fArr[i12]) * f10;
            } else {
                f10 *= fArr[i12];
            }
            i12++;
        }
        int i13 = this.f37325k;
        Drawable drawable2 = this.f37331q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.U8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f37326l * 255.0f * f10));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.U8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f37325k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.m5.A(1.0f, this.f37326l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f37325k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.i0.L(4.0f);
        if (this.f37325k != -2) {
            PhotoViewer.Y8.setAlpha((int) (this.f37326l * 255.0f * f10));
        } else {
            PhotoViewer.Y8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f37322g;
        rectF.set(width + L, b10 + L, (width + i11) - L, (b10 + i11) - L);
        canvas.drawArc(rectF, this.f37319b - 90.0f, Math.max(4.0f, this.f37321f * 360.0f), false, PhotoViewer.Y8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f37323i;
        org.telegram.ui.Components.kf0 kf0Var = this.f37332r;
        if (kf0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                kf0Var.a(false, z12);
            } else if (i10 == 4) {
                kf0Var.a(true, z12);
            }
            kf0Var.f27744f = view;
            kf0Var.invalidateSelf();
        }
        this.f37318a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f37325k = i11;
            this.f37326l = 1.0f;
        } else {
            this.f37325k = -2;
        }
        this.h = i10;
        PhotoViewer photoViewer = this.f37334t;
        if (this == photoViewer.W0[0]) {
            photoViewer.u3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.f37328n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.f37327m[i10] = f7;
            }
            a();
            this.f37323i.invalidate();
        }
    }

    public final void f(boolean z10, float f7) {
        if (!z10) {
            this.f37321f = f7;
            this.d = f7;
        } else {
            this.d = this.f37321f;
        }
        this.f37320c = f7;
        this.e = 0L;
        this.f37323i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f37318a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f37318a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f37321f == 1.0f && this.f37320c == 1.0f) {
                z11 = false;
            } else {
                this.f37319b = (((float) (360 * j10)) / 3000.0f) + this.f37319b;
                float f7 = this.f37320c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f10 = this.f37320c;
                        this.f37321f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f37321f = (PhotoViewer.X8.getInterpolation(((float) j11) / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f37326l;
            if (f11 > 0.0f && this.f37325k != -2) {
                float f12 = f11 - (((float) j10) / 200.0f);
                this.f37326l = f12;
                if (f12 <= 0.0f) {
                    this.f37326l = 0.0f;
                    this.f37325k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f37328n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f37327m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = org.telegram.ui.Cells.f1.e((float) j10, 200.0f, f14, 1.0f);
            } else if (f13 < f14) {
                fArr2[i10] = org.telegram.ui.Cells.f1.v((float) j10, 200.0f, f14, 0.0f);
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f37323i.postInvalidateOnAnimation();
        }
    }
}
