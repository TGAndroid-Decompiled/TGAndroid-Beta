package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q1 extends ClickableSpan {
    public final TLRPC.User f22774a;
    public final r1 f22775b;

    public q1(r1 r1Var, TLRPC.User user) {
        this.f22775b = r1Var;
        this.f22774a = user;
    }

    @Override
    public final void onClick(View view) {
        u1 u1Var = this.f22775b.d;
        l1 l1Var = u1Var.Jc;
        if (l1Var != null) {
            l1Var.u0(u1Var, this.f22774a, 0.0f, 0.0f);
        }
    }
}
