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
import java.util.HashSet;
public abstract class ic extends View implements org.telegram.ui.ActionBar.k6 {
    public static final int[] W;
    public static final int[] f27066a0;
    public static long f27067b0;
    public static Long f27068c0;
    public static Long f27069d0;
    public final Paint D;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final e6 M;
    public final e6 N;
    public final e6 O;
    public final e6 P;
    public kg.f2 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f27070a;
    public final RectF f27071b;
    public final RectF f27072c;
    public final int d;
    public final boolean e;
    public final int[] f27073f;
    public boolean h;
    public final t5 f27074n;
    public boolean f27075r;
    public final t5 f27076s;
    public final gc[] f27077w;
    public final float[] f27078x;
    public final RectF f27079y;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.Zj;
        int i11 = org.telegram.ui.ActionBar.t6.Vj;
        int i12 = org.telegram.ui.ActionBar.t6.Wj;
        int i13 = org.telegram.ui.ActionBar.t6.dk;
        int i14 = org.telegram.ui.ActionBar.t6.ak;
        int i15 = org.telegram.ui.ActionBar.t6.Xj;
        int i16 = org.telegram.ui.ActionBar.t6.bk;
        int i17 = org.telegram.ui.ActionBar.t6.ek;
        int i18 = org.telegram.ui.ActionBar.t6.Yj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        f27066a0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f27067b0 = -1L;
    }

    public ic(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f27070a = new RectF();
        this.f27071b = new RectF();
        this.f27072c = new RectF();
        this.h = true;
        gr grVar = gr.h;
        this.f27074n = new t5(this, 750L, grVar);
        this.f27075r = false;
        this.f27076s = new t5(this, 650L, grVar);
        this.f27078x = new float[2];
        this.f27079y = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        e6 e6Var = new e6(false, true, true);
        this.M = e6Var;
        e6 e6Var2 = new e6(false, true, true);
        this.N = e6Var2;
        e6 e6Var3 = new e6(false, true, true);
        this.O = e6Var3;
        e6 e6Var4 = new e6(false, true, true);
        this.P = e6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f27073f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.f27077w = new gc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        e6Var.n(0.2f, 450L, grVar);
        e6Var.A = 0.6f;
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(32.0f));
        e6Var.f25744b = 17;
        e6Var2.n(0.6f, 450L, grVar);
        e6Var2.A = 0.6f;
        e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false));
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.f25744b = 17;
        e6Var3.n(0.2f, 450L, grVar);
        e6Var3.A = 0.6f;
        e6Var3.f25742a.setShader(linearGradient2);
        e6Var3.x(org.telegram.messenger.i0.o());
        e6Var3.w(org.telegram.messenger.i0.L(32.0f));
        e6Var3.f25744b = 17;
        e6Var4.n(0.6f, 450L, grVar);
        e6Var4.A = 0.6f;
        e6Var4.f25742a.setShader(linearGradient2);
        e6Var4.x(org.telegram.messenger.i0.o());
        e6Var4.w(org.telegram.messenger.i0.L(12.0f));
        e6Var4.f25744b = 17;
        int i12 = 0;
        while (true) {
            gc[] gcVarArr = this.f27077w;
            if (i12 < gcVarArr.length) {
                gc gcVar = new gc(this);
                gcVarArr[i12] = gcVar;
                int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, iArr[i12], false), 50331648);
                int w10 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, iArr[i12], false), 822083583);
                org.telegram.messenger.i0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(86.0f), new int[]{w10, w9}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                gcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                gcVar.f26406w = matrix;
                radialGradient.setLocalMatrix(matrix);
                gcVar.f26401q.setShader(gcVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, e6 e6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        e6Var.B = (int) (f12 * 255.0f);
        e6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        e6Var.draw(canvas);
        canvas.restore();
        return e6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.hc... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ic.f(long, boolean, org.telegram.ui.Components.hc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            gc[] gcVarArr = this.f27077w;
            if (i10 < gcVarArr.length) {
                gc gcVar = gcVarArr[i10];
                if (gcVar.f26389b == null) {
                    boolean z10 = this.e;
                    int[] iArr = this.f27073f;
                    if (z10) {
                        gcVar.f26389b = org.telegram.messenger.e00.d(iArr[i10], org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), -1);
                    } else {
                        gcVar.f26389b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            gc[] gcVarArr = this.f27077w;
            if (i10 < gcVarArr.length) {
                Bitmap bitmap = gcVarArr[i10].f26389b;
                if (bitmap != null) {
                    bitmap.recycle();
                    gcVarArr[i10].f26389b = null;
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
        int L = org.telegram.messenger.i0.L(c());
        int L2 = org.telegram.messenger.i0.L(172.0f);
        RectF rectF = this.f27070a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        kg.f2 f2Var = this.Q;
        if (f2Var != null) {
            f2Var.f11069a.set(0.0f, 0.0f, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(140.0f));
            this.Q.f11069a.offset((getMeasuredWidth() - this.Q.f11069a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f11069a.height()) / 2.0f);
            this.Q.f11070b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
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
            gc[] gcVarArr = this.f27077w;
            if (i11 < gcVarArr.length) {
                if (i10 == i11 && gcVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                gc gcVar = gcVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gcVar.f26398n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.D.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false));
            try {
                e6 e6Var = this.M;
                if (e6Var != null) {
                    e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                }
                e6 e6Var2 = this.N;
                if (e6Var2 != null) {
                    e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            invalidate();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
