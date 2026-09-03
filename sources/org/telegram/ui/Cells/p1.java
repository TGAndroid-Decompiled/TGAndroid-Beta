package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p1 extends ClickableSpan {
    public final TLRPC.User f23329a;
    public final q1 f23330b;

    public p1(q1 q1Var, TLRPC.User user) {
        this.f23330b = q1Var;
        this.f23329a = user;
    }

    @Override
    public final void onClick(View view) {
        t1 t1Var = this.f23330b.d;
        k1 k1Var = t1Var.Gc;
        if (k1Var != null) {
            k1Var.x0(t1Var, this.f23329a, 0.0f, 0.0f);
        }
    }
}
