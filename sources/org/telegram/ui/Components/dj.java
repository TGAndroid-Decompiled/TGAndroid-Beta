package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dj extends bz {
    public final int U;
    public final ci V;

    public dj(ci ciVar, int i9, wk0 wk0Var, int i10) {
        super(i9, 0, wk0Var);
        this.U = i10;
        this.V = ciVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int C = this.f5573n - C();
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
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.U) {
            case 0:
                cj cjVar = new cj(this, recyclerView.getContext());
                cjVar.f5443a = i9;
                w0(cjVar);
                return;
            case 1:
                vj vjVar = new vj(this, recyclerView.getContext());
                vjVar.f5443a = i9;
                w0(vjVar);
                return;
            case 2:
                pk pkVar = new pk(this, recyclerView.getContext());
                pkVar.f5443a = i9;
                w0(pkVar);
                return;
            case 3:
                ym ymVar = new ym(this, recyclerView.getContext());
                ymVar.f5443a = i9;
                w0(ymVar);
                return;
            default:
                pf.a0 a0Var = new pf.a0(this, recyclerView.getContext());
                a0Var.f5443a = i9;
                w0(a0Var);
                return;
        }
    }

    public dj(xk xkVar, gh.f1 f1Var) {
        super(0, 0, f1Var);
        this.U = 2;
        this.V = xkVar;
    }
}
