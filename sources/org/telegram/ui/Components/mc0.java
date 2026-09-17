package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class mc0 extends qv0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 f26125w0;
    public View f26126x0;
    public lc0 f26127y0;
    public org.telegram.ui.ActionBar.e3 f26128z0;

    public mc0(Context context) {
        super(context, null);
        this.f26125w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        lc0 lc0Var;
        int max;
        if (viewGroup == this.f26126x0 && (lc0Var = this.f26127y0) != null && ((org.telegram.ui.u7) lc0Var).getListView() != null) {
            int top = this.f26127y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    ml0 listView = ((org.telegram.ui.u7) this.f26127y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 L = listView.L(L0);
                        if (L != null) {
                            i13 = L.f42697a.getTop();
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
                } else if (this.f26128z0 != null && !this.f26126x0.canScrollVertically(i11)) {
                    this.f26128z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.e3 e3Var = this.f26128z0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final void Z() {
        View view = this.f26126x0;
        if (view != null && this.f26127y0 != null) {
            this.A0 = (view.getMeasuredHeight() - this.f26126x0.getPaddingBottom()) - this.f26127y0.getMeasuredHeight();
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        lc0 lc0Var;
        if (viewGroup == this.f26126x0 && (lc0Var = this.f26127y0) != null && ((org.telegram.ui.u7) lc0Var).getListView() != null) {
            ml0 listView = ((org.telegram.ui.u7) this.f26127y0).getListView();
            if (this.f26127y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f26125w0.f3203a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.f26128z0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        lc0 lc0Var = this.f26127y0;
        if (lc0Var != null) {
            lc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        lc0 lc0Var = this.f26127y0;
        if (lc0Var != null) {
            lc0Var.removeOnLayoutChangeListener(this);
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
        this.f26125w0.f3203a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.f26128z0 = e3Var;
    }

    public void setChildLayout(lc0 lc0Var) {
        if (this.f26127y0 != lc0Var) {
            this.f26127y0 = lc0Var;
            if (this.B0 && lc0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) lc0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.f26126x0 = view;
        Z();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
