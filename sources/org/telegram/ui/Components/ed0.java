package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class ed0 extends vw0 implements r0.m, View.OnLayoutChangeListener {
    public final b2.v0 f27812l0;
    public View m0;
    public dd0 f27813n0;
    public org.telegram.ui.ActionBar.h3 f27814o0;
    public int f27815p0;
    public boolean f27816q0;

    public ed0(Context context) {
        super(context, null);
        this.f27812l0 = new Object();
    }

    public final void X() {
        View view = this.m0;
        if (view != null && this.f27813n0 != null) {
            this.f27815p0 = (view.getMeasuredHeight() - this.m0.getPaddingBottom()) - this.f27813n0.getMeasuredHeight();
        }
    }

    @Override
    public final void m(int i10, View view) {
        this.f27812l0.f3511a = 0;
        org.telegram.ui.ActionBar.h3 h3Var = this.f27814o0;
        if (h3Var != null) {
            h3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        dd0 dd0Var;
        if (view == this.m0 && (dd0Var = this.f27813n0) != null && ((org.telegram.ui.x7) dd0Var).getListView() != null) {
            mm0 listView = ((org.telegram.ui.x7) this.f27813n0).getListView();
            if (this.f27813n0.getTop() == this.f27815p0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27816q0 = true;
        dd0 dd0Var = this.f27813n0;
        if (dd0Var != null) {
            dd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27816q0 = false;
        dd0 dd0Var = this.f27813n0;
        if (dd0Var != null) {
            dd0Var.removeOnLayoutChangeListener(this);
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
    public final boolean p(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f27812l0.f3511a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.h3 h3Var) {
        this.f27814o0 = h3Var;
    }

    public void setChildLayout(dd0 dd0Var) {
        if (this.f27813n0 != dd0Var) {
            this.f27813n0 = dd0Var;
            if (this.f27816q0 && dd0Var != null) {
                org.telegram.ui.x7 x7Var = (org.telegram.ui.x7) dd0Var;
                if (x7Var.getListView() != null) {
                    x7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.m0 = view;
        X();
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        dd0 dd0Var;
        int max;
        if (view == this.m0 && (dd0Var = this.f27813n0) != null && ((org.telegram.ui.x7) dd0Var).getListView() != null) {
            int top = this.f27813n0.getTop();
            if (i11 < 0) {
                if (top <= this.f27815p0) {
                    mm0 listView = ((org.telegram.ui.x7) this.f27813n0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.e1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f47735a.getTop();
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
                } else if (this.f27814o0 != null && !this.m0.canScrollVertically(i11)) {
                    this.f27814o0.onNestedScroll(view, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.h3 h3Var = this.f27814o0;
            if (h3Var != null) {
                h3Var.onNestedPreScroll(view, i10, i11, iArr);
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
