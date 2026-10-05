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
public class bw0 extends FrameLayout implements r0.m {
    public static final int f25116l0 = 0;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public h91 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public yv0 M;
    public xv0 N;
    public zv0 O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public boolean f25117a;
    public float f25118a0;
    public int f25119b;
    public float f25120b0;
    public int f25121c;
    public boolean f25122c0;
    public long d;
    public boolean f25123d0;
    public long f25124e;
    public boolean f25125e0;
    public long f25126f;
    public boolean f25127f0;
    public boolean f25128g0;
    public long h;
    public boolean f25129h0;
    public final k2.e f25130i0;
    public final xb0 f25131j0;
    public final ut f25132k0;
    public int f25133n;
    public int f25134r;
    public final RectF f25135s;
    public final ai.f0 v;
    public final b2.q0 f25136w;
    public final int[] f25137x;
    public final am0 f25138y;

    public bw0(Context context) {
        super(context);
        this.f25135s = new RectF();
        this.f25136w = new Object();
        this.f25137x = new int[2];
        this.f25138y = new Object();
        this.f25130i0 = new k2.e(this, 12);
        this.f25131j0 = new xb0(this, 6);
        this.f25132k0 = new ut(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        ai.f0 f0Var = new ai.f0(this, context);
        this.v = f0Var;
        addView(f0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int h;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder j3 = sa.e.j(str, ",scrollState=");
            j3.append(recyclerView.getScrollState());
            j3.append(",up=");
            j3.append(recyclerView.canScrollVertically(-1));
            j3.append(",down=");
            j3.append(recyclerView.canScrollVertically(1));
            j3.append(",layout=");
            j3.append(recyclerView.c0());
            j3.append(",pendingUpdates=");
            j3.append(recyclerView.Z());
            j3.append(",animating=");
            j3.append(recyclerView.b0());
            j3.append(",paddingTop=");
            j3.append(recyclerView.getPaddingTop());
            j3.append(",count=");
            if (recyclerView.getAdapter() == null) {
                h = 0;
            } else {
                h = recyclerView.getAdapter().h();
            }
            j3.append(h);
            str = j3.toString();
        }
        return sa.e.v(str, ")");
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
        if (this.f25125e0 == z10) {
            return;
        }
        this.f25125e0 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.E, 0, 0, true);
        this.M.E(z10);
    }

