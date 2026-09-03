package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class pc0 extends qv0 implements r0.n, View.OnLayoutChangeListener {
    public final c5.e f27828t0;
    public View f27829u0;
    public oc0 f27830v0;
    public org.telegram.ui.ActionBar.e3 f27831w0;
    public int f27832x0;
    public int f27833y0;
    public boolean f27834z0;

    public pc0(Context context) {
        super(context, null);
        this.f27828t0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        oc0 oc0Var;
        int max;
        if (viewGroup == this.f27829u0 && (oc0Var = this.f27830v0) != null && ((org.telegram.ui.w7) oc0Var).getListView() != null) {
            int top = this.f27830v0.getTop();
            if (i11 < 0) {
                if (top <= this.f27832x0) {
                    rl0 listView = ((org.telegram.ui.w7) this.f27830v0).getListView();
                    int L0 = ((f2.i0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        f2.l1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f5774a.getTop();
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
                } else if (this.f27831w0 != null && !this.f27829u0.canScrollVertically(i11)) {
                    this.f27831w0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.e3 e3Var = this.f27831w0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        oc0 oc0Var = this.f27830v0;
        if (oc0Var != null && oc0Var.getTop() == this.f27832x0) {
            return true;
        }
        return false;
    }

    public final void a0(oc0 oc0Var, int i10) {
        this.f27833y0 = i10;
        if (this.f27830v0 != oc0Var) {
            this.f27830v0 = oc0Var;
            if (this.f27834z0 && oc0Var != null) {
                org.telegram.ui.w7 w7Var = (org.telegram.ui.w7) oc0Var;
                if (w7Var.getListView() != null) {
                    w7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f27829u0;
        if (view != null && this.f27830v0 != null) {
            if (this.f27833y0 != 0) {
                this.f27832x0 = view.getPaddingTop() + this.f27833y0;
            } else {
                this.f27832x0 = (view.getMeasuredHeight() - this.f27829u0.getPaddingBottom()) - this.f27830v0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        oc0 oc0Var;
        if (viewGroup == this.f27829u0 && (oc0Var = this.f27830v0) != null && ((org.telegram.ui.w7) oc0Var).getListView() != null) {
            rl0 listView = ((org.telegram.ui.w7) this.f27830v0).getListView();
            if (this.f27830v0.getTop() == this.f27832x0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void n(int i10, View view) {
        this.f27828t0.f2108a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.f27831w0;
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
        this.f27834z0 = true;
        oc0 oc0Var = this.f27830v0;
        if (oc0Var != null) {
            oc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27834z0 = false;
        oc0 oc0Var = this.f27830v0;
        if (oc0Var != null) {
            oc0Var.removeOnLayoutChangeListener(this);
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

    public void s(View view, View view2, int i10, int i11) {
        this.f27828t0.f2108a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.f27831w0 = e3Var;
    }

    public void setChildLayout(oc0 oc0Var) {
        a0(oc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f27829u0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
