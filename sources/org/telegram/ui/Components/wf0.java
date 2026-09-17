package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public abstract class wf0 extends qv0 implements r0.m {
    public org.telegram.ui.y0 A0;
    public ml0 B0;
    public RecyclerView C0;
    public int D0;
    public int E0;
    public final b2.q0 f29660w0;
    public final kb0 f29661x0;
    public RecyclerView f29662y0;
    public org.telegram.ui.x6 f29663z0;

    public wf0(Context context) {
        super(context, null);
        this.f29661x0 = new kb0(this, 1);
        this.f29660w0 = new Object();
    }

    private int getDistanceToPin() {
        return Math.max(0, this.f29663z0.getTop() - this.E0);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        ml0 b02;
        int distanceToPin;
        if (Z() && i11 != 0 && (b02 = b0()) != null) {
            if (viewGroup == this.f29662y0) {
                if (i11 > 0) {
                    int distanceToPin2 = i11 - getDistanceToPin();
                    if (distanceToPin2 > 0) {
                        a0(b02, distanceToPin2);
                        iArr[1] = iArr[1] + distanceToPin2;
                    }
                } else if (this.f29663z0.getTop() <= this.E0 && b02.canScrollVertically(-1)) {
                    iArr[1] = a0(b02, i11) + iArr[1];
                }
            } else if (viewGroup == b02 && i11 > 0 && (distanceToPin = getDistanceToPin()) > 0) {
                iArr[1] = a0(this.f29662y0, Math.min(i11, distanceToPin)) + iArr[1];
            }
        }
    }

    public final boolean Z() {
        org.telegram.ui.x6 x6Var;
        if (this.f29662y0 != null && (x6Var = this.f29663z0) != null && x6Var.isAttachedToWindow() && this.A0 != null) {
            return true;
        }
        return false;
    }

    public final int a0(RecyclerView recyclerView, int i10) {
        if (i10 == 0 || !recyclerView.canScrollVertically(i10)) {
            return 0;
        }
        this.C0 = recyclerView;
        this.D0 = 0;
        recyclerView.scrollBy(0, i10);
        int i11 = this.D0;
        this.C0 = null;
        return i11;
    }

    public final ml0 b0() {
        ml0 listView;
        ArrayList arrayList;
        org.telegram.ui.y0 y0Var = this.A0;
        if (y0Var == null) {
            listView = null;
        } else {
            listView = ((org.telegram.ui.u7) y0Var.f39741b).getListView();
        }
        ml0 ml0Var = this.B0;
        if (ml0Var != listView) {
            kb0 kb0Var = this.f29661x0;
            if (ml0Var != null && (arrayList = ml0Var.f2865v0) != null) {
                arrayList.remove(kb0Var);
            }
            this.B0 = listView;
            if (listView != null) {
                listView.j(kb0Var);
            }
        }
        return listView;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ml0 b02;
        if (Z() && i13 != 0 && (b02 = b0()) != null) {
            RecyclerView recyclerView = this.f29662y0;
            if (viewGroup == recyclerView) {
                if (i13 > 0 && this.f29663z0.getTop() <= this.E0) {
                    a0(b02, i13);
                    iArr[1] = iArr[1] + i13;
                }
            } else if (viewGroup == b02) {
                if (i13 < 0) {
                    iArr[1] = a0(recyclerView, i13) + iArr[1];
                } else {
                    iArr[1] = iArr[1] + i13;
                }
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f29660w0.f3203a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (Z() && (i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f29660w0.f3203a = i10;
    }

    public void setOuterListView(RecyclerView recyclerView) {
        ArrayList arrayList;
        RecyclerView recyclerView2 = this.f29662y0;
        if (recyclerView2 != recyclerView) {
            kb0 kb0Var = this.f29661x0;
            if (recyclerView2 != null && (arrayList = recyclerView2.f2865v0) != null) {
                arrayList.remove(kb0Var);
            }
            this.f29662y0 = recyclerView;
            if (recyclerView != null) {
                recyclerView.j(kb0Var);
            }
        }
    }

    public void setPinnedTop(int i10) {
        this.E0 = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
