package org.telegram.ui;
public final class da0 implements Runnable {
    public final int f46901a;
    public final pa0 f46902b;
    public final org.telegram.messenger.xa f46903c;

    public da0(pa0 pa0Var, org.telegram.messenger.xa xaVar, int i7) {
        this.f46901a = i7;
        this.f46902b = pa0Var;
        this.f46903c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f46901a) {
            case 0:
                pa0 pa0Var = this.f46902b;
                org.telegram.messenger.xa xaVar = this.f46903c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) xaVar).y();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26915b);
                        ((a8.r7) pa0Var.H).t(new f3(pa0Var, 3));
                        pa0Var.f50862x0 = true;
                        if (pa0Var.f50864y0) {
                            ((a8.r7) pa0Var.H).F();
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
                pa0 pa0Var2 = this.f46902b;
                org.telegram.messenger.xa xaVar2 = this.f46903c;
                try {
                    ((a8.r7) xaVar2).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new da0(pa0Var2, xaVar2, 0));
                return;
        }
    }
}
