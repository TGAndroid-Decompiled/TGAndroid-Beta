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
public class aw0 extends lw0 implements r0.m {
    public static final int f24684o1 = 0;
    public long A0;
    public long B0;
    public long C0;
    public int D0;
    public int E0;
    public final RectF F0;
    public final ai.f0 G0;
    public final b2.q0 H0;
    public final int[] I0;
    public final am0 J0;
    public RecyclerView K0;
    public RecyclerView L0;
    public RecyclerView M0;
    public g91 N0;
    public View O0;
    public View P0;
    public View Q0;
    public View R0;
    public xv0 S0;
    public wv0 T0;
    public yv0 U0;
    public View V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public float f24685a1;
    public float f24686b1;
    public float f24687c1;
    public float f24688d1;
    public float f24689e1;
    public boolean f24690f1;
    public boolean f24691g1;
    public boolean f24692h1;
    public boolean f24693i1;
    public boolean f24694j1;
    public boolean f24695k1;
    public final k2.e l1;
    public final xb0 f24696m1;
    public final ut f24697n1;
    public boolean f24698w0;
    public int f24699x0;
    public int f24700y0;
    public long f24701z0;

    public aw0(Context context) {
        super(context, null);
        this.F0 = new RectF();
        this.H0 = new Object();
        this.I0 = new int[2];
        this.J0 = new Object();
        this.l1 = new k2.e(this, 12);
        this.f24696m1 = new xb0(this, 6);
        this.f24697n1 = new ut(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        ai.f0 f0Var = new ai.f0(this, context);
        this.G0 = f0Var;
        addView(f0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String g0(View view) {
        int h;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder j3 = t8.b.j(str, ",scrollState=");
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
        return t8.b.v(str, ")");
    }

    public static void o0(RecyclerView recyclerView, int i10, int i11) {
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

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.Y0;
            if (i10 == (-i11) && marginLayoutParams.bottomMargin == (-this.Z0)) {
                return;
            }
            marginLayoutParams.topMargin = -i11;
            marginLayoutParams.bottomMargin = -this.Z0;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z10) {
        String str;
        if (this.f24692h1 == z10) {
            return;
        }
        this.f24692h1 = z10;
        if (z10) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        e0(str, this.K0, 0, 0, true);
        this.S0.E(z10);
    }

    public final void Z() {
        wv0 wv0Var;
        e0("ALIGN_BOUNDARY", this.K0, 0, 0, true);
        if (this.K0 != null && (wv0Var = this.T0) != null && this.S0 != null) {
            int b10 = wv0Var.b();
            s4.o0 layoutManager = this.K0.getLayoutManager();
            if (b10 != -1 && (layoutManager instanceof s4.c0)) {
                v0();
                ((s4.c0) layoutManager).h1(b10, (Math.round(this.f24685a1) - this.K0.getTop()) - this.K0.getPaddingTop());
                this.f24694j1 = true;
                requestLayout();
            }
        }
    }

    public final void a0(RecyclerView recyclerView) {
        int i10;
        if (this.S0 != null && recyclerView != null) {
            v0();
            View view = this.P0;
            if (view == null) {
                i10 = 0;
            } else if (view.getHeight() > 0) {
                i10 = this.P0.getHeight();
            } else {
                i10 = this.P0.getLayoutParams().height;
            }
            setBleed(recyclerView);
            int i11 = this.Y0;
            o0(recyclerView, Math.max(0, i10) + Math.round(this.f24685a1) + i11, this.S0.e1() + this.Z0);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean b0() {
        g91 g91Var = this.N0;
        if (g91Var != null && g91Var.getCurrentView() != null && !Float.isInfinite(j0()) && this.f24689e1 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void c0(android.graphics.Canvas r6, android.graphics.RectF r7, org.telegram.ui.Components.zv0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.c0(android.graphics.Canvas, android.graphics.RectF, org.telegram.ui.Components.zv0):void");
    }

    public final void d0(String str, View view, int i10, int i11) {
        String str2;
        if (this.f24698w0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.A0 < 250) {
                return;
            }
            this.A0 = uptimeMillis;
            if (i11 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            e0(str.concat(str2), view, i10, i10, true);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f24698w0) {
                this.D0++;
                this.A0 = 0L;
                e0("TOUCH_DOWN", null, 0, 0, true);
            }
            t0();
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "TOUCH_UP";
            } else {
                str = "TOUCH_CANCEL";
            }
            e0(str, null, 0, 0, true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(String str, View view, int i10, int i11, boolean z10) {
        View view2;
        View view3;
        long j3;
        int b10;
        s4.o0 layoutManager;
        int top;
        int height;
        float f7;
        yv0 yv0Var;
        if (this.f24698w0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                if (uptimeMillis - this.f24701z0 < 250) {
                    return;
                }
                this.f24701z0 = uptimeMillis;
            }
            g91 g91Var = this.N0;
            int i12 = 0;
            View view4 = null;
            if (g91Var == null) {
                view2 = null;
            } else {
                view2 = g91Var.getViewPages()[0];
            }
            g91 g91Var2 = this.N0;
            if (g91Var2 == null) {
                view3 = null;
            } else {
                view3 = g91Var2.getViewPages()[1];
            }
            StringBuilder sb2 = new StringBuilder("root=");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" gesture=");
            sb2.append(this.D0);
            sb2.append(" transition=");
            sb2.append(this.E0);
            sb2.append(" event=");
            sb2.append(str);
            sb2.append(" target=");
            sb2.append(g0(view));
            sb2.append(" dy=");
            sb2.append(i10);
            sb2.append(" used=");
            sb2.append(i11);
            sb2.append(" transitioning=");
            sb2.append(this.f24691g1);
            sb2.append(" progress=");
            sb2.append(this.J0.f24574e);
            sb2.append(" ageMs=");
            long j10 = 0;
            if (this.f24691g1) {
                j3 = uptimeMillis - this.B0;
            } else {
                j3 = 0;
            }
            sb2.append(j3);
            sb2.append(" unchangedMs=");
            if (this.f24691g1) {
                j10 = uptimeMillis - this.C0;
            }
            sb2.append(j10);
            sb2.append(" depth=");
            sb2.append(this.W0);
            sb2.append(" updating=");
            sb2.append(this.f24690f1);
            sb2.append(" callback=");
            sb2.append(g0(this.V0));
            sb2.append(" common=");
            sb2.append(g0(this.K0));
            sb2.append(" active=");
            sb2.append(g0(this.L0));
            sb2.append(" current=");
            sb2.append(g0(view2));
            sb2.append(" other=");
            sb2.append(g0(view3));
            sb2.append(" source=");
            sb2.append(g0(this.Q0));
            sb2.append(" incoming=");
            sb2.append(g0(this.R0));
            sb2.append(" boundary=");
            sb2.append(j0());
            sb2.append(" pin=");
            sb2.append(this.f24685a1);
            sb2.append(" tail=");
            sb2.append(this.f24688d1);
            sb2.append(" alignPending=");
            sb2.append(this.f24694j1);
            wv0 wv0Var = this.T0;
            int i13 = -1;
            if (wv0Var == null) {
                b10 = -1;
            } else {
                b10 = wv0Var.b();
            }
            RecyclerView recyclerView = this.K0;
            if (recyclerView == null) {
                layoutManager = null;
            } else {
                layoutManager = recyclerView.getLayoutManager();
            }
            if (layoutManager != null && b10 != -1) {
                view4 = layoutManager.m(b10);
            }
            StringBuilder j11 = hg.k0.j(b10, " row=", " anchor=");
            j11.append(g0(view4));
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
                this.K0.getClass();
                i13 = RecyclerView.R(view4);
            }
            j11.append(i13);
            j11.append(" pageOffset=");
            RecyclerView recyclerView2 = this.L0;
            if (recyclerView2 != null && (yv0Var = this.U0) != null) {
                f7 = yv0Var.h(recyclerView2);
            } else {
                f7 = 0.0f;
            }
            j11.append(f7);
            j11.append(" tabsTop=");
            j11.append(this.f24689e1);
            j11.append(" draw=");
            j11.append(this.f24700y0);
            sb2.append(j11.toString());
            Log.d("SiblingScroll", sb2.toString());
        }
    }

    public final void f0(String str) {
        e0(str, this.N0, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.Z0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.H0.b();
    }

    public float getTabsTop() {
        return this.f24689e1;
    }

    public int getTopBleed() {
        return this.Y0;
    }

    public final void h0(String str) {
        aw0 aw0Var;
        if (this.f24698w0) {
            aw0Var = this;
            aw0Var.e0("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            aw0Var = this;
        }
        aw0Var.f24691g1 = false;
        aw0Var.R0 = null;
        aw0Var.Q0 = null;
        aw0Var.G0.invalidate();
    }

    public final boolean i0(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.i0(float, float):boolean");
    }

    public final float j0() {
        View m10;
        RecyclerView recyclerView = this.K0;
        if (recyclerView != null && this.T0 != null && recyclerView.getLayoutManager() != null) {
            s4.o0 layoutManager = this.K0.getLayoutManager();
            int b10 = this.T0.b();
            if (b10 != -1 && (m10 = layoutManager.m(b10)) != null) {
                return (s4.o0.z(m10) + this.K0.getTop()) - ((ViewGroup.MarginLayoutParams) ((s4.p0) m10.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.k0():void");
    }

    public final void l0() {
        RecyclerView recyclerView;
        g91 g91Var = this.N0;
        if (g91Var != null && this.U0 != null && g91Var.getCurrentView() != null) {
            recyclerView = this.U0.i(this.N0.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.L0) {
            e0("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.L0;
            xb0 xb0Var = this.f24696m1;
            if (recyclerView3 != null) {
                recyclerView3.C0();
                ArrayList arrayList = this.L0.f3087v0;
                if (arrayList != null) {
                    arrayList.remove(xb0Var);
                }
            }
            this.L0 = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(xb0Var);
            }
        }
    }

    @Override
    public final void m(int i10, View view) {
        String str;
        if (i10 == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        e0(str, view, 0, 0, true);
        b2.q0 q0Var = this.H0;
        if (i10 == 1) {
            q0Var.f3455b = 0;
        } else {
            q0Var.f3454a = 0;
        }
    }

    public final int m0(RecyclerView recyclerView, int i10) {
        int min;
        String str;
        if (recyclerView != null && i10 != 0) {
            if (recyclerView != this.V0) {
                RecyclerView recyclerView2 = this.M0;
                int i11 = this.X0;
                this.M0 = recyclerView;
                this.X0 = 0;
                this.W0++;
                try {
                    recyclerView.scrollBy(0, i10);
                    int i12 = this.X0;
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
                    e0(str, recyclerView, i10, i13, false);
                    return i13;
                } finally {
                    this.W0--;
                    this.M0 = recyclerView2;
                    this.X0 = i11;
                }
            }
            e0("TRANSFER_REENTRY", recyclerView, i10, 0, true);
            throw new IllegalStateException("Reentrant scrollBy on nested source");
        }
        if (i10 != 0) {
            e0("TRANSFER_NO_TARGET", recyclerView, i10, 0, false);
        }
        return 0;
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        RecyclerView recyclerView;
        boolean z10;
        if (this.W0 == 0 && (view == (recyclerView = this.K0) || view == this.L0)) {
            if (this.f24691g1) {
                d0("POST_BLOCKED", view, i13, i14);
                iArr[1] = iArr[1] + i13;
                return;
            }
            this.V0 = view;
            try {
                k2.e eVar = this.l1;
                int i15 = 0;
                if (view == recyclerView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i11 > 0 && i13 > 0) {
                    aw0 aw0Var = (aw0) eVar.f14388b;
                    wv0 wv0Var = aw0Var.T0;
                    if (wv0Var != null && wv0Var.b() != -1) {
                        i15 = aw0Var.m0(aw0Var.L0, i13);
                    }
                } else if (!z10 && i13 < 0) {
                    aw0 aw0Var2 = (aw0) eVar.f14388b;
                    i15 = aw0Var2.m0(aw0Var2.K0, i13);
                }
                iArr[1] = iArr[1] + i15;
                e0("POST", view, i13, i15, false);
                return;
            } finally {
                this.V0 = null;
                u0();
            }
        }
        e0("POST_IGNORED", view, i13, 0, false);
    }

    public final void n0(zl0 zl0Var, wv0 wv0Var) {
        RecyclerView recyclerView = this.K0;
        ai.f0 f0Var = this.G0;
        xb0 xb0Var = this.f24696m1;
        if (recyclerView != null) {
            recyclerView.C0();
            ArrayList arrayList = this.K0.f3087v0;
            if (arrayList != null) {
                arrayList.remove(xb0Var);
            }
            f0Var.removeView(this.K0);
        }
        this.K0 = zl0Var;
        this.T0 = wv0Var;
        f0Var.addView(zl0Var, new FrameLayout.LayoutParams(-1, -1));
        zl0Var.j(xb0Var);
        zl0Var.setNestedScrollingEnabled(true);
        u0();
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.I0;
        iArr[1] = 0;
        iArr[0] = 0;
        n(view, i10, i11, i12, i13, i14, iArr);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f24697n1);
    }

    @Override
    public void onDetachedFromWindow() {
        t0();
        getViewTreeObserver().removeOnPreDrawListener(this.f24697n1);
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
        if (this.W0 == 0 && z10 && (view2 == this.K0 || view2 == this.L0)) {
            z11 = true;
        }
        if (this.f24698w0) {
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
            e0(sb2.toString(), view2, 0, 0, true);
        }
        return z11;
    }

    public final void p0(View view, float f7) {
        if (view == null) {
            return;
        }
        RecyclerView i10 = this.U0.i(view);
        float f10 = this.f24685a1;
        i10.setTranslationY((f7 + f10) - Math.round(f10));
    }

    public final void q0(View view, g91 g91Var, yv0 yv0Var) {
        View view2 = this.O0;
        if (view2 != null) {
            removeView(view2);
        }
        this.O0 = view;
        this.N0 = g91Var;
        this.U0 = yv0Var;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        u0();
    }

    public final void r0(View view) {
        View view2 = this.P0;
        if (view2 != null) {
            removeView(view2);
        }
        this.P0 = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        u0();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        b2.q0 q0Var = this.H0;
        if (i11 == 1) {
            q0Var.f3455b = i10;
        } else {
            q0Var.f3454a = i10;
        }
    }

    public final void s0(int i10, int i11) {
        this.Y0 = Math.max(0, i10);
        this.Z0 = Math.max(0, i11);
        requestLayout();
        u0();
    }

    public void setCommonInsetsManagedExternally(boolean z10) {
        if (this.f24695k1 == z10) {
            return;
        }
        this.f24695k1 = z10;
        u0();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z10) {
        this.f24698w0 = z10;
        if (z10) {
            this.f24701z0 = 0L;
            this.A0 = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.B0 = uptimeMillis;
            this.C0 = uptimeMillis;
            e0("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(xv0 xv0Var) {
        this.S0 = xv0Var;
        requestLayout();
        u0();
    }

    @Override
    public final void t(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.t(android.view.View, int, int, int[], int):void");
    }

    public final void t0() {
        View[] viewPages;
        e0("STOP_SCROLLING", null, 0, 0, true);
        RecyclerView recyclerView = this.K0;
        if (recyclerView != null) {
            recyclerView.C0();
        }
        g91 g91Var = this.N0;
        if (g91Var != null && this.U0 != null) {
            for (View view : g91Var.getViewPages()) {
                if (view != null) {
                    this.U0.i(view).C0();
                }
            }
        }
    }

    public final void u0() {
        View[] viewPages;
        float h;
        View view;
        am0 am0Var = this.J0;
        if (!this.f24690f1 && this.S0 != null) {
            boolean z10 = true;
            this.f24690f1 = true;
            try {
                float f7 = this.f24688d1;
                v0();
                RecyclerView recyclerView = this.K0;
                if (recyclerView != null && !this.f24695k1) {
                    setBleed(recyclerView);
                    RecyclerView recyclerView2 = this.K0;
                    int i10 = this.Y0;
                    this.S0.getClass();
                    o0(recyclerView2, i10, this.Z0);
                }
                g91 g91Var = this.N0;
                if (g91Var != null && this.U0 != null && this.P0 != null) {
                    for (View view2 : g91Var.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.N0) {
                            a0(this.U0.i(view2));
                        }
                    }
                    l0();
                    float j02 = j0();
                    boolean isInfinite = Float.isInfinite(j02);
                    ai.f0 f0Var = this.G0;
                    float f10 = 0.0f;
                    if (isInfinite) {
                        this.f24688d1 = Float.POSITIVE_INFINITY;
                        this.O0.setVisibility(4);
                        this.P0.setVisibility(4);
                        RecyclerView recyclerView3 = this.K0;
                        if (recyclerView3 != null) {
                            recyclerView3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f7 != this.f24688d1) {
                            f0Var.invalidate();
                        }
                        this.f24690f1 = false;
                        return;
                    }
                    float f11 = this.f24685a1;
                    if (j02 > f11 + 0.5f) {
                        f11 = j02;
                    }
                    this.f24687c1 = f11;
                    this.O0.setVisibility(0);
                    this.P0.setVisibility(0);
                    if (this.f24691g1) {
                        this.f24688d1 = am0Var.b();
                        this.f24689e1 = Math.max(am0Var.d, am0Var.b());
                        View view3 = this.Q0;
                        float max = Math.max(0.0f, am0Var.f24571a - am0Var.d);
                        if (!am0Var.f24575f) {
                            f10 = am0Var.b() - am0Var.f24572b;
                        }
                        p0(view3, max + f10);
                        p0(this.R0, Math.max(am0Var.d, am0Var.b()) - am0Var.d);
                    } else {
                        RecyclerView recyclerView4 = this.L0;
                        if (recyclerView4 == null) {
                            h = 0.0f;
                        } else {
                            h = this.U0.h(recyclerView4);
                        }
                        float max2 = this.f24687c1 - Math.max(0.0f, Math.min(h, Math.max(0.0f, this.f24685a1 - this.f24686b1)));
                        this.f24688d1 = max2;
                        this.f24689e1 = Math.max(this.f24685a1, max2);
                        p0(this.N0.getCurrentView(), Math.max(0.0f, this.f24687c1 - this.f24685a1));
                    }
                    this.K0.setTranslationY(this.f24688d1 - j02);
                    this.P0.setTranslationY(this.f24689e1 - view.getTop());
                    if (this.f24689e1 > this.f24685a1 + 0.5f) {
                        z10 = false;
                    }
                    setTabsPinned(z10);
                    this.S0.getClass();
                    if (f7 != this.f24688d1) {
                        f0Var.invalidate();
                    }
                    this.f24690f1 = false;
                }
            } finally {
                this.f24690f1 = false;
            }
        }
    }

    public final void v0() {
        boolean z10;
        xv0 xv0Var = this.S0;
        if (xv0Var == null) {
            return;
        }
        float Y0 = xv0Var.Y0();
        this.S0.getClass();
        if (!Float.isNaN(Y0) && !Float.isInfinite(Y0) && !Float.isNaN(0.0f) && !Float.isInfinite(0.0f) && Y0 >= 0.0f) {
            if (this.f24693i1 && (Y0 != this.f24685a1 || 0.0f != this.f24686b1)) {
                float j02 = j0();
                if (!Float.isInfinite(j02)) {
                    float f7 = this.f24685a1;
                    if (j02 > 0.5f + f7 && j02 >= Y0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && Y0 != f7) {
                        this.f24694j1 = true;
                    }
                    if (this.f24691g1) {
                        am0 am0Var = this.J0;
                        float f10 = am0Var.f24574e;
                        if (z10) {
                            j02 = Y0;
                        }
                        yv0 yv0Var = this.U0;
                        am0Var.a(j02, yv0Var.h(yv0Var.i(this.Q0)), Y0, 0.0f);
                        am0Var.f24574e = Math.max(0.0f, Math.min(1.0f, f10));
                        this.G0.invalidate();
                    }
                }
            }
            this.f24685a1 = Y0;
            this.f24686b1 = 0.0f;
            this.f24693i1 = true;
            return;
        }
        throw new IllegalArgumentException("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }
}
