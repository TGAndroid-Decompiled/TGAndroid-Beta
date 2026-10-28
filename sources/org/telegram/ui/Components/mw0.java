package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class mw0 extends FrameLayout implements r0.m {
    public static final int f30645l0 = 0;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public v91 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public jw0 M;
    public iw0 N;
    public kw0 O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public boolean f30646a;
    public float f30647a0;
    public int f30648b;
    public float f30649b0;
    public int f30650c;
    public boolean f30651c0;
    public long d;
    public boolean f30652d0;
    public long e;
    public boolean f30653e0;
    public long f30654f;
    public boolean f30655f0;
    public boolean f30656g0;
    public long h;
    public boolean f30657h0;
    public final li.e3 f30658i0;
    public final ml f30659j0;
    public final bu f30660k0;
    public int f30661n;
    public int f30662r;
    public final RectF f30663s;
    public final bh.r v;
    public final b2.v0 f30664w;
    public final int[] f30665x;
    public final om0 f30666y;

    public mw0(Context context) {
        super(context);
        this.f30663s = new RectF();
        this.f30664w = new Object();
        this.f30665x = new int[2];
        this.f30666y = new Object();
        this.f30658i0 = new li.e3(this, 12);
        this.f30659j0 = new ml(this, 14);
        this.f30660k0 = new bu(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        bh.r rVar = new bh.r(this, context);
        this.v = rVar;
        addView(rVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int h;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder l4 = b10.l(str, ",scrollState=");
            l4.append(recyclerView.getScrollState());
            l4.append(",up=");
            l4.append(recyclerView.canScrollVertically(-1));
            l4.append(",down=");
            l4.append(recyclerView.canScrollVertically(1));
            l4.append(",layout=");
            l4.append(recyclerView.c0());
            l4.append(",pendingUpdates=");
            l4.append(recyclerView.Z());
            l4.append(",animating=");
            l4.append(recyclerView.b0());
            l4.append(",paddingTop=");
            l4.append(recyclerView.getPaddingTop());
            l4.append(",count=");
            if (recyclerView.getAdapter() == null) {
                h = 0;
            } else {
                h = recyclerView.getAdapter().h();
            }
            l4.append(h);
            str = l4.toString();
        }
        return b10.u(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.S;
            if (i10 == (-i11) && marginLayoutParams.bottomMargin == (-this.T)) {
                return;
            }
            marginLayoutParams.topMargin = -i11;
            marginLayoutParams.bottomMargin = -this.T;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        String str;
        if (this.f30653e0 == z10) {
            return;
        }
        this.f30653e0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.E, 0, 0, true);
        this.M.B(z10);
    }

    public static void v(RecyclerView recyclerView, int i10, int i11) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i10 || recyclerView.getPaddingBottom() != i11) {
            s4.p0 layoutManager = recyclerView.getLayoutManager();
            int i12 = 0;
            if (layoutManager != null && layoutManager.r() != 0) {
                view = layoutManager.q(0);
            } else {
                view = null;
            }
            if (view == null) {
                b10 = -1;
            } else {
                layoutManager.getClass();
                b10 = ((s4.q0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i12 = (s4.p0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).topMargin;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            if (b10 != -1 && (layoutManager instanceof s4.c0)) {
                ((s4.c0) layoutManager).h1(b10, i12);
            }
        }
    }

    public final void A() {
        View[] viewPages;
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        v91 v91Var = this.H;
        if (v91Var != null && this.O != null) {
            for (View view : v91Var.getViewPages()) {
                if (view != null) {
                    this.O.i(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float b10;
        View view;
        om0 om0Var = this.f30666y;
        if (!this.f30651c0 && this.M != null) {
            boolean z10 = true;
            this.f30651c0 = true;
            try {
                float f7 = this.f30647a0;
                C();
                RecyclerView recyclerView = this.E;
                if (recyclerView != null && !this.f30657h0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.E;
                    int i10 = this.S;
                    this.M.getClass();
                    v(recyclerView2, i10, this.T);
                }
                v91 v91Var = this.H;
                if (v91Var != null && this.O != null && this.J != null) {
                    for (View view2 : v91Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.H) {
                            b(this.O.i(view2));
                        }
                    }
                    q();
                    float k10 = k();
                    boolean isInfinite = Float.isInfinite(k10);
                    bh.r rVar = this.v;
                    float f10 = 0.0f;
                    if (isInfinite) {
                        this.f30647a0 = Float.POSITIVE_INFINITY;
                        this.I.setVisibility(4);
                        this.J.setVisibility(4);
                        RecyclerView recyclerView3 = this.E;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f7 != this.f30647a0) {
                            rVar.invalidate();
                        }
                        this.f30651c0 = false;
                        return;
                    }
                    float f11 = this.U;
                    if (k10 > f11 + 0.5f) {
                        f11 = k10;
                    }
                    this.W = f11;
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    if (this.f30652d0) {
                        this.f30647a0 = om0Var.b();
                        this.f30649b0 = Math.max(om0Var.d, om0Var.b());
                        View view3 = this.K;
                        float max = Math.max(0.0f, om0Var.f31343a - om0Var.d);
                        if (!om0Var.f31346f) {
                            f10 = om0Var.b() - om0Var.f31344b;
                        }
                        w(view3, max + f10);
                        w(this.L, Math.max(om0Var.d, om0Var.b()) - om0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.F;
                        if (recyclerView4 == null) {
                            b10 = 0.0f;
                        } else {
                            b10 = this.O.b(recyclerView4);
                        }
                        float max2 = this.W - Math.max(0.0f, Math.min(b10, Math.max(0.0f, this.U - this.V)));
                        this.f30647a0 = max2;
                        this.f30649b0 = Math.max(this.U, max2);
                        w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                    }
                    this.E.setTranslationY(this.f30647a0 - k10);
                    this.J.setTranslationY(this.f30649b0 - view.getTop());
                    if (this.f30649b0 > this.U + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.M.getClass();
                    if (f7 != this.f30647a0) {
                        rVar.invalidate();
                    }
                    this.f30651c0 = false;
                }
            } finally {
                this.f30651c0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        jw0 jw0Var = this.M;
        if (jw0Var == null) {
            return;
        }
        float V0 = jw0Var.V0();
        this.M.getClass();
        if (!Float.isNaN(V0) && !Float.isInfinite(V0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && V0 >= 0.0f) {
            if (this.f30655f0 && (V0 != this.U || 0.0f != this.V)) {
                float k10 = k();
                if (!Float.isInfinite(k10)) {
                    float f7 = this.U;
                    if (k10 > 0.5f + f7 && k10 >= V0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && V0 != f7) {
                        this.f30656g0 = true;
                    }
                    if (this.f30652d0) {
                        om0 om0Var = this.f30666y;
                        float f10 = om0Var.e;
                        if (z10) {
                            k10 = V0;
                        }
                        kw0 kw0Var = this.O;
                        om0Var.a(k10, kw0Var.b(kw0Var.i(this.K)), V0, 0.0f);
                        om0Var.e = Math.max(0.0f, Math.min(1.0f, f10));
                        this.v.invalidate();
                    }
                }
            }
            this.U = V0;
            this.V = 0.0f;
            this.f30655f0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        iw0 iw0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E != null && (iw0Var = this.N) != null && this.M != null) {
            int c10 = iw0Var.c();
            s4.p0 layoutManager = this.E.getLayoutManager();
            if (c10 != -1 && (layoutManager instanceof s4.c0)) {
                C();
                ((s4.c0) layoutManager).h1(c10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
                this.f30656g0 = true;
                requestLayout();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        int i10;
        if (this.M != null && recyclerView != null) {
            C();
            View view = this.J;
            if (view == null) {
                i10 = 0;
            } else if (view.getHeight() > 0) {
                i10 = this.J.getHeight();
            } else {
                i10 = this.J.getLayoutParams().height;
            }
            setBleed(recyclerView);
            v(recyclerView, Math.max(0, i10) + Math.round(this.U) + this.S, this.M.b1() + this.T);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        v91 v91Var = this.H;
        if (v91Var != null && v91Var.getCurrentView() != null && !Float.isInfinite(k()) && this.f30649b0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.lw0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mw0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.lw0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f30646a) {
                this.f30661n++;
                this.e = 0L;
                f("TOUCH_DOWN", null, 0, 0, true);
            }
            A();
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "TOUCH_UP";
            } else {
                str = "TOUCH_CANCEL";
            }
            f(str, null, 0, 0, true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view, int i10, int i11) {
        String str2;
        if (this.f30646a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            if (i11 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            f(str.concat(str2), view, i10, i10, true);
        }
    }

    public final void f(String str, View view, int i10, int i11, boolean z10) {
        View view2;
        View view3;
        long j10;
        int c10;
        s4.p0 layoutManager;
        int top;
        int height;
        float f7;
        kw0 kw0Var;
        if (this.f30646a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            v91 v91Var = this.H;
            int i12 = 0;
            View view4 = null;
            if (v91Var == null) {
                view2 = null;
            } else {
                view2 = v91Var.getViewPages()[0];
            }
            v91 v91Var2 = this.H;
            if (v91Var2 == null) {
                view3 = null;
            } else {
                view3 = v91Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f30661n);
            sb2.append(" transition=");
            sb2.append(this.f30662r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.f30652d0);
            sb2.append(" progress=");
            sb2.append(this.f30666y.e);
            sb2.append(" ageMs=");
            long j11 = 0;
            if (this.f30652d0) {
                j10 = uptimeMillis - this.f30654f;
            } else {
                j10 = 0;
            }
            sb2.append(j10);
            sb2.append(" unchangedMs=");
            if (this.f30652d0) {
                j11 = uptimeMillis - this.h;
            }
            sb2.append(j11);
            sb2.append(" depth=");
            sb2.append(this.Q);
            sb2.append(" updating=");
            sb2.append(this.f30651c0);
            sb2.append(" callback=");
            sb2.append(h(this.P));
            sb2.append(" common=");
            sb2.append(h(this.E));
            sb2.append(" active=");
            sb2.append(h(this.F));
            sb2.append(" current=");
            sb2.append(h(view2));
            sb2.append(" other=");
            sb2.append(h(view3));
            sb2.append(" source=");
            sb2.append(h(this.K));
            sb2.append(" incoming=");
            sb2.append(h(this.L));
            sb2.append(" boundary=");
            sb2.append(k());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.f30647a0);
            sb2.append(" alignPending=");
            sb2.append(this.f30656g0);
            iw0 iw0Var = this.N;
            int i13 = -1;
            if (iw0Var == null) {
                c10 = -1;
            } else {
                c10 = iw0Var.c();
            }
            RecyclerView recyclerView = this.E;
            if (recyclerView == null) {
                layoutManager = null;
            } else {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager != null && c10 != -1) {
                view4 = layoutManager.m(c10);
            }
            StringBuilder k10 = ic.a.k(c10, " row=", " anchor=");
            k10.append(h(view4));
            k10.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            k10.append(top);
            k10.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            k10.append(height);
            k10.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i12 = s4.p0.z(view4);
            }
            k10.append(i12);
            k10.append(" adapterPosition=");
            if (view4 != null) {
                this.E.getClass();
                i13 = RecyclerView.R(view4);
            }
            k10.append(i13);
            k10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            if (recyclerView2 != null && (kw0Var = this.O) != null) {
                f7 = kw0Var.b(recyclerView2);
            } else {
                f7 = 0.0f;
            }
            k10.append(f7);
            k10.append(" tabsTop=");
            k10.append(this.f30649b0);
            k10.append(" draw=");
            k10.append(this.f30650c);
            sb2.append(k10.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void g(String str) {
        f(str, this.H, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.T;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f30664w.b();
    }

    public float getTabsTop() {
        return this.f30649b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        mw0 mw0Var;
        if (this.f30646a) {
            mw0Var = this;
            mw0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            mw0Var = this;
        }
        mw0Var.f30652d0 = false;
        mw0Var.L = null;
        mw0Var.K = null;
        mw0Var.v.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mw0.j(float, float):boolean");
    }

    public final float k() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView != null && this.N != null && recyclerView.getLayoutManager() != null) {
            s4.p0 layoutManager = this.E.getLayoutManager();
            int c10 = this.N.c();
            if (c10 != -1 && (m10 = layoutManager.m(c10)) != null) {
                return (s4.p0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.q0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mw0.l():void");
    }

    @Override
    public final void m(int i10, View view) {
        String str;
        if (i10 == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        f(str, view, 0, 0, true);
        b2.v0 v0Var = this.f30664w;
        if (i10 == 1) {
            v0Var.f3512b = 0;
        } else {
            v0Var.f3511a = 0;
        }
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.Q == 0 && (view == (recyclerView = this.E) || view == this.F)) {
            if (this.f30652d0) {
                e("POST_BLOCKED", view, i13, i14);
                iArr[1] = iArr[1] + i13;
                return;
            }
            this.P = view;
            try {
                li.e3 e3Var = this.f30658i0;
                int i15 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i11 > 0 && i13 > 0) {
                    mw0 mw0Var = (mw0) e3Var.f17209b;
                    iw0 iw0Var = mw0Var.N;
                    if (iw0Var != null && iw0Var.c() != -1) {
                        i15 = mw0Var.r(mw0Var.F, i13);
                    }
                } else if (!z10 && i13 < 0) {
                    mw0 mw0Var2 = (mw0) e3Var.f17209b;
                    i15 = mw0Var2.r(mw0Var2.E, i13);
                }
                iArr[1] = iArr[1] + i15;
                f("POST", view, i13, i15, false);
                return;
            } finally {
                this.P = null;
                B();
            }
        }
        f("POST_IGNORED", view, i13, 0, false);
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f30665x;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f30660k0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f30660k0);
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        t(view, i10, i11, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o(view, i10, i11, i12, i13, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        s(view, view2, i10, 0);
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return p(view, view2, i10, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        m(0, view);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        boolean z10;
        String str;
        boolean z11 = false;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q == 0 && z10 && (view2 == this.E || view2 == this.F)) {
            z11 = true;
        }
        if (this.f30646a) {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                str = "NESTED_START";
            } else {
                str = "NESTED_REJECT";
            }
            sb2.append(str);
            sb2.append("_axes=");
            sb2.append(i10);
            sb2.append("_type=");
            sb2.append(i11);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z11;
    }

    public final void q() {
        RecyclerView recyclerView;
        v91 v91Var = this.H;
        if (v91Var != null && this.O != null && v91Var.getCurrentView() != null) {
            recyclerView = this.O.i(this.H.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.F) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.F;
            ml mlVar = this.f30659j0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.F.f3083w0;
                if (arrayList != null) {
                    arrayList.remove(mlVar);
                }
            }
            this.F = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(mlVar);
            }
        }
    }

    public final int r(RecyclerView recyclerView, int i10) {
        int min;
        String str;
        if (recyclerView != null && i10 != 0) {
            if (recyclerView != this.P) {
                RecyclerView recyclerView2 = this.G;
                int i11 = this.R;
                this.G = recyclerView;
                this.R = 0;
                this.Q++;
                try {
                    recyclerView.scrollBy(0, i10);
                    int i12 = this.R;
                    if (i10 > 0) {
                        min = Math.max(0, Math.min(i10, i12));
                    } else {
                        min = Math.min(0, Math.max(i10, i12));
                    }
                    int i13 = min;
                    if (i12 == 0) {
                        str = "TRANSFER_ZERO";
                    } else {
                        str = "TRANSFER";
                    }
                    f(str, recyclerView, i10, i13, false);
                    return i13;
                } finally {
                    this.Q--;
                    this.G = recyclerView2;
                    this.R = i11;
                }
            }
            f("TRANSFER_REENTRY", recyclerView, i10, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        if (i10 != 0) {
            f("TRANSFER_NO_TARGET", recyclerView, i10, 0, false);
        }
        return 0;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        b2.v0 v0Var = this.f30664w;
        if (i11 == 1) {
            v0Var.f3512b = i10;
        } else {
            v0Var.f3511a = i10;
        }
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f30657h0 == z10) {
            return;
        }
        this.f30657h0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f30646a = z10;
        if (z10) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f30654f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(jw0 jw0Var) {
        this.M = jw0Var;
        requestLayout();
        B();
    }

    @Override
    public final void t(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mw0.t(android.view.View, int, int, int[], int):void");
    }

    public final void u(nm0 nm0Var, iw0 iw0Var) {
        RecyclerView recyclerView = this.E;
        bh.r rVar = this.v;
        ml mlVar = this.f30659j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.f3083w0;
            if (arrayList != null) {
                arrayList.remove(mlVar);
            }
            rVar.removeView(this.E);
        }
        this.E = nm0Var;
        this.N = iw0Var;
        rVar.addView(nm0Var, new FrameLayout.LayoutParams(-1, -1));
        nm0Var.j(mlVar);
        nm0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f7) {
        if (view == null) {
            return;
        }
        RecyclerView i10 = this.O.i(view);
        float f10 = this.U;
        i10.setTranslationY((f7 + f10) - Math.round(f10));
    }

    public final void x(View view, v91 v91Var, kw0 kw0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = v91Var;
        this.O = kw0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        B();
    }

    public final void y(View view) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        B();
    }

    public final void z(int i10, int i11) {
        this.S = Math.max(0, i10);
        this.T = Math.max(0, i11);
        requestLayout();
        B();
    }
}
