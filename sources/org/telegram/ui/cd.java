package org.telegram.ui;

import android.view.View;
public final class cd implements View.OnClickListener {
    public final int f36441a;
    public final kd f36442b;

    public cd(kd kdVar, int i10) {
        this.f36441a = i10;
        this.f36442b = kdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36441a) {
            case 0:
                kd.b0(this.f36442b, view);
                return;
            case 1:
                kd kdVar = this.f36442b;
                org.telegram.ui.Components.b40 b40Var = kdVar.f38773x;
                if (kdVar.D != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b40Var.n(z10, new ad(kdVar, 2), new q5(kdVar, 2), 0);
                kdVar.K.M(0);
                kdVar.K.P(43);
                kdVar.f38759n.d();
                return;
            case 2:
                kd kdVar2 = this.f36442b;
                if (!kdVar2.f38757k0) {
                    kdVar2.k0();
                    return;
                } else if (kdVar2.f38746b0) {
                    kdVar2.f38746b0 = false;
                    kdVar2.m0();
                    return;
                } else {
                    return;
                }
            default:
                kd kdVar3 = this.f36442b;
                if (!kdVar3.f38746b0) {
                    kdVar3.f38746b0 = true;
                    kdVar3.m0();
                    return;
                }
                return;
        }
    }
}
