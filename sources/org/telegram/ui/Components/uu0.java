package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class uu0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static boolean f31048e0;
    public float D;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.z4 G;
    public org.telegram.ui.ActionBar.m1 H;
    public int I;
    public boolean J;
    public fv0 K;
    public bi.t0 L;
    public boolean M;
    public final ArrayList N;
    public final ArrayList O;
    public final Paint P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public float T;
    public float U;
    public float V;
    public RenderNode[] W;
    public final Rect f31049a;
    public final boolean[] f31050a0;
    public Drawable f31051b;
    public final boolean[] f31052b0;
    public boolean f31053c;
    public final ArrayList f31054c0;
    public Drawable d;
    public final ArrayList f31055d0;
    public boolean e;
    public int f31056f;
    public int h;
    public tu0 f31057n;
    public final ArrayList f31058r;
    public boolean f31059s;
    public z71 f31060w;
    public float f31061x;
    public float f31062y;

    public uu0(Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context);
        this.f31049a = new Rect();
        this.f31058r = new ArrayList();
        this.f31059s = true;
        this.D = 1.0f;
        this.F = true;
        this.N = new ArrayList(10);
        this.O = new ArrayList();
        new Matrix();
        new Matrix();
        this.P = new Paint();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = 1.0f;
        this.f31050a0 = new boolean[2];
        this.f31052b0 = new boolean[2];
        this.f31054c0 = new ArrayList();
        this.f31055d0 = new ArrayList();
        setWillNotDraw(false);
        this.G = z4Var;
        this.H = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f18132a0) {
            return true;
        }
        return false;
    }

    public static void F(uu0 uu0Var, Canvas canvas) {
        if (uu0Var.L != null && org.telegram.ui.ActionBar.t6.G1 && org.telegram.messenger.sc.e(32)) {
            if (uu0Var.K == null) {
                fv0 fv0Var = new fv0(1);
                uu0Var.K = fv0Var;
                fv0Var.f26143g = -1;
                fv0Var.c();
            }
            uu0Var.K.b(canvas, uu0Var.L);
        }
    }

    public static float getBlurRadius() {
        int o10 = org.telegram.messenger.tz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 3.0f;
            }
            return 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o10 = org.telegram.messenger.tz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                L = org.telegram.messenger.i0.L(15.0f);
            } else {
                return org.telegram.messenger.i0.f16025p;
            }
        } else {
            L = org.telegram.messenger.i0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.e && !this.f31053c) {
            z71 z71Var = this.f31060w;
            if (z71Var != null) {
                z71Var.c(false);
                this.f31060w = null;
                this.D = 1.0f;
                this.f31061x = 0.0f;
                this.f31062y = 0.0f;
                return;
            }
            return;
        }
        if (this.f31060w == null) {
            z71 z71Var2 = new z71(getContext());
            this.f31060w = z71Var2;
            z71Var2.f32969n = new px(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                z71 z71Var3 = this.f31060w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                z71Var3.getClass();
                this.D = z71.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.f31060w.c(true);
        }
    }

    public void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (E() && org.telegram.messenger.tz.o() == 2) {
            i10 = org.telegram.ui.ActionBar.t6.f21086lg;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21105mg;
        }
        I(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.t6.w0(i10, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uu0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void L() {
        org.telegram.messenger.tz.f();
    }

    public final void M() {
        boolean[] zArr = this.f31052b0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.km;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.hb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.hb);
    }

    public int Q() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f31049a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, ((height - i10) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
        this.f31056f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f31060w != null) {
            this.D = z71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f31057n == null && this.f31058r.isEmpty()) {
            return;
        }
        this.f31056f = Q();
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new k2.v(22, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f31051b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.t0 t0Var = new bi.t0(this, getContext(), 21);
            this.L = t0Var;
            addView(t0Var, 0, w7.b6.c(-1.0f, -1));
        }
        if (drawable instanceof jb0) {
            ((jb0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f31051b;
            if (drawable2 instanceof org.telegram.ui.xn) {
                ((org.telegram.ui.xn) drawable2).g(this.L);
            }
        }
        this.f31051b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.xn)) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f31051b;
            if (drawable3 instanceof jb0) {
                ((jb0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f31051b;
            if (drawable4 instanceof jb0) {
                ((jb0) drawable4).k();
            }
        }
        T(this.f31051b);
        G();
        this.L.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof ph.a4);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21105mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21086lg));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f31050a0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f31051b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f31051b instanceof org.telegram.ui.xn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f31051b;
        if (drawable instanceof jb0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.xn) {
            return this.E;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f31056f;
    }

    public int getKeyboardHeight() {
        return this.f31056f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.t6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.t6.f21014i0;
    }

    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        Drawable drawable = this.f31051b;
        if (drawable instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f31051b;
        if (drawable2 instanceof jb0) {
            ((jb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof jb0) {
            ((jb0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.M = false;
        this.P.setShader(null);
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null) {
                    i10++;
                } else {
                    ((qu0) arrayList.get(i10)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f31051b;
                if (drawable instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.f31051b;
                if (drawable3 instanceof jb0) {
                    ((jb0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof jb0) {
                    ((jb0) drawable4).l();
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setDelegate(tu0 tu0Var) {
        this.f31057n = tu0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f31059s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != getBackgroundImage() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void T(Drawable drawable) {
    }

    public void S() {
    }

    public void updateColors() {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
