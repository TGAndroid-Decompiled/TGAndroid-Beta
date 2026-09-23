package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class n51 extends s4.s {
    public final int Q;
    public final z61 R;

    public n51(z61 z61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = z61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 3);
                    m1Var.f42777a = i10;
                    w0(m1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    ci.m1 m1Var2 = new ci.m1(this, recyclerView.getContext(), 5);
                    m1Var2.f42777a = i10;
                    w0(m1Var2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
