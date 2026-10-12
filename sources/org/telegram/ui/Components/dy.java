package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class dy extends s4.s {
    public final d00 Q;

    public dy(d00 d00Var) {
        super(8);
        this.Q = d00Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ci.l1 l1Var = new ci.l1(this, recyclerView.getContext(), 2);
            l1Var.f48058a = i10;
            w0(l1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
