package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class mc0 extends pv0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.q0 f26139w0;
    public View f26140x0;
    public lc0 f26141y0;
    public org.telegram.ui.ActionBar.d3 f26142z0;

    public mc0(Context context) {
        super(context, null);
        this.f26139w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        lc0 lc0Var;
        int max;
        if (viewGroup == this.f26140x0 && (lc0Var = this.f26141y0) != null && ((org.telegram.ui.s7) lc0Var).getListView() != null) {
            int top = this.f26141y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    ll0 listView = ((org.telegram.ui.s7) this.f26141y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f42671a.getTop();
                        }
                        int paddingTop = listView.getPaddingTop();
                        if (i13 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i13 - paddingTop);
                            }
                            iArr[1] = max;
                            listView.scrollBy(0, i11);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this.f26142z0 != null && !this.f26140x0.canScrollVertically(i11)) {
                    this.f26142z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f26142z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        lc0 lc0Var = this.f26141y0;
        if (lc0Var != null && lc0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void a0(lc0 lc0Var, int i10) {
        this.B0 = i10;
        if (this.f26141y0 != lc0Var) {
            this.f26141y0 = lc0Var;
            if (this.C0 && lc0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) lc0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f26140x0;
        if (view != null && this.f26141y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f26140x0.getPaddingBottom()) - this.f26141y0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        lc0 lc0Var;
        if (viewGroup == this.f26140x0 && (lc0Var = this.f26141y0) != null && ((org.telegram.ui.s7) lc0Var).getListView() != null) {
            ll0 listView = ((org.telegram.ui.s7) this.f26141y0).getListView();
            if (this.f26141y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f26139w0.f3200a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f26142z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        lc0 lc0Var = this.f26141y0;
        if (lc0Var != null) {
            lc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        lc0 lc0Var = this.f26141y0;
        if (lc0Var != null) {
            lc0Var.removeOnLayoutChangeListener(this);
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

    public boolean p(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    public void s(View view, View view2, int i10, int i11) {
        this.f26139w0.f3200a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f26142z0 = d3Var;
    }

    public void setChildLayout(lc0 lc0Var) {
        a0(lc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f26140x0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
