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
public class vu0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static boolean f31908e0;
    public float D;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.z4 G;
    public org.telegram.ui.ActionBar.m1 H;
    public int I;
    public boolean J;
    public gv0 K;
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
    public final Rect f31909a;
    public final boolean[] f31910a0;
    public Drawable f31911b;
    public final boolean[] f31912b0;
    public boolean f31913c;
    public final ArrayList f31914c0;
    public Drawable d;
    public final ArrayList f31915d0;
    public boolean e;
    public int f31916f;
    public int h;
    public uu0 f31917n;
    public final ArrayList f31918r;
    public boolean f31919s;
    public a81 f31920w;
    public float f31921x;
    public float f31922y;

    public vu0(Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context);
        this.f31909a = new Rect();
        this.f31918r = new ArrayList();
        this.f31919s = true;
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
        this.f31910a0 = new boolean[2];
        this.f31912b0 = new boolean[2];
        this.f31914c0 = new ArrayList();
        this.f31915d0 = new ArrayList();
        setWillNotDraw(false);
        this.G = z4Var;
        this.H = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.uz.f18501a0) {
            return true;
        }
        return false;
    }

    public static void F(vu0 vu0Var, Canvas canvas) {
        if (vu0Var.L != null && org.telegram.ui.ActionBar.t6.G1 && org.telegram.messenger.tc.e(32)) {
            if (vu0Var.K == null) {
                gv0 gv0Var = new gv0(1);
                vu0Var.K = gv0Var;
                gv0Var.f26556g = -1;
                gv0Var.c();
            }
            vu0Var.K.b(canvas, vu0Var.L);
        }
    }

    public static float getBlurRadius() {
        int o10 = org.telegram.messenger.uz.o();
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
        int o10 = org.telegram.messenger.uz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                L = org.telegram.messenger.i0.L(15.0f);
            } else {
                return org.telegram.messenger.i0.f16171p;
            }
        } else {
            L = org.telegram.messenger.i0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.e && !this.f31913c) {
            a81 a81Var = this.f31920w;
            if (a81Var != null) {
                a81Var.c(false);
                this.f31920w = null;
                this.D = 1.0f;
                this.f31921x = 0.0f;
                this.f31922y = 0.0f;
                return;
            }
            return;
        }
        if (this.f31920w == null) {
            a81 a81Var2 = new a81(getContext());
            this.f31920w = a81Var2;
            a81Var2.f24320n = new px(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                a81 a81Var3 = this.f31920w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                a81Var3.getClass();
                this.D = a81.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.f31920w.c(true);
        }
    }

    public void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (E() && org.telegram.messenger.uz.o() == 2) {
            i10 = org.telegram.ui.ActionBar.t6.f21087lg;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21106mg;
        }
        I(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.t6.w0(i10, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vu0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        org.telegram.messenger.uz.f();
    }

    public final void M() {
        boolean[] zArr = this.f31912b0;
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
        Rect rect = this.f31909a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, ((height - i10) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
        this.f31916f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f31920w != null) {
            this.D = a81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f31917n == null && this.f31918r.isEmpty()) {
            return;
        }
        this.f31916f = Q();
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new k2.v(22, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f31911b == drawable) {
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
            Drawable drawable2 = this.f31911b;
            if (drawable2 instanceof org.telegram.ui.xn) {
                ((org.telegram.ui.xn) drawable2).g(this.L);
            }
        }
        this.f31911b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.xn)) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f31911b;
            if (drawable3 instanceof jb0) {
                ((jb0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f31911b;
            if (drawable4 instanceof jb0) {
                ((jb0) drawable4).k();
            }
        }
        T(this.f31911b);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21106mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21087lg));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f31910a0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f31911b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f31911b instanceof org.telegram.ui.xn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f31911b;
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
        return getMeasuredHeight() + this.f31916f;
    }

    public int getKeyboardHeight() {
        return this.f31916f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.t6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.t6.f21015i0;
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
        Drawable drawable = this.f31911b;
        if (drawable instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f31911b;
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
                    ((ru0) arrayList.get(i10)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f31911b;
                if (drawable instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.f31911b;
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

    public void setDelegate(uu0 uu0Var) {
        this.f31917n = uu0Var;
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
        this.f31919s = z10;
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
