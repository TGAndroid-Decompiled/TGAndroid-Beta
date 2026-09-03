package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ej extends pz {
    public final int U;
    public final di V;

    public ej(di diVar, int i10, rl0 rl0Var, int i11) {
        super(i10, 0, rl0Var);
        this.U = i11;
        this.V = diVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int C = this.f5846n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int min = Math.min(0, top);
                int max = Math.max(0, (rect.height() + top) - C);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.U) {
            case 0:
                dj djVar = new dj(this, recyclerView.getContext());
                djVar.f5712a = i10;
                w0(djVar);
                return;
            case 1:
                wj wjVar = new wj(this, recyclerView.getContext());
                wjVar.f5712a = i10;
                w0(wjVar);
                return;
            case 2:
                rk rkVar = new rk(this, recyclerView.getContext());
                rkVar.f5712a = i10;
                w0(rkVar);
                return;
            case 3:
                en enVar = new en(this, recyclerView.getContext());
                enVar.f5712a = i10;
                w0(enVar);
                return;
            default:
                uf.y yVar = new uf.y(this, recyclerView.getContext());
                yVar.f5712a = i10;
                w0(yVar);
                return;
        }
    }

    public ej(al alVar, lh.e1 e1Var) {
        super(0, 0, e1Var);
        this.U = 2;
        this.V = alVar;
    }
}
