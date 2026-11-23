package org.telegram.ui;
public final class da0 implements Runnable {
    public final int f47018a;
    public final pa0 f47019b;
    public final org.telegram.messenger.xa f47020c;

    public da0(pa0 pa0Var, org.telegram.messenger.xa xaVar, int i7) {
        this.f47018a = i7;
        this.f47019b = pa0Var;
        this.f47020c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f47018a) {
            case 0:
                pa0 pa0Var = this.f47019b;
                org.telegram.messenger.xa xaVar = this.f47020c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) xaVar).B();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f27013b);
                        ((a8.r7) pa0Var.H).x(new f3(pa0Var, 3));
                        pa0Var.f50950x0 = true;
                        if (pa0Var.f50952y0) {
                            ((a8.r7) pa0Var.H).E();
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
                pa0 pa0Var2 = this.f47019b;
                org.telegram.messenger.xa xaVar2 = this.f47020c;
                try {
                    ((a8.r7) xaVar2).B();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new da0(pa0Var2, xaVar2, 0));
                return;
        }
    }
}
