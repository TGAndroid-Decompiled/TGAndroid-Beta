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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.f6 F;
    public int G;
    public float H;
    public float I;
    public View f21211b;
    public boolean f21212c;
    public final Paint e;
    public final Paint f21213f;
    public final Paint f21214g;
    public final Paint h;
    public final ca0 f21215i;
    public final ca0 f21216j;
    public float f21217k;
    public int f21218l;
    public int f21219m;
    public int f21220n;
    public int f21221o;
    public int f21222p;
    public int f21223q;
    public float f21224r;
    public float f21225s;
    public int f21226t;
    public int f21227u;
    public int v;
    public final ImageReceiver f21228w;
    public int f21229x;
    public boolean f21230y;
    public boolean f21231z;
    public final RectF f21210a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f21213f = paint;
        this.f21214g = new Paint(1);
        this.h = new Paint(1);
        this.f21217k = 1.0f;
        this.f21222p = -1;
        this.f21223q = -1;
        this.f21225s = 1.0f;
        this.f21226t = -1;
        this.f21227u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = f6Var;
        this.e = new Paint(1);
        this.f21211b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f21228w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        ca0 ca0Var = new ca0();
        this.f21215i = ca0Var;
        ca0 ca0Var2 = new ca0();
        this.f21216j = ca0Var2;
        ca0Var2.f22073j = true;
        ca0Var2.f22068b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        ca0Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f21229x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            ca0Var.A = new pv(view, 13);
            ca0Var2.A = new pv(view, 13);
        }
    }

    public final int a() {
        return this.f21215i.f22080q;
    }

    public final float b() {
        ca0 ca0Var = this.f21215i;
        int i10 = ca0Var.f22080q;
        int i11 = ca0Var.f22079p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return ca0Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - ca0Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int dp = AndroidUtilities.dp(2.0f);
        View view = this.f21211b;
        RectF rectF = this.f21210a;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f7;
        Paint paint;
        float f10;
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
        ca0 ca0Var = this.f21215i;
        int i15 = ca0Var.f22080q;
        Paint paint2 = ca0Var.f22069c;
        if (i15 != 4 || ca0Var.b() < 1.0f) {
            RectF rectF = this.f21210a;
            if (!rectF.isEmpty()) {
                int i16 = ca0Var.f22080q;
                float b11 = b();
                boolean z10 = this.f21231z;
                ca0 ca0Var2 = this.f21216j;
                Paint paint3 = this.h;
                if (z10 && this.f21223q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        ca0Var2.c(org.telegram.ui.ActionBar.j6.v0(i17, this.F));
                    } else {
                        ca0Var2.c(this.f21221o);
                    }
                    int i18 = this.f21226t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f21219m);
                    }
                } else {
                    int i19 = this.f21227u;
                    if (i19 >= 0) {
                        ca0Var2.c(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                    } else {
                        ca0Var2.c(this.f21220n);
                    }
                    int i20 = this.f21222p;
                    if (i20 >= 0) {
                        if (this.f21223q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F), org.telegram.ui.ActionBar.j6.v0(this.f21223q, this.F), this.f21224r, this.f21225s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f21218l);
                    }
                }
                boolean z11 = this.f21230y;
                Paint paint4 = this.f21214g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i21, this.F);
                        ca0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f21226t, this.F));
                    } else {
                        i10 = this.f21221o;
                        ca0Var.c(i10);
                        paint2.setColor((-16777216) | this.f21219m);
                    }
                    int i22 = this.f21226t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f21219m);
                    }
                } else {
                    int i23 = this.f21227u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i23, this.F);
                        ca0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f21222p, this.F));
                    } else {
                        i10 = this.f21220n;
                        ca0Var.c(i10);
                        paint2.setColor((-16777216) | this.f21218l);
                    }
                    int i24 = this.f21222p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f21218l);
                    }
                }
                if ((this.f21212c || this.f21223q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f21212c || this.f21223q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f21228w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f21213f;
                int i25 = 2;
                if (hasBitmapImage) {
                    float currentAlpha = imageReceiver.getCurrentAlpha();
                    paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b11));
                    if (currentAlpha >= 1.0f) {
                        argb = -1;
                        f7 = b11;
                        paint = paint3;
                        z12 = false;
                        f10 = 1.0f;
                    } else {
                        int red = Color.red(i10);
                        f10 = 1.0f;
                        int green = Color.green(i10);
                        f7 = b11;
                        int blue = Color.blue(i10);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i10) + ((int) ((255 - alpha) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                    }
                    ca0Var.c(argb);
                    float f12 = this.f21229x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f12, f12);
                } else {
                    f7 = b11;
                    paint = paint3;
                    f10 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f21223q >= 0 && this.f21225s != f10) {
                    i11 = canvas5.save();
                    float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, this.f21225s, 0.1f, 1.0f);
                    this.D.scale(a2, a2, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f21212c || this.f21223q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f21229x, paint4);
                    } else if (i16 != 4 || f7 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f21229x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f7 * this.E * this.H);
                    if ((this.f21212c || this.f21223q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f21229x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f21229x, paint5);
                    }
                }
                int i26 = this.f21229x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f13 = this.I;
                    canvas.scale(f13, f13, ceil, ceil2);
                }
                ca0Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                ca0Var.E = imageReceiver.hasBitmapImage();
                if (!this.f21212c && this.f21223q < 0) {
                    ca0Var.f22078o = this.E;
                    ca0Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        ca0Var.draw(canvas6);
                    } else {
                        ca0Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f21212c || this.f21223q >= 0) {
                    if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                        float f14 = 16;
                        centerX = rectF.centerX() + AndroidUtilities.dp(f14);
                        centerY = rectF.centerY() + AndroidUtilities.dp(f14);
                        i12 = 20;
                        i25 = 0;
                    } else {
                        centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                        centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                        i12 = 22;
                    }
                    int i28 = i12 / 2;
                    if (this.f21212c) {
                        if (ca0Var2.f22080q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - ca0Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f21212c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f15 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(i28 + 1) * f11 * this.f21217k, org.telegram.ui.ActionBar.j6.f18104n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f21217k < 1.0f) {
                        i13 = canvas.save();
                        float f16 = this.f21217k;
                        canvas.scale(f16, f16, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f17 = i28;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.f21225s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f17) * f11), paint);
                    if (this.f21212c) {
                        ca0Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f17) * f11)), (int) (centerY - (AndroidUtilities.dp(f17) * f11)), (int) ((AndroidUtilities.dp(f17) * f11) + centerX), (int) ((AndroidUtilities.dp(f17) * f11) + centerY));
                        ca0Var2.draw(canvas);
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
        this.f21228w.onAttachedToWindow();
    }

    public final void f() {
        this.f21228w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f21222p = i10;
        this.f21226t = i11;
        this.f21227u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a4.a.k(this.f21229x * 2, this.f21229x * 2, "_");
        } else {
            str2 = null;
        }
        this.f21228w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f21229x;
        this.f21228w.setImage(forDocument, a4.a.k(i10 * 2, i10 * 2, "_"), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String k10 = a4.a.k(this.f21229x * 2, this.f21229x * 2, "_");
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f21228w.setImage(forDocument, k10, imageLocation, k10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            ca0 ca0Var = this.f21216j;
            if (z10 && i10 == ca0Var.f22080q) {
                return;
            }
            ca0Var.d(i10, z11);
            if (i10 == 4 && ca0Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f21212c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f21211b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f7) {
        this.f21217k = f7;
    }

    public final void m(View view) {
        this.f21211b = view;
        this.f21228w.setParentView(view);
        Objects.requireNonNull(view);
        this.f21215i.A = new pv(view, 13);
        this.f21216j.A = new pv(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f21231z = z10;
        } else {
            this.f21230y = z10;
        }
        d();
    }

    public final void o(float f7, boolean z10) {
        if (this.f21212c) {
            this.f21216j.e(f7, z10);
        } else {
            this.f21215i.e(f7, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f21210a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        ca0 ca0Var = this.f21215i;
        ca0Var.f22073j = true;
        ca0Var.f22068b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        ca0 ca0Var = this.f21215i;
        ca0Var.C = linearGradient;
        ca0Var.D = new Matrix();
        ca0 ca0Var2 = this.f21216j;
        ca0Var2.C = linearGradient;
        ca0Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f21229x = i10;
        this.f21228w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f21218l = i10;
        this.f21219m = i11;
        this.f21220n = i12;
        this.f21221o = i13;
        this.f21222p = -1;
        this.f21226t = -1;
        this.f21227u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        ca0 ca0Var = this.f21215i;
        if (!z10 || i10 != ca0Var.f22080q) {
            ca0Var.d(i10, z11);
            View view = this.f21211b;
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
