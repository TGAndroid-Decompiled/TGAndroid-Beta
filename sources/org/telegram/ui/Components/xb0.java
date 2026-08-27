package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract class xb0 extends zu0 implements r0.n, View.OnLayoutChangeListener {

    public final d5.p f34579s0;

    public View f34580t0;

    public wb0 f34581u0;

    public org.telegram.ui.ActionBar.c3 f34582v0;

    public int f34583w0;

    public int f34584x0;

    public boolean f34585y0;

    public xb0(Context context) {
        super(context, null);
        this.f34579s0 = new d5.p();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        wb0 wb0Var;
        if (viewGroup != this.f34580t0 || (wb0Var = this.f34581u0) == null || ((org.telegram.ui.s7) wb0Var).getListView() == null) {
            return;
        }
        int top = this.f34581u0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.c3 c3Var = this.f34582v0;
            if (c3Var != null) {
                c3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.f34583w0) {
            if (this.f34582v0 == null || this.f34580t0.canScrollVertically(i11)) {
                return;
            }
            this.f34582v0.onNestedScroll(viewGroup, 0, 0, i10, i11);
            return;
        }
        zk0 listView = ((org.telegram.ui.s7) this.f34581u0).getListView();
        int iL0 = ((f2.k0) listView.getLayoutManager()).L0();
        if (iL0 != -1) {
            f2.o1 o1VarK = listView.K(iL0);
            int top2 = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && iL0 == 0) {
                return;
            }
            iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
            listView.scrollBy(0, i11);
        }
    }

    public final boolean Z() {
        wb0 wb0Var = this.f34581u0;
        return wb0Var != null && wb0Var.getTop() == this.f34583w0;
    }

    public final void a0(wb0 wb0Var, int i10) {
        this.f34584x0 = i10;
        if (this.f34581u0 != wb0Var) {
            this.f34581u0 = wb0Var;
            if (this.f34585y0 && wb0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) wb0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f34580t0;
        if (view == null || this.f34581u0 == null) {
            return;
        }
        if (this.f34584x0 != 0) {
            this.f34583w0 = view.getPaddingTop() + this.f34584x0;
        } else {
            this.f34583w0 = (view.getMeasuredHeight() - this.f34580t0.getPaddingBottom()) - this.f34581u0.getMeasuredHeight();
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        wb0 wb0Var;
        if (viewGroup != this.f34580t0 || (wb0Var = this.f34581u0) == null || ((org.telegram.ui.s7) wb0Var).getListView() == null) {
            return;
        }
        zk0 listView = ((org.telegram.ui.s7) this.f34581u0).getListView();
        if (this.f34581u0.getTop() == this.f34583w0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34585y0 = true;
        wb0 wb0Var = this.f34581u0;
        if (wb0Var != null) {
            wb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34585y0 = false;
        wb0 wb0Var = this.f34581u0;
        if (wb0Var != null) {
            wb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        b0();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b0();
    }

    public void p(int i10, View view) {
        this.f34579s0.f4821a = 0;
        org.telegram.ui.ActionBar.c3 c3Var = this.f34582v0;
        if (c3Var != null) {
            c3Var.onStopNestedScroll(view);
        }
    }

    public boolean q(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.c3 c3Var) {
        this.f34582v0 = c3Var;
    }

    public void setChildLayout(wb0 wb0Var) {
        a0(wb0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f34580t0 = view;
        b0();
    }

    public void t(View view, View view2, int i10, int i11) {
        this.f34579s0.f4821a = i10;
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
