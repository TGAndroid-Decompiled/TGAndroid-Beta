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
    public View f23086b;
    public boolean f23087c;
    public final Paint e;
    public final Paint f23088f;
    public final Paint f23089g;
    public final Paint h;
    public final v90 f23090i;
    public final v90 f23091j;
    public float f23092k;
    public int f23093l;
    public int f23094m;
    public int f23095n;
    public int f23096o;
    public int f23097p;
    public int f23098q;
    public float f23099r;
    public float f23100s;
    public int f23101t;
    public int f23102u;
    public int v;
    public final ImageReceiver f23103w;
    public int f23104x;
    public boolean f23105y;
    public boolean f23106z;
    public final RectF f23085a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f23088f = paint;
        this.f23089g = new Paint(1);
        this.h = new Paint(1);
        this.f23092k = 1.0f;
        this.f23097p = -1;
        this.f23098q = -1;
        this.f23100s = 1.0f;
        this.f23101t = -1;
        this.f23102u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = f6Var;
        this.e = new Paint(1);
        this.f23086b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f23103w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        v90 v90Var = new v90();
        this.f23090i = v90Var;
        v90 v90Var2 = new v90();
        this.f23091j = v90Var2;
        v90Var2.f29425j = true;
        v90Var2.f29420b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        v90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.f23104x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            v90Var.A = new ev(view, 13);
            v90Var2.A = new ev(view, 13);
        }
    }

    public final int a() {
        return this.f23090i.f29432q;
    }

    public final float b() {
        v90 v90Var = this.f23090i;
        int i10 = v90Var.f29432q;
        int i11 = v90Var.f29431p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return v90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - v90Var.b();
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
        View view = this.f23086b;
        RectF rectF = this.f23085a;
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
        v90 v90Var = this.f23090i;
        int i15 = v90Var.f29432q;
        Paint paint2 = v90Var.f29421c;
        if (i15 != 4 || v90Var.b() < 1.0f) {
            RectF rectF = this.f23085a;
            if (!rectF.isEmpty()) {
                int i16 = v90Var.f29432q;
                float b11 = b();
                boolean z4 = this.f23106z;
                v90 v90Var2 = this.f23091j;
                Paint paint3 = this.h;
                if (z4 && this.f23098q < 0) {
                    int i17 = this.v;
                    if (i17 >= 0) {
                        v90Var2.c(org.telegram.ui.ActionBar.j6.v0(i17, this.F));
                    } else {
                        v90Var2.c(this.f23096o);
                    }
                    int i18 = this.f23101t;
                    if (i18 >= 0) {
                        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                    } else {
                        paint3.setColor(this.f23094m);
                    }
                } else {
                    int i19 = this.f23102u;
                    if (i19 >= 0) {
                        v90Var2.c(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                    } else {
                        v90Var2.c(this.f23095n);
                    }
                    int i20 = this.f23097p;
                    if (i20 >= 0) {
                        if (this.f23098q >= 0) {
                            paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F), org.telegram.ui.ActionBar.j6.v0(this.f23098q, this.F), this.f23099r, this.f23100s));
                        } else {
                            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i20, this.F));
                        }
                    } else {
                        paint3.setColor(this.f23093l);
                    }
                }
                boolean z10 = this.f23105y;
                Paint paint4 = this.f23089g;
                if (z10) {
                    int i21 = this.v;
                    if (i21 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i21, this.F);
                        v90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f23101t, this.F));
                    } else {
                        i10 = this.f23096o;
                        v90Var.c(i10);
                        paint2.setColor((-16777216) | this.f23094m);
                    }
                    int i22 = this.f23101t;
                    if (i22 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i22, this.F));
                    } else {
                        paint4.setColor(this.f23094m);
                    }
                } else {
                    int i23 = this.f23102u;
                    if (i23 >= 0) {
                        i10 = org.telegram.ui.ActionBar.j6.v0(i23, this.F);
                        v90Var.c(i10);
                        paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.f23097p, this.F));
                    } else {
                        i10 = this.f23095n;
                        v90Var.c(i10);
                        paint2.setColor((-16777216) | this.f23093l);
                    }
                    int i24 = this.f23097p;
                    if (i24 >= 0) {
                        paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i24, this.F));
                    } else {
                        paint4.setColor(this.f23093l);
                    }
                }
                if ((this.f23087c || this.f23098q >= 0) && this.D != null) {
                    this.C.eraseColor(0);
                }
                paint4.setAlpha((int) (paint4.getAlpha() * b11 * this.E * this.A));
                paint3.setAlpha((int) (paint3.getAlpha() * b11 * this.E));
                if ((this.f23087c || this.f23098q >= 0) && this.D != null) {
                    ceil = (int) Math.ceil(rectF.width() / 2.0f);
                    ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
                } else {
                    ceil = (int) rectF.centerX();
                    ceil2 = (int) rectF.centerY();
                }
                ImageReceiver imageReceiver = this.f23103w;
                boolean hasBitmapImage = imageReceiver.hasBitmapImage();
                boolean z11 = true;
                Paint paint5 = this.f23088f;
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
                    v90Var.c(argb);
                    float f13 = this.f23104x * 2;
                    imageReceiver.setImageCoords(ceil - i14, ceil2 - i14, f13, f13);
                } else {
                    f10 = b11;
                    paint = paint3;
                    f11 = 1.0f;
                }
                Canvas canvas5 = this.D;
                if (canvas5 != null && this.f23098q >= 0 && this.f23100s != f11) {
                    i11 = canvas5.save();
                    float c3 = org.telegram.ui.ai.c(1.0f, this.f23100s, 0.1f, 1.0f);
                    this.D.scale(c3, c3, ceil, ceil2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (z11 && this.B) {
                    if ((this.f23087c || this.f23098q >= 0) && (canvas4 = this.D) != null) {
                        canvas4.drawCircle(ceil, ceil2, this.f23104x, paint4);
                    } else if (i16 != 4 || f10 != 0.0f) {
                        canvas.drawCircle(ceil, ceil2, this.f23104x, paint4);
                    }
                }
                if (imageReceiver.hasBitmapImage()) {
                    imageReceiver.setAlpha(f10 * this.E * this.H);
                    if ((this.f23087c || this.f23098q >= 0) && (canvas3 = this.D) != null) {
                        imageReceiver.draw(canvas3);
                        this.D.drawCircle(ceil, ceil2, this.f23104x, paint5);
                    } else {
                        imageReceiver.draw(canvas);
                        canvas.drawCircle(ceil, ceil2, this.f23104x, paint5);
                    }
                }
                int i26 = this.f23104x;
                int i27 = this.G;
                if (i27 > 0 && i26 > i27) {
                    i26 = i27;
                }
                if (this.I != 1.0f) {
                    canvas.save();
                    float f14 = this.I;
                    canvas.scale(f14, f14, ceil, ceil2);
                }
                v90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
                v90Var.E = imageReceiver.hasBitmapImage();
                if (!this.f23087c && this.f23098q < 0) {
                    v90Var.f29430o = this.E;
                    v90Var.draw(canvas);
                } else {
                    Canvas canvas6 = this.D;
                    if (canvas6 != null) {
                        v90Var.draw(canvas6);
                    } else {
                        v90Var.draw(canvas);
                    }
                }
                if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                    canvas2.restoreToCount(i11);
                }
                if (this.f23087c || this.f23098q >= 0) {
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
                    if (this.f23087c) {
                        if (v90Var2.f29432q != 4) {
                            b10 = 1.0f;
                        } else {
                            b10 = 1.0f - v90Var2.b();
                        }
                        if (b10 == 0.0f) {
                            this.f23087c = false;
                        }
                        f12 = b10;
                    } else {
                        f12 = 1.0f;
                    }
                    Canvas canvas7 = this.D;
                    if (canvas7 != null) {
                        float f16 = i12 + 18 + i25;
                        canvas7.drawCircle(AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(i28 + 1) * f12 * this.f23092k, org.telegram.ui.ActionBar.j6.f20054n0);
                    } else {
                        int i29 = this.d;
                        Paint paint6 = this.e;
                        paint6.setColor(i29);
                        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                    }
                    if (this.D != null) {
                        canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                    }
                    if (this.f23092k < 1.0f) {
                        i13 = canvas.save();
                        float f17 = this.f23092k;
                        canvas.scale(f17, f17, centerX, centerY);
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    float f18 = i28;
                    canvas.drawCircle(centerX, centerY, e2.c.w(1.0f, this.f23100s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f18) * f12), paint);
                    if (this.f23087c) {
                        v90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f18) * f12)), (int) (centerY - (AndroidUtilities.dp(f18) * f12)), (int) ((AndroidUtilities.dp(f18) * f12) + centerX), (int) ((AndroidUtilities.dp(f18) * f12) + centerY));
                        v90Var2.draw(canvas);
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
        this.f23103w.onAttachedToWindow();
    }

    public final void f() {
        this.f23103w.onDetachedFromWindow();
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.f23097p = i10;
        this.f23101t = i11;
        this.f23102u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = e2.c.h(this.f23104x * 2, "_", this.f23104x * 2);
        } else {
            str2 = null;
        }
        this.f23103w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.f23104x;
        this.f23103w.setImage(forDocument, e2.c.h(i10 * 2, "_", i10 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        ImageLocation forDocument;
        Locale locale = Locale.US;
        String h = e2.c.h(this.f23104x * 2, "_", this.f23104x * 2);
        ImageLocation imageLocation = null;
        if (photoSize == null) {
            forDocument = null;
        } else {
            forDocument = ImageLocation.getForDocument(photoSize, document);
        }
        if (photoSize2 != null) {
            imageLocation = ImageLocation.getForDocument(photoSize2, document);
        }
        this.f23103w.setImage(forDocument, h, imageLocation, h, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z4, boolean z10) {
        boolean z11;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            v90 v90Var = this.f23091j;
            if (z4 && i10 == v90Var.f29432q) {
                return;
            }
            v90Var.d(i10, z10);
            if (i10 == 4 && v90Var.b() >= 1.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f23087c = z11;
            if (z11) {
                c();
            }
            if (!z10) {
                this.f23086b.invalidate();
            } else {
                d();
            }
        }
    }

    public final void l(float f10) {
        this.f23092k = f10;
    }

    public final void m(View view) {
        this.f23086b = view;
        this.f23103w.setParentView(view);
        Objects.requireNonNull(view);
        this.f23090i.A = new ev(view, 13);
        this.f23091j.A = new ev(view, 13);
    }

    public final void n(boolean z4, boolean z10) {
        if (z10) {
            this.f23106z = z4;
        } else {
            this.f23105y = z4;
        }
        d();
    }

    public final void o(float f10, boolean z4) {
        if (this.f23087c) {
            this.f23091j.e(f10, z4);
        } else {
            this.f23090i.e(f10, z4);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f23085a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        v90 v90Var = this.f23090i;
        v90Var.f29425j = true;
        v90Var.f29420b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        v90 v90Var = this.f23090i;
        v90Var.C = linearGradient;
        v90Var.D = new Matrix();
        v90 v90Var2 = this.f23091j;
        v90Var2.C = linearGradient;
        v90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.f23104x = i10;
        this.f23103w.setRoundRadius(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.f23093l = i10;
        this.f23094m = i11;
        this.f23095n = i12;
        this.f23096o = i13;
        this.f23097p = -1;
        this.f23101t = -1;
        this.f23102u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z4, boolean z10) {
        v90 v90Var = this.f23090i;
        if (!z4 || i10 != v90Var.f29432q) {
            v90Var.d(i10, z10);
            View view = this.f23086b;
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
