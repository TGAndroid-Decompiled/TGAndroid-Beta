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
public final class yb0 extends Drawable {
    public static final boolean f35012e0;
    public static final boolean f35013f0;
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
    public dc0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final rg.a V;
    public final rg.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f35014a;
    public int f35015a0;
    public long f35016b;
    public final rg.a f35017b0;
    public WeakReference f35018c;
    public Bitmap f35019c0;
    public boolean d;
    public int f35020d0;
    public final jr f35021e;
    public int f35022f;
    public boolean f35023g;
    public float h;
    public int f35024i;
    public final RectF f35025j;
    public Bitmap f35026k;
    public Bitmap f35027l;
    public final Bitmap[] f35028m;
    public final Paint f35029n;
    public final Paint f35030o;
    public final Paint f35031p;
    public int f35032q;
    public Canvas f35033r;
    public Canvas f35034s;
    public boolean f35035t;
    public Bitmap f35036u;
    public BitmapShader v;
    public BitmapShader f35037w;
    public Bitmap f35038x;
    public ImageReceiver f35039y;
    public boolean f35040z;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f35012e0 = z10;
        if (i10 >= 29) {
            z11 = true;
        }
        f35013f0 = z11;
    }

    public yb0() {
        this.f35014a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f35021e = new jr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f35025j = new RectF();
        this.f35028m = new Bitmap[3];
        this.f35029n = new Paint(2);
        this.f35030o = new Paint(2);
        this.f35031p = new Paint();
        this.f35032q = 100;
        this.C = new GradientDrawable();
        this.G = new xb0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new rg.a();
        this.W = new rg.a();
        this.f35017b0 = new rg.a();
        h();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        boolean j10 = j(i10, i11, i12, i13);
        boolean z10 = f35013f0;
        if (j10) {
            if (!z10) {
                return Integer.MAX_VALUE;
            }
            return -1;
        } else if (!z10) {
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

    public final void a(Canvas canvas, int i10, float f9, float f10, float f11, float f12) {
        List list = this.R;
        if (list != null && this.f35039y != null && i10 >= 0 && i10 < list.size()) {
            of.c cVar = (of.c) this.R.get(i10);
            canvas.save();
            canvas.translate(f9, f10);
            canvas.scale(f11, f12);
            canvas.concat(cVar.f19551b);
            this.f35039y.setImageCoords(cVar.f19550a);
            this.f35039y.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i10) {
        if (this.R != null && this.f35036u != null) {
            a(canvas, i10, rectF.left, rectF.top, rectF.width() / this.f35036u.getWidth(), rectF.height() / this.f35036u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i10 = -1;
        while (i10 < 3) {
            int i11 = i10 + 1;
            float f9 = i11 / 3.0f;
            if (i10 < 0) {
                bitmap = this.f35027l;
            } else {
                bitmap = this.f35028m[i10];
            }
            Utilities.generateGradient(bitmap, this.f35024i, f9, this.f35014a);
            i10 = i11;
        }
    }

    public final Bitmap d() {
        return this.f35026k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e10 = e();
        if (e10 != null) {
            i10 = bounds.top;
        } else {
            i10 = this.f35022f;
        }
        float f9 = i10;
        int width = this.f35026k.getWidth();
        int height = this.f35026k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f10 = width;
        float f11 = height;
        float max = Math.max(width2 / f10, height2 / f11);
        float f12 = f10 * max;
        float f13 = f11 * max;
        float f14 = (width2 - f12) / 2.0f;
        float f15 = (height2 - f13) / 2.0f;
        if (this.f35023g) {
            int i11 = bounds.left;
            f14 += i11;
            int i12 = bounds.top;
            f15 += i12;
            canvas.clipRect(i11, i12, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f35026k != null && e10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f35032q;
        float f16 = 1.0f;
        Paint paint = this.f35029n;
        Paint paint2 = this.f35030o;
        RectF rectF = this.f35025j;
        if (i13 < 0) {
            boolean z11 = f35012e0;
            if (!z10 && (!z11 || e10 == null)) {
                canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
            }
            if (e10 != null) {
                if (z11) {
                    int i14 = (((int) (this.L * this.J)) * (-this.f35032q)) / 100;
                    if (this.f35036u != null) {
                        Bitmap e11 = e();
                        rg.a aVar = this.f35017b0;
                        if (aVar.a(e11) || this.f35019c0 == null || this.f35020d0 != i14) {
                            int width3 = this.f35036u.getWidth();
                            int height3 = this.f35036u.getHeight();
                            this.f35020d0 = i14;
                            Bitmap bitmap = this.f35019c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f35019c0.getHeight() != height3) {
                                this.f35019c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e11, this.f35019c0, i14);
                        }
                        aVar.b(e11);
                    }
                    float width4 = e10.getWidth();
                    float height4 = e10.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f17 = width4 * max2;
                    float f18 = height4 * max2;
                    float f19 = (width2 - f17) / 2.0f;
                    float f20 = (height2 - f18) / 2.0f;
                    rectF.set(f19, f20, f17 + f19, f18 + f20);
                    if (this.f35019c0 != null) {
                        canvas.drawBitmap(this.f35026k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f35019c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.a.k(-16777216, (int) (this.L * this.K)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f14, f15 + f9);
                    float min = 1.0f / Math.min(this.f35026k.getWidth() / bounds.width(), this.f35026k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e10.getWidth();
                    float height5 = e10.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f21 = (width2 - (width5 * max3)) / 2.0f;
                    float f22 = ((height2 - (height5 * max3)) / 2.0f) + f9;
                    this.A.setTranslate((int) f21, (int) f22);
                    if (!this.f35040z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f16 = max3;
                    }
                    this.f35037w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f35032q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z10) {
                        Paint e12 = this.Q.e(this.f35026k, e10, this.U, (int) (this.L * this.J), this.f35032q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f23 = this.I;
                        canvas.drawRoundRect(rectF, f23, f23, e12);
                    } else {
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, paint2);
                    }
                    a(canvas, this.S, f21, f22, f16, f16);
                }
            }
        } else {
            boolean z12 = z10;
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f14, f15);
                float min2 = 1.0f / Math.min(this.f35026k.getWidth() / bounds.width(), this.f35026k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z12) {
                    float f25 = this.I;
                    canvas.drawRoundRect(rectF, f25, f25, paint);
                }
            } else {
                canvas.translate(0.0f, f9);
                GradientDrawable gradientDrawable = this.C;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f14, (int) f15, (int) (f14 + f12), (int) (f15 + f13));
                    this.C.setAlpha((int) (this.K * 255.0f));
                    this.C.draw(canvas);
                } else {
                    rectF.set(f14, f15, f12 + f14, f13 + f15);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * this.K));
                    if (!z12) {
                        canvas.drawBitmap(this.f35026k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e10 != null) {
                float width6 = e10.getWidth();
                float height6 = e10.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f26 = width6 * max4;
                float f27 = height6 * max4;
                float f28 = (width2 - f26) / 2.0f;
                float f29 = (height2 - f27) / 2.0f;
                rectF.set(f28, f29, f26 + f28, f27 + f29);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f35032q) / 100.0f) * this.L * this.J));
                if (z12) {
                    Paint e13 = this.Q.e(this.f35026k, e10, this.U, (int) (this.L * this.J), this.f35032q, canvas.isHardwareAccelerated());
                    dc0 dc0Var = this.Q;
                    RectF rectF2 = dc0Var.f27743j;
                    rectF2.set(0.0f, 0.0f, dc0Var.f27741g, dc0Var.h);
                    Matrix matrix = dc0Var.f27742i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    dc0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e13);
                } else {
                    canvas.drawBitmap(e10, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f35032q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        z();
    }

    public final Bitmap e() {
        boolean z10;
        Bitmap bitmap = this.f35036u;
        if (bitmap == null) {
            return null;
        }
        if (this.f35038x == null) {
            return bitmap;
        }
        rg.a aVar = this.V;
        boolean a2 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f35038x;
        rg.a aVar2 = this.W;
        boolean a10 = aVar2.a(bitmap2);
        boolean z11 = true;
        if (this.f35015a0 != this.S) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a2 && !a10 && !z10) {
            z11 = false;
        }
        Bitmap bitmap3 = this.X;
        if (bitmap3 != null && !z11) {
            return bitmap3;
        }
        int width = this.f35036u.getWidth();
        int height = this.f35036u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f35036u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f35036u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f35036u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i10 = this.S;
        if (this.f35038x != null && this.R != null) {
            for (int i11 = 0; i11 < this.R.size(); i11++) {
                if (i11 != i10) {
                    of.c cVar = (of.c) this.R.get(i11);
                    canvas.save();
                    canvas.concat(cVar.f19551b);
                    canvas.drawBitmap(this.f35038x, (Rect) null, cVar.f19550a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f35015a0 = this.S;
        aVar.b(this.f35036u);
        aVar2.b(this.f35038x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f35014a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f35036u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f35036u;
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
        this.f35026k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i12 = 0; i12 < 3; i12++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f35028m[i12] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f35033r = new Canvas(this.f35026k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f35027l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f35034s = new Canvas(this.f35027l);
        Utilities.generateGradient(this.f35026k, this.f35024i, this.f35021e.getInterpolation(this.h), this.f35014a);
        if (f35013f0) {
            this.f35030o.setBlendMode(m4.a.e());
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f35018c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f35018c.get()).invalidate();
        }
        if (this.f35035t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            z();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f35039y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f35039y;
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
        if (this.f35023g && i12 == 0 && i13 == 0) {
            this.C = new GradientDrawable(s9.d(i14), new int[]{i10, i11});
        } else {
            this.C = null;
        }
        int[] iArr = this.f35014a;
        if (iArr[0] != i10 || iArr[1] != i11 || iArr[2] != i12 || iArr[3] != i13) {
            iArr[0] = i10;
            iArr[1] = i11;
            iArr[2] = i12;
            iArr[3] = i13;
            Bitmap bitmap = this.f35026k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f35024i, this.f35021e.getInterpolation(this.h), iArr);
                if (z10) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !SharedConfig.fastWallpaperDisabled) {
            this.Q = new dc0();
        }
    }

    public final void q(boolean z10) {
        if (!z10 && this.N) {
            float f9 = this.h;
            this.h = 1.0f - ((f9 - (((int) (f9 / 0.125f)) * 0.125f)) / 0.125f);
            this.d = true;
        }
        this.N = z10;
    }

    public final void r(View view) {
        this.f35018c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f35039y;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void s(float f9) {
        this.J = f9;
        i();
    }

    @Override
    public final void setAlpha(int i10) {
        this.L = i10;
        this.f35029n.setAlpha(i10);
        this.f35030o.setAlpha(i10);
    }

    public final void t(Bitmap bitmap, int i10) {
        this.f35032q = i10;
        this.f35036u = bitmap;
        if (bitmap != null) {
            boolean z10 = f35013f0;
            Paint paint = this.f35030o;
            if (z10) {
                if (i10 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z11 = f35012e0;
            if (i10 < 0) {
                if (!z11) {
                    Bitmap bitmap2 = this.f35026k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f35036u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f35037w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f35040z = true;
                    paint.setShader(new ComposeShader(this.v, this.f35037w, PorterDuff.Mode.DST_IN));
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

    public final void u(int i10) {
        this.U = i10;
        this.H = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void v(int i10) {
        this.f35024i = i10;
        if (i10 < 0) {
            this.f35024i = 0;
        } else if (i10 > 7) {
            this.f35024i = 7;
        }
        Utilities.generateGradient(this.f35026k, this.f35024i, this.f35021e.getInterpolation(this.h), this.f35014a);
    }

    public final void w(int i10) {
        this.I = i10;
        this.A = new Matrix();
        Bitmap bitmap = this.f35026k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f35029n.setShader(bitmapShader);
        i();
    }

    public final void x(boolean z10) {
        if (this.h >= 1.0f && LiteMode.isEnabled(32)) {
            this.F = false;
            this.E = false;
            this.B = z10;
            this.h = 0.0f;
            int i10 = this.f35024i - 1;
            this.f35024i = i10;
            if (i10 < 0) {
                this.f35024i = 7;
            }
            i();
            this.f35034s.drawBitmap(this.f35026k, 0.0f, 0.0f, (Paint) null);
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
        Utilities.generateGradient(this.f35027l, this.f35024i, 0.0f, this.f35014a);
        c();
    }

    public final void z() {
        boolean z10;
        float f9;
        float f10;
        char c3;
        float f11;
        float f12;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f35016b;
        if (j10 > 20) {
            j10 = 17;
        }
        this.f35016b = elapsedRealtime;
        if (j10 > 1) {
            boolean z11 = this.N;
            if (z11 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f13 = this.h;
            if (f13 < 1.0f) {
                boolean z12 = true;
                if (!this.f35035t && !this.F) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z11) {
                    float f14 = ((((float) j10) / 12000.0f) * this.M) + f13;
                    this.h = f14;
                    if (f14 >= 1.0f) {
                        this.h = 0.0f;
                    }
                    float f15 = this.h;
                    int i10 = (int) (f15 / 0.125f);
                    this.f35024i = i10;
                    f10 = 1.0f - ((f15 - (i10 * 0.125f)) / 0.125f);
                } else {
                    boolean z13 = this.F;
                    jr jrVar = this.f35021e;
                    if (z13) {
                        float interpolation = jrVar.getInterpolation(f13);
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
                            float f16 = this.h;
                            float f17 = (float) j10;
                            if (this.E) {
                                f11 = 1000.0f;
                            } else {
                                f11 = 2000.0f;
                            }
                            this.h = (f17 / f11) + f16;
                        }
                        if (this.h > 1.0f) {
                            this.h = 1.0f;
                        }
                        if (this.D == null && !this.d) {
                            f12 = jrVar.getInterpolation(this.h);
                        } else {
                            f12 = this.h;
                        }
                        if (this.d && (f12 == 0.0f || f12 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c3 == 0 && f12 > 0.25f) || ((c3 == 1 && f12 > 0.5f) || (c3 == 2 && f12 > 0.75f))) {
                            if (this.E) {
                                int i11 = this.f35024i + 1;
                                this.f35024i = i11;
                                if (i11 > 7) {
                                    this.f35024i = 0;
                                }
                            } else {
                                int i12 = this.f35024i - 1;
                                this.f35024i = i12;
                                if (i12 < 0) {
                                    this.f35024i = 7;
                                }
                            }
                        }
                        if (f12 > 0.25f) {
                            if (f12 <= 0.5f) {
                                f12 -= 0.25f;
                            } else if (f12 <= 0.75f) {
                                f12 -= 0.5f;
                            } else {
                                f12 -= 0.75f;
                            }
                        }
                        float f18 = f12 / 0.25f;
                        if (this.E) {
                            f10 = 1.0f - f18;
                            if (this.h >= 1.0f) {
                                int i13 = this.f35024i + 1;
                                this.f35024i = i13;
                                if (i13 > 7) {
                                    this.f35024i = 0;
                                }
                                f10 = 1.0f;
                            }
                        } else {
                            f10 = f18;
                        }
                    } else {
                        GenericProvider genericProvider2 = this.D;
                        if (genericProvider2 != null) {
                            this.h = ((Float) genericProvider2.provide(this)).floatValue();
                        } else {
                            float f19 = (float) j10;
                            if (this.B) {
                                f9 = 300.0f;
                            } else {
                                f9 = 500.0f;
                            }
                            this.h = (f19 / f9) + f13;
                        }
                        if (this.h > 1.0f) {
                            this.h = 1.0f;
                        }
                        if (this.D == null && !this.d) {
                            f10 = jrVar.getInterpolation(this.h);
                        } else {
                            f10 = this.h;
                        }
                        if (this.d && (f10 == 0.0f || f10 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f10 = 1.0f - f10;
                            if (this.h >= 1.0f) {
                                int i14 = this.f35024i + 1;
                                this.f35024i = i14;
                                if (i14 > 7) {
                                    this.f35024i = 0;
                                }
                                z12 = z10;
                                f10 = 1.0f;
                            }
                        }
                    }
                    z12 = z10;
                }
                if (z12) {
                    Utilities.generateGradient(this.f35026k, this.f35024i, f10, this.f35014a);
                } else {
                    Paint paint = this.f35031p;
                    Bitmap[] bitmapArr = this.f35028m;
                    if (f10 != 1.0f) {
                        int i15 = (int) (f10 / 0.33333334f);
                        if (i15 == 0) {
                            this.f35033r.drawBitmap(this.f35027l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f35033r.drawBitmap(bitmapArr[i15 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f10 - (i15 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f35033r.drawBitmap(bitmapArr[i15], 0.0f, 0.0f, paint);
                    } else {
                        this.f35033r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public yb0(boolean z10, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, z10, 0, false);
    }

    public yb0(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f35014a = new int[]{-12423849, -531317, -7888252, -133430};
        this.f35021e = new jr(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f35025j = new RectF();
        this.f35028m = new Bitmap[3];
        this.f35029n = new Paint(2);
        this.f35030o = new Paint(2);
        this.f35031p = new Paint();
        this.f35032q = 100;
        this.C = new GradientDrawable();
        this.G = new xb0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new rg.a();
        this.W = new rg.a();
        this.f35017b0 = new rg.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.f35023g = z10;
        o(i10, i11, i12, i13, i14, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
