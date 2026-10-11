package org.telegram.ui;

import android.view.View;
public final class dd implements View.OnClickListener {
    public final int f36985a;
    public final ld f36986b;

    public dd(ld ldVar, int i10) {
        this.f36985a = i10;
        this.f36986b = ldVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36985a) {
            case 0:
                ld.X(this.f36986b, view);
                return;
            case 1:
                ld ldVar = this.f36986b;
                org.telegram.ui.Components.n50 n50Var = ldVar.v;
                if (ldVar.f39623x != null) {
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
                ld ldVar2 = this.f36986b;
                if (!ldVar2.f39606j0) {
                    ldVar2.f0();
                    return;
                } else if (ldVar2.f39593a0) {
                    ldVar2.f39593a0 = false;
                    ldVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                ld ldVar3 = this.f36986b;
                if (!ldVar3.f39593a0) {
                    ldVar3.f39593a0 = true;
                    ldVar3.h0();
                    return;
                }
                return;
        }
    }
}
