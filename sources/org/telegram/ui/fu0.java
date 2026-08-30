package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class fu0 {
    public final View f34361i;
    public boolean f34368p;
    public final org.telegram.ui.Components.nq f34369q;
    public final org.telegram.ui.Components.mg0 f34370r;
    public final PhotoViewer f34371s;
    public long f34356a = 0;
    public float f34357b = 0.0f;
    public float f34358c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f34359f = 0.0f;
    public final RectF f34360g = new RectF();
    public int h = -1;
    public final int f34362j = AndroidUtilities.dp(64.0f);
    public int f34363k = -2;
    public float f34364l = 1.0f;
    public final float[] f34365m = new float[3];
    public final float[] f34366n = new float[3];
    public float f34367o = 1.0f;

    public fu0(PhotoViewer photoViewer, View view) {
        this.f34371s = photoViewer;
        if (PhotoViewer.T8 == null) {
            PhotoViewer.T8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.U8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.U8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.U8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.U8.setColor(-1);
        }
        this.f34361i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f34366n;
            if (i10 < fArr.length) {
                this.f34365m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.mg0 mg0Var = new org.telegram.ui.Components.mg0(28);
                this.f34370r = mg0Var;
                mg0Var.h = 200;
                this.f34369q = new org.telegram.ui.Components.nq(photoViewer.f31913y.getDrawable(R.drawable.circle_big).mutate(), mg0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z4;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f34366n;
            if (i10 < fArr.length) {
                if (fArr[i10] != 1.0f) {
                    z4 = false;
                    break;
                }
                i10++;
            } else {
                z4 = true;
                break;
            }
        }
        if (z4 != this.f34368p) {
            this.f34368p = z4;
            bs0 bs0Var = (bs0) this;
            PhotoViewer photoViewer = bs0Var.f33027t;
            if (bs0Var == photoViewer.T0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f34371s;
        if (!photoViewer.f31858s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f34362j * this.f34367o))) / 2) + 0.0f);
        if (photoViewer.Z1 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f10 = this.f34362j;
        int i11 = (int) (this.f34367o * f10);
        int width = (this.f34371s.f31705b0.getWidth() - ((int) (f10 * this.f34367o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f11 = 1.0f;
        while (true) {
            float[] fArr = this.f34365m;
            if (i12 >= fArr.length) {
                break;
            }
            if (i12 == 2) {
                f11 = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * f11;
            } else {
                f11 *= fArr[i12];
            }
            i12++;
        }
        int i13 = this.f34363k;
        Drawable drawable2 = this.f34369q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Q8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f34364l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.Q8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f34363k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f34364l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f34363k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f34363k != -2) {
            PhotoViewer.U8.setAlpha((int) (this.f34364l * 255.0f * f11));
        } else {
            PhotoViewer.U8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f34360g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f34357b - 90.0f, Math.max(4.0f, this.f34359f * 360.0f), false, PhotoViewer.U8);
        g(true);
    }

    public final void d(int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f34361i;
        org.telegram.ui.Components.mg0 mg0Var = this.f34370r;
        if (mg0Var != null) {
            if (z10 && (i12 == 3 || i12 == 4)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 == 3) {
                mg0Var.a(false, z11);
            } else if (i10 == 4) {
                mg0Var.a(true, z11);
            }
            mg0Var.f27016f = view;
            mg0Var.invalidateSelf();
        }
        this.f34356a = System.currentTimeMillis();
        if (z4 && (i11 = this.h) != i10) {
            this.f34363k = i11;
            this.f34364l = 1.0f;
        } else {
            this.f34363k = -2;
        }
        this.h = i10;
        bs0 bs0Var = (bs0) this;
        PhotoViewer photoViewer = bs0Var.f33027t;
        if (bs0Var == photoViewer.T0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f10, boolean z4) {
        float[] fArr = this.f34366n;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            if (!z4) {
                this.f34365m[i10] = f10;
            }
            a();
            this.f34361i.invalidate();
        }
    }

    public final void f(float f10, boolean z4) {
        if (!z4) {
            this.f34359f = f10;
            this.d = f10;
        } else {
            this.d = this.f34359f;
        }
        this.f34358c = f10;
        this.e = 0L;
        this.f34361i.invalidate();
    }

    public final void g(boolean z4) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f34356a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f34356a = currentTimeMillis;
        int i10 = 0;
        if (z4) {
            if (this.f34359f == 1.0f && this.f34358c == 1.0f) {
                z10 = false;
            } else {
                this.f34357b = (((float) (360 * j10)) / 3000.0f) + this.f34357b;
                float f10 = this.f34358c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f11 = this.f34358c;
                        this.f34359f = f11;
                        this.d = f11;
                        this.e = 0L;
                    } else {
                        this.f34359f = (PhotoViewer.T8.getInterpolation(((float) j11) / 300.0f) * f10) + this.d;
                    }
                }
                z10 = true;
            }
            float f12 = this.f34364l;
            if (f12 > 0.0f && this.f34363k != -2) {
                float f13 = f12 - (((float) j10) / 200.0f);
                this.f34364l = f13;
                if (f13 <= 0.0f) {
                    this.f34364l = 0.0f;
                    this.f34363k = -2;
                }
                z10 = true;
            }
        } else {
            z10 = false;
        }
        while (true) {
            float[] fArr = this.f34366n;
            if (i10 >= fArr.length) {
                break;
            }
            float f14 = fArr[i10];
            float[] fArr2 = this.f34365m;
            float f15 = fArr2[i10];
            if (f14 > f15) {
                fArr2[i10] = Math.min(1.0f, (((float) j10) / 200.0f) + f15);
            } else if (f14 < f15) {
                fArr2[i10] = Math.max(0.0f, f15 - (((float) j10) / 200.0f));
            } else {
                i10++;
            }
            z10 = true;
            i10++;
        }
        if (z10) {
            this.f34361i.postInvalidateOnAnimation();
        }
    }
}
