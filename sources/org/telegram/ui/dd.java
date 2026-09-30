package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f33157a;
    public final ld f33158b;

    public dd(ld ldVar, int i10) {
        this.f33157a = i10;
        this.f33158b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33157a) {
            case 0:
                ld.X(this.f33158b, view);
                return;
            case 1:
                ld ldVar = this.f33158b;
                org.telegram.ui.Components.y40 y40Var = ldVar.v;
                if (ldVar.f35420x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y40Var.o(z10, new cd(ldVar, 1), new r5(ldVar, 2), 0);
                ldVar.J.M(0);
                ldVar.J.P(43);
                ldVar.h.d();
                return;
            case 2:
                ld ldVar2 = this.f33158b;
                if (!ldVar2.f35403j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f35391a0) {
                    ldVar2.f35391a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f33158b;
                if (!ldVar3.f35391a0) {
                    ldVar3.f35391a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
