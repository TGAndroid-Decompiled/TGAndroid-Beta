package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class vx extends s4.s {
    public final wz Q;

    public vx(wz wzVar) {
        super(8);
        this.Q = wzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            di.l1 l1Var = new di.l1(this, recyclerView.getContext(), 2);
            l1Var.f44979a = i10;
            w0(l1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
