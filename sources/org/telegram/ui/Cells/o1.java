package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o1 extends ClickableSpan {
    public final TLRPC.User f24790a;
    public final p1 f24791b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.f24791b = p1Var;
        this.f24790a = user;
    }

    @Override
    public final void onClick(View view) {
        s1 s1Var = this.f24791b.d;
        j1 j1Var = s1Var.Fc;
        if (j1Var != null) {
            j1Var.t0(s1Var, this.f24790a, 0.0f, 0.0f);
        }
    }
}
