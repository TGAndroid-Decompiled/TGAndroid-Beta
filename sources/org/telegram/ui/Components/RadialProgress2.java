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
    public org.telegram.ui.ActionBar.g6 F;
    public int G;
    public float H;
    public float I;
    public View f24969b;
    public boolean f24970c;
    public final Paint f24971e;
    public final Paint f24972f;
    public final Paint f24973g;
    public final Paint h;
    public final w90 f24974i;
    public final w90 f24975j;
    public float f24976k;
    public int f24977l;
    public int f24978m;
    public int f24979n;
    public int f24980o;
    public int f24981p;
    public int f24982q;
    public float f24983r;
    public float f24984s;
    public int f24985t;
    public int f24986u;
    public int v;
    public final ImageReceiver f24987w;
    public int f24988x;
    public boolean f24989y;
    public boolean f24990z;
    public final RectF f24968a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.f24972f = paint;
        this.f24973g = new Paint(1);
        this.h = new Paint(1);
        this.f24976k = 1.0f;
        this.f24981p = -1;
        this.f24982q = -1;
        this.f24984s = 1.0f;
        this.f24985t = -1;
        this.f24986u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = g6Var;
        this.f24971e = new Paint(1);
        this.f24969b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f24987w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        w90 w90Var = new w90();
        this.f24974i = w90Var;
        w90 w90Var2 = new w90();
        this.f24975j = w90Var2;
        w90Var2.f32699j = true;
        w90Var2.f32693b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        w90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f24988x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            w90Var.A = new hv(view, 13);
            w90Var2.A = new hv(view, 13);
        }
    }

    public final int a() {
        return this.f24974i.f32706q;
    }

    public final float b() {
        w90 w90Var = this.f24974i;
        int i10 = w90Var.f32706q;
        int i11 = w90Var.f32705p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return w90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - w90Var.b();
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
        View view = this.f24969b;
        RectF rectF = this.f24968a;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f10;
        Paint paint;
        float f11;
        int i11;
        float centerX;
        float centerY;
        int i12;
        float f12;
        int i13;
        float b10;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int alpha;
        int argb;
        int i14;
        w90 w90Var = this.f24974i;
        int i15 = w90Var.f32706q;
        Paint paint2 = w90Var.f32694c;
        if (i15 != 4 || w90Var.b() < 1.0f) {
            RectF rectF = this.f24968a;
            if (!rectF.isEmpty()) {
                int i16 = w90Var.f32706q;
                float b11 = b();
                boolean z4 = this.f24990z;
                w90 w90Var2 = this.f24975j;
                Paint paint3 = this.h;
                if (z4 && this.f24982q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        w90Var2.c(org.telegram.ui.ActionBar.k6.v0(i17, this.F));
                    } else {
                        w90Var2.c(this.f24980o);
                    }
                    int i18 = this.f24985t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f24978m);
                    }
                } else {
                    int i19 = this.f24986u;
                    if (i19 >= 0) {
                        w90Var2.c(org.telegram.ui.ActionBar.k6.v0(i19, this.F));
                    } else {
                        w90Var2.c(this.f24979n);
                    }
                    int i20 = this.f24981p;
                    if (i20 >= 0) {
                        if (this.f24982q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(i20, this.F), org.telegram.ui.ActionBar.k6.v0(this.f24982q, this.F), this.f24983r, this.f24984s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f24977l);
                    }
                }
                boolean z10 = this.f24989y;
                Paint paint4 = this.f24973g;
                if (z10) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.k6.v0(i21, this.F);
                        w90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.v0(this.f24985t, this.F));
                    } else {
                        i10 = this.f24980o;
                        w90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24978m);
                    }
                    int i22 = this.f24985t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.k6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f24978m);
                    }
                } else {
                    int i23 = this.f24986u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.k6.v0(i23, this.F);
                        w90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.v0(this.f24981p, this.F));
                    } else {
                        i10 = this.f24979n;
                        w90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24977l);
                    }
                    int i24 = this.f24981p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.k6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f24977l);
                    }
                }
                if ((this.f24970c || this.f24982q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f24970c || this.f24982q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f24987w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z11 = true;
                Paint paint5 = this.f24972f;
                int i25 = 2;
                if (hasBitmapImage) {
                    float currentAlpha = imageReceiver.getCurrentAlpha();
                    paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b11));
                    if (currentAlpha >= 1.0f) {
                        argb = -1;
                        f10 = b11;
                        paint = paint3;
                        z11 = false;
                        f11 = 1.0f;
                    } else {
                        int red = Color.red(i10);
                        f11 = 1.0f;
                        int green = Color.green(i10);
                        f10 = b11;
                        int blue = Color.blue(i10);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i10) + ((int) ((255 - alpha) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                    }
                    w90Var.c(argb);
                    float f13 = this.f24988x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f13, f13);
                } else {
                    f10 = b11;
                    paint = paint3;
                    f11 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f24982q >= 0 && this.f24984s != f11) {
                    i11 = canvas5.save();
                    float c3 = org.telegram.ui.yh.c(1.0f, this.f24984s, 0.1f, 1.0f);
                    this.D.scale(c3, c3, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z11 && this.B) {
                    if ((this.f24970c || this.f24982q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f24988x, paint4);
                    } else if (i16 != 4 || f10 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f24988x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f10 * this.E * this.H);
                    if ((this.f24970c || this.f24982q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f24988x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f24988x, paint5);
                    }
                }
                int i26 = this.f24988x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f14 = this.I;
                    canvas.scale(f14, f14, ceil, ceil2);
                }
                w90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                w90Var.E = imageReceiver.hasBitmapImage();
                if (!this.f24970c && this.f24982q < 0) {
                    w90Var.f32704o = this.E;
                    w90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        w90Var.draw(canvas6);
                    } else {
                        w90Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f24970c || this.f24982q >= 0) {
                    if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                        float f15 = 16;
                        centerX = rectF.centerX() + AndroidUtilities.dp(f15);
                        centerY = rectF.centerY() + AndroidUtilities.dp(f15);
                        i12 = 20;
                        i25 = 0;
                    } else {
                        centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                        centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                        i12 = 22;
                    }
                    int i28 = i12 / 2;
                    if (this.f24970c) {
                        if (w90Var2.f32706q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - w90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f24970c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f16 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(i28 + 1) * f12 * this.f24976k, org.telegram.ui.ActionBar.k6.f21835n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.f24971e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f24976k < 1.0f) {
                        i13 = canvas.save();
                        float f17 = this.f24976k;
                        canvas.scale(f17, f17, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f18 = i28;
                    canvas.drawCircle(centerX, centerY, e2.c.w(1.0f, this.f24984s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f18) * f12), paint);
                    if (this.f24970c) {
                        w90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f18) * f12)), (int) (centerY - (AndroidUtilities.dp(f18) * f12)), (int) ((AndroidUtilities.dp(f18) * f12) + centerX), (int) ((AndroidUtilities.dp(f18) * f12) + centerY));
                        w90Var2.draw(canvas);
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
        this.f24987w.onAttachedToWindow();
    }

    public final void f() {
        this.f24987w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24981p = i10;
        this.f24985t = i11;
        this.f24986u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = e2.c.h(this.f24988x * 2, "_", this.f24988x * 2);
        } else {
            str2 = null;
        }
        this.f24987w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f24988x;
        this.f24987w.setImage(forDocument, e2.c.h(i10 * 2, "_", i10 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String h = e2.c.h(this.f24988x * 2, "_", this.f24988x * 2);
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f24987w.setImage(forDocument, h, imageLocation, h, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z4, boolean z10) {
        boolean z11;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            w90 w90Var = this.f24975j;
            if (z4 && i10 == w90Var.f32706q) {
                return;
            }
            w90Var.d(i10, z10);
            if (i10 == 4 && w90Var.b() >= 1.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f24970c = z11;
            if (z11) {
                c();
            }
            if (!z10) {
                this.f24969b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f24976k = f10;
    }

    public final void m(View view) {
        this.f24969b = view;
        this.f24987w.setParentView(view);
        Objects.requireNonNull(view);
        this.f24974i.A = new hv(view, 13);
        this.f24975j.A = new hv(view, 13);
    }

    public final void n(boolean z4, boolean z10) {
        if (z10) {
            this.f24990z = z4;
        } else {
            this.f24989y = z4;
        }
        d();
    }

    public final void o(float f10, boolean z4) {
        if (this.f24970c) {
            this.f24975j.e(f10, z4);
        } else {
            this.f24974i.e(f10, z4);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f24968a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        w90 w90Var = this.f24974i;
        w90Var.f32699j = true;
        w90Var.f32693b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        w90 w90Var = this.f24974i;
        w90Var.C = linearGradient;
        w90Var.D = new Matrix();
        w90 w90Var2 = this.f24975j;
        w90Var2.C = linearGradient;
        w90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f24988x = i10;
        this.f24987w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f24977l = i10;
        this.f24978m = i11;
        this.f24979n = i12;
        this.f24980o = i13;
        this.f24981p = -1;
        this.f24985t = -1;
        this.f24986u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z4, boolean z10) {
        w90 w90Var = this.f24974i;
        if (!z4 || i10 != w90Var.f32706q) {
            w90Var.d(i10, z10);
            View view = this.f24969b;
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
