package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class wc0 extends cw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 f29922w0;
    public View f29923x0;
    public vc0 f29924y0;
    public org.telegram.ui.ActionBar.e3 f29925z0;

    public wc0(Context context) {
        super(context, null);
        this.f29922w0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        vc0 vc0Var;
        int max;
        if (viewGroup == this.f29923x0 && (vc0Var = this.f29924y0) != null && ((org.telegram.ui.v7) vc0Var).getListView() != null) {
            int top = this.f29924y0.getTop();
            if (i11 < 0) {
                if (top <= this.A0) {
                    yl0 listView = ((org.telegram.ui.v7) this.f29924y0).getListView();
                    int L0 = ((s4.c0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        s4.c1 L = listView.L(L0);
                        if (L != null) {
                            i13 = L.f43005a.getTop();
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
                } else if (this.f29925z0 != null && !this.f29923x0.canScrollVertically(i11)) {
                    this.f29925z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.e3 e3Var = this.f29925z0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final void Z() {
        View view = this.f29923x0;
        if (view != null && this.f29924y0 != null) {
            this.A0 = (view.getMeasuredHeight() - this.f29923x0.getPaddingBottom()) - this.f29924y0.getMeasuredHeight();
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        vc0 vc0Var;
        if (viewGroup == this.f29923x0 && (vc0Var = this.f29924y0) != null && ((org.telegram.ui.v7) vc0Var).getListView() != null) {
            yl0 listView = ((org.telegram.ui.v7) this.f29924y0).getListView();
            if (this.f29924y0.getTop() == this.A0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void o(int i10, View view) {
        this.f29922w0.f3197a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.f29925z0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        vc0 vc0Var = this.f29924y0;
        if (vc0Var != null) {
            vc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        vc0 vc0Var = this.f29924y0;
        if (vc0Var != null) {
            vc0Var.removeOnLayoutChangeListener(this);
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
        this.f29922w0.f3197a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.f29925z0 = e3Var;
    }

    public void setChildLayout(vc0 vc0Var) {
        if (this.f29924y0 != vc0Var) {
            this.f29924y0 = vc0Var;
            if (this.B0 && vc0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) vc0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.f29923x0 = view;
        Z();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
