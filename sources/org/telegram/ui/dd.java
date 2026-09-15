package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f32992a;
    public final ld f32993b;

    public dd(ld ldVar, int i10) {
        this.f32992a = i10;
        this.f32993b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f32992a) {
            case 0:
                ld.X(this.f32993b, view);
                return;
            case 1:
                ld ldVar = this.f32993b;
                org.telegram.ui.Components.u40 u40Var = ldVar.v;
                if (ldVar.f35466x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u40Var.o(z10, new cd(ldVar, 1), new r5(ldVar, 2), 0);
                ldVar.J.M(0);
                ldVar.J.P(43);
                ldVar.h.d();
                return;
            case 2:
                ld ldVar2 = this.f32993b;
                if (!ldVar2.f35449j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f35437a0) {
                    ldVar2.f35437a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f32993b;
                if (!ldVar3.f35437a0) {
                    ldVar3.f35437a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
