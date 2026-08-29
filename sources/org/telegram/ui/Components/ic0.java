package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class ic0 extends hv0 implements r0.n, View.OnLayoutChangeListener {
    public final a5.e f29366s0;
    public View f29367t0;
    public hc0 f29368u0;
    public org.telegram.ui.ActionBar.d3 f29369v0;
    public int f29370w0;
    public int f29371x0;
    public boolean f29372y0;

    public ic0(Context context) {
        super(context, null);
        this.f29366s0 = new Object();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hc0 hc0Var;
        int max;
        if (viewGroup == this.f29367t0 && (hc0Var = this.f29368u0) != null && ((org.telegram.ui.q7) hc0Var).getListView() != null) {
            int top = this.f29368u0.getTop();
            if (i11 < 0) {
                if (top <= this.f29370w0) {
                    jl0 listView = ((org.telegram.ui.q7) this.f29368u0).getListView();
                    int L0 = ((f2.j0) listView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        f2.n1 K = listView.K(L0);
                        if (K != null) {
                            i13 = K.f6432a.getTop();
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
                } else if (this.f29369v0 != null && !this.f29367t0.canScrollVertically(i11)) {
                    this.f29369v0.onNestedScroll(viewGroup, 0, 0, i10, i11);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.ActionBar.d3 d3Var = this.f29369v0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
            }
        }
    }

    public final boolean Z() {
        hc0 hc0Var = this.f29368u0;
        if (hc0Var != null && hc0Var.getTop() == this.f29370w0) {
            return true;
        }
        return false;
    }

    public final void a0(hc0 hc0Var, int i10) {
        this.f29371x0 = i10;
        if (this.f29368u0 != hc0Var) {
            this.f29368u0 = hc0Var;
            if (this.f29372y0 && hc0Var != null) {
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) hc0Var;
                if (q7Var.getListView() != null) {
                    q7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.f29367t0;
        if (view != null && this.f29368u0 != null) {
            if (this.f29371x0 != 0) {
                this.f29370w0 = view.getPaddingTop() + this.f29371x0;
            } else {
                this.f29370w0 = (view.getMeasuredHeight() - this.f29367t0.getPaddingBottom()) - this.f29368u0.getMeasuredHeight();
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hc0 hc0Var;
        if (viewGroup == this.f29367t0 && (hc0Var = this.f29368u0) != null && ((org.telegram.ui.q7) hc0Var).getListView() != null) {
            jl0 listView = ((org.telegram.ui.q7) this.f29368u0).getListView();
            if (this.f29368u0.getTop() == this.f29370w0) {
                iArr[1] = i13;
                listView.scrollBy(0, i13);
            }
        }
    }

    public void n(int i10, View view) {
        this.f29366s0.f165a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.f29369v0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
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
        this.f29372y0 = true;
        hc0 hc0Var = this.f29368u0;
        if (hc0Var != null) {
            hc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29372y0 = false;
        hc0 hc0Var = this.f29368u0;
        if (hc0Var != null) {
            hc0Var.removeOnLayoutChangeListener(this);
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
        this.f29366s0.f165a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.f29369v0 = d3Var;
    }

    public void setChildLayout(hc0 hc0Var) {
        a0(hc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.f29367t0 = view;
        b0();
    }

    @Override
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
