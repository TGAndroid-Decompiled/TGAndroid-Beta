package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class j51 extends f2.w {
    public final int Q;
    public final x61 R;

    public j51(x61 x61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = x61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.dx dxVar = new org.telegram.ui.Components.dx(this, recyclerView.getContext(), 2);
                    dxVar.f5712a = i10;
                    w0(dxVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    org.telegram.ui.Components.dx dxVar2 = new org.telegram.ui.Components.dx(this, recyclerView.getContext(), 4);
                    dxVar2.f5712a = i10;
                    w0(dxVar2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
