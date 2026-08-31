package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class lx extends f2.w {
    public final mz Q;

    public lx(mz mzVar) {
        super(8);
        this.Q = mzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        try {
            fx fxVar = new fx(this, recyclerView.getContext(), 1);
            fxVar.f5805a = i10;
            w0(fxVar);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
