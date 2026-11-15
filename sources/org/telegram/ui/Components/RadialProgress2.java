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
    public View f32656b;
    public boolean f32657c;
    public final Paint f32658e;
    public final Paint f32659f;
    public final Paint f32660g;
    public final Paint h;
    public final s80 f32661i;
    public final s80 f32662j;
    public float f32663k;
    public int f32664l;
    public int f32665m;
    public int f32666n;
    public int f32667o;
    public int f32668p;
    public int f32669q;
    public float f32670r;
    public float f32671s;
    public int f32672t;
    public int f32673u;
    public int v;
    public final ImageReceiver f32674w;
    public int f32675x;
    public boolean f32676y;
    public boolean f32677z;
    public final RectF f32655a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f32659f = paint;
        this.f32660g = new Paint(1);
        this.h = new Paint(1);
        this.f32663k = 1.0f;
        this.f32668p = -1;
        this.f32669q = -1;
        this.f32671s = 1.0f;
        this.f32672t = -1;
        this.f32673u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = e6Var;
        this.f32658e = new Paint(1);
        this.f32656b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f32674w = imageReceiver;
        imageReceiver.K0 = true;
        s80 s80Var = new s80();
        this.f32661i = s80Var;
        s80 s80Var2 = new s80();
        this.f32662j = s80Var2;
        s80Var2.f39223j = true;
        s80Var2.f39217b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        s80Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.f32675x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            s80Var.A = new gx(view, 14);
            s80Var2.A = new gx(view, 14);
        }
    }

    public final int a() {
        return this.f32661i.f39230q;
    }

    public final float b() {
        s80 s80Var = this.f32661i;
        int i7 = s80Var.f39230q;
        int i10 = s80Var.f39229p;
        if ((i7 == 3 || i7 == 6 || i7 == 10 || i7 == 8 || i7 == 0) && i10 == 4) {
            return s80Var.b();
        }
        if (i7 != 4) {
            return 1.0f;
        }
        return 1.0f - s80Var.b();
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
        View view = this.f32656b;
        RectF rectF = this.f32655a;
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
        s80 s80Var = this.f32661i;
        int i14 = s80Var.f39230q;
        Paint paint2 = s80Var.f39218c;
        if (i14 != 4 || s80Var.b() < 1.0f) {
            RectF rectF = this.f32655a;
            if (!rectF.isEmpty()) {
                int i15 = s80Var.f39230q;
                float b11 = b();
                boolean z10 = this.f32677z;
                s80 s80Var2 = this.f32662j;
                Paint paint3 = this.h;
                if (z10 && this.f32669q < 0) {
                    int i16 = this.v;
                    if (i16 >= 0) {
                        s80Var2.c(org.telegram.ui.ActionBar.j6.w0(i16, this.F));
                    } else {
                        s80Var2.c(this.f32667o);
                    }
                    int i17 = this.f32672t;
                    if (i17 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(i17, this.F));
                    } else {
                        paint3.setColor(this.f32665m);
                    }
                } else {
                    int i18 = this.f32673u;
                    if (i18 >= 0) {
                        s80Var2.c(org.telegram.ui.ActionBar.j6.w0(i18, this.F));
                    } else {
                        s80Var2.c(this.f32666n);
                    }
                    int i19 = this.f32668p;
                    if (i19 >= 0) {
                        if (this.f32669q >= 0) {
                            paint3.setColor(org.telegram.messenger.g0.S0(this.f32670r, this.f32671s, org.telegram.ui.ActionBar.j6.w0(i19, this.F), org.telegram.ui.ActionBar.j6.w0(this.f32669q, this.F)));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.j6.w0(i19, this.F));
                        }
                    } else {
                        paint3.setColor(this.f32664l);
                    }
                }
                boolean z11 = this.f32676y;
                Paint paint4 = this.f32660g;
                if (z11) {
                    int i20 = this.v;
                    if (i20 >= 0) {
                        i7 = org.telegram.ui.ActionBar.j6.w0(i20, this.F);
                        s80Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.w0(this.f32672t, this.F));
                    } else {
                        i7 = this.f32667o;
                        s80Var.c(i7);
                        paint2.setColor((-16777216) | this.f32665m);
                    }
                    int i21 = this.f32672t;
                    if (i21 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(i21, this.F));
                    } else {
                        paint4.setColor(this.f32665m);
                    }
                } else {
                    int i22 = this.f32673u;
                    if (i22 >= 0) {
                        i7 = org.telegram.ui.ActionBar.j6.w0(i22, this.F);
                        s80Var.c(i7);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.w0(this.f32668p, this.F));
                    } else {
                        i7 = this.f32666n;
                        s80Var.c(i7);
                        paint2.setColor((-16777216) | this.f32664l);
                    }
                    int i23 = this.f32668p;
                    if (i23 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(i23, this.F));
                    } else {
                        paint4.setColor(this.f32664l);
                    }
                }
                if ((this.f32657c || this.f32669q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f32657c || this.f32669q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f32674w;
                boolean I = imageReceiver.I();
                boolean z12 = true;
                Paint paint5 = this.f32659f;
                int i24 = 2;
                if (I) {
                    float f13 = imageReceiver.f22278i1;
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
                    s80Var.c(argb);
                    float f14 = this.f32675x * 2;
                    imageReceiver.y0(ceil - i13, ceil2 - i13, f14, f14);
                } else {
                    f10 = 1.0f;
                    f11 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f32669q >= 0 && this.f32671s != f10) {
                    i10 = canvas5.save();
                    float f15 = f10;
                    float t6 = com.google.android.gms.internal.vision.e2.t(f15, this.f32671s, 0.1f, f15);
                    this.D.scale(t6, t6, ceil, ceil2);
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f32657c || this.f32669q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f32675x, paint4);
                    } else if (i15 != 4 || f11 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f32675x, paint4);
                    }
                }
                if (imageReceiver.I()) {
                    imageReceiver.setAlpha(this.E * f11 * this.H);
                    if ((this.f32657c || this.f32669q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.h(canvas3, null);
                        this.D.drawCircle(ceil, ceil2, this.f32675x, paint5);
                    } else {
                        imageReceiver.h(canvas, null);
                        canvas.drawCircle(ceil, ceil2, this.f32675x, paint5);
                    }
                }
                int i25 = this.f32675x;
                int i26 = this.G;
                if (i26 > 0 && i25 > i26) {
                    i25 = i26;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f16 = this.I;
                    canvas.scale(f16, f16, ceil, ceil2);
                }
                s80Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
                s80Var.E = imageReceiver.I();
                if (!this.f32657c && this.f32669q < 0) {
                    s80Var.f39228o = this.E;
                    s80Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        s80Var.draw(canvas6);
                    } else {
                        s80Var.draw(canvas);
                    }
                }
                if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i10);
                }
                if (this.f32657c || this.f32669q >= 0) {
                    if (Math.abs(rectF.width() - org.telegram.messenger.g0.L(44.0f)) < org.telegram.messenger.g0.f23608p) {
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
                    if (this.f32657c) {
                        if (s80Var2.f39230q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - s80Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f32657c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f18 = i11 + 18 + i24;
                        canvas7.drawCircle(org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(i27 + 1) * f12 * this.f32663k, org.telegram.ui.ActionBar.j6.f29026n0);
                    } else {
                        int i28 = this.d;
                        Paint paint6 = this.f32658e;
                        paint6.setColor(i28);
                        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f32663k < 1.0f) {
                        i12 = canvas.save();
                        float f19 = this.f32663k;
                        canvas.scale(f19, f19, centerX, centerY);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    float f20 = i27;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.f32671s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f20) * f12), paint);
                    if (this.f32657c) {
                        s80Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f20) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f20) * f12)), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f20) * f12) + centerY));
                        s80Var2.draw(canvas);
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
        this.f32674w.P();
    }

    public final void f() {
        this.f32674w.R();
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.f32668p = i7;
        this.f32672t = i10;
        this.f32673u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.gms.internal.vision.e2.j(this.f32675x * 2, "_", this.f32675x * 2);
        } else {
            str2 = null;
        }
        this.f32674w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.gj gjVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(photoSize, document);
        int i7 = this.f32675x;
        this.f32674w.q0(c10, com.google.android.gms.internal.vision.e2.j(i7 * 2, "_", i7 * 2), null, null, gjVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        org.telegram.messenger.gc c10;
        Locale locale = Locale.US;
        String j3 = com.google.android.gms.internal.vision.e2.j(this.f32675x * 2, "_", this.f32675x * 2);
        org.telegram.messenger.gc gcVar = null;
        if (photoSize == null) {
            c10 = null;
        } else {
            c10 = org.telegram.messenger.gc.c(photoSize, document);
        }
        if (photoSize2 != null) {
            gcVar = org.telegram.messenger.gc.c(photoSize2, document);
        }
        this.f32674w.r0(c10, j3, gcVar, j3, null, 0L, null, obj, 1);
    }

    public final void k(int i7, boolean z10, boolean z11) {
        boolean z12;
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            s80 s80Var = this.f32662j;
            if (z10 && i7 == s80Var.f39230q) {
                return;
            }
            s80Var.d(i7, z11);
            if (i7 == 4 && s80Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f32657c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f32656b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f32663k = f10;
    }

    public final void m(int i7) {
        this.f32658e.setColor(i7);
    }

    public final void n(View view) {
        this.f32656b = view;
        this.f32674w.H0(view);
        Objects.requireNonNull(view);
        this.f32661i.A = new gx(view, 14);
        this.f32662j.A = new gx(view, 14);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.f32677z = z10;
        } else {
            this.f32676y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f10) {
        if (this.f32657c) {
            this.f32662j.e(z10, f10);
        } else {
            this.f32661i.e(z10, f10);
        }
    }

    public final void q(int i7) {
        this.d = i7;
    }

    public final void r(int i7, int i10, int i11, int i12) {
        this.f32655a.set(i7, i10, i11, i12);
    }

    public void setAsMini() {
        s80 s80Var = this.f32661i;
        s80Var.f39223j = true;
        s80Var.f39217b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        s80 s80Var = this.f32661i;
        s80Var.C = linearGradient;
        s80Var.D = new Matrix();
        s80 s80Var2 = this.f32662j;
        s80Var2.C = linearGradient;
        s80Var2.D = new Matrix();
    }

    public void setCircleRadius(int i7) {
        this.f32675x = i7;
        this.f32674w.J0(i7);
    }

    public void setColors(int i7, int i10, int i11, int i12) {
        this.f32664l = i7;
        this.f32665m = i10;
        this.f32666n = i11;
        this.f32667o = i12;
        this.f32668p = -1;
        this.f32672t = -1;
        this.f32673u = -1;
        this.v = -1;
    }

    public void setIcon(int i7, boolean z10, boolean z11) {
        s80 s80Var = this.f32661i;
        if (!z10 || i7 != s80Var.f39230q) {
            s80Var.d(i7, z11);
            View view = this.f32656b;
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
