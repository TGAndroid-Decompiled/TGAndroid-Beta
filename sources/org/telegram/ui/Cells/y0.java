package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y0 extends ClickableSpan {
    public final TLRPC.User f30917a;
    public final z0 f30918b;

    public y0(z0 z0Var, TLRPC.User user) {
        this.f30918b = z0Var;
        this.f30917a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f30918b.f30952a;
        l1 l1Var = q1Var.Ra;
        if (l1Var != null) {
            l1Var.s0(q1Var, this.f30917a, 0.0f, 0.0f);
        }
    }
}
