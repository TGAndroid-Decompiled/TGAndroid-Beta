package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class nd0 extends tw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.q0 f29101w0;
    public View f29102x0;
    public md0 f29103y0;
    public org.telegram.ui.ActionBar.d3 f29104z0;

    public nd0(Context context) {
        super(context, null);
        this.f29101w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        md0 md0Var;
        int max;
        if (viewGroup == this.f29102x0 && (md0Var = this.f29103y0) != null && ((org.telegram.ui.r7) md0Var).getListView() != null) {
            int top = this.f29103y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    rm0 listView = ((org.telegram.ui.r7) this.f29103y0).getListView();
                    int L0 = ((s4.d0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.d1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f47702a.getTop();
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
                } else if (this.f29104z0 != null && !this.f29102x0.canScrollVertically(i11)) {
                    this.f29104z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f29104z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        md0 md0Var = this.f29103y0;
        if (md0Var != null && md0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void a0(md0 md0Var, int i10) {
        this.B0 = i10;
        if (this.f29103y0 != md0Var) {
            this.f29103y0 = md0Var;
            if (this.C0 && md0Var != null) {
                org.telegram.ui.r7 r7Var = (org.telegram.ui.r7) md0Var;
                if (r7Var.getListView() != null) {
                    r7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f29102x0;
        if (view != null && this.f29103y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f29102x0.getPaddingBottom()) - this.f29103y0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        md0 md0Var;
        if (viewGroup == this.f29102x0 && (md0Var = this.f29103y0) != null && ((org.telegram.ui.r7) md0Var).getListView() != null) {
            rm0 listView = ((org.telegram.ui.r7) this.f29103y0).getListView();
            if (this.f29103y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f29101w0.f3533a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f29104z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        md0 md0Var = this.f29103y0;
        if (md0Var != null) {
            md0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        md0 md0Var = this.f29103y0;
        if (md0Var != null) {
            md0Var.removeOnLayoutChangeListener(this);
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
        this.f29101w0.f3533a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f29104z0 = d3Var;
    }

    public void setChildLayout(md0 md0Var) {
        a0(md0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f29102x0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
