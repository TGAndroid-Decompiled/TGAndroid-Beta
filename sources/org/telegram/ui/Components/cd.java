package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public abstract class cd extends View {
    public static final int[] W;
    public static final int[] f22101a0;
    public static long f22102b0;
    public static Long f22103c0;
    public static Long f22104d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final n6 M;
    public final n6 N;
    public final n6 O;
    public final n6 P;
    public qg.w1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f22105a;
    public final RectF f22106b;
    public final RectF f22107c;
    public final int d;
    public final boolean e;
    public final int[] f22108f;
    public boolean h;
    public final d6 f22109n;
    public boolean f22110r;
    public final d6 f22111s;
    public final ad[] v;
    public final float[] f22112w;
    public final RectF f22113x;
    public final Paint f22114y;

    static {
        int i10 = org.telegram.ui.ActionBar.j6.lj;
        int i11 = org.telegram.ui.ActionBar.j6.hj;
        int i12 = org.telegram.ui.ActionBar.j6.ij;
        int i13 = org.telegram.ui.ActionBar.j6.pj;
        int i14 = org.telegram.ui.ActionBar.j6.mj;
        int i15 = org.telegram.ui.ActionBar.j6.jj;
        int i16 = org.telegram.ui.ActionBar.j6.nj;
        int i17 = org.telegram.ui.ActionBar.j6.qj;
        int i18 = org.telegram.ui.ActionBar.j6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        f22101a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f22102b0 = -1L;
    }

    public cd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f22105a = new RectF();
        this.f22106b = new RectF();
        this.f22107c = new RectF();
        this.h = true;
        wr wrVar = wr.h;
        this.f22109n = new d6(this, 750L, wrVar);
        this.f22110r = false;
        this.f22111s = new d6(this, 650L, wrVar);
        this.f22112w = new float[2];
        this.f22113x = new RectF();
        Paint paint = new Paint(1);
        this.f22114y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        n6 n6Var = new n6(false, true, true, false);
        this.M = n6Var;
        n6 n6Var2 = new n6(false, true, true, false);
        this.N = n6Var2;
        n6 n6Var3 = new n6(false, true, true, false);
        this.O = n6Var3;
        n6 n6Var4 = new n6(false, true, true, false);
        this.P = n6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f22108f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new ad[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        n6Var.k(0.2f, 450L, wrVar);
        n6Var.v = 0.6f;
        n6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(32.0f));
        n6Var.f25425b = 17;
        n6Var2.k(0.6f, 450L, wrVar);
        n6Var2.v = 0.6f;
        n6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false));
        n6Var2.t(AndroidUtilities.dp(12.0f));
        n6Var2.f25425b = 17;
        n6Var3.k(0.2f, 450L, wrVar);
        n6Var3.v = 0.6f;
        n6Var3.f25424a.setShader(linearGradient2);
        n6Var3.u(AndroidUtilities.bold());
        n6Var3.t(AndroidUtilities.dp(32.0f));
        n6Var3.f25425b = 17;
        n6Var4.k(0.6f, 450L, wrVar);
        n6Var4.v = 0.6f;
        n6Var4.f25424a.setShader(linearGradient2);
        n6Var4.u(AndroidUtilities.bold());
        n6Var4.t(AndroidUtilities.dp(12.0f));
        n6Var4.f25425b = 17;
        int i12 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i12 < adVarArr.length) {
                ad adVar = new ad(this);
                adVarArr[i12] = adVar;
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 50331648);
                int v9 = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                adVar.v = radialGradient;
                Matrix matrix = new Matrix();
                adVar.f21479w = matrix;
                radialGradient.setLocalMatrix(matrix);
                adVar.f21474q.setShader(adVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, n6 n6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        n6Var.f25442w = (int) (f12 * 255.0f);
        n6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        n6Var.draw(canvas);
        canvas.restore();
        return n6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.bd... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.f(long, boolean, org.telegram.ui.Components.bd[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i10 < adVarArr.length) {
                ad adVar = adVarArr[i10];
                if (adVar.f21462b == null) {
                    boolean z10 = this.e;
                    int[] iArr = this.f22108f;
                    if (z10) {
                        adVar.f21462b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        adVar.f21462b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.S = false;
        while (true) {
            ad[] adVarArr = this.v;
            if (i10 < adVarArr.length) {
                Bitmap bitmap = adVarArr[i10].f21462b;
                if (bitmap != null) {
                    bitmap.recycle();
                    adVarArr[i10].f21462b = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(c());
        int dp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.f22105a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        qg.w1 w1Var = this.Q;
        if (w1Var != null) {
            w1Var.f40955a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f40955a.offset((getMeasuredWidth() - this.Q.f40955a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f40955a.height()) / 2.0f);
            this.Q.f40956b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.R = z10;
    }

    public void setSelected(int i10) {
        boolean z10;
        if (i10 == this.T) {
            return;
        }
        int i11 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i11 < adVarArr.length) {
                if (i10 == i11 && adVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                ad adVar = adVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                adVar.f21471n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }
}
