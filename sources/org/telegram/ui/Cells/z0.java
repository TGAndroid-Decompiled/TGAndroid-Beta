package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z0 extends ClickableSpan {
    public final TLRPC.User f32480a;
    public final a1 f32481b;

    public z0(a1 a1Var, TLRPC.User user) {
        this.f32481b = a1Var;
        this.f32480a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f32481b.f30362a;
        l1 l1Var = q1Var.Sa;
        if (l1Var != null) {
            l1Var.u0(q1Var, this.f32480a, 0.0f, 0.0f);
        }
    }
}
