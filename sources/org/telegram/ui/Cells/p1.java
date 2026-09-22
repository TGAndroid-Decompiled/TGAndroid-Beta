package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p1 extends ClickableSpan {
    public final TLRPC.User f20576a;
    public final q1 f20577b;

    public p1(q1 q1Var, TLRPC.User user) {
        this.f20577b = q1Var;
        this.f20576a = user;
    }

    @Override
    public final void onClick(View view) {
        t1 t1Var = this.f20577b.d;
        k1 k1Var = t1Var.Jc;
        if (k1Var != null) {
            k1Var.t0(t1Var, this.f20576a, 0.0f, 0.0f);
        }
    }
}
