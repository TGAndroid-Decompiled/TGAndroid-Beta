package org.telegram.ui;
public final class ca0 implements Runnable {
    public final int f46051a;
    public final pa0 f46052b;
    public final org.telegram.messenger.ya f46053c;

    public ca0(pa0 pa0Var, org.telegram.messenger.ya yaVar, int i7) {
        this.f46051a = i7;
        this.f46052b = pa0Var;
        this.f46053c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f46051a) {
            case 0:
                pa0 pa0Var = this.f46052b;
                org.telegram.messenger.ya yaVar = this.f46053c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) yaVar).w();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26609b);
                        ((a8.r7) pa0Var.H).p(new ea0(pa0Var, 0));
                        pa0Var.f50201x0 = true;
                        if (pa0Var.f50203y0) {
                            ((a8.r7) pa0Var.H).z();
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
                pa0 pa0Var2 = this.f46052b;
                org.telegram.messenger.ya yaVar2 = this.f46053c;
                try {
                    ((a8.r7) yaVar2).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ca0(pa0Var2, yaVar2, 0));
                return;
        }
    }
}
