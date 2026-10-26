package org.telegram.ui;
public final class cd implements Runnable {
    public final int f38429a;
    public final nd f38430b;

    public cd(nd ndVar, int i10) {
        this.f38429a = i10;
        this.f38430b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f38429a) {
            case 0:
                this.f38430b.i0(true);
                return;
            case 1:
                nd ndVar = this.f38430b;
                ndVar.f41856k0 = true;
                ndVar.j0();
                return;
            case 2:
                nd ndVar2 = this.f38430b;
                ndVar2.f41874y = null;
                ndVar2.E = null;
                ndVar2.m0 = null;
                ndVar2.f41859n0 = null;
                ndVar2.f41861p0 = null;
                ndVar2.f41860o0 = null;
                ndVar2.f41862q0 = 0.0d;
                ndVar2.g0(false, true);
                ndVar2.f41850f.h(null, null, ndVar2.v, null);
                ndVar2.f41858n.setAnimation(ndVar2.K);
                ndVar2.K.M(0);
                return;
            default:
                nd ndVar3 = this.f38430b;
                ndVar3.f41856k0 = true;
                if (ndVar3.f41872x.length() > 0) {
                    ndVar3.f0(ndVar3.f41872x.getText().toString());
                }
                ndVar3.j0();
                return;
        }
    }
}
