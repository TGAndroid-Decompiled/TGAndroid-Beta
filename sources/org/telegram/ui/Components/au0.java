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
public class au0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static boolean f33453f0;
    public float E;
    public int F;
    public boolean G;
    public final org.telegram.ui.ActionBar.s4 H;
    public org.telegram.ui.ActionBar.j1 I;
    public int J;
    public boolean K;
    public lu0 L;
    public bi.i3 M;
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
    public final Rect f33454a;
    public RenderNode[] f33455a0;
    public Drawable f33456b;
    public final boolean[] f33457b0;
    public boolean f33458c;
    public final boolean[] f33459c0;
    public Drawable d;
    public final ArrayList f33460d0;
    public boolean f33461e;
    public final ArrayList f33462e0;
    public int f33463f;
    public int h;
    public zt0 f33464n;
    public final ArrayList f33465r;
    public boolean f33466s;
    public j71 f33467w;
    public float f33468x;
    public float f33469y;

    public au0(Context context, org.telegram.ui.ActionBar.s4 s4Var) {
        super(context);
        this.f33454a = new Rect();
        this.f33465r = new ArrayList();
        this.f33466s = true;
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
        this.f33457b0 = new boolean[2];
        this.f33459c0 = new boolean[2];
        this.f33460d0 = new ArrayList();
        this.f33462e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = s4Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f23149a0) {
            return true;
        }
        return false;
    }

    public static void F(au0 au0Var, Canvas canvas) {
        if (au0Var.M != null && org.telegram.ui.ActionBar.n6.G1 && org.telegram.messenger.pc.e(32)) {
            if (au0Var.L == null) {
                lu0 lu0Var = new lu0(1);
                au0Var.L = lu0Var;
                lu0Var.f37236g = -1;
                lu0Var.c();
            }
            au0Var.L.b(canvas, au0Var.M);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.bz.o();
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
        int o4 = org.telegram.messenger.bz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                L = org.telegram.messenger.g0.L(15.0f);
            } else {
                return org.telegram.messenger.g0.f24120p;
            }
        } else {
            L = org.telegram.messenger.g0.L(12.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.f33461e && !this.f33458c) {
            j71 j71Var = this.f33467w;
            if (j71Var != null) {
                j71Var.c(false);
                this.f33467w = null;
                this.E = 1.0f;
                this.f33468x = 0.0f;
                this.f33469y = 0.0f;
                return;
            }
            return;
        }
        if (this.f33467w == null) {
            j71 j71Var2 = new j71(getContext());
            this.f33467w = j71Var2;
            j71Var2.f36383n = new iy(this, 20);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                j71 j71Var3 = this.f33467w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                j71Var3.getClass();
                this.E = j71.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.f33467w.c(true);
        }
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i7;
        if (E() && org.telegram.messenger.bz.o() == 2) {
            i7 = org.telegram.ui.ActionBar.n6.f29606og;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29626pg;
        }
        I(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.n6.w0(i7, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        org.telegram.messenger.bz.f();
    }

    public final void M() {
        boolean[] zArr = this.f33459c0;
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
        Rect rect = this.f33454a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f24115m;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f33463f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.f33467w != null) {
            this.E = j71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f33464n == null && this.f33465r.isEmpty()) {
            return;
        }
        this.f33463f = Q();
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new pp0(3, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f33456b == drawable) {
            return;
        }
        if (this.M == null) {
            bi.i3 i3Var = new bi.i3(27, getContext(), this);
            this.M = i3Var;
            addView(i3Var, 0, c8.ma.c(-1.0f, -1));
        }
        if (drawable instanceof bb0) {
            ((bb0) drawable).q(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.f33456b;
            if (drawable2 instanceof org.telegram.ui.en) {
                ((org.telegram.ui.en) drawable2).g(this.M);
            }
        }
        this.f33456b = drawable;
        if (this.N && (drawable instanceof org.telegram.ui.en)) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.f33456b;
            if (drawable3 instanceof bb0) {
                ((bb0) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.f33456b;
            if (drawable4 instanceof bb0) {
                ((bb0) drawable4).k();
            }
        }
        T(this.f33456b);
        G();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof bi.t8);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29626pg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29606og));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f33457b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f33456b;
    }

    public int getBackgroundSizeY() {
        int i7;
        if (this.f33456b instanceof org.telegram.ui.en) {
            i7 = this.F;
        } else {
            i7 = 0;
        }
        return getMeasuredHeight() - i7;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f33456b;
        if (drawable instanceof bb0) {
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
        return getMeasuredHeight() + this.f33463f;
    }

    public int getKeyboardHeight() {
        return this.f33463f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.n6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.n6.f29482i0;
    }

    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.f33456b;
        if (drawable instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        Drawable drawable2 = this.f33456b;
        if (drawable2 instanceof bb0) {
            ((bb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof bb0) {
            ((bb0) drawable4).k();
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
                    ((wt0) arrayList.get(i7)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f33456b;
                if (drawable instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable2).g(this.M);
                }
                Drawable drawable3 = this.f33456b;
                if (drawable3 instanceof bb0) {
                    ((bb0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof bb0) {
                    ((bb0) drawable4).l();
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
            bi.i3 i3Var = this.M;
            if (i3Var != null) {
                i3Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.i3 i3Var = this.M;
            if (i3Var != null) {
                i3Var.invalidate();
            }
        }
    }

    public void setDelegate(zt0 zt0Var) {
        this.f33464n = zt0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.J != i7) {
            this.J = i7;
            bi.i3 i3Var = this.M;
            if (i3Var != null) {
                i3Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f33466s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            bi.i3 i3Var = this.M;
            if (i3Var != null) {
                i3Var.invalidate();
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
