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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public class ww0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static boolean f34579k0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.j5 G;
    public org.telegram.ui.ActionBar.q1 H;
    public int I;
    public boolean J;
    public hx0 K;
    public bi.cc L;
    public boolean M;
    public final ArrayList N;
    public final ArrayList O;
    public final Matrix P;
    public final Matrix Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public Paint V;
    public Paint W;
    public final Rect f34580a;
    public int f34581a0;
    public Drawable f34582b;
    public int f34583b0;
    public boolean f34584c;
    public float f34585c0;
    public Drawable d;
    public float f34586d0;
    public boolean e;
    public float f34587e0;
    public int f34588f;
    public RenderNode[] f34589f0;
    public final boolean[] f34590g0;
    public int h;
    public final boolean[] f34591h0;
    public final ArrayList f34592i0;
    public final ArrayList f34593j0;
    public vw0 f34594n;
    public final ArrayList f34595r;
    public boolean f34596s;
    public y91 v;
    public float f34597w;
    public float f34598x;
    public float f34599y;

    public ww0(Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context);
        this.f34580a = new Rect();
        this.f34595r = new ArrayList();
        this.f34596s = true;
        this.f34599y = 1.0f;
        this.F = true;
        this.N = new ArrayList(10);
        this.O = new ArrayList();
        this.P = new Matrix();
        this.Q = new Matrix();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.f34585c0 = 1.0f;
        new m.g3(this, 29);
        this.f34590g0 = new boolean[2];
        this.f34591h0 = new boolean[2];
        this.f34592i0 = new ArrayList();
        this.f34593j0 = new ArrayList();
        setWillNotDraw(false);
        this.G = j5Var;
        this.H = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur) {
            return true;
        }
        return false;
    }

    public static void F(ww0 ww0Var, Canvas canvas) {
        if (ww0Var.L != null && org.telegram.ui.ActionBar.y6.G1 && LiteMode.isEnabled(32)) {
            if (ww0Var.K == null) {
                hx0 hx0Var = new hx0(1);
                ww0Var.K = hx0Var;
                hx0Var.f29093g = -1;
                hx0Var.c();
            }
            ww0Var.K.b(canvas, ww0Var.L);
        }
    }

    public static float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                return 3.0f;
            }
            return 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int dp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                dp = AndroidUtilities.dp(15.0f);
            } else {
                return AndroidUtilities.density;
            }
        } else {
            dp = AndroidUtilities.dp(12.0f);
        }
        return dp;
    }

    public final void G() {
        if (!this.e && !this.f34584c) {
            y91 y91Var = this.v;
            if (y91Var != null) {
                y91Var.c(false);
                this.v = null;
                this.f34599y = 1.0f;
                this.f34597w = 0.0f;
                this.f34598x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            y91 y91Var2 = new y91(getContext());
            this.v = y91Var2;
            y91Var2.f35018n = new tv(this, 23);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                y91 y91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                y91Var3.getClass();
                this.f34599y = y91.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.F) {
            this.v.c(true);
        }
    }

    public void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        if (E() && SharedConfig.getDevicePerformanceClass() == 2) {
            i10 = org.telegram.ui.ActionBar.y6.f23740xf;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23758yf;
        }
        J(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.y6.w0(i10, getResourceProvider())));
    }

    public final void J(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ww0.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void L() {
        SharedConfig.chatBlurEnabled();
    }

    public final void M() {
        boolean[] zArr = this.f34591h0;
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
        return this instanceof org.telegram.ui.om;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public int Q() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.f34580a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.f34588f = max;
        return max;
    }

    public void R() {
        boolean z10;
        if (this.v != null) {
            this.f34599y = y91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f34594n == null && this.f34595r.isEmpty()) {
            return;
        }
        this.f34588f = Q();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new d60(6, this, z10));
    }

    public final void U(Drawable drawable) {
        if (this.f34582b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.cc ccVar = new bi.cc(this, getContext(), 25);
            this.L = ccVar;
            addView(ccVar, 0, kb1.g(-1.0f, -1));
        }
        if (drawable instanceof vc0) {
            ((vc0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.f34582b;
            if (drawable2 instanceof org.telegram.ui.zn) {
                ((org.telegram.ui.zn) drawable2).g(this.L);
            }
        }
        this.f34582b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.zn)) {
            ((org.telegram.ui.zn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.f34582b;
            if (drawable3 instanceof vc0) {
                ((vc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.f34582b;
            if (drawable4 instanceof vc0) {
                ((vc0) drawable4).k();
            }
        }
        T(this.f34582b);
        G();
        this.L.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof zh.s4);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23758yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23740xf));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.f34590g0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f34582b;
    }

    public int getBackgroundSizeY() {
        int i10;
        if (this.f34582b instanceof org.telegram.ui.zn) {
            i10 = this.E;
        } else {
            i10 = 0;
        }
        return getMeasuredHeight() - i10;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f34582b;
        if (drawable instanceof vc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.zn) {
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
        return getMeasuredHeight() + this.f34588f;
    }

    public int getKeyboardHeight() {
        return this.f34588f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.y6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.y6.f23443i0;
    }

    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        Drawable drawable = this.f34582b;
        if (drawable instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable).f(this.L);
        }
        Drawable drawable2 = this.f34582b;
        if (drawable2 instanceof vc0) {
            ((vc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof vc0) {
            ((vc0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.M = false;
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == null) {
                    i10++;
                } else {
                    ((sw0) arrayList.get(i10)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.f34582b;
                if (drawable instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.f34582b;
                if (drawable3 instanceof vc0) {
                    ((vc0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof vc0) {
                    ((vc0) drawable4).l();
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
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setDelegate(vw0 vw0Var) {
        this.f34594n = vw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f34596s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
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

    public void S() {
    }

    public void updateColors() {
    }

    public void T(Drawable drawable) {
    }

    public void K(Canvas canvas, ArrayList arrayList) {
    }
}
