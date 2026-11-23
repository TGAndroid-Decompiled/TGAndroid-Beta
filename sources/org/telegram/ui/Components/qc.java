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
public abstract class qc extends View implements org.telegram.ui.ActionBar.c6 {
    public static final int[] f38791a0;
    public static final int[] f38792b0;
    public static long f38793c0;
    public static Long f38794d0;
    public static Long f38795e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final m6 N;
    public final m6 O;
    public final m6 P;
    public final m6 Q;
    public ug.s1 R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF f38796a;
    public final RectF f38797b;
    public final RectF f38798c;
    public final int d;
    public final boolean f38799e;
    public final int[] f38800f;
    public boolean h;
    public final c6 f38801n;
    public boolean f38802r;
    public final c6 f38803s;
    public final oc[] f38804w;
    public final float[] f38805x;
    public final RectF f38806y;

    static {
        int i7 = org.telegram.ui.ActionBar.n6.ck;
        int i10 = org.telegram.ui.ActionBar.n6.Yj;
        int i11 = org.telegram.ui.ActionBar.n6.Zj;
        int i12 = org.telegram.ui.ActionBar.n6.gk;
        int i13 = org.telegram.ui.ActionBar.n6.dk;
        int i14 = org.telegram.ui.ActionBar.n6.ak;
        int i15 = org.telegram.ui.ActionBar.n6.ek;
        int i16 = org.telegram.ui.ActionBar.n6.hk;
        int i17 = org.telegram.ui.ActionBar.n6.bk;
        f38791a0 = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        f38792b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f38793c0 = -1L;
    }

    public qc(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f38796a = new RectF();
        this.f38797b = new RectF();
        this.f38798c = new RectF();
        this.h = true;
        kr krVar = kr.h;
        this.f38801n = new c6(this, 750L, krVar);
        this.f38802r = false;
        this.f38803s = new c6(this, 650L, krVar);
        this.f38805x = new float[2];
        this.f38806y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        m6 m6Var = new m6(false, true, true);
        this.N = m6Var;
        m6 m6Var2 = new m6(false, true, true);
        this.O = m6Var2;
        m6 m6Var3 = new m6(false, true, true);
        this.P = m6Var3;
        m6 m6Var4 = new m6(false, true, true);
        this.Q = m6Var4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f38800f = iArr2;
        this.d = i10;
        this.f38799e = i10 == 0;
        this.f38804w = new oc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false));
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
        m6Var.n(0.2f, 450L, krVar);
        m6Var.B = 0.6f;
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.w(org.telegram.messenger.g0.L(32.0f));
        m6Var.f37394b = 17;
        m6Var2.n(0.6f, 450L, krVar);
        m6Var2.B = 0.6f;
        m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false));
        m6Var2.w(org.telegram.messenger.g0.L(12.0f));
        m6Var2.f37394b = 17;
        m6Var3.n(0.2f, 450L, krVar);
        m6Var3.B = 0.6f;
        m6Var3.f37392a.setShader(linearGradient2);
        m6Var3.x(org.telegram.messenger.g0.o());
        m6Var3.w(org.telegram.messenger.g0.L(32.0f));
        m6Var3.f37394b = 17;
        m6Var4.n(0.6f, 450L, krVar);
        m6Var4.B = 0.6f;
        m6Var4.f37392a.setShader(linearGradient2);
        m6Var4.x(org.telegram.messenger.g0.o());
        m6Var4.w(org.telegram.messenger.g0.L(12.0f));
        m6Var4.f37394b = 17;
        int i11 = 0;
        while (true) {
            oc[] ocVarArr = this.f38804w;
            if (i11 < ocVarArr.length) {
                oc ocVar = new oc(this);
                ocVarArr[i11] = ocVar;
                int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, iArr[i11], false), 50331648);
                int w11 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, iArr[i11], false), 822083583);
                org.telegram.messenger.g0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                ocVar.v = radialGradient;
                Matrix matrix = new Matrix();
                ocVar.f38102w = matrix;
                radialGradient.setLocalMatrix(matrix);
                ocVar.f38097q.setShader(ocVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, m6 m6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        m6Var.C = (int) (f13 * 255.0f);
        m6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        m6Var.draw(canvas);
        canvas.restore();
        return m6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i7, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.pc... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.f(long, boolean, org.telegram.ui.Components.pc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i7 = 0;
        while (true) {
            oc[] ocVarArr = this.f38804w;
            if (i7 < ocVarArr.length) {
                oc ocVar = ocVarArr[i7];
                if (ocVar.f38084b == null) {
                    boolean z10 = this.f38799e;
                    int[] iArr = this.f38800f;
                    if (z10) {
                        ocVar.f38084b = org.telegram.messenger.lz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                    } else {
                        ocVar.f38084b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
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
            oc[] ocVarArr = this.f38804w;
            if (i7 < ocVarArr.length) {
                Bitmap bitmap = ocVarArr[i7].f38084b;
                if (bitmap != null) {
                    bitmap.recycle();
                    ocVarArr[i7].f38084b = null;
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
        RectF rectF = this.f38796a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.L;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.J.setLocalMatrix(matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.K.setLocalMatrix(matrix2);
        ug.s1 s1Var = this.R;
        if (s1Var != null) {
            s1Var.f59011a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.R.f59011a.offset((getMeasuredWidth() - this.R.f59011a.width()) / 2.0f, (getMeasuredHeight() - this.R.f59011a.height()) / 2.0f);
            this.R.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            oc[] ocVarArr = this.f38804w;
            if (i10 < ocVarArr.length) {
                if (i7 == i10 && ocVarArr[i10].d <= 0.0f) {
                    i7 = -1;
                }
                oc ocVar = ocVarArr[i10];
                if (i7 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ocVar.f38094n = z10;
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
            this.E.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false));
            try {
                m6 m6Var = this.N;
                if (m6Var != null) {
                    m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                }
                m6 m6Var2 = this.O;
                if (m6Var2 != null) {
                    m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false));
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
