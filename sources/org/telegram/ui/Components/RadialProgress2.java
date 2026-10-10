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
    public View f24265b;
    public boolean f24266c;
    public final Paint f24267e;
    public final Paint f24268f;
    public final Paint f24269g;
    public final Paint h;
    public final va0 f24270i;
    public final va0 f24271j;
    public float f24272k;
    public int f24273l;
    public int f24274m;
    public int f24275n;
    public int f24276o;
    public int f24277p;
    public int f24278q;
    public float f24279r;
    public float f24280s;
    public int f24281t;
    public int f24282u;
    public int v;
    public final ImageReceiver f24283w;
    public int f24284x;
    public boolean f24285y;
    public boolean f24286z;
    public final RectF f24264a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f24268f = paint;
        this.f24269g = new Paint(1);
        this.h = new Paint(1);
        this.f24272k = 1.0f;
        this.f24277p = -1;
        this.f24278q = -1;
        this.f24280s = 1.0f;
        this.f24281t = -1;
        this.f24282u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = e6Var;
        this.f24267e = new Paint(1);
        this.f24265b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f24283w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        va0 va0Var = new va0();
        this.f24270i = va0Var;
        va0 va0Var2 = new va0();
        this.f24271j = va0Var2;
        va0Var2.f31769j = true;
        va0Var2.f31763b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        va0Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f24284x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            va0Var.A = new cw(view, 14);
            va0Var2.A = new cw(view, 14);
        }
    }

    public final int a() {
        return this.f24270i.f31776q;
    }

    public final float b() {
        va0 va0Var = this.f24270i;
        int i10 = va0Var.f31776q;
        int i11 = va0Var.f31775p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return va0Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - va0Var.b();
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
        View view = this.f24265b;
        RectF rectF = this.f24264a;
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
        va0 va0Var = this.f24270i;
        int i15 = va0Var.f31776q;
        Paint paint2 = va0Var.f31764c;
        if (i15 != 4 || va0Var.b() < 1.0f) {
            RectF rectF = this.f24264a;
            if (!rectF.isEmpty()) {
                int i16 = va0Var.f31776q;
                float b11 = b();
                boolean z10 = this.f24286z;
                va0 va0Var2 = this.f24271j;
                Paint paint3 = this.h;
                if (z10 && this.f24278q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        va0Var2.c(org.telegram.ui.ActionBar.i6.w0(i17, this.F));
                    } else {
                        va0Var2.c(this.f24276o);
                    }
                    int i18 = this.f24281t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.i6.w0(i18, this.F));
                    } else {
                        paint3.setColor(this.f24274m);
                    }
                } else {
                    int i19 = this.f24282u;
                    if (i19 >= 0) {
                        va0Var2.c(org.telegram.ui.ActionBar.i6.w0(i19, this.F));
                    } else {
                        va0Var2.c(this.f24275n);
                    }
                    int i20 = this.f24277p;
                    if (i20 >= 0) {
                        if (this.f24278q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(i20, this.F), org.telegram.ui.ActionBar.i6.w0(this.f24278q, this.F), this.f24279r, this.f24280s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.i6.w0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f24273l);
                    }
                }
                boolean z11 = this.f24285y;
                Paint paint4 = this.f24269g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.i6.w0(i21, this.F);
                        va0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.i6.w0(this.f24281t, this.F));
                    } else {
                        i10 = this.f24276o;
                        va0Var.c(i10);
                        paint2.setColor((-16777216) | this.f24274m);
                    }
                    int i22 = this.f24281t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.i6.w0(i22, this.F));
                    } else {
                        paint4.setColor(this.f24274m);
                    }
                } else {
                    int i23 = this.f24282u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.i6.w0(i23, this.F);
                        va0Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.i6.w0(this.f24277p, this.F));
                    } else {
                        i10 = this.f24275n;
                        va0Var.c(i10);
                        paint2.setColor((-16777216) | this.f24273l);
                    }
                    int i24 = this.f24277p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.i6.w0(i24, this.F));
                    } else {
                        paint4.setColor(this.f24273l);
                    }
                }
                if ((this.f24266c || this.f24278q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f24266c || this.f24278q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f24283w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f24268f;
                int i25 = 2;
                if (hasBitmapImage) {
                    float currentAlpha = imageReceiver.getCurrentAlpha();
                    paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b11));
                    if (currentAlpha >= 1.0f) {
                        argb = -1;
                        f7 = 1.0f;
                        f10 = b11;
                        paint = paint3;
                        z12 = false;
                    } else {
                        int red = Color.red(i10);
                        f7 = 1.0f;
                        int green = Color.green(i10);
                        f10 = b11;
                        int blue = Color.blue(i10);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i10) + ((int) ((255 - alpha) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                    }
                    va0Var.c(argb);
                    float f12 = this.f24284x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f12, f12);
                } else {
                    f7 = 1.0f;
                    f10 = b11;
                    paint = paint3;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f24278q >= 0 && this.f24280s != f7) {
                    i11 = canvas5.save();
                    float f13 = f7;
                    float b12 = com.google.android.gms.internal.vision.e2.b(f13, this.f24280s, 0.1f, f13);
                    this.D.scale(b12, b12, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f24266c || this.f24278q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f24284x, paint4);
                    } else if (i16 != 4 || f10 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f24284x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f10 * this.E * this.H);
                    if ((this.f24266c || this.f24278q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f24284x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f24284x, paint5);
                    }
                }
                int i26 = this.f24284x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f14 = this.I;
                    canvas.scale(f14, f14, ceil, ceil2);
                }
                va0Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                va0Var.E = imageReceiver.hasBitmapImage();
                if (!this.f24266c && this.f24278q < 0) {
                    va0Var.f31774o = this.E;
                    va0Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        va0Var.draw(canvas6);
                    } else {
                        va0Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f24266c || this.f24278q >= 0) {
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
                    if (this.f24266c) {
                        if (va0Var2.f31776q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - va0Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f24266c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f16 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(i28 + 1) * f11 * this.f24272k, org.telegram.ui.ActionBar.i6.f20980n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.f24267e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f24272k < 1.0f) {
                        i13 = canvas.save();
                        float f17 = this.f24272k;
                        canvas.scale(f17, f17, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f18 = i28;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.y(1.0f, this.f24280s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f18) * f11), paint);
                    if (this.f24266c) {
                        va0Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f18) * f11)), (int) (centerY - (AndroidUtilities.dp(f18) * f11)), (int) ((AndroidUtilities.dp(f18) * f11) + centerX), (int) ((AndroidUtilities.dp(f18) * f11) + centerY));
                        va0Var2.draw(canvas);
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
        this.f24283w.onAttachedToWindow();
    }

    public final void f() {
        this.f24283w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24277p = i10;
        this.f24281t = i11;
        this.f24282u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a1.g.l(this.f24284x * 2, this.f24284x * 2, "_");
        } else {
            str2 = null;
        }
        this.f24283w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f24284x;
        this.f24283w.setImage(forDocument, a1.g.l(i10 * 2, i10 * 2, "_"), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String l4 = a1.g.l(this.f24284x * 2, this.f24284x * 2, "_");
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f24283w.setImage(forDocument, l4, imageLocation, l4, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            va0 va0Var = this.f24271j;
            if (z10 && i10 == va0Var.f31776q) {
                return;
            }
            va0Var.d(i10, z11);
            if (i10 == 4 && va0Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f24266c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f24265b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f7) {
        this.f24272k = f7;
    }

    public final void m(View view) {
        this.f24265b = view;
        this.f24283w.setParentView(view);
        Objects.requireNonNull(view);
        this.f24270i.A = new cw(view, 14);
        this.f24271j.A = new cw(view, 14);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f24286z = z10;
        } else {
            this.f24285y = z10;
        }
        d();
    }

    public final void o(float f7, boolean z10) {
        if (this.f24266c) {
            this.f24271j.e(f7, z10);
        } else {
            this.f24270i.e(f7, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f24264a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        va0 va0Var = this.f24270i;
        va0Var.f31769j = true;
        va0Var.f31763b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        va0 va0Var = this.f24270i;
        va0Var.C = linearGradient;
        va0Var.D = new Matrix();
        va0 va0Var2 = this.f24271j;
        va0Var2.C = linearGradient;
        va0Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f24284x = i10;
        this.f24283w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f24273l = i10;
        this.f24274m = i11;
        this.f24275n = i12;
        this.f24276o = i13;
        this.f24277p = -1;
        this.f24281t = -1;
        this.f24282u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        va0 va0Var = this.f24270i;
        if (!z10 || i10 != va0Var.f31776q) {
            va0Var.d(i10, z11);
            View view = this.f24265b;
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
