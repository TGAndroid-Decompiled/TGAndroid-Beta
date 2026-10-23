package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class id0 extends ow0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.u0 f27302w0;
    public View f27303x0;
    public hd0 f27304y0;
    public org.telegram.ui.ActionBar.e3 f27305z0;

    public id0(Context context) {
        super(context, null);
        this.f27302w0 = new Object();
    }

    public void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hd0 hd0Var;
        int max;
        if (viewGroup == this.f27303x0 && (hd0Var = this.f27304y0) != null && ((org.telegram.ui.v7) hd0Var).getListView() != null) {
            int top = this.f27304y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    mm0 listView = ((org.telegram.ui.v7) this.f27304y0).getListView();
                    int L0 = ((s4.b0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.b1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f46343a.getTop();
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
                } else if (this.f27305z0 != null && !this.f27303x0.canScrollVertically(i11)) {
                    this.f27305z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.e3 e3Var = this.f27305z0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Y() {
        hd0 hd0Var = this.f27304y0;
        if (hd0Var != null && hd0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void Z(hd0 hd0Var, int i10) {
        this.B0 = i10;
        if (this.f27304y0 != hd0Var) {
            this.f27304y0 = hd0Var;
            if (this.C0 && hd0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) hd0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        a0();
    }

    public final void a0() {
        View view = this.f27303x0;
        if (view != null && this.f27304y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f27303x0.getPaddingBottom()) - this.f27304y0.getMeasuredHeight();
            }
        }
    }

    public void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hd0 hd0Var;
        if (viewGroup == this.f27303x0 && (hd0Var = this.f27304y0) != null && ((org.telegram.ui.v7) hd0Var).getListView() != null) {
            mm0 listView = ((org.telegram.ui.v7) this.f27304y0).getListView();
            if (this.f27304y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void m(int i10, View view) {
        this.f27302w0.f4060a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.f27305z0;
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
        hd0 hd0Var = this.f27304y0;
        if (hd0Var != null) {
            hd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        hd0 hd0Var = this.f27304y0;
        if (hd0Var != null) {
            hd0Var.removeOnLayoutChangeListener(this);
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
        this.f27302w0.f4060a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.f27305z0 = e3Var;
    }

    public void setChildLayout(hd0 hd0Var) {
        Z(hd0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f27303x0 = view;
        a0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
