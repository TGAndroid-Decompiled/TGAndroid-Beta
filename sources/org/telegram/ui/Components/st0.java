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
public class st0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static boolean f38060e0;
    public float D;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.r4 G;
    public org.telegram.ui.ActionBar.i1 H;
    public int I;
    public boolean J;
    public du0 K;
    public bi.ec L;
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
    public final Rect f38061a;
    public final boolean[] f38062a0;
    public Drawable f38063b;
    public final boolean[] f38064b0;
    public boolean f38065c;
    public final ArrayList f38066c0;
    public Drawable d;
    public final ArrayList f38067d0;
    public boolean f38068e;
    public int f38069f;
    public int h;
    public rt0 f38070n;
    public final ArrayList f38071r;
    public boolean f38072s;
    public y61 f38073w;
    public float f38074x;
    public float f38075y;

    public st0(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.f38061a = new Rect();
        this.f38071r = new ArrayList();
        this.f38072s = true;
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
        this.f38062a0 = new boolean[2];
        this.f38064b0 = new boolean[2];
        this.f38066c0 = new ArrayList();
        this.f38067d0 = new ArrayList();
        setWillNotDraw(false);
        this.G = r4Var;
        this.H = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f23390a0) {
            return true;
        }
        return false;
    }

    public static void F(st0 st0Var, Canvas canvas) {
        if (st0Var.L != null && org.telegram.ui.ActionBar.m6.G1 && org.telegram.messenger.sc.e(32)) {
            if (st0Var.K == null) {
                du0 du0Var = new du0(1);
                st0Var.K = du0Var;
                du0Var.f33082g = -1;
                du0Var.c();
            }
            st0Var.K.b(canvas, st0Var.L);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.iz.o();
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
        int o4 = org.telegram.messenger.iz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                L = org.telegram.messenger.g0.L(15.0f);
            } else {
                return org.telegram.messenger.g0.f22566p;
            }
        } else {
            L = org.telegram.messenger.g0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.f38068e && !this.f38065c) {
            y61 y61Var = this.f38073w;
            if (y61Var != null) {
                y61Var.c(false);
                this.f38073w = null;
                this.D = 1.0f;
                this.f38074x = 0.0f;
                this.f38075y = 0.0f;
                return;
            }
            return;
        }
        if (this.f38073w == null) {
            y61 y61Var2 = new y61(getContext());
            this.f38073w = y61Var2;
            y61Var2.f40522n = new ax(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                y61 y61Var3 = this.f38073w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                y61Var3.getClass();
                this.D = y61.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.f38073w.c(true);
        }
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        int i7;
        if (E() && org.telegram.messenger.iz.o() == 2) {
            i7 = org.telegram.ui.ActionBar.m6.f28046lg;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28063mg;
        }
        I(canvas, f10, rect, paint, z9, Color.alpha(org.telegram.ui.ActionBar.m6.w0(i7, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.st0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void L() {
        org.telegram.messenger.iz.f();
    }

    public final void M() {
        boolean[] zArr = this.f38064b0;
        int i7 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 < arrayList.size()) {
                ((View) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                return;
            }
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.ql;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public int Q() {
        int i7;
        View rootView = getRootView();
        Rect rect = this.f38061a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f38069f = max;
        return max;
    }

    public void R() {
        boolean z9;
        if (this.f38073w != null) {
            this.D = y61.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f38070n == null && this.f38071r.isEmpty()) {
            return;
        }
        this.f38069f = Q();
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        post(new tp0(2, this, z9));
    }

    public final void U(Drawable drawable) {
        if (this.f38063b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.ec ecVar = new bi.ec(26, getContext(), this);
            this.L = ecVar;
            addView(ecVar, 0, c8.ha.c(-1.0f, -1));
        }
        if (drawable instanceof qa0) {
            ((qa0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f38063b;
            if (drawable2 instanceof org.telegram.ui.fn) {
                ((org.telegram.ui.fn) drawable2).g(this.L);
            }
        }
        this.f38063b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.fn)) {
            ((org.telegram.ui.fn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f38063b;
            if (drawable3 instanceof qa0) {
                ((qa0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f38063b;
            if (drawable4 instanceof qa0) {
                ((qa0) drawable4).k();
            }
        }
        T(this.f38063b);
        G();
        this.L.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof zh.v3);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28063mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28046lg));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f38062a0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f38063b;
    }

    public int getBackgroundSizeY() {
        int i7;
        if (this.f38063b instanceof org.telegram.ui.fn) {
            i7 = this.E;
        } else {
            i7 = 0;
        }
        return getMeasuredHeight() - i7;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f38063b;
        if (drawable instanceof qa0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.fn) {
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
        return getMeasuredHeight() + this.f38069f;
    }

    public int getKeyboardHeight() {
        return this.f38069f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.m6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.m6.f27976i0;
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
        this.M = true;
        Drawable drawable = this.f38063b;
        if (drawable instanceof org.telegram.ui.fn) {
            ((org.telegram.ui.fn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f38063b;
        if (drawable2 instanceof qa0) {
            ((qa0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.fn) {
            ((org.telegram.ui.fn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof qa0) {
            ((qa0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.M = false;
        this.P.setShader(null);
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) == null) {
                    i7++;
                } else {
                    ((ot0) arrayList.get(i7)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f38063b;
                if (drawable instanceof org.telegram.ui.fn) {
                    ((org.telegram.ui.fn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.fn) {
                    ((org.telegram.ui.fn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.f38063b;
                if (drawable3 instanceof qa0) {
                    ((qa0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof qa0) {
                    ((qa0) drawable4).l();
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setBackgroundTranslation(int i7) {
        if (i7 != this.E) {
            this.E = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setDelegate(rt0 rt0Var) {
        this.f38070n = rt0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.I != i7) {
            this.I = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z9) {
        this.f38072s = z9;
    }

    public void setSkipBackgroundDrawing(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
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
