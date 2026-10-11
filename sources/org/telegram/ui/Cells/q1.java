package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q1 extends ClickableSpan {
    public final TLRPC.User f22705a;
    public final r1 f22706b;

    public q1(r1 r1Var, TLRPC.User user) {
        this.f22706b = r1Var;
        this.f22705a = user;
    }

    @Override
    public final void onClick(View view) {
        u1 u1Var = this.f22706b.d;
        l1 l1Var = u1Var.Jc;
        if (l1Var != null) {
            l1Var.A0(u1Var, this.f22705a, 0.0f, 0.0f);
        }
    }
}
