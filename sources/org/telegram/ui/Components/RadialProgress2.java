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
    public org.telegram.ui.ActionBar.b6 F;
    public int G;
    public float H;
    public float I;
    public View f26469b;
    public boolean f26470c;
    public final Paint f26471e;
    public final Paint f26472f;
    public final Paint f26473g;
    public final Paint h;
    public final b90 f26474i;
    public final b90 f26475j;
    public float f26476k;
    public int f26477l;
    public int f26478m;
    public int f26479n;
    public int f26480o;
    public int f26481p;
    public int f26482q;
    public float f26483r;
    public float f26484s;
    public int f26485t;
    public int f26486u;
    public int v;
    public final ImageReceiver f26487w;
    public int f26488x;
    public boolean f26489y;
    public boolean f26490z;
    public final RectF f26468a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f26472f = paint;
        this.f26473g = new Paint(1);
        this.h = new Paint(1);
        this.f26476k = 1.0f;
        this.f26481p = -1;
        this.f26482q = -1;
        this.f26484s = 1.0f;
        this.f26485t = -1;
        this.f26486u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = b6Var;
        this.f26471e = new Paint(1);
        this.f26469b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f26487w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        b90 b90Var = new b90();
        this.f26474i = b90Var;
        b90 b90Var2 = new b90();
        this.f26475j = b90Var2;
        b90Var2.f27104j = true;
        b90Var2.f27098b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        b90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f26488x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            b90Var.A = new wu(view, 13);
            b90Var2.A = new wu(view, 13);
        }
    }

    public final int a() {
        return this.f26474i.f27111q;
    }

    public final float b() {
        b90 b90Var = this.f26474i;
        int i9 = b90Var.f27111q;
        int i10 = b90Var.f27110p;
        if ((i9 == 3 || i9 == 6 || i9 == 10 || i9 == 8 || i9 == 0) && i10 == 4) {
            return b90Var.b();
        }
        if (i9 != 4) {
            return 1.0f;
        }
        return 1.0f - b90Var.b();
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
        View view = this.f26469b;
        RectF rectF = this.f26468a;
        int i9 = ((int) rectF.left) - dp;
        int i10 = ((int) rectF.top) - dp;
        int i11 = dp * 2;
        view.invalidate(i9, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i9;
        int ceil;
        int ceil2;
        float f10;
        Paint paint;
        float f11;
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
        b90 b90Var = this.f26474i;
        int i14 = b90Var.f27111q;
        Paint paint2 = b90Var.f27099c;
        if (i14 != 4 || b90Var.b() < 1.0f) {
            RectF rectF = this.f26468a;
            if (!rectF.isEmpty()) {
                int i15 = b90Var.f27111q;
                float b11 = b();
                boolean z10 = this.f26490z;
                b90 b90Var2 = this.f26475j;
                Paint paint3 = this.h;
                if (z10 && this.f26482q < 0) {
                    int i16 = this.v;
                    if (i16 >= 0) {
                        b90Var2.c(org.telegram.ui.ActionBar.f6.v0(i16, this.F));
                    } else {
                        b90Var2.c(this.f26480o);
                    }
                    int i17 = this.f26485t;
                    if (i17 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.f6.v0(i17, this.F));
                    } else {
                        paint3.setColor(this.f26478m);
                    }
                } else {
                    int i18 = this.f26486u;
                    if (i18 >= 0) {
                        b90Var2.c(org.telegram.ui.ActionBar.f6.v0(i18, this.F));
                    } else {
                        b90Var2.c(this.f26479n);
                    }
                    int i19 = this.f26481p;
                    if (i19 >= 0) {
                        if (this.f26482q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(i19, this.F), org.telegram.ui.ActionBar.f6.v0(this.f26482q, this.F), this.f26483r, this.f26484s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.f6.v0(i19, this.F));
                        }
                    } else {
                        paint3.setColor(this.f26477l);
                    }
                }
                boolean z11 = this.f26489y;
                Paint paint4 = this.f26473g;
                if (z11) {
                    int i20 = this.v;
                    if (i20 >= 0) {
                        i9 = org.telegram.ui.ActionBar.f6.v0(i20, this.F);
                        b90Var.c(i9);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.f6.v0(this.f26485t, this.F));
                    } else {
                        i9 = this.f26480o;
                        b90Var.c(i9);
                        paint2.setColor((-16777216) | this.f26478m);
                    }
                    int i21 = this.f26485t;
                    if (i21 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.f6.v0(i21, this.F));
                    } else {
                        paint4.setColor(this.f26478m);
                    }
                } else {
                    int i22 = this.f26486u;
                    if (i22 >= 0) {
                        i9 = org.telegram.ui.ActionBar.f6.v0(i22, this.F);
                        b90Var.c(i9);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.f6.v0(this.f26481p, this.F));
                    } else {
                        i9 = this.f26479n;
                        b90Var.c(i9);
                        paint2.setColor((-16777216) | this.f26477l);
                    }
                    int i23 = this.f26481p;
                    if (i23 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.f6.v0(i23, this.F));
                    } else {
                        paint4.setColor(this.f26477l);
                    }
                }
                if ((this.f26470c || this.f26482q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f26470c || this.f26482q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f26487w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f26472f;
                int i24 = 2;
                if (hasBitmapImage) {
                    float currentAlpha = imageReceiver.getCurrentAlpha();
                    paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b11));
                    if (currentAlpha >= 1.0f) {
                        argb = -1;
                        f10 = b11;
                        paint = paint3;
                        z12 = false;
                        f11 = 1.0f;
                    } else {
                        int red = Color.red(i9);
                        f11 = 1.0f;
                        int green = Color.green(i9);
                        f10 = b11;
                        int blue = Color.blue(i9);
                        paint = paint3;
                        argb = Color.argb(Color.alpha(i9) + ((int) ((255 - alpha) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                    }
                    b90Var.c(argb);
                    float f13 = this.f26488x * 2;
                    imageReceiver.setImageCoords(ceil - i13, ceil2 - i13, f13, f13);
                } else {
                    f10 = b11;
                    paint = paint3;
                    f11 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f26482q >= 0 && this.f26484s != f11) {
                    i10 = canvas5.save();
                    float C = j3.r0.C(1.0f, this.f26484s, 0.1f, 1.0f);
                    this.D.scale(C, C, ceil, ceil2);
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f26470c || this.f26482q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f26488x, paint4);
                    } else if (i15 != 4 || f10 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f26488x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f10 * this.E * this.H);
                    if ((this.f26470c || this.f26482q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f26488x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f26488x, paint5);
                    }
                }
                int i25 = this.f26488x;
                int i26 = this.G;
                if (i26 > 0 && i25 > i26) {
                    i25 = i26;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f14 = this.I;
                    canvas.scale(f14, f14, ceil, ceil2);
                }
                b90Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
                b90Var.E = imageReceiver.hasBitmapImage();
                if (!this.f26470c && this.f26482q < 0) {
                    b90Var.f27109o = this.E;
                    b90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        b90Var.draw(canvas6);
                    } else {
                        b90Var.draw(canvas);
                    }
                }
                if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i10);
                }
                if (this.f26470c || this.f26482q >= 0) {
                    if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                        float f15 = 16;
                        centerX = rectF.centerX() + AndroidUtilities.dp(f15);
                        centerY = rectF.centerY() + AndroidUtilities.dp(f15);
                        i11 = 20;
                        i24 = 0;
                    } else {
                        centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                        centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                        i11 = 22;
                    }
                    int i27 = i11 / 2;
                    if (this.f26470c) {
                        if (b90Var2.f27111q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - b90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f26470c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f16 = i11 + 18 + i24;
                        canvas7.drawCircle(AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(i27 + 1) * f12 * this.f26476k, org.telegram.ui.ActionBar.f6.f23173n0);
                    } else {
                        int i28 = this.d;
                        Paint paint6 = this.f26471e;
                        paint6.setColor(i28);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f26476k < 1.0f) {
                        i12 = canvas.save();
                        float f17 = this.f26476k;
                        canvas.scale(f17, f17, centerX, centerY);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    float f18 = i27;
                    canvas.drawCircle(centerX, centerY, e2.c.z(1.0f, this.f26484s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f18) * f12), paint);
                    if (this.f26470c) {
                        b90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f18) * f12)), (int) (centerY - (AndroidUtilities.dp(f18) * f12)), (int) ((AndroidUtilities.dp(f18) * f12) + centerX), (int) ((AndroidUtilities.dp(f18) * f12) + centerY));
                        b90Var2.draw(canvas);
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
        this.f26487w.onAttachedToWindow();
    }

    public final void f() {
        this.f26487w.onDetachedFromWindow();
    }

    public final void g(int i9, int i10, int i11, int i12) {
        this.f26481p = i9;
        this.f26485t = i10;
        this.f26486u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = e2.c.l(this.f26488x * 2, "_", this.f26488x * 2);
        } else {
            str2 = null;
        }
        this.f26487w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i9 = this.f26488x;
        this.f26487w.setImage(forDocument, e2.c.l(i9 * 2, "_", i9 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String l10 = e2.c.l(this.f26488x * 2, "_", this.f26488x * 2);
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f26487w.setImage(forDocument, l10, imageLocation, l10, null, 0L, null, obj, 1);
    }

    public final void k(int i9, boolean z10, boolean z11) {
        boolean z12;
        if (i9 == 2 || i9 == 3 || i9 == 4) {
            b90 b90Var = this.f26475j;
            if (z10 && i9 == b90Var.f27111q) {
                return;
            }
            b90Var.d(i9, z11);
            if (i9 == 4 && b90Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f26470c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f26469b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f26476k = f10;
    }

    public final void m(View view) {
        this.f26469b = view;
        this.f26487w.setParentView(view);
        Objects.requireNonNull(view);
        this.f26474i.A = new wu(view, 13);
        this.f26475j.A = new wu(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f26490z = z10;
        } else {
            this.f26489y = z10;
        }
        d();
    }

    public final void o(float f10, boolean z10) {
        if (this.f26470c) {
            this.f26475j.e(f10, z10);
        } else {
            this.f26474i.e(f10, z10);
        }
    }

    public final void p(int i9) {
        this.d = i9;
    }

    public final void q(int i9, int i10, int i11, int i12) {
        this.f26468a.set(i9, i10, i11, i12);
    }

    public void setAsMini() {
        b90 b90Var = this.f26474i;
        b90Var.f27104j = true;
        b90Var.f27098b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        b90 b90Var = this.f26474i;
        b90Var.C = linearGradient;
        b90Var.D = new Matrix();
        b90 b90Var2 = this.f26475j;
        b90Var2.C = linearGradient;
        b90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i9) {
        this.f26488x = i9;
        this.f26487w.setRoundRadius(i9);
    }

    public void setColors(int i9, int i10, int i11, int i12) {
        this.f26477l = i9;
        this.f26478m = i10;
        this.f26479n = i11;
        this.f26480o = i12;
        this.f26481p = -1;
        this.f26485t = -1;
        this.f26486u = -1;
        this.v = -1;
    }

    public void setIcon(int i9, boolean z10, boolean z11) {
        b90 b90Var = this.f26474i;
        if (!z10 || i9 != b90Var.f27111q) {
            b90Var.d(i9, z11);
            View view = this.f26469b;
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
