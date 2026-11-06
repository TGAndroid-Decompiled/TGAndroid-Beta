package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y0 extends ClickableSpan {
    public final TLRPC.User f30907a;
    public final z0 f30908b;

    public y0(z0 z0Var, TLRPC.User user) {
        this.f30908b = z0Var;
        this.f30907a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f30908b.f30942a;
        l1 l1Var = q1Var.Ra;
        if (l1Var != null) {
            l1Var.s0(q1Var, this.f30907a, 0.0f, 0.0f);
        }
    }
}
