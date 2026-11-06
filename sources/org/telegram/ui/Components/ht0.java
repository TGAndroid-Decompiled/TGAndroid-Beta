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
public class ht0 extends FrameLayout implements r0.l {
    public static final int f34413l0 = 0;
    public final qj0 D;
    public RecyclerView E;
    public RecyclerView F;
    public RecyclerView G;
    public p61 H;
    public View I;
    public View J;
    public View K;
    public View L;
    public et0 M;
    public dt0 N;
    public ft0 O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public boolean f34414a;
    public float f34415a0;
    public int f34416b;
    public float f34417b0;
    public int f34418c;
    public boolean f34419c0;
    public long d;
    public boolean f34420d0;
    public long f34421e;
    public boolean f34422e0;
    public long f34423f;
    public boolean f34424f0;
    public boolean f34425g0;
    public long h;
    public boolean f34426h0;
    public final uy f34427i0;
    public final ui f34428j0;
    public final rk f34429k0;
    public int f34430n;
    public int f34431r;
    public final RectF f34432s;
    public final bi.e5 f34433w;
    public final e2.r0 f34434x;
    public final int[] f34435y;

    public ht0(Context context) {
        super(context);
        this.f34432s = new RectF();
        this.f34434x = new Object();
        this.f34435y = new int[2];
        this.D = new Object();
        this.f34427i0 = new uy(this, 5);
        this.f34428j0 = new ui(this, 16);
        this.f34429k0 = new rk(3, this);
        setClipChildren(false);
        setClipToPadding(false);
        bi.e5 e5Var = new bi.e5(this, context);
        this.f34433w = e5Var;
        addView(e5Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b10;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder j3 = rf.b.j(str, ",scrollState=");
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
                b10 = 0;
            } else {
                b10 = recyclerView.getAdapter().b();
            }
            j3.append(b10);
            str = j3.toString();
        }
        return rf.b.q(str, ")");
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i7 = marginLayoutParams.topMargin;
            int i10 = this.S;
            if (i7 == (-i10) && marginLayoutParams.bottomMargin == (-this.T)) {
                return;
            }
            marginLayoutParams.topMargin = -i10;
            marginLayoutParams.bottomMargin = -this.T;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z9) {
        String str;
        if (this.f34422e0 == z9) {
            return;
        }
        this.f34422e0 = z9;
        if (z9) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.E, 0, 0, true);
        this.M.F(z9);
    }

    public static void v(RecyclerView recyclerView, int i7, int i10) {
        View view;
        int b10;
        if (recyclerView.getPaddingTop() != i7 || recyclerView.getPaddingBottom() != i10) {
            v4.n0 layoutManager = recyclerView.getLayoutManager();
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
                b10 = ((v4.o0) view.getLayoutParams()).b();
            }
            if (view != null) {
                layoutManager.getClass();
                i11 = (v4.n0.z(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).topMargin;
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
        RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        p61 p61Var = this.H;
        if (p61Var != null && this.O != null) {
            for (View view : p61Var.getViewPages()) {
                if (view != null) {
                    this.O.l(view).C0();
                }
            }
        }
    }

    public final void B() {
        View[] viewPages;
        float h;
        View view;
        qj0 qj0Var = this.D;
        if (!this.f34419c0 && this.M != null) {
            boolean z9 = true;
            this.f34419c0 = true;
            try {
                float f10 = this.f34415a0;
                C();
                RecyclerView recyclerView = this.E;
                if (recyclerView != null && !this.f34426h0) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.E;
                    int i7 = this.S;
                    this.M.getClass();
                    v(recyclerView2, i7, this.T);
                }
                p61 p61Var = this.H;
                if (p61Var != null && this.O != null && this.J != null) {
                    for (View view2 : p61Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.H) {
                            b(this.O.l(view2));
                        }
                    }
                    q();
                    float n10 = n();
                    boolean isInfinite = Float.isInfinite(n10);
                    bi.e5 e5Var = this.f34433w;
                    float f11 = 0.0f;
                    if (isInfinite) {
                        this.f34415a0 = Float.POSITIVE_INFINITY;
                        this.I.setVisibility(4);
                        this.J.setVisibility(4);
                        RecyclerView recyclerView3 = this.E;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f10 != this.f34415a0) {
                            e5Var.invalidate();
                        }
                        this.f34419c0 = false;
                        return;
                    }
                    float f12 = this.U;
                    if (n10 > f12 + 0.5f) {
                        f12 = n10;
                    }
                    this.W = f12;
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    if (this.f34420d0) {
                        this.f34415a0 = qj0Var.b();
                        this.f34417b0 = Math.max(qj0Var.d, qj0Var.b());
                        View view3 = this.K;
                        float max = Math.max(0.0f, qj0Var.f37430a - qj0Var.d);
                        if (!qj0Var.f37434f) {
                            f11 = qj0Var.b() - qj0Var.f37431b;
                        }
                        w(view3, max + f11);
                        w(this.L, Math.max(qj0Var.d, qj0Var.b()) - qj0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.F;
                        if (recyclerView4 == null) {
                            h = 0.0f;
                        } else {
                            h = this.O.h(recyclerView4);
                        }
                        float max2 = this.W - Math.max(0.0f, Math.min(h, Math.max(0.0f, this.U - this.V)));
                        this.f34415a0 = max2;
                        this.f34417b0 = Math.max(this.U, max2);
                        w(this.H.getCurrentView(), Math.max(0.0f, this.W - this.U));
                    }
                    this.E.setTranslationY(this.f34415a0 - n10);
                    this.J.setTranslationY(this.f34417b0 - view.getTop());
                    if (this.f34417b0 > this.U + 0.5f) {
                        z9 = false;
                    }
                    setTabsPinned(z9);
                    this.M.getClass();
                    if (f10 != this.f34415a0) {
                        e5Var.invalidate();
                    }
                    this.f34419c0 = false;
                }
            } finally {
                this.f34419c0 = false;
            }
        }
    }

    public final void C() {
        boolean z9;
        et0 et0Var = this.M;
        if (et0Var == null) {
            return;
        }
        float Y0 = et0Var.Y0();
        this.M.getClass();
        if (!Float.isNaN(Y0) && !Float.isInfinite(Y0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && Y0 >= 0.0f) {
            if (this.f34424f0 && (Y0 != this.U || 0.0f != this.V)) {
                float n10 = n();
                if (!Float.isInfinite(n10)) {
                    float f10 = this.U;
                    if (n10 > 0.5f + f10 && n10 >= Y0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9 && Y0 != f10) {
                        this.f34425g0 = true;
                    }
                    if (this.f34420d0) {
                        qj0 qj0Var = this.D;
                        float f11 = qj0Var.f37433e;
                        if (z9) {
                            n10 = Y0;
                        }
                        ft0 ft0Var = this.O;
                        qj0Var.a(n10, ft0Var.h(ft0Var.l(this.K)), Y0, 0.0f);
                        qj0Var.f37433e = Math.max(0.0f, Math.min(1.0f, f11));
                        this.f34433w.invalidate();
                    }
                }
            }
            this.U = Y0;
            this.V = 0.0f;
            this.f34424f0 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        dt0 dt0Var;
        f("ALIGN_BOUNDARY", this.E, 0, 0, true);
        if (this.E != null && (dt0Var = this.N) != null && this.M != null) {
            int b10 = dt0Var.b();
            v4.n0 layoutManager = this.E.getLayoutManager();
            if (b10 != -1 && (layoutManager instanceof v4.b0)) {
                C();
                ((v4.b0) layoutManager).h1(b10, (Math.round(this.U) - this.E.getTop()) - this.E.getPaddingTop());
                this.f34425g0 = true;
                requestLayout();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        int i7;
        if (this.M != null && recyclerView != null) {
            C();
            View view = this.J;
            if (view == null) {
                i7 = 0;
            } else if (view.getHeight() > 0) {
                i7 = this.J.getHeight();
            } else {
                i7 = this.J.getLayoutParams().height;
            }
            setBleed(recyclerView);
            v(recyclerView, Math.max(0, i7) + Math.round(this.U) + this.S, this.M.e1() + this.T);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        p61 p61Var = this.H;
        if (p61Var != null && p61Var.getCurrentView() != null && !Float.isInfinite(n()) && this.f34417b0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.gt0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht0.d(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.gt0):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f34414a) {
                this.f34430n++;
                this.f34421e = 0L;
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
        if (this.f34414a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f34421e < 250) {
                return;
            }
            this.f34421e = uptimeMillis;
            if (i10 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            f(str.concat(str2), view, i7, i7, true);
        }
    }

    public final void f(String str, View view, int i7, int i10, boolean z9) {
        View view2;
        View view3;
        long j3;
        int b10;
        v4.n0 layoutManager;
        int top;
        int height;
        float f10;
        ft0 ft0Var;
        if (this.f34414a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z9) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            p61 p61Var = this.H;
            int i11 = 0;
            View view4 = null;
            if (p61Var == null) {
                view2 = null;
            } else {
                view2 = p61Var.getViewPages()[0];
            }
            p61 p61Var2 = this.H;
            if (p61Var2 == null) {
                view3 = null;
            } else {
                view3 = p61Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.f34430n);
            sb2.append(" transition=");
            sb2.append(this.f34431r);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(h(view));
            sb2.append(" dy=");
            sb2.append(i7);
            sb2.append(" used=");
            sb2.append(i10);
            sb2.append(" transitioning=");
            sb2.append(this.f34420d0);
            sb2.append(" progress=");
            sb2.append(this.D.f37433e);
            sb2.append(" ageMs=");
            long j10 = 0;
            if (this.f34420d0) {
                j3 = uptimeMillis - this.f34423f;
            } else {
                j3 = 0;
            }
            sb2.append(j3);
            sb2.append(" unchangedMs=");
            if (this.f34420d0) {
                j10 = uptimeMillis - this.h;
            }
            sb2.append(j10);
            sb2.append(" depth=");
            sb2.append(this.Q);
            sb2.append(" updating=");
            sb2.append(this.f34419c0);
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
            sb2.append(n());
            sb2.append(" pin=");
            sb2.append(this.U);
            sb2.append(" tail=");
            sb2.append(this.f34415a0);
            sb2.append(" alignPending=");
            sb2.append(this.f34425g0);
            dt0 dt0Var = this.N;
            int i12 = -1;
            if (dt0Var == null) {
                b10 = -1;
            } else {
                b10 = dt0Var.b();
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
            StringBuilder n10 = jg.g.n(b10, " row=", " anchor=");
            n10.append(h(view4));
            n10.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            n10.append(top);
            n10.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            n10.append(height);
            n10.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i11 = v4.n0.z(view4);
            }
            n10.append(i11);
            n10.append(" adapterPosition=");
            if (view4 != null) {
                this.E.getClass();
                i12 = RecyclerView.R(view4);
            }
            n10.append(i12);
            n10.append(" pageOffset=");
            RecyclerView recyclerView2 = this.F;
            if (recyclerView2 != null && (ft0Var = this.O) != null) {
                f10 = ft0Var.h(recyclerView2);
            } else {
                f10 = 0.0f;
            }
            n10.append(f10);
            n10.append(" tabsTop=");
            n10.append(this.f34417b0);
            n10.append(" draw=");
            n10.append(this.f34418c);
            sb2.append(n10.toString());
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
        return this.f34434x.b();
    }

    public float getTabsTop() {
        return this.f34417b0;
    }

    public int getTopBleed() {
        return this.S;
    }

    public final void i(String str) {
        ht0 ht0Var;
        if (this.f34414a) {
            ht0Var = this;
            ht0Var.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            ht0Var = this;
        }
        ht0Var.f34420d0 = false;
        ht0Var.L = null;
        ht0Var.K = null;
        ht0Var.f34433w.invalidate();
    }

    public final boolean j(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht0.j(float, float):boolean");
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
        e2.r0 r0Var = this.f34434x;
        if (i7 == 1) {
            r0Var.f10534b = 0;
        } else {
            r0Var.f10533a = 0;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        RecyclerView recyclerView;
        boolean z9;
        if (this.Q == 0 && (view == (recyclerView = this.E) || view == this.F)) {
            if (this.f34420d0) {
                e("POST_BLOCKED", view, i12, i13);
                iArr[1] = iArr[1] + i12;
                return;
            }
            this.P = view;
            try {
                uy uyVar = this.f34427i0;
                int i14 = 0;
                if (view == recyclerView) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && i10 > 0 && i12 > 0) {
                    ht0 ht0Var = (ht0) uyVar.f38766b;
                    dt0 dt0Var = ht0Var.N;
                    if (dt0Var != null && dt0Var.b() != -1) {
                        i14 = ht0Var.t(ht0Var.F, i12);
                    }
                } else if (!z9 && i12 < 0) {
                    ht0 ht0Var2 = (ht0) uyVar.f38766b;
                    i14 = ht0Var2.t(ht0Var2.E, i12);
                }
                iArr[1] = iArr[1] + i14;
                f("POST", view, i12, i14, false);
                return;
            } finally {
                this.P = null;
                B();
            }
        }
        f("POST_IGNORED", view, i12, 0, false);
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        int[] iArr = this.f34435y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i7, i10, i11, i12, i13, iArr);
    }

    public final float n() {
        View m10;
        RecyclerView recyclerView = this.E;
        if (recyclerView != null && this.N != null && recyclerView.getLayoutManager() != null) {
            v4.n0 layoutManager = this.E.getLayoutManager();
            int b10 = this.N.b();
            if (b10 != -1 && (m10 = layoutManager.m(b10)) != null) {
                return (v4.n0.z(m10) + this.E.getTop()) - ((ViewGroup.MarginLayoutParams) ((v4.o0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        boolean z9;
        String str;
        boolean z10 = false;
        if ((i7 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.Q == 0 && z9 && (view2 == this.E || view2 == this.F)) {
            z10 = true;
        }
        if (this.f34414a) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
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
        return z10;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f34429k0);
    }

    @Override
    public void onDetachedFromWindow() {
        A();
        getViewTreeObserver().removeOnPreDrawListener(this.f34429k0);
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht0.p():void");
    }

    public final void q() {
        RecyclerView recyclerView;
        p61 p61Var = this.H;
        if (p61Var != null && this.O != null && p61Var.getCurrentView() != null) {
            recyclerView = this.O.l(this.H.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.F) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.F;
            ui uiVar = this.f34428j0;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.F.f2870w0;
                if (arrayList != null) {
                    arrayList.remove(uiVar);
                }
            }
            this.F = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(uiVar);
            }
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        e2.r0 r0Var = this.f34434x;
        if (i10 == 1) {
            r0Var.f10534b = i7;
        } else {
            r0Var.f10533a = i7;
        }
    }

    @Override
    public final void s(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht0.s(android.view.View, int, int, int[], int):void");
    }

    public void setCommonInsetsManagedExternally(boolean z9) {
        if (this.f34426h0 == z9) {
            return;
        }
        this.f34426h0 = z9;
        B();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z9) {
        this.f34414a = z9;
        if (z9) {
            this.d = 0L;
            this.f34421e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f34423f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(et0 et0Var) {
        this.M = et0Var;
        requestLayout();
        B();
    }

    public final int t(RecyclerView recyclerView, int i7) {
        int min;
        String str;
        if (recyclerView != null && i7 != 0) {
            if (recyclerView != this.P) {
                RecyclerView recyclerView2 = this.G;
                int i10 = this.R;
                this.G = recyclerView;
                this.R = 0;
                this.Q++;
                try {
                    recyclerView.scrollBy(0, i7);
                    int i11 = this.R;
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
                    this.Q--;
                    this.G = recyclerView2;
                    this.R = i10;
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

    public final void u(pj0 pj0Var, dt0 dt0Var) {
        RecyclerView recyclerView = this.E;
        bi.e5 e5Var = this.f34433w;
        ui uiVar = this.f34428j0;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.E.f2870w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
            e5Var.removeView(this.E);
        }
        this.E = pj0Var;
        this.N = dt0Var;
        e5Var.addView(pj0Var, new FrameLayout.LayoutParams(-1, -1));
        pj0Var.j(uiVar);
        pj0Var.setNestedScrollingEnabled(true);
        B();
    }

    public final void w(View view, float f10) {
        if (view == null) {
            return;
        }
        RecyclerView l10 = this.O.l(view);
        float f11 = this.U;
        l10.setTranslationY((f10 + f11) - Math.round(f11));
    }

    public final void x(View view, p61 p61Var, ft0 ft0Var) {
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        this.H = p61Var;
        this.O = ft0Var;
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

    public final void z(int i7, int i10) {
        this.S = Math.max(0, i7);
        this.T = Math.max(0, i10);
        requestLayout();
        B();
    }
}
