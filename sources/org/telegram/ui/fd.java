package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f39329a;
    public final nd f39330b;

    public fd(nd ndVar, int i10) {
        this.f39329a = i10;
        this.f39330b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f39329a) {
            case 0:
                nd.Y(this.f39330b, view);
                return;
            case 1:
                nd ndVar = this.f39330b;
                org.telegram.ui.Components.g50 g50Var = ndVar.f41771w;
                if (ndVar.f41775y != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g50Var.n(z10, new cd(ndVar, 2), new u5(ndVar, 2), 0);
                ndVar.K.M(0);
                ndVar.K.P(43);
                ndVar.f41759n.d();
                return;
            case 2:
                nd ndVar2 = this.f39330b;
                if (!ndVar2.f41757k0) {
                    ndVar2.h0();
                    return;
                } else if (ndVar2.f41746b0) {
                    ndVar2.f41746b0 = false;
                    ndVar2.j0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f39330b;
                if (!ndVar3.f41746b0) {
                    ndVar3.f41746b0 = true;
                    ndVar3.j0();
                    return;
                }
                return;
        }
    }
}
