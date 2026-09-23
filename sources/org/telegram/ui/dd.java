package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f32578a;
    public final ld f32579b;

    public dd(ld ldVar, int i10) {
        this.f32578a = i10;
        this.f32579b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f32578a) {
            case 0:
                ld.X(this.f32579b, view);
                return;
            case 1:
                ld ldVar = this.f32579b;
                org.telegram.ui.Components.v40 v40Var = ldVar.v;
                if (ldVar.f34945x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v40Var.o(z10, new cd(ldVar, 1), new s5(ldVar, 2), 0);
                ldVar.J.M(0);
                ldVar.J.P(43);
                ldVar.h.d();
                return;
            case 2:
                ld ldVar2 = this.f32579b;
                if (!ldVar2.f34928j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f34916a0) {
                    ldVar2.f34916a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f32579b;
                if (!ldVar3.f34916a0) {
                    ldVar3.f34916a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
