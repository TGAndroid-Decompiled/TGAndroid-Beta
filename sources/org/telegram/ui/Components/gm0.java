package org.telegram.ui.Components;

import android.view.View;
public final class gm0 implements View.OnClickListener {
    public final kg.f f26498a;

    public gm0(kg.f fVar) {
        this.f26498a = fVar;
    }

    @Override
    public final void onClick(View view) {
        hm0 hm0Var = (hm0) this.f26498a.d;
        for (int i10 = 0; i10 < hm0Var.e.size(); i10++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) hm0Var.e.get(i10);
            if (hm0Var.H) {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.f15506s0).f15043a).f(kjVar.F0());
            } else {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.f15506s0).f15043a).X(kjVar.F0(), kjVar, 0, 0);
                org.telegram.messenger.b6.q(hm0Var.d).y();
            }
        }
        hm0Var.d(true);
    }
}
