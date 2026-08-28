package org.telegram.ui;

import android.view.View;
public final class ad implements View.OnClickListener {
    public final int f36454a;
    public final id f36455b;

    public ad(id idVar, int i9) {
        this.f36454a = i9;
        this.f36455b = idVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36454a) {
            case 0:
                id.W(this.f36455b, view);
                return;
            case 1:
                id idVar = this.f36455b;
                org.telegram.ui.Components.e40 e40Var = idVar.v;
                if (idVar.f39128x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e40Var.o(z10, new zc(idVar, 1), new r5(idVar, 2), 0);
                idVar.F.K(0);
                idVar.F.N(43);
                idVar.h.d();
                return;
            case 2:
                id idVar2 = this.f36455b;
                if (!idVar2.f39111f0) {
                    idVar2.e0();
                    return;
                } else if (idVar2.W) {
                    idVar2.W = false;
                    idVar2.g0();
                    return;
                } else {
                    return;
                }
            default:
                id idVar3 = this.f36455b;
                if (!idVar3.W) {
                    idVar3.W = true;
                    idVar3.g0();
                    return;
                }
                return;
        }
    }
}
