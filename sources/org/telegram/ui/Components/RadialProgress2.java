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
    public View f24071b;
    public boolean f24072c;
    public final Paint f24073e;
    public final Paint f24074f;
    public final Paint f24075g;
    public final Paint h;
    public final t90 f24076i;
    public final t90 f24077j;
    public float f24078k;
    public int f24079l;
    public int f24080m;
    public int f24081n;
    public int f24082o;
    public int f24083p;
    public int f24084q;
    public float f24085r;
    public float f24086s;
    public int f24087t;
    public int f24088u;
    public int v;
    public final ImageReceiver f24089w;
    public int f24090x;
    public boolean f24091y;
    public boolean f24092z;
    public final RectF f24070a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f24074f = paint;
        this.f24075g = new Paint(1);
        this.h = new Paint(1);
        this.f24078k = 1.0f;
        this.f24083p = -1;
        this.f24084q = -1;
        this.f24086s = 1.0f;
        this.f24087t = -1;
        this.f24088u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = f6Var;
        this.f24073e = new Paint(1);
        this.f24071b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f24089w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        t90 t90Var = new t90();
        this.f24076i = t90Var;
        t90 t90Var2 = new t90();
        this.f24077j = t90Var2;
        t90Var2.f30566j = true;
        t90Var2.f30560b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        t90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f24090x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            t90Var.A = new kv(view, 13);
            t90Var2.A = new kv(view, 13);
        }
    }

    public final int a() {
        return this.f24076i.f30573q;
    }

    public final float b() {
        t90 t90Var = this.f24076i;
        int i10 = t90Var.f30573q;
        int i11 = t90Var.f30572p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return t90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - t90Var.b();
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
        View view = this.f24071b;
        RectF rectF = this.f24070a;
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
        t90 t90Var = this.f24076i;
        int i15 = t90Var.f30573q;
        Paint paint2 = t90Var.f30561c;
        if (i15 != 4 || t90Var.b() < 1.0f) {
            RectF rectF = this.f24070a;
            if (!rectF.isEmpty()) {
                int i16 = t90Var.f30573q;
                float b11 = b();
                boolean z10 = this.f24092z;
                t90 t90Var2 = this.f24077j;
                Paint paint3 = this.h;
                if (z10 && this.f24084q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        t90Var2.c(org.telegram.ui.ActionBar.j6.v0(i17, this.F));
                    } else {
                        t90Var2.c(this.f24082o);
                    }
                    int i18 = this.f24087t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f24080m);
                    }
                } else {
                    int i19 = this.f24088u;
                    if (i19 >= 0) {
                        t90Var2.c(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                    } else {
                        t90Var2.c(this.f24081n);
                    }
                    int i20 = this.f24083p;
                    if (i20 >= 0) {
                        if (this.f24084q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F), org.telegram.ui.ActionBar.j6.v0(this.f24084q, this.F), this.f24085r, this.f24086s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f24079l);
                    }
                }
                boolean z11 = this.f24091y;
                Paint paint4 = this.f24075g;
                if (z11) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i21, this.F);
                        t90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f24087t, this.F));
                    } else {
                        i10 = this.f24082o;
                        t90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24080m);
                    }
                    int i22 = this.f24087t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f24080m);
                    }
                } else {
                    int i23 = this.f24088u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i23, this.F);
                        t90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f24083p, this.F));
                    } else {
                        i10 = this.f24081n;
                        t90Var.c(i10);
                        paint2.setColor((-16777216) | this.f24079l);
                    }
                    int i24 = this.f24083p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f24079l);
                    }
                }
                if ((this.f24072c || this.f24084q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f24072c || this.f24084q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f24089w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z12 = true;
                Paint paint5 = this.f24074f;
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
                    t90Var.c(argb);
                    float f12 = this.f24090x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f12, f12);
                } else {
                    f7 = b11;
                    paint = paint3;
                    f10 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f24084q >= 0 && this.f24086s != f10) {
                    i11 = canvas5.save();
                    float b12 = com.google.android.gms.internal.vision.e2.b(1.0f, this.f24086s, 0.1f, 1.0f);
                    this.D.scale(b12, b12, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z12 && this.B) {
                    if ((this.f24072c || this.f24084q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f24090x, paint4);
                    } else if (i16 != 4 || f7 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f24090x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f7 * this.E * this.H);
                    if ((this.f24072c || this.f24084q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f24090x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f24090x, paint5);
                    }
                }
                int i26 = this.f24090x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f13 = this.I;
                    canvas.scale(f13, f13, ceil, ceil2);
                }
                t90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                t90Var.E = imageReceiver.hasBitmapImage();
                if (!this.f24072c && this.f24084q < 0) {
                    t90Var.f30571o = this.E;
                    t90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        t90Var.draw(canvas6);
                    } else {
                        t90Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f24072c || this.f24084q >= 0) {
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
                    if (this.f24072c) {
                        if (t90Var2.f30573q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - t90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f24072c = false;
                        }
                        f11 = b10;
                    } else {
                        f11 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f15 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(i28 + 1) * f11 * this.f24078k, org.telegram.ui.ActionBar.j6.f20840n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.f24073e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f24078k < 1.0f) {
                        i13 = canvas.save();
                        float f16 = this.f24078k;
                        canvas.scale(f16, f16, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f17 = i28;
                    canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.f24086s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f17) * f11), paint);
                    if (this.f24072c) {
                        t90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f17) * f11)), (int) (centerY - (AndroidUtilities.dp(f17) * f11)), (int) ((AndroidUtilities.dp(f17) * f11) + centerX), (int) ((AndroidUtilities.dp(f17) * f11) + centerY));
                        t90Var2.draw(canvas);
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
        this.f24089w.onAttachedToWindow();
    }

    public final void f() {
        this.f24089w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f24083p = i10;
        this.f24087t = i11;
        this.f24088u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a4.a.k(this.f24090x * 2, this.f24090x * 2, "_");
        } else {
            str2 = null;
        }
        this.f24089w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f24090x;
        this.f24089w.setImage(forDocument, a4.a.k(i10 * 2, i10 * 2, "_"), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String k10 = a4.a.k(this.f24090x * 2, this.f24090x * 2, "_");
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f24089w.setImage(forDocument, k10, imageLocation, k10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        boolean z12;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            t90 t90Var = this.f24077j;
            if (z10 && i10 == t90Var.f30573q) {
                return;
            }
            t90Var.d(i10, z11);
            if (i10 == 4 && t90Var.b() >= 1.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f24072c = z12;
            if (z12) {
                c();
            }
            if (!z11) {
                this.f24071b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f7) {
        this.f24078k = f7;
    }

    public final void m(View view) {
        this.f24071b = view;
        this.f24089w.setParentView(view);
        Objects.requireNonNull(view);
        this.f24076i.A = new kv(view, 13);
        this.f24077j.A = new kv(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.f24092z = z10;
        } else {
            this.f24091y = z10;
        }
        d();
    }

    public final void o(float f7, boolean z10) {
        if (this.f24072c) {
            this.f24077j.e(f7, z10);
        } else {
            this.f24076i.e(f7, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f24070a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        t90 t90Var = this.f24076i;
        t90Var.f30566j = true;
        t90Var.f30560b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        t90 t90Var = this.f24076i;
        t90Var.C = linearGradient;
        t90Var.D = new Matrix();
        t90 t90Var2 = this.f24077j;
        t90Var2.C = linearGradient;
        t90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f24090x = i10;
        this.f24089w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f24079l = i10;
        this.f24080m = i11;
        this.f24081n = i12;
        this.f24082o = i13;
        this.f24083p = -1;
        this.f24087t = -1;
        this.f24088u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        t90 t90Var = this.f24076i;
        if (!z10 || i10 != t90Var.f30573q) {
            t90Var.d(i10, z11);
            View view = this.f24071b;
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
