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
public class lu0 extends FrameLayout implements r0.l {
    public static final int f28268l0 = 0;
    public final vk0 D;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public x71 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public iu0 M;
    public hu0 N;
    public ju0 O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public boolean f28269a;
    public float f28270a0;
    public int f28271b;
    public float f28272b0;
    public int f28273c;
    public boolean f28274c0;
    public long d;
    public boolean f28275d0;
    public long e;
    public boolean f28276e0;
    public long f28277f;
    public boolean f28278f0;
    public boolean f28279g0;
    public long h;
    public boolean f28280h0;
    public final m2.t f28281i0;
    public final cu0 f28282j0;
    public final dt f28283k0;
    public int f28284n;
    public int f28285r;
    public final RectF f28286s;
    public final jg.l0 f28287w;
    public final ac.g f28288x;
    public final int[] f28289y;

    public lu0(Context context) {
        super(context);
        this.f28286s = new RectF();
        this.f28288x = new Object();
        this.f28289y = new int[2];
        this.D = new Object();
        this.f28281i0 = new m2.t(this, 14);
        this.f28282j0 = new cu0(this, 1);
        this.f28283k0 = new dt(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        jg.l0 l0Var = new jg.l0(this, context);
        this.f28287w = l0Var;
        addView(l0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b10;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder i10 = sc.e.i(str, ",scrollState=");
            i10.append(recyclerView.getScrollState());
            i10.append(",up=");
            i10.append(recyclerView.canScrollVertically(-1));
            i10.append(",down=");
            i10.append(recyclerView.canScrollVertically(1));
            i10.append(",layout=");
            i10.append(recyclerView.c0());
            i10.append(",pendingUpdates=");
            i10.append(recyclerView.Z());
            i10.append(",animating=");
            i10.append(recyclerView.b0());
            i10.append(",paddingTop=");
            i10.append(recyclerView.getPaddingTop());
            i10.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b10 = 0;
            } else {
                b10 = recyclerView.getAdapter().b();
            }
            i10.append(b10);
            str = i10.toString();
        }
        return sc.e.A(str, ")");
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
        if (this.f28276e0 == z10) {
            return;
        }
        this.f28276e0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.E, 0, 0, true);
        this.M.F(z10);
    }

    public static void v(RecyclerView recyclerView, int i10, int i11) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i10 || recyclerView.getPaddingBottom() != i11) {
            s4.n0 layoutManager = recyclerView.getLayoutManager();
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
                b10 = ((s4.o0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i12 = (s4.n0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            if (b10 != -1 && (layoutManager instanceof s4.a0)) {
                ((s4.a0) layoutManager).h1(b10, i12);
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
        x71 x71Var = this.H;
        if (x71Var != null && this.O != null) {
            for (View view : x71Var.getViewPages()) {
                if (view != null) {
                    this.O.j(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float f7;
        View view;
        vk0 vk0Var = this.D;
        if (!this.f28274c0 && this.M != null) {
            boolean z10 = true;
            this.f28274c0 = true;
            try {
                float f10 = this.f28270a0;
                C();
                RecyclerView recyclerView = this.E;
                if (recyclerView != null && !this.f28280h0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.E;
                    int i10 = this.S;
                    this.M.getClass();
                    v(recyclerView2, i10, this.T);
                }
                x71 x71Var = this.H;
                if (x71Var != null && this.O != null && this.J != null) {
                    for (View view2 : x71Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.H) {
                            b(this.O.j(view2));
                        }
                    }
                    r();
                    float o10 = o();
                    boolean isInfinite = Float.isInfinite(o10);
                    jg.l0 l0Var = this.f28287w;
                    float f11 = 0.0f;
                    if (isInfinite) {
                        this.f28270a0 = Float.POSITIVE_INFINITY;
                        this.I.setVisibility(4);
                        this.J.setVisibility(4);
                        RecyclerView recyclerView3 = this.E;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f10 != this.f28270a0) {
                            l0Var.invalidate();
                        }
                        this.f28274c0 = false;
                        return;
                    }
                    float f12 = this.U;
                    if (o10 > f12 + 0.5f) {
                        f12 = o10;
                    }
                    this.W = f12;
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    if (this.f28275d0) {
                        this.f28270a0 = vk0Var.b();
                        this.f28272b0 = Math.max(vk0Var.d, vk0Var.b());
                        View view3 = this.K;
                        float max = Math.max(0.0f, vk0Var.f31310a - vk0Var.d);
                        if (!vk0Var.f31313f) {
                            f11 = vk0Var.b() - vk0Var.f31311b;
                        }
                        w(view3, max + f11);
                        w(this.L, Math.max(vk0Var.d, vk0Var.b()) - vk0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.F;
                        if (recyclerView4 == null) {
                            f7 = 0.0f;
                        } else {
                            f7 = this.O.f(recyclerView4);
                        }
                        float max2 = this.W - Math.max(0.0f, Math.min(f7, Math.max(0.0f, this.U - this.V)));
                        this.f28270a0 = max2;
                        this.f28272b0 = Math.max(this.U, max2);
                        w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                    }
                    this.E.setTranslationY(this.f28270a0 - o10);
                    this.J.setTranslationY(this.f28272b0 - view.getTop());
                    if (this.f28272b0 > this.U + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.M.getClass();
                    if (f10 != this.f28270a0) {
                        l0Var.invalidate();
                    }
                    this.f28274c0 = false;
                }
            } finally {
                this.f28274c0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        iu0 iu0Var = this.M;
        if (iu0Var == null) {
            return;
        }
        float a12 = iu0Var.a1();
        this.M.getClass();
        if (!Float.isNaN(a12) && !Float.isInfinite(a12) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && a12 >= 0.0f) {
            if (this.f28278f0 && (a12 != this.U || 0.0f != this.V)) {
                float o10 = o();
                if (!Float.isInfinite(o10)) {
                    float f7 = this.U;
                    if (o10 > 0.5f + f7 && o10 >= a12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && a12 != f7) {
                        this.f28279g0 = true;
                    }
                    if (this.f28275d0) {
                        vk0 vk0Var = this.D;
                        float f10 = vk0Var.e;
                        if (z10) {
                            o10 = a12;
                        }
                        ju0 ju0Var = this.O;
                        vk0Var.a(o10, ju0Var.f(ju0Var.j(this.K)), a12, 0.0f);
                        vk0Var.e = Math.max(0.0f, Math.min(1.0f, f10));
                        this.f28287w.invalidate();
                    }
                }
            }
            this.U = a12;
            this.V = 0.0f;
            this.f28278f0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        hu0 hu0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E != null && (hu0Var = this.N) != null && this.M != null) {
            int c10 = hu0Var.c();
            s4.n0 layoutManager = this.E.getLayoutManager();
            if (c10 != -1 && (layoutManager instanceof s4.a0)) {
                C();
                ((s4.a0) layoutManager).h1(c10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
                this.f28279g0 = true;
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
            v(recyclerView, Math.max(0, i10) + Math.round(this.U) + this.S, this.M.g1() + this.T);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        x71 x71Var = this.H;
        if (x71Var != null && x71Var.getCurrentView() != null && !Float.isInfinite(o()) && this.f28272b0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.ku0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lu0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.ku0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f28269a) {
                this.f28284n++;
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
        if (this.f28269a) {
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
        s4.n0 layoutManager;
        int top;
        int height;
        float f7;
        ju0 ju0Var;
        if (this.f28269a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            x71 x71Var = this.H;
            int i12 = 0;
            View view4 = null;
            if (x71Var == null) {
                view2 = null;
            } else {
                view2 = x71Var.getViewPages()[0];
            }
            x71 x71Var2 = this.H;
            if (x71Var2 == null) {
                view3 = null;
            } else {
                view3 = x71Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f28284n);
            sb2.append(" transition=");
            sb2.append(this.f28285r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.f28275d0);
            sb2.append(" progress=");
            sb2.append(this.D.e);
            sb2.append(" ageMs=");
            long j11 = 0;
            if (this.f28275d0) {
                j10 = uptimeMillis - this.f28277f;
            } else {
                j10 = 0;
            }
            sb2.append(j10);
            sb2.append(" unchangedMs=");
            if (this.f28275d0) {
                j11 = uptimeMillis - this.h;
            }
            sb2.append(j11);
            sb2.append(" depth=");
            sb2.append(this.Q);
            sb2.append(" updating=");
            sb2.append(this.f28274c0);
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
            sb2.append(o());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.f28270a0);
            sb2.append(" alignPending=");
            sb2.append(this.f28279g0);
            hu0 hu0Var = this.N;
            int i13 = -1;
            if (hu0Var == null) {
                c10 = -1;
            } else {
                c10 = hu0Var.c();
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
            StringBuilder l4 = i0.a.l(c10, " row=", " anchor=");
            l4.append(h(view4));
            l4.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            l4.append(top);
            l4.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            l4.append(height);
            l4.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i12 = s4.n0.z(view4);
            }
            l4.append(i12);
            l4.append(" adapterPosition=");
            if (view4 != null) {
                this.E.getClass();
                i13 = RecyclerView.R(view4);
            }
            l4.append(i13);
            l4.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            if (recyclerView2 != null && (ju0Var = this.O) != null) {
                f7 = ju0Var.f(recyclerView2);
            } else {
                f7 = 0.0f;
            }
            l4.append(f7);
            l4.append(" tabsTop=");
            l4.append(this.f28272b0);
            l4.append(" draw=");
            l4.append(this.f28273c);
            sb2.append(l4.toString());
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
        return this.f28288x.b();
    }

    public float getTabsTop() {
        return this.f28272b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        lu0 lu0Var;
        if (this.f28269a) {
            lu0Var = this;
            lu0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            lu0Var = this;
        }
        lu0Var.f28275d0 = false;
        lu0Var.L = null;
        lu0Var.K = null;
        lu0Var.f28287w.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lu0.j(float, float):boolean");
    }

    @Override
    public final void k(int i10, View view) {
        String str;
        if (i10 == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        f(str, view, 0, 0, true);
        ac.g gVar = this.f28288x;
        if (i10 == 1) {
            gVar.f386b = 0;
        } else {
            gVar.f385a = 0;
        }
    }

    @Override
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.Q == 0 && (view == (recyclerView = this.E) || view == this.F)) {
            if (this.f28275d0) {
                e("POST_BLOCKED", view, i13, i14);
                iArr[1] = iArr[1] + i13;
                return;
            }
            this.P = view;
            try {
                m2.t tVar = this.f28281i0;
                int i15 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i11 > 0 && i13 > 0) {
                    lu0 lu0Var = (lu0) tVar.f12685b;
                    hu0 hu0Var = lu0Var.N;
                    if (hu0Var != null && hu0Var.c() != -1) {
                        i15 = lu0Var.t(lu0Var.F, i13);
                    }
                } else if (!z10 && i13 < 0) {
                    lu0 lu0Var2 = (lu0) tVar.f12685b;
                    i15 = lu0Var2.t(lu0Var2.E, i13);
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
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f28289y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override
    public final boolean n(View view, View view2, int i10, int i11) {
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
        if (this.f28269a) {
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

    public final float o() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView != null && this.N != null && recyclerView.getLayoutManager() != null) {
            s4.n0 layoutManager = this.E.getLayoutManager();
            int c10 = this.N.c();
            if (c10 != -1 && (m10 = layoutManager.m(c10)) != null) {
                return (s4.n0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.o0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f28283k0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f28283k0);
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
        s(view, i10, i11, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        q(view, view2, i10, 0);
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return n(view, view2, i10, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    public final void p() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lu0.p():void");
    }

    @Override
    public final void q(View view, View view2, int i10, int i11) {
        ac.g gVar = this.f28288x;
        if (i11 == 1) {
            gVar.f386b = i10;
        } else {
            gVar.f385a = i10;
        }
    }

    public final void r() {
        RecyclerView recyclerView;
        x71 x71Var = this.H;
        if (x71Var != null && this.O != null && x71Var.getCurrentView() != null) {
            recyclerView = this.O.j(this.H.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.F) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.F;
            cu0 cu0Var = this.f28282j0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.F.f1921w0;
                if (arrayList != null) {
                    arrayList.remove(cu0Var);
                }
            }
            this.F = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(cu0Var);
            }
        }
    }

    @Override
    public final void s(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lu0.s(android.view.View, int, int, int[], int):void");
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f28280h0 == z10) {
            return;
        }
        this.f28280h0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f28269a = z10;
        if (z10) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f28277f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(iu0 iu0Var) {
        this.M = iu0Var;
        requestLayout();
        B();
    }

    public final int t(RecyclerView recyclerView, int i10) {
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

    public final void u(uk0 uk0Var, hu0 hu0Var) {
        RecyclerView recyclerView = this.E;
        jg.l0 l0Var = this.f28287w;
        cu0 cu0Var = this.f28282j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.f1921w0;
            if (arrayList != null) {
                arrayList.remove(cu0Var);
            }
            l0Var.removeView(this.E);
        }
        this.E = uk0Var;
        this.N = hu0Var;
        l0Var.addView(uk0Var, new FrameLayout.LayoutParams(-1, -1));
        uk0Var.j(cu0Var);
        uk0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f7) {
        if (view == null) {
            return;
        }
        RecyclerView j10 = this.O.j(view);
        float f10 = this.U;
        j10.setTranslationY((f7 + f10) - Math.round(f10));
    }

    public final void x(View view, x71 x71Var, ju0 ju0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = x71Var;
        this.O = ju0Var;
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
