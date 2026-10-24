package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class gd0 extends nw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.u0 f26642w0;
    public View f26643x0;
    public fd0 f26644y0;
    public org.telegram.ui.ActionBar.e3 f26645z0;

    public gd0(Context context) {
        super(context, null);
        this.f26642w0 = new Object();
    }

    public void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fd0 fd0Var;
        int max;
        if (viewGroup == this.f26643x0 && (fd0Var = this.f26644y0) != null && ((org.telegram.ui.v7) fd0Var).getListView() != null) {
            int top = this.f26644y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    lm0 listView = ((org.telegram.ui.v7) this.f26644y0).getListView();
                    int L0 = ((s4.b0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.b1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f46342a.getTop();
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
                } else if (this.f26645z0 != null && !this.f26643x0.canScrollVertically(i11)) {
                    this.f26645z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.e3 e3Var = this.f26645z0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Y() {
        fd0 fd0Var = this.f26644y0;
        if (fd0Var != null && fd0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void Z(fd0 fd0Var, int i10) {
        this.B0 = i10;
        if (this.f26644y0 != fd0Var) {
            this.f26644y0 = fd0Var;
            if (this.C0 && fd0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) fd0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        a0();
    }

    public final void a0() {
        View view = this.f26643x0;
        if (view != null && this.f26644y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f26643x0.getPaddingBottom()) - this.f26644y0.getMeasuredHeight();
            }
        }
    }

    public void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fd0 fd0Var;
        if (viewGroup == this.f26643x0 && (fd0Var = this.f26644y0) != null && ((org.telegram.ui.v7) fd0Var).getListView() != null) {
            lm0 listView = ((org.telegram.ui.v7) this.f26644y0).getListView();
            if (this.f26644y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void m(int i10, View view) {
        this.f26642w0.f4060a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.f26645z0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        if (view != null && view.isAttachedToWindow() && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        fd0 fd0Var = this.f26644y0;
        if (fd0Var != null) {
            fd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        fd0 fd0Var = this.f26644y0;
        if (fd0Var != null) {
            fd0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        a0();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a0();
    }

    public void r(View view, View view2, int i10, int i11) {
        this.f26642w0.f4060a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.f26645z0 = e3Var;
    }

    public void setChildLayout(fd0 fd0Var) {
        Z(fd0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f26643x0 = view;
        a0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
