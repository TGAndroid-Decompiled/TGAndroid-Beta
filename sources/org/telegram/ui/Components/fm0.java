package org.telegram.ui.Components;

import android.view.View;
public final class fm0 implements View.OnClickListener {
    public final kg.f f26105a;

    public fm0(kg.f fVar) {
        this.f26105a = fVar;
    }

    @Override
    public final void onClick(View view) {
        gm0 gm0Var = (gm0) this.f26105a.d;
        for (int i10 = 0; i10 < gm0Var.e.size(); i10++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) gm0Var.e.get(i10);
            if (gm0Var.H) {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).f(jjVar.F0());
            } else {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).X(jjVar.F0(), jjVar, 0, 0);
                org.telegram.messenger.b6.q(gm0Var.d).y();
            }
        }
        gm0Var.d(true);
    }
}
