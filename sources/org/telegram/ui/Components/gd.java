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
public abstract class gd extends View {
    public static final int[] W;
    public static final int[] f26665a0;
    public static long f26666b0;
    public static Long f26667c0;
    public static Long f26668d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final q6 M;
    public final q6 N;
    public final q6 O;
    public final q6 P;
    public rg.v1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f26669a;
    public final RectF f26670b;
    public final RectF f26671c;
    public final int d;
    public final boolean f26672e;
    public final int[] f26673f;
    public boolean h;
    public final g6 f26674n;
    public boolean f26675r;
    public final g6 f26676s;
    public final ed[] v;
    public final float[] f26677w;
    public final RectF f26678x;
    public final Paint f26679y;

    static {
        int i10 = org.telegram.ui.ActionBar.i6.lj;
        int i11 = org.telegram.ui.ActionBar.i6.hj;
        int i12 = org.telegram.ui.ActionBar.i6.ij;
        int i13 = org.telegram.ui.ActionBar.i6.pj;
        int i14 = org.telegram.ui.ActionBar.i6.mj;
        int i15 = org.telegram.ui.ActionBar.i6.jj;
        int i16 = org.telegram.ui.ActionBar.i6.nj;
        int i17 = org.telegram.ui.ActionBar.i6.qj;
        int i18 = org.telegram.ui.ActionBar.i6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        f26665a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f26666b0 = -1L;
    }

    public gd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f26669a = new RectF();
        this.f26670b = new RectF();
        this.f26671c = new RectF();
        this.h = true;
        hs hsVar = hs.h;
        this.f26674n = new g6(this, 750L, hsVar);
        this.f26675r = false;
        this.f26676s = new g6(this, 650L, hsVar);
        this.f26677w = new float[2];
        this.f26678x = new RectF();
        Paint paint = new Paint(1);
        this.f26679y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        q6 q6Var = new q6(false, true, true);
        this.M = q6Var;
        q6 q6Var2 = new q6(false, true, true);
        this.N = q6Var2;
        q6 q6Var3 = new q6(false, true, true);
        this.O = q6Var3;
        q6 q6Var4 = new q6(false, true, true);
        this.P = q6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f26673f = iArr2;
        this.d = i11;
        this.f26672e = i11 == 0;
        this.v = new ed[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false));
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
        q6Var.n(0.2f, 450L, hsVar);
        q6Var.A = 0.6f;
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(32.0f));
        q6Var.f30065b = 17;
        q6Var2.n(0.6f, 450L, hsVar);
        q6Var2.A = 0.6f;
        q6Var2.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false));
        q6Var2.w(AndroidUtilities.dp(12.0f));
        q6Var2.f30065b = 17;
        q6Var3.n(0.2f, 450L, hsVar);
        q6Var3.A = 0.6f;
        q6Var3.f30063a.setShader(linearGradient2);
        q6Var3.x(AndroidUtilities.bold());
        q6Var3.w(AndroidUtilities.dp(32.0f));
        q6Var3.f30065b = 17;
        q6Var4.n(0.6f, 450L, hsVar);
        q6Var4.A = 0.6f;
        q6Var4.f30063a.setShader(linearGradient2);
        q6Var4.x(AndroidUtilities.bold());
        q6Var4.w(AndroidUtilities.dp(12.0f));
        q6Var4.f30065b = 17;
        int i12 = 0;
        while (true) {
            ed[] edVarArr = this.v;
            if (i12 < edVarArr.length) {
                ed edVar = new ed(this);
                edVarArr[i12] = edVar;
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, iArr[i12], false), 50331648);
                int v9 = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                edVar.v = radialGradient;
                Matrix matrix = new Matrix();
                edVar.f26054w = matrix;
                radialGradient.setLocalMatrix(matrix);
                edVar.f26049q.setShader(edVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, q6 q6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        q6Var.B = (int) (f12 * 255.0f);
        q6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        q6Var.draw(canvas);
        canvas.restore();
        return q6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.fd... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.f(long, boolean, org.telegram.ui.Components.fd[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            ed[] edVarArr = this.v;
            if (i10 < edVarArr.length) {
                ed edVar = edVarArr[i10];
                if (edVar.f26036b == null) {
                    boolean z10 = this.f26672e;
                    int[] iArr = this.f26673f;
                    if (z10) {
                        edVar.f26036b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        edVar.f26036b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            ed[] edVarArr = this.v;
            if (i10 < edVarArr.length) {
                Bitmap bitmap = edVarArr[i10].f26036b;
                if (bitmap != null) {
                    bitmap.recycle();
                    edVarArr[i10].f26036b = null;
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
        RectF rectF = this.f26669a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        rg.v1 v1Var = this.Q;
        if (v1Var != null) {
            v1Var.f47474a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f47474a.offset((getMeasuredWidth() - this.Q.f47474a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f47474a.height()) / 2.0f);
            this.Q.f47475b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            ed[] edVarArr = this.v;
            if (i11 < edVarArr.length) {
                if (i10 == i11 && edVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                ed edVar = edVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                edVar.f26046n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }
}
