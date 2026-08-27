package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

public final class xw extends f2.x {
    public final yy Q;

    public xw(yy yyVar) {
        super(8);
        this.Q = yyVar;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        try {
            lh.l1 l1Var2 = new lh.l1(this, recyclerView.getContext(), 2);
            l1Var2.f5731a = i10;
            w0(l1Var2);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
