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
    public org.telegram.ui.ActionBar.e6 F;
    public int G;
    public float H;
    public float I;
    public View f31549b;
    public boolean f31550c;
    public final Paint f31551e;
    public final Paint f31552f;
    public final Paint f31553g;
    public final Paint h;
    public final m80 f31554i;
    public final m80 f31555j;
    public float f31556k;
    public int f31557l;
    public int f31558m;
    public int f31559n;
    public int f31560o;
    public int f31561p;
    public int f31562q;
    public float f31563r;
    public float f31564s;
    public int f31565t;
    public int f31566u;
    public int v;
    public final ImageReceiver f31567w;
    public int f31568x;
    public boolean f31569y;
    public boolean f31570z;
    public final RectF f31548a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f31552f = paint;
        this.f31553g = new Paint(1);
        this.h = new Paint(1);
        this.f31556k = 1.0f;
        this.f31561p = -1;
        this.f31562q = -1;
        this.f31564s = 1.0f;
        this.f31565t = -1;
        this.f31566u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = e6Var;
        this.f31551e = new Paint(1);
        this.f31549b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31567w = imageReceiver;
        imageReceiver.K0 = true;
        m80 m80Var = new m80();
        this.f31554i = m80Var;
        m80 m80Var2 = new m80();
        this.f31555j = m80Var2;
        m80Var2.f36076j = true;
        m80Var2.f36070b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        m80Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.f31568x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            m80Var.A = new zw(view, 14);
            m80Var2.A = new zw(view, 14);
        }
    }

    public final int a() {
        return this.f31554i.f36083q;
    }

    public final float b() {
        m80 m80Var = this.f31554i;
        int i3 = m80Var.f36083q;
        int i10 = m80Var.f36082p;
        if ((i3 == 3 || i3 == 6 || i3 == 10 || i3 == 8 || i3 == 0) && i10 == 4) {
            return m80Var.b();
        }
        if (i3 != 4) {
            return 1.0f;
        }
        return 1.0f - m80Var.b();
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
        View view = this.f31549b;
        RectF rectF = this.f31548a;
        int i3 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        view.invalidate(i3, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i3;
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
        m80 m80Var = this.f31554i;
        int i14 = m80Var.f36083q;
        Paint paint2 = m80Var.f36071c;
        if (i14 != 4 || m80Var.b() < 1.0f) {
            RectF rectF = this.f31548a;
            if (!rectF.isEmpty()) {
                int i15 = m80Var.f36083q;
                float b11 = b();
                boolean z10 = this.f31570z;
                m80 m80Var2 = this.f31555j;
                Paint paint3 = this.h;
                if (z10 && this.f31562q < 0) {
                    int i16 = this.v;
                    if (i16 >= 0) {
                        m80Var2.c(org.telegram.ui.ActionBar.k6.w0(i16, this.F));
                    } else {
                        m80Var2.c(this.f31560o);
                    }
                    int i17 = this.f31565t;
                    if (i17 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i17, this.F));
                    } else {
                        paint3.setColor(this.f31558m);
                    }
                } else {
                    int i18 = this.f31566u;
                    if (i18 >= 0) {
                        m80Var2.c(org.telegram.ui.ActionBar.k6.w0(i18, this.F));
                    } else {
                        m80Var2.c(this.f31559n);
                    }
                    int i19 = this.f31561p;
                    if (i19 >= 0) {
                        if (this.f31562q >= 0) {
                            paint3.setColor(org.telegram.messenger.g0.S0(this.f31563r, this.f31564s, org.telegram.ui.ActionBar.k6.w0(i19, this.F), org.telegram.ui.ActionBar.k6.w0(this.f31562q, this.F)));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i19, this.F));
                        }
                    } else {
                        paint3.setColor(this.f31557l);
                    }
                }
                boolean z11 = this.f31569y;
                Paint paint4 = this.f31553g;
                if (z11) {
                    int i20 = this.v;
                    if (i20 >= 0) {
                        i3 = org.telegram.ui.ActionBar.k6.w0(i20, this.F);
                        m80Var.c(i3);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.f31565t, this.F));
                    } else {
                        i3 = this.f31560o;
                        m80Var.c(i3);
                        paint2.setColor((-16777216) | this.f31558m);
                    }
                    int i21 = this.f31565t;
                    if (i21 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.k6.w0(i21, this.F));
                    } else {
                        paint4.setColor(this.f31558m);
                    }
                } else {
                    int i22 = this.f31566u;
                    if (i22 >= 0) {
                        i3 = org.telegram.ui.ActionBar.k6.w0(i22, this.F);
                        m80Var.c(i3);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.f31561p, this.F));
                    } else {
                        i3 = this.f31559n;
                        m80Var.c(i3);
                        paint2.setColor((-16777216) | this.f31557l);
                    }
                    int i23 = this.f31561p;
                    if (i23 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.k6.w0(i23, this.F));
                    } else {
                        paint4.setColor(this.f31557l);
                    }
                }
                if ((this.f31550c || this.f31562q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f31550c || this.f31562q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f31567w;
                boolean I = imageReceiver.I();
                boolean z12 = true;
                Paint paint5 = this.f31552f;
                int i24 = 2;
                if (I) {
                    float f13 = imageReceiver.f21249i1;
                    f10 = 1.0f;
                    paint5.setAlpha((int) (this.E * 100.0f * f13 * b11));
                    if (f13 >= 1.0f) {
                        argb = -1;
                        f11 = b11;
                        paint = paint3;
                        z12 = false;
                    } else {
                        int red = Color.red(i3);
                        int green = Color.green(i3);
                        f11 = b11;
                        int blue = Color.blue(i3);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i3) + ((int) ((255 - alpha) * f13)), red + ((int) ((255 - red) * f13)), green + ((int) ((255 - green) * f13)), blue + ((int) ((255 - blue) * f13)));
                    }
                    m80Var.c(argb);
                    float f14 = this.f31568x * 2;
                    imageReceiver.y0(ceil - i13, ceil2 - i13, f14, f14);
                } else {
                    f10 = 1.0f;
                    f11 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f31562q >= 0 && this.f31564s != f10) {
                    i10 = canvas5.save();
                    float f15 = f10;
                    float D = a1.g.D(f15, this.f31564s, 0.1f, f15);
                    this.D.scale(D, D, ceil, ceil2);
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f31550c || this.f31562q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f31568x, paint4);
                    } else if (i15 != 4 || f11 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f31568x, paint4);
                    }
                }
                if (imageReceiver.I()) {
                    imageReceiver.setAlpha(this.E * f11 * this.H);
                    if ((this.f31550c || this.f31562q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.h(canvas3, null);
                        this.D.drawCircle(ceil, ceil2, this.f31568x, paint5);
                    } else {
                        imageReceiver.h(canvas, null);
                        canvas.drawCircle(ceil, ceil2, this.f31568x, paint5);
                    }
                }
                int i25 = this.f31568x;
                int i26 = this.G;
                if (i26 > 0 && i25 > i26) {
                    i25 = i26;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f16 = this.I;
                    canvas.scale(f16, f16, ceil, ceil2);
                }
                m80Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
                m80Var.E = imageReceiver.I();
                if (!this.f31550c && this.f31562q < 0) {
                    m80Var.f36081o = this.E;
                    m80Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        m80Var.draw(canvas6);
                    } else {
                        m80Var.draw(canvas);
                    }
                }
                if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i10);
                }
                if (this.f31550c || this.f31562q >= 0) {
                    if (Math.abs(rectF.width() - org.telegram.messenger.g0.L(44.0f)) < org.telegram.messenger.g0.f22607p) {
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
                    if (this.f31550c) {
                        if (m80Var2.f36083q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - m80Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f31550c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f18 = i11 + 18 + i24;
                        canvas7.drawCircle(org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(i27 + 1) * f12 * this.f31556k, org.telegram.ui.ActionBar.k6.f28057n0);
                    } else {
                        int i28 = this.d;
                        Paint paint6 = this.f31551e;
                        paint6.setColor(i28);
                        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f31556k < 1.0f) {
                        i12 = canvas.save();
                        float f19 = this.f31556k;
                        canvas.scale(f19, f19, centerX, centerY);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    float f20 = i27;
                    canvas.drawCircle(centerX, centerY, com.google.android.recaptcha.internal.a.y(1.0f, this.f31564s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f20) * f12), paint);
                    if (this.f31550c) {
                        m80Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f20) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f20) * f12)), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerY));
                        m80Var2.draw(canvas);
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
        this.f31567w.P();
    }

    public final void f() {
        this.f31567w.R();
    }

    public final void g(int i3, int i10, int i11, int i12) {
        this.f31561p = i3;
        this.f31565t = i10;
        this.f31566u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.recaptcha.internal.a.i(this.f31568x * 2, "_", this.f31568x * 2);
        } else {
            str2 = null;
        }
        this.f31567w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.zi ziVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(photoSize, document);
        int i3 = this.f31568x;
        this.f31567w.q0(c2, com.google.android.recaptcha.internal.a.i(i3 * 2, "_", i3 * 2), null, null, ziVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        org.telegram.messenger.ac c2;
        Locale locale = Locale.US;
        String i3 = com.google.android.recaptcha.internal.a.i(this.f31568x * 2, "_", this.f31568x * 2);
        org.telegram.messenger.ac acVar = null;
        if (photoSize == null) {
            c2 = null;
        } else {
            c2 = org.telegram.messenger.ac.c(photoSize, document);
        }
        if (photoSize2 != null) {
            acVar = org.telegram.messenger.ac.c(photoSize2, document);
        }
        this.f31567w.r0(c2, i3, acVar, i3, null, 0L, null, obj, 1);
    }

    public final void k(int i3, boolean z10, boolean z11) {
        boolean z12;
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            m80 m80Var = this.f31555j;
            if (z10 && i3 == m80Var.f36083q) {
                return;
            }
            m80Var.d(i3, z11);
            if (i3 == 4 && m80Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f31550c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f31549b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f31556k = f10;
    }

    public final void m(int i3) {
        this.f31551e.setColor(i3);
    }

    public final void n(View view) {
        this.f31549b = view;
        this.f31567w.H0(view);
        Objects.requireNonNull(view);
        this.f31554i.A = new zw(view, 14);
        this.f31555j.A = new zw(view, 14);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.f31570z = z10;
        } else {
            this.f31569y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f10) {
        if (this.f31550c) {
            this.f31555j.e(z10, f10);
        } else {
            this.f31554i.e(z10, f10);
        }
    }

    public final void q(int i3) {
        this.d = i3;
    }

    public final void r(int i3, int i10, int i11, int i12) {
        this.f31548a.set(i3, i10, i11, i12);
    }

    public void setAsMini() {
        m80 m80Var = this.f31554i;
        m80Var.f36076j = true;
        m80Var.f36070b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        m80 m80Var = this.f31554i;
        m80Var.C = linearGradient;
        m80Var.D = new Matrix();
        m80 m80Var2 = this.f31555j;
        m80Var2.C = linearGradient;
        m80Var2.D = new Matrix();
    }

    public void setCircleRadius(int i3) {
        this.f31568x = i3;
        this.f31567w.J0(i3);
    }

    public void setColors(int i3, int i10, int i11, int i12) {
        this.f31557l = i3;
        this.f31558m = i10;
        this.f31559n = i11;
        this.f31560o = i12;
        this.f31561p = -1;
        this.f31565t = -1;
        this.f31566u = -1;
        this.v = -1;
    }

    public void setIcon(int i3, boolean z10, boolean z11) {
        m80 m80Var = this.f31554i;
        if (!z10 || i3 != m80Var.f36083q) {
            m80Var.d(i3, z11);
            View view = this.f31549b;
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
