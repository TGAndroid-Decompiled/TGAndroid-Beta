package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.h6 F;
    public int G;
    public float H;
    public float I;
    public View f33055b;
    public boolean f33056c;
    public final Paint f33057e;
    public final Paint f33058f;
    public final Paint f33059g;
    public final Paint h;
    public final f90 f33060i;
    public final f90 f33061j;
    public float f33062k;
    public int f33063l;
    public int f33064m;
    public int f33065n;
    public int f33066o;
    public int f33067p;
    public int f33068q;
    public float f33069r;
    public float f33070s;
    public int f33071t;
    public int f33072u;
    public int v;
    public final ImageReceiver f33073w;
    public int f33074x;
    public boolean f33075y;
    public boolean f33076z;
    public final RectF f33054a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f33058f = paint;
        this.f33059g = new Paint(1);
        this.h = new Paint(1);
        this.f33062k = 1.0f;
        this.f33067p = -1;
        this.f33068q = -1;
        this.f33070s = 1.0f;
        this.f33071t = -1;
        this.f33072u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = h6Var;
        this.f33057e = new Paint(1);
        this.f33055b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f33073w = imageReceiver;
        imageReceiver.K0 = true;
        f90 f90Var = new f90();
        this.f33060i = f90Var;
        f90 f90Var2 = new f90();
        this.f33061j = f90Var2;
        f90Var2.f35146j = true;
        f90Var2.f35140b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        f90Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.f33074x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            f90Var.A = new ky(view, 13);
            f90Var2.A = new ky(view, 13);
        }
    }

    public final int a() {
        return this.f33060i.f35153q;
    }

    public final float b() {
        f90 f90Var = this.f33060i;
        int i7 = f90Var.f35153q;
        int i10 = f90Var.f35152p;
        if ((i7 == 3 || i7 == 6 || i7 == 10 || i7 == 8 || i7 == 0) && i10 == 4) {
            return f90Var.b();
        }
        if (i7 != 4) {
            return 1.0f;
        }
        return 1.0f - f90Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int L = org.telegram.messenger.g0.L(2.0f);
        View view = this.f33055b;
        RectF rectF = this.f33054a;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        view.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i7;
        int ceil;
        int ceil2;
        float f10;
        float f11;
        Paint paint;
        int i10;
        float centerX;
        float centerY;
        int i11;
        float f12;
        int i12;
        float b10;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int alpha;
        int argb;
        int i13;
        f90 f90Var = this.f33060i;
        int i14 = f90Var.f35153q;
        Paint paint2 = f90Var.f35141c;
        if (i14 != 4 || f90Var.b() < 1.0f) {
            RectF rectF = this.f33054a;
            if (!rectF.isEmpty()) {
                int i15 = f90Var.f35153q;
                float b11 = b();
                boolean z10 = this.f33076z;
                f90 f90Var2 = this.f33061j;
                Paint paint3 = this.h;
                if (z10 && this.f33068q < 0) {
                    int i16 = this.v;
                    if (i16 >= 0) {
                        f90Var2.c(org.telegram.ui.ActionBar.m6.w0(i16, this.F));
                    } else {
                        f90Var2.c(this.f33066o);
                    }
                    int i17 = this.f33071t;
                    if (i17 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i17, this.F));
                    } else {
                        paint3.setColor(this.f33064m);
                    }
                } else {
                    int i18 = this.f33072u;
                    if (i18 >= 0) {
                        f90Var2.c(org.telegram.ui.ActionBar.m6.w0(i18, this.F));
                    } else {
                        f90Var2.c(this.f33065n);
                    }
                    int i19 = this.f33067p;
                    if (i19 >= 0) {
                        if (this.f33068q >= 0) {
                            paint3.setColor(org.telegram.messenger.g0.S0(this.f33069r, this.f33070s, org.telegram.ui.ActionBar.m6.w0(i19, this.F), org.telegram.ui.ActionBar.m6.w0(this.f33068q, this.F)));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.m6.w0(i19, this.F));
                        }
                    } else {
                        paint3.setColor(this.f33063l);
                    }
                }
                boolean z11 = this.f33075y;
                Paint paint4 = this.f33059g;
                if (z11) {
                    int i20 = this.v;
                    if (i20 >= 0) {
                        i7 = org.telegram.ui.ActionBar.m6.w0(i20, this.F);
                        f90Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.m6.w0(this.f33071t, this.F));
                    } else {
                        i7 = this.f33066o;
                        f90Var.c(i7);
                        paint2.setColor((-16777216) | this.f33064m);
                    }
                    int i21 = this.f33071t;
                    if (i21 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.m6.w0(i21, this.F));
                    } else {
                        paint4.setColor(this.f33064m);
                    }
                } else {
                    int i22 = this.f33072u;
                    if (i22 >= 0) {
                        i7 = org.telegram.ui.ActionBar.m6.w0(i22, this.F);
                        f90Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.m6.w0(this.f33067p, this.F));
                    } else {
                        i7 = this.f33065n;
                        f90Var.c(i7);
                        paint2.setColor((-16777216) | this.f33063l);
                    }
                    int i23 = this.f33067p;
                    if (i23 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.m6.w0(i23, this.F));
                    } else {
                        paint4.setColor(this.f33063l);
                    }
                }
                if ((this.f33056c || this.f33068q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f33056c || this.f33068q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f33073w;
                boolean I = imageReceiver.I();
                boolean z12 = true;
                Paint paint5 = this.f33058f;
                int i24 = 2;
                if (I) {
                    float f13 = imageReceiver.f22636i1;
                    f10 = 1.0f;
                    paint5.setAlpha((int) (this.E * 100.0f * f13 * b11));
                    if (f13 >= 1.0f) {
                        argb = -1;
                        f11 = b11;
                        paint = paint3;
                        z12 = false;
                    } else {
                        int red = Color.red(i7);
                        int green = Color.green(i7);
                        f11 = b11;
                        int blue = Color.blue(i7);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i7) + ((int) ((255 - alpha) * f13)), red + ((int) ((255 - red) * f13)), green + ((int) ((255 - green) * f13)), blue + ((int) ((255 - blue) * f13)));
                    }
                    f90Var.c(argb);
                    float f14 = this.f33074x * 2;
                    imageReceiver.y0(ceil - i13, ceil2 - i13, f14, f14);
                } else {
                    f10 = 1.0f;
                    f11 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f33068q >= 0 && this.f33070s != f10) {
                    i10 = canvas5.save();
                    float f15 = f10;
                    float t6 = com.google.android.gms.internal.vision.e2.t(f15, this.f33070s, 0.1f, f15);
                    this.D.scale(t6, t6, ceil, ceil2);
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f33056c || this.f33068q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f33074x, paint4);
                    } else if (i15 != 4 || f11 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f33074x, paint4);
                    }
                }
                if (imageReceiver.I()) {
                    imageReceiver.setAlpha(this.E * f11 * this.H);
                    if ((this.f33056c || this.f33068q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.h(canvas3, null);
                        this.D.drawCircle(ceil, ceil2, this.f33074x, paint5);
                    } else {
                        imageReceiver.h(canvas, null);
                        canvas.drawCircle(ceil, ceil2, this.f33074x, paint5);
                    }
                }
                int i25 = this.f33074x;
                int i26 = this.G;
                if (i26 > 0 && i25 > i26) {
                    i25 = i26;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f16 = this.I;
                    canvas.scale(f16, f16, ceil, ceil2);
                }
                f90Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
                f90Var.E = imageReceiver.I();
                if (!this.f33056c && this.f33068q < 0) {
                    f90Var.f35151o = this.E;
                    f90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        f90Var.draw(canvas6);
                    } else {
                        f90Var.draw(canvas);
                    }
                }
                if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i10);
                }
                if (this.f33056c || this.f33068q >= 0) {
                    if (Math.abs(rectF.width() - org.telegram.messenger.g0.L(44.0f)) < org.telegram.messenger.g0.f24009p) {
                        float f17 = 16;
                        centerX = rectF.centerX() + org.telegram.messenger.g0.L(f17);
                        centerY = rectF.centerY() + org.telegram.messenger.g0.L(f17);
                        i11 = 20;
                        i24 = 0;
                    } else {
                        centerX = rectF.centerX() + org.telegram.messenger.g0.L(18.0f);
                        centerY = rectF.centerY() + org.telegram.messenger.g0.L(18.0f);
                        i11 = 22;
                    }
                    int i27 = i11 / 2;
                    if (this.f33056c) {
                        if (f90Var2.f35153q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - f90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f33056c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f18 = i11 + 18 + i24;
                        canvas7.drawCircle(org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(i27 + 1) * f12 * this.f33062k, org.telegram.ui.ActionBar.m6.f29524n0);
                    } else {
                        int i28 = this.d;
                        Paint paint6 = this.f33057e;
                        paint6.setColor(i28);
                        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f33062k < 1.0f) {
                        i12 = canvas.save();
                        float f19 = this.f33062k;
                        canvas.scale(f19, f19, centerX, centerY);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    float f20 = i27;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.f33070s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f20) * f12), paint);
                    if (this.f33056c) {
                        f90Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f20) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f20) * f12)), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerY));
                        f90Var2.draw(canvas);
                    }
                    if (i12 != Integer.MIN_VALUE) {
                        canvas.restoreToCount(i12);
                    }
                }
                if (this.I != 1.0f) {
                    canvas.restore();
                }
            }
        }
    }

    public final void e() {
        this.f33073w.P();
    }

    public final void f() {
        this.f33073w.R();
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f33067p = i7;
        this.f33071t = i10;
        this.f33072u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.gms.internal.vision.e2.j(this.f33074x * 2, "_", this.f33074x * 2);
        } else {
            str2 = null;
        }
        this.f33073w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.gj gjVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(photoSize, document);
        int i7 = this.f33074x;
        this.f33073w.q0(c10, com.google.android.gms.internal.vision.e2.j(i7 * 2, "_", i7 * 2), null, null, gjVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        org.telegram.messenger.gc c10;
        Locale locale = Locale.US;
        String j3 = com.google.android.gms.internal.vision.e2.j(this.f33074x * 2, "_", this.f33074x * 2);
        org.telegram.messenger.gc gcVar = null;
        if (photoSize == null) {
            c10 = null;
        } else {
            c10 = org.telegram.messenger.gc.c(photoSize, document);
        }
        if (photoSize2 != null) {
            gcVar = org.telegram.messenger.gc.c(photoSize2, document);
        }
        this.f33073w.r0(c10, j3, gcVar, j3, null, 0L, null, obj, 1);
    }

    public final void k(int i7, boolean z10, boolean z11) {
        boolean z12;
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            f90 f90Var = this.f33061j;
            if (z10 && i7 == f90Var.f35153q) {
                return;
            }
            f90Var.d(i7, z11);
            if (i7 == 4 && f90Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f33056c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f33055b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f33062k = f10;
    }

    public final void m(int i7) {
        this.f33057e.setColor(i7);
    }

    public final void n(View view) {
        this.f33055b = view;
        this.f33073w.H0(view);
        Objects.requireNonNull(view);
        this.f33060i.A = new ky(view, 13);
        this.f33061j.A = new ky(view, 13);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.f33076z = z10;
        } else {
            this.f33075y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f10) {
        if (this.f33056c) {
            this.f33061j.e(z10, f10);
        } else {
            this.f33060i.e(z10, f10);
        }
    }

    public final void q(int i7) {
        this.d = i7;
    }

    public final void r(int i7, int i10, int i11, int i12) {
        this.f33054a.set(i7, i10, i11, i12);
    }

    public void setAsMini() {
        f90 f90Var = this.f33060i;
        f90Var.f35146j = true;
        f90Var.f35140b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        f90 f90Var = this.f33060i;
        f90Var.C = linearGradient;
        f90Var.D = new Matrix();
        f90 f90Var2 = this.f33061j;
        f90Var2.C = linearGradient;
        f90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i7) {
        this.f33074x = i7;
        this.f33073w.J0(i7);
    }

    public void setColors(int i7, int i10, int i11, int i12) {
        this.f33063l = i7;
        this.f33064m = i10;
        this.f33065n = i11;
        this.f33066o = i12;
        this.f33067p = -1;
        this.f33071t = -1;
        this.f33072u = -1;
        this.v = -1;
    }

    public void setIcon(int i7, boolean z10, boolean z11) {
        f90 f90Var = this.f33060i;
        if (!z10 || i7 != f90Var.f35153q) {
            f90Var.d(i7, z11);
            View view = this.f33055b;
            if (view != null) {
                if (!z11) {
                    view.invalidate();
                } else {
                    d();
                }
            }
        }
    }
}
