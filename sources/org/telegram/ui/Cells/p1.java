package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p1 extends ClickableSpan {
    public final TLRPC.User f22876a;
    public final q1 f22877b;

    public p1(q1 q1Var, TLRPC.User user) {
        this.f22877b = q1Var;
        this.f22876a = user;
    }

    @Override
    public final void onClick(View view) {
        t1 t1Var = this.f22877b.d;
        k1 k1Var = t1Var.Jc;
        if (k1Var != null) {
            k1Var.u0(t1Var, this.f22876a, 0.0f, 0.0f);
        }
    }
}
