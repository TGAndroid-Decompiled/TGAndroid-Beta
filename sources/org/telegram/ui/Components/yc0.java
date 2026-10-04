package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class yc0 extends lw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 f33138w0;
    public View f33139x0;
    public xc0 f33140y0;
    public org.telegram.ui.ActionBar.d3 f33141z0;

    public yc0(Context context) {
        super(context, null);
        this.f33138w0 = new Object();
    }

    public final void Z() {
        View view = this.f33139x0;
        if (view != null && this.f33140y0 != null) {
            this.A0 = (view.getMeasuredHeight() - this.f33139x0.getPaddingBottom()) - this.f33140y0.getMeasuredHeight();
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void m(int i10, View view) {
        this.f33138w0.f3454a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f33141z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        xc0 xc0Var;
        if (view == this.f33139x0 && (xc0Var = this.f33140y0) != null && ((org.telegram.ui.v7) xc0Var).getListView() != null) {
            zl0 listView = ((org.telegram.ui.v7) this.f33140y0).getListView();
            if (this.f33140y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        xc0 xc0Var = this.f33140y0;
        if (xc0Var != null) {
            xc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        xc0 xc0Var = this.f33140y0;
        if (xc0Var != null) {
            xc0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Z();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Z();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f33138w0.f3454a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f33141z0 = d3Var;
    }

    public void setChildLayout(xc0 xc0Var) {
        if (this.f33140y0 != xc0Var) {
            this.f33140y0 = xc0Var;
            if (this.B0 && xc0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) xc0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.f33139x0 = view;
        Z();
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        xc0 xc0Var;
        int max;
        if (view == this.f33139x0 && (xc0Var = this.f33140y0) != null && ((org.telegram.ui.v7) xc0Var).getListView() != null) {
            int top = this.f33140y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    zl0 listView = ((org.telegram.ui.v7) this.f33140y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f46531a.getTop();
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
                } else if (this.f33141z0 != null && !this.f33139x0.canScrollVertically(i11)) {
                    this.f33141z0.onNestedScroll(view, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f33141z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
