package org.telegram.ui;
public final class ea0 implements Runnable {
    public final int f45219a;
    public final sa0 f45220b;
    public final org.telegram.messenger.za f45221c;

    public ea0(sa0 sa0Var, org.telegram.messenger.za zaVar, int i7) {
        this.f45219a = i7;
        this.f45220b = sa0Var;
        this.f45221c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f45219a) {
            case 0:
                sa0 sa0Var = this.f45220b;
                org.telegram.messenger.za zaVar = this.f45221c;
                if (sa0Var.G != null && sa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25570b);
                        ((a8.r7) sa0Var.G).p(new ga0(sa0Var, 0));
                        sa0Var.f49797w0 = true;
                        if (sa0Var.f49799x0) {
                            ((a8.r7) sa0Var.G).z();
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
                sa0 sa0Var2 = this.f45220b;
                org.telegram.messenger.za zaVar2 = this.f45221c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ea0(sa0Var2, zaVar2, 0));
                return;
        }
    }
}
