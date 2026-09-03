package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class mu0 {
    public final View f36209i;
    public boolean f36216p;
    public final org.telegram.ui.Components.mq f36217q;
    public final org.telegram.ui.Components.ng0 f36218r;
    public final PhotoViewer f36219s;
    public long f36204a = 0;
    public float f36205b = 0.0f;
    public float f36206c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f36207f = 0.0f;
    public final RectF f36208g = new RectF();
    public int h = -1;
    public final int f36210j = AndroidUtilities.dp(64.0f);
    public int f36211k = -2;
    public float f36212l = 1.0f;
    public final float[] f36213m = new float[3];
    public final float[] f36214n = new float[3];
    public float f36215o = 1.0f;

    public mu0(PhotoViewer photoViewer, View view) {
        this.f36219s = photoViewer;
        if (PhotoViewer.T8 == null) {
            PhotoViewer.T8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.U8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.U8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.U8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.U8.setColor(-1);
        }
        this.f36209i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f36214n;
            if (i10 < fArr.length) {
                this.f36213m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.ng0 ng0Var = new org.telegram.ui.Components.ng0(28);
                this.f36218r = ng0Var;
                ng0Var.h = 200;
                this.f36217q = new org.telegram.ui.Components.mq(photoViewer.f31887y.getDrawable(R.drawable.circle_big).mutate(), ng0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z4;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f36214n;
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
        if (z4 != this.f36216p) {
            this.f36216p = z4;
            is0 is0Var = (is0) this;
            PhotoViewer photoViewer = is0Var.f35024t;
            if (is0Var == photoViewer.T0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f36219s;
        if (!photoViewer.f31832s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f36210j * this.f36215o))) / 2) + 0.0f);
        if (photoViewer.Z1 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f10 = this.f36210j;
        int i11 = (int) (this.f36215o * f10);
        int width = (this.f36219s.f31679b0.getWidth() - ((int) (f10 * this.f36215o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f11 = 1.0f;
        while (true) {
            float[] fArr = this.f36213m;
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
        int i13 = this.f36211k;
        Drawable drawable2 = this.f36217q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Q8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f36212l * 255.0f * f11));
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
                    if (this.f36211k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f36212l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f36211k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f36211k != -2) {
            PhotoViewer.U8.setAlpha((int) (this.f36212l * 255.0f * f11));
        } else {
            PhotoViewer.U8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f36208g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f36205b - 90.0f, Math.max(4.0f, this.f36207f * 360.0f), false, PhotoViewer.U8);
        g(true);
    }

    public final void d(int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f36209i;
        org.telegram.ui.Components.ng0 ng0Var = this.f36218r;
        if (ng0Var != null) {
            if (z10 && (i12 == 3 || i12 == 4)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 == 3) {
                ng0Var.a(false, z11);
            } else if (i10 == 4) {
                ng0Var.a(true, z11);
            }
            ng0Var.f27257f = view;
            ng0Var.invalidateSelf();
        }
        this.f36204a = System.currentTimeMillis();
        if (z4 && (i11 = this.h) != i10) {
            this.f36211k = i11;
            this.f36212l = 1.0f;
        } else {
            this.f36211k = -2;
        }
        this.h = i10;
        is0 is0Var = (is0) this;
        PhotoViewer photoViewer = is0Var.f35024t;
        if (is0Var == photoViewer.T0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f10, boolean z4) {
        float[] fArr = this.f36214n;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            if (!z4) {
                this.f36213m[i10] = f10;
            }
            a();
            this.f36209i.invalidate();
        }
    }

    public final void f(float f10, boolean z4) {
        if (!z4) {
            this.f36207f = f10;
            this.d = f10;
        } else {
            this.d = this.f36207f;
        }
        this.f36206c = f10;
        this.e = 0L;
        this.f36209i.invalidate();
    }

    public final void g(boolean z4) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f36204a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f36204a = currentTimeMillis;
        int i10 = 0;
        if (z4) {
            if (this.f36207f == 1.0f && this.f36206c == 1.0f) {
                z10 = false;
            } else {
                this.f36205b = (((float) (360 * j10)) / 3000.0f) + this.f36205b;
                float f10 = this.f36206c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.e + j10;
                    this.e = j11;
                    if (j11 >= 300) {
                        float f11 = this.f36206c;
                        this.f36207f = f11;
                        this.d = f11;
                        this.e = 0L;
                    } else {
                        this.f36207f = (PhotoViewer.T8.getInterpolation(((float) j11) / 300.0f) * f10) + this.d;
                    }
                }
                z10 = true;
            }
            float f12 = this.f36212l;
            if (f12 > 0.0f && this.f36211k != -2) {
                float f13 = f12 - (((float) j10) / 200.0f);
                this.f36212l = f13;
                if (f13 <= 0.0f) {
                    this.f36212l = 0.0f;
                    this.f36211k = -2;
                }
                z10 = true;
            }
        } else {
            z10 = false;
        }
        while (true) {
            float[] fArr = this.f36214n;
            if (i10 >= fArr.length) {
                break;
            }
            float f14 = fArr[i10];
            float[] fArr2 = this.f36213m;
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
            this.f36209i.postInvalidateOnAnimation();
        }
    }
}
