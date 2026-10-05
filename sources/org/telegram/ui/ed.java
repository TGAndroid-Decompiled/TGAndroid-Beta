package org.telegram.ui;
public final class ed implements Runnable {
    public final int f36003a;
    public final nd f36004b;

    public ed(nd ndVar, int i10) {
        this.f36003a = i10;
        this.f36004b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f36003a) {
            case 0:
                nd ndVar = this.f36004b;
                ndVar.f38913j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f36004b;
                ndVar2.f38930x = null;
                ndVar2.f38931y = null;
                ndVar2.f38915l0 = null;
                ndVar2.m0 = null;
                ndVar2.f38918o0 = null;
                ndVar2.f38917n0 = null;
                ndVar2.f38919p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f38906e.h(null, null, ndVar2.f38923s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f36004b.g0(true);
                return;
            default:
                nd ndVar3 = this.f36004b;
                ndVar3.f38913j0 = true;
                if (ndVar3.f38928w.length() > 0) {
                    ndVar3.d0(ndVar3.f38928w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
