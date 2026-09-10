package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class qx extends s4.s {
    public final rz Q;

    public qx(rz rzVar) {
        super(8);
        this.Q = rzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            bi.t1 t1Var = new bi.t1(this, recyclerView.getContext(), 2);
            t1Var.f41760a = i10;
            w0(t1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
