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

    public View f26465b;

    public boolean f26466c;

    public final Paint f26467e;

    public final Paint f26468f;

    public final Paint f26469g;
    public final Paint h;

    public final f90 f26470i;

    public final f90 f26471j;

    public float f26472k;

    public int f26473l;

    public int f26474m;

    public int f26475n;

    public int f26476o;

    public int f26477p;

    public int f26478q;

    public float f26479r;

    public float f26480s;

    public int f26481t;

    public int f26482u;
    public int v;

    public final ImageReceiver f26483w;

    public int f26484x;

    public boolean f26485y;

    public boolean f26486z;

    public final RectF f26464a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f26468f = paint;
        this.f26469g = new Paint(1);
        this.h = new Paint(1);
        this.f26472k = 1.0f;
        this.f26477p = -1;
        this.f26478q = -1;
        this.f26480s = 1.0f;
        this.f26481t = -1;
        this.f26482u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = c6Var;
        this.f26467e = new Paint(1);
        this.f26465b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f26483w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        f90 f90Var = new f90();
        this.f26470i = f90Var;
        f90 f90Var2 = new f90();
        this.f26471j = f90Var2;
        f90Var2.f28302j = true;
        f90Var2.f28296b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        f90Var2.d(4, false);
        int iDp = AndroidUtilities.dp(22.0f);
        this.f26484x = iDp;
        imageReceiver.setRoundRadius(iDp);
        paint.setColor(1677721600);
        if (view != null) {
            f90Var.A = new vu(view, 13);
            f90Var2.A = new vu(view, 13);
        }
    }

    public final int a() {
        return this.f26470i.f28309q;
    }

    public final float b() {
        f90 f90Var = this.f26470i;
        int i10 = f90Var.f28309q;
        int i11 = f90Var.f28308p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return f90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - f90Var.b();
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
        int iDp = AndroidUtilities.dp(2.0f);
        View view = this.f26465b;
        RectF rectF = this.f26464a;
        int i10 = ((int) rectF.left) - iDp;
        int i11 = ((int) rectF.top) - iDp;
        int i12 = iDp * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int iV0;
        int iCeil;
        int iCeil2;
        float f10;
        int iSave;
        float fCenterX;
        float fCenterY;
        int i10;
        float f11;
        int iSave2;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int iArgb;
        f90 f90Var = this.f26470i;
        int i11 = f90Var.f28309q;
        Paint paint = f90Var.f28297c;
        if (i11 != 4 || f90Var.b() < 1.0f) {
            RectF rectF = this.f26464a;
            if (rectF.isEmpty()) {
                return;
            }
            int i12 = f90Var.f28309q;
            float fB = b();
            boolean z10 = this.f26486z;
            f90 f90Var2 = this.f26471j;
            Paint paint2 = this.h;
            if (!z10 || this.f26478q >= 0) {
                int i13 = this.f26482u;
                if (i13 >= 0) {
                    f90Var2.c(org.telegram.ui.ActionBar.g6.v0(i13, this.F));
                } else {
                    f90Var2.c(this.f26475n);
                }
                int i14 = this.f26477p;
                if (i14 < 0) {
                    paint2.setColor(this.f26473l);
                } else if (this.f26478q >= 0) {
                    paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(i14, this.F), org.telegram.ui.ActionBar.g6.v0(this.f26478q, this.F), this.f26479r, this.f26480s));
                } else {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.F));
                }
            } else {
                int i15 = this.v;
                if (i15 >= 0) {
                    f90Var2.c(org.telegram.ui.ActionBar.g6.v0(i15, this.F));
                } else {
                    f90Var2.c(this.f26476o);
                }
                int i16 = this.f26481t;
                if (i16 >= 0) {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i16, this.F));
                } else {
                    paint2.setColor(this.f26474m);
                }
            }
            boolean z11 = this.f26485y;
            Paint paint3 = this.f26469g;
            if (z11) {
                int i17 = this.v;
                if (i17 >= 0) {
                    iV0 = org.telegram.ui.ActionBar.g6.v0(i17, this.F);
                    f90Var.c(iV0);
                    paint.setColor((-16777216) | org.telegram.ui.ActionBar.g6.v0(this.f26481t, this.F));
                } else {
                    iV0 = this.f26476o;
                    f90Var.c(iV0);
                    paint.setColor((-16777216) | this.f26474m);
                }
                int i18 = this.f26481t;
                if (i18 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i18, this.F));
                } else {
                    paint3.setColor(this.f26474m);
                }
            } else {
                int i19 = this.f26482u;
                if (i19 >= 0) {
                    iV0 = org.telegram.ui.ActionBar.g6.v0(i19, this.F);
                    f90Var.c(iV0);
                    paint.setColor((-16777216) | org.telegram.ui.ActionBar.g6.v0(this.f26477p, this.F));
                } else {
                    iV0 = this.f26475n;
                    f90Var.c(iV0);
                    paint.setColor((-16777216) | this.f26473l);
                }
                int i20 = this.f26477p;
                if (i20 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i20, this.F));
                } else {
                    paint3.setColor(this.f26473l);
                }
            }
            if ((this.f26466c || this.f26478q >= 0) && this.D != null) {
                this.C.eraseColor(0);
            }
            paint3.setAlpha((int) (paint3.getAlpha() * fB * this.E * this.A));
            paint2.setAlpha((int) (paint2.getAlpha() * fB * this.E));
            if ((this.f26466c || this.f26478q >= 0) && this.D != null) {
                iCeil = (int) Math.ceil(rectF.width() / 2.0f);
                iCeil2 = (int) Math.ceil(rectF.height() / 2.0f);
            } else {
                iCeil = (int) rectF.centerX();
                iCeil2 = (int) rectF.centerY();
            }
            ImageReceiver imageReceiver = this.f26483w;
            boolean zHasBitmapImage = imageReceiver.hasBitmapImage();
            boolean z12 = true;
            Paint paint4 = this.f26468f;
            int i21 = 2;
            if (zHasBitmapImage) {
                float currentAlpha = imageReceiver.getCurrentAlpha();
                paint4.setAlpha((int) (this.E * 100.0f * currentAlpha * fB));
                if (currentAlpha >= 1.0f) {
                    iArgb = -1;
                    z12 = false;
                    f10 = 1.0f;
                } else {
                    int iRed = Color.red(iV0);
                    f10 = 1.0f;
                    int iGreen = Color.green(iV0);
                    int iBlue = Color.blue(iV0);
                    int iAlpha = Color.alpha(iV0);
                    iArgb = Color.argb(iAlpha + ((int) ((255 - iAlpha) * currentAlpha)), iRed + ((int) ((255 - iRed) * currentAlpha)), iGreen + ((int) ((255 - iGreen) * currentAlpha)), iBlue + ((int) ((255 - iBlue) * currentAlpha)));
                }
                f90Var.c(iArgb);
                int i22 = this.f26484x;
                float f12 = iCeil - i22;
                float f13 = iCeil2 - i22;
                float f14 = i22 * 2;
                imageReceiver.setImageCoords(f12, f13, f14, f14);
            } else {
                fB = fB;
                paint2 = paint2;
                f10 = 1.0f;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.f26478q < 0 || this.f26480s == f10) {
                iSave = Integer.MIN_VALUE;
            } else {
                iSave = canvas5.save();
                float fB2 = org.telegram.ui.Cells.pa.b(1.0f, this.f26480s, 0.1f, 1.0f);
                this.D.scale(fB2, fB2, iCeil, iCeil2);
            }
            if (z12 && this.B) {
                if ((this.f26466c || this.f26478q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(iCeil, iCeil2, this.f26484x, paint3);
                } else if (i12 != 4 || fB != 0.0f) {
                    canvas.drawCircle(iCeil, iCeil2, this.f26484x, paint3);
                }
            }
            if (imageReceiver.hasBitmapImage()) {
                imageReceiver.setAlpha(fB * this.E * this.H);
                if ((this.f26466c || this.f26478q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.draw(canvas3);
                    this.D.drawCircle(iCeil, iCeil2, this.f26484x, paint4);
                } else {
                    imageReceiver.draw(canvas);
                    canvas.drawCircle(iCeil, iCeil2, this.f26484x, paint4);
                }
            }
            int i23 = this.f26484x;
            int i24 = this.G;
            if (i24 > 0 && i23 > i24) {
                i23 = i24;
            }
            if (this.I != 1.0f) {
                canvas.save();
                float f15 = this.I;
                canvas.scale(f15, f15, iCeil, iCeil2);
            }
            f90Var.setBounds(iCeil - i23, iCeil2 - i23, iCeil + i23, iCeil2 + i23);
            f90Var.E = imageReceiver.hasBitmapImage();
            if (this.f26466c || this.f26478q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    f90Var.draw(canvas6);
                } else {
                    f90Var.draw(canvas);
                }
            } else {
                f90Var.f28307o = this.E;
                f90Var.draw(canvas);
            }
            if (iSave != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(iSave);
            }
            if (this.f26466c || this.f26478q >= 0) {
                if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f16 = 16;
                    fCenterX = rectF.centerX() + AndroidUtilities.dp(f16);
                    fCenterY = rectF.centerY() + AndroidUtilities.dp(f16);
                    i10 = 20;
                    i21 = 0;
                } else {
                    fCenterX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                    fCenterY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                    i10 = 22;
                }
                int i25 = i10 / 2;
                if (this.f26466c) {
                    float fB3 = f90Var2.f28309q != 4 ? 1.0f : 1.0f - f90Var2.b();
                    if (fB3 == 0.0f) {
                        this.f26466c = false;
                    }
                    f11 = fB3;
                } else {
                    f11 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f17 = i10 + 18 + i21;
                    canvas7.drawCircle(AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), AndroidUtilities.dp(i25 + 1) * f11 * this.f26472k, org.telegram.ui.ActionBar.g6.f23228n0);
                } else {
                    int i26 = this.d;
                    Paint paint5 = this.f26467e;
                    paint5.setColor(i26);
                    canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(12.0f), paint5);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.f26472k < 1.0f) {
                    iSave2 = canvas.save();
                    float f18 = this.f26472k;
                    canvas.scale(f18, f18, fCenterX, fCenterY);
                } else {
                    iSave2 = Integer.MIN_VALUE;
                }
                float f19 = i25;
                canvas.drawCircle(fCenterX, fCenterY, com.google.android.recaptcha.internal.a.z(1.0f, this.f26480s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f19) * f11), paint2);
                if (this.f26466c) {
                    f90Var2.setBounds((int) (fCenterX - (AndroidUtilities.dp(f19) * f11)), (int) (fCenterY - (AndroidUtilities.dp(f19) * f11)), (int) ((AndroidUtilities.dp(f19) * f11) + fCenterX), (int) ((AndroidUtilities.dp(f19) * f11) + fCenterY));
                    f90Var2.draw(canvas);
                }
                if (iSave2 != Integer.MIN_VALUE) {
                    canvas.restoreToCount(iSave2);
                }
            }
            if (this.I != 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void e() {
        this.f26483w.onAttachedToWindow();
    }

    public final void f() {
        this.f26483w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f26477p = i10;
        this.f26481t = i11;
        this.f26482u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String strL;
        if (str != null) {
            Locale locale = Locale.US;
            strL = com.google.android.recaptcha.internal.a.l(this.f26484x * 2, "_", this.f26484x * 2);
        } else {
            strL = null;
        }
        this.f26483w.setImage(str, strL, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f26484x;
        this.f26483w.setImage(forDocument, com.google.android.recaptcha.internal.a.l(i10 * 2, "_", i10 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String strL = com.google.android.recaptcha.internal.a.l(this.f26484x * 2, "_", this.f26484x * 2);
        this.f26483w.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), strL, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, strL, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            f90 f90Var = this.f26471j;
            if (z10 && i10 == f90Var.f28309q) {
                return;
            }
            f90Var.d(i10, z11);
            boolean z12 = i10 != 4 || f90Var.b() < 1.0f;
            this.f26466c = z12;
            if (z12) {
                c();
            }
            if (z11) {
                d();
            } else {
                this.f26465b.invalidate();
            }
        }
    }

    public final void l(float f10) {
        this.f26472k = f10;
    }

    public final void m(View view) {
        this.f26465b = view;
        this.f26483w.setParentView(view);
        Objects.requireNonNull(view);
        this.f26470i.A = new vu(view, 13);
        this.f26471j.A = new vu(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f26486z = z10;
        } else {
            this.f26485y = z10;
        }
        d();
    }

    public final void o(float f10, boolean z10) {
        if (this.f26466c) {
            this.f26471j.e(f10, z10);
        } else {
            this.f26470i.e(f10, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f26464a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        f90 f90Var = this.f26470i;
        f90Var.f28302j = true;
        f90Var.f28296b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        f90 f90Var = this.f26470i;
        f90Var.C = linearGradient;
        f90Var.D = new Matrix();
        f90 f90Var2 = this.f26471j;
        f90Var2.C = linearGradient;
        f90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f26484x = i10;
        this.f26483w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f26473l = i10;
        this.f26474m = i11;
        this.f26475n = i12;
        this.f26476o = i13;
        this.f26477p = -1;
        this.f26481t = -1;
        this.f26482u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        f90 f90Var = this.f26470i;
        if (z10 && i10 == f90Var.f28309q) {
            return;
        }
        f90Var.d(i10, z11);
        View view = this.f26465b;
        if (view != null) {
            if (z11) {
                d();
            } else {
                view.invalidate();
            }
        }
    }
}
