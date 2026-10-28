package org.telegram.ui;
public final class cd implements Runnable {
    public final int f38264a;
    public final nd f38265b;

    public cd(nd ndVar, int i10) {
        this.f38264a = i10;
        this.f38265b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f38264a) {
            case 0:
                this.f38265b.i0(true);
                return;
            case 1:
                nd ndVar = this.f38265b;
                ndVar.f41757k0 = true;
                ndVar.j0();
                return;
            case 2:
                nd ndVar2 = this.f38265b;
                ndVar2.f41775y = null;
                ndVar2.E = null;
                ndVar2.m0 = null;
                ndVar2.f41760n0 = null;
                ndVar2.f41762p0 = null;
                ndVar2.f41761o0 = null;
                ndVar2.f41763q0 = 0.0d;
                ndVar2.g0(false, true);
                ndVar2.f41751f.h(null, null, ndVar2.v, null);
                ndVar2.f41759n.setAnimation(ndVar2.K);
                ndVar2.K.M(0);
                return;
            default:
                nd ndVar3 = this.f38265b;
                ndVar3.f41757k0 = true;
                if (ndVar3.f41773x.length() > 0) {
                    ndVar3.f0(ndVar3.f41773x.getText().toString());
                }
                ndVar3.j0();
                return;
        }
    }
}
