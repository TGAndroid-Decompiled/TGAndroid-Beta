package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class o41 extends s4.s {
    public final int Q;
    public final a61 R;

    public o41(a61 a61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = a61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ei.l1 l1Var = new ei.l1(this, recyclerView.getContext(), 3);
                    l1Var.f46483a = i10;
                    w0(l1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    ei.l1 l1Var2 = new ei.l1(this, recyclerView.getContext(), 5);
                    l1Var2.f46483a = i10;
                    w0(l1Var2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
