package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public abstract class ua0 extends qt0 implements r0.l, View.OnLayoutChangeListener {
    public final d2.t0 f38707g0;
    public View f38708h0;
    public ta0 f38709i0;
    public org.telegram.ui.ActionBar.q2 f38710j0;
    public int f38711k0;
    public boolean f38712l0;

    public ua0(Context context) {
        super(context, null);
        this.f38707g0 = new Object();
    }

    public final void X() {
        View view = this.f38708h0;
        if (view != null && this.f38709i0 != null) {
            this.f38711k0 = (view.getMeasuredHeight() - this.f38708h0.getPaddingBottom()) - this.f38709i0.getMeasuredHeight();
        }
    }

    @Override
    public final void m(int i3, View view) {
        this.f38707g0.f8413a = 0;
        org.telegram.ui.ActionBar.q2 q2Var = this.f38710j0;
        if (q2Var != null) {
            q2Var.onStopNestedScroll(view);
        }
    }

    @Override
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        ta0 ta0Var;
        if (view == this.f38708h0 && (ta0Var = this.f38709i0) != null && ((org.telegram.ui.u7) ta0Var).getListView() != null) {
            tj0 listView = ((org.telegram.ui.u7) this.f38709i0).getListView();
            if (this.f38709i0.getTop() == this.f38711k0) {
                iArr[1] = i12;
                listView.scrollBy(0, i12);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38712l0 = true;
        ta0 ta0Var = this.f38709i0;
        if (ta0Var != null) {
            ta0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38712l0 = false;
        ta0 ta0Var = this.f38709i0;
        if (ta0Var != null) {
            ta0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        X();
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        X();
    }

    @Override
    public final boolean p(View view, View view2, int i3, int i10) {
        if (view != null && view.isAttachedToWindow() && i3 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i3, int i10) {
        this.f38707g0.f8413a = i3;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.q2 q2Var) {
        this.f38710j0 = q2Var;
    }

    public void setChildLayout(ta0 ta0Var) {
        if (this.f38709i0 != ta0Var) {
            this.f38709i0 = ta0Var;
            if (this.f38712l0 && ta0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) ta0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.f38708h0 = view;
        X();
    }

    @Override
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        ta0 ta0Var;
        int max;
        if (view == this.f38708h0 && (ta0Var = this.f38709i0) != null && ((org.telegram.ui.u7) ta0Var).getListView() != null) {
            int top = this.f38709i0.getTop();
            if (i10 < 0) {
                if (top <= this.f38711k0) {
                    tj0 listView = ((org.telegram.ui.u7) this.f38709i0).getListView();
                    int L0 = ((u4.b0) listView.getLayoutManager()).L0();
                    int i12 = -1;
                    if (L0 != -1) {
                        u4.d1 K = listView.K(L0);
                        if (K != null) {
                            i12 = K.f55540a.getTop();
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
                } else if (this.f38710j0 != null && !this.f38708h0.canScrollVertically(i10)) {
                    this.f38710j0.onNestedScroll(view, 0, 0, i3, i10);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.q2 q2Var = this.f38710j0;
            if (q2Var != null) {
                q2Var.onNestedPreScroll(view, i3, i10, iArr);
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
