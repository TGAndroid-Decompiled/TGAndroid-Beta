package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class ay extends s4.s {
    public final b00 Q;

    public ay(b00 b00Var) {
        super(8);
        this.Q = b00Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ci.l1 l1Var = new ci.l1(this, recyclerView.getContext(), 2);
            l1Var.f47871a = i10;
            w0(l1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
