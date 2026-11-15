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
    public static final boolean f38912e0;
    public static final boolean f38913f0;
    public Matrix A;
    public boolean B;
    public GradientDrawable C;
    public org.telegram.messenger.j9 D;
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
    public va0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final ih.a V;
    public final ih.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f38914a;
    public int f38915a0;
    public long f38916b;
    public final ih.a f38917b0;
    public WeakReference f38918c;
    public Bitmap f38919c0;
    public boolean d;
    public int f38920d0;
    public final er f38921e;
    public int f38922f;
    public boolean f38923g;
    public float h;
    public int f38924i;
    public final RectF f38925j;
    public Bitmap f38926k;
    public Bitmap f38927l;
    public final Bitmap[] f38928m;
    public final Paint f38929n;
    public final Paint f38930o;
    public final Paint f38931p;
    public int f38932q;
    public Canvas f38933r;
    public Canvas f38934s;
    public boolean f38935t;
    public Bitmap f38936u;
    public BitmapShader v;
    public BitmapShader f38937w;
    public Bitmap f38938x;
    public ImageReceiver f38939y;
    public boolean f38940z;

    static {
        boolean z10;
        int i7 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i7 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f38912e0 = z10;
        if (i7 >= 29) {
            z11 = true;
        }
        f38913f0 = z11;
    }

    public ra0() {
        this.f38914a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f38921e = new er(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f38925j = new RectF();
        this.f38928m = new Bitmap[3];
        this.f38929n = new Paint(2);
        this.f38930o = new Paint(2);
        this.f38931p = new Paint();
        this.f38932q = 100;
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
        this.f38917b0 = new ih.a();
        h();
    }

    public static int g(int i7, int i10, int i11, int i12) {
        boolean j3 = j(i7, i10, i11, i12);
        boolean z10 = f38913f0;
        if (j3) {
            if (!z10) {
                return Integer.MAX_VALUE;
            }
            return -1;
        } else if (!z10) {
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
        if (list != null && this.f38939y != null && i7 >= 0 && i7 < list.size()) {
            gg.c cVar = (gg.c) this.R.get(i7);
            canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12, f13);
            canvas.concat(cVar.f13299b);
            this.f38939y.A0(cVar.f13298a);
            this.f38939y.h(canvas, null);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i7) {
        if (this.R != null && this.f38936u != null) {
            a(canvas, i7, rectF.left, rectF.top, rectF.width() / this.f38936u.getWidth(), rectF.height() / this.f38936u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i7 = -1;
        while (i7 < 3) {
            int i10 = i7 + 1;
            float f10 = i10 / 3.0f;
            if (i7 < 0) {
                bitmap = this.f38927l;
            } else {
                bitmap = this.f38928m[i7];
            }
            Utilities.generateGradient(bitmap, this.f38924i, f10, this.f38914a);
            i7 = i10;
        }
    }

    public final Bitmap d() {
        return this.f38926k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean z10;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e10 = e();
        if (e10 != null) {
            i7 = bounds.top;
        } else {
            i7 = this.f38922f;
        }
        float f10 = i7;
        int width = this.f38926k.getWidth();
        int height = this.f38926k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f11 = width;
        float f12 = height;
        float max = Math.max(width2 / f11, height2 / f12);
        float f13 = f11 * max;
        float f14 = f12 * max;
        float f15 = (width2 - f13) / 2.0f;
        float f16 = (height2 - f14) / 2.0f;
        if (this.f38923g) {
            int i10 = bounds.left;
            f15 += i10;
            int i11 = bounds.top;
            f16 += i11;
            canvas.clipRect(i10, i11, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f38926k != null && e10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = this.f38932q;
        float f17 = 1.0f;
        Paint paint = this.f38929n;
        float f18 = this.K;
        Paint paint2 = this.f38930o;
        boolean z11 = z10;
        RectF rectF = this.f38925j;
        if (i12 < 0) {
            boolean z12 = f38912e0;
            if (!z11 && (!z12 || e10 == null)) {
                canvas.drawColor(i0.a.o(-16777216, (int) (this.L * f18)));
            }
            if (e10 != null) {
                if (z12) {
                    int i13 = (((int) (this.L * this.J)) * (-this.f38932q)) / 100;
                    if (this.f38936u != null) {
                        Bitmap e11 = e();
                        ih.a aVar = this.f38917b0;
                        if (aVar.a(e11) || this.f38919c0 == null || this.f38920d0 != i13) {
                            int width3 = this.f38936u.getWidth();
                            int height3 = this.f38936u.getHeight();
                            this.f38920d0 = i13;
                            Bitmap bitmap = this.f38919c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f38919c0.getHeight() != height3) {
                                this.f38919c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e11, this.f38919c0, i13);
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
                    if (this.f38919c0 != null) {
                        canvas.drawBitmap(this.f38926k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f38919c0, (Rect) null, rectF, paint);
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
                    float min = 1.0f / Math.min(this.f38926k.getWidth() / bounds.width(), this.f38926k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e10.getWidth();
                    float height5 = e10.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f23 = (width2 - (width5 * max3)) / 2.0f;
                    float f24 = ((height2 - (height5 * max3)) / 2.0f) + f10;
                    this.A.setTranslate((int) f23, (int) f24);
                    if (!this.f38940z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f17 = max3;
                    }
                    this.f38937w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f38932q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z11) {
                        Paint e12 = this.Q.e(this.f38926k, e10, this.U, (int) (this.L * this.J), this.f38932q, canvas.isHardwareAccelerated());
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
                float min2 = 1.0f / Math.min(this.f38926k.getWidth() / bounds.width(), this.f38926k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z11) {
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
                    if (!z11) {
                        canvas.drawBitmap(this.f38926k, (Rect) null, rectF, paint);
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
                paint2.setAlpha((int) ((Math.abs(this.f38932q) / 100.0f) * this.L * this.J));
                if (z11) {
                    Paint e13 = this.Q.e(this.f38926k, e10, this.U, (int) (this.L * this.J), this.f38932q, canvas.isHardwareAccelerated());
                    va0 va0Var = this.Q;
                    RectF rectF2 = va0Var.f40367j;
                    rectF2.set(0.0f, 0.0f, va0Var.f40365g, va0Var.h);
                    Matrix matrix = va0Var.f40366i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    va0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e13);
                } else {
                    canvas.drawBitmap(e10, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f38932q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        y();
    }

    public final Bitmap e() {
        boolean z10;
        Bitmap bitmap = this.f38936u;
        if (bitmap == null) {
            return null;
        }
        if (this.f38938x == null) {
            return bitmap;
        }
        ih.a aVar = this.V;
        boolean a10 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f38938x;
        ih.a aVar2 = this.W;
        boolean a11 = aVar2.a(bitmap2);
        boolean z11 = true;
        if (this.f38915a0 != this.S) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a10 && !a11 && !z10) {
            z11 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z11) {
            return bitmap3;
        }
        int width = this.f38936u.getWidth();
        int height = this.f38936u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f38936u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f38936u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f38936u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i7 = this.S;
        if (this.f38938x != null && this.R != null) {
            for (int i10 = 0; i10 < this.R.size(); i10++) {
                if (i10 != i7) {
                    gg.c cVar = (gg.c) this.R.get(i10);
                    canvas.save();
                    canvas.concat(cVar.f13299b);
                    canvas.drawBitmap(this.f38938x, (Rect) null, cVar.f13298a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f38915a0 = this.S;
        aVar.b(this.f38936u);
        aVar2.b(this.f38938x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f38914a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f38936u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f38936u;
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
        this.f38926k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i11 = 0; i11 < 3; i11++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            this.f38928m[i11] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f38933r = new Canvas(this.f38926k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
        this.f38927l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f38934s = new Canvas(this.f38927l);
        Utilities.generateGradient(this.f38926k, this.f38924i, this.f38921e.getInterpolation(this.h), this.f38914a);
        if (f38913f0) {
            Paint paint = this.f38930o;
            blendMode = BlendMode.SOFT_LIGHT;
            paint.setBlendMode(blendMode);
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f38918c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f38918c.get()).invalidate();
        }
        if (this.f38935t) {
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25519j4, new Object[0]);
            y();
            Runnable runnable = this.G;
            org.telegram.messenger.g0.r(runnable);
            org.telegram.messenger.g0.i3(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f38939y;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f38939y;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    public final void m(boolean z10) {
        if (this.h < 1.0f) {
            return;
        }
        this.F = true;
        this.h = 0.0f;
        this.E = z10;
        i();
    }

    public final void n(int i7, int i10, int i11, int i12) {
        o(i7, i10, i11, i12, 0, true);
    }

    public final void o(int i7, int i10, int i11, int i12, int i13, boolean z10) {
        if (this.f38923g && i11 == 0 && i12 == 0) {
            this.C = new GradientDrawable(h9.d(i13), new int[]{i7, i10});
        } else {
            this.C = null;
        }
        int[] iArr = this.f38914a;
        if (iArr[0] != i7 || iArr[1] != i10 || iArr[2] != i11 || iArr[3] != i12) {
            iArr[0] = i7;
            iArr[1] = i10;
            iArr[2] = i11;
            iArr[3] = i12;
            Bitmap bitmap = this.f38926k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f38924i, this.f38921e.getInterpolation(this.h), iArr);
                if (z10) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !org.telegram.messenger.gz.f23966o) {
            this.Q = new va0();
        }
    }

    public final void q(View view) {
        this.f38918c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f38939y;
        if (imageReceiver != null) {
            imageReceiver.H0(view);
        }
    }

    public final void r(float f10) {
        this.J = f10;
        i();
    }

    public final void s(int i7, Bitmap bitmap) {
        this.f38932q = i7;
        this.f38936u = bitmap;
        if (bitmap != null) {
            boolean z10 = f38913f0;
            Paint paint = this.f38930o;
            if (z10) {
                if (i7 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z11 = f38912e0;
            if (i7 < 0) {
                if (!z11) {
                    Bitmap bitmap2 = this.f38926k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f38936u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f38937w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f38940z = true;
                    paint.setShader(new ComposeShader(this.v, this.f38937w, PorterDuff.Mode.DST_IN));
                    paint.setFilterBitmap(true);
                    this.A = new Matrix();
                    return;
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            } else if (z11) {
                paint.setXfermode(null);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.L = i7;
        this.f38929n.setAlpha(i7);
        this.f38930o.setAlpha(i7);
    }

    public final void t(int i7) {
        this.U = i7;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void u(int i7) {
        this.f38924i = i7;
        if (i7 < 0) {
            this.f38924i = 0;
        } else if (i7 > 7) {
            this.f38924i = 7;
        }
        Utilities.generateGradient(this.f38926k, this.f38924i, this.f38921e.getInterpolation(this.h), this.f38914a);
    }

    public final void v(int i7) {
        this.I = i7;
        this.A = new Matrix();
        Bitmap bitmap = this.f38926k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f38929n.setShader(bitmapShader);
        i();
    }

    public final void w(boolean z10) {
        if (this.h >= 1.0f && org.telegram.messenger.qc.e(32)) {
            this.F = false;
            this.E = false;
            this.B = z10;
            this.h = 0.0f;
            int i7 = this.f38924i - 1;
            this.f38924i = i7;
            if (i7 < 0) {
                this.f38924i = 7;
            }
            i();
            this.f38934s.drawBitmap(this.f38926k, 0.0f, 0.0f, (Paint) null);
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
        Utilities.generateGradient(this.f38927l, this.f38924i, 0.0f, this.f38914a);
        c();
    }

    public final void y() {
        boolean z10;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f38916b;
        if (j3 > 20) {
            j3 = 17;
        }
        this.f38916b = elapsedRealtime;
        if (j3 > 1) {
            boolean z11 = this.N;
            if (z11 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f14 = this.h;
            if (f14 < 1.0f) {
                boolean z12 = true;
                if (!this.f38935t && !this.F) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z11) {
                    float f15 = ((((float) j3) / 12000.0f) * this.M) + f14;
                    this.h = f15;
                    if (f15 >= 1.0f) {
                        this.h = 0.0f;
                    }
                    float f16 = this.h;
                    int i7 = (int) (f16 / 0.125f);
                    this.f38924i = i7;
                    f11 = 1.0f - ((f16 - (i7 * 0.125f)) / 0.125f);
                } else {
                    boolean z13 = this.F;
                    er erVar = this.f38921e;
                    if (z13) {
                        float interpolation = erVar.getInterpolation(f14);
                        if (interpolation <= 0.25f) {
                            c10 = 0;
                        } else if (interpolation <= 0.5f) {
                            c10 = 1;
                        } else if (interpolation <= 0.75f) {
                            c10 = 2;
                        } else {
                            c10 = 3;
                        }
                        org.telegram.messenger.j9 j9Var = this.D;
                        if (j9Var != null) {
                            this.h = ((Float) j9Var.o(this)).floatValue();
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
                            f13 = erVar.getInterpolation(this.h);
                        } else {
                            f13 = this.h;
                        }
                        if (this.d && (f13 == 0.0f || f13 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c10 == 0 && f13 > 0.25f) || ((c10 == 1 && f13 > 0.5f) || (c10 == 2 && f13 > 0.75f))) {
                            if (this.E) {
                                int i10 = this.f38924i + 1;
                                this.f38924i = i10;
                                if (i10 > 7) {
                                    this.f38924i = 0;
                                }
                            } else {
                                int i11 = this.f38924i - 1;
                                this.f38924i = i11;
                                if (i11 < 0) {
                                    this.f38924i = 7;
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
                                int i12 = this.f38924i + 1;
                                this.f38924i = i12;
                                if (i12 > 7) {
                                    this.f38924i = 0;
                                }
                                f11 = 1.0f;
                            }
                        } else {
                            f11 = f19;
                        }
                        z12 = z10;
                    } else {
                        org.telegram.messenger.j9 j9Var2 = this.D;
                        if (j9Var2 != null) {
                            this.h = ((Float) j9Var2.o(this)).floatValue();
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
                            f11 = erVar.getInterpolation(this.h);
                        } else {
                            f11 = this.h;
                        }
                        if (this.d && (f11 == 0.0f || f11 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f11 = 1.0f - f11;
                            if (this.h >= 1.0f) {
                                int i13 = this.f38924i + 1;
                                this.f38924i = i13;
                                if (i13 > 7) {
                                    this.f38924i = 0;
                                }
                                f11 = 1.0f;
                            }
                        }
                        z12 = z10;
                    }
                }
                if (z12) {
                    Utilities.generateGradient(this.f38926k, this.f38924i, f11, this.f38914a);
                } else {
                    int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                    Paint paint = this.f38931p;
                    Bitmap[] bitmapArr = this.f38928m;
                    if (i14 != 0) {
                        int i15 = (int) (f11 / 0.33333334f);
                        if (i15 == 0) {
                            this.f38933r.drawBitmap(this.f38927l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f38933r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f11 - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f38933r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                    } else {
                        this.f38933r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public ra0(boolean z10, int i7, int i10, int i11, int i12) {
        this(i7, i10, i11, i12, z10, 0, false);
    }

    public ra0(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f38914a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f38921e = new er(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f38925j = new RectF();
        this.f38928m = new Bitmap[3];
        this.f38929n = new Paint(2);
        this.f38930o = new Paint(2);
        this.f38931p = new Paint();
        this.f38932q = 100;
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
        this.f38917b0 = new ih.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.f38923g = z10;
        o(i7, i10, i11, i12, i13, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
