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
public abstract class nc extends View implements org.telegram.ui.ActionBar.b6 {
    public static final int[] W;
    public static final int[] f36323a0;
    public static long f36324b0;
    public static Long f36325c0;
    public static Long f36326d0;
    public final Paint D;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final i6 M;
    public final i6 N;
    public final i6 O;
    public final i6 P;
    public ug.p1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f36327a;
    public final RectF f36328b;
    public final RectF f36329c;
    public final int d;
    public final boolean f36330e;
    public final int[] f36331f;
    public boolean h;
    public final w5 f36332n;
    public boolean f36333r;
    public final w5 f36334s;
    public final lc[] f36335w;
    public final float[] f36336x;
    public final RectF f36337y;

    static {
        int i7 = org.telegram.ui.ActionBar.l6.Zj;
        int i10 = org.telegram.ui.ActionBar.l6.Vj;
        int i11 = org.telegram.ui.ActionBar.l6.Wj;
        int i12 = org.telegram.ui.ActionBar.l6.dk;
        int i13 = org.telegram.ui.ActionBar.l6.ak;
        int i14 = org.telegram.ui.ActionBar.l6.Xj;
        int i15 = org.telegram.ui.ActionBar.l6.bk;
        int i16 = org.telegram.ui.ActionBar.l6.ek;
        int i17 = org.telegram.ui.ActionBar.l6.Yj;
        W = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        f36323a0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        f36324b0 = -1L;
    }

    public nc(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f36327a = new RectF();
        this.f36328b = new RectF();
        this.f36329c = new RectF();
        this.h = true;
        xq xqVar = xq.h;
        this.f36332n = new w5(this, 750L, xqVar);
        this.f36333r = false;
        this.f36334s = new w5(this, 650L, xqVar);
        this.f36336x = new float[2];
        this.f36337y = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        i6 i6Var = new i6(false, true, true);
        this.M = i6Var;
        i6 i6Var2 = new i6(false, true, true);
        this.N = i6Var2;
        i6 i6Var3 = new i6(false, true, true);
        this.O = i6Var3;
        i6 i6Var4 = new i6(false, true, true);
        this.P = i6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f36331f = iArr2;
        this.d = i10;
        this.f36330e = i10 == 0;
        this.f36335w = new lc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false));
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
        i6Var.n(0.2f, 450L, xqVar);
        i6Var.A = 0.6f;
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(32.0f));
        i6Var.f34587b = 17;
        i6Var2.n(0.6f, 450L, xqVar);
        i6Var2.A = 0.6f;
        i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false));
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.f34587b = 17;
        i6Var3.n(0.2f, 450L, xqVar);
        i6Var3.A = 0.6f;
        i6Var3.f34585a.setShader(linearGradient2);
        i6Var3.x(org.telegram.messenger.g0.o());
        i6Var3.w(org.telegram.messenger.g0.L(32.0f));
        i6Var3.f34587b = 17;
        i6Var4.n(0.6f, 450L, xqVar);
        i6Var4.A = 0.6f;
        i6Var4.f34585a.setShader(linearGradient2);
        i6Var4.x(org.telegram.messenger.g0.o());
        i6Var4.w(org.telegram.messenger.g0.L(12.0f));
        i6Var4.f34587b = 17;
        int i11 = 0;
        while (true) {
            lc[] lcVarArr = this.f36335w;
            if (i11 < lcVarArr.length) {
                lc lcVar = new lc(this);
                lcVarArr[i11] = lcVar;
                int w10 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.x0(null, iArr[i11], false), 50331648);
                int w11 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.x0(null, iArr[i11], false), 822083583);
                org.telegram.messenger.g0.L(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                lcVar.v = radialGradient;
                Matrix matrix = new Matrix();
                lcVar.f35685w = matrix;
                radialGradient.setLocalMatrix(matrix);
                lcVar.f35680q.setShader(lcVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, i6 i6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        i6Var.B = (int) (f13 * 255.0f);
        i6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        i6Var.draw(canvas);
        canvas.restore();
        return i6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i7, boolean z9);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.mc... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nc.f(long, boolean, org.telegram.ui.Components.mc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i7 = 0;
        while (true) {
            lc[] lcVarArr = this.f36335w;
            if (i7 < lcVarArr.length) {
                lc lcVar = lcVarArr[i7];
                if (lcVar.f35667b == null) {
                    boolean z9 = this.f36330e;
                    int[] iArr = this.f36331f;
                    if (z9) {
                        lcVar.f35667b = org.telegram.messenger.sz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                    } else {
                        lcVar.f35667b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
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
            lc[] lcVarArr = this.f36335w;
            if (i7 < lcVarArr.length) {
                Bitmap bitmap = lcVarArr[i7].f35667b;
                if (bitmap != null) {
                    bitmap.recycle();
                    lcVarArr[i7].f35667b = null;
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
        RectF rectF = this.f36327a;
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
            p1Var.f56776a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.Q.f56776a.offset((getMeasuredWidth() - this.Q.f56776a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f56776a.height()) / 2.0f);
            this.Q.f56777b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            lc[] lcVarArr = this.f36335w;
            if (i10 < lcVarArr.length) {
                if (i7 == i10 && lcVarArr[i10].d <= 0.0f) {
                    i7 = -1;
                }
                lc lcVar = lcVarArr[i10];
                if (i7 == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                lcVar.f35677n = z9;
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
            this.D.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false));
            try {
                i6 i6Var = this.M;
                if (i6Var != null) {
                    i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                }
                i6 i6Var2 = this.N;
                if (i6Var2 != null) {
                    i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false));
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
