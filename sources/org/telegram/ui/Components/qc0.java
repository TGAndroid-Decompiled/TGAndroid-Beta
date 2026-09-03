package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class qc0 extends pv0 implements r0.n, View.OnLayoutChangeListener {
    public final c5.e f30381t0;
    public View f30382u0;
    public pc0 f30383v0;
    public org.telegram.ui.ActionBar.f3 f30384w0;
    public int f30385x0;
    public int f30386y0;
    public boolean f30387z0;

    public qc0(Context context) {
        super(context, null);
        this.f30381t0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        pc0 pc0Var;
        int max;
        if (viewGroup == this.f30382u0 && (pc0Var = this.f30383v0) != null && ((org.telegram.ui.u7) pc0Var).getListView() != null) {
            int top = this.f30383v0.getTop();
            if (i11 < 0) {
                if (top <= this.f30385x0) {
                    sl0 listView = ((org.telegram.ui.u7) this.f30383v0).getListView();
                    int L0 = ((f2.j0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        f2.m1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f5875a.getTop();
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
                } else if (this.f30384w0 != null && !this.f30382u0.canScrollVertically(i11)) {
                    this.f30384w0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.f3 f3Var = this.f30384w0;
            if (f3Var != null) {
                f3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        pc0 pc0Var = this.f30383v0;
        if (pc0Var != null && pc0Var.getTop() == this.f30385x0) {
            return true;
        }
        return false;
    }

    public final void a0(pc0 pc0Var, int i10) {
        this.f30386y0 = i10;
        if (this.f30383v0 != pc0Var) {
            this.f30383v0 = pc0Var;
            if (this.f30387z0 && pc0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) pc0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f30382u0;
        if (view != null && this.f30383v0 != null) {
            if (this.f30386y0 != 0) {
                this.f30385x0 = view.getPaddingTop() + this.f30386y0;
            } else {
                this.f30385x0 = (view.getMeasuredHeight() - this.f30382u0.getPaddingBottom()) - this.f30383v0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        pc0 pc0Var;
        if (viewGroup == this.f30382u0 && (pc0Var = this.f30383v0) != null && ((org.telegram.ui.u7) pc0Var).getListView() != null) {
            sl0 listView = ((org.telegram.ui.u7) this.f30383v0).getListView();
            if (this.f30383v0.getTop() == this.f30385x0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f30381t0.f2268a = 0;
        org.telegram.ui.ActionBar.f3 f3Var = this.f30384w0;
        if (f3Var != null) {
            f3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30387z0 = true;
        pc0 pc0Var = this.f30383v0;
        if (pc0Var != null) {
            pc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30387z0 = false;
        pc0 pc0Var = this.f30383v0;
        if (pc0Var != null) {
            pc0Var.removeOnLayoutChangeListener(this);
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
        this.f30381t0.f2268a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.f3 f3Var) {
        this.f30384w0 = f3Var;
    }

    public void setChildLayout(pc0 pc0Var) {
        a0(pc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f30382u0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
