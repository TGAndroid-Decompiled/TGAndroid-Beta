package org.telegram.ui;
public final class ad implements Runnable {
    public final int f35626a;
    public final kd f35627b;

    public ad(kd kdVar, int i10) {
        this.f35626a = i10;
        this.f35627b = kdVar;
    }

    @Override
    public final void run() {
        switch (this.f35626a) {
            case 0:
                this.f35627b.l0(true);
                return;
            case 1:
                kd kdVar = this.f35627b;
                kdVar.f38757k0 = true;
                kdVar.m0();
                return;
            case 2:
                kd kdVar2 = this.f35627b;
                kdVar2.D = null;
                kdVar2.E = null;
                kdVar2.m0 = null;
                kdVar2.f38760n0 = null;
                kdVar2.f38762p0 = null;
                kdVar2.f38761o0 = null;
                kdVar2.f38763q0 = 0.0d;
                kdVar2.j0(false, true);
                kdVar2.f38751f.j(null, null, kdVar2.f38771w, null);
                kdVar2.f38759n.setAnimation(kdVar2.K);
                kdVar2.K.M(0);
                return;
            default:
                kd kdVar3 = this.f35627b;
                kdVar3.f38757k0 = true;
                if (kdVar3.f38775y.length() > 0) {
                    kdVar3.i0(kdVar3.f38775y.getText().toString());
                }
                kdVar3.m0();
                return;
        }
    }
}
