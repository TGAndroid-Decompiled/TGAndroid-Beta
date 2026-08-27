package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class zi extends dz {
    public final int U;
    public final yh V;

    public zi(yh yhVar, int i10, zk0 zk0Var, int i11) {
        super(i10, 0, zk0Var);
        this.U = i11;
        this.V = yhVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int iC = this.f5863n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int iHeight = rect.height() + top;
                int iMin = Math.min(0, top);
                int iMax = Math.max(0, iHeight - iC);
                if (iMin == 0) {
                    iMin = Math.min(top, iMax);
                }
                return new int[]{0, iMin};
            default:
                return super.t(view, rect);
        }
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.U) {
            case 0:
                yi yiVar = new yi(this, recyclerView.getContext());
                yiVar.f5731a = i10;
                w0(yiVar);
                break;
            case 1:
                rj rjVar = new rj(this, recyclerView.getContext());
                rjVar.f5731a = i10;
                w0(rjVar);
                break;
            case 2:
                lk lkVar = new lk(this, recyclerView.getContext());
                lkVar.f5731a = i10;
                w0(lkVar);
                break;
            case 3:
                wm wmVar = new wm(this, recyclerView.getContext());
                wmVar.f5731a = i10;
                w0(wmVar);
                break;
            default:
                qf.a0 a0Var = new qf.a0(this, recyclerView.getContext());
                a0Var.f5731a = i10;
                w0(a0Var);
                break;
        }
    }

    public zi(tk tkVar, hh.f1 f1Var) {
        super(0, 0, f1Var);
        this.U = 2;
        this.V = tkVar;
    }
}
