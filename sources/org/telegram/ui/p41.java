package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class p41 extends f2.y {
    public final int Q;
    public final b61 R;

    public p41(b61 b61Var, int i9) {
        super(40);
        this.Q = i9;
        this.R = b61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.Q) {
            case 0:
                try {
                    kh.n1 n1Var2 = new kh.n1(this, recyclerView.getContext(), 3);
                    n1Var2.f5443a = i9;
                    w0(n1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                try {
                    kh.n1 n1Var3 = new kh.n1(this, recyclerView.getContext(), 5);
                    n1Var3.f5443a = i9;
                    w0(n1Var3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
