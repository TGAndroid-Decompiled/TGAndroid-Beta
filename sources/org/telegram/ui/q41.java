package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class q41 extends s4.t {
    public final int Q;
    public final c61 R;

    public q41(c61 c61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = c61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    fi.k1 k1Var = new fi.k1(this, recyclerView.getContext(), 3);
                    k1Var.f47680a = i10;
                    w0(k1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    fi.k1 k1Var2 = new fi.k1(this, recyclerView.getContext(), 5);
                    k1Var2.f47680a = i10;
                    w0(k1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
