package org.telegram.ui;
public final class aa0 implements Runnable {
    public final int f45552a;
    public final qa0 f45553b;

    public aa0(qa0 qa0Var, int i7) {
        this.f45552a = i7;
        this.f45553b = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f45552a) {
            case 0:
                qa0.b0(this.f45553b);
                return;
            case 1:
                qa0 qa0Var = this.f45553b;
                org.telegram.messenger.sa saVar = qa0Var.G;
                if (saVar != null) {
                    qa0Var.F.h(saVar);
                    qa0Var.G = null;
                    return;
                }
                return;
            case 2:
                qa0.a0(this.f45553b);
                return;
            case 3:
                qa0 qa0Var2 = this.f45553b;
                qa0Var2.getLocationController().o(0, qa0Var2.m0, true);
                qa0Var2.f51185y = false;
                return;
            case 4:
                qa0 qa0Var3 = this.f45553b;
                org.telegram.messenger.da daVar = qa0Var3.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), qa0Var3.t0());
                }
                if (!qa0Var3.O.getRadiusSet()) {
                    double d = qa0Var3.M;
                    if (d > 0.0d) {
                        qa0Var3.L.e1(d);
                    } else {
                        k8.a aVar = qa0Var3.L;
                        if (aVar != null) {
                            aVar.b1();
                            qa0Var3.L = null;
                        }
                    }
                }
                qa0Var3.O = null;
                return;
            case 5:
                this.f45553b.D0();
                return;
            case 6:
                this.f45553b.D0();
                return;
            default:
                org.telegram.messenger.g0.g3(new aa0(this.f45553b, 1));
                return;
        }
    }
}
