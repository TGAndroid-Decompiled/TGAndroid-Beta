package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

public final class o41 extends f2.x {
    public final int Q;
    public final a61 R;

    public o41(a61 a61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = a61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    lh.l1 l1Var2 = new lh.l1(this, recyclerView.getContext(), 3);
                    l1Var2.f5731a = i10;
                    w0(l1Var2);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
            default:
                try {
                    lh.l1 l1Var3 = new lh.l1(this, recyclerView.getContext(), 5);
                    l1Var3.f5731a = i10;
                    w0(l1Var3);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
        }
    }
}
