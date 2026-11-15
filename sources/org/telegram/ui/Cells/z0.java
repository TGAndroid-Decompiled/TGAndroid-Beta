package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z0 extends ClickableSpan {
    public final TLRPC.User f32092a;
    public final a1 f32093b;

    public z0(a1 a1Var, TLRPC.User user) {
        this.f32093b = a1Var;
        this.f32092a = user;
    }

    @Override
    public final void onClick(View view) {
        q1 q1Var = this.f32093b.f29985a;
        l1 l1Var = q1Var.Sa;
        if (l1Var != null) {
            l1Var.u0(q1Var, this.f32092a, 0.0f, 0.0f);
        }
    }
}
