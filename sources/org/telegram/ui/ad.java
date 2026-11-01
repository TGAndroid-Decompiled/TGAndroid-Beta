package org.telegram.ui;
public final class ad implements Runnable {
    public final int f35751a;
    public final kd f35752b;

    public ad(kd kdVar, int i10) {
        this.f35751a = i10;
        this.f35752b = kdVar;
    }

    @Override
    public final void run() {
        switch (this.f35751a) {
            case 0:
                this.f35752b.m0(true);
                return;
            case 1:
                kd kdVar = this.f35752b;
                kdVar.f38820k0 = true;
                kdVar.n0();
                return;
            case 2:
                kd kdVar2 = this.f35752b;
                kdVar2.D = null;
                kdVar2.E = null;
                kdVar2.m0 = null;
                kdVar2.f38823n0 = null;
                kdVar2.f38825p0 = null;
                kdVar2.f38824o0 = null;
                kdVar2.f38826q0 = 0.0d;
                kdVar2.k0(false, true);
                kdVar2.f38814f.j(null, null, kdVar2.f38834w, null);
                kdVar2.f38822n.setAnimation(kdVar2.K);
                kdVar2.K.M(0);
                return;
            default:
                kd kdVar3 = this.f35752b;
                kdVar3.f38820k0 = true;
                if (kdVar3.f38838y.length() > 0) {
                    kdVar3.j0(kdVar3.f38838y.getText().toString());
                }
                kdVar3.n0();
                return;
        }
    }
}
