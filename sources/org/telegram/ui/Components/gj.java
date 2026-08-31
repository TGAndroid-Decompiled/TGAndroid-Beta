package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gj extends rz {
    public final int U;
    public final ei V;

    public gj(ei eiVar, int i10, tl0 tl0Var, int i11) {
        super(i10, 0, tl0Var);
        this.U = i11;
        this.V = eiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int C = this.f5951n - C();
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
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.U) {
            case 0:
                fj fjVar = new fj(this, recyclerView.getContext());
                fjVar.f5805a = i10;
                w0(fjVar);
                return;
            case 1:
                yj yjVar = new yj(this, recyclerView.getContext());
                yjVar.f5805a = i10;
                w0(yjVar);
                return;
            case 2:
                tk tkVar = new tk(this, recyclerView.getContext());
                tkVar.f5805a = i10;
                w0(tkVar);
                return;
            case 3:
                hn hnVar = new hn(this, recyclerView.getContext());
                hnVar.f5805a = i10;
                w0(hnVar);
                return;
            default:
                vf.y yVar = new vf.y(this, recyclerView.getContext());
                yVar.f5805a = i10;
                w0(yVar);
                return;
        }
    }

    public gj(cl clVar, mh.d1 d1Var) {
        super(0, 0, d1Var);
        this.U = 2;
        this.V = clVar;
    }
}
