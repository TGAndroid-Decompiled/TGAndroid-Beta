package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x0 extends ClickableSpan {
    public final TLRPC.User f23454a;
    public final y0 f23455b;

    public x0(y0 y0Var, TLRPC.User user) {
        this.f23455b = y0Var;
        this.f23454a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f23455b.f23608a;
        l1 l1Var = q1Var.Qa;
        if (l1Var != null) {
            l1Var.r0(q1Var, this.f23454a, 0.0f, 0.0f);
        }
    }
}
