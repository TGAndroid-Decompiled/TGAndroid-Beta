package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class px extends s4.s {
    public final rz Q;

    public px(rz rzVar) {
        super(8);
        this.Q = rzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            ei.l1 l1Var = new ei.l1(this, recyclerView.getContext(), 2);
            l1Var.f46483a = i10;
            w0(l1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
