package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f39338a;
    public final nd f39339b;

    public fd(nd ndVar, int i10) {
        this.f39338a = i10;
        this.f39339b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f39338a) {
            case 0:
                nd.Y(this.f39339b, view);
                return;
            case 1:
                nd ndVar = this.f39339b;
                org.telegram.ui.Components.g50 g50Var = ndVar.f41867w;
                if (ndVar.f41871y != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g50Var.n(z10, new cd(ndVar, 2), new u5(ndVar, 2), 0);
                ndVar.K.M(0);
                ndVar.K.P(43);
                ndVar.f41855n.d();
                return;
            case 2:
                nd ndVar2 = this.f39339b;
                if (!ndVar2.f41853k0) {
                    ndVar2.h0();
                    return;
                } else if (ndVar2.f41842b0) {
                    ndVar2.f41842b0 = false;
                    ndVar2.j0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f39339b;
                if (!ndVar3.f41842b0) {
                    ndVar3.f41842b0 = true;
                    ndVar3.j0();
                    return;
                }
                return;
        }
    }
}
