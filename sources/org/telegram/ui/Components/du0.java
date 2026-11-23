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
public class du0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static boolean f34573f0;
    public float E;
    public int F;
    public boolean G;
    public final org.telegram.ui.ActionBar.r4 H;
    public org.telegram.ui.ActionBar.i1 I;
    public int J;
    public boolean K;
    public ou0 L;
    public bi.m3 M;
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
    public final Rect f34574a;
    public RenderNode[] f34575a0;
    public Drawable f34576b;
    public final boolean[] f34577b0;
    public boolean f34578c;
    public final boolean[] f34579c0;
    public Drawable d;
    public final ArrayList f34580d0;
    public boolean f34581e;
    public final ArrayList f34582e0;
    public int f34583f;
    public int h;
    public cu0 f34584n;
    public final ArrayList f34585r;
    public boolean f34586s;
    public m71 f34587w;
    public float f34588x;
    public float f34589y;

    public du0(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.f34574a = new Rect();
        this.f34585r = new ArrayList();
        this.f34586s = true;
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
        this.f34577b0 = new boolean[2];
        this.f34579c0 = new boolean[2];
        this.f34580d0 = new ArrayList();
        this.f34582e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = r4Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.f23391a0) {
            return true;
        }
        return false;
    }

    public static void F(du0 du0Var, Canvas canvas) {
        if (du0Var.M != null && org.telegram.ui.ActionBar.m6.G1 && org.telegram.messenger.qc.e(32)) {
            if (du0Var.L == null) {
                ou0 ou0Var = new ou0(1);
                du0Var.L = ou0Var;
                ou0Var.f38359g = -1;
                ou0Var.c();
            }
            du0Var.L.b(canvas, du0Var.M);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.cz.o();
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
        int o4 = org.telegram.messenger.cz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                L = org.telegram.messenger.g0.L(15.0f);
            } else {
                return org.telegram.messenger.g0.f24045p;
            }
        } else {
            L = org.telegram.messenger.g0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.f34581e && !this.f34578c) {
            m71 m71Var = this.f34587w;
            if (m71Var != null) {
                m71Var.c(false);
                this.f34587w = null;
                this.E = 1.0f;
                this.f34588x = 0.0f;
                this.f34589y = 0.0f;
                return;
            }
            return;
        }
        if (this.f34587w == null) {
            m71 m71Var2 = new m71(getContext());
            this.f34587w = m71Var2;
            m71Var2.f37446n = new ky(this, 20);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                m71 m71Var3 = this.f34587w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                m71Var3.getClass();
                this.E = m71.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.f34587w.c(true);
        }
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        if (E() && org.telegram.messenger.cz.o() == 2) {
            i7 = org.telegram.ui.ActionBar.m6.f29591og;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29611pg;
        }
        I(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.m6.w0(i7, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.du0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        org.telegram.messenger.cz.f();
    }

    public final void M() {
        boolean[] zArr = this.f34579c0;
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
        return this instanceof org.telegram.ui.pl;
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
        Rect rect = this.f34574a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f24040m;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f34583f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f34587w != null) {
            this.E = m71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f34584n == null && this.f34585r.isEmpty()) {
            return;
        }
        this.f34583f = Q();
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new rp0(3, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f34576b == drawable) {
            return;
        }
        if (this.M == null) {
            bi.m3 m3Var = new bi.m3(27, getContext(), this);
            this.M = m3Var;
            addView(m3Var, 0, c8.ma.c(-1.0f, -1));
        }
        if (drawable instanceof cb0) {
            ((cb0) drawable).q(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.f34576b;
            if (drawable2 instanceof org.telegram.ui.en) {
                ((org.telegram.ui.en) drawable2).g(this.M);
            }
        }
        this.f34576b = drawable;
        if (this.N && (drawable instanceof org.telegram.ui.en)) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.f34576b;
            if (drawable3 instanceof cb0) {
                ((cb0) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.f34576b;
            if (drawable4 instanceof cb0) {
                ((cb0) drawable4).k();
            }
        }
        T(this.f34576b);
        G();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof bi.v8);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29611pg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29591og));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f34577b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f34576b;
    }

    public int getBackgroundSizeY() {
        int i7;
        if (this.f34576b instanceof org.telegram.ui.en) {
            i7 = this.F;
        } else {
            i7 = 0;
        }
        return getMeasuredHeight() - i7;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f34576b;
        if (drawable instanceof cb0) {
            return this.F;
        }
        if (drawable instanceof org.telegram.ui.en) {
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
        return getMeasuredHeight() + this.f34583f;
    }

    public int getKeyboardHeight() {
        return this.f34583f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.m6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.m6.f29467i0;
    }

    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.f34576b;
        if (drawable instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        Drawable drawable2 = this.f34576b;
        if (drawable2 instanceof cb0) {
            ((cb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cb0) {
            ((cb0) drawable4).k();
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
                    ((zt0) arrayList.get(i7)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f34576b;
                if (drawable instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable2).g(this.M);
                }
                Drawable drawable3 = this.f34576b;
                if (drawable3 instanceof cb0) {
                    ((cb0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof cb0) {
                    ((cb0) drawable4).l();
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
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setDelegate(cu0 cu0Var) {
        this.f34584n = cu0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.J != i7) {
            this.J = i7;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f34586s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
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