    public static void v(RecyclerView recyclerView, int i10, int i11) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i10 || recyclerView.getPaddingBottom() != i11) {
            s4.o0 layoutManager = recyclerView.getLayoutManager();
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
                b10 = ((s4.p0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i12 = (s4.o0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
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
        h91 h91Var = this.H;
        if (h91Var != null && this.O != null) {
            for (View view : h91Var.getViewPages()) {
                if (view != null) {
                    this.O.i(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float h;
        View view;
        am0 am0Var = this.f25138y;
        if (!this.f25122c0 && this.M != null) {
            boolean z10 = true;
            this.f25122c0 = true;
            try {
                float f7 = this.f25118a0;
                C();
                RecyclerView recyclerView = this.E;
                if (recyclerView != null && !this.f25129h0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.E;
                    int i10 = this.S;
                    this.M.getClass();
                    v(recyclerView2, i10, this.T);
                }
                h91 h91Var = this.H;
                if (h91Var != null && this.O != null && this.J != null) {
                    for (View view2 : h91Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.H) {
                            b(this.O.i(view2));
                        }
                    }
                    q();
                    float k10 = k();
                    boolean isInfinite = Float.isInfinite(k10);
                    ai.f0 f0Var = this.v;
                    float f10 = 0.0f;
                    if (isInfinite) {
                        this.f25118a0 = Float.POSITIVE_INFINITY;
                        this.I.setVisibility(4);
                        this.J.setVisibility(4);
                        RecyclerView recyclerView3 = this.E;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f7 != this.f25118a0) {
                            f0Var.invalidate();
                        }
                        this.f25122c0 = false;
                        return;
                    }
                    float f11 = this.U;
                    if (k10 > f11 + 0.5f) {
                        f11 = k10;
                    }
                    this.W = f11;
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    if (this.f25123d0) {
                        this.f25118a0 = am0Var.b();
                        this.f25120b0 = Math.max(am0Var.d, am0Var.b());
                        View view3 = this.K;
                        float max = Math.max(0.0f, am0Var.f24642a - am0Var.d);
                        if (!am0Var.f24646f) {
                            f10 = am0Var.b() - am0Var.f24643b;
                        }
                        w(view3, max + f10);
                        w(this.L, Math.max(am0Var.d, am0Var.b()) - am0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.F;
                        if (recyclerView4 == null) {
                            h = 0.0f;
                        } else {
                            h = this.O.h(recyclerView4);
                        }
                        float max2 = this.W - Math.max(0.0f, Math.min(h, Math.max(0.0f, this.U - this.V)));
                        this.f25118a0 = max2;
                        this.f25120b0 = Math.max(this.U, max2);
                        w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                    }
                    this.E.setTranslationY(this.f25118a0 - k10);
                    this.J.setTranslationY(this.f25120b0 - view.getTop());
                    if (this.f25120b0 > this.U + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.M.getClass();
                    if (f7 != this.f25118a0) {
                        f0Var.invalidate();
                    }
                    this.f25122c0 = false;
                }
            } finally {
                this.f25122c0 = false;
            }
        }
    }

    public final void C() {
        boolean z10;
        yv0 yv0Var = this.M;
        if (yv0Var == null) {
            return;
        }
        float Y0 = yv0Var.Y0();
        this.M.getClass();
        if (!Float.isNaN(Y0) && !Float.isInfinite(Y0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && Y0 >= 0.0f) {
            if (this.f25127f0 && (Y0 != this.U || 0.0f != this.V)) {
                float k10 = k();
                if (!Float.isInfinite(k10)) {
                    float f7 = this.U;
                    if (k10 > 0.5f + f7 && k10 >= Y0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && Y0 != f7) {
                        this.f25128g0 = true;
                    }
                    if (this.f25123d0) {
                        am0 am0Var = this.f25138y;
                        float f10 = am0Var.f24645e;
                        if (z10) {
                            k10 = Y0;
                        }
                        zv0 zv0Var = this.O;
                        am0Var.a(k10, zv0Var.h(zv0Var.i(this.K)), Y0, 0.0f);
                        am0Var.f24645e = Math.max(0.0f, Math.min(1.0f, f10));
                        this.v.invalidate();
                    }
                }
            }
            this.U = Y0;
            this.V = 0.0f;
            this.f25127f0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        xv0 xv0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E != null && (xv0Var = this.N) != null && this.M != null) {
            int b10 = xv0Var.b();
            s4.o0 layoutManager = this.E.getLayoutManager();
            if (b10 != -1 && (layoutManager instanceof s4.c0)) {
                C();
                ((s4.c0) layoutManager).h1(b10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
                this.f25128g0 = true;
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
            int i11 = this.S;
            v(recyclerView, Math.max(0, i10) + Math.round(this.U) + i11, this.M.e1() + this.T);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        h91 h91Var = this.H;
        if (h91Var != null && h91Var.getCurrentView() != null && !Float.isInfinite(k()) && this.f25120b0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.aw0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.aw0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f25117a) {
                this.f25133n++;
                this.f25124e = 0L;
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
        if (this.f25117a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f25124e < 250) {
                return;
            }
            this.f25124e = uptimeMillis;
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
        long j3;
        int b10;
        s4.o0 layoutManager;
        int top;
        int height;
        float f7;
        zv0 zv0Var;
        if (this.f25117a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            h91 h91Var = this.H;
            int i12 = 0;
            View view4 = null;
            if (h91Var == null) {
                view2 = null;
            } else {
                view2 = h91Var.getViewPages()[0];
            }
            h91 h91Var2 = this.H;
            if (h91Var2 == null) {
                view3 = null;
            } else {
                view3 = h91Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f25133n);
            sb2.append(" transition=");
            sb2.append(this.f25134r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.f25123d0);
            sb2.append(" progress=");
            sb2.append(this.f25138y.f24645e);
            sb2.append(" ageMs=");
            long j10 = 0;
            if (this.f25123d0) {
                j3 = uptimeMillis - this.f25126f;
            } else {
                j3 = 0;
            }
            sb2.append(j3);
            sb2.append(" unchangedMs=");
            if (this.f25123d0) {
                j10 = uptimeMillis - this.h;
            }
            sb2.append(j10);
            sb2.append(" depth=");
            sb2.append(this.Q);
            sb2.append(" updating=");
            sb2.append(this.f25122c0);
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
            sb2.append(this.f25118a0);
            sb2.append(" alignPending=");
            sb2.append(this.f25128g0);
            xv0 xv0Var = this.N;
            int i13 = -1;
            if (xv0Var == null) {
                b10 = -1;
            } else {
                b10 = xv0Var.b();
            }
            RecyclerView recyclerView = this.E;
            if (recyclerView == null) {
                layoutManager = null;
            } else {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager != null && b10 != -1) {
                view4 = layoutManager.m(b10);
            }
            StringBuilder j11 = hg.c.j(b10, " row=", " anchor=");
            j11.append(h(view4));
            j11.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            j11.append(top);
            j11.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            j11.append(height);
            j11.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i12 = s4.o0.z(view4);
            }
            j11.append(i12);
            j11.append(" adapterPosition=");
            if (view4 != null) {
                this.E.getClass();
                i13 = RecyclerView.R(view4);
            }
            j11.append(i13);
            j11.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            if (recyclerView2 != null && (zv0Var = this.O) != null) {
                f7 = zv0Var.h(recyclerView2);
            } else {
                f7 = 0.0f;
            }
            j11.append(f7);
            j11.append(" tabsTop=");
            j11.append(this.f25120b0);
            j11.append(" draw=");
            j11.append(this.f25121c);
            sb2.append(j11.toString());
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
        return this.f25136w.b();
    }

    public float getTabsTop() {
        return this.f25120b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        bw0 bw0Var;
        if (this.f25117a) {
            bw0Var = this;
            bw0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            bw0Var = this;
        }
        bw0Var.f25123d0 = false;
        bw0Var.L = null;
        bw0Var.K = null;
        bw0Var.v.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.j(float, float):boolean");
    }

    public final float k() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView != null && this.N != null && recyclerView.getLayoutManager() != null) {
            s4.o0 layoutManager = this.E.getLayoutManager();
            int b10 = this.N.b();
            if (b10 != -1 && (m10 = layoutManager.m(b10)) != null) {
                return (s4.o0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.p0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.l():void");
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
        b2.q0 q0Var = this.f25136w;
        if (i10 == 1) {
            q0Var.f3455b = 0;
        } else {
            q0Var.f3454a = 0;
        }
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.Q == 0 && (view == (recyclerView = this.E) || view == this.F)) {
            if (this.f25123d0) {
                e("POST_BLOCKED", view, i13, i14);
                iArr[1] = iArr[1] + i13;
                return;
            }
            this.P = view;
            try {
                k2.e eVar = this.f25130i0;
                int i15 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i11 > 0 && i13 > 0) {
                    bw0 bw0Var = (bw0) eVar.f14389b;
                    xv0 xv0Var = bw0Var.N;
                    if (xv0Var != null && xv0Var.b() != -1) {
                        i15 = bw0Var.r(bw0Var.F, i13);
                    }
                } else if (!z10 && i13 < 0) {
                    bw0 bw0Var2 = (bw0) eVar.f14389b;
                    i15 = bw0Var2.r(bw0Var2.E, i13);
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
        int[] iArr = this.f25137x;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f25132k0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f25132k0);
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
        if (this.f25117a) {
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
        h91 h91Var = this.H;
        if (h91Var != null && this.O != null && h91Var.getCurrentView() != null) {
            recyclerView = this.O.i(this.H.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.F) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.F;
            xb0 xb0Var = this.f25131j0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.F.f3087v0;
                if (arrayList != null) {
                    arrayList.remove(xb0Var);
                }
            }
            this.F = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(xb0Var);
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
        b2.q0 q0Var = this.f25136w;
        if (i11 == 1) {
            q0Var.f3455b = i10;
        } else {
            q0Var.f3454a = i10;
        }
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f25129h0 == z10) {
            return;
        }
        this.f25129h0 = z10;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f25117a = z10;
        if (z10) {
            this.d = 0L;
            this.f25124e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f25126f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(yv0 yv0Var) {
        this.M = yv0Var;
        requestLayout();
        B();
    }

    @Override
    public final void t(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.t(android.view.View, int, int, int[], int):void");
    }

    public final void u(zl0 zl0Var, xv0 xv0Var) {
        RecyclerView recyclerView = this.E;
        ai.f0 f0Var = this.v;
        xb0 xb0Var = this.f25131j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.f3087v0;
            if (arrayList != null) {
                arrayList.remove(xb0Var);
            }
            f0Var.removeView(this.E);
        }
        this.E = zl0Var;
        this.N = xv0Var;
        f0Var.addView(zl0Var, new FrameLayout.LayoutParams(-1, -1));
        zl0Var.j(xb0Var);
        zl0Var.setNestedScrollingEnabled(true);
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

    public final void x(View view, h91 h91Var, zv0 zv0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = h91Var;
        this.O = zv0Var;
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
