package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q1 extends ClickableSpan {
    public final TLRPC.User f20834a;
    public final r1 f20835b;

    public q1(r1 r1Var, TLRPC.User user) {
        this.f20835b = r1Var;
        this.f20834a = user;
    }

    @Override
    public final void onClick(View view) {
        u1 u1Var = this.f20835b.d;
        l1 l1Var = u1Var.Jc;
        if (l1Var != null) {
            l1Var.t0(u1Var, this.f20834a, 0.0f, 0.0f);
        }
    }
}
