package org.telegram.ui;

import android.view.View;
public final class cd implements View.OnClickListener {
    public final int f36291a;
    public final kd f36292b;

    public cd(kd kdVar, int i10) {
        this.f36291a = i10;
        this.f36292b = kdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36291a) {
            case 0:
                kd.c0(this.f36292b, view);
                return;
            case 1:
                kd kdVar = this.f36292b;
                org.telegram.ui.Components.b40 b40Var = kdVar.f38836x;
                if (kdVar.D != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b40Var.n(z10, new ad(kdVar, 2), new q5(kdVar, 2), 0);
                kdVar.K.M(0);
                kdVar.K.P(43);
                kdVar.f38822n.d();
                return;
            case 2:
                kd kdVar2 = this.f36292b;
                if (!kdVar2.f38820k0) {
                    kdVar2.l0();
                    return;
                } else if (kdVar2.f38809b0) {
                    kdVar2.f38809b0 = false;
                    kdVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                kd kdVar3 = this.f36292b;
                if (!kdVar3.f38809b0) {
                    kdVar3.f38809b0 = true;
                    kdVar3.n0();
                    return;
                }
                return;
        }
    }
}
