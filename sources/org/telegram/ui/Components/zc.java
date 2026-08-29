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
public abstract class zc extends View {
    public static final int[] S;
    public static final int[] T;
    public static long U;
    public static Long V;
    public static Long W;
    public RectF A;
    public final Path B;
    public final Paint C;
    public final Paint D;
    public final LinearGradient E;
    public final LinearGradient F;
    public final Matrix G;
    public final Matrix H;
    public final n6 I;
    public final n6 J;
    public final n6 K;
    public final n6 L;
    public cg.r2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int[] Q;
    public float[] R;
    public final RectF f35302a;
    public final RectF f35303b;
    public final RectF f35304c;
    public final int d;
    public final boolean f35305e;
    public final int[] f35306f;
    public boolean h;
    public final d6 f35307n;
    public boolean f35308r;
    public final d6 f35309s;
    public final xc[] v;
    public final float[] f35310w;
    public final RectF f35311x;
    public final Paint f35312y;

    static {
        int i10 = org.telegram.ui.ActionBar.g6.lj;
        int i11 = org.telegram.ui.ActionBar.g6.hj;
        int i12 = org.telegram.ui.ActionBar.g6.ij;
        int i13 = org.telegram.ui.ActionBar.g6.pj;
        int i14 = org.telegram.ui.ActionBar.g6.mj;
        int i15 = org.telegram.ui.ActionBar.g6.jj;
        int i16 = org.telegram.ui.ActionBar.g6.nj;
        int i17 = org.telegram.ui.ActionBar.g6.qj;
        int i18 = org.telegram.ui.ActionBar.g6.kj;
        S = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        T = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        U = -1L;
    }

    public zc(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f35302a = new RectF();
        this.f35303b = new RectF();
        this.f35304c = new RectF();
        this.h = true;
        jr jrVar = jr.h;
        this.f35307n = new d6(this, 750L, jrVar);
        this.f35308r = false;
        this.f35309s = new d6(this, 650L, jrVar);
        this.f35310w = new float[2];
        this.f35311x = new RectF();
        Paint paint = new Paint(1);
        this.f35312y = paint;
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        Paint paint3 = new Paint(1);
        this.D = paint3;
        n6 n6Var = new n6(false, true, true, false);
        this.I = n6Var;
        n6 n6Var2 = new n6(false, true, true, false);
        this.J = n6Var2;
        n6 n6Var3 = new n6(false, true, true, false);
        this.K = n6Var3;
        n6 n6Var4 = new n6(false, true, true, false);
        this.L = n6Var4;
        this.N = true;
        this.P = -1;
        setLayerType(2, null);
        this.f35306f = iArr2;
        this.d = i11;
        this.f35305e = i11 == 0;
        this.v = new xc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.E = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient2;
        this.G = new Matrix();
        this.H = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        n6Var.k(0.2f, 450L, jrVar);
        n6Var.v = 0.6f;
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(32.0f));
        n6Var.f30862b = 17;
        n6Var2.k(0.6f, 450L, jrVar);
        n6Var2.v = 0.6f;
        n6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
        n6Var2.t(AndroidUtilities.dp(12.0f));
        n6Var2.f30862b = 17;
        n6Var3.k(0.2f, 450L, jrVar);
        n6Var3.v = 0.6f;
        n6Var3.f30861a.setShader(linearGradient2);
        n6Var3.u(AndroidUtilities.bold());
        n6Var3.t(AndroidUtilities.dp(32.0f));
        n6Var3.f30862b = 17;
        n6Var4.k(0.6f, 450L, jrVar);
        n6Var4.v = 0.6f;
        n6Var4.f30861a.setShader(linearGradient2);
        n6Var4.u(AndroidUtilities.bold());
        n6Var4.t(AndroidUtilities.dp(12.0f));
        n6Var4.f30862b = 17;
        int i12 = 0;
        while (true) {
            xc[] xcVarArr = this.v;
            if (i12 < xcVarArr.length) {
                xc xcVar = new xc(this);
                xcVarArr[i12] = xcVar;
                int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), 50331648);
                int v10 = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                xcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                xcVar.f34694w = matrix;
                radialGradient.setLocalMatrix(matrix);
                xcVar.f34689q.setShader(xcVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f9) {
        return (float) ((f9 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, n6 n6Var, float f9, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        n6Var.f30880w = (int) (f12 * 255.0f);
        n6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f9, f10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.yc... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc.f(long, boolean, org.telegram.ui.Components.yc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            xc[] xcVarArr = this.v;
            if (i10 < xcVarArr.length) {
                xc xcVar = xcVarArr[i10];
                if (xcVar.f34676b == null) {
                    boolean z10 = this.f35305e;
                    int[] iArr = this.f35306f;
                    if (z10) {
                        xcVar.f34676b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        xcVar.f34676b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
        this.O = false;
        while (true) {
            xc[] xcVarArr = this.v;
            if (i10 < xcVarArr.length) {
                Bitmap bitmap = xcVarArr[i10].f34676b;
                if (bitmap != null) {
                    bitmap.recycle();
                    xcVarArr[i10].f34676b = null;
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
        RectF rectF = this.f35302a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.G;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.E.setLocalMatrix(matrix);
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.F.setLocalMatrix(matrix2);
        cg.r2 r2Var = this.M;
        if (r2Var != null) {
            r2Var.f3330a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.M.f3330a.offset((getMeasuredWidth() - this.M.f3330a.width()) / 2.0f, (getMeasuredHeight() - this.M.f3330a.height()) / 2.0f);
            this.M.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.N = z10;
    }

    public void setSelected(int i10) {
        boolean z10;
        if (i10 == this.P) {
            return;
        }
        int i11 = 0;
        while (true) {
            xc[] xcVarArr = this.v;
            if (i11 < xcVarArr.length) {
                if (i10 == i11 && xcVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                xc xcVar = xcVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xcVar.f34686n = z10;
                i11++;
            } else {
                this.P = i10;
                invalidate();
                return;
            }
        }
    }
}
