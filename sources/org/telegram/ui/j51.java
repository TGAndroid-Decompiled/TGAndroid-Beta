package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class j51 extends f2.w {
    public final int Q;
    public final w61 R;

    public j51(w61 w61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = w61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.fx fxVar = new org.telegram.ui.Components.fx(this, recyclerView.getContext(), 2);
                    fxVar.f5805a = i10;
                    w0(fxVar);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                try {
                    org.telegram.ui.Components.fx fxVar2 = new org.telegram.ui.Components.fx(this, recyclerView.getContext(), 4);
                    fxVar2.f5805a = i10;
                    w0(fxVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
