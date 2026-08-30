package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p1 extends ClickableSpan {
    public final TLRPC.User f21543a;
    public final q1 f21544b;

    public p1(q1 q1Var, TLRPC.User user) {
        this.f21544b = q1Var;
        this.f21543a = user;
    }

    @Override
    public final void onClick(View view) {
        t1 t1Var = this.f21544b.d;
        k1 k1Var = t1Var.Gc;
        if (k1Var != null) {
            k1Var.y0(t1Var, this.f21543a, 0.0f, 0.0f);
        }
    }
}
