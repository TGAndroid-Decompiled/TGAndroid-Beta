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
public final class jb0 extends Drawable {
    public static final boolean f29684e0;
    public static final boolean f29685f0;
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
    public ob0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final og.a V;
    public final og.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f29686a;
    public int f29687a0;
    public long f29688b;
    public final og.a f29689b0;
    public WeakReference f29690c;
    public Bitmap f29691c0;
    public boolean d;
    public int f29692d0;
    public final gr f29693e;
    public int f29694f;
    public boolean f29695g;
    public float h;
    public int f29696i;
    public final RectF f29697j;
    public Bitmap f29698k;
    public Bitmap f29699l;
    public final Bitmap[] f29700m;
    public final Paint f29701n;
    public final Paint f29702o;
    public final Paint f29703p;
    public int f29704q;
    public Canvas f29705r;
    public Canvas f29706s;
    public boolean f29707t;
    public Bitmap f29708u;
    public BitmapShader v;
    public BitmapShader f29709w;
    public Bitmap f29710x;
    public ImageReceiver f29711y;
    public boolean f29712z;

    static {
        boolean z10;
        int i9 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i9 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f29684e0 = z10;
        if (i9 >= 29) {
            z11 = true;
        }
        f29685f0 = z11;
    }

    public jb0() {
        this.f29686a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f29693e = new gr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f29697j = new RectF();
        this.f29700m = new Bitmap[3];
        this.f29701n = new Paint(2);
        this.f29702o = new Paint(2);
        this.f29703p = new Paint();
        this.f29704q = 100;
        this.C = new GradientDrawable();
        this.G = new ib0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new og.a();
        this.W = new og.a();
        this.f29689b0 = new og.a();
        h();
    }

    public static int g(int i9, int i10, int i11, int i12) {
        boolean j10 = j(i9, i10, i11, i12);
        boolean z10 = f29685f0;
        if (j10) {
            if (!z10) {
                return Integer.MAX_VALUE;
            }
            return -1;
        } else if (!z10) {
            int averageColor = AndroidUtilities.getAverageColor(i11, AndroidUtilities.getAverageColor(i9, i10));
            if (i12 != 0) {
                averageColor = AndroidUtilities.getAverageColor(i12, averageColor);
            }
            return (AndroidUtilities.getPatternColor(averageColor, true) & 16777215) | 1677721600;
        } else {
            return -16777216;
        }
    }

