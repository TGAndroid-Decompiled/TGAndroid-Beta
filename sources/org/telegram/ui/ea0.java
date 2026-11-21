package org.telegram.ui;
public final class ea0 implements Runnable {
    public final int f47211a;
    public final qa0 f47212b;
    public final org.telegram.messenger.xa f47213c;

    public ea0(qa0 qa0Var, org.telegram.messenger.xa xaVar, int i7) {
        this.f47211a = i7;
        this.f47212b = qa0Var;
        this.f47213c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f47211a) {
            case 0:
                qa0 qa0Var = this.f47212b;
                org.telegram.messenger.xa xaVar = this.f47213c;
                if (qa0Var.H != null && qa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) xaVar).y();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26941b);
                        ((a8.r7) qa0Var.H).t(new f3(qa0Var, 3));
                        qa0Var.f51184x0 = true;
                        if (qa0Var.f51186y0) {
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
                qa0 qa0Var2 = this.f47212b;
                org.telegram.messenger.xa xaVar2 = this.f47213c;
                try {
                    ((a8.r7) xaVar2).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new ea0(qa0Var2, xaVar2, 0));
                return;
        }
    }
}
