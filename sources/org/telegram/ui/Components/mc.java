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
public abstract class mc extends View implements org.telegram.ui.ActionBar.c6 {
    public static final int[] W;
    public static final int[] f35920a0;
    public static long f35921b0;
    public static Long f35922c0;
    public static Long f35923d0;
    public final Paint D;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final h6 M;
    public final h6 N;
    public final h6 O;
    public final h6 P;
    public ug.p1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f35924a;
    public final RectF f35925b;
    public final RectF f35926c;
    public final int d;
    public final boolean f35927e;
    public final int[] f35928f;
    public boolean h;
    public final v5 f35929n;
    public boolean f35930r;
    public final v5 f35931s;
    public final kc[] f35932w;
    public final float[] f35933x;
    public final RectF f35934y;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.Zj;
        int i10 = org.telegram.ui.ActionBar.m6.Vj;
        int i11 = org.telegram.ui.ActionBar.m6.Wj;
        int i12 = org.telegram.ui.ActionBar.m6.dk;
        int i13 = org.telegram.ui.ActionBar.m6.ak;
        int i14 = org.telegram.ui.ActionBar.m6.Xj;
        int i15 = org.telegram.ui.ActionBar.m6.bk;
        int i16 = org.telegram.ui.ActionBar.m6.ek;
        int i17 = org.telegram.ui.ActionBar.m6.Yj;
        W = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        f35920a0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f35921b0 = -1L;
    }

    public mc(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f35924a = new RectF();
        this.f35925b = new RectF();
        this.f35926c = new RectF();
        this.h = true;
        wq wqVar = wq.h;
        this.f35929n = new v5(this, 750L, wqVar);
        this.f35930r = false;
        this.f35931s = new v5(this, 650L, wqVar);
        this.f35933x = new float[2];
        this.f35934y = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        h6 h6Var = new h6(false, true, true);
        this.M = h6Var;
        h6 h6Var2 = new h6(false, true, true);
        this.N = h6Var2;
        h6 h6Var3 = new h6(false, true, true);
        this.O = h6Var3;
        h6 h6Var4 = new h6(false, true, true);
        this.P = h6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f35928f = iArr2;
        this.d = i10;
        this.f35927e = i10 == 0;
        this.f35932w = new kc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        h6Var.n(0.2f, 450L, wqVar);
        h6Var.A = 0.6f;
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(32.0f));
        h6Var.f34187b = 17;
        h6Var2.n(0.6f, 450L, wqVar);
        h6Var2.A = 0.6f;
        h6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false));
        h6Var2.w(org.telegram.messenger.g0.L(12.0f));
        h6Var2.f34187b = 17;
        h6Var3.n(0.2f, 450L, wqVar);
        h6Var3.A = 0.6f;
        h6Var3.f34185a.setShader(linearGradient2);
        h6Var3.x(org.telegram.messenger.g0.o());
        h6Var3.w(org.telegram.messenger.g0.L(32.0f));
        h6Var3.f34187b = 17;
        h6Var4.n(0.6f, 450L, wqVar);
        h6Var4.A = 0.6f;
        h6Var4.f34185a.setShader(linearGradient2);
        h6Var4.x(org.telegram.messenger.g0.o());
        h6Var4.w(org.telegram.messenger.g0.L(12.0f));
        h6Var4.f34187b = 17;
        int i11 = 0;
        while (true) {
            kc[] kcVarArr = this.f35932w;
            if (i11 < kcVarArr.length) {
                kc kcVar = new kc(this);
                kcVarArr[i11] = kcVar;
                int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, iArr[i11], false), 50331648);
                int w11 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, iArr[i11], false), 822083583);
                org.telegram.messenger.g0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                kcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                kcVar.f35287w = matrix;
                radialGradient.setLocalMatrix(matrix);
                kcVar.f35282q.setShader(kcVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, h6 h6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        h6Var.B = (int) (f13 * 255.0f);
        h6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        h6Var.draw(canvas);
        canvas.restore();
        return h6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i7, boolean z9);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.lc... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mc.f(long, boolean, org.telegram.ui.Components.lc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i7 = 0;
        while (true) {
            kc[] kcVarArr = this.f35932w;
            if (i7 < kcVarArr.length) {
                kc kcVar = kcVarArr[i7];
                if (kcVar.f35269b == null) {
                    boolean z9 = this.f35927e;
                    int[] iArr = this.f35928f;
                    if (z9) {
                        kcVar.f35269b = org.telegram.messenger.sz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                    } else {
                        kcVar.f35269b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
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
        this.S = false;
        while (true) {
            kc[] kcVarArr = this.f35932w;
            if (i7 < kcVarArr.length) {
                Bitmap bitmap = kcVarArr[i7].f35269b;
                if (bitmap != null) {
                    bitmap.recycle();
                    kcVarArr[i7].f35269b = null;
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
        RectF rectF = this.f35924a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        ug.p1 p1Var = this.Q;
        if (p1Var != null) {
            p1Var.f56775a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.Q.f56775a.offset((getMeasuredWidth() - this.Q.f56775a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f56775a.height()) / 2.0f);
            this.Q.f56776b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    public void setInterceptTouch(boolean z9) {
        this.R = z9;
    }

    public void setSelected(int i7) {
        boolean z9;
        if (i7 == this.T) {
            return;
        }
        int i10 = 0;
        while (true) {
            kc[] kcVarArr = this.f35932w;
            if (i10 < kcVarArr.length) {
                if (i7 == i10 && kcVarArr[i10].d <= 0.0f) {
                    i7 = -1;
                }
                kc kcVar = kcVarArr[i10];
                if (i7 == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                kcVar.f35279n = z9;
                i10++;
            } else {
                this.T = i7;
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.D.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false));
            try {
                h6 h6Var = this.M;
                if (h6Var != null) {
                    h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                }
                h6 h6Var2 = this.N;
                if (h6Var2 != null) {
                    h6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false));
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
