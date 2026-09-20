package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public abstract class eg0 extends aw0 implements r0.m {
    public org.telegram.ui.y0 A0;
    public vl0 B0;
    public RecyclerView C0;
    public int D0;
    public int E0;
    public final b2.q0 f23844w0;
    public final sb0 f23845x0;
    public RecyclerView f23846y0;
    public org.telegram.ui.w6 f23847z0;

    public eg0(Context context) {
        super(context, null);
        this.f23845x0 = new sb0(this, 1);
        this.f23844w0 = new Object();
    }

    private int getDistanceToPin() {
        return Math.max(0, this.f23847z0.getTop() - this.E0);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        vl0 b02;
        int distanceToPin;
        if (Z() && i11 != 0 && (b02 = b0()) != null) {
            if (viewGroup == this.f23846y0) {
                if (i11 > 0) {
                    int distanceToPin2 = i11 - getDistanceToPin();
                    if (distanceToPin2 > 0) {
                        a0(b02, distanceToPin2);
                        iArr[1] = iArr[1] + distanceToPin2;
                    }
                } else if (this.f23847z0.getTop() <= this.E0 && b02.canScrollVertically(-1)) {
                    iArr[1] = a0(b02, i11) + iArr[1];
                }
            } else if (viewGroup == b02 && i11 > 0 && (distanceToPin = getDistanceToPin()) > 0) {
                iArr[1] = a0(this.f23846y0, Math.min(i11, distanceToPin)) + iArr[1];
            }
        }
    }

    public final boolean Z() {
        org.telegram.ui.w6 w6Var;
        if (this.f23846y0 != null && (w6Var = this.f23847z0) != null && w6Var.isAttachedToWindow() && this.A0 != null) {
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

    public final vl0 b0() {
        vl0 listView;
        ArrayList arrayList;
        org.telegram.ui.y0 y0Var = this.A0;
        if (y0Var == null) {
            listView = null;
        } else {
            listView = ((org.telegram.ui.t7) y0Var.f39758b).getListView();
        }
        vl0 vl0Var = this.B0;
        if (vl0Var != listView) {
            sb0 sb0Var = this.f23845x0;
            if (vl0Var != null && (arrayList = vl0Var.f2865v0) != null) {
                arrayList.remove(sb0Var);
            }
            this.B0 = listView;
            if (listView != null) {
                listView.j(sb0Var);
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
        vl0 b02;
        if (Z() && i13 != 0 && (b02 = b0()) != null) {
            RecyclerView recyclerView = this.f23846y0;
            if (viewGroup == recyclerView) {
                if (i13 > 0 && this.f23847z0.getTop() <= this.E0) {
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
        this.f23844w0.f3203a = 0;
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
        this.f23844w0.f3203a = i10;
    }

    public void setOuterListView(RecyclerView recyclerView) {
        ArrayList arrayList;
        RecyclerView recyclerView2 = this.f23846y0;
        if (recyclerView2 != recyclerView) {
            sb0 sb0Var = this.f23845x0;
            if (recyclerView2 != null && (arrayList = recyclerView2.f2865v0) != null) {
                arrayList.remove(sb0Var);
            }
            this.f23846y0 = recyclerView;
            if (recyclerView != null) {
                recyclerView.j(sb0Var);
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
