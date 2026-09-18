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
    public org.telegram.ui.ActionBar.e6 F;
    public int G;
    public float H;
    public float I;
    public View f22312b;
    public boolean f22313c;
    public final Paint e;
    public final Paint f22314f;
    public final Paint f22315g;
    public final Paint h;
    public final ba0 f22316i;
    public final ba0 f22317j;
    public float f22318k;
    public int f22319l;
    public int f22320m;
    public int f22321n;
    public int f22322o;
    public int f22323p;
    public int f22324q;
    public float f22325r;
    public float f22326s;
    public int f22327t;
    public int f22328u;
    public int v;
    public final ImageReceiver f22329w;
    public int f22330x;
    public boolean f22331y;
    public boolean f22332z;
    public final RectF f22311a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f22314f = paint;
        this.f22315g = new Paint(1);
        this.h = new Paint(1);
        this.f22318k = 1.0f;
        this.f22323p = -1;
        this.f22324q = -1;
        this.f22326s = 1.0f;
        this.f22327t = -1;
        this.f22328u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = e6Var;
        this.e = new Paint(1);
        this.f22312b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f22329w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        ba0 ba0Var = new ba0();
        this.f22316i = ba0Var;
        ba0 ba0Var2 = new ba0();
        this.f22317j = ba0Var2;
        ba0Var2.f22924j = true;
        ba0Var2.f22919b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        ba0Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f22330x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            ba0Var.A = new lv(view, 13);
            ba0Var2.A = new lv(view, 13);
        }
    }

    public final int a() {
        return this.f22316i.f22931q;
    }

    public final float b() {
        ba0 ba0Var = this.f22316i;
        int i10 = ba0Var.f22931q;
        int i11 = ba0Var.f22930p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return ba0Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - ba0Var.b();
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
        View view = this.f22312b;
        RectF rectF = this.f22311a;
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
        ba0 ba0Var = this.f22316i;
        int i15 = ba0Var.f22931q;
        Paint paint2 = ba0Var.f22920c;
        if (i15 != 4 || ba0Var.b() < 1.0f) {
            RectF rectF = this.f22311a;
            if (!rectF.isEmpty()) {
                int i16 = ba0Var.f22931q;
                float b11 = b();
                boolean z10 = this.f22332z;
                ba0 ba0Var2 = this.f22317j;
                Paint paint3 = this.h;
                if (z10 && this.f22324q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        ba0Var2.c(org.telegram.ui.ActionBar.j6.v0(i17, this.F));
                    } else {
                        ba0Var2.c(this.f22322o);
                    }
                    int i18 = this.f22327t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f22320m);
                    }
                } else {
                    int i19 = this.f22328u;
                    if (i19 >= 0) {
                        ba0Var2.c(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                    } else {
                        ba0Var2.c(this.f22321n);
                    }
                    int i20 = this.f22323p;
                    if (i20 >= 0) {
                        if (this.f22324q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F), org.telegram.ui.ActionBar.j6.v0(this.f22324q, this.F), this.f22325r, this.f22326s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f22319l);
                    }
                }
                boolean z11 = this.f22331y;
                Paint paint4 = this.f22315g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i21, this.F);
                        ba0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f22327t, this.F));
                    } else {
                        i10 = this.f22322o;
                        ba0Var.c(i10);
                        paint2.setColor((-16777216) | this.f22320m);
                    }
                    int i22 = this.f22327t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f22320m);
                    }
                } else {
                    int i23 = this.f22328u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i23, this.F);
                        ba0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f22323p, this.F));
                    } else {
                        i10 = this.f22321n;
                        ba0Var.c(i10);
                        paint2.setColor((-16777216) | this.f22319l);
                    }
                    int i24 = this.f22323p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f22319l);
                    }
                }
                if ((this.f22313c || this.f22324q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f22313c || this.f22324q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f22329w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f22314f;
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
                    ba0Var.c(argb);
                    float f12 = this.f22330x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f12, f12);
                } else {
                    f7 = b11;
                    paint = paint3;
                    f10 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f22324q >= 0 && this.f22326s != f10) {
                    i11 = canvas5.save();
                    float b12 = com.google.android.gms.internal.vision.e2.b(1.0f, this.f22326s, 0.1f, 1.0f);
                    this.D.scale(b12, b12, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f22313c || this.f22324q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f22330x, paint4);
                    } else if (i16 != 4 || f7 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f22330x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f7 * this.E * this.H);
                    if ((this.f22313c || this.f22324q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f22330x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f22330x, paint5);
                    }
                }
                int i26 = this.f22330x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f13 = this.I;
                    canvas.scale(f13, f13, ceil, ceil2);
                }
                ba0Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                ba0Var.E = imageReceiver.hasBitmapImage();
                if (!this.f22313c && this.f22324q < 0) {
                    ba0Var.f22929o = this.E;
                    ba0Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        ba0Var.draw(canvas6);
                    } else {
                        ba0Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f22313c || this.f22324q >= 0) {
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
                    if (this.f22313c) {
                        if (ba0Var2.f22931q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - ba0Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f22313c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f15 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(i28 + 1) * f11 * this.f22318k, org.telegram.ui.ActionBar.j6.f19241n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f22318k < 1.0f) {
                        i13 = canvas.save();
                        float f16 = this.f22318k;
                        canvas.scale(f16, f16, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f17 = i28;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.f22326s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f17) * f11), paint);
                    if (this.f22313c) {
                        ba0Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f17) * f11)), (int) (centerY - (AndroidUtilities.dp(f17) * f11)), (int) ((AndroidUtilities.dp(f17) * f11) + centerX), (int) ((AndroidUtilities.dp(f17) * f11) + centerY));
                        ba0Var2.draw(canvas);
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
        this.f22329w.onAttachedToWindow();
    }

    public final void f() {
        this.f22329w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f22323p = i10;
        this.f22327t = i11;
        this.f22328u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a4.a.k(this.f22330x * 2, this.f22330x * 2, "_");
        } else {
            str2 = null;
        }
        this.f22329w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f22330x;
        this.f22329w.setImage(forDocument, a4.a.k(i10 * 2, i10 * 2, "_"), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String k10 = a4.a.k(this.f22330x * 2, this.f22330x * 2, "_");
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f22329w.setImage(forDocument, k10, imageLocation, k10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            ba0 ba0Var = this.f22317j;
            if (z10 && i10 == ba0Var.f22931q) {
                return;
            }
            ba0Var.d(i10, z11);
            if (i10 == 4 && ba0Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f22313c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f22312b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f7) {
        this.f22318k = f7;
    }

    public final void m(View view) {
        this.f22312b = view;
        this.f22329w.setParentView(view);
        Objects.requireNonNull(view);
        this.f22316i.A = new lv(view, 13);
        this.f22317j.A = new lv(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f22332z = z10;
        } else {
            this.f22331y = z10;
        }
        d();
    }

    public final void o(float f7, boolean z10) {
        if (this.f22313c) {
            this.f22317j.e(f7, z10);
        } else {
            this.f22316i.e(f7, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f22311a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        ba0 ba0Var = this.f22316i;
        ba0Var.f22924j = true;
        ba0Var.f22919b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        ba0 ba0Var = this.f22316i;
        ba0Var.C = linearGradient;
        ba0Var.D = new Matrix();
        ba0 ba0Var2 = this.f22317j;
        ba0Var2.C = linearGradient;
        ba0Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f22330x = i10;
        this.f22329w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f22319l = i10;
        this.f22320m = i11;
        this.f22321n = i12;
        this.f22322o = i13;
        this.f22323p = -1;
        this.f22327t = -1;
        this.f22328u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        ba0 ba0Var = this.f22316i;
        if (!z10 || i10 != ba0Var.f22931q) {
            ba0Var.d(i10, z11);
            View view = this.f22312b;
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
