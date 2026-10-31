package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x0 extends ClickableSpan {
    public final TLRPC.User f23453a;
    public final y0 f23454b;

    public x0(y0 y0Var, TLRPC.User user) {
        this.f23454b = y0Var;
        this.f23453a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f23454b.f23607a;
        l1 l1Var = q1Var.Qa;
        if (l1Var != null) {
            l1Var.r0(q1Var, this.f23453a, 0.0f, 0.0f);
        }
    }
}
