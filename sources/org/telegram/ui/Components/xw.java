package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class xw extends f2.y {
    public final wy Q;

    public xw(wy wyVar) {
        super(8);
        this.Q = wyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        try {
            kh.n1 n1Var2 = new kh.n1(this, recyclerView.getContext(), 2);
            n1Var2.f5443a = i9;
            w0(n1Var2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
