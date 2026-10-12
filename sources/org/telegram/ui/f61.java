package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class f61 extends s4.s {
    public final int Q;
    public final r71 R;

    public f61(r71 r71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = r71Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    di.l1 l1Var = new di.l1(this, recyclerView.getContext(), 3);
                    l1Var.f44979a = i10;
                    w0(l1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    di.l1 l1Var2 = new di.l1(this, recyclerView.getContext(), 5);
                    l1Var2.f44979a = i10;
                    w0(l1Var2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
