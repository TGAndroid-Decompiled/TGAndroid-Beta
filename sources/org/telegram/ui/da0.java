package org.telegram.ui;
public final class da0 implements Runnable {
    public final int f44900a;
    public final ra0 f44901b;
    public final org.telegram.messenger.za f44902c;

    public da0(ra0 ra0Var, org.telegram.messenger.za zaVar, int i7) {
        this.f44900a = i7;
        this.f44901b = ra0Var;
        this.f44902c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f44900a) {
            case 0:
                ra0 ra0Var = this.f44901b;
                org.telegram.messenger.za zaVar = this.f44902c;
                if (ra0Var.G != null && ra0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25566b);
                        ((a8.r7) ra0Var.G).p(new fa0(ra0Var, 0));
                        ra0Var.f49388w0 = true;
                        if (ra0Var.f49390x0) {
                            ((a8.r7) ra0Var.G).z();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                ra0 ra0Var2 = this.f44901b;
                org.telegram.messenger.za zaVar2 = this.f44902c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new da0(ra0Var2, zaVar2, 0));
                return;
        }
    }
}
