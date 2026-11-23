package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a1 extends ClickableSpan {
    public final TLRPC.User f30391a;
    public final b1 f30392b;

    public a1(b1 b1Var, TLRPC.User user) {
        this.f30392b = b1Var;
        this.f30391a = user;
    }

    @Override
    public final void onClick(View view) {
        r1 r1Var = this.f30392b.f30452a;
        m1 m1Var = r1Var.Sa;
        if (m1Var != null) {
            m1Var.u0(r1Var, this.f30391a, 0.0f, 0.0f);
        }
    }
}
