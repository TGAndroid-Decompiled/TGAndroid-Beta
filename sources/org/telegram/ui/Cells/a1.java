package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a1 extends ClickableSpan {
    public final TLRPC.User f30450a;
    public final b1 f30451b;

    public a1(b1 b1Var, TLRPC.User user) {
        this.f30451b = b1Var;
        this.f30450a = user;
    }

    @Override
    public final void onClick(View view) {
        r1 r1Var = this.f30451b.f30506a;
        m1 m1Var = r1Var.Sa;
        if (m1Var != null) {
            m1Var.A0(r1Var, this.f30450a, 0.0f, 0.0f);
        }
    }
}
