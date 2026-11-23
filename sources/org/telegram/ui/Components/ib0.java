package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class ib0 extends cu0 implements r0.l, View.OnLayoutChangeListener {
    public final e2.r0 f35974g0;
    public View f35975h0;
    public hb0 f35976i0;
    public org.telegram.ui.ActionBar.t2 f35977j0;
    public int f35978k0;
    public boolean f35979l0;

    public ib0(Context context) {
        super(context, null);
        this.f35974g0 = new Object();
    }

    public final void X() {
        View view = this.f35975h0;
        if (view != null && this.f35976i0 != null) {
            this.f35978k0 = (view.getMeasuredHeight() - this.f35975h0.getPaddingBottom()) - this.f35976i0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i7, View view) {
        this.f35974g0.f10677a = 0;
        org.telegram.ui.ActionBar.t2 t2Var = this.f35977j0;
        if (t2Var != null) {
            t2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        hb0 hb0Var;
        if (view == this.f35975h0 && (hb0Var = this.f35976i0) != null && ((org.telegram.ui.t7) hb0Var).getListView() != null) {
            ek0 listView = ((org.telegram.ui.t7) this.f35976i0).getListView();
            if (this.f35976i0.getTop() == this.f35978k0) {
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
        this.f35979l0 = true;
        hb0 hb0Var = this.f35976i0;
        if (hb0Var != null) {
            hb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35979l0 = false;
        hb0 hb0Var = this.f35976i0;
        if (hb0Var != null) {
            hb0Var.removeOnLayoutChangeListener(this);
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
        this.f35974g0.f10677a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        hb0 hb0Var;
        int max;
        if (view == this.f35975h0 && (hb0Var = this.f35976i0) != null && ((org.telegram.ui.t7) hb0Var).getListView() != null) {
            int top = this.f35976i0.getTop();
            if (i10 < 0) {
                if (top <= this.f35978k0) {
                    ek0 listView = ((org.telegram.ui.t7) this.f35976i0).getListView();
                    int L0 = ((v4.c0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        v4.f1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f59245a.getTop();
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
                } else if (this.f35977j0 != null && !this.f35975h0.canScrollVertically(i10)) {
                    this.f35977j0.onNestedScroll(view, 0, 0, i7, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.t2 t2Var = this.f35977j0;
            if (t2Var != null) {
                t2Var.onNestedPreScroll(view, i7, i10, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.t2 t2Var) {
        this.f35977j0 = t2Var;
    }

    public void setChildLayout(hb0 hb0Var) {
        if (this.f35976i0 != hb0Var) {
            this.f35976i0 = hb0Var;
            if (this.f35979l0 && hb0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) hb0Var;
                if (t7Var.getListView() != null) {
                    t7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f35975h0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
