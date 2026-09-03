package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o1 extends ClickableSpan {
    public final TLRPC.User f21477a;
    public final p1 f21478b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.f21478b = p1Var;
        this.f21477a = user;
    }

    @Override
    public final void onClick(View view) {
        s1 s1Var = this.f21478b.d;
        j1 j1Var = s1Var.Gc;
        if (j1Var != null) {
            j1Var.y0(s1Var, this.f21477a, 0.0f, 0.0f);
        }
    }
}
