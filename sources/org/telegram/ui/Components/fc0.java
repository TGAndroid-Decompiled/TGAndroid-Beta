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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class fc0 extends Drawable {
    public static final boolean f26865e0;
    public static final boolean f26866f0;
    public Matrix A;
    public boolean B;
    public GradientDrawable C;
    public GenericProvider D;
    public boolean E;
    public boolean F;
    public final Runnable G;
    public PorterDuffColorFilter H;
    public int I;
    public float J;
    public float K;
    public int L;
    public float M;
    public boolean N;
    public final int O;
    public final int P;
    public kc0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final ug.a V;
    public final ug.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f26867a;
    public int f26868a0;
    public long f26869b;
    public final ug.a f26870b0;
    public WeakReference f26871c;
    public Bitmap f26872c0;
    public boolean d;
    public int f26873d0;
    public final pr f26874e;
    public int f26875f;
    public boolean f26876g;
    public float h;
    public int f26877i;
    public final RectF f26878j;
    public Bitmap f26879k;
    public Bitmap f26880l;
    public final Bitmap[] f26881m;
    public final Paint f26882n;
    public final Paint f26883o;
    public final Paint f26884p;
    public int f26885q;
    public Canvas f26886r;
    public Canvas f26887s;
    public boolean f26888t;
    public Bitmap f26889u;
    public BitmapShader v;
    public BitmapShader f26890w;
    public Bitmap f26891x;
    public ImageReceiver f26892y;
    public boolean f26893z;

    static {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 28) {
            z4 = true;
        } else {
            z4 = false;
        }
        f26865e0 = z4;
        if (i10 >= 29) {
            z10 = true;
        }
        f26866f0 = z10;
    }

    public fc0() {
        this.f26867a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f26874e = new pr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f26878j = new RectF();
        this.f26881m = new Bitmap[3];
        this.f26882n = new Paint(2);
        this.f26883o = new Paint(2);
        this.f26884p = new Paint();
        this.f26885q = 100;
        this.C = new GradientDrawable();
        this.G = new ec0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new ug.a();
        this.W = new ug.a();
        this.f26870b0 = new ug.a();
        h();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        boolean j10 = j(i10, i11, i12, i13);
        boolean z4 = f26866f0;
        if (j10) {
            if (!z4) {
                return Integer.MAX_VALUE;
            }
            return -1;
        } else if (!z4) {
            int averageColor = AndroidUtilities.getAverageColor(i12, AndroidUtilities.getAverageColor(i10, i11));
            if (i13 != 0) {
                averageColor = AndroidUtilities.getAverageColor(i13, averageColor);
            }
            return (AndroidUtilities.getPatternColor(averageColor, true) & 16777215) | 1677721600;
        } else {
            return -16777216;
        }
    }

    public static boolean j(int i10, int i11, int i12, int i13) {
        int averageColor = AndroidUtilities.getAverageColor(i10, i11);
        if (i12 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i12);
        }
        if (i13 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i13);
        }
        if (AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2] < 0.3f) {
            return true;
        }
        return false;
    }

    public final void a(Canvas canvas, int i10, float f10, float f11, float f12, float f13) {
        List list = this.R;
        if (list != null && this.f26892y != null && i10 >= 0 && i10 < list.size()) {
            qf.c cVar = (qf.c) this.R.get(i10);
            canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12, f13);
            canvas.concat(cVar.f44835b);
            this.f26892y.setImageCoords(cVar.f44834a);
            this.f26892y.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i10) {
        if (this.R != null && this.f26889u != null) {
            a(canvas, i10, rectF.left, rectF.top, rectF.width() / this.f26889u.getWidth(), rectF.height() / this.f26889u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i10 = -1;
        while (i10 < 3) {
            int i11 = i10 + 1;
            float f10 = i11 / 3.0f;
            if (i10 < 0) {
                bitmap = this.f26880l;
            } else {
                bitmap = this.f26881m[i10];
            }
            Utilities.generateGradient(bitmap, this.f26877i, f10, this.f26867a);
            i10 = i11;
        }
    }

    public final Bitmap d() {
        return this.f26879k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z4;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e6 = e();
        if (e6 != null) {
            i10 = bounds.top;
        } else {
            i10 = this.f26875f;
        }
        float f10 = i10;
        int width = this.f26879k.getWidth();
        int height = this.f26879k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f11 = width;
        float f12 = height;
        float max = Math.max(width2 / f11, height2 / f12);
        float f13 = f11 * max;
        float f14 = f12 * max;
        float f15 = (width2 - f13) / 2.0f;
        float f16 = (height2 - f14) / 2.0f;
        if (this.f26876g) {
            int i11 = bounds.left;
            f15 += i11;
            int i12 = bounds.top;
            f16 += i12;
            canvas.clipRect(i11, i12, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f26879k != null && e6 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i13 = this.f26885q;
        float f17 = 1.0f;
        Paint paint = this.f26882n;
        Paint paint2 = this.f26883o;
        RectF rectF = this.f26878j;
        if (i13 < 0) {
            boolean z10 = f26865e0;
            if (!z4 && (!z10 || e6 == null)) {
                canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
            }
            if (e6 != null) {
                if (z10) {
                    int i14 = (((int) (this.L * this.J)) * (-this.f26885q)) / 100;
                    if (this.f26889u != null) {
                        Bitmap e10 = e();
                        ug.a aVar = this.f26870b0;
                        if (aVar.a(e10) || this.f26872c0 == null || this.f26873d0 != i14) {
                            int width3 = this.f26889u.getWidth();
                            int height3 = this.f26889u.getHeight();
                            this.f26873d0 = i14;
                            Bitmap bitmap = this.f26872c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f26872c0.getHeight() != height3) {
                                this.f26872c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e10, this.f26872c0, i14);
                        }
                        aVar.b(e10);
                    }
                    float width4 = e6.getWidth();
                    float height4 = e6.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f18 = width4 * max2;
                    float f19 = height4 * max2;
                    float f20 = (width2 - f18) / 2.0f;
                    float f21 = (height2 - f19) / 2.0f;
                    rectF.set(f20, f21, f18 + f20, f19 + f21);
                    if (this.f26872c0 != null) {
                        canvas.drawBitmap(this.f26879k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f26872c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f15, f16 + f10);
                    float min = 1.0f / Math.min(this.f26879k.getWidth() / bounds.width(), this.f26879k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e6.getWidth();
                    float height5 = e6.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f22 = (width2 - (width5 * max3)) / 2.0f;
                    float f23 = ((height2 - (height5 * max3)) / 2.0f) + f10;
                    this.A.setTranslate((int) f22, (int) f23);
                    if (!this.f26893z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f17 = max3;
                    }
                    this.f26890w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f26885q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z4) {
                        Paint e11 = this.Q.e(this.f26879k, e6, this.U, (int) (this.L * this.J), this.f26885q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, e11);
                    } else {
                        float f25 = this.I;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                    a(canvas, this.S, f22, f23, f17, f17);
                }
            }
        } else {
            boolean z11 = z4;
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f15, f16);
                float min2 = 1.0f / Math.min(this.f26879k.getWidth() / bounds.width(), this.f26879k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z11) {
                    float f26 = this.I;
                    canvas.drawRoundRect(rectF, f26, f26, paint);
                }
            } else {
                canvas.translate(0.0f, f10);
                GradientDrawable gradientDrawable = this.C;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f15, (int) f16, (int) (f15 + f13), (int) (f16 + f14));
                    this.C.setAlpha((int) (this.K * 255.0f));
                    this.C.draw(canvas);
                } else {
                    rectF.set(f15, f16, f13 + f15, f14 + f16);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * this.K));
                    if (!z11) {
                        canvas.drawBitmap(this.f26879k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e6 != null) {
                float width6 = e6.getWidth();
                float height6 = e6.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f27 = width6 * max4;
                float f28 = height6 * max4;
                float f29 = (width2 - f27) / 2.0f;
                float f30 = (height2 - f28) / 2.0f;
                rectF.set(f29, f30, f27 + f29, f28 + f30);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f26885q) / 100.0f) * this.L * this.J));
                if (z11) {
                    Paint e12 = this.Q.e(this.f26879k, e6, this.U, (int) (this.L * this.J), this.f26885q, canvas.isHardwareAccelerated());
                    kc0 kc0Var = this.Q;
                    RectF rectF2 = kc0Var.f28372j;
                    rectF2.set(0.0f, 0.0f, kc0Var.f28370g, kc0Var.h);
                    Matrix matrix = kc0Var.f28371i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    kc0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e12);
                } else {
                    canvas.drawBitmap(e6, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f26885q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        z();
    }

    public final Bitmap e() {
        boolean z4;
        Bitmap bitmap = this.f26889u;
        if (bitmap == null) {
            return null;
        }
        if (this.f26891x == null) {
            return bitmap;
        }
        ug.a aVar = this.V;
        boolean a2 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f26891x;
        ug.a aVar2 = this.W;
        boolean a10 = aVar2.a(bitmap2);
        boolean z10 = true;
        if (this.f26868a0 != this.S) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!a2 && !a10 && !z4) {
            z10 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z10) {
            return bitmap3;
        }
        int width = this.f26889u.getWidth();
        int height = this.f26889u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f26889u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f26889u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f26889u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i10 = this.S;
        if (this.f26891x != null && this.R != null) {
            for (int i11 = 0; i11 < this.R.size(); i11++) {
                if (i11 != i10) {
                    qf.c cVar = (qf.c) this.R.get(i11);
                    canvas.save();
                    canvas.concat(cVar.f44835b);
                    canvas.drawBitmap(this.f26891x, (Rect) null, cVar.f44834a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f26868a0 = this.S;
        aVar.b(this.f26889u);
        aVar2.b(this.f26891x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f26867a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f26889u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f26889u;
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
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i10 = this.O;
        int i11 = this.P;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        this.f26879k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i12 = 0; i12 < 3; i12++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f26881m[i12] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f26886r = new Canvas(this.f26879k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f26880l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f26887s = new Canvas(this.f26880l);
        Utilities.generateGradient(this.f26879k, this.f26877i, this.f26874e.getInterpolation(this.h), this.f26867a);
        if (f26866f0) {
            this.f26883o.setBlendMode(mh.c3.a());
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f26871c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f26871c.get()).invalidate();
        }
        if (this.f26888t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            z();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f26892y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f26892y;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public final void m(boolean z4) {
        if (this.h < 1.0f) {
            return;
        }
        this.F = true;
        this.h = 0.0f;
        this.E = z4;
        i();
    }

    public final void n(int i10, int i11, int i12, int i13) {
        o(i10, i11, i12, i13, 0, true);
    }

    public final void o(int i10, int i11, int i12, int i13, int i14, boolean z4) {
        if (this.f26876g && i12 == 0 && i13 == 0) {
            this.C = new GradientDrawable(o9.d(i14), new int[]{i10, i11});
        } else {
            this.C = null;
        }
        int[] iArr = this.f26867a;
        if (iArr[0] != i10 || iArr[1] != i11 || iArr[2] != i12 || iArr[3] != i13) {
            iArr[0] = i10;
            iArr[1] = i11;
            iArr[2] = i12;
            iArr[3] = i13;
            Bitmap bitmap = this.f26879k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f26877i, this.f26874e.getInterpolation(this.h), iArr);
                if (z4) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !SharedConfig.fastWallpaperDisabled) {
            this.Q = new kc0();
        }
    }

    public final void q(boolean z4) {
        if (!z4 && this.N) {
            float f10 = this.h;
            this.h = 1.0f - ((f10 - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
            this.d = true;
        }
        this.N = z4;
    }

    public final void r(View view) {
        this.f26871c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f26892y;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void s(float f10) {
        this.J = f10;
        i();
    }

    @Override
    public final void setAlpha(int i10) {
        this.L = i10;
        this.f26882n.setAlpha(i10);
        this.f26883o.setAlpha(i10);
    }

    public final void t(Bitmap bitmap, int i10) {
        this.f26885q = i10;
        this.f26889u = bitmap;
        if (bitmap != null) {
            boolean z4 = f26866f0;
            Paint paint = this.f26883o;
            if (z4) {
                if (i10 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z10 = f26865e0;
            if (i10 < 0) {
                if (!z10) {
                    Bitmap bitmap2 = this.f26879k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f26889u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f26890w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f26893z = true;
                    paint.setShader(new ComposeShader(this.v, this.f26890w, PorterDuff.Mode.DST_IN));
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

    public final void u(int i10) {
        this.U = i10;
        this.H = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void v(int i10) {
        this.f26877i = i10;
        if (i10 < 0) {
            this.f26877i = 0;
        } else if (i10 > 7) {
            this.f26877i = 7;
        }
        Utilities.generateGradient(this.f26879k, this.f26877i, this.f26874e.getInterpolation(this.h), this.f26867a);
    }

    public final void w(int i10) {
        this.I = i10;
        this.A = new Matrix();
        Bitmap bitmap = this.f26879k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f26882n.setShader(bitmapShader);
        i();
    }

    public final void x(boolean z4) {
        if (this.h >= 1.0f && LiteMode.isEnabled(32)) {
            this.F = false;
            this.E = false;
            this.B = z4;
            this.h = 0.0f;
            int i10 = this.f26877i - 1;
            this.f26877i = i10;
            if (i10 < 0) {
                this.f26877i = 7;
            }
            i();
            this.f26887s.drawBitmap(this.f26879k, 0.0f, 0.0f, (Paint) null);
            c();
            return;
        }
        i();
    }

    public final void y() {
        if (this.h < 1.0f) {
            return;
        }
        this.F = false;
        this.B = true;
        this.E = true;
        this.h = 0.0f;
        i();
        Utilities.generateGradient(this.f26880l, this.f26877i, 0.0f, this.f26867a);
        c();
    }

    public final void z() {
        boolean z4;
        float f10;
        float f11;
        char c3;
        float f12;
        float f13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f26869b;
        if (j10 > 20) {
            j10 = 17;
        }
        this.f26869b = elapsedRealtime;
        if (j10 > 1) {
            boolean z10 = this.N;
            if (z10 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f14 = this.h;
            if (f14 < 1.0f) {
                boolean z11 = true;
                if (!this.f26888t && !this.F) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z10) {
                    float f15 = ((((float) j10) / 12000.0f) * this.M) + f14;
                    this.h = f15;
                    if (f15 >= 1.0f) {
                        this.h = 0.0f;
                    }
                    float f16 = this.h;
                    int i10 = (int) (f16 / 0.125f);
                    this.f26877i = i10;
                    f11 = 1.0f - ((f16 - (i10 * 0.125f)) / 0.125f);
                } else {
                    boolean z12 = this.F;
                    pr prVar = this.f26874e;
                    if (z12) {
                        float interpolation = prVar.getInterpolation(f14);
                        if (interpolation <= 0.25f) {
                            c3 = 0;
                        } else if (interpolation <= 0.5f) {
                            c3 = 1;
                        } else if (interpolation <= 0.75f) {
                            c3 = 2;
                        } else {
                            c3 = 3;
                        }
                        GenericProvider genericProvider = this.D;
                        if (genericProvider != null) {
                            this.h = ((Float) genericProvider.provide(this)).floatValue();
                        } else {
                            float f17 = this.h;
                            float f18 = (float) j10;
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
                            f13 = prVar.getInterpolation(this.h);
                        } else {
                            f13 = this.h;
                        }
                        if (this.d && (f13 == 0.0f || f13 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c3 == 0 && f13 > 0.25f) || ((c3 == 1 && f13 > 0.5f) || (c3 == 2 && f13 > 0.75f))) {
                            if (this.E) {
                                int i11 = this.f26877i + 1;
                                this.f26877i = i11;
                                if (i11 > 7) {
                                    this.f26877i = 0;
                                }
                            } else {
                                int i12 = this.f26877i - 1;
                                this.f26877i = i12;
                                if (i12 < 0) {
                                    this.f26877i = 7;
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
                                int i13 = this.f26877i + 1;
                                this.f26877i = i13;
                                if (i13 > 7) {
                                    this.f26877i = 0;
                                }
                                f11 = 1.0f;
                            }
                        } else {
                            f11 = f19;
                        }
                    } else {
                        GenericProvider genericProvider2 = this.D;
                        if (genericProvider2 != null) {
                            this.h = ((Float) genericProvider2.provide(this)).floatValue();
                        } else {
                            float f20 = (float) j10;
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
                            f11 = prVar.getInterpolation(this.h);
                        } else {
                            f11 = this.h;
                        }
                        if (this.d && (f11 == 0.0f || f11 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f11 = 1.0f - f11;
                            if (this.h >= 1.0f) {
                                int i14 = this.f26877i + 1;
                                this.f26877i = i14;
                                if (i14 > 7) {
                                    this.f26877i = 0;
                                }
                                z11 = z4;
                                f11 = 1.0f;
                            }
                        }
                    }
                    z11 = z4;
                }
                if (z11) {
                    Utilities.generateGradient(this.f26879k, this.f26877i, f11, this.f26867a);
                } else {
                    Paint paint = this.f26884p;
                    Bitmap[] bitmapArr = this.f26881m;
                    if (f11 != 1.0f) {
                        int i15 = (int) (f11 / 0.33333334f);
                        if (i15 == 0) {
                            this.f26886r.drawBitmap(this.f26880l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f26886r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f11 - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f26886r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                    } else {
                        this.f26886r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public fc0(boolean z4, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, z4, 0, false);
    }

    public fc0(int i10, int i11, int i12, int i13, boolean z4, int i14, boolean z10) {
        this.f26867a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f26874e = new pr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f26878j = new RectF();
        this.f26881m = new Bitmap[3];
        this.f26882n = new Paint(2);
        this.f26883o = new Paint(2);
        this.f26884p = new Paint();
        this.f26885q = 100;
        this.C = new GradientDrawable();
        this.G = new ec0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new ug.a();
        this.W = new ug.a();
        this.f26870b0 = new ug.a();
        if (z10) {
            this.O = 80;
            this.P = 80;
        }
        this.f26876g = z4;
        o(i10, i11, i12, i13, i14, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
