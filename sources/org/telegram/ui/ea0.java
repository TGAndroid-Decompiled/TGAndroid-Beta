package org.telegram.ui;
public final class ea0 implements Runnable {
    public final int f47184a;
    public final qa0 f47185b;
    public final org.telegram.messenger.ya f47186c;

    public ea0(qa0 qa0Var, org.telegram.messenger.ya yaVar, int i7) {
        this.f47184a = i7;
        this.f47185b = qa0Var;
        this.f47186c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f47184a) {
            case 0:
                qa0 qa0Var = this.f47185b;
                org.telegram.messenger.ya yaVar = this.f47186c;
                if (qa0Var.H != null && qa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) yaVar).y();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26895b);
                        ((a8.r7) qa0Var.H).t(new f3(qa0Var, 3));
                        qa0Var.f51119x0 = true;
                        if (qa0Var.f51121y0) {
                            ((a8.r7) qa0Var.H).F();
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
                qa0 qa0Var2 = this.f47185b;
                org.telegram.messenger.ya yaVar2 = this.f47186c;
                try {
                    ((a8.r7) yaVar2).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new ea0(qa0Var2, yaVar2, 0));
                return;
        }
    }
}
