package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class nx extends s4.s {
    public final nz Q;

    public nx(nz nzVar) {
        super(8);
        this.Q = nzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 2);
            m1Var.f46706a = i10;
            w0(m1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
