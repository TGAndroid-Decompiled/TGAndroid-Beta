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
    public org.telegram.ui.ActionBar.c6 F;
    public int G;
    public float H;
    public float I;
    public View f26480b;
    public boolean f26481c;
    public final Paint f26482e;
    public final Paint f26483f;
    public final Paint f26484g;
    public final Paint h;
    public final o90 f26485i;
    public final o90 f26486j;
    public float f26487k;
    public int f26488l;
    public int f26489m;
    public int f26490n;
    public int f26491o;
    public int f26492p;
    public int f26493q;
    public float f26494r;
    public float f26495s;
    public int f26496t;
    public int f26497u;
    public int v;
    public final ImageReceiver f26498w;
    public int f26499x;
    public boolean f26500y;
    public boolean f26501z;
    public final RectF f26479a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f26483f = paint;
        this.f26484g = new Paint(1);
        this.h = new Paint(1);
        this.f26487k = 1.0f;
        this.f26492p = -1;
        this.f26493q = -1;
        this.f26495s = 1.0f;
        this.f26496t = -1;
        this.f26497u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = c6Var;
        this.f26482e = new Paint(1);
        this.f26480b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f26498w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        o90 o90Var = new o90();
        this.f26485i = o90Var;
        o90 o90Var2 = new o90();
        this.f26486j = o90Var2;
        o90Var2.f31304j = true;
        o90Var2.f31298b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        o90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f26499x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            o90Var.A = new cv(view, 13);
            o90Var2.A = new cv(view, 13);
        }
    }

    public final int a() {
        return this.f26485i.f31311q;
    }

    public final float b() {
        o90 o90Var = this.f26485i;
        int i10 = o90Var.f31311q;
        int i11 = o90Var.f31310p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return o90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - o90Var.b();
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
        View view = this.f26480b;
        RectF rectF = this.f26479a;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f9;
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
        o90 o90Var = this.f26485i;
        int i15 = o90Var.f31311q;
        Paint paint2 = o90Var.f31299c;
        if (i15 != 4 || o90Var.b() < 1.0f) {
            RectF rectF = this.f26479a;
            if (!rectF.isEmpty()) {
                int i16 = o90Var.f31311q;
                float b11 = b();
                boolean z10 = this.f26501z;
                o90 o90Var2 = this.f26486j;
                Paint paint3 = this.h;
                if (z10 && this.f26493q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        o90Var2.c(org.telegram.ui.ActionBar.g6.v0(i17, this.F));
                    } else {
                        o90Var2.c(this.f26491o);
                    }
                    int i18 = this.f26496t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f26489m);
                    }
                } else {
                    int i19 = this.f26497u;
                    if (i19 >= 0) {
                        o90Var2.c(org.telegram.ui.ActionBar.g6.v0(i19, this.F));
                    } else {
                        o90Var2.c(this.f26490n);
                    }
                    int i20 = this.f26492p;
                    if (i20 >= 0) {
                        if (this.f26493q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(i20, this.F), org.telegram.ui.ActionBar.g6.v0(this.f26493q, this.F), this.f26494r, this.f26495s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f26488l);
                    }
                }
                boolean z11 = this.f26500y;
                Paint paint4 = this.f26484g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.g6.v0(i21, this.F);
                        o90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.g6.v0(this.f26496t, this.F));
                    } else {
                        i10 = this.f26491o;
                        o90Var.c(i10);
                        paint2.setColor((-16777216) | this.f26489m);
                    }
                    int i22 = this.f26496t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.g6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f26489m);
                    }
                } else {
                    int i23 = this.f26497u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.g6.v0(i23, this.F);
                        o90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.g6.v0(this.f26492p, this.F));
                    } else {
                        i10 = this.f26490n;
                        o90Var.c(i10);
                        paint2.setColor((-16777216) | this.f26488l);
                    }
                    int i24 = this.f26492p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.g6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f26488l);
                    }
                }
                if ((this.f26481c || this.f26493q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f26481c || this.f26493q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f26498w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f26483f;
                int i25 = 2;
                if (hasBitmapImage) {
                    float currentAlpha = imageReceiver.getCurrentAlpha();
                    paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b11));
                    if (currentAlpha >= 1.0f) {
                        argb = -1;
                        f9 = b11;
                        paint = paint3;
                        z12 = false;
                        f10 = 1.0f;
                    } else {
                        int red = Color.red(i10);
                        f10 = 1.0f;
                        int green = Color.green(i10);
                        f9 = b11;
                        int blue = Color.blue(i10);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i10) + ((int) ((255 - alpha) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                    }
                    o90Var.c(argb);
                    float f12 = this.f26499x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f12, f12);
                } else {
                    f9 = b11;
                    paint = paint3;
                    f10 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f26493q >= 0 && this.f26495s != f10) {
                    i11 = canvas5.save();
                    float b12 = org.telegram.ui.th.b(1.0f, this.f26495s, 0.1f, 1.0f);
                    this.D.scale(b12, b12, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f26481c || this.f26493q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f26499x, paint4);
                    } else if (i16 != 4 || f9 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f26499x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f9 * this.E * this.H);
                    if ((this.f26481c || this.f26493q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f26499x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f26499x, paint5);
                    }
                }
                int i26 = this.f26499x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f13 = this.I;
                    canvas.scale(f13, f13, ceil, ceil2);
                }
                o90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                o90Var.E = imageReceiver.hasBitmapImage();
                if (!this.f26481c && this.f26493q < 0) {
                    o90Var.f31309o = this.E;
                    o90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        o90Var.draw(canvas6);
                    } else {
                        o90Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f26481c || this.f26493q >= 0) {
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
                    if (this.f26481c) {
                        if (o90Var2.f31311q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - o90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f26481c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f15 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(i28 + 1) * f11 * this.f26487k, org.telegram.ui.ActionBar.g6.f23235n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.f26482e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f26487k < 1.0f) {
                        i13 = canvas.save();
                        float f16 = this.f26487k;
                        canvas.scale(f16, f16, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f17 = i28;
                    canvas.drawCircle(centerX, centerY, com.google.android.recaptcha.internal.a.z(1.0f, this.f26495s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f17) * f11), paint);
                    if (this.f26481c) {
                        o90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f17) * f11)), (int) (centerY - (AndroidUtilities.dp(f17) * f11)), (int) ((AndroidUtilities.dp(f17) * f11) + centerX), (int) ((AndroidUtilities.dp(f17) * f11) + centerY));
                        o90Var2.draw(canvas);
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
        this.f26498w.onAttachedToWindow();
    }

    public final void f() {
        this.f26498w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f26492p = i10;
        this.f26496t = i11;
        this.f26497u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.recaptcha.internal.a.k(this.f26499x * 2, "_", this.f26499x * 2);
        } else {
            str2 = null;
        }
        this.f26498w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f26499x;
        this.f26498w.setImage(forDocument, com.google.android.recaptcha.internal.a.k(i10 * 2, "_", i10 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String k9 = com.google.android.recaptcha.internal.a.k(this.f26499x * 2, "_", this.f26499x * 2);
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f26498w.setImage(forDocument, k9, imageLocation, k9, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            o90 o90Var = this.f26486j;
            if (z10 && i10 == o90Var.f31311q) {
                return;
            }
            o90Var.d(i10, z11);
            if (i10 == 4 && o90Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f26481c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f26480b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f9) {
        this.f26487k = f9;
    }

    public final void m(View view) {
        this.f26480b = view;
        this.f26498w.setParentView(view);
        Objects.requireNonNull(view);
        this.f26485i.A = new cv(view, 13);
        this.f26486j.A = new cv(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f26501z = z10;
        } else {
            this.f26500y = z10;
        }
        d();
    }

    public final void o(float f9, boolean z10) {
        if (this.f26481c) {
            this.f26486j.e(f9, z10);
        } else {
            this.f26485i.e(f9, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f26479a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        o90 o90Var = this.f26485i;
        o90Var.f31304j = true;
        o90Var.f31298b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        o90 o90Var = this.f26485i;
        o90Var.C = linearGradient;
        o90Var.D = new Matrix();
        o90 o90Var2 = this.f26486j;
        o90Var2.C = linearGradient;
        o90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f26499x = i10;
        this.f26498w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f26488l = i10;
        this.f26489m = i11;
        this.f26490n = i12;
        this.f26491o = i13;
        this.f26492p = -1;
        this.f26496t = -1;
        this.f26497u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        o90 o90Var = this.f26485i;
        if (!z10 || i10 != o90Var.f31311q) {
            o90Var.d(i10, z11);
            View view = this.f26480b;
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
