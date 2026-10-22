package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class gd0 extends lw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.u0 f26571w0;
    public View f26572x0;
    public fd0 f26573y0;
    public org.telegram.ui.ActionBar.d3 f26574z0;

    public gd0(Context context) {
        super(context, null);
        this.f26571w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fd0 fd0Var;
        int max;
        if (viewGroup == this.f26572x0 && (fd0Var = this.f26573y0) != null && ((org.telegram.ui.v7) fd0Var).getListView() != null) {
            int top = this.f26573y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    jm0 listView = ((org.telegram.ui.v7) this.f26573y0).getListView();
                    int L0 = ((s4.b0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.b1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f45920a.getTop();
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
                } else if (this.f26574z0 != null && !this.f26572x0.canScrollVertically(i11)) {
                    this.f26574z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f26574z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        fd0 fd0Var = this.f26573y0;
        if (fd0Var != null && fd0Var.getTop() == this.A0) {
            return true;
        }
        return false;
    }

    public final void a0(fd0 fd0Var, int i10) {
        this.B0 = i10;
        if (this.f26573y0 != fd0Var) {
            this.f26573y0 = fd0Var;
            if (this.C0 && fd0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) fd0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f26572x0;
        if (view != null && this.f26573y0 != null) {
            if (this.B0 != 0) {
                this.A0 = view.getPaddingTop() + this.B0;
            } else {
                this.A0 = (view.getMeasuredHeight() - this.f26572x0.getPaddingBottom()) - this.f26573y0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fd0 fd0Var;
        if (viewGroup == this.f26572x0 && (fd0Var = this.f26573y0) != null && ((org.telegram.ui.v7) fd0Var).getListView() != null) {
            jm0 listView = ((org.telegram.ui.v7) this.f26573y0).getListView();
            if (this.f26573y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void n(int i10, View view) {
        this.f26571w0.f4053a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f26574z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        fd0 fd0Var = this.f26573y0;
        if (fd0Var != null) {
            fd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        fd0 fd0Var = this.f26573y0;
        if (fd0Var != null) {
            fd0Var.removeOnLayoutChangeListener(this);
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
        this.f26571w0.f4053a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f26574z0 = d3Var;
    }

    public void setChildLayout(fd0 fd0Var) {
        a0(fd0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f26572x0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
