package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o1 extends ClickableSpan {
    public final TLRPC.User f24576a;
    public final p1 f24577b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.f24577b = p1Var;
        this.f24576a = user;
    }

    @Override
    public final void onClick(View view) {
        s1 s1Var = this.f24577b.d;
        j1 j1Var = s1Var.Jc;
        if (j1Var != null) {
            j1Var.m0(s1Var, this.f24576a, 0.0f, 0.0f);
        }
    }
}
