package org.telegram.ui;
public final class ca0 implements Runnable {
    public final int f46062a;
    public final pa0 f46063b;
    public final org.telegram.messenger.ya f46064c;

    public ca0(pa0 pa0Var, org.telegram.messenger.ya yaVar, int i7) {
        this.f46062a = i7;
        this.f46063b = pa0Var;
        this.f46064c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f46062a) {
            case 0:
                pa0 pa0Var = this.f46063b;
                org.telegram.messenger.ya yaVar = this.f46064c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) yaVar).w();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26600b);
                        ((a8.r7) pa0Var.H).p(new ea0(pa0Var, 0));
                        pa0Var.f50224x0 = true;
                        if (pa0Var.f50226y0) {
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
                pa0 pa0Var2 = this.f46063b;
                org.telegram.messenger.ya yaVar2 = this.f46064c;
                try {
                    ((a8.r7) yaVar2).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ca0(pa0Var2, yaVar2, 0));
                return;
        }
    }
}
