package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class av0 {
    public final View f31086i;
    public boolean f31093p;
    public final org.telegram.ui.Components.vq f31094q;
    public final org.telegram.ui.Components.pg0 f31095r;
    public final PhotoViewer f31096s;
    public long f31081a = 0;
    public float f31082b = 0.0f;
    public float f31083c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f31084f = 0.0f;
    public final RectF f31085g = new RectF();
    public int h = -1;
    public final int f31087j = AndroidUtilities.dp(64.0f);
    public int f31088k = -2;
    public float f31089l = 1.0f;
    public final float[] f31090m = new float[3];
    public final float[] f31091n = new float[3];
    public float f31092o = 1.0f;

    public av0(PhotoViewer photoViewer, View view) {
        this.f31096s = photoViewer;
        if (PhotoViewer.W8 == null) {
            PhotoViewer.W8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.X8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.X8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.X8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.X8.setColor(-1);
        }
        this.f31086i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f31091n;
            if (i10 < fArr.length) {
                this.f31090m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(28);
                this.f31095r = pg0Var;
                pg0Var.h = 200;
                this.f31094q = new org.telegram.ui.Components.vq(photoViewer.f30227y.getDrawable(R.drawable.circle_big).mutate(), pg0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f31091n;
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
        if (z10 != this.f31093p) {
            this.f31093p = z10;
            ws0 ws0Var = (ws0) this;
            PhotoViewer photoViewer = ws0Var.f38385t;
            if (ws0Var == photoViewer.W0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f31096s;
        if (!photoViewer.f30170s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f31087j * this.f31092o))) / 2) + 0.0f);
        if (photoViewer.f30033c2 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f7 = this.f31087j;
        int i11 = (int) (this.f31092o * f7);
        int width = (this.f31096s.f30049e0.getWidth() - ((int) (f7 * this.f31092o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f10 = 1.0f;
        while (true) {
            float[] fArr = this.f31090m;
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
        int i13 = this.f31088k;
        Drawable drawable2 = this.f31094q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.T8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f31089l * 255.0f * f10));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.T8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f31088k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.a2.A(1.0f, this.f31089l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f31088k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f31088k != -2) {
            PhotoViewer.X8.setAlpha((int) (this.f31089l * 255.0f * f10));
        } else {
            PhotoViewer.X8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f31085g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f31082b - 90.0f, Math.max(4.0f, this.f31084f * 360.0f), false, PhotoViewer.X8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f31086i;
        org.telegram.ui.Components.pg0 pg0Var = this.f31095r;
        if (pg0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                pg0Var.a(false, z12);
            } else if (i10 == 4) {
                pg0Var.a(true, z12);
            }
            pg0Var.f26121f = view;
            pg0Var.invalidateSelf();
        }
        this.f31081a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f31088k = i11;
            this.f31089l = 1.0f;
        } else {
            this.f31088k = -2;
        }
        this.h = i10;
        ws0 ws0Var = (ws0) this;
        PhotoViewer photoViewer = ws0Var.f38385t;
        if (ws0Var == photoViewer.W0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.f31091n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.f31090m[i10] = f7;
            }
            a();
            this.f31086i.invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        if (!z10) {
            this.f31084f = f7;
            this.d = f7;
        } else {
            this.d = this.f31084f;
        }
        this.f31083c = f7;
        this.e = 0L;
        this.f31086i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f31081a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f31081a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f31084f == 1.0f && this.f31083c == 1.0f) {
                z11 = false;
            } else {
                this.f31082b = (((float) (360 * j3)) / 3000.0f) + this.f31082b;
                float f7 = this.f31083c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        float f10 = this.f31083c;
                        this.f31084f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f31084f = (PhotoViewer.W8.getInterpolation(((float) j10) / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f31089l;
            if (f11 > 0.0f && this.f31088k != -2) {
                float f12 = f11 - (((float) j3) / 200.0f);
                this.f31089l = f12;
                if (f12 <= 0.0f) {
                    this.f31089l = 0.0f;
                    this.f31088k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f31091n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f31090m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = Math.min(1.0f, (((float) j3) / 200.0f) + f14);
            } else if (f13 < f14) {
                fArr2[i10] = Math.max(0.0f, f14 - (((float) j3) / 200.0f));
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f31086i.postInvalidateOnAnimation();
        }
    }
}
