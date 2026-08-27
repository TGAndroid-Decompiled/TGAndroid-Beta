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

public final class nb0 extends Drawable {

    public static final boolean f30915e0;

    public static final boolean f30916f0;
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
    public sb0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final pg.a V;
    public final pg.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;

    public final int[] f30917a;

    public int f30918a0;

    public long f30919b;

    public final pg.a f30920b0;

    public WeakReference f30921c;

    public Bitmap f30922c0;
    public boolean d;

    public int f30923d0;

    public final er f30924e;

    public int f30925f;

    public boolean f30926g;
    public float h;

    public int f30927i;

    public final RectF f30928j;

    public Bitmap f30929k;

    public Bitmap f30930l;

    public final Bitmap[] f30931m;

    public final Paint f30932n;

    public final Paint f30933o;

    public final Paint f30934p;

    public int f30935q;

    public Canvas f30936r;

    public Canvas f30937s;

    public boolean f30938t;

    public Bitmap f30939u;
    public BitmapShader v;

    public BitmapShader f30940w;

    public Bitmap f30941x;

    public ImageReceiver f30942y;

    public boolean f30943z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f30915e0 = i10 < 28;
        f30916f0 = i10 >= 29;
    }

    public nb0() {
        this.f30917a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f30924e = new er(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f30928j = new RectF();
        this.f30931m = new Bitmap[3];
        this.f30932n = new Paint(2);
        this.f30933o = new Paint(2);
        this.f30934p = new Paint();
        this.f30935q = 100;
        this.C = new GradientDrawable();
        this.G = new mb0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new pg.a();
        this.W = new pg.a();
        this.f30920b0 = new pg.a();
        h();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        boolean zJ = j(i10, i11, i12, i13);
        boolean z10 = f30916f0;
        if (zJ) {
            return !z10 ? Integer.MAX_VALUE : -1;
        }
        if (z10) {
            return -16777216;
        }
        int averageColor = AndroidUtilities.getAverageColor(i12, AndroidUtilities.getAverageColor(i10, i11));
        if (i13 != 0) {
            averageColor = AndroidUtilities.getAverageColor(i13, averageColor);
        }
        return (AndroidUtilities.getPatternColor(averageColor, true) & 16777215) | 1677721600;
    }

    public static boolean j(int i10, int i11, int i12, int i13) {
        int averageColor = AndroidUtilities.getAverageColor(i10, i11);
        if (i12 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i12);
        }
        if (i13 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i13);
        }
        return AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2] < 0.3f;
    }

    public final void a(Canvas canvas, int i10, float f10, float f11, float f12, float f13) {
        List list = this.R;
        if (list == null || this.f30942y == null || i10 < 0 || i10 >= list.size()) {
            return;
        }
        mf.c cVar = (mf.c) this.R.get(i10);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f13);
        canvas.concat(cVar.f18041b);
        this.f30942y.setImageCoords(cVar.f18040a);
        this.f30942y.draw(canvas);
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, int i10) {
        if (this.R == null || this.f30939u == null) {
            return;
        }
        a(canvas, i10, rectF.left, rectF.top, rectF.width() / this.f30939u.getWidth(), rectF.height() / this.f30939u.getHeight());
    }

    public final void c() {
        int i10 = -1;
        while (i10 < 3) {
            int i11 = i10 + 1;
            Utilities.generateGradient(i10 < 0 ? this.f30930l : this.f30931m[i10], this.f30927i, i11 / 3.0f, this.f30917a);
            i10 = i11;
        }
    }

    public final Bitmap d() {
        return this.f30929k;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        Bitmap bitmapE = e();
        float f10 = bitmapE != null ? bounds.top : this.f30925f;
        int width = this.f30929k.getWidth();
        int height = this.f30929k.getHeight();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        float f11 = width;
        float f12 = height;
        float fMax = Math.max(fWidth / f11, fHeight / f12);
        float f13 = f11 * fMax;
        float f14 = f12 * fMax;
        float f15 = (fWidth - f13) / 2.0f;
        float f16 = (fHeight - f14) / 2.0f;
        if (this.f30926g) {
            int i10 = bounds.left;
            f15 += i10;
            int i11 = bounds.top;
            f16 += i11;
            canvas.clipRect(i10, i11, bounds.right, bounds.bottom);
        }
        boolean z10 = (Build.VERSION.SDK_INT < 28 || this.Q == null || this.f30929k == null || bitmapE == null) ? false : true;
        int i12 = this.f30935q;
        float f17 = 1.0f;
        Paint paint = this.f30932n;
        Paint paint2 = this.f30933o;
        RectF rectF = this.f30928j;
        if (i12 < 0) {
            boolean z11 = f30915e0;
            if (!z10 && (!z11 || bitmapE == null)) {
                canvas.drawColor(i0.b.k(-16777216, (int) (this.L * this.K)));
            }
            if (bitmapE != null) {
                if (z11) {
                    int i13 = (((int) (this.L * this.J)) * (-this.f30935q)) / 100;
                    if (this.f30939u != null) {
                        Bitmap bitmapE2 = e();
                        pg.a aVar = this.f30920b0;
                        if (aVar.a(bitmapE2) || this.f30922c0 == null || this.f30923d0 != i13) {
                            int width2 = this.f30939u.getWidth();
                            int height2 = this.f30939u.getHeight();
                            this.f30923d0 = i13;
                            Bitmap bitmap = this.f30922c0;
                            if (bitmap == null || bitmap.getWidth() != width2 || this.f30922c0.getHeight() != height2) {
                                this.f30922c0 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(bitmapE2, this.f30922c0, i13);
                        }
                        aVar.b(bitmapE2);
                    }
                    float width3 = bitmapE.getWidth();
                    float height3 = bitmapE.getHeight();
                    float fMax2 = Math.max(fWidth / width3, fHeight / height3);
                    float f18 = width3 * fMax2;
                    float f19 = height3 * fMax2;
                    float f20 = (fWidth - f18) / 2.0f;
                    float f21 = (fHeight - f19) / 2.0f;
                    rectF.set(f20, f21, f18 + f20, f19 + f21);
                    if (this.f30922c0 != null) {
                        canvas.drawBitmap(this.f30929k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f30922c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.b.k(-16777216, (int) (this.L * this.K)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f15, f16 + f10);
                    float fMin = 1.0f / Math.min(this.f30929k.getWidth() / bounds.width(), this.f30929k.getHeight() / bounds.height());
                    this.A.preScale(fMin, fMin);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width4 = bitmapE.getWidth();
                    float height4 = bitmapE.getHeight();
                    float fMax3 = Math.max(fWidth / width4, fHeight / height4);
                    float f22 = (fWidth - (width4 * fMax3)) / 2.0f;
                    float f23 = ((fHeight - (height4 * fMax3)) / 2.0f) + f10;
                    this.A.setTranslate((int) f22, (int) f23);
                    if (!this.f30943z || fMax3 > 1.4f || fMax3 < 0.8f) {
                        this.A.preScale(fMax3, fMax3);
                        f17 = fMax3;
                    }
                    this.f30940w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f30935q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z10) {
                        Paint paintE = this.Q.e(this.f30929k, bitmapE, this.U, (int) (this.L * this.J), this.f30935q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, paintE);
                    } else {
                        float f25 = this.I;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                    a(canvas, this.S, f22, f23, f17, f17);
                }
            }
        } else {
            boolean z12 = z10;
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f15, f16);
                float fMin2 = 1.0f / Math.min(this.f30929k.getWidth() / bounds.width(), this.f30929k.getHeight() / bounds.height());
                this.A.preScale(fMin2, fMin2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z12) {
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
                    if (!z12) {
                        canvas.drawBitmap(this.f30929k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (bitmapE != null) {
                float width5 = bitmapE.getWidth();
                float height5 = bitmapE.getHeight();
                float fMax4 = Math.max(fWidth / width5, fHeight / height5);
                float f27 = width5 * fMax4;
                float f28 = height5 * fMax4;
                float f29 = (fWidth - f27) / 2.0f;
                float f30 = (fHeight - f28) / 2.0f;
                rectF.set(f29, f30, f27 + f29, f28 + f30);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f30935q) / 100.0f) * this.L * this.J));
                if (z12) {
                    Paint paintE2 = this.Q.e(this.f30929k, bitmapE, this.U, (int) (this.L * this.J), this.f30935q, canvas.isHardwareAccelerated());
                    sb0 sb0Var = this.Q;
                    RectF rectF2 = sb0Var.f32386j;
                    rectF2.set(0.0f, 0.0f, sb0Var.f32384g, sb0Var.h);
                    Matrix matrix = sb0Var.f32385i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    sb0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, paintE2);
                } else {
                    canvas.drawBitmap(bitmapE, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f30935q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        z();
    }

    public final Bitmap e() {
        Bitmap bitmap = this.f30939u;
        if (bitmap == null) {
            return null;
        }
        if (this.f30941x == null) {
            return bitmap;
        }
        pg.a aVar = this.V;
        boolean zA = aVar.a(bitmap);
        Bitmap bitmap2 = this.f30941x;
        pg.a aVar2 = this.W;
        boolean zA2 = aVar2.a(bitmap2);
        boolean z10 = true;
        boolean z11 = this.f30918a0 != this.S;
        if (!zA && !zA2 && !z11) {
            z10 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z10) {
            return bitmap3;
        }
        int width = this.f30939u.getWidth();
        int height = this.f30939u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f30939u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f30939u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f30939u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i10 = this.S;
        if (this.f30941x != null && this.R != null) {
            for (int i11 = 0; i11 < this.R.size(); i11++) {
                if (i11 != i10) {
                    mf.c cVar = (mf.c) this.R.get(i11);
                    canvas.save();
                    canvas.concat(cVar.f18041b);
                    canvas.drawBitmap(this.f30941x, (Rect) null, cVar.f18040a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f30918a0 = this.S;
        aVar.b(this.f30939u);
        aVar2.b(this.f30941x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f30917a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f30939u;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f30939u;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i10 = this.O;
        int i11 = this.P;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        this.f30929k = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(false);
        for (int i12 = 0; i12 < 3; i12++) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f30931m[i12] = bitmapCreateBitmap2;
            bitmapCreateBitmap2.setHasAlpha(false);
        }
        this.f30936r = new Canvas(this.f30929k);
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f30930l = bitmapCreateBitmap3;
        bitmapCreateBitmap3.setHasAlpha(false);
        this.f30937s = new Canvas(this.f30930l);
        Utilities.generateGradient(this.f30929k, this.f30927i, this.f30924e.getInterpolation(this.h), this.f30917a);
        if (f30916f0) {
            this.f30933o.setBlendMode(BlendMode.SOFT_LIGHT);
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f30921c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f30921c.get()).invalidate();
        }
        if (this.f30938t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            z();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f30942y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f30942y;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
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

    public final void n(int i10, int i11, int i12, int i13) {
        o(i10, i11, i12, i13, 0, true);
    }

    public final void o(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        if (this.f30926g && i12 == 0 && i13 == 0) {
            this.C = new GradientDrawable(m9.d(i14), new int[]{i10, i11});
        } else {
            this.C = null;
        }
        int[] iArr = this.f30917a;
        if (iArr[0] == i10 && iArr[1] == i11 && iArr[2] == i12 && iArr[3] == i13) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        Bitmap bitmap = this.f30929k;
        if (bitmap != null) {
            Utilities.generateGradient(bitmap, this.f30927i, this.f30924e.getInterpolation(this.h), iArr);
            if (z10) {
                i();
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT < 28 || this.Q != null || SharedConfig.fastWallpaperDisabled) {
            return;
        }
        this.Q = new sb0();
    }

    public final void q(boolean z10) {
        if (!z10 && this.N) {
            float f10 = this.h;
            this.h = 1.0f - ((f10 - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
            this.d = true;
        }
        this.N = z10;
    }

    public final void r(View view) {
        this.f30921c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f30942y;
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
        this.f30932n.setAlpha(i10);
        this.f30933o.setAlpha(i10);
    }

    public final void t(Bitmap bitmap, int i10) {
        this.f30935q = i10;
        this.f30939u = bitmap;
        if (bitmap == null) {
            return;
        }
        boolean z10 = f30916f0;
        Paint paint = this.f30933o;
        if (z10) {
            if (i10 >= 0) {
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
            } else {
                paint.setBlendMode(null);
            }
        }
        boolean z11 = f30915e0;
        if (i10 >= 0) {
            if (z11) {
                paint.setXfermode(null);
            }
        } else {
            if (z11) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                return;
            }
            Bitmap bitmap2 = this.f30929k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.v = new BitmapShader(bitmap2, tileMode, tileMode);
            Bitmap bitmap3 = this.f30939u;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            this.f30940w = new BitmapShader(bitmap3, tileMode2, tileMode2);
            this.f30943z = true;
            paint.setShader(new ComposeShader(this.v, this.f30940w, PorterDuff.Mode.DST_IN));
            paint.setFilterBitmap(true);
            this.A = new Matrix();
        }
    }

    public final void u(int i10) {
        this.U = i10;
        this.H = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void v(int i10) {
        this.f30927i = i10;
        if (i10 < 0) {
            this.f30927i = 0;
        } else if (i10 > 7) {
            this.f30927i = 7;
        }
        Utilities.generateGradient(this.f30929k, this.f30927i, this.f30924e.getInterpolation(this.h), this.f30917a);
    }

    public final void w(int i10) {
        this.I = i10;
        this.A = new Matrix();
        Bitmap bitmap = this.f30929k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f30932n.setShader(bitmapShader);
        i();
    }

    public final void x(boolean z10) {
        if (this.h < 1.0f || !LiteMode.isEnabled(32)) {
            i();
            return;
        }
        this.F = false;
        this.E = false;
        this.B = z10;
        this.h = 0.0f;
        int i10 = this.f30927i - 1;
        this.f30927i = i10;
        if (i10 < 0) {
            this.f30927i = 7;
        }
        i();
        this.f30937s.drawBitmap(this.f30929k, 0.0f, 0.0f, (Paint) null);
        c();
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
        Utilities.generateGradient(this.f30930l, this.f30927i, 0.0f, this.f30917a);
        c();
    }

    public final void z() {
        float interpolation;
        char c10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f30919b;
        if (j10 > 20) {
            j10 = 17;
        }
        this.f30919b = jElapsedRealtime;
        if (j10 <= 1) {
            return;
        }
        boolean z10 = this.N;
        if (z10 && this.h == 1.0f) {
            this.h = 0.0f;
        }
        float f10 = this.h;
        if (f10 < 1.0f) {
            boolean z11 = true;
            boolean z12 = this.f30938t || this.F;
            if (z10) {
                float f11 = ((j10 / 12000.0f) * this.M) + f10;
                this.h = f11;
                if (f11 >= 1.0f) {
                    this.h = 0.0f;
                }
                float f12 = this.h;
                int i10 = (int) (f12 / 0.125f);
                this.f30927i = i10;
                interpolation = 1.0f - ((f12 - (i10 * 0.125f)) / 0.125f);
            } else {
                boolean z13 = this.F;
                er erVar = this.f30924e;
                if (z13) {
                    float interpolation2 = erVar.getInterpolation(f10);
                    if (interpolation2 <= 0.25f) {
                        c10 = 0;
                    } else if (interpolation2 <= 0.5f) {
                        c10 = 1;
                    } else {
                        c10 = interpolation2 <= 0.75f ? (char) 2 : (char) 3;
                    }
                    GenericProvider genericProvider = this.D;
                    if (genericProvider != null) {
                        this.h = ((Float) genericProvider.provide(this)).floatValue();
                    } else {
                        this.h = (j10 / (this.E ? 1000.0f : 2000.0f)) + this.h;
                    }
                    if (this.h > 1.0f) {
                        this.h = 1.0f;
                    }
                    float interpolation3 = (this.D != null || this.d) ? this.h : erVar.getInterpolation(this.h);
                    if (this.d && (interpolation3 == 0.0f || interpolation3 == 1.0f)) {
                        this.d = false;
                    }
                    if ((c10 == 0 && interpolation3 > 0.25f) || ((c10 == 1 && interpolation3 > 0.5f) || (c10 == 2 && interpolation3 > 0.75f))) {
                        if (this.E) {
                            int i11 = this.f30927i + 1;
                            this.f30927i = i11;
                            if (i11 > 7) {
                                this.f30927i = 0;
                            }
                        } else {
                            int i12 = this.f30927i - 1;
                            this.f30927i = i12;
                            if (i12 < 0) {
                                this.f30927i = 7;
                            }
                        }
                    }
                    if (interpolation3 > 0.25f) {
                        if (interpolation3 <= 0.5f) {
                            interpolation3 -= 0.25f;
                        } else {
                            interpolation3 = interpolation3 <= 0.75f ? interpolation3 - 0.5f : interpolation3 - 0.75f;
                        }
                    }
                    float f13 = interpolation3 / 0.25f;
                    if (this.E) {
                        interpolation = 1.0f - f13;
                        if (this.h >= 1.0f) {
                            int i13 = this.f30927i + 1;
                            this.f30927i = i13;
                            if (i13 > 7) {
                                this.f30927i = 0;
                            }
                            interpolation = 1.0f;
                        }
                    } else {
                        interpolation = f13;
                    }
                } else {
                    GenericProvider genericProvider2 = this.D;
                    if (genericProvider2 != null) {
                        this.h = ((Float) genericProvider2.provide(this)).floatValue();
                    } else {
                        this.h = (j10 / (this.B ? 300.0f : 500.0f)) + f10;
                    }
                    if (this.h > 1.0f) {
                        this.h = 1.0f;
                    }
                    interpolation = (this.D != null || this.d) ? this.h : erVar.getInterpolation(this.h);
                    if (this.d && (interpolation == 0.0f || interpolation == 1.0f)) {
                        this.d = false;
                    }
                    if (this.E) {
                        interpolation = 1.0f - interpolation;
                        if (this.h >= 1.0f) {
                            int i14 = this.f30927i + 1;
                            this.f30927i = i14;
                            if (i14 > 7) {
                                this.f30927i = 0;
                            }
                            z11 = z12;
                            interpolation = 1.0f;
                        }
                    }
                }
                z11 = z12;
            }
            if (z11) {
                Utilities.generateGradient(this.f30929k, this.f30927i, interpolation, this.f30917a);
            } else {
                Paint paint = this.f30934p;
                Bitmap[] bitmapArr = this.f30931m;
                if (interpolation != 1.0f) {
                    int i15 = (int) (interpolation / 0.33333334f);
                    if (i15 == 0) {
                        this.f30936r.drawBitmap(this.f30930l, 0.0f, 0.0f, (Paint) null);
                    } else {
                        this.f30936r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                    }
                    paint.setAlpha((int) (((interpolation - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                    this.f30936r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                } else {
                    this.f30936r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                }
            }
            i();
        }
    }

    public nb0(boolean z10, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, z10, 0, false);
    }

    public nb0(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f30917a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f30924e = new er(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f30928j = new RectF();
        this.f30931m = new Bitmap[3];
        this.f30932n = new Paint(2);
        this.f30933o = new Paint(2);
        this.f30934p = new Paint();
        this.f30935q = 100;
        this.C = new GradientDrawable();
        this.G = new mb0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new pg.a();
        this.W = new pg.a();
        this.f30920b0 = new pg.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.f30926g = z10;
        o(i10, i11, i12, i13, i14, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
