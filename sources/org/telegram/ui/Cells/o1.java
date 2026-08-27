package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class o1 extends ClickableSpan {

    public final TLRPC.User f24770a;

    public final p1 f24771b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.f24771b = p1Var;
        this.f24770a = user;
    }

    @Override
    public final void onClick(View view) {
        s1 s1Var = this.f24771b.d;
        j1 j1Var = s1Var.Fc;
        if (j1Var != null) {
            j1Var.v0(s1Var, this.f24770a, 0.0f, 0.0f);
        }
    }
}
