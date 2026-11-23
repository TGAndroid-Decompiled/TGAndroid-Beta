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
public abstract class rc extends View implements org.telegram.ui.ActionBar.b6 {
    public static final int[] f39098a0;
    public static final int[] f39099b0;
    public static long f39100c0;
    public static Long f39101d0;
    public static Long f39102e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final n6 N;
    public final n6 O;
    public final n6 P;
    public final n6 Q;
    public ug.s1 R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF f39103a;
    public final RectF f39104b;
    public final RectF f39105c;
    public final int d;
    public final boolean f39106e;
    public final int[] f39107f;
    public boolean h;
    public final d6 f39108n;
    public boolean f39109r;
    public final d6 f39110s;
    public final pc[] f39111w;
    public final float[] f39112x;
    public final RectF f39113y;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.ck;
        int i10 = org.telegram.ui.ActionBar.m6.Yj;
        int i11 = org.telegram.ui.ActionBar.m6.Zj;
        int i12 = org.telegram.ui.ActionBar.m6.gk;
        int i13 = org.telegram.ui.ActionBar.m6.dk;
        int i14 = org.telegram.ui.ActionBar.m6.ak;
        int i15 = org.telegram.ui.ActionBar.m6.ek;
        int i16 = org.telegram.ui.ActionBar.m6.hk;
        int i17 = org.telegram.ui.ActionBar.m6.bk;
        f39098a0 = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        f39099b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f39100c0 = -1L;
    }

    public rc(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f39103a = new RectF();
        this.f39104b = new RectF();
        this.f39105c = new RectF();
        this.h = true;
        nr nrVar = nr.h;
        this.f39108n = new d6(this, 750L, nrVar);
        this.f39109r = false;
        this.f39110s = new d6(this, 650L, nrVar);
        this.f39112x = new float[2];
        this.f39113y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        n6 n6Var = new n6(false, true, true);
        this.N = n6Var;
        n6 n6Var2 = new n6(false, true, true);
        this.O = n6Var2;
        n6 n6Var3 = new n6(false, true, true);
        this.P = n6Var3;
        n6 n6Var4 = new n6(false, true, true);
        this.Q = n6Var4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f39107f = iArr2;
        this.d = i10;
        this.f39106e = i10 == 0;
        this.f39111w = new pc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29439i6, false));
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
        n6Var.n(0.2f, 450L, nrVar);
        n6Var.B = 0.6f;
        n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.w(org.telegram.messenger.g0.L(32.0f));
        n6Var.f37751b = 17;
        n6Var2.n(0.6f, 450L, nrVar);
        n6Var2.B = 0.6f;
        n6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29739y6, false));
        n6Var2.w(org.telegram.messenger.g0.L(12.0f));
        n6Var2.f37751b = 17;
        n6Var3.n(0.2f, 450L, nrVar);
        n6Var3.B = 0.6f;
        n6Var3.f37749a.setShader(linearGradient2);
        n6Var3.x(org.telegram.messenger.g0.o());
        n6Var3.w(org.telegram.messenger.g0.L(32.0f));
        n6Var3.f37751b = 17;
        n6Var4.n(0.6f, 450L, nrVar);
        n6Var4.B = 0.6f;
        n6Var4.f37749a.setShader(linearGradient2);
        n6Var4.x(org.telegram.messenger.g0.o());
        n6Var4.w(org.telegram.messenger.g0.L(12.0f));
        n6Var4.f37751b = 17;
        int i11 = 0;
        while (true) {
            pc[] pcVarArr = this.f39111w;
            if (i11 < pcVarArr.length) {
                pc pcVar = new pc(this);
                pcVarArr[i11] = pcVar;
                int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, iArr[i11], false), 50331648);
                int w11 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, iArr[i11], false), 822083583);
                org.telegram.messenger.g0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                pcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                pcVar.f38521w = matrix;
                radialGradient.setLocalMatrix(matrix);
                pcVar.f38516q.setShader(pcVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, n6 n6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        n6Var.C = (int) (f13 * 255.0f);
        n6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        n6Var.draw(canvas);
        canvas.restore();
        return n6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i7, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.qc... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.f(long, boolean, org.telegram.ui.Components.qc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i7 = 0;
        while (true) {
            pc[] pcVarArr = this.f39111w;
            if (i7 < pcVarArr.length) {
                pc pcVar = pcVarArr[i7];
                if (pcVar.f38503b == null) {
                    boolean z10 = this.f39106e;
                    int[] iArr = this.f39107f;
                    if (z10) {
                        pcVar.f38503b = org.telegram.messenger.nz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                    } else {
                        pcVar.f38503b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
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
            pc[] pcVarArr = this.f39111w;
            if (i7 < pcVarArr.length) {
                Bitmap bitmap = pcVarArr[i7].f38503b;
                if (bitmap != null) {
                    bitmap.recycle();
                    pcVarArr[i7].f38503b = null;
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
        RectF rectF = this.f39103a;
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
            s1Var.f58896a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.R.f58896a.offset((getMeasuredWidth() - this.R.f58896a.width()) / 2.0f, (getMeasuredHeight() - this.R.f58896a.height()) / 2.0f);
            this.R.f58897b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            pc[] pcVarArr = this.f39111w;
            if (i10 < pcVarArr.length) {
                if (i7 == i10 && pcVarArr[i10].d <= 0.0f) {
                    i7 = -1;
                }
                pc pcVar = pcVarArr[i10];
                if (i7 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pcVar.f38513n = z10;
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
            this.E.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29439i6, false));
            try {
                n6 n6Var = this.N;
                if (n6Var != null) {
                    n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                }
                n6 n6Var2 = this.O;
                if (n6Var2 != null) {
                    n6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29739y6, false));
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
