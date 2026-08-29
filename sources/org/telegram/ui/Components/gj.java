package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gj extends kz {
    public final int U;
    public final fi V;

    public gj(fi fiVar, int i10, jl0 jl0Var, int i11) {
        super(i10, 0, jl0Var);
        this.U = i11;
        this.V = fiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int C = this.f6507n - C();
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
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.U) {
            case 0:
                fj fjVar = new fj(this, recyclerView.getContext());
                fjVar.f6373a = i10;
                w0(fjVar);
                return;
            case 1:
                yj yjVar = new yj(this, recyclerView.getContext());
                yjVar.f6373a = i10;
                w0(yjVar);
                return;
            case 2:
                tk tkVar = new tk(this, recyclerView.getContext());
                tkVar.f6373a = i10;
                w0(tkVar);
                return;
            case 3:
                dn dnVar = new dn(this, recyclerView.getContext());
                dnVar.f6373a = i10;
                w0(dnVar);
                return;
            default:
                sf.z zVar = new sf.z(this, recyclerView.getContext());
                zVar.f6373a = i10;
                w0(zVar);
                return;
        }
    }

    public gj(bl blVar, jh.e1 e1Var) {
        super(0, 0, e1Var);
        this.U = 2;
        this.V = blVar;
    }
}
