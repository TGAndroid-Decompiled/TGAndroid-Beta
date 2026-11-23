package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class lb0 extends du0 implements r0.l, View.OnLayoutChangeListener {
    public final e2.r0 f37111g0;
    public View f37112h0;
    public kb0 f37113i0;
    public org.telegram.ui.ActionBar.t2 f37114j0;
    public int f37115k0;
    public boolean f37116l0;

    public lb0(Context context) {
        super(context, null);
        this.f37111g0 = new Object();
    }

    public final void X() {
        View view = this.f37112h0;
        if (view != null && this.f37113i0 != null) {
            this.f37115k0 = (view.getMeasuredHeight() - this.f37112h0.getPaddingBottom()) - this.f37113i0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i7, View view) {
        this.f37111g0.f10679a = 0;
        org.telegram.ui.ActionBar.t2 t2Var = this.f37114j0;
        if (t2Var != null) {
            t2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        kb0 kb0Var;
        if (view == this.f37112h0 && (kb0Var = this.f37113i0) != null && ((org.telegram.ui.s7) kb0Var).getListView() != null) {
            ek0 listView = ((org.telegram.ui.s7) this.f37113i0).getListView();
            if (this.f37113i0.getTop() == this.f37115k0) {
                iArr[1] = i12;
                listView.scrollBy(0, i12);
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (view != null && view.isAttachedToWindow() && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37116l0 = true;
        kb0 kb0Var = this.f37113i0;
        if (kb0Var != null) {
            kb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37116l0 = false;
        kb0 kb0Var = this.f37113i0;
        if (kb0Var != null) {
            kb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        X();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        X();
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f37111g0.f10679a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        kb0 kb0Var;
        int max;
        if (view == this.f37112h0 && (kb0Var = this.f37113i0) != null && ((org.telegram.ui.s7) kb0Var).getListView() != null) {
            int top = this.f37113i0.getTop();
            if (i10 < 0) {
                if (top <= this.f37115k0) {
                    ek0 listView = ((org.telegram.ui.s7) this.f37113i0).getListView();
                    int L0 = ((v4.b0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        v4.e1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f59111a.getTop();
                        }
                        int paddingTop = listView.getPaddingTop();
                        if (i12 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i12 - paddingTop);
                            }
                            iArr[1] = max;
                            listView.scrollBy(0, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this.f37114j0 != null && !this.f37112h0.canScrollVertically(i10)) {
                    this.f37114j0.onNestedScroll(view, 0, 0, i7, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.t2 t2Var = this.f37114j0;
            if (t2Var != null) {
                t2Var.onNestedPreScroll(view, i7, i10, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.t2 t2Var) {
        this.f37114j0 = t2Var;
    }

    public void setChildLayout(kb0 kb0Var) {
        if (this.f37113i0 != kb0Var) {
            this.f37113i0 = kb0Var;
            if (this.f37116l0 && kb0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) kb0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f37112h0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
