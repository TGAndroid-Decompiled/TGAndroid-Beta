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
    public org.telegram.ui.ActionBar.g6 F;
    public int G;
    public float H;
    public float I;
    public View f31482b;
    public boolean f31483c;
    public final Paint f31484e;
    public final Paint f31485f;
    public final Paint f31486g;
    public final Paint h;
    public final q80 f31487i;
    public final q80 f31488j;
    public float f31489k;
    public int f31490l;
    public int f31491m;
    public int f31492n;
    public int f31493o;
    public int f31494p;
    public int f31495q;
    public float f31496r;
    public float f31497s;
    public int f31498t;
    public int f31499u;
    public int v;
    public final ImageReceiver f31500w;
    public int f31501x;
    public boolean f31502y;
    public boolean f31503z;
    public final RectF f31481a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.f31485f = paint;
        this.f31486g = new Paint(1);
        this.h = new Paint(1);
        this.f31489k = 1.0f;
        this.f31494p = -1;
        this.f31495q = -1;
        this.f31497s = 1.0f;
        this.f31498t = -1;
        this.f31499u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = g6Var;
        this.f31484e = new Paint(1);
        this.f31482b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31500w = imageReceiver;
        imageReceiver.J0 = true;
        q80 q80Var = new q80();
        this.f31487i = q80Var;
        q80 q80Var2 = new q80();
        this.f31488j = q80Var2;
        q80Var2.f37246j = true;
        q80Var2.f37240b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        q80Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.f31501x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            q80Var.A = new bx(view, 14);
            q80Var2.A = new bx(view, 14);
        }
    }

    public final int a() {
        return this.f31487i.f37253q;
    }

    public final float b() {
        q80 q80Var = this.f31487i;
        int i7 = q80Var.f37253q;
        int i10 = q80Var.f37252p;
        if ((i7 == 3 || i7 == 6 || i7 == 10 || i7 == 8 || i7 == 0) && i10 == 4) {
            return q80Var.b();
        }
        if (i7 != 4) {
            return 1.0f;
        }
        return 1.0f - q80Var.b();
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
        View view = this.f31482b;
        RectF rectF = this.f31481a;
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
        q80 q80Var = this.f31487i;
        int i14 = q80Var.f37253q;
        Paint paint2 = q80Var.f37241c;
        if (i14 != 4 || q80Var.b() < 1.0f) {
            RectF rectF = this.f31481a;
            if (!rectF.isEmpty()) {
                int i15 = q80Var.f37253q;
                float b11 = b();
                boolean z9 = this.f31503z;
                q80 q80Var2 = this.f31488j;
                Paint paint3 = this.h;
                if (z9 && this.f31495q < 0) {
                    int i16 = this.v;
                    if (i16 >= 0) {
                        q80Var2.c(org.telegram.ui.ActionBar.l6.w0(i16, this.F));
                    } else {
                        q80Var2.c(this.f31493o);
                    }
                    int i17 = this.f31498t;
                    if (i17 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.l6.w0(i17, this.F));
                    } else {
                        paint3.setColor(this.f31491m);
                    }
                } else {
                    int i18 = this.f31499u;
                    if (i18 >= 0) {
                        q80Var2.c(org.telegram.ui.ActionBar.l6.w0(i18, this.F));
                    } else {
                        q80Var2.c(this.f31492n);
                    }
                    int i19 = this.f31494p;
                    if (i19 >= 0) {
                        if (this.f31495q >= 0) {
                            paint3.setColor(org.telegram.messenger.g0.S0(this.f31496r, this.f31497s, org.telegram.ui.ActionBar.l6.w0(i19, this.F), org.telegram.ui.ActionBar.l6.w0(this.f31495q, this.F)));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.l6.w0(i19, this.F));
                        }
                    } else {
                        paint3.setColor(this.f31490l);
                    }
                }
                boolean z10 = this.f31502y;
                Paint paint4 = this.f31486g;
                if (z10) {
                    int i20 = this.v;
                    if (i20 >= 0) {
                        i7 = org.telegram.ui.ActionBar.l6.w0(i20, this.F);
                        q80Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.l6.w0(this.f31498t, this.F));
                    } else {
                        i7 = this.f31493o;
                        q80Var.c(i7);
                        paint2.setColor((-16777216) | this.f31491m);
                    }
                    int i21 = this.f31498t;
                    if (i21 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.l6.w0(i21, this.F));
                    } else {
                        paint4.setColor(this.f31491m);
                    }
                } else {
                    int i22 = this.f31499u;
                    if (i22 >= 0) {
                        i7 = org.telegram.ui.ActionBar.l6.w0(i22, this.F);
                        q80Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.l6.w0(this.f31494p, this.F));
                    } else {
                        i7 = this.f31492n;
                        q80Var.c(i7);
                        paint2.setColor((-16777216) | this.f31490l);
                    }
                    int i23 = this.f31494p;
                    if (i23 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.l6.w0(i23, this.F));
                    } else {
                        paint4.setColor(this.f31490l);
                    }
                }
                if ((this.f31483c || this.f31495q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f31483c || this.f31495q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f31500w;
                boolean I = imageReceiver.I();
                boolean z11 = true;
                Paint paint5 = this.f31485f;
                int i24 = 2;
                if (I) {
                    float f13 = imageReceiver.f21197h1;
                    f10 = 1.0f;
                    paint5.setAlpha((int) (this.E * 100.0f * f13 * b11));
                    if (f13 >= 1.0f) {
                        argb = -1;
                        f11 = b11;
                        paint = paint3;
                        z11 = false;
                    } else {
                        int red = Color.red(i7);
                        int green = Color.green(i7);
                        f11 = b11;
                        int blue = Color.blue(i7);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i7) + ((int) ((255 - alpha) * f13)), red + ((int) ((255 - red) * f13)), green + ((int) ((255 - green) * f13)), blue + ((int) ((255 - blue) * f13)));
                    }
                    q80Var.c(argb);
                    float f14 = this.f31501x * 2;
                    imageReceiver.y0(ceil - i13, ceil2 - i13, f14, f14);
                } else {
                    f10 = 1.0f;
                    f11 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f31495q >= 0 && this.f31497s != f10) {
                    i10 = canvas5.save();
                    float f15 = f10;
                    float v = com.google.android.recaptcha.internal.a.v(f15, this.f31497s, 0.1f, f15);
                    this.D.scale(v, v, ceil, ceil2);
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (z11 && this.B) {
                    if ((this.f31483c || this.f31495q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f31501x, paint4);
                    } else if (i15 != 4 || f11 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f31501x, paint4);
                    }
                }
                if (imageReceiver.I()) {
                    imageReceiver.setAlpha(this.E * f11 * this.H);
                    if ((this.f31483c || this.f31495q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.h(canvas3, null);
                        this.D.drawCircle(ceil, ceil2, this.f31501x, paint5);
                    } else {
                        imageReceiver.h(canvas, null);
                        canvas.drawCircle(ceil, ceil2, this.f31501x, paint5);
                    }
                }
                int i25 = this.f31501x;
                int i26 = this.G;
                if (i26 > 0 && i25 > i26) {
                    i25 = i26;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f16 = this.I;
                    canvas.scale(f16, f16, ceil, ceil2);
                }
                q80Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
                q80Var.E = imageReceiver.I();
                if (!this.f31483c && this.f31495q < 0) {
                    q80Var.f37251o = this.E;
                    q80Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        q80Var.draw(canvas6);
                    } else {
                        q80Var.draw(canvas);
                    }
                }
                if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i10);
                }
                if (this.f31483c || this.f31495q >= 0) {
                    if (Math.abs(rectF.width() - org.telegram.messenger.g0.L(44.0f)) < org.telegram.messenger.g0.f22562p) {
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
                    if (this.f31483c) {
                        if (q80Var2.f37253q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - q80Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f31483c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f18 = i11 + 18 + i24;
                        canvas7.drawCircle(org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(i27 + 1) * f12 * this.f31489k, org.telegram.ui.ActionBar.l6.f28042n0);
                    } else {
                        int i28 = this.d;
                        Paint paint6 = this.f31484e;
                        paint6.setColor(i28);
                        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f31489k < 1.0f) {
                        i12 = canvas.save();
                        float f19 = this.f31489k;
                        canvas.scale(f19, f19, centerX, centerY);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    float f20 = i27;
                    canvas.drawCircle(centerX, centerY, com.google.android.recaptcha.internal.a.z(1.0f, this.f31497s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f20) * f12), paint);
                    if (this.f31483c) {
                        q80Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f20) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f20) * f12)), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerY));
                        q80Var2.draw(canvas);
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
        this.f31500w.P();
    }

    public final void f() {
        this.f31500w.R();
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f31494p = i7;
        this.f31498t = i10;
        this.f31499u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.recaptcha.internal.a.j(this.f31501x * 2, "_", this.f31501x * 2);
        } else {
            str2 = null;
        }
        this.f31500w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.ij ijVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(photoSize, document);
        int i7 = this.f31501x;
        this.f31500w.q0(c10, com.google.android.recaptcha.internal.a.j(i7 * 2, "_", i7 * 2), null, null, ijVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        org.telegram.messenger.hc c10;
        Locale locale = Locale.US;
        String j3 = com.google.android.recaptcha.internal.a.j(this.f31501x * 2, "_", this.f31501x * 2);
        org.telegram.messenger.hc hcVar = null;
        if (photoSize == null) {
            c10 = null;
        } else {
            c10 = org.telegram.messenger.hc.c(photoSize, document);
        }
        if (photoSize2 != null) {
            hcVar = org.telegram.messenger.hc.c(photoSize2, document);
        }
        this.f31500w.r0(c10, j3, hcVar, j3, null, 0L, null, obj, 1);
    }

    public final void k(int i7, boolean z9, boolean z10) {
        boolean z11;
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            q80 q80Var = this.f31488j;
            if (z9 && i7 == q80Var.f37253q) {
                return;
            }
            q80Var.d(i7, z10);
            if (i7 == 4 && q80Var.b() >= 1.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f31483c = z11;
            if (z11) {
                c();
            }
            if (!z10) {
                this.f31482b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f31489k = f10;
    }

    public final void m(int i7) {
        this.f31484e.setColor(i7);
    }

    public final void n(View view) {
        this.f31482b = view;
        this.f31500w.H0(view);
        Objects.requireNonNull(view);
        this.f31487i.A = new bx(view, 14);
        this.f31488j.A = new bx(view, 14);
    }

    public final void o(boolean z9, boolean z10) {
        if (z10) {
            this.f31503z = z9;
        } else {
            this.f31502y = z9;
        }
        d();
    }

    public final void p(boolean z9, float f10) {
        if (this.f31483c) {
            this.f31488j.e(z9, f10);
        } else {
            this.f31487i.e(z9, f10);
        }
    }

    public final void q(int i7) {
        this.d = i7;
    }

    public final void r(int i7, int i10, int i11, int i12) {
        this.f31481a.set(i7, i10, i11, i12);
    }

    public void setAsMini() {
        q80 q80Var = this.f31487i;
        q80Var.f37246j = true;
        q80Var.f37240b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        q80 q80Var = this.f31487i;
        q80Var.C = linearGradient;
        q80Var.D = new Matrix();
        q80 q80Var2 = this.f31488j;
        q80Var2.C = linearGradient;
        q80Var2.D = new Matrix();
    }

    public void setCircleRadius(int i7) {
        this.f31501x = i7;
        this.f31500w.J0(i7);
    }

    public void setColors(int i7, int i10, int i11, int i12) {
        this.f31490l = i7;
        this.f31491m = i10;
        this.f31492n = i11;
        this.f31493o = i12;
        this.f31494p = -1;
        this.f31498t = -1;
        this.f31499u = -1;
        this.v = -1;
    }

    public void setIcon(int i7, boolean z9, boolean z10) {
        q80 q80Var = this.f31487i;
        if (!z9 || i7 != q80Var.f37253q) {
            q80Var.d(i7, z10);
            View view = this.f31482b;
            if (view != null) {
                if (!z10) {
                    view.invalidate();
                } else {
                    d();
                }
            }
        }
    }
}
