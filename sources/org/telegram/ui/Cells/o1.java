package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o1 extends ClickableSpan {
    public final TLRPC.User f24578a;
    public final p1 f24579b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.f24579b = p1Var;
        this.f24578a = user;
    }

    @Override
    public final void onClick(View view) {
        s1 s1Var = this.f24579b.d;
        j1 j1Var = s1Var.Jc;
        if (j1Var != null) {
            j1Var.m0(s1Var, this.f24578a, 0.0f, 0.0f);
        }
    }
}
