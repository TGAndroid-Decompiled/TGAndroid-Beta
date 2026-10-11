package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f37019a;
    public final ld f37020b;

    public dd(ld ldVar, int i10) {
        this.f37019a = i10;
        this.f37020b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37019a) {
            case 0:
                ld.X(this.f37020b, view);
                return;
            case 1:
                ld ldVar = this.f37020b;
                org.telegram.ui.Components.n50 n50Var = ldVar.v;
                if (ldVar.f39657x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n50Var.n(z10, new cd(ldVar, 1), new q5(ldVar, 2), 0);
                ldVar.J.M(0);
                ldVar.J.P(43);
                ldVar.h.d();
                return;
            case 2:
                ld ldVar2 = this.f37020b;
                if (!ldVar2.f39640j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f39627a0) {
                    ldVar2.f39627a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f37020b;
                if (!ldVar3.f39627a0) {
                    ldVar3.f39627a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
