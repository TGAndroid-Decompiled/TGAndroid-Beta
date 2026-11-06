package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class za0 extends rt0 implements r0.l, View.OnLayoutChangeListener {
    public final e2.r0 f40876f0;
    public View f40877g0;
    public ya0 f40878h0;
    public org.telegram.ui.ActionBar.s2 f40879i0;
    public int f40880j0;
    public boolean f40881k0;

    public za0(Context context) {
        super(context, null);
        this.f40876f0 = new Object();
    }

    public final void X() {
        View view = this.f40877g0;
        if (view != null && this.f40878h0 != null) {
            this.f40880j0 = (view.getMeasuredHeight() - this.f40877g0.getPaddingBottom()) - this.f40878h0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i7, View view) {
        this.f40876f0.f10533a = 0;
        org.telegram.ui.ActionBar.s2 s2Var = this.f40879i0;
        if (s2Var != null) {
            s2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ya0 ya0Var;
        if (view == this.f40877g0 && (ya0Var = this.f40878h0) != null && ((org.telegram.ui.t7) ya0Var).getListView() != null) {
            pj0 listView = ((org.telegram.ui.t7) this.f40878h0).getListView();
            if (this.f40878h0.getTop() == this.f40880j0) {
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
        this.f40881k0 = true;
        ya0 ya0Var = this.f40878h0;
        if (ya0Var != null) {
            ya0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40881k0 = false;
        ya0 ya0Var = this.f40878h0;
        if (ya0Var != null) {
            ya0Var.removeOnLayoutChangeListener(this);
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
        this.f40876f0.f10533a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        ya0 ya0Var;
        int max;
        if (view == this.f40877g0 && (ya0Var = this.f40878h0) != null && ((org.telegram.ui.t7) ya0Var).getListView() != null) {
            int top = this.f40878h0.getTop();
            if (i10 < 0) {
                if (top <= this.f40880j0) {
                    pj0 listView = ((org.telegram.ui.t7) this.f40878h0).getListView();
                    int L0 = ((v4.b0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        v4.d1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f56927a.getTop();
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
                } else if (this.f40879i0 != null && !this.f40877g0.canScrollVertically(i10)) {
                    this.f40879i0.onNestedScroll(view, 0, 0, i7, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.s2 s2Var = this.f40879i0;
            if (s2Var != null) {
                s2Var.onNestedPreScroll(view, i7, i10, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.s2 s2Var) {
        this.f40879i0 = s2Var;
    }

    public void setChildLayout(ya0 ya0Var) {
        if (this.f40878h0 != ya0Var) {
            this.f40878h0 = ya0Var;
            if (this.f40881k0 && ya0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) ya0Var;
                if (t7Var.getListView() != null) {
                    t7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f40877g0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
