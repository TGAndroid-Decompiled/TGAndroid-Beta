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
public abstract class bd extends View {
    public static final int[] W;
    public static final int[] f22704a0;
    public static long f22705b0;
    public static Long f22706c0;
    public static Long f22707d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final m6 M;
    public final m6 N;
    public final m6 O;
    public final m6 P;
    public rg.u1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f22708a;
    public final RectF f22709b;
    public final RectF f22710c;
    public final int d;
    public final boolean e;
    public final int[] f22711f;
    public boolean h;
    public final c6 f22712n;
    public boolean f22713r;
    public final c6 f22714s;
    public final zc[] v;
    public final float[] f22715w;
    public final RectF f22716x;
    public final Paint f22717y;

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
        f22704a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f22705b0 = -1L;
    }

    public bd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f22708a = new RectF();
        this.f22709b = new RectF();
        this.f22710c = new RectF();
        this.h = true;
        qr qrVar = qr.h;
        this.f22712n = new c6(this, 750L, qrVar);
        this.f22713r = false;
        this.f22714s = new c6(this, 650L, qrVar);
        this.f22715w = new float[2];
        this.f22716x = new RectF();
        Paint paint = new Paint(1);
        this.f22717y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        m6 m6Var = new m6(false, true, true, false);
        this.M = m6Var;
        m6 m6Var2 = new m6(false, true, true, false);
        this.N = m6Var2;
        m6 m6Var3 = new m6(false, true, true, false);
        this.O = m6Var3;
        m6 m6Var4 = new m6(false, true, true, false);
        this.P = m6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f22711f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new zc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18953i6, false));
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
        m6Var.k(0.2f, 450L, qrVar);
        m6Var.v = 0.6f;
        m6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        m6Var.u(AndroidUtilities.bold());
        m6Var.t(AndroidUtilities.dp(32.0f));
        m6Var.f26070b = 17;
        m6Var2.k(0.6f, 450L, qrVar);
        m6Var2.v = 0.6f;
        m6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19245y6, false));
        m6Var2.t(AndroidUtilities.dp(12.0f));
        m6Var2.f26070b = 17;
        m6Var3.k(0.2f, 450L, qrVar);
        m6Var3.v = 0.6f;
        m6Var3.f26069a.setShader(linearGradient2);
        m6Var3.u(AndroidUtilities.bold());
        m6Var3.t(AndroidUtilities.dp(32.0f));
        m6Var3.f26070b = 17;
        m6Var4.k(0.6f, 450L, qrVar);
        m6Var4.v = 0.6f;
        m6Var4.f26069a.setShader(linearGradient2);
        m6Var4.u(AndroidUtilities.bold());
        m6Var4.t(AndroidUtilities.dp(12.0f));
        m6Var4.f26070b = 17;
        int i12 = 0;
        while (true) {
            zc[] zcVarArr = this.v;
            if (i12 < zcVarArr.length) {
                zc zcVar = new zc(this);
                zcVarArr[i12] = zcVar;
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 50331648);
                int v9 = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                zcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                zcVar.f30493w = matrix;
                radialGradient.setLocalMatrix(matrix);
                zcVar.f30488q.setShader(zcVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, m6 m6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        m6Var.f26087w = (int) (f12 * 255.0f);
        m6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        m6Var.draw(canvas);
        canvas.restore();
        return m6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bd.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.ad... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bd.f(long, boolean, org.telegram.ui.Components.ad[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            zc[] zcVarArr = this.v;
            if (i10 < zcVarArr.length) {
                zc zcVar = zcVarArr[i10];
                if (zcVar.f30476b == null) {
                    boolean z10 = this.e;
                    int[] iArr = this.f22711f;
                    if (z10) {
                        zcVar.f30476b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        zcVar.f30476b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            zc[] zcVarArr = this.v;
            if (i10 < zcVarArr.length) {
                Bitmap bitmap = zcVarArr[i10].f30476b;
                if (bitmap != null) {
                    bitmap.recycle();
                    zcVarArr[i10].f30476b = null;
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
        RectF rectF = this.f22708a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        rg.u1 u1Var = this.Q;
        if (u1Var != null) {
            u1Var.f42523a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f42523a.offset((getMeasuredWidth() - this.Q.f42523a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f42523a.height()) / 2.0f);
            this.Q.f42524b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            zc[] zcVarArr = this.v;
            if (i11 < zcVarArr.length) {
                if (i10 == i11 && zcVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                zc zcVar = zcVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zcVar.f30485n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }
}
