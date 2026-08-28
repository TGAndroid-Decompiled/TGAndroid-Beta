package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class tb0 extends xu0 implements r0.n, View.OnLayoutChangeListener {
    public final d5.p f32670s0;
    public View f32671t0;
    public sb0 f32672u0;
    public org.telegram.ui.ActionBar.d3 f32673v0;
    public int f32674w0;
    public int f32675x0;
    public boolean f32676y0;

    public tb0(Context context) {
        super(context, null);
        this.f32670s0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        sb0 sb0Var;
        int max;
        if (viewGroup == this.f32671t0 && (sb0Var = this.f32672u0) != null && ((org.telegram.ui.r7) sb0Var).getListView() != null) {
            int top = this.f32672u0.getTop();
            if (i10 < 0) {
                if (top <= this.f32674w0) {
                    wk0 listView = ((org.telegram.ui.r7) this.f32672u0).getListView();
                    int L0 = ((f2.m0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        f2.q1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f5501a.getTop();
                        }
                        int paddingTop = listView.getPaddingTop();
                        if (i12 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i12 - paddingTop);
                            }
                            iArr[1] = max;
                            listView.scrollBy(0, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this.f32673v0 != null && !this.f32671t0.canScrollVertically(i10)) {
                    this.f32673v0.onNestedScroll(viewGroup, 0, 0, i9, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f32673v0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i9, i10, iArr);
            }
        }
    }

    public final boolean Z() {
        sb0 sb0Var = this.f32672u0;
        if (sb0Var != null && sb0Var.getTop() == this.f32674w0) {
            return true;
        }
        return false;
    }

    public final void a0(sb0 sb0Var, int i9) {
        this.f32675x0 = i9;
        if (this.f32672u0 != sb0Var) {
            this.f32672u0 = sb0Var;
            if (this.f32676y0 && sb0Var != null) {
                org.telegram.ui.r7 r7Var = (org.telegram.ui.r7) sb0Var;
                if (r7Var.getListView() != null) {
                    r7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f32671t0;
        if (view != null && this.f32672u0 != null) {
            if (this.f32675x0 != 0) {
                this.f32674w0 = view.getPaddingTop() + this.f32675x0;
            } else {
                this.f32674w0 = (view.getMeasuredHeight() - this.f32671t0.getPaddingBottom()) - this.f32672u0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        sb0 sb0Var;
        if (viewGroup == this.f32671t0 && (sb0Var = this.f32672u0) != null && ((org.telegram.ui.r7) sb0Var).getListView() != null) {
            wk0 listView = ((org.telegram.ui.r7) this.f32672u0).getListView();
            if (this.f32672u0.getTop() == this.f32674w0) {
                iArr[1] = i12;
                listView.scrollBy(0, i12);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32676y0 = true;
        sb0 sb0Var = this.f32672u0;
        if (sb0Var != null) {
            sb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32676y0 = false;
        sb0 sb0Var = this.f32672u0;
        if (sb0Var != null) {
            sb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        b0();
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        b0();
    }

    public void p(int i9, View view) {
        this.f32670s0.f4376a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f32673v0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    public boolean q(View view, View view2, int i9, int i10) {
        if (view != null && view.isAttachedToWindow() && i9 == 2) {
            return true;
        }
        return false;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f32673v0 = d3Var;
    }

    public void setChildLayout(sb0 sb0Var) {
        a0(sb0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f32671t0 = view;
        b0();
    }

    public void t(View view, View view2, int i9, int i10) {
        this.f32670s0.f4376a = i9;
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
