package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class vc0 extends bw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 f28979w0;
    public View f28980x0;
    public uc0 f28981y0;
    public org.telegram.ui.ActionBar.d3 f28982z0;

    public vc0(Context context) {
        super(context, null);
        this.f28979w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        uc0 uc0Var;
        int max;
        if (viewGroup == this.f28980x0 && (uc0Var = this.f28981y0) != null && ((org.telegram.ui.t7) uc0Var).getListView() != null) {
            int top = this.f28981y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    wl0 listView = ((org.telegram.ui.t7) this.f28981y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 L = listView.L(L0);
                        if (L != null) {
                            i13 = L.f42929a.getTop();
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
                } else if (this.f28982z0 != null && !this.f28980x0.canScrollVertically(i11)) {
                    this.f28982z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f28982z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final void Z() {
        View view = this.f28980x0;
        if (view != null && this.f28981y0 != null) {
            this.A0 = (view.getMeasuredHeight() - this.f28980x0.getPaddingBottom()) - this.f28981y0.getMeasuredHeight();
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        uc0 uc0Var;
        if (viewGroup == this.f28980x0 && (uc0Var = this.f28981y0) != null && ((org.telegram.ui.t7) uc0Var).getListView() != null) {
            wl0 listView = ((org.telegram.ui.t7) this.f28981y0).getListView();
            if (this.f28981y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f28979w0.f3203a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f28982z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        uc0 uc0Var = this.f28981y0;
        if (uc0Var != null) {
            uc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        uc0 uc0Var = this.f28981y0;
        if (uc0Var != null) {
            uc0Var.removeOnLayoutChangeListener(this);
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

    public boolean p(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    public void s(View view, View view2, int i10, int i11) {
        this.f28979w0.f3203a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f28982z0 = d3Var;
    }

    public void setChildLayout(uc0 uc0Var) {
        if (this.f28981y0 != uc0Var) {
            this.f28981y0 = uc0Var;
            if (this.B0 && uc0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) uc0Var;
                if (t7Var.getListView() != null) {
                    t7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.f28980x0 = view;
        Z();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