    public static boolean j(int i9, int i10, int i11, int i12) {
        int averageColor = AndroidUtilities.getAverageColor(i9, i10);
        if (i11 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i11);
        }
        if (i12 != 0) {
            averageColor = AndroidUtilities.getAverageColor(averageColor, i12);
        }
        if (AndroidUtilities.RGBtoHSB(Color.red(averageColor), Color.green(averageColor), Color.blue(averageColor))[2] < 0.3f) {
            return true;
        }
        return false;
    }

    public final void a(Canvas canvas, int i9, float f10, float f11, float f12, float f13) {
        List list = this.R;
        if (list != null && this.f29711y != null && i9 >= 0 && i9 < list.size()) {
            lf.c cVar = (lf.c) this.R.get(i9);
            canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12, f13);
            canvas.concat(cVar.f16857b);
            this.f29711y.setImageCoords(cVar.f16856a);
            this.f29711y.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i9) {
        if (this.R != null && this.f29708u != null) {
            a(canvas, i9, rectF.left, rectF.top, rectF.width() / this.f29708u.getWidth(), rectF.height() / this.f29708u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i9 = -1;
        while (i9 < 3) {
            int i10 = i9 + 1;
            float f10 = i10 / 3.0f;
            if (i9 < 0) {
                bitmap = this.f29699l;
            } else {
                bitmap = this.f29700m[i9];
            }
            Utilities.generateGradient(bitmap, this.f29696i, f10, this.f29686a);
            i9 = i10;
        }
    }

    public final Bitmap d() {
        return this.f29698k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        boolean z10;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e10 = e();
        if (e10 != null) {
            i9 = bounds.top;
        } else {
            i9 = this.f29694f;
        }
        float f10 = i9;
        int width = this.f29698k.getWidth();
        int height = this.f29698k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f11 = width;
        float f12 = height;
        float max = Math.max(width2 / f11, height2 / f12);
        float f13 = f11 * max;
        float f14 = f12 * max;
        float f15 = (width2 - f13) / 2.0f;
        float f16 = (height2 - f14) / 2.0f;
        if (this.f29695g) {
            int i10 = bounds.left;
            f15 += i10;
            int i11 = bounds.top;
            f16 += i11;
            canvas.clipRect(i10, i11, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f29698k != null && e10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = this.f29704q;
        float f17 = 1.0f;
        Paint paint = this.f29701n;
        Paint paint2 = this.f29702o;
        RectF rectF = this.f29697j;
        if (i12 < 0) {
            boolean z11 = f29684e0;
            if (!z10 && (!z11 || e10 == null)) {
                canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
            }
            if (e10 != null) {
                if (z11) {
                    int i13 = (((int) (this.L * this.J)) * (-this.f29704q)) / 100;
                    if (this.f29708u != null) {
                        Bitmap e11 = e();
                        og.a aVar = this.f29689b0;
                        if (aVar.a(e11) || this.f29691c0 == null || this.f29692d0 != i13) {
                            int width3 = this.f29708u.getWidth();
                            int height3 = this.f29708u.getHeight();
                            this.f29692d0 = i13;
                            Bitmap bitmap = this.f29691c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f29691c0.getHeight() != height3) {
                                this.f29691c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e11, this.f29691c0, i13);
                        }
                        aVar.b(e11);
                    }
                    float width4 = e10.getWidth();
                    float height4 = e10.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f18 = width4 * max2;
                    float f19 = height4 * max2;
                    float f20 = (width2 - f18) / 2.0f;
                    float f21 = (height2 - f19) / 2.0f;
                    rectF.set(f20, f21, f18 + f20, f19 + f21);
                    if (this.f29691c0 != null) {
                        canvas.drawBitmap(this.f29698k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f29691c0, (Rect) null, rectF, paint);
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
                    float min = 1.0f / Math.min(this.f29698k.getWidth() / bounds.width(), this.f29698k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e10.getWidth();
                    float height5 = e10.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f22 = (width2 - (width5 * max3)) / 2.0f;
                    float f23 = ((height2 - (height5 * max3)) / 2.0f) + f10;
                    this.A.setTranslate((int) f22, (int) f23);
                    if (!this.f29712z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f17 = max3;
                    }
                    this.f29709w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f29704q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z10) {
                        Paint e12 = this.Q.e(this.f29698k, e10, this.U, (int) (this.L * this.J), this.f29704q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, e12);
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
                float min2 = 1.0f / Math.min(this.f29698k.getWidth() / bounds.width(), this.f29698k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
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
                        canvas.drawBitmap(this.f29698k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e10 != null) {
                float width6 = e10.getWidth();
                float height6 = e10.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f27 = width6 * max4;
                float f28 = height6 * max4;
                float f29 = (width2 - f27) / 2.0f;
                float f30 = (height2 - f28) / 2.0f;
                rectF.set(f29, f30, f27 + f29, f28 + f30);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f29704q) / 100.0f) * this.L * this.J));
                if (z12) {
                    Paint e13 = this.Q.e(this.f29698k, e10, this.U, (int) (this.L * this.J), this.f29704q, canvas.isHardwareAccelerated());
                    ob0 ob0Var = this.Q;
                    RectF rectF2 = ob0Var.f31354j;
                    rectF2.set(0.0f, 0.0f, ob0Var.f31352g, ob0Var.h);
                    Matrix matrix = ob0Var.f31353i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    ob0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e13);
                } else {
                    canvas.drawBitmap(e10, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f29704q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        z();
    }

    public final Bitmap e() {
        boolean z10;
        Bitmap bitmap = this.f29708u;
        if (bitmap == null) {
            return null;
        }
        if (this.f29710x == null) {
            return bitmap;
        }
        og.a aVar = this.V;
        boolean a2 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f29710x;
        og.a aVar2 = this.W;
        boolean a3 = aVar2.a(bitmap2);
        boolean z11 = true;
        if (this.f29687a0 != this.S) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a2 && !a3 && !z10) {
            z11 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z11) {
            return bitmap3;
        }
        int width = this.f29708u.getWidth();
        int height = this.f29708u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f29708u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f29708u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f29708u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i9 = this.S;
        if (this.f29710x != null && this.R != null) {
            for (int i10 = 0; i10 < this.R.size(); i10++) {
                if (i10 != i9) {
                    lf.c cVar = (lf.c) this.R.get(i10);
                    canvas.save();
                    canvas.concat(cVar.f16857b);
                    canvas.drawBitmap(this.f29710x, (Rect) null, cVar.f16856a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f29687a0 = this.S;
        aVar.b(this.f29708u);
        aVar2.b(this.f29710x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f29686a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f29708u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f29708u;
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
        int i9 = this.O;
        int i10 = this.P;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, config);
        this.f29698k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i11 = 0; i11 < 3; i11++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
            this.f29700m[i11] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f29705r = new Canvas(this.f29698k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        this.f29699l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f29706s = new Canvas(this.f29699l);
        Utilities.generateGradient(this.f29698k, this.f29696i, this.f29693e.getInterpolation(this.h), this.f29686a);
        if (f29685f0) {
            this.f29702o.setBlendMode(mg.b.a());
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f29690c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f29690c.get()).invalidate();
        }
        if (this.f29707t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            z();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f29711y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f29711y;
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

    public final void n(int i9, int i10, int i11, int i12) {
        o(i9, i10, i11, i12, 0, true);
    }

    public final void o(int i9, int i10, int i11, int i12, int i13, boolean z10) {
        if (this.f29695g && i11 == 0 && i12 == 0) {
            this.C = new GradientDrawable(n9.d(i13), new int[]{i9, i10});
        } else {
            this.C = null;
        }
        int[] iArr = this.f29686a;
        if (iArr[0] != i9 || iArr[1] != i10 || iArr[2] != i11 || iArr[3] != i12) {
            iArr[0] = i9;
            iArr[1] = i10;
            iArr[2] = i11;
            iArr[3] = i12;
            Bitmap bitmap = this.f29698k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f29696i, this.f29693e.getInterpolation(this.h), iArr);
                if (z10) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !SharedConfig.fastWallpaperDisabled) {
            this.Q = new ob0();
        }
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
        this.f29690c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f29711y;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void s(float f10) {
        this.J = f10;
        i();
    }

    @Override
    public final void setAlpha(int i9) {
        this.L = i9;
        this.f29701n.setAlpha(i9);
        this.f29702o.setAlpha(i9);
    }

    public final void t(Bitmap bitmap, int i9) {
        this.f29704q = i9;
        this.f29708u = bitmap;
        if (bitmap != null) {
            boolean z10 = f29685f0;
            Paint paint = this.f29702o;
            if (z10) {
                if (i9 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z11 = f29684e0;
            if (i9 < 0) {
                if (!z11) {
                    Bitmap bitmap2 = this.f29698k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f29708u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f29709w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f29712z = true;
                    paint.setShader(new ComposeShader(this.v, this.f29709w, PorterDuff.Mode.DST_IN));
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

    public final void u(int i9) {
        this.U = i9;
        this.H = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void v(int i9) {
        this.f29696i = i9;
        if (i9 < 0) {
            this.f29696i = 0;
        } else if (i9 > 7) {
            this.f29696i = 7;
        }
        Utilities.generateGradient(this.f29698k, this.f29696i, this.f29693e.getInterpolation(this.h), this.f29686a);
    }

    public final void w(int i9) {
        this.I = i9;
        this.A = new Matrix();
        Bitmap bitmap = this.f29698k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f29701n.setShader(bitmapShader);
        i();
    }

    public final void x(boolean z10) {
        if (this.h >= 1.0f && LiteMode.isEnabled(32)) {
            this.F = false;
            this.E = false;
            this.B = z10;
            this.h = 0.0f;
            int i9 = this.f29696i - 1;
            this.f29696i = i9;
            if (i9 < 0) {
                this.f29696i = 7;
            }
            i();
            this.f29706s.drawBitmap(this.f29698k, 0.0f, 0.0f, (Paint) null);
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
        Utilities.generateGradient(this.f29699l, this.f29696i, 0.0f, this.f29686a);
        c();
    }

    public final void z() {
        boolean z10;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f29688b;
        if (j10 > 20) {
            j10 = 17;
        }
        this.f29688b = elapsedRealtime;
        if (j10 > 1) {
            boolean z11 = this.N;
            if (z11 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f14 = this.h;
            if (f14 < 1.0f) {
                boolean z12 = true;
                if (!this.f29707t && !this.F) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z11) {
                    float f15 = ((((float) j10) / 12000.0f) * this.M) + f14;
                    this.h = f15;
                    if (f15 >= 1.0f) {
                        this.h = 0.0f;
                    }
                    float f16 = this.h;
                    int i9 = (int) (f16 / 0.125f);
                    this.f29696i = i9;
                    f11 = 1.0f - ((f16 - (i9 * 0.125f)) / 0.125f);
                } else {
                    boolean z13 = this.F;
                    gr grVar = this.f29693e;
                    if (z13) {
                        float interpolation = grVar.getInterpolation(f14);
                        if (interpolation <= 0.25f) {
                            c10 = 0;
                        } else if (interpolation <= 0.5f) {
                            c10 = 1;
                        } else if (interpolation <= 0.75f) {
                            c10 = 2;
                        } else {
                            c10 = 3;
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
                            f13 = grVar.getInterpolation(this.h);
                        } else {
                            f13 = this.h;
                        }
                        if (this.d && (f13 == 0.0f || f13 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c10 == 0 && f13 > 0.25f) || ((c10 == 1 && f13 > 0.5f) || (c10 == 2 && f13 > 0.75f))) {
                            if (this.E) {
                                int i10 = this.f29696i + 1;
                                this.f29696i = i10;
                                if (i10 > 7) {
                                    this.f29696i = 0;
                                }
                            } else {
                                int i11 = this.f29696i - 1;
                                this.f29696i = i11;
                                if (i11 < 0) {
                                    this.f29696i = 7;
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
                                int i12 = this.f29696i + 1;
                                this.f29696i = i12;
                                if (i12 > 7) {
                                    this.f29696i = 0;
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
                            f11 = grVar.getInterpolation(this.h);
                        } else {
                            f11 = this.h;
                        }
                        if (this.d && (f11 == 0.0f || f11 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f11 = 1.0f - f11;
                            if (this.h >= 1.0f) {
                                int i13 = this.f29696i + 1;
                                this.f29696i = i13;
                                if (i13 > 7) {
                                    this.f29696i = 0;
                                }
                                z12 = z10;
                                f11 = 1.0f;
                            }
                        }
                    }
                    z12 = z10;
                }
                if (z12) {
                    Utilities.generateGradient(this.f29698k, this.f29696i, f11, this.f29686a);
                } else {
                    Paint paint = this.f29703p;
                    Bitmap[] bitmapArr = this.f29700m;
                    if (f11 != 1.0f) {
                        int i14 = (int) (f11 / 0.33333334f);
                        if (i14 == 0) {
                            this.f29705r.drawBitmap(this.f29699l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f29705r.drawBitmap(bitmapArr[i14 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f11 - (i14 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f29705r.drawBitmap(bitmapArr[i14], 0.0f, 0.0f, paint);
                    } else {
                        this.f29705r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public jb0(boolean z10, int i9, int i10, int i11, int i12) {
        this(i9, i10, i11, i12, z10, 0, false);
    }

    public jb0(int i9, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f29686a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f29693e = new gr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f29697j = new RectF();
        this.f29700m = new Bitmap[3];
        this.f29701n = new Paint(2);
        this.f29702o = new Paint(2);
        this.f29703p = new Paint();
        this.f29704q = 100;
        this.C = new GradientDrawable();
        this.G = new ib0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new og.a();
        this.W = new og.a();
        this.f29689b0 = new og.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.f29695g = z10;
        o(i9, i10, i11, i12, i13, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
