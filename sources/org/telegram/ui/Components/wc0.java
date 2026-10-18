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
public final class wc0 extends Drawable {
    public static final boolean f32085e0;
    public static final boolean f32086f0;
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
    public final float K;
    public int L;
    public float M;
    public boolean N;
    public final int O;
    public final int P;
    public bd0 Q;
    public List R;
    public int S;
    public boolean T;
    public int U;
    public final hh.a V;
    public final hh.a W;
    public Bitmap X;
    public Canvas Y;
    public Paint Z;
    public final int[] f32087a;
    public int f32088a0;
    public long f32089b;
    public final hh.a f32090b0;
    public WeakReference f32091c;
    public Bitmap f32092c0;
    public boolean d;
    public int f32093d0;
    public final bs e;
    public int f32094f;
    public boolean f32095g;
    public float h;
    public int f32096i;
    public final RectF f32097j;
    public Bitmap f32098k;
    public Bitmap f32099l;
    public final Bitmap[] f32100m;
    public final Paint f32101n;
    public final Paint f32102o;
    public final Paint f32103p;
    public int f32104q;
    public Canvas f32105r;
    public Canvas f32106s;
    public boolean f32107t;
    public Bitmap f32108u;
    public BitmapShader v;
    public BitmapShader f32109w;
    public Bitmap f32110x;
    public ImageReceiver f32111y;
    public boolean f32112z;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        f32085e0 = z10;
        if (i10 >= 29) {
            z11 = true;
        }
        f32086f0 = z11;
    }

    public wc0() {
        this.f32087a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new bs(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f32097j = new RectF();
        this.f32100m = new Bitmap[3];
        this.f32101n = new Paint(2);
        this.f32102o = new Paint(2);
        this.f32103p = new Paint();
        this.f32104q = 100;
        this.C = new GradientDrawable();
        this.G = new vc0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new hh.a();
        this.W = new hh.a();
        this.f32090b0 = new hh.a();
        h();
    }

    public static int g(int i10, int i11, int i12, int i13) {
        boolean j10 = j(i10, i11, i12, i13);
        boolean z10 = f32086f0;
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

    public final void a(Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        List list = this.R;
        if (list != null && this.f32111y != null && i10 >= 0 && i10 < list.size()) {
            eg.c cVar = (eg.c) this.R.get(i10);
            canvas.save();
            canvas.translate(f7, f10);
            canvas.scale(f11, f12);
            canvas.concat(cVar.f8652b);
            this.f32111y.setImageCoords(cVar.f8651a);
            this.f32111y.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, int i10) {
        if (this.R != null && this.f32108u != null) {
            a(canvas, i10, rectF.left, rectF.top, rectF.width() / this.f32108u.getWidth(), rectF.height() / this.f32108u.getHeight());
        }
    }

    public final void c() {
        Bitmap bitmap;
        int i10 = -1;
        while (i10 < 3) {
            int i11 = i10 + 1;
            float f7 = i11 / 3.0f;
            if (i10 < 0) {
                bitmap = this.f32099l;
            } else {
                bitmap = this.f32100m[i10];
            }
            Utilities.generateGradient(bitmap, this.f32096i, f7, this.f32087a);
            i10 = i11;
        }
    }

    public final Bitmap d() {
        return this.f32098k;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        canvas.save();
        Bitmap e = e();
        if (e != null) {
            i10 = bounds.top;
        } else {
            i10 = this.f32094f;
        }
        float f7 = i10;
        int width = this.f32098k.getWidth();
        int height = this.f32098k.getHeight();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float f10 = width;
        float f11 = height;
        float max = Math.max(width2 / f10, height2 / f11);
        float f12 = f10 * max;
        float f13 = f11 * max;
        float f14 = (width2 - f12) / 2.0f;
        float f15 = (height2 - f13) / 2.0f;
        if (this.f32095g) {
            int i11 = bounds.left;
            f14 += i11;
            int i12 = bounds.top;
            f15 += i12;
            canvas.clipRect(i11, i12, bounds.right, bounds.bottom);
        }
        if (Build.VERSION.SDK_INT >= 28 && this.Q != null && this.f32098k != null && e != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f32104q;
        float f16 = 1.0f;
        Paint paint = this.f32101n;
        float f17 = this.K;
        Paint paint2 = this.f32102o;
        boolean z11 = z10;
        RectF rectF = this.f32097j;
        if (i13 < 0) {
            boolean z12 = f32085e0;
            if (!z11 && (!z12 || e == null)) {
                canvas.drawColor(i0.a.o(-16777216, (int) (this.L * f17)));
            }
            if (e != null) {
                if (z12) {
                    int i14 = (((int) (this.L * this.J)) * (-this.f32104q)) / 100;
                    if (this.f32108u != null) {
                        Bitmap e7 = e();
                        hh.a aVar = this.f32090b0;
                        if (aVar.a(e7) || this.f32092c0 == null || this.f32093d0 != i14) {
                            int width3 = this.f32108u.getWidth();
                            int height3 = this.f32108u.getHeight();
                            this.f32093d0 = i14;
                            Bitmap bitmap = this.f32092c0;
                            if (bitmap == null || bitmap.getWidth() != width3 || this.f32092c0.getHeight() != height3) {
                                this.f32092c0 = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
                            }
                            Utilities.applyAlphaInvert(e7, this.f32092c0, i14);
                        }
                        aVar.b(e7);
                    }
                    float width4 = e.getWidth();
                    float height4 = e.getHeight();
                    float max2 = Math.max(width2 / width4, height2 / height4);
                    float f18 = width4 * max2;
                    float f19 = height4 * max2;
                    float f20 = (width2 - f18) / 2.0f;
                    float f21 = (height2 - f19) / 2.0f;
                    rectF.set(f20, f21, f18 + f20, f19 + f21);
                    if (this.f32092c0 != null) {
                        canvas.drawBitmap(this.f32098k, (Rect) null, rectF, paint);
                        canvas.drawBitmap(this.f32092c0, (Rect) null, rectF, paint);
                    } else {
                        canvas.drawColor(i0.a.o(-16777216, (int) (this.L * f17)));
                    }
                    b(canvas, rectF, this.S);
                } else {
                    if (this.A == null) {
                        this.A = new Matrix();
                    }
                    this.A.reset();
                    this.A.setTranslate(f14, f15 + f7);
                    float min = 1.0f / Math.min(this.f32098k.getWidth() / bounds.width(), this.f32098k.getHeight() / bounds.height());
                    this.A.preScale(min, min);
                    this.v.setLocalMatrix(this.A);
                    this.A.reset();
                    float width5 = e.getWidth();
                    float height5 = e.getHeight();
                    float max3 = Math.max(width2 / width5, height2 / height5);
                    float f22 = (width2 - (width5 * max3)) / 2.0f;
                    float f23 = ((height2 - (height5 * max3)) / 2.0f) + f7;
                    this.A.setTranslate((int) f22, (int) f23);
                    if (!this.f32112z || max3 > 1.4f || max3 < 0.8f) {
                        this.A.preScale(max3, max3);
                        f16 = max3;
                    }
                    this.f32109w.setLocalMatrix(this.A);
                    paint2.setColorFilter(null);
                    paint2.setAlpha((int) ((Math.abs(this.f32104q) / 100.0f) * this.L * this.J));
                    rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    if (z11) {
                        Paint e10 = this.Q.e(this.f32098k, e, this.U, (int) (this.L * this.J), this.f32104q, canvas.isHardwareAccelerated());
                        this.Q.d(this.A);
                        this.Q.c(rectF);
                        float f24 = this.I;
                        canvas.drawRoundRect(rectF, f24, f24, e10);
                    } else {
                        float f25 = this.I;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                    a(canvas, this.S, f22, f23, f16, f16);
                }
            }
        } else {
            if (this.I != 0) {
                this.A.reset();
                this.A.setTranslate(f14, f15);
                float min2 = 1.0f / Math.min(this.f32098k.getWidth() / bounds.width(), this.f32098k.getHeight() / bounds.height());
                this.A.preScale(min2, min2);
                this.v.setLocalMatrix(this.A);
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                if (!z11) {
                    float f26 = this.I;
                    canvas.drawRoundRect(rectF, f26, f26, paint);
                }
            } else {
                canvas.translate(0.0f, f7);
                GradientDrawable gradientDrawable = this.C;
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) f14, (int) f15, (int) (f14 + f12), (int) (f15 + f13));
                    this.C.setAlpha((int) (f17 * 255.0f));
                    this.C.draw(canvas);
                } else {
                    rectF.set(f14, f15, f12 + f14, f13 + f15);
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * f17));
                    if (!z11) {
                        canvas.drawBitmap(this.f32098k, (Rect) null, rectF, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            if (e != null) {
                float width6 = e.getWidth();
                float height6 = e.getHeight();
                float max4 = Math.max(width2 / width6, height2 / height6);
                float f27 = width6 * max4;
                float f28 = height6 * max4;
                float f29 = (width2 - f27) / 2.0f;
                float f30 = (height2 - f28) / 2.0f;
                rectF.set(f29, f30, f27 + f29, f28 + f30);
                paint2.setColorFilter(this.H);
                paint2.setAlpha((int) ((Math.abs(this.f32104q) / 100.0f) * this.L * this.J));
                if (z11) {
                    Paint e11 = this.Q.e(this.f32098k, e, this.U, (int) (this.L * this.J), this.f32104q, canvas.isHardwareAccelerated());
                    bd0 bd0Var = this.Q;
                    RectF rectF2 = bd0Var.f24960j;
                    rectF2.set(0.0f, 0.0f, bd0Var.f24958g, bd0Var.h);
                    Matrix matrix = bd0Var.f24959i;
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                    bd0Var.d(matrix);
                    this.Q.c(rectF);
                    canvas.drawRect(rectF, e11);
                } else {
                    canvas.drawBitmap(e, (Rect) null, rectF, paint2);
                }
                paint2.setAlpha((int) ((Math.abs(this.f32104q) / 100.0f) * this.L * this.J * 0.8f));
                b(canvas, rectF, this.S);
            }
        }
        canvas.restore();
        y();
    }

    public final Bitmap e() {
        boolean z10;
        Bitmap bitmap = this.f32108u;
        if (bitmap == null) {
            return null;
        }
        if (this.f32110x == null) {
            return bitmap;
        }
        hh.a aVar = this.V;
        boolean a2 = aVar.a(bitmap);
        Bitmap bitmap2 = this.f32110x;
        hh.a aVar2 = this.W;
        boolean a10 = aVar2.a(bitmap2);
        boolean z11 = true;
        if (this.f32088a0 != this.S) {
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
        int width = this.f32108u.getWidth();
        int height = this.f32108u.getHeight();
        Bitmap bitmap4 = this.X;
        if (bitmap4 == null || bitmap4.getWidth() != width || this.X.getHeight() != height) {
            this.X = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.Y = new Canvas(this.X);
        }
        Bitmap.Config config = this.f32108u.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            Utilities.copyBitmaps(this.f32108u, this.X);
        } else if (config == Bitmap.Config.ALPHA_8) {
            Utilities.expandAlphaToBlack(this.f32108u, this.X);
        }
        if (this.Z == null) {
            Paint paint = new Paint(3);
            this.Z = paint;
            paint.setAlpha(204);
        }
        Canvas canvas = this.Y;
        Paint paint2 = this.Z;
        int i10 = this.S;
        if (this.f32110x != null && this.R != null) {
            for (int i11 = 0; i11 < this.R.size(); i11++) {
                if (i11 != i10) {
                    eg.c cVar = (eg.c) this.R.get(i11);
                    canvas.save();
                    canvas.concat(cVar.f8652b);
                    canvas.drawBitmap(this.f32110x, (Rect) null, cVar.f8651a, paint2);
                    canvas.restore();
                }
            }
        }
        this.f32088a0 = this.S;
        aVar.b(this.f32108u);
        aVar2.b(this.f32110x);
        return this.X;
    }

    public final int f() {
        int[] iArr = this.f32087a;
        return g(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    @Override
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f32108u;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f32108u;
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
        this.f32098k = createBitmap;
        createBitmap.setHasAlpha(false);
        for (int i12 = 0; i12 < 3; i12++) {
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f32100m[i12] = createBitmap2;
            createBitmap2.setHasAlpha(false);
        }
        this.f32105r = new Canvas(this.f32098k);
        Bitmap createBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f32099l = createBitmap3;
        createBitmap3.setHasAlpha(false);
        this.f32106s = new Canvas(this.f32099l);
        Utilities.generateGradient(this.f32098k, this.f32096i, this.e.getInterpolation(this.h), this.f32087a);
        if (f32086f0) {
            this.f32102o.setBlendMode(m4.v0.c());
        }
    }

    public final void i() {
        invalidateSelf();
        WeakReference weakReference = this.f32091c;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.f32091c.get()).invalidate();
        }
        if (this.f32107t) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.invalidateMotionBackground, new Object[0]);
            y();
            Runnable runnable = this.G;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 16L);
        }
    }

    public final void k() {
        this.T = true;
        ImageReceiver imageReceiver = this.f32111y;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    public final void l() {
        this.T = false;
        ImageReceiver imageReceiver = this.f32111y;
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
        if (this.f32095g && i12 == 0 && i13 == 0) {
            this.C = new GradientDrawable(v9.d(i14), new int[]{i10, i11});
        } else {
            this.C = null;
        }
        int[] iArr = this.f32087a;
        if (iArr[0] != i10 || iArr[1] != i11 || iArr[2] != i12 || iArr[3] != i13) {
            iArr[0] = i10;
            iArr[1] = i11;
            iArr[2] = i12;
            iArr[3] = i13;
            Bitmap bitmap = this.f32098k;
            if (bitmap != null) {
                Utilities.generateGradient(bitmap, this.f32096i, this.e.getInterpolation(this.h), iArr);
                if (z10) {
                    i();
                }
            }
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 28 && this.Q == null && !SharedConfig.fastWallpaperDisabled) {
            this.Q = new bd0();
        }
    }

    public final void q(View view) {
        this.f32091c = new WeakReference(view);
        ImageReceiver imageReceiver = this.f32111y;
        if (imageReceiver != null) {
            imageReceiver.setParentView(view);
        }
    }

    public final void r(float f7) {
        this.J = f7;
        i();
    }

    public final void s(Bitmap bitmap, int i10) {
        this.f32104q = i10;
        this.f32108u = bitmap;
        if (bitmap != null) {
            boolean z10 = f32086f0;
            Paint paint = this.f32102o;
            if (z10) {
                if (i10 >= 0) {
                    paint.setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z11 = f32085e0;
            if (i10 < 0) {
                if (!z11) {
                    Bitmap bitmap2 = this.f32098k;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.v = new BitmapShader(bitmap2, tileMode, tileMode);
                    Bitmap bitmap3 = this.f32108u;
                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                    this.f32109w = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    this.f32112z = true;
                    paint.setShader(new ComposeShader(this.v, this.f32109w, PorterDuff.Mode.DST_IN));
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
    public final void setAlpha(int i10) {
        this.L = i10;
        this.f32101n.setAlpha(i10);
        this.f32102o.setAlpha(i10);
    }

    public final void t(int i10) {
        this.U = i10;
        this.H = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        i();
    }

    public final void u(int i10) {
        this.f32096i = i10;
        if (i10 < 0) {
            this.f32096i = 0;
        } else if (i10 > 7) {
            this.f32096i = 7;
        }
        Utilities.generateGradient(this.f32098k, this.f32096i, this.e.getInterpolation(this.h), this.f32087a);
    }

    public final void v(int i10) {
        this.I = i10;
        this.A = new Matrix();
        Bitmap bitmap = this.f32098k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.v = bitmapShader;
        this.f32101n.setShader(bitmapShader);
        i();
    }

    public final void w(boolean z10) {
        if (this.h >= 1.0f && LiteMode.isEnabled(32)) {
            this.F = false;
            this.E = false;
            this.B = z10;
            this.h = 0.0f;
            int i10 = this.f32096i - 1;
            this.f32096i = i10;
            if (i10 < 0) {
                this.f32096i = 7;
            }
            i();
            this.f32106s.drawBitmap(this.f32098k, 0.0f, 0.0f, (Paint) null);
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
        Utilities.generateGradient(this.f32099l, this.f32096i, 0.0f, this.f32087a);
        c();
    }

    public final void y() {
        boolean z10;
        float f7;
        float f10;
        char c10;
        float f11;
        float f12;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f32089b;
        if (j10 > 20) {
            j10 = 17;
        }
        this.f32089b = elapsedRealtime;
        if (j10 > 1) {
            boolean z11 = this.N;
            if (z11 && this.h == 1.0f) {
                this.h = 0.0f;
            }
            float f13 = this.h;
            if (f13 < 1.0f) {
                boolean z12 = true;
                if (!this.f32107t && !this.F) {
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
                    this.f32096i = i10;
                    f10 = 1.0f - ((f15 - (i10 * 0.125f)) / 0.125f);
                } else {
                    boolean z13 = this.F;
                    bs bsVar = this.e;
                    if (z13) {
                        float interpolation = bsVar.getInterpolation(f13);
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
                            f12 = bsVar.getInterpolation(this.h);
                        } else {
                            f12 = this.h;
                        }
                        if (this.d && (f12 == 0.0f || f12 == 1.0f)) {
                            this.d = false;
                        }
                        if ((c10 == 0 && f12 > 0.25f) || ((c10 == 1 && f12 > 0.5f) || (c10 == 2 && f12 > 0.75f))) {
                            if (this.E) {
                                int i11 = this.f32096i + 1;
                                this.f32096i = i11;
                                if (i11 > 7) {
                                    this.f32096i = 0;
                                }
                            } else {
                                int i12 = this.f32096i - 1;
                                this.f32096i = i12;
                                if (i12 < 0) {
                                    this.f32096i = 7;
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
                                int i13 = this.f32096i + 1;
                                this.f32096i = i13;
                                if (i13 > 7) {
                                    this.f32096i = 0;
                                }
                                f10 = 1.0f;
                            }
                        } else {
                            f10 = f18;
                        }
                        z12 = z10;
                    } else {
                        GenericProvider genericProvider2 = this.D;
                        if (genericProvider2 != null) {
                            this.h = ((Float) genericProvider2.provide(this)).floatValue();
                        } else {
                            float f19 = (float) j10;
                            if (this.B) {
                                f7 = 300.0f;
                            } else {
                                f7 = 500.0f;
                            }
                            this.h = (f19 / f7) + f13;
                        }
                        if (this.h > 1.0f) {
                            this.h = 1.0f;
                        }
                        if (this.D == null && !this.d) {
                            f10 = bsVar.getInterpolation(this.h);
                        } else {
                            f10 = this.h;
                        }
                        if (this.d && (f10 == 0.0f || f10 == 1.0f)) {
                            this.d = false;
                        }
                        if (this.E) {
                            f10 = 1.0f - f10;
                            if (this.h >= 1.0f) {
                                int i14 = this.f32096i + 1;
                                this.f32096i = i14;
                                if (i14 > 7) {
                                    this.f32096i = 0;
                                }
                                f10 = 1.0f;
                            }
                        }
                        z12 = z10;
                    }
                }
                if (z12) {
                    Utilities.generateGradient(this.f32098k, this.f32096i, f10, this.f32087a);
                } else {
                    int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    Paint paint = this.f32103p;
                    Bitmap[] bitmapArr = this.f32100m;
                    if (i15 != 0) {
                        int i16 = (int) (f10 / 0.33333334f);
                        if (i16 == 0) {
                            this.f32105r.drawBitmap(this.f32099l, 0.0f, 0.0f, (Paint) null);
                        } else {
                            this.f32105r.drawBitmap(bitmapArr[i16 - 1], 0.0f, 0.0f, (Paint) null);
                        }
                        paint.setAlpha((int) (((f10 - (i16 * 0.33333334f)) / 0.33333334f) * 255.0f));
                        this.f32105r.drawBitmap(bitmapArr[i16], 0.0f, 0.0f, paint);
                    } else {
                        this.f32105r.drawBitmap(bitmapArr[2], 0.0f, 0.0f, paint);
                    }
                }
                i();
            }
        }
    }

    public wc0(boolean z10, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, z10, 0, false);
    }

    public wc0(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f32087a = new int[]{-12423849, -531317, -7888252, -133430};
        this.e = new bs(0.33d, 0.0d, 0.0d, 1.0d);
        this.h = 1.0f;
        this.f32097j = new RectF();
        this.f32100m = new Bitmap[3];
        this.f32101n = new Paint(2);
        this.f32102o = new Paint(2);
        this.f32103p = new Paint();
        this.f32104q = 100;
        this.C = new GradientDrawable();
        this.G = new vc0(this, 0);
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 255;
        this.M = 1.0f;
        this.O = 60;
        this.P = 80;
        this.S = -1;
        this.U = -16777216;
        this.V = new hh.a();
        this.W = new hh.a();
        this.f32090b0 = new hh.a();
        if (z11) {
            this.O = 80;
            this.P = 80;
        }
        this.f32095g = z10;
        o(i10, i11, i12, i13, i14, false);
        h();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
