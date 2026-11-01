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
    public org.telegram.ui.ActionBar.p6 F;
    public int G;
    public float H;
    public float I;
    public View f24125b;
    public boolean f24126c;
    public final Paint e;
    public final Paint f24127f;
    public final Paint f24128g;
    public final Paint h;
    public final i90 f24129i;
    public final i90 f24130j;
    public float f24131k;
    public int f24132l;
    public int f24133m;
    public int f24134n;
    public int f24135o;
    public int f24136p;
    public int f24137q;
    public float f24138r;
    public float f24139s;
    public int f24140t;
    public int f24141u;
    public int v;
    public final ImageReceiver f24142w;
    public int f24143x;
    public boolean f24144y;
    public boolean f24145z;
    public final RectF f24124a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.f24127f = paint;
        this.f24128g = new Paint(1);
        this.h = new Paint(1);
        this.f24131k = 1.0f;
        this.f24136p = -1;
        this.f24137q = -1;
        this.f24139s = 1.0f;
        this.f24140t = -1;
        this.f24141u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = p6Var;
        this.e = new Paint(1);
        this.f24125b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f24142w = imageReceiver;
        imageReceiver.J0 = true;
        i90 i90Var = new i90();
        this.f24129i = i90Var;
        i90 i90Var2 = new i90();
        this.f24130j = i90Var2;
        i90Var2.f27041j = true;
        i90Var2.f27036b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        i90Var2.d(4, false);
        int L = org.telegram.messenger.i0.L(22.0f);
        this.f24143x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            i90Var.A = new px(view, 14);
            i90Var2.A = new px(view, 14);
        }
    }

    public final int a() {
        return this.f24129i.f27048q;
    }

    public final float b() {
        i90 i90Var = this.f24129i;
        int i10 = i90Var.f27048q;
        int i11 = i90Var.f27047p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return i90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - i90Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int L = org.telegram.messenger.i0.L(2.0f);
        View view = this.f24125b;
        RectF rectF = this.f24124a;
        int i10 = ((int) rectF.left) - L;
        int i11 = ((int) rectF.top) - L;
        int i12 = L * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f7;
        float f10;
        Paint paint;
        int i11;
        float centerX;
        float centerY;
        int i12;
        float f11;
        int i13;
        float b10;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int alpha;
        int argb;
        int i14;
        i90 i90Var = this.f24129i;
        int i15 = i90Var.f27048q;
        Paint paint2 = i90Var.f27037c;
        if (i15 != 4 || i90Var.b() < 1.0f) {
            RectF rectF = this.f24124a;
            if (!rectF.isEmpty()) {
                int i16 = i90Var.f27048q;
                float b11 = b();
                boolean z10 = this.f24145z;
                i90 i90Var2 = this.f24130j;
                Paint paint3 = this.h;
                if (z10 && this.f24137q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        i90Var2.c(org.telegram.ui.ActionBar.t6.w0(i17, this.F));
                    } else {
                        i90Var2.c(this.f24135o);
                    }
                    int i18 = this.f24140t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i18, this.F));
                    } else {
                        paint3.setColor(this.f24133m);
                    }
                } else {
                    int i19 = this.f24141u;
                    if (i19 >= 0) {
                        i90Var2.c(org.telegram.ui.ActionBar.t6.w0(i19, this.F));
                    } else {
                        i90Var2.c(this.f24134n);
                    }
                    int i20 = this.f24136p;
                    if (i20 >= 0) {
                        if (this.f24137q >= 0) {
                            paint3.setColor(org.telegram.messenger.i0.S0(this.f24138r, this.f24139s, org.telegram.ui.ActionBar.t6.w0(i20, this.F), org.telegram.ui.ActionBar.t6.w0(this.f24137q, this.F)));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f24132l);
                    }
                }
                boolean z11 = this.f24144y;
                Paint paint4 = this.f24128g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.t6.w0(i21, this.F);
                        i90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.t6.w0(this.f24140t, this.F));
                    } else {
                        i10 = this.f24135o;
                        i90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24133m);
                    }
                    int i22 = this.f24140t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.t6.w0(i22, this.F));
                    } else {
                        paint4.setColor(this.f24133m);
                    }
                } else {
                    int i23 = this.f24141u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.t6.w0(i23, this.F);
                        i90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.t6.w0(this.f24136p, this.F));
                    } else {
                        i10 = this.f24134n;
                        i90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24132l);
                    }
                    int i24 = this.f24136p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.t6.w0(i24, this.F));
                    } else {
                        paint4.setColor(this.f24132l);
                    }
                }
                if ((this.f24126c || this.f24137q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f24126c || this.f24137q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f24142w;
                boolean I = imageReceiver.I();
                boolean z12 = true;
                Paint paint5 = this.f24127f;
                int i25 = 2;
                if (I) {
                    float f12 = imageReceiver.f14385h1;
                    f7 = 1.0f;
                    paint5.setAlpha((int) (this.E * 100.0f * f12 * b11));
                    if (f12 >= 1.0f) {
                        argb = -1;
                        f10 = b11;
                        paint = paint3;
                        z12 = false;
                    } else {
                        int red = Color.red(i10);
                        int green = Color.green(i10);
                        f10 = b11;
                        int blue = Color.blue(i10);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i10) + ((int) ((255 - alpha) * f12)), red + ((int) ((255 - red) * f12)), green + ((int) ((255 - green) * f12)), blue + ((int) ((255 - blue) * f12)));
                    }
                    i90Var.c(argb);
                    float f13 = this.f24143x * 2;
                    imageReceiver.y0(ceil - i14, ceil2 - i14, f13, f13);
                } else {
                    f7 = 1.0f;
                    f10 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f24137q >= 0 && this.f24139s != f7) {
                    i11 = canvas5.save();
                    float f14 = f7;
                    float z13 = sc.e.z(f14, this.f24139s, 0.1f, f14);
                    this.D.scale(z13, z13, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f24126c || this.f24137q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f24143x, paint4);
                    } else if (i16 != 4 || f10 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f24143x, paint4);
                    }
                }
                if (imageReceiver.I()) {
                    imageReceiver.setAlpha(this.E * f10 * this.H);
                    if ((this.f24126c || this.f24137q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.h(canvas3, null);
                        this.D.drawCircle(ceil, ceil2, this.f24143x, paint5);
                    } else {
                        imageReceiver.h(canvas, null);
                        canvas.drawCircle(ceil, ceil2, this.f24143x, paint5);
                    }
                }
                int i26 = this.f24143x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f15 = this.I;
                    canvas.scale(f15, f15, ceil, ceil2);
                }
                i90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                i90Var.E = imageReceiver.I();
                if (!this.f24126c && this.f24137q < 0) {
                    i90Var.f27046o = this.E;
                    i90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        i90Var.draw(canvas6);
                    } else {
                        i90Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f24126c || this.f24137q >= 0) {
                    if (Math.abs(rectF.width() - org.telegram.messenger.i0.L(44.0f)) < org.telegram.messenger.i0.f16171p) {
                        float f16 = 16;
                        centerX = rectF.centerX() + org.telegram.messenger.i0.L(f16);
                        centerY = rectF.centerY() + org.telegram.messenger.i0.L(f16);
                        i12 = 20;
                        i25 = 0;
                    } else {
                        centerX = rectF.centerX() + org.telegram.messenger.i0.L(18.0f);
                        centerY = rectF.centerY() + org.telegram.messenger.i0.L(18.0f);
                        i12 = 22;
                    }
                    int i28 = i12 / 2;
                    if (this.f24126c) {
                        if (i90Var2.f27048q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - i90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f24126c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f17 = i12 + 18 + i25;
                        canvas7.drawCircle(org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(i28 + 1) * f11 * this.f24131k, org.telegram.ui.ActionBar.t6.f21110n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f24131k < 1.0f) {
                        i13 = canvas.save();
                        float f18 = this.f24131k;
                        canvas.scale(f18, f18, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f19 = i28;
                    canvas.drawCircle(centerX, centerY, c3.i0.z(1.0f, this.f24139s, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(f19) * f11), paint);
                    if (this.f24126c) {
                        i90Var2.setBounds((int) (centerX - (org.telegram.messenger.i0.L(f19) * f11)), (int) (centerY - (org.telegram.messenger.i0.L(f19) * f11)), (int) ((org.telegram.messenger.i0.L(f19) * f11) + centerX), (int) ((org.telegram.messenger.i0.L(f19) * f11) + centerY));
                        i90Var2.draw(canvas);
                    }
                    if (i13 != Integer.MIN_VALUE) {
                        canvas.restoreToCount(i13);
                    }
                }
                if (this.I != 1.0f) {
                    canvas.restore();
                }
            }
        }
    }

    public final void e() {
        this.f24142w.P();
    }

    public final void f() {
        this.f24142w.R();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24136p = i10;
        this.f24140t = i11;
        this.f24141u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a1.g.i(this.f24143x * 2, this.f24143x * 2, "_");
        } else {
            str2 = null;
        }
        this.f24142w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.kj kjVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.jc c10 = org.telegram.messenger.jc.c(photoSize, document);
        int i10 = this.f24143x;
        this.f24142w.q0(c10, a1.g.i(i10 * 2, i10 * 2, "_"), null, null, kjVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        org.telegram.messenger.jc c10;
        Locale locale = Locale.US;
        String i10 = a1.g.i(this.f24143x * 2, this.f24143x * 2, "_");
        org.telegram.messenger.jc jcVar = null;
        if (photoSize == null) {
            c10 = null;
        } else {
            c10 = org.telegram.messenger.jc.c(photoSize, document);
        }
        if (photoSize2 != null) {
            jcVar = org.telegram.messenger.jc.c(photoSize2, document);
        }
        this.f24142w.r0(c10, i10, jcVar, i10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            i90 i90Var = this.f24130j;
            if (z10 && i10 == i90Var.f27048q) {
                return;
            }
            i90Var.d(i10, z11);
            if (i10 == 4 && i90Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f24126c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f24125b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f7) {
        this.f24131k = f7;
    }

    public final void m(int i10) {
        this.e.setColor(i10);
    }

    public final void n(View view) {
        this.f24125b = view;
        this.f24142w.H0(view);
        Objects.requireNonNull(view);
        this.f24129i.A = new px(view, 14);
        this.f24130j.A = new px(view, 14);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.f24145z = z10;
        } else {
            this.f24144y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f7) {
        if (this.f24126c) {
            this.f24130j.e(z10, f7);
        } else {
            this.f24129i.e(z10, f7);
        }
    }

    public final void q(int i10) {
        this.d = i10;
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f24124a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        i90 i90Var = this.f24129i;
        i90Var.f27041j = true;
        i90Var.f27036b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        i90 i90Var = this.f24129i;
        i90Var.C = linearGradient;
        i90Var.D = new Matrix();
        i90 i90Var2 = this.f24130j;
        i90Var2.C = linearGradient;
        i90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f24143x = i10;
        this.f24142w.J0(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f24132l = i10;
        this.f24133m = i11;
        this.f24134n = i12;
        this.f24135o = i13;
        this.f24136p = -1;
        this.f24140t = -1;
        this.f24141u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        i90 i90Var = this.f24129i;
        if (!z10 || i10 != i90Var.f27048q) {
            i90Var.d(i10, z11);
            View view = this.f24125b;
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
