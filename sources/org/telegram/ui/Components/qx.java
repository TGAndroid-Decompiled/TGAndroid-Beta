package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class qx extends s4.t {
    public final sz Q;

    public qx(sz szVar) {
        super(8);
        this.Q = szVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        try {
            fi.k1 k1Var = new fi.k1(this, recyclerView.getContext(), 2);
            k1Var.f47677a = i10;
            w0(k1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
