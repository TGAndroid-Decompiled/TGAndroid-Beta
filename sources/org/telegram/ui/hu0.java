package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class hu0 {
    public final View f38016i;
    public boolean f38023p;
    public final org.telegram.ui.Components.wq f38024q;
    public final org.telegram.ui.Components.dh0 f38025r;
    public final PhotoViewer f38026s;
    public long f38011a = 0;
    public float f38012b = 0.0f;
    public float f38013c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f38014f = 0.0f;
    public final RectF f38015g = new RectF();
    public int h = -1;
    public final int f38017j = AndroidUtilities.dp(64.0f);
    public int f38018k = -2;
    public float f38019l = 1.0f;
    public final float[] f38020m = new float[3];
    public final float[] f38021n = new float[3];
    public float f38022o = 1.0f;

    public hu0(PhotoViewer photoViewer, View view) {
        this.f38026s = photoViewer;
        if (PhotoViewer.X8 == null) {
            PhotoViewer.X8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.Y8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.Y8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.Y8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.Y8.setColor(-1);
        }
        this.f38016i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f38021n;
            if (i10 < fArr.length) {
                this.f38020m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(28);
                this.f38025r = dh0Var;
                dh0Var.h = 200;
                this.f38024q = new org.telegram.ui.Components.wq(photoViewer.f33761y.getDrawable(R.drawable.circle_big).mutate(), dh0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f38021n;
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
        if (z10 != this.f38023p) {
            this.f38023p = z10;
            fs0 fs0Var = (fs0) this;
            PhotoViewer photoViewer = fs0Var.f37378t;
            if (fs0Var == photoViewer.W0[0]) {
                photoViewer.t3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f38026s;
        if (!photoViewer.f33704s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f38017j * this.f38022o))) / 2) + 0.0f);
        if (photoViewer.f33566c2 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f7 = this.f38017j;
        int i11 = (int) (this.f38022o * f7);
        int width = (this.f38026s.f33582e0.getWidth() - ((int) (f7 * this.f38022o))) / 2;
        int b10 = b();
        float f10 = 1.0f;
        int i12 = 0;
        while (true) {
            float[] fArr = this.f38020m;
            if (i12 >= fArr.length) {
                break;
            }
            if (i12 == 2) {
                f10 = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * f10;
            } else {
                f10 *= fArr[i12];
            }
            i12++;
        }
        int i13 = this.f38018k;
        Drawable drawable2 = this.f38024q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.U8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f38019l * 255.0f * f10));
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
                    if (this.f38018k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.v0.A(1.0f, this.f38019l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f38018k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f38018k != -2) {
            PhotoViewer.Y8.setAlpha((int) (this.f38019l * 255.0f * f10));
        } else {
            PhotoViewer.Y8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f38015g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f38012b - 90.0f, Math.max(4.0f, this.f38014f * 360.0f), false, PhotoViewer.Y8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f38016i;
        org.telegram.ui.Components.dh0 dh0Var = this.f38025r;
        if (dh0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                dh0Var.a(false, z12);
            } else if (i10 == 4) {
                dh0Var.a(true, z12);
            }
            dh0Var.f25737f = view;
            dh0Var.invalidateSelf();
        }
        this.f38011a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f38018k = i11;
            this.f38019l = 1.0f;
        } else {
            this.f38018k = -2;
        }
        this.h = i10;
        fs0 fs0Var = (fs0) this;
        PhotoViewer photoViewer = fs0Var.f37378t;
        if (fs0Var == photoViewer.W0[0]) {
            photoViewer.t3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.f38021n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.f38020m[i10] = f7;
            }
            a();
            this.f38016i.invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        if (!z10) {
            this.f38014f = f7;
            this.d = f7;
        } else {
            this.d = this.f38014f;
        }
        this.f38013c = f7;
        this.e = 0L;
        this.f38016i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f38011a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f38011a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f38014f == 1.0f && this.f38013c == 1.0f) {
                z11 = false;
            } else {
                this.f38012b = (((float) (360 * j10)) / 3000.0f) + this.f38012b;
                float f7 = this.f38013c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f10 = this.f38013c;
                        this.f38014f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f38014f = (PhotoViewer.X8.getInterpolation(((float) j11) / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f38019l;
            if (f11 > 0.0f && this.f38018k != -2) {
                float f12 = f11 - (((float) j10) / 200.0f);
                this.f38019l = f12;
                if (f12 <= 0.0f) {
                    this.f38019l = 0.0f;
                    this.f38018k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f38021n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f38020m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = org.telegram.ui.Cells.b1.c((float) j10, 200.0f, f14, 1.0f);
            } else if (f13 < f14) {
                fArr2[i10] = org.telegram.ui.Cells.b1.t((float) j10, 200.0f, f14, 0.0f);
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f38016i.postInvalidateOnAnimation();
        }
    }
}
