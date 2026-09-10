package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class vc0 extends aw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.q0 f27917w0;
    public View f27918x0;
    public uc0 f27919y0;
    public org.telegram.ui.ActionBar.f3 f27920z0;

    public vc0(Context context) {
        super(context, null);
        this.f27917w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        uc0 uc0Var;
        int max;
        if (viewGroup == this.f27918x0 && (uc0Var = this.f27919y0) != null && ((org.telegram.ui.r7) uc0Var).getListView() != null) {
            int top = this.f27919y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    vl0 listView = ((org.telegram.ui.r7) this.f27919y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f41610a.getTop();
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
                } else if (this.f27920z0 != null && !this.f27918x0.canScrollVertically(i11)) {
                    this.f27920z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.f3 f3Var = this.f27920z0;
            if (f3Var != null) {
                f3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        uc0 uc0Var = this.f27919y0;
        if (uc0Var != null && uc0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void a0(uc0 uc0Var, int i10) {
        this.B0 = i10;
        if (this.f27919y0 != uc0Var) {
            this.f27919y0 = uc0Var;
            if (this.C0 && uc0Var != null) {
                org.telegram.ui.r7 r7Var = (org.telegram.ui.r7) uc0Var;
                if (r7Var.getListView() != null) {
                    r7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f27918x0;
        if (view != null && this.f27919y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f27918x0.getPaddingBottom()) - this.f27919y0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        uc0 uc0Var;
        if (viewGroup == this.f27918x0 && (uc0Var = this.f27919y0) != null && ((org.telegram.ui.r7) uc0Var).getListView() != null) {
            vl0 listView = ((org.telegram.ui.r7) this.f27919y0).getListView();
            if (this.f27919y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void n(int i10, View view) {
        this.f27917w0.f1896a = 0;
        org.telegram.ui.ActionBar.f3 f3Var = this.f27920z0;
        if (f3Var != null) {
            f3Var.onStopNestedScroll(view);
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
        uc0 uc0Var = this.f27919y0;
        if (uc0Var != null) {
            uc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        uc0 uc0Var = this.f27919y0;
        if (uc0Var != null) {
            uc0Var.removeOnLayoutChangeListener(this);
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

    public void r(View view, View view2, int i10, int i11) {
        this.f27917w0.f1896a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.f3 f3Var) {
        this.f27920z0 = f3Var;
    }

    public void setChildLayout(uc0 uc0Var) {
        a0(uc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f27918x0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
