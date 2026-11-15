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
public class it0 extends FrameLayout implements r0.l {
    public static final int m0 = 0;
    public final vj0 E;
    public RecyclerView F;
    public RecyclerView G;
    public RecyclerView H;
    public w61 I;
    public View J;
    public View K;
    public View L;
    public View M;
    public ft0 N;
    public et0 O;
    public gt0 P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean f35716a;
    public float f35717a0;
    public int f35718b;
    public float f35719b0;
    public int f35720c;
    public float f35721c0;
    public long d;
    public boolean f35722d0;
    public long f35723e;
    public boolean f35724e0;
    public long f35725f;
    public boolean f35726f0;
    public boolean f35727g0;
    public long h;
    public boolean f35728h0;
    public boolean f35729i0;
    public final org.telegram.messenger.ou f35730j0;
    public final ri f35731k0;
    public final yk f35732l0;
    public int f35733n;
    public int f35734r;
    public final RectF f35735s;
    public final bi.g2 f35736w;
    public final e2.r0 f35737x;
    public final int[] f35738y;

    public it0(Context context) {
        super(context);
        this.f35735s = new RectF();
        this.f35737x = new Object();
        this.f35738y = new int[2];
        this.E = new Object();
        this.f35730j0 = new org.telegram.messenger.ou(this, 12);
        this.f35731k0 = new ri(this, 18);
        this.f35732l0 = new yk(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        bi.g2 g2Var = new bi.g2(this, context);
        this.f35736w = g2Var;
        addView(g2Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b10;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder m10 = r.b.m(str, ",scrollState=");
            m10.append(recyclerView.getScrollState());
            m10.append(",up=");
            m10.append(recyclerView.canScrollVertically(-1));
            m10.append(",down=");
            m10.append(recyclerView.canScrollVertically(1));
            m10.append(",layout=");
            m10.append(recyclerView.c0());
            m10.append(",pendingUpdates=");
            m10.append(recyclerView.Z());
            m10.append(",animating=");
            m10.append(recyclerView.b0());
            m10.append(",paddingTop=");
            m10.append(recyclerView.getPaddingTop());
            m10.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b10 = 0;
            } else {
                b10 = recyclerView.getAdapter().b();
            }
            m10.append(b10);
            str = m10.toString();
        }
        return r.b.v(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i7 = marginLayoutParams.topMargin;
            int i10 = this.T;
            if (i7 == (-i10) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i10;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        String str;
        if (this.f35726f0 == z10) {
            return;
        }
        this.f35726f0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.F, 0, 0, true);
        this.N.F(z10);
    }

    public static void v(RecyclerView recyclerView, int i7, int i10) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i7 || recyclerView.getPaddingBottom() != i10) {
            v4.o0 layoutManager = recyclerView.getLayoutManager();
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
                b10 = ((v4.p0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i11 = (v4.o0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).topMargin;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            if (b10 != -1 && (layoutManager instanceof v4.b0)) {
                ((v4.b0) layoutManager).h1(b10, i11);
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
        w61 w61Var = this.I;
        if (w61Var != null && this.P != null) {
            for (View view : w61Var.getViewPages()) {
                if (view != null) {
                    this.P.n(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float k10;
        View view;
        vj0 vj0Var = this.E;
        if (!this.f35722d0 && this.N != null) {
            boolean z10 = true;
            this.f35722d0 = true;
            try {
                float f10 = this.f35719b0;
                C();
                RecyclerView recyclerView = this.F;
                if (recyclerView != null && !this.f35729i0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.F;
                    int i7 = this.T;
                    this.N.getClass();
                    v(recyclerView2, i7, this.U);
                }
                w61 w61Var = this.I;
                if (w61Var != null && this.P != null && this.K != null) {
                    for (View view2 : w61Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.I) {
                            b(this.P.n(view2));
                        }
                    }
                    q();
                    float n10 = n();
                    boolean isInfinite = Float.isInfinite(n10);
                    bi.g2 g2Var = this.f35736w;
                    float f11 = 0.0f;
                    if (isInfinite) {
                        this.f35719b0 = Float.POSITIVE_INFINITY;
                        this.J.setVisibility(4);
                        this.K.setVisibility(4);
                        RecyclerView recyclerView3 = this.F;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f10 != this.f35719b0) {
                            g2Var.invalidate();
                        }
                        this.f35722d0 = false;
                        return;
                    }
                    float f12 = this.V;
                    if (n10 > f12 + 0.5f) {
                        f12 = n10;
                    }
                    this.f35717a0 = f12;
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (this.f35724e0) {
                        this.f35719b0 = vj0Var.b();
                        this.f35721c0 = Math.max(vj0Var.d, vj0Var.b());
                        View view3 = this.L;
                        float max = Math.max(0.0f, vj0Var.f40447a - vj0Var.d);
                        if (!vj0Var.f40451f) {
                            f11 = vj0Var.b() - vj0Var.f40448b;
                        }
                        w(view3, max + f11);
                        w(this.M, Math.max(vj0Var.d, vj0Var.b()) - vj0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.G;
                        if (recyclerView4 == null) {
                            k10 = 0.0f;
                        } else {
                            k10 = this.P.k(recyclerView4);
                        }
                        float max2 = this.f35717a0 - Math.max(0.0f, Math.min(k10, Math.max(0.0f, this.V - this.W)));
                        this.f35719b0 = max2;
                        this.f35721c0 = Math.max(this.V, max2);
                        w(this.I.getCurrentView(), Math.max(0.0f, this.f35717a0 - this.V));
                    }
                    this.F.setTranslationY(this.f35719b0 - n10);
                    this.K.setTranslationY(this.f35721c0 - view.getTop());
                    if (this.f35721c0 > this.V + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.N.getClass();
                    if (f10 != this.f35719b0) {
                        g2Var.invalidate();
                    }
                    this.f35722d0 = false;
                }
            } finally {
                this.f35722d0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        ft0 ft0Var = this.N;
        if (ft0Var == null) {
            return;
        }
        float U0 = ft0Var.U0();
        this.N.getClass();
        if (!Float.isNaN(U0) && !Float.isInfinite(U0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && U0 >= 0.0f) {
            if (this.f35727g0 && (U0 != this.V || 0.0f != this.W)) {
                float n10 = n();
                if (!Float.isInfinite(n10)) {
                    float f10 = this.V;
                    if (n10 > 0.5f + f10 && n10 >= U0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && U0 != f10) {
                        this.f35728h0 = true;
                    }
                    if (this.f35724e0) {
                        vj0 vj0Var = this.E;
                        float f11 = vj0Var.f40450e;
                        if (z10) {
                            n10 = U0;
                        }
                        gt0 gt0Var = this.P;
                        vj0Var.a(n10, gt0Var.k(gt0Var.n(this.L)), U0, 0.0f);
                        vj0Var.f40450e = Math.max(0.0f, Math.min(1.0f, f11));
                        this.f35736w.invalidate();
                    }
                }
            }
            this.V = U0;
            this.W = 0.0f;
            this.f35727g0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        et0 et0Var;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F != null && (et0Var = this.O) != null && this.N != null) {
            int b10 = et0Var.b();
            v4.o0 layoutManager = this.F.getLayoutManager();
            if (b10 != -1 && (layoutManager instanceof v4.b0)) {
                C();
                ((v4.b0) layoutManager).h1(b10, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
                this.f35728h0 = true;
                requestLayout();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        int i7;
        if (this.N != null && recyclerView != null) {
            C();
            View view = this.K;
            if (view == null) {
                i7 = 0;
            } else if (view.getHeight() > 0) {
                i7 = this.K.getHeight();
            } else {
                i7 = this.K.getLayoutParams().height;
            }
            setBleed(recyclerView);
            v(recyclerView, Math.max(0, i7) + Math.round(this.V) + this.T, this.N.b1() + this.U);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        w61 w61Var = this.I;
        if (w61Var != null && w61Var.getCurrentView() != null && !Float.isInfinite(n()) && this.f35721c0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.ht0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.it0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.ht0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f35716a) {
                this.f35733n++;
                this.f35723e = 0L;
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

    public final void e(String str, View view, int i7, int i10) {
        String str2;
        if (this.f35716a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f35723e < 250) {
                return;
            }
            this.f35723e = uptimeMillis;
            if (i10 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            f(str.concat(str2), view, i7, i7, true);
        }
    }

    public final void f(String str, View view, int i7, int i10, boolean z10) {
        View view2;
        View view3;
        long j3;
        int b10;
        v4.o0 layoutManager;
        int top;
        int height;
        float f10;
        gt0 gt0Var;
        if (this.f35716a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            w61 w61Var = this.I;
            int i11 = 0;
            View view4 = null;
            if (w61Var == null) {
                view2 = null;
            } else {
                view2 = w61Var.getViewPages()[0];
            }
            w61 w61Var2 = this.I;
            if (w61Var2 == null) {
                view3 = null;
            } else {
                view3 = w61Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f35733n);
            sb2.append(" transition=");
            sb2.append(this.f35734r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i7);
            sb2.append(" used=");
            sb2.append(i10);
            sb2.append(" transitioning=");
            sb2.append(this.f35724e0);
            sb2.append(" progress=");
            sb2.append(this.E.f40450e);
            sb2.append(" ageMs=");
            long j10 = 0;
            if (this.f35724e0) {
                j3 = uptimeMillis - this.f35725f;
            } else {
                j3 = 0;
            }
            sb2.append(j3);
            sb2.append(" unchangedMs=");
            if (this.f35724e0) {
                j10 = uptimeMillis - this.h;
            }
            sb2.append(j10);
            sb2.append(" depth=");
            sb2.append(this.R);
            sb2.append(" updating=");
            sb2.append(this.f35722d0);
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
            sb2.append(n());
            sb2.append(" pin=");
            sb2.append(this.V);
            sb2.append(" tail=");
            sb2.append(this.f35719b0);
            sb2.append(" alignPending=");
            sb2.append(this.f35728h0);
            et0 et0Var = this.O;
            int i12 = -1;
            if (et0Var == null) {
                b10 = -1;
            } else {
                b10 = et0Var.b();
            }
            RecyclerView recyclerView = this.F;
            if (recyclerView == null) {
                layoutManager = null;
            } else {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager != null && b10 != -1) {
                view4 = layoutManager.m(b10);
            }
            StringBuilder m10 = i5.c.m(b10, " row=", " anchor=");
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
                i11 = v4.o0.z(view4);
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
            if (recyclerView2 != null && (gt0Var = this.P) != null) {
                f10 = gt0Var.k(recyclerView2);
            } else {
                f10 = 0.0f;
            }
            m10.append(f10);
            m10.append(" tabsTop=");
            m10.append(this.f35721c0);
            m10.append(" draw=");
            m10.append(this.f35720c);
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
        return this.f35737x.b();
    }

    public float getTabsTop() {
        return this.f35721c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        it0 it0Var;
        if (this.f35716a) {
            it0Var = this;
            it0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            it0Var = this;
        }
        it0Var.f35724e0 = false;
        it0Var.M = null;
        it0Var.L = null;
        it0Var.f35736w.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.it0.j(float, float):boolean");
    }

    @Override
    public final void k(int i7, View view) {
        String str;
        if (i7 == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        f(str, view, 0, 0, true);
        e2.r0 r0Var = this.f35737x;
        if (i7 == 1) {
            r0Var.f10370b = 0;
        } else {
            r0Var.f10369a = 0;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.R == 0 && (view == (recyclerView = this.F) || view == this.G)) {
            if (this.f35724e0) {
                e("POST_BLOCKED", view, i12, i13);
                iArr[1] = iArr[1] + i12;
                return;
            }
            this.Q = view;
            try {
                org.telegram.messenger.ou ouVar = this.f35730j0;
                int i14 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i10 > 0 && i12 > 0) {
                    it0 it0Var = (it0) ouVar.f25804b;
                    et0 et0Var = it0Var.O;
                    if (et0Var != null && et0Var.b() != -1) {
                        i14 = it0Var.t(it0Var.G, i12);
                    }
                } else if (!z10 && i12 < 0) {
                    it0 it0Var2 = (it0) ouVar.f25804b;
                    i14 = it0Var2.t(it0Var2.F, i12);
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
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        int[] iArr = this.f35738y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i7, i10, i11, i12, i13, iArr);
    }

    public final float n() {
        View m10;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && this.O != null && recyclerView.getLayoutManager() != null) {
            v4.o0 layoutManager = this.F.getLayoutManager();
            int b10 = this.O.b();
            if (b10 != -1 && (m10 = layoutManager.m(b10)) != null) {
                return (v4.o0.z(m10) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((v4.p0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        boolean z10;
        String str;
        boolean z11 = false;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R == 0 && z10 && (view2 == this.F || view2 == this.G)) {
            z11 = true;
        }
        if (this.f35716a) {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                str = "NESTED_START";
            } else {
                str = "NESTED_REJECT";
            }
            sb2.append(str);
            sb2.append("_axes=");
            sb2.append(i7);
            sb2.append("_type=");
            sb2.append(i10);
            f(sb2.toString(), view2, 0, 0, true);
        }
        return z11;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f35732l0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f35732l0);
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
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        s(view, i7, i10, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        m(view, i7, i10, i11, i12, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        r(view, view2, i7, 0);
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return o(view, view2, i7, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    public final void p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.it0.p():void");
    }

    public final void q() {
        RecyclerView recyclerView;
        w61 w61Var = this.I;
        if (w61Var != null && this.P != null && w61Var.getCurrentView() != null) {
            recyclerView = this.P.n(this.I.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.G) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.G;
            ri riVar = this.f35731k0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.G.f2826x0;
                if (arrayList != null) {
                    arrayList.remove(riVar);
                }
            }
            this.G = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(riVar);
            }
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        e2.r0 r0Var = this.f35737x;
        if (i10 == 1) {
            r0Var.f10370b = i7;
        } else {
            r0Var.f10369a = i7;
        }
    }

    @Override
    public final void s(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.it0.s(android.view.View, int, int, int[], int):void");
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f35729i0 == z10) {
            return;
        }
        this.f35729i0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f35716a = z10;
        if (z10) {
            this.d = 0L;
            this.f35723e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f35725f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(ft0 ft0Var) {
        this.N = ft0Var;
        requestLayout();
        B();
    }

    public final int t(RecyclerView recyclerView, int i7) {
        int min;
        String str;
        if (recyclerView != null && i7 != 0) {
            if (recyclerView != this.Q) {
                RecyclerView recyclerView2 = this.H;
                int i10 = this.S;
                this.H = recyclerView;
                this.S = 0;
                this.R++;
                try {
                    recyclerView.scrollBy(0, i7);
                    int i11 = this.S;
                    if (i7 > 0) {
                        min = Math.max(0, Math.min(i7, i11));
                    } else {
                        min = Math.min(0, Math.max(i7, i11));
                    }
                    int i12 = min;
                    if (i11 == 0) {
                        str = "TRANSFER_ZERO";
                    } else {
                        str = "TRANSFER";
                    }
                    f(str, recyclerView, i7, i12, false);
                    return i12;
                } finally {
                    this.R--;
                    this.H = recyclerView2;
                    this.S = i10;
                }
            }
            f("TRANSFER_REENTRY", recyclerView, i7, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        if (i7 != 0) {
            f("TRANSFER_NO_TARGET", recyclerView, i7, 0, false);
        }
        return 0;
    }

    public final void u(uj0 uj0Var, et0 et0Var) {
        RecyclerView recyclerView = this.F;
        bi.g2 g2Var = this.f35736w;
        ri riVar = this.f35731k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.f2826x0;
            if (arrayList != null) {
                arrayList.remove(riVar);
            }
            g2Var.removeView(this.F);
        }
        this.F = uj0Var;
        this.O = et0Var;
        g2Var.addView(uj0Var, new FrameLayout.LayoutParams(-1, -1));
        uj0Var.j(riVar);
        uj0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        RecyclerView n10 = this.P.n(view);
        float f11 = this.V;
        n10.setTranslationY((f10 + f11) - Math.round(f11));
    }

    public final void x(View view, w61 w61Var, gt0 gt0Var) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = w61Var;
        this.P = gt0Var;
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

    public final void z(int i7, int i10) {
        this.T = Math.max(0, i7);
        this.U = Math.max(0, i10);
        requestLayout();
        B();
    }
}
