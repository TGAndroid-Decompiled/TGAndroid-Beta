package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class kb0 extends au0 implements r0.l, View.OnLayoutChangeListener {
    public final e2.r0 f36720g0;
    public View f36721h0;
    public jb0 f36722i0;
    public org.telegram.ui.ActionBar.u2 f36723j0;
    public int f36724k0;
    public boolean f36725l0;

    public kb0(Context context) {
        super(context, null);
        this.f36720g0 = new Object();
    }

    public final void X() {
        View view = this.f36721h0;
        if (view != null && this.f36722i0 != null) {
            this.f36724k0 = (view.getMeasuredHeight() - this.f36721h0.getPaddingBottom()) - this.f36722i0.getMeasuredHeight();
        }
    }

    @Override
    public final void k(int i7, View view) {
        this.f36720g0.f10684a = 0;
        org.telegram.ui.ActionBar.u2 u2Var = this.f36723j0;
        if (u2Var != null) {
            u2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        jb0 jb0Var;
        if (view == this.f36721h0 && (jb0Var = this.f36722i0) != null && ((org.telegram.ui.s7) jb0Var).getListView() != null) {
            ck0 listView = ((org.telegram.ui.s7) this.f36722i0).getListView();
            if (this.f36722i0.getTop() == this.f36724k0) {
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
        this.f36725l0 = true;
        jb0 jb0Var = this.f36722i0;
        if (jb0Var != null) {
            jb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36725l0 = false;
        jb0 jb0Var = this.f36722i0;
        if (jb0Var != null) {
            jb0Var.removeOnLayoutChangeListener(this);
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
        this.f36720g0.f10684a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        jb0 jb0Var;
        int max;
        if (view == this.f36721h0 && (jb0Var = this.f36722i0) != null && ((org.telegram.ui.s7) jb0Var).getListView() != null) {
            int top = this.f36722i0.getTop();
            if (i10 < 0) {
                if (top <= this.f36724k0) {
                    ck0 listView = ((org.telegram.ui.s7) this.f36722i0).getListView();
                    int L0 = ((v4.c0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        v4.f1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f59123a.getTop();
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
                } else if (this.f36723j0 != null && !this.f36721h0.canScrollVertically(i10)) {
                    this.f36723j0.onNestedScroll(view, 0, 0, i7, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.u2 u2Var = this.f36723j0;
            if (u2Var != null) {
                u2Var.onNestedPreScroll(view, i7, i10, iArr);
            }
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.u2 u2Var) {
        this.f36723j0 = u2Var;
    }

    public void setChildLayout(jb0 jb0Var) {
        if (this.f36722i0 != jb0Var) {
            this.f36722i0 = jb0Var;
            if (this.f36725l0 && jb0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) jb0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f36721h0 = view;
        X();
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
