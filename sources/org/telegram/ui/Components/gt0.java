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
public class gt0 extends FrameLayout implements r0.l {
    public static final int m0 = 0;
    public final uj0 E;
    public RecyclerView F;
    public RecyclerView G;
    public RecyclerView H;
    public n61 I;
    public View J;
    public View K;
    public View L;
    public View M;
    public dt0 N;
    public ct0 O;
    public et0 P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean f34186a;
    public float f34187a0;
    public int f34188b;
    public float f34189b0;
    public int f34190c;
    public float f34191c0;
    public long d;
    public boolean f34192d0;
    public long f34193e;
    public boolean f34194e0;
    public long f34195f;
    public boolean f34196f0;
    public boolean f34197g0;
    public long h;
    public boolean f34198h0;
    public boolean f34199i0;
    public final nh f34200j0;
    public final ji f34201k0;
    public final pk f34202l0;
    public int f34203n;
    public int f34204r;
    public final RectF f34205s;
    public final ai.o2 f34206w;
    public final d2.t0 f34207x;
    public final int[] f34208y;

    public gt0(Context context) {
        super(context);
        this.f34205s = new RectF();
        this.f34207x = new Object();
        this.f34208y = new int[2];
        this.E = new Object();
        this.f34200j0 = new nh(this, 6);
        this.f34201k0 = new ji(this, 18);
        this.f34202l0 = new pk(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        ai.o2 o2Var = new ai.o2(this, context);
        this.f34206w = o2Var;
        addView(o2Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b10;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder h = t4.c.h(str, ",scrollState=");
            h.append(recyclerView.getScrollState());
            h.append(",up=");
            h.append(recyclerView.canScrollVertically(-1));
            h.append(",down=");
            h.append(recyclerView.canScrollVertically(1));
            h.append(",layout=");
            h.append(recyclerView.c0());
            h.append(",pendingUpdates=");
            h.append(recyclerView.Z());
            h.append(",animating=");
            h.append(recyclerView.b0());
            h.append(",paddingTop=");
            h.append(recyclerView.getPaddingTop());
            h.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b10 = 0;
            } else {
                b10 = recyclerView.getAdapter().b();
            }
            h.append(b10);
            str = h.toString();
        }
        return t4.c.q(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.topMargin;
            int i10 = this.T;
            if (i3 == (-i10) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i10;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        String str;
        if (this.f34196f0 == z10) {
            return;
        }
        this.f34196f0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.F, 0, 0, true);
        this.N.F(z10);
    }

    public static void v(RecyclerView recyclerView, int i3, int i10) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i3 || recyclerView.getPaddingBottom() != i10) {
            u4.o0 layoutManager = recyclerView.getLayoutManager();
            int i11 = 0;
            if (layoutManager != null && layoutManager.r() != 0) {
                view = layoutManager.q(0);
            } else {
                view = null;
            }
            if (view == null) {
                b10 = -1;
            } else {
                layoutManager.getClass();
                b10 = ((u4.p0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i11 = (u4.o0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).topMargin;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i3, recyclerView.getPaddingRight(), i10);
            if (b10 != -1 && (layoutManager instanceof u4.b0)) {
                ((u4.b0) layoutManager).h1(b10, i11);
            }
        }
    }

    public final void A() {
        View[] viewPages;
        f("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        n61 n61Var = this.I;
        if (n61Var != null && this.P != null) {
            for (View view : n61Var.getViewPages()) {
                if (view != null) {
                    this.P.m(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float i3;
        View view;
        uj0 uj0Var = this.E;
        if (!this.f34192d0 && this.N != null) {
            boolean z10 = true;
            this.f34192d0 = true;
            try {
                float f10 = this.f34189b0;
                C();
                RecyclerView recyclerView = this.F;
                if (recyclerView != null && !this.f34199i0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.F;
                    int i10 = this.T;
                    this.N.getClass();
                    v(recyclerView2, i10, this.U);
                }
                n61 n61Var = this.I;
                if (n61Var != null && this.P != null && this.K != null) {
                    for (View view2 : n61Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.I) {
                            b(this.P.m(view2));
                        }
                    }
                    q();
                    float k10 = k();
                    boolean isInfinite = Float.isInfinite(k10);
                    ai.o2 o2Var = this.f34206w;
                    float f11 = 0.0f;
                    if (isInfinite) {
                        this.f34189b0 = Float.POSITIVE_INFINITY;
                        this.J.setVisibility(4);
                        this.K.setVisibility(4);
                        RecyclerView recyclerView3 = this.F;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f10 != this.f34189b0) {
                            o2Var.invalidate();
                        }
                        this.f34192d0 = false;
                        return;
                    }
                    float f12 = this.V;
                    if (k10 > f12 + 0.5f) {
                        f12 = k10;
                    }
                    this.f34187a0 = f12;
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (this.f34194e0) {
                        this.f34189b0 = uj0Var.b();
                        this.f34191c0 = Math.max(uj0Var.d, uj0Var.b());
                        View view3 = this.L;
                        float max = Math.max(0.0f, uj0Var.f38775a - uj0Var.d);
                        if (!uj0Var.f38779f) {
                            f11 = uj0Var.b() - uj0Var.f38776b;
                        }
                        w(view3, max + f11);
                        w(this.M, Math.max(uj0Var.d, uj0Var.b()) - uj0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.G;
                        if (recyclerView4 == null) {
                            i3 = 0.0f;
                        } else {
                            i3 = this.P.i(recyclerView4);
                        }
                        float max2 = this.f34187a0 - Math.max(0.0f, Math.min(i3, Math.max(0.0f, this.V - this.W)));
                        this.f34189b0 = max2;
                        this.f34191c0 = Math.max(this.V, max2);
                        w(this.I.getCurrentView(), Math.max(0.0f, this.f34187a0 - this.V));
                    }
                    this.F.setTranslationY(this.f34189b0 - k10);
                    this.K.setTranslationY(this.f34191c0 - view.getTop());
                    if (this.f34191c0 > this.V + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.N.getClass();
                    if (f10 != this.f34189b0) {
                        o2Var.invalidate();
                    }
                    this.f34192d0 = false;
                }
            } finally {
                this.f34192d0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        dt0 dt0Var = this.N;
        if (dt0Var == null) {
            return;
        }
        float h12 = dt0Var.h1();
        this.N.getClass();
        if (!Float.isNaN(h12) && !Float.isInfinite(h12) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && h12 >= 0.0f) {
            if (this.f34197g0 && (h12 != this.V || 0.0f != this.W)) {
                float k10 = k();
                if (!Float.isInfinite(k10)) {
                    float f10 = this.V;
                    if (k10 > 0.5f + f10 && k10 >= h12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && h12 != f10) {
                        this.f34198h0 = true;
                    }
                    if (this.f34194e0) {
                        uj0 uj0Var = this.E;
                        float f11 = uj0Var.f38778e;
                        if (z10) {
                            k10 = h12;
                        }
                        et0 et0Var = this.P;
                        uj0Var.a(k10, et0Var.i(et0Var.m(this.L)), h12, 0.0f);
                        uj0Var.f38778e = Math.max(0.0f, Math.min(1.0f, f11));
                        this.f34206w.invalidate();
                    }
                }
            }
            this.V = h12;
            this.W = 0.0f;
            this.f34197g0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        ct0 ct0Var;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F != null && (ct0Var = this.O) != null && this.N != null) {
            int c2 = ct0Var.c();
            u4.o0 layoutManager = this.F.getLayoutManager();
            if (c2 != -1 && (layoutManager instanceof u4.b0)) {
                C();
                ((u4.b0) layoutManager).h1(c2, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
                this.f34198h0 = true;
                requestLayout();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        int i3;
        if (this.N != null && recyclerView != null) {
            C();
            View view = this.K;
            if (view == null) {
                i3 = 0;
            } else if (view.getHeight() > 0) {
                i3 = this.K.getHeight();
            } else {
                i3 = this.K.getLayoutParams().height;
            }
            setBleed(recyclerView);
            v(recyclerView, Math.max(0, i3) + Math.round(this.V) + this.T, this.N.m1() + this.U);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        n61 n61Var = this.I;
        if (n61Var != null && n61Var.getCurrentView() != null && !Float.isInfinite(k()) && this.f34191c0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.ft0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.ft0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f34186a) {
                this.f34203n++;
                this.f34193e = 0L;
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

    public final void e(String str, View view, int i3, int i10) {
        String str2;
        if (this.f34186a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f34193e < 250) {
                return;
            }
            this.f34193e = uptimeMillis;
            if (i10 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            f(str.concat(str2), view, i3, i3, true);
        }
    }

    public final void f(String str, View view, int i3, int i10, boolean z10) {
        View view2;
        View view3;
        long j10;
        int c2;
        u4.o0 layoutManager;
        int top;
        int height;
        float f10;
        et0 et0Var;
        if (this.f34186a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            n61 n61Var = this.I;
            int i11 = 0;
            View view4 = null;
            if (n61Var == null) {
                view2 = null;
            } else {
                view2 = n61Var.getViewPages()[0];
            }
            n61 n61Var2 = this.I;
            if (n61Var2 == null) {
                view3 = null;
            } else {
                view3 = n61Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f34203n);
            sb2.append(" transition=");
            sb2.append(this.f34204r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i3);
            sb2.append(" used=");
            sb2.append(i10);
            sb2.append(" transitioning=");
            sb2.append(this.f34194e0);
            sb2.append(" progress=");
            sb2.append(this.E.f38778e);
            sb2.append(" ageMs=");
            long j11 = 0;
            if (this.f34194e0) {
                j10 = uptimeMillis - this.f34195f;
            } else {
                j10 = 0;
            }
            sb2.append(j10);
            sb2.append(" unchangedMs=");
            if (this.f34194e0) {
                j11 = uptimeMillis - this.h;
            }
            sb2.append(j11);
            sb2.append(" depth=");
            sb2.append(this.R);
            sb2.append(" updating=");
            sb2.append(this.f34192d0);
            sb2.append(" callback=");
            sb2.append(h(this.Q));
            sb2.append(" common=");
            sb2.append(h(this.F));
            sb2.append(" active=");
            sb2.append(h(this.G));
            sb2.append(" current=");
            sb2.append(h(view2));
            sb2.append(" other=");
            sb2.append(h(view3));
            sb2.append(" source=");
            sb2.append(h(this.L));
            sb2.append(" incoming=");
            sb2.append(h(this.M));
            sb2.append(" boundary=");
            sb2.append(k());
            sb2.append(" pin=");
            sb2.append(this.V);
            sb2.append(" tail=");
            sb2.append(this.f34189b0);
            sb2.append(" alignPending=");
            sb2.append(this.f34198h0);
            ct0 ct0Var = this.O;
            int i12 = -1;
            if (ct0Var == null) {
                c2 = -1;
            } else {
                c2 = ct0Var.c();
            }
            RecyclerView recyclerView = this.F;
            if (recyclerView == null) {
                layoutManager = null;
            } else {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager != null && c2 != -1) {
                view4 = layoutManager.m(c2);
            }
            StringBuilder m10 = k2.p1.m(c2, " row=", " anchor=");
            m10.append(h(view4));
            m10.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            m10.append(top);
            m10.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            m10.append(height);
            m10.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i11 = u4.o0.z(view4);
            }
            m10.append(i11);
            m10.append(" adapterPosition=");
            if (view4 != null) {
                this.F.getClass();
                i12 = RecyclerView.R(view4);
            }
            m10.append(i12);
            m10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.G;
            if (recyclerView2 != null && (et0Var = this.P) != null) {
                f10 = et0Var.i(recyclerView2);
            } else {
                f10 = 0.0f;
            }
            m10.append(f10);
            m10.append(" tabsTop=");
            m10.append(this.f34191c0);
            m10.append(" draw=");
            m10.append(this.f34190c);
            sb2.append(m10.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void g(String str) {
        f(str, this.I, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.U;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f34207x.b();
    }

    public float getTabsTop() {
        return this.f34191c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        gt0 gt0Var;
        if (this.f34186a) {
            gt0Var = this;
            gt0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            gt0Var = this;
        }
        gt0Var.f34194e0 = false;
        gt0Var.M = null;
        gt0Var.L = null;
        gt0Var.f34206w.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.j(float, float):boolean");
    }

    public final float k() {
        View m10;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && this.O != null && recyclerView.getLayoutManager() != null) {
            u4.o0 layoutManager = this.F.getLayoutManager();
            int c2 = this.O.c();
            if (c2 != -1 && (m10 = layoutManager.m(c2)) != null) {
                return (u4.o0.z(m10) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((u4.p0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.l():void");
    }

    @Override
    public final void m(int i3, View view) {
        String str;
        if (i3 == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        f(str, view, 0, 0, true);
        d2.t0 t0Var = this.f34207x;
        if (i3 == 1) {
            t0Var.f8414b = 0;
        } else {
            t0Var.f8413a = 0;
        }
    }

    @Override
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.R == 0 && (view == (recyclerView = this.F) || view == this.G)) {
            if (this.f34194e0) {
                e("POST_BLOCKED", view, i12, i13);
                iArr[1] = iArr[1] + i12;
                return;
            }
            this.Q = view;
            try {
                nh nhVar = this.f34200j0;
                int i14 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i10 > 0 && i12 > 0) {
                    gt0 gt0Var = (gt0) nhVar.f36540b;
                    ct0 ct0Var = gt0Var.O;
                    if (ct0Var != null && ct0Var.c() != -1) {
                        i14 = gt0Var.r(gt0Var.G, i12);
                    }
                } else if (!z10 && i12 < 0) {
                    gt0 gt0Var2 = (gt0) nhVar.f36540b;
                    i14 = gt0Var2.r(gt0Var2.F, i12);
                }
                iArr[1] = iArr[1] + i14;
                f("POST", view, i12, i14, false);
                return;
            } finally {
                this.Q = null;
                B();
            }
        }
        f("POST_IGNORED", view, i12, 0, false);
    }

    @Override
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
        int[] iArr = this.f34208y;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i3, i10, i11, i12, i13, iArr);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f34202l0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f34202l0);
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        t(view, i3, i10, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        o(view, i3, i10, i11, i12, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        s(view, view2, i3, 0);
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return p(view, view2, i3, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        m(0, view);
    }

    @Override
    public final boolean p(View view, View view2, int i3, int i10) {
        boolean z10;
        String str;
        boolean z11 = false;
        if ((i3 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R == 0 && z10 && (view2 == this.F || view2 == this.G)) {
            z11 = true;
        }
        if (this.f34186a) {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                str = "NESTED_START";
            } else {
                str = "NESTED_REJECT";
            }
            sb2.append(str);
            sb2.append("_axes=");
            sb2.append(i3);
            sb2.append("_type=");
            sb2.append(i10);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z11;
    }

    public final void q() {
        RecyclerView recyclerView;
        n61 n61Var = this.I;
        if (n61Var != null && this.P != null && n61Var.getCurrentView() != null) {
            recyclerView = this.P.m(this.I.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.G) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.G;
            ji jiVar = this.f34201k0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.G.f2304x0;
                if (arrayList != null) {
                    arrayList.remove(jiVar);
                }
            }
            this.G = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(jiVar);
            }
        }
    }

    public final int r(RecyclerView recyclerView, int i3) {
        int min;
        String str;
        if (recyclerView != null && i3 != 0) {
            if (recyclerView != this.Q) {
                RecyclerView recyclerView2 = this.H;
                int i10 = this.S;
                this.H = recyclerView;
                this.S = 0;
                this.R++;
                try {
                    recyclerView.scrollBy(0, i3);
                    int i11 = this.S;
                    if (i3 > 0) {
                        min = Math.max(0, Math.min(i3, i11));
                    } else {
                        min = Math.min(0, Math.max(i3, i11));
                    }
                    int i12 = min;
                    if (i11 == 0) {
                        str = "TRANSFER_ZERO";
                    } else {
                        str = "TRANSFER";
                    }
                    f(str, recyclerView, i3, i12, false);
                    return i12;
                } finally {
                    this.R--;
                    this.H = recyclerView2;
                    this.S = i10;
                }
            }
            f("TRANSFER_REENTRY", recyclerView, i3, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        if (i3 != 0) {
            f("TRANSFER_NO_TARGET", recyclerView, i3, 0, false);
        }
        return 0;
    }

    @Override
    public final void s(View view, View view2, int i3, int i10) {
        d2.t0 t0Var = this.f34207x;
        if (i10 == 1) {
            t0Var.f8414b = i3;
        } else {
            t0Var.f8413a = i3;
        }
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f34199i0 == z10) {
            return;
        }
        this.f34199i0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f34186a = z10;
        if (z10) {
            this.d = 0L;
            this.f34193e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f34195f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(dt0 dt0Var) {
        this.N = dt0Var;
        requestLayout();
        B();
    }

    @Override
    public final void t(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.t(android.view.View, int, int, int[], int):void");
    }

    public final void u(tj0 tj0Var, ct0 ct0Var) {
        RecyclerView recyclerView = this.F;
        ai.o2 o2Var = this.f34206w;
        ji jiVar = this.f34201k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.f2304x0;
            if (arrayList != null) {
                arrayList.remove(jiVar);
            }
            o2Var.removeView(this.F);
        }
        this.F = tj0Var;
        this.O = ct0Var;
        o2Var.addView(tj0Var, new FrameLayout.LayoutParams(-1, -1));
        tj0Var.j(jiVar);
        tj0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        RecyclerView m10 = this.P.m(view);
        float f11 = this.V;
        m10.setTranslationY((f10 + f11) - Math.round(f11));
    }

    public final void x(View view, n61 n61Var, et0 et0Var) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = n61Var;
        this.P = et0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        B();
    }

    public final void y(View view) {
        View view2 = this.K;
        if (view2 != null) {
            removeView(view2);
        }
        this.K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        B();
    }

    public final void z(int i3, int i10) {
        this.T = Math.max(0, i3);
        this.U = Math.max(0, i10);
        requestLayout();
        B();
    }
}
