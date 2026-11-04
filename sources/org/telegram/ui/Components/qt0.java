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
public class qt0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static boolean f37525f0;
    public float E;
    public int F;
    public boolean G;
    public final org.telegram.ui.ActionBar.q4 H;
    public org.telegram.ui.ActionBar.h1 I;
    public int J;
    public boolean K;
    public bu0 L;
    public ai.x2 M;
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
    public final Rect f37526a;
    public RenderNode[] f37527a0;
    public Drawable f37528b;
    public final boolean[] f37529b0;
    public boolean f37530c;
    public final boolean[] f37531c0;
    public Drawable d;
    public final ArrayList f37532d0;
    public boolean f37533e;
    public final ArrayList f37534e0;
    public int f37535f;
    public int h;
    public pt0 f37536n;
    public final ArrayList f37537r;
    public boolean f37538s;
    public q61 f37539w;
    public float f37540x;
    public float f37541y;

    public qt0(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.f37526a = new Rect();
        this.f37537r = new ArrayList();
        this.f37538s = true;
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
        this.f37529b0 = new boolean[2];
        this.f37531c0 = new boolean[2];
        this.f37532d0 = new ArrayList();
        this.f37534e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = q4Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f21613a0) {
            return true;
        }
        return false;
    }

    public static void F(qt0 qt0Var, Canvas canvas) {
        if (qt0Var.M != null && org.telegram.ui.ActionBar.k6.G1 && org.telegram.messenger.lc.e(32)) {
            if (qt0Var.L == null) {
                bu0 bu0Var = new bu0(1);
                qt0Var.L = bu0Var;
                bu0Var.f32401g = -1;
                bu0Var.c();
            }
            qt0Var.L.b(canvas, qt0Var.M);
        }
    }

    public static float getBlurRadius() {
        int o10 = org.telegram.messenger.az.o();
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
        int o10 = org.telegram.messenger.az.o();
        if (o10 != 1) {
            if (o10 != 2) {
                L = org.telegram.messenger.g0.L(15.0f);
            } else {
                return org.telegram.messenger.g0.f22607p;
            }
        } else {
            L = org.telegram.messenger.g0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.f37533e && !this.f37530c) {
            q61 q61Var = this.f37539w;
            if (q61Var != null) {
                q61Var.c(false);
                this.f37539w = null;
                this.E = 1.0f;
                this.f37540x = 0.0f;
                this.f37541y = 0.0f;
                return;
            }
            return;
        }
        if (this.f37539w == null) {
            q61 q61Var2 = new q61(getContext());
            this.f37539w = q61Var2;
            q61Var2.f37364n = new zw(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                q61 q61Var3 = this.f37539w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                q61Var3.getClass();
                this.E = q61.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.f37539w.c(true);
        }
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i3;
        if (E() && org.telegram.messenger.az.o() == 2) {
            i3 = org.telegram.ui.ActionBar.k6.f28035lg;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28053mg;
        }
        I(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.k6.w0(i3, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void L() {
        org.telegram.messenger.az.f();
    }

    public final void M() {
        boolean[] zArr = this.f37531c0;
        int i3 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i3 < arrayList.size()) {
                ((View) arrayList.get(i3)).invalidate();
                i3++;
            } else {
                return;
            }
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.kl;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.ab);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.ab);
    }

    public int Q() {
        int i3;
        View rootView = getRootView();
        Rect rect = this.f37526a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        int max = Math.max(0, ((height - i3) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f37535f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f37539w != null) {
            this.E = q61.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f37536n == null && this.f37537r.isEmpty()) {
            return;
        }
        this.f37535f = Q();
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new up0(2, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f37528b == drawable) {
            return;
        }
        if (this.M == null) {
            ai.x2 x2Var = new ai.x2(27, getContext(), this);
            this.M = x2Var;
            addView(x2Var, 0, b8.mf.c(-1.0f, -1));
        }
        if (drawable instanceof la0) {
            ((la0) drawable).q(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.f37528b;
            if (drawable2 instanceof org.telegram.ui.zm) {
                ((org.telegram.ui.zm) drawable2).g(this.M);
            }
        }
        this.f37528b = drawable;
        if (this.N && (drawable instanceof org.telegram.ui.zm)) {
            ((org.telegram.ui.zm) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.f37528b;
            if (drawable3 instanceof la0) {
                ((la0) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.f37528b;
            if (drawable4 instanceof la0) {
                ((la0) drawable4).k();
            }
        }
        T(this.f37528b);
        G();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof ai.w6);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28053mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28035lg));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f37529b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f37528b;
    }

    public int getBackgroundSizeY() {
        int i3;
        if (this.f37528b instanceof org.telegram.ui.zm) {
            i3 = this.F;
        } else {
            i3 = 0;
        }
        return getMeasuredHeight() - i3;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f37528b;
        if (drawable instanceof la0) {
            return this.F;
        }
        if (drawable instanceof org.telegram.ui.zm) {
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
        return getMeasuredHeight() + this.f37535f;
    }

    public int getKeyboardHeight() {
        return this.f37535f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.k6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.k6.f27967i0;
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
        Drawable drawable = this.f37528b;
        if (drawable instanceof org.telegram.ui.zm) {
            ((org.telegram.ui.zm) drawable).f(this.M);
        }
        Drawable drawable2 = this.f37528b;
        if (drawable2 instanceof la0) {
            ((la0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.zm) {
            ((org.telegram.ui.zm) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof la0) {
            ((la0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        this.N = false;
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    i3++;
                } else {
                    ((mt0) arrayList.get(i3)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f37528b;
                if (drawable instanceof org.telegram.ui.zm) {
                    ((org.telegram.ui.zm) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.zm) {
                    ((org.telegram.ui.zm) drawable2).g(this.M);
                }
                Drawable drawable3 = this.f37528b;
                if (drawable3 instanceof la0) {
                    ((la0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof la0) {
                    ((la0) drawable4).l();
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        R();
    }

    public void setBackgroundTranslation(int i3) {
        if (i3 != this.F) {
            this.F = i3;
            ai.x2 x2Var = this.M;
            if (x2Var != null) {
                x2Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i3) {
        if (i3 != this.h) {
            this.h = i3;
            ai.x2 x2Var = this.M;
            if (x2Var != null) {
                x2Var.invalidate();
            }
        }
    }

    public void setDelegate(pt0 pt0Var) {
        this.f37536n = pt0Var;
    }

    public void setEmojiKeyboardHeight(int i3) {
        if (this.J != i3) {
            this.J = i3;
            ai.x2 x2Var = this.M;
            if (x2Var != null) {
                x2Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f37538s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            ai.x2 x2Var = this.M;
            if (x2Var != null) {
                x2Var.invalidate();
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
