package org.telegram.ui;
public final class cd implements Runnable {
    public final int f38426a;
    public final nd f38427b;

    public cd(nd ndVar, int i10) {
        this.f38426a = i10;
        this.f38427b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f38426a) {
            case 0:
                this.f38427b.i0(true);
                return;
            case 1:
                nd ndVar = this.f38427b;
                ndVar.f41853k0 = true;
                ndVar.j0();
                return;
            case 2:
                nd ndVar2 = this.f38427b;
                ndVar2.f41871y = null;
                ndVar2.E = null;
                ndVar2.m0 = null;
                ndVar2.f41856n0 = null;
                ndVar2.f41858p0 = null;
                ndVar2.f41857o0 = null;
                ndVar2.f41859q0 = 0.0d;
                ndVar2.g0(false, true);
                ndVar2.f41847f.h(null, null, ndVar2.v, null);
                ndVar2.f41855n.setAnimation(ndVar2.K);
                ndVar2.K.M(0);
                return;
            default:
                nd ndVar3 = this.f38427b;
                ndVar3.f41853k0 = true;
                if (ndVar3.f41869x.length() > 0) {
                    ndVar3.f0(ndVar3.f41869x.getText().toString());
                }
                ndVar3.j0();
                return;
        }
    }
}
