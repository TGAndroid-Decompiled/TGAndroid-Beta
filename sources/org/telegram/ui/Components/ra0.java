package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ra0 extends Drawable {
    public static final boolean f37610e0;
    public static final boolean f37611f0;
    public Matrix A;
    public boolean B;
    public GradientDrawable C;
    public org.telegram.messenger.k9 D;
    public boolean E;
    public boolean F;
    public final Runnable G;
    public PorterDuffColorFilter H;
    public int I;
    public float J;
    public final float K;
    public int L;
    public float M;
    public boolean N;
    public final int O;
    public final int P;
    public wa0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final ih.a V;
    public final ih.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f37612a;
    public int f37613a0;
    public long f37614b;
    public final ih.a f37615b0;
    public WeakReference f37616c;
    public Bitmap f37617c0;
    public boolean d;
    public int f37618d0;
    public final xq f37619e;
    public int f37620f;
    public boolean f37621g;
    public float h;
    public int f37622i;
    public final RectF f37623j;
    public Bitmap f37624k;
    public Bitmap f37625l;
    public final Bitmap[] f37626m;
    public final Paint f37627n;
    public final Paint f37628o;
    public final Paint f37629p;
    public int f37630q;
    public Canvas f37631r;
    public Canvas f37632s;
    public boolean f37633t;
    public Bitmap f37634u;
    public BitmapShader v;
    public BitmapShader f37635w;
    public Bitmap f37636x;
    public ImageReceiver f37637y;
    public boolean f37638z;

    static {
        boolean z9;
        int i7 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i7 < 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        f37610e0 = z9;
        if (i7 >= 29) {
            z10 = true;
        }
        f37611f0 = z10;
    }

    public ra0() {
        this.f37612a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f37619e = new xq(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f37623j = new RectF();
        this.f37626m = new Bitmap[3];
        this.f37627n = new Paint(2);
        this.f37628o = new Paint(2);
        this.f37629p = new Paint();
        this.f37630q = 100;
        this.C = new GradientDrawable();
        this.G = new qa0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new ih.a();
        this.W = new ih.a();
        this.f37615b0 = new ih.a();
        h();
    }

    public static int g(int i7, int i10, int i11, int i12) {
        boolean j3 = j(i7, i10, i11, i12);
        boolean z9 = f37611f0;
        if (j3) {
            if (!z9) {
                return Integer.MAX_VALUE;
            }
            return -1;
        } else if (!z9) {
            int w02 = org.telegram.messenger.g0.w0(i11, org.telegram.messenger.g0.w0(i7, i10));
            if (i12 != 0) {
                w02 = org.telegram.messenger.g0.w0(i12, w02);
            }
            return (org.telegram.messenger.g0.V0(w02, true) & 16777215) | 1677721600;
        } else {
            return -16777216;
        }
    }

    public static boolean j(int i7, int i10, int i11, int i12) {
        int w02 = org.telegram.messenger.g0.w0(i7, i10);
        if (i11 != 0) {
            w02 = org.telegram.messenger.g0.w0(w02, i11);
        }
        if (i12 != 0) {
            w02 = org.telegram.messenger.g0.w0(w02, i12);
        }
        if (org.telegram.messenger.g0.b(Color.red(w02), Color.green(w02), Color.blue(w02))[2] < 0.3f) {
            return true;
        }
        return false;
    }

    public final void a(Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        List list = this.R;
        if (list != null && this.f37637y != null && i7 >= 0 && i7 < list.size()) {
            gg.c cVar = (gg.c) this.R.get(i7);
            canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12, f13);
            canvas.concat(cVar.f13957b);
            this.f37637y.A0(cVar.f13956a);
            this.f37637y.h(canvas, null);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i7) {
        if (this.R != null && this.f37634u != null) {
            a(canvas, i7, rectF.left, rectF.top, rectF.width() / this.f37634u.getWidth(), rectF.height() / this.f37634u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i7 = -1;
        while (i7 < 3) {
            int i10 = i7 + 1;
            float f10 = i10 / 3.0f;
            if (i7 < 0) {
                bitmap = this.f37625l;
            } else {
                bitmap = this.f37626m[i7];
            }
            Utilities.generateGradient(bitmap, this.f37622i, f10, this.f37612a);
            i7 = i10;
        }
    }

    public final Bitmap d() {
        return this.f37624k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean z9;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e10 = e();
        if (e10 != null) {
            i7 = bounds.top;
        } else {
            i7 = this.f37620f;
        }
        float f10 = i7;
        int width = this.f37624k.getWidth();
        int height = this.f37624k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f11 = width;
        float f12 = height;
        float max = Math.max(width2 / f11, height2 / f12);
        float f13 = f11 * max;
        float f14 = f12 * max;
        float f15 = (width2 - f13) / 2.0f;
        float f16 = (height2 - f14) / 2.0f;
        if (this.f37621g) {
            int i10 = bounds.left;
            f15 += i10;
            int i11 = bounds.top;
            f16 += i11;
            canvas.clipRect(i10, i11, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f37624k != null && e10 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i12 = this.f37630q;
        float f17 = 1.0f;
        Paint paint = this.f37627n;
        float f18 = this.K;
        Paint paint2 = this.f37628o;
        boolean z10 = z9;
        RectF rectF = this.f37623j;
        if (i12 < 0) {
            boolean z11 = f37610e0;
            if (!z10 && (!z11 || e10 == null)) {
                canvas.drawColor(i0.a.o(-16777216, (int) (this.L * f18)));
            }
            if (e10 != null) {
                if (z11) {
                    int i13 = (((int) (this.L * this.J)) * (-this.f37630q)) / 100;
                    if (this.f37634u != null) {
                        Bitmap e11 = e();
                        ih.a aVar = this.f37615b0;
                        if (aVar.a(e11) || this.f37617c0 == null || this.f37618d0 != i13) {
                            int width3 = this.f37634u.getWidth();
                            int height3 = this.f37634u.getHeight();
                            this.f37618d0 = i13;
                            Bitmap bitmap = this.f37617c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f37617c0.getHeight() != height3) {
                                this.f37617c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e11, this.f37617c0, i13);
                        }
                        aVar.b(e11);
                    }
                    float width4 = e10.getWidth();
                    float height4 = e10.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f19 = width4 * max2;
                    float f20 = height4 * max2;
                    float f21 = (width2 - f19) / 2.0f;
                    float f22 = (height2 - f20) / 2.0f;
                    rectF.set(f21, f22, f19 + f21, f20 + f22);
                    if (this.f37617c0 != null) {
                        canvas.drawBitmap(this.f37624k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f37617c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.a.o(-16777216, (int) (this.L * f18)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f15, f16 + f10);
                    float min = 1.0f / Math.min(this.f37624k.getWidth() / bounds.width(), this.f37624k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e10.getWidth();
                    float height5 = e10.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f23 = (width2 - (width5 * max3)) / 2.0f;
                    float f24 = ((height2 - (height5 * max3)) / 2.0f) + f10;
                    this.A.setTranslate((int) f23, (int) f24);
                    if (!this.f37638z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f17 = max3;
                    }
                    this.f37635w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f37630q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z10) {
                        Paint e12 = this.Q.e(this.f37624k, e10, this.U, (int) (this.L * this.J), this.f37630q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f25 = this.I;
                        canvas.drawRoundRect(rectF, f25, f25, e12);
                    } else {
                        float f26 = this.I;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                    a(canvas, this.S, f23, f24, f17, f17);
                }
            }
        } else {
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f15, f16);
                float min2 = 1.0f / Math.min(this.f37624k.getWidth() / bounds.width(), this.f37624k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z10) {
                    float f27 = this.I;
                    canvas.drawRoundRect(rectF, f27, f27, paint);
                }
            } else {
                canvas.translate(0.0f, f10);
                GradientDrawable gradientDrawable = this.C;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f15, (int) f16, (int) (f15 + f13), (int) (f16 + f14));
                    this.C.setAlpha((int) (f18 * 255.0f));
                    this.C.draw(canvas);
                } else {
                    rectF.set(f15, f16, f13 + f15, f14 + f16);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * f18));
                    if (!z10) {
                        canvas.drawBitmap(this.f37624k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e10 != null) {
                float width6 = e10.getWidth();
                float height6 = e10.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f28 = width6 * max4;
                float f29 = height6 * max4;
                float f30 = (width2 - f28) / 2.0f;
                float f31 = (height2 - f29) / 2.0f;
                rectF.set(f30, f31, f28 + f30, f29 + f31);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f37630q) / 100.0f) * this.L * this.J));
                if (z10) {
                    Paint e13 = this.Q.e(this.f37624k, e10, this.U, (int) (this.L * this.J), this.f37630q, canvas.isHardwareAccelerated());
                    wa0 wa0Var = this.Q;
                    RectF rectF2 = wa0Var.f40027j;
                    rectF2.set(0.0f, 0.0f, wa0Var.f40025g, wa0Var.h);
                    Matrix matrix = wa0Var.f40026i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    wa0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e13);
                } else {
                    canvas.drawBitmap(e10, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f37630q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        y();
    }

    public final Bitmap e() {
        boolean z9;
        Bitmap bitmap = this.f37634u;
        if (bitmap == null) {
            return null;
        }
        if (this.f37636x == null) {
            return bitmap;
        }
        ih.a aVar = this.V;
        boolean a10 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f37636x;
        ih.a aVar2 = this.W;
        boolean a11 = aVar2.a(bitmap2);
        boolean z10 = true;
        if (this.f37613a0 != this.S) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!a10 && !a11 && !z9) {
            z10 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z10) {
            return bitmap3;
        }
        int width = this.f37634u.getWidth();
        int height = this.f37634u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f37634u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f37634u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f37634u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i7 = this.S;
        if (this.f37636x != null && this.R != null) {
            for (int i10 = 0; i10 < this.R.size(); i10++) {
                if (i10 != i7) {
                    gg.c cVar = (gg.c) this.R.get(i10);
                    canvas.save();
                    canvas.concat(cVar.f13957b);
                    canvas.drawBitmap(this.f37636x, (Rect) null, cVar.f13956a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f37613a0 = this.S;
        aVar.b(this.f37634u);
        aVar2.b(this.f37636x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f37612a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f37634u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f37634u;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        BlendMode blendMode;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i7 = this.O;
        int i10 = this.P;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        this.f37624k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i11 = 0; i11 < 3; i11++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            this.f37626m[i11] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f37631r = new Canvas(this.f37624k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
        this.f37625l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f37632s = new Canvas(this.f37625l);
        Utilities.generateGradient(this.f37624k, this.f37622i, this.f37619e.getInterpolation(this.h), this.f37612a);
        if (f37611f0) {
            Paint paint = this.f37628o;
            blendMode = BlendMode.SOFT_LIGHT;
            paint.setBlendMode(blendMode);
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f37616c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f37616c.get()).invalidate();
        }
        if (this.f37633t) {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25023j4, new Object[0]);
            y();
            Runnable runnable = this.G;
            org.telegram.messenger.g0.r(runnable);
            org.telegram.messenger.g0.i3(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f37637y;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f37637y;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    public final void m(boolean z9) {
        if (this.h < 1.0f) {
            return;
        }
        this.F = true;
        this.h = 0.0f;
        this.E = z9;
        i();
    }

    public final void n(int i7, int i10, int i11, int i12) {
        o(i7, i10, i11, i12, 0, true);
    }

    public final void o(int i7, int i10, int i11, int i12, int i13, boolean z9) {
        if (this.f37621g && i11 == 0 && i12 == 0) {
            this.C = new GradientDrawable(k9.d(i13), new int[]{i7, i10});
        } else {
            this.C = null;
        }
        int[] iArr = this.f37612a;
        if (iArr[0] != i7 || iArr[1] != i10 || iArr[2] != i11 || iArr[3] != i12) {
            iArr[0] = i7;
            iArr[1] = i10;
            iArr[2] = i11;
            iArr[3] = i12;
            Bitmap bitmap = this.f37624k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f37622i, this.f37619e.getInterpolation(this.h), iArr);
                if (z9) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !org.telegram.messenger.iz.f23422o) {
            this.Q = new wa0();
        }
    }

    public final void q(View view) {
        this.f37616c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f37637y;
        if (imageReceiver != null) {
            imageReceiver.H0(view);
        }
    }

    public final void r(float f10) {
        this.J = f10;
        i();
    }

    public final void s(int i7, Bitmap bitmap) {
        this.f37630q = i7;
        this.f37634u = bitmap;
        if (bitmap != null) {
            boolean z9 = f37611f0;
            Paint paint = this.f37628o;
            if (z9) {
                if (i7 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z10 = f37610e0;
            if (i7 < 0) {
                if (!z10) {
                    Bitmap bitmap2 = this.f37624k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f37634u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f37635w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f37638z = true;
                    paint.setShader(new ComposeShader(this.v, this.f37635w, PorterDuff.Mode.DST_IN));
                    paint.setFilterBitmap(true);
                    this.A = new Matrix();
                    return;
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            } else if (z10) {
                paint.setXfermode(null);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.L = i7;
        this.f37627n.setAlpha(i7);
        this.f37628o.setAlpha(i7);
    }

    public final void t(int i7) {
        this.U = i7;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void u(int i7) {
        this.f37622i = i7;
        if (i7 < 0) {
            this.f37622i = 0;
        } else if (i7 > 7) {
            this.f37622i = 7;
        }
        Utilities.generateGradient(this.f37624k, this.f37622i, this.f37619e.getInterpolation(this.h), this.f37612a);
    }

    public final void v(int i7) {
        this.I = i7;
        this.A = new Matrix();
        Bitmap bitmap = this.f37624k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f37627n.setShader(bitmapShader);
        i();
    }

    public final void w(boolean z9) {
        if (this.h >= 1.0f && org.telegram.messenger.sc.e(32)) {
            this.F = false;
            this.E = false;
            this.B = z9;
            this.h = 0.0f;
            int i7 = this.f37622i - 1;
            this.f37622i = i7;
            if (i7 < 0) {
                this.f37622i = 7;
            }
            i();
            this.f37632s.drawBitmap(this.f37624k, 0.0f, 0.0f, (Paint) null);
            c();
            return;
        }
        i();
    }

    public final void x() {
        if (this.h < 1.0f) {
            return;
        }
        this.F = false;
        this.B = true;
        this.E = true;
        this.h = 0.0f;
        i();
        Utilities.generateGradient(this.f37625l, this.f37622i, 0.0f, this.f37612a);
        c();
    }

    public final void y() {
        boolean z9;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f37614b;
        if (j3 > 20) {
            j3 = 17;
        }
        this.f37614b = elapsedRealtime;
        if (j3 > 1) {
            boolean z10 = this.N;
            if (z10 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f14 = this.h;
            if (f14 < 1.0f) {
                boolean z11 = true;
                if (!this.f37633t && !this.F) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z10) {
                    float f15 = ((((float) j3) / 12000.0f) * this.M) + f14;
                    this.h = f15;
                    if (f15 >= 1.0f) {
                        this.h = 0.0f;
                    }
                    float f16 = this.h;
                    int i7 = (int) (f16 / 0.125f);
                    this.f37622i = i7;
                    f11 = 1.0f - ((f16 - (i7 * 0.125f)) / 0.125f);
                } else {
                    boolean z12 = this.F;
                    xq xqVar = this.f37619e;
                    if (z12) {
                        float interpolation = xqVar.getInterpolation(f14);
                        if (interpolation <= 0.25f) {
                            c10 = 0;
                        } else if (interpolation <= 0.5f) {
                            c10 = 1;
                        } else if (interpolation <= 0.75f) {
                            c10 = 2;
                        } else {
                            c10 = 3;
                        }
                        org.telegram.messenger.k9 k9Var = this.D;
                        if (k9Var != null) {
                            this.h = ((Float) k9Var.j(this)).floatValue();
                        } else {
                            float f17 = this.h;
                            float f18 = (float) j3;
                            if (this.E) {
                                f12 = 1000.0f;
                            } else {
                                f12 = 2000.0f;
                            }
                            this.h = (f18 / f12) + f17;
                        }
                        if (this.h > 1.0f) {
                            this.h = 1.0f;
                        }
                        if (this.D == null && !this.d) {
                            f13 = xqVar.getInterpolation(this.h);
                        } else {
                            f13 = this.h;
                        }
                        if (this.d && (f13 == 0.0f || f13 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c10 == 0 && f13 > 0.25f) || ((c10 == 1 && f13 > 0.5f) || (c10 == 2 && f13 > 0.75f))) {
                            if (this.E) {
                                int i10 = this.f37622i + 1;
                                this.f37622i = i10;
                                if (i10 > 7) {
                                    this.f37622i = 0;
                                }
                            } else {
                                int i11 = this.f37622i - 1;
                                this.f37622i = i11;
                                if (i11 < 0) {
                                    this.f37622i = 7;
                                }
                            }
                        }
                        if (f13 > 0.25f) {
                            if (f13 <= 0.5f) {
                                f13 -= 0.25f;
                            } else if (f13 <= 0.75f) {
                                f13 -= 0.5f;
                            } else {
                                f13 -= 0.75f;
                            }
                        }
                        float f19 = f13 / 0.25f;
                        if (this.E) {
                            f11 = 1.0f - f19;
                            if (this.h >= 1.0f) {
                                int i12 = this.f37622i + 1;
                                this.f37622i = i12;
                                if (i12 > 7) {
                                    this.f37622i = 0;
                                }
                                f11 = 1.0f;
                            }
                        } else {
                            f11 = f19;
                        }
                        z11 = z9;
                    } else {
                        org.telegram.messenger.k9 k9Var2 = this.D;
                        if (k9Var2 != null) {
                            this.h = ((Float) k9Var2.j(this)).floatValue();
                        } else {
                            float f20 = (float) j3;
                            if (this.B) {
                                f10 = 300.0f;
                            } else {
                                f10 = 500.0f;
                            }
                            this.h = (f20 / f10) + f14;
                        }
                        if (this.h > 1.0f) {
                            this.h = 1.0f;
                        }
                        if (this.D == null && !this.d) {
                            f11 = xqVar.getInterpolation(this.h);
                        } else {
                            f11 = this.h;
                        }
                        if (this.d && (f11 == 0.0f || f11 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f11 = 1.0f - f11;
                            if (this.h >= 1.0f) {
                                int i13 = this.f37622i + 1;
                                this.f37622i = i13;
                                if (i13 > 7) {
                                    this.f37622i = 0;
                                }
                                f11 = 1.0f;
                            }
                        }
                        z11 = z9;
                    }
                }
                if (z11) {
                    Utilities.generateGradient(this.f37624k, this.f37622i, f11, this.f37612a);
                } else {
                    int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                    Paint paint = this.f37629p;
                    Bitmap[] bitmapArr = this.f37626m;
                    if (i14 != 0) {
                        int i15 = (int) (f11 / 0.33333334f);
                        if (i15 == 0) {
                            this.f37631r.drawBitmap(this.f37625l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f37631r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f11 - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f37631r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                    } else {
                        this.f37631r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public ra0(boolean z9, int i7, int i10, int i11, int i12) {
        this(i7, i10, i11, i12, z9, 0, false);
    }

    public ra0(int i7, int i10, int i11, int i12, boolean z9, int i13, boolean z10) {
        this.f37612a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f37619e = new xq(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f37623j = new RectF();
        this.f37626m = new Bitmap[3];
        this.f37627n = new Paint(2);
        this.f37628o = new Paint(2);
        this.f37629p = new Paint();
        this.f37630q = 100;
        this.C = new GradientDrawable();
        this.G = new qa0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new ih.a();
        this.W = new ih.a();
        this.f37615b0 = new ih.a();
        if (z10) {
            this.O = 80;
            this.P = 80;
        }
        this.f37621g = z9;
        o(i7, i10, i11, i12, i13, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
