package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class jx extends f2.w {
    public final kz Q;

    public jx(kz kzVar) {
        super(8);
        this.Q = kzVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        try {
            dx dxVar = new dx(this, recyclerView.getContext(), 1);
            dxVar.f5712a = i10;
            w0(dxVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
