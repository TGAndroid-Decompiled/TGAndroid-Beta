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
public class st0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static boolean f39409f0;
    public float E;
    public int F;
    public boolean G;
    public final org.telegram.ui.ActionBar.o4 H;
    public org.telegram.ui.ActionBar.i1 I;
    public int J;
    public boolean K;
    public du0 L;
    public bi.o2 M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public float U;
    public float V;
    public float W;
    public final Rect f39410a;
    public RenderNode[] f39411a0;
    public Drawable f39412b;
    public final boolean[] f39413b0;
    public boolean f39414c;
    public final boolean[] f39415c0;
    public Drawable d;
    public final ArrayList f39416d0;
    public boolean f39417e;
    public final ArrayList f39418e0;
    public int f39419f;
    public int h;
    public rt0 f39420n;
    public final ArrayList f39421r;
    public boolean f39422s;
    public z61 f39423w;
    public float f39424x;
    public float f39425y;

    public st0(Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context);
        this.f39410a = new Rect();
        this.f39421r = new ArrayList();
        this.f39422s = true;
        this.E = 1.0f;
        this.G = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        new Matrix();
        new Matrix();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = 1.0f;
        this.f39413b0 = new boolean[2];
        this.f39415c0 = new boolean[2];
        this.f39416d0 = new ArrayList();
        this.f39418e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = o4Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.gz.f23930a0) {
            return true;
        }
        return false;
    }

    public static void F(st0 st0Var, Canvas canvas) {
        if (st0Var.M != null && org.telegram.ui.ActionBar.j6.G1 && org.telegram.messenger.qc.e(32)) {
            if (st0Var.L == null) {
                du0 du0Var = new du0(1);
                st0Var.L = du0Var;
                du0Var.f34076g = -1;
                du0Var.c();
            }
            st0Var.L.b(canvas, st0Var.M);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.gz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 3.0f;
            }
            return 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o4 = org.telegram.messenger.gz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                L = org.telegram.messenger.g0.L(15.0f);
            } else {
                return org.telegram.messenger.g0.f23608p;
            }
        } else {
            L = org.telegram.messenger.g0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.f39417e && !this.f39414c) {
            z61 z61Var = this.f39423w;
            if (z61Var != null) {
                z61Var.c(false);
                this.f39423w = null;
                this.E = 1.0f;
                this.f39424x = 0.0f;
                this.f39425y = 0.0f;
                return;
            }
            return;
        }
        if (this.f39423w == null) {
            z61 z61Var2 = new z61(getContext());
            this.f39423w = z61Var2;
            z61Var2.f42270n = new gx(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                z61 z61Var3 = this.f39423w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                z61Var3.getClass();
                this.E = z61.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.f39423w.c(true);
        }
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        if (E() && org.telegram.messenger.gz.o() == 2) {
            i7 = org.telegram.ui.ActionBar.j6.f29059og;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29079pg;
        }
        I(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.w0(i7, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.st0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        org.telegram.messenger.gz.f();
    }

    public final void M() {
        boolean[] zArr = this.f39415c0;
        int i7 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                ((View) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                return;
            }
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.ol;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.bb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.bb);
    }

    public int Q() {
        int i7;
        View rootView = getRootView();
        Rect rect = this.f39410a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f39419f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f39423w != null) {
            this.E = z61.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f39420n == null && this.f39421r.isEmpty()) {
            return;
        }
        this.f39419f = Q();
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new fp0(3, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f39412b == drawable) {
            return;
        }
        if (this.M == null) {
            bi.o2 o2Var = new bi.o2(27, getContext(), this);
            this.M = o2Var;
            addView(o2Var, 0, c8.ja.c(-1.0f, -1));
        }
        if (drawable instanceof ra0) {
            ((ra0) drawable).q(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.f39412b;
            if (drawable2 instanceof org.telegram.ui.dn) {
                ((org.telegram.ui.dn) drawable2).g(this.M);
            }
        }
        this.f39412b = drawable;
        if (this.N && (drawable instanceof org.telegram.ui.dn)) {
            ((org.telegram.ui.dn) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.f39412b;
            if (drawable3 instanceof ra0) {
                ((ra0) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.f39412b;
            if (drawable4 instanceof ra0) {
                ((ra0) drawable4).k();
            }
        }
        T(this.f39412b);
        G();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof bi.n6);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29079pg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29059og));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f39413b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f39412b;
    }

    public int getBackgroundSizeY() {
        int i7;
        if (this.f39412b instanceof org.telegram.ui.dn) {
            i7 = this.F;
        } else {
            i7 = 0;
        }
        return getMeasuredHeight() - i7;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f39412b;
        if (drawable instanceof ra0) {
            return this.F;
        }
        if (drawable instanceof org.telegram.ui.dn) {
            return this.F;
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
        return getMeasuredHeight() + this.f39419f;
    }

    public int getKeyboardHeight() {
        return this.f39419f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.j6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.f28935i0;
    }

    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.f39412b;
        if (drawable instanceof org.telegram.ui.dn) {
            ((org.telegram.ui.dn) drawable).f(this.M);
        }
        Drawable drawable2 = this.f39412b;
        if (drawable2 instanceof ra0) {
            ((ra0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.dn) {
            ((org.telegram.ui.dn) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ra0) {
            ((ra0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.N = false;
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) == null) {
                    i7++;
                } else {
                    ((ot0) arrayList.get(i7)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f39412b;
                if (drawable instanceof org.telegram.ui.dn) {
                    ((org.telegram.ui.dn) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.dn) {
                    ((org.telegram.ui.dn) drawable2).g(this.M);
                }
                Drawable drawable3 = this.f39412b;
                if (drawable3 instanceof ra0) {
                    ((ra0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof ra0) {
                    ((ra0) drawable4).l();
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setBackgroundTranslation(int i7) {
        if (i7 != this.F) {
            this.F = i7;
            bi.o2 o2Var = this.M;
            if (o2Var != null) {
                o2Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.o2 o2Var = this.M;
            if (o2Var != null) {
                o2Var.invalidate();
            }
        }
    }

    public void setDelegate(rt0 rt0Var) {
        this.f39420n = rt0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.J != i7) {
            this.J = i7;
            bi.o2 o2Var = this.M;
            if (o2Var != null) {
                o2Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f39422s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            bi.o2 o2Var = this.M;
            if (o2Var != null) {
                o2Var.invalidate();
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
