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
public abstract class ic extends View implements org.telegram.ui.ActionBar.z5 {
    public static final int[] f35567a0;
    public static final int[] f35568b0;
    public static long f35569c0;
    public static Long f35570d0;
    public static Long f35571e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final g6 N;
    public final g6 O;
    public final g6 P;
    public final g6 Q;
    public ug.r1 R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF f35572a;
    public final RectF f35573b;
    public final RectF f35574c;
    public final int d;
    public final boolean f35575e;
    public final int[] f35576f;
    public boolean h;
    public final u5 f35577n;
    public boolean f35578r;
    public final u5 f35579s;
    public final gc[] f35580w;
    public final float[] f35581x;
    public final RectF f35582y;

    static {
        int i7 = org.telegram.ui.ActionBar.j6.ck;
        int i10 = org.telegram.ui.ActionBar.j6.Yj;
        int i11 = org.telegram.ui.ActionBar.j6.Zj;
        int i12 = org.telegram.ui.ActionBar.j6.gk;
        int i13 = org.telegram.ui.ActionBar.j6.dk;
        int i14 = org.telegram.ui.ActionBar.j6.ak;
        int i15 = org.telegram.ui.ActionBar.j6.ek;
        int i16 = org.telegram.ui.ActionBar.j6.hk;
        int i17 = org.telegram.ui.ActionBar.j6.bk;
        f35567a0 = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        f35568b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f35569c0 = -1L;
    }

    public ic(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f35572a = new RectF();
        this.f35573b = new RectF();
        this.f35574c = new RectF();
        this.h = true;
        er erVar = er.h;
        this.f35577n = new u5(this, 750L, erVar);
        this.f35578r = false;
        this.f35579s = new u5(this, 650L, erVar);
        this.f35581x = new float[2];
        this.f35582y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        g6 g6Var = new g6(false, true, true);
        this.N = g6Var;
        g6 g6Var2 = new g6(false, true, true);
        this.O = g6Var2;
        g6 g6Var3 = new g6(false, true, true);
        this.P = g6Var3;
        g6 g6Var4 = new g6(false, true, true);
        this.Q = g6Var4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f35576f = iArr2;
        this.d = i10;
        this.f35575e = i10 == 0;
        this.f35580w = new gc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        g6Var.n(0.2f, 450L, erVar);
        g6Var.B = 0.6f;
        g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(32.0f));
        g6Var.f34833b = 17;
        g6Var2.n(0.6f, 450L, erVar);
        g6Var2.B = 0.6f;
        g6Var2.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false));
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.f34833b = 17;
        g6Var3.n(0.2f, 450L, erVar);
        g6Var3.B = 0.6f;
        g6Var3.f34831a.setShader(linearGradient2);
        g6Var3.x(org.telegram.messenger.g0.o());
        g6Var3.w(org.telegram.messenger.g0.L(32.0f));
        g6Var3.f34833b = 17;
        g6Var4.n(0.6f, 450L, erVar);
        g6Var4.B = 0.6f;
        g6Var4.f34831a.setShader(linearGradient2);
        g6Var4.x(org.telegram.messenger.g0.o());
        g6Var4.w(org.telegram.messenger.g0.L(12.0f));
        g6Var4.f34833b = 17;
        int i11 = 0;
        while (true) {
            gc[] gcVarArr = this.f35580w;
            if (i11 < gcVarArr.length) {
                gc gcVar = new gc(this);
                gcVarArr[i11] = gcVar;
                int w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, iArr[i11], false), 50331648);
                int w11 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, iArr[i11], false), 822083583);
                org.telegram.messenger.g0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                gcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                gcVar.f34899w = matrix;
                radialGradient.setLocalMatrix(matrix);
                gcVar.f34894q.setShader(gcVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, g6 g6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        g6Var.C = (int) (f13 * 255.0f);
        g6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        g6Var.draw(canvas);
        canvas.restore();
        return g6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i7, boolean z10);

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
        this.T = true;
        int i7 = 0;
        while (true) {
            gc[] gcVarArr = this.f35580w;
            if (i7 < gcVarArr.length) {
                gc gcVar = gcVarArr[i7];
                if (gcVar.f34881b == null) {
                    boolean z10 = this.f35575e;
                    int[] iArr = this.f35576f;
                    if (z10) {
                        gcVar.f34881b = org.telegram.messenger.qz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                    } else {
                        gcVar.f34881b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
                    }
                }
                i7++;
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
        int i7 = 0;
        this.T = false;
        while (true) {
            gc[] gcVarArr = this.f35580w;
            if (i7 < gcVarArr.length) {
                Bitmap bitmap = gcVarArr[i7].f34881b;
                if (bitmap != null) {
                    bitmap.recycle();
                    gcVarArr[i7].f34881b = null;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(c());
        int L2 = org.telegram.messenger.g0.L(172.0f);
        RectF rectF = this.f35572a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.L;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.J.setLocalMatrix(matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.K.setLocalMatrix(matrix2);
        ug.r1 r1Var = this.R;
        if (r1Var != null) {
            r1Var.f58305a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.R.f58305a.offset((getMeasuredWidth() - this.R.f58305a.width()) / 2.0f, (getMeasuredHeight() - this.R.f58305a.height()) / 2.0f);
            this.R.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.R.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.S = z10;
    }

    public void setSelected(int i7) {
        boolean z10;
        if (i7 == this.U) {
            return;
        }
        int i10 = 0;
        while (true) {
            gc[] gcVarArr = this.f35580w;
            if (i10 < gcVarArr.length) {
                if (i7 == i10 && gcVarArr[i10].d <= 0.0f) {
                    i7 = -1;
                }
                gc gcVar = gcVarArr[i10];
                if (i7 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gcVar.f34891n = z10;
                i10++;
            } else {
                this.U = i7;
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.E.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false));
            try {
                g6 g6Var = this.N;
                if (g6Var != null) {
                    g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                }
                g6 g6Var2 = this.O;
                if (g6Var2 != null) {
                    g6Var2.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
