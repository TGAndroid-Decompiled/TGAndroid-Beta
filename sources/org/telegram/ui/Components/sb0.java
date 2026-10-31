package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class sb0 extends uu0 implements r0.l, View.OnLayoutChangeListener {
    public final ac.g f30211f0;
    public View f30212g0;
    public rb0 f30213h0;
    public org.telegram.ui.ActionBar.w2 f30214i0;
    public int f30215j0;
    public boolean f30216k0;

    public sb0(Context context) {
        super(context, null);
        this.f30211f0 = new Object();
    }

    public final void X() {
        View view = this.f30212g0;
        if (view != null && this.f30213h0 != null) {
            this.f30215j0 = (view.getMeasuredHeight() - this.f30212g0.getPaddingBottom()) - this.f30213h0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i10, View view) {
        this.f30211f0.f385a = 0;
        org.telegram.ui.ActionBar.w2 w2Var = this.f30214i0;
        if (w2Var != null) {
            w2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        rb0 rb0Var;
        if (view == this.f30212g0 && (rb0Var = this.f30213h0) != null && ((org.telegram.ui.t7) rb0Var).getListView() != null) {
            tk0 listView = ((org.telegram.ui.t7) this.f30213h0).getListView();
            if (this.f30213h0.getTop() == this.f30215j0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    @Override
    public final boolean n(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30216k0 = true;
        rb0 rb0Var = this.f30213h0;
        if (rb0Var != null) {
            rb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30216k0 = false;
        rb0 rb0Var = this.f30213h0;
        if (rb0Var != null) {
            rb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        X();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        X();
    }

    @Override
    public final void q(View view, View view2, int i10, int i11) {
        this.f30211f0.f385a = i10;
    }

    @Override
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        rb0 rb0Var;
        int max;
        if (view == this.f30212g0 && (rb0Var = this.f30213h0) != null && ((org.telegram.ui.t7) rb0Var).getListView() != null) {
            int top = this.f30213h0.getTop();
            if (i11 < 0) {
                if (top <= this.f30215j0) {
                    tk0 listView = ((org.telegram.ui.t7) this.f30213h0).getListView();
                    int L0 = ((s4.a0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f47898a.getTop();
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
                } else if (this.f30214i0 != null && !this.f30212g0.canScrollVertically(i11)) {
                    this.f30214i0.onNestedScroll(view, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.w2 w2Var = this.f30214i0;
            if (w2Var != null) {
                w2Var.onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.w2 w2Var) {
        this.f30214i0 = w2Var;
    }

    public void setChildLayout(rb0 rb0Var) {
        if (this.f30213h0 != rb0Var) {
            this.f30213h0 = rb0Var;
            if (this.f30216k0 && rb0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) rb0Var;
                if (t7Var.getListView() != null) {
                    t7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f30212g0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
