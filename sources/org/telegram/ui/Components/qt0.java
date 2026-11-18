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
public class qt0 extends FrameLayout implements r0.l {
    public static final int m0 = 0;
    public final dk0 E;
    public RecyclerView F;
    public RecyclerView G;
    public RecyclerView H;
    public g71 I;
    public View J;
    public View K;
    public View L;
    public View M;
    public nt0 N;
    public mt0 O;
    public ot0 P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean f38896a;
    public float f38897a0;
    public int f38898b;
    public float f38899b0;
    public int f38900c;
    public float f38901c0;
    public long d;
    public boolean f38902d0;
    public long f38903e;
    public boolean f38904e0;
    public long f38905f;
    public boolean f38906f0;
    public boolean f38907g0;
    public long h;
    public boolean f38908h0;
    public boolean f38909i0;
    public final hn f38910j0;
    public final oa f38911k0;
    public final fl f38912l0;
    public int f38913n;
    public int f38914r;
    public final RectF f38915s;
    public final bi.a3 f38916w;
    public final e2.r0 f38917x;
    public final int[] f38918y;

    public qt0(Context context) {
        super(context);
        this.f38915s = new RectF();
        this.f38917x = new Object();
        this.f38918y = new int[2];
        this.E = new Object();
        this.f38910j0 = new hn(this, 6);
        this.f38911k0 = new oa(this, 19);
        this.f38912l0 = new fl(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        bi.a3 a3Var = new bi.a3(this, context);
        this.f38916w = a3Var;
        addView(a3Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b10;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder n10 = p5.c.n(str, ",scrollState=");
            n10.append(recyclerView.getScrollState());
            n10.append(",up=");
            n10.append(recyclerView.canScrollVertically(-1));
            n10.append(",down=");
            n10.append(recyclerView.canScrollVertically(1));
            n10.append(",layout=");
            n10.append(recyclerView.c0());
            n10.append(",pendingUpdates=");
            n10.append(recyclerView.Z());
            n10.append(",animating=");
            n10.append(recyclerView.b0());
            n10.append(",paddingTop=");
            n10.append(recyclerView.getPaddingTop());
            n10.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b10 = 0;
            } else {
                b10 = recyclerView.getAdapter().b();
            }
            n10.append(b10);
            str = n10.toString();
        }
        return p5.c.v(str, ")");
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
        if (this.f38906f0 == z10) {
            return;
        }
        this.f38906f0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.F, 0, 0, true);
        this.N.G(z10);
    }

    public static void v(RecyclerView recyclerView, int i7, int i10) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i7 || recyclerView.getPaddingBottom() != i10) {
            v4.p0 layoutManager = recyclerView.getLayoutManager();
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
                b10 = ((v4.q0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i11 = (v4.p0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).topMargin;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            if (b10 != -1 && (layoutManager instanceof v4.c0)) {
                ((v4.c0) layoutManager).h1(b10, i11);
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
        g71 g71Var = this.I;
        if (g71Var != null && this.P != null) {
            for (View view : g71Var.getViewPages()) {
                if (view != null) {
                    this.P.n(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float j3;
        View view;
        dk0 dk0Var = this.E;
        if (!this.f38902d0 && this.N != null) {
            boolean z10 = true;
            this.f38902d0 = true;
            try {
                float f10 = this.f38899b0;
                C();
                RecyclerView recyclerView = this.F;
                if (recyclerView != null && !this.f38909i0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.F;
                    int i7 = this.T;
                    this.N.getClass();
                    v(recyclerView2, i7, this.U);
                }
                g71 g71Var = this.I;
                if (g71Var != null && this.P != null && this.K != null) {
                    for (View view2 : g71Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.I) {
                            b(this.P.n(view2));
                        }
                    }
                    q();
                    float n10 = n();
                    boolean isInfinite = Float.isInfinite(n10);
                    bi.a3 a3Var = this.f38916w;
                    float f11 = 0.0f;
                    if (isInfinite) {
                        this.f38899b0 = Float.POSITIVE_INFINITY;
                        this.J.setVisibility(4);
                        this.K.setVisibility(4);
                        RecyclerView recyclerView3 = this.F;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f10 != this.f38899b0) {
                            a3Var.invalidate();
                        }
                        this.f38902d0 = false;
                        return;
                    }
                    float f12 = this.V;
                    if (n10 > f12 + 0.5f) {
                        f12 = n10;
                    }
                    this.f38897a0 = f12;
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (this.f38904e0) {
                        this.f38899b0 = dk0Var.b();
                        this.f38901c0 = Math.max(dk0Var.d, dk0Var.b());
                        View view3 = this.L;
                        float max = Math.max(0.0f, dk0Var.f34457a - dk0Var.d);
                        if (!dk0Var.f34461f) {
                            f11 = dk0Var.b() - dk0Var.f34458b;
                        }
                        w(view3, max + f11);
                        w(this.M, Math.max(dk0Var.d, dk0Var.b()) - dk0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.G;
                        if (recyclerView4 == null) {
                            j3 = 0.0f;
                        } else {
                            j3 = this.P.j(recyclerView4);
                        }
                        float max2 = this.f38897a0 - Math.max(0.0f, Math.min(j3, Math.max(0.0f, this.V - this.W)));
                        this.f38899b0 = max2;
                        this.f38901c0 = Math.max(this.V, max2);
                        w(this.I.getCurrentView(), Math.max(0.0f, this.f38897a0 - this.V));
                    }
                    this.F.setTranslationY(this.f38899b0 - n10);
                    this.K.setTranslationY(this.f38901c0 - view.getTop());
                    if (this.f38901c0 > this.V + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.N.getClass();
                    if (f10 != this.f38899b0) {
                        a3Var.invalidate();
                    }
                    this.f38902d0 = false;
                }
            } finally {
                this.f38902d0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        nt0 nt0Var = this.N;
        if (nt0Var == null) {
            return;
        }
        float U0 = nt0Var.U0();
        this.N.getClass();
        if (!Float.isNaN(U0) && !Float.isInfinite(U0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && U0 >= 0.0f) {
            if (this.f38907g0 && (U0 != this.V || 0.0f != this.W)) {
                float n10 = n();
                if (!Float.isInfinite(n10)) {
                    float f10 = this.V;
                    if (n10 > 0.5f + f10 && n10 >= U0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && U0 != f10) {
                        this.f38908h0 = true;
                    }
                    if (this.f38904e0) {
                        dk0 dk0Var = this.E;
                        float f11 = dk0Var.f34460e;
                        if (z10) {
                            n10 = U0;
                        }
                        ot0 ot0Var = this.P;
                        dk0Var.a(n10, ot0Var.j(ot0Var.n(this.L)), U0, 0.0f);
                        dk0Var.f34460e = Math.max(0.0f, Math.min(1.0f, f11));
                        this.f38916w.invalidate();
                    }
                }
            }
            this.V = U0;
            this.W = 0.0f;
            this.f38907g0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        mt0 mt0Var;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F != null && (mt0Var = this.O) != null && this.N != null) {
            int b10 = mt0Var.b();
            v4.p0 layoutManager = this.F.getLayoutManager();
            if (b10 != -1 && (layoutManager instanceof v4.c0)) {
                C();
                ((v4.c0) layoutManager).h1(b10, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
                this.f38908h0 = true;
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
            v(recyclerView, Math.max(0, i7) + Math.round(this.V) + this.T, this.N.j1() + this.U);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        g71 g71Var = this.I;
        if (g71Var != null && g71Var.getCurrentView() != null && !Float.isInfinite(n()) && this.f38901c0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.pt0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.pt0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f38896a) {
                this.f38913n++;
                this.f38903e = 0L;
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
        if (this.f38896a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f38903e < 250) {
                return;
            }
            this.f38903e = uptimeMillis;
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
        v4.p0 layoutManager;
        int top;
        int height;
        float f10;
        ot0 ot0Var;
        if (this.f38896a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            g71 g71Var = this.I;
            int i11 = 0;
            View view4 = null;
            if (g71Var == null) {
                view2 = null;
            } else {
                view2 = g71Var.getViewPages()[0];
            }
            g71 g71Var2 = this.I;
            if (g71Var2 == null) {
                view3 = null;
            } else {
                view3 = g71Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f38913n);
            sb2.append(" transition=");
            sb2.append(this.f38914r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i7);
            sb2.append(" used=");
            sb2.append(i10);
            sb2.append(" transitioning=");
            sb2.append(this.f38904e0);
            sb2.append(" progress=");
            sb2.append(this.E.f34460e);
            sb2.append(" ageMs=");
            long j10 = 0;
            if (this.f38904e0) {
                j3 = uptimeMillis - this.f38905f;
            } else {
                j3 = 0;
            }
            sb2.append(j3);
            sb2.append(" unchangedMs=");
            if (this.f38904e0) {
                j10 = uptimeMillis - this.h;
            }
            sb2.append(j10);
            sb2.append(" depth=");
            sb2.append(this.R);
            sb2.append(" updating=");
            sb2.append(this.f38902d0);
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
            sb2.append(this.f38899b0);
            sb2.append(" alignPending=");
            sb2.append(this.f38908h0);
            mt0 mt0Var = this.O;
            int i12 = -1;
            if (mt0Var == null) {
                b10 = -1;
            } else {
                b10 = mt0Var.b();
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
                i11 = v4.p0.z(view4);
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
            if (recyclerView2 != null && (ot0Var = this.P) != null) {
                f10 = ot0Var.j(recyclerView2);
            } else {
                f10 = 0.0f;
            }
            m10.append(f10);
            m10.append(" tabsTop=");
            m10.append(this.f38901c0);
            m10.append(" draw=");
            m10.append(this.f38900c);
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
        return this.f38917x.b();
    }

    public float getTabsTop() {
        return this.f38901c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        qt0 qt0Var;
        if (this.f38896a) {
            qt0Var = this;
            qt0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            qt0Var = this;
        }
        qt0Var.f38904e0 = false;
        qt0Var.M = null;
        qt0Var.L = null;
        qt0Var.f38916w.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.j(float, float):boolean");
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
        e2.r0 r0Var = this.f38917x;
        if (i7 == 1) {
            r0Var.f10688b = 0;
        } else {
            r0Var.f10687a = 0;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.R == 0 && (view == (recyclerView = this.F) || view == this.G)) {
            if (this.f38904e0) {
                e("POST_BLOCKED", view, i12, i13);
                iArr[1] = iArr[1] + i12;
                return;
            }
            this.Q = view;
            try {
                hn hnVar = this.f38910j0;
                int i14 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i10 > 0 && i12 > 0) {
                    qt0 qt0Var = (qt0) hnVar.f35933b;
                    mt0 mt0Var = qt0Var.O;
                    if (mt0Var != null && mt0Var.b() != -1) {
                        i14 = qt0Var.t(qt0Var.G, i12);
                    }
                } else if (!z10 && i12 < 0) {
                    qt0 qt0Var2 = (qt0) hnVar.f35933b;
                    i14 = qt0Var2.t(qt0Var2.F, i12);
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
        int[] iArr = this.f38918y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i7, i10, i11, i12, i13, iArr);
    }

    public final float n() {
        View m10;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && this.O != null && recyclerView.getLayoutManager() != null) {
            v4.p0 layoutManager = this.F.getLayoutManager();
            int b10 = this.O.b();
            if (b10 != -1 && (m10 = layoutManager.m(b10)) != null) {
                return (v4.p0.z(m10) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((v4.q0) m10.getLayoutParams())).topMargin;
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
        if (this.f38896a) {
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
        getViewTreeObserver().addOnPreDrawListener(this.f38912l0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f38912l0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.p():void");
    }

    public final void q() {
        RecyclerView recyclerView;
        g71 g71Var = this.I;
        if (g71Var != null && this.P != null && g71Var.getCurrentView() != null) {
            recyclerView = this.P.n(this.I.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.G) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.G;
            oa oaVar = this.f38911k0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.G.f2820x0;
                if (arrayList != null) {
                    arrayList.remove(oaVar);
                }
            }
            this.G = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(oaVar);
            }
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        e2.r0 r0Var = this.f38917x;
        if (i10 == 1) {
            r0Var.f10688b = i7;
        } else {
            r0Var.f10687a = i7;
        }
    }

    @Override
    public final void s(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qt0.s(android.view.View, int, int, int[], int):void");
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f38909i0 == z10) {
            return;
        }
        this.f38909i0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f38896a = z10;
        if (z10) {
            this.d = 0L;
            this.f38903e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f38905f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(nt0 nt0Var) {
        this.N = nt0Var;
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

    public final void u(ck0 ck0Var, mt0 mt0Var) {
        RecyclerView recyclerView = this.F;
        bi.a3 a3Var = this.f38916w;
        oa oaVar = this.f38911k0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.F.f2820x0;
            if (arrayList != null) {
                arrayList.remove(oaVar);
            }
            a3Var.removeView(this.F);
        }
        this.F = ck0Var;
        this.O = mt0Var;
        a3Var.addView(ck0Var, new FrameLayout.LayoutParams(-1, -1));
        ck0Var.j(oaVar);
        ck0Var.setNestedScrollingEnabled(true);
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

    public final void x(View view, g71 g71Var, ot0 ot0Var) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = g71Var;
        this.P = ot0Var;
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
