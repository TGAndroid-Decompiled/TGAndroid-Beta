package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class ex extends f2.w {
    public final fz Q;

    public ex(fz fzVar) {
        super(8);
        this.Q = fzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        try {
            nh.k1 k1Var2 = new nh.k1(this, recyclerView.getContext(), 2);
            k1Var2.f6373a = i10;
            w0(k1Var2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
