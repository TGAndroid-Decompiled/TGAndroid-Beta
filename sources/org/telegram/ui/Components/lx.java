package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class lx extends s4.s {
    public final kz Q;

    public lx(kz kzVar) {
        super(8);
        this.Q = kzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            di.m1 m1Var = new di.m1(this, recyclerView.getContext(), 2);
            m1Var.f45934a = i10;
            w0(m1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
