package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f32999a;
    public final ld f33000b;

    public dd(ld ldVar, int i10) {
        this.f32999a = i10;
        this.f33000b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f32999a) {
            case 0:
                ld.X(this.f33000b, view);
                return;
            case 1:
                ld ldVar = this.f33000b;
                org.telegram.ui.Components.u40 u40Var = ldVar.v;
                if (ldVar.f35437x != null) {
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
                ld ldVar2 = this.f33000b;
                if (!ldVar2.f35420j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f35408a0) {
                    ldVar2.f35408a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f33000b;
                if (!ldVar3.f35408a0) {
                    ldVar3.f35408a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
