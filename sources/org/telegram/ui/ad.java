package org.telegram.ui;

import android.view.View;

public final class ad implements View.OnClickListener {

    public final int f36510a;

    public final id f36511b;

    public ad(id idVar, int i10) {
        this.f36510a = i10;
        this.f36511b = idVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36510a) {
            case 0:
                id.X(this.f36511b, view);
                break;
            case 1:
                id idVar = this.f36511b;
                idVar.v.o(idVar.f39056x != null, new zc(idVar, 1), new s5(idVar, 2), 0);
                idVar.F.K(0);
                idVar.F.N(43);
                idVar.h.d();
                break;
            case 2:
                id idVar2 = this.f36511b;
                if (!idVar2.f39039f0) {
                    idVar2.f0();
                    break;
                } else if (idVar2.W) {
                    idVar2.W = false;
                    idVar2.h0();
                    break;
                }
                break;
            default:
                id idVar3 = this.f36511b;
                if (!idVar3.W) {
                    idVar3.W = true;
                    idVar3.h0();
                    break;
                }
                break;
        }
    }
}
