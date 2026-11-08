package org.telegram.ui;
public final class ba0 implements Runnable {
    public final int f44238a;
    public final pa0 f44239b;
    public final org.telegram.messenger.za f44240c;

    public ba0(pa0 pa0Var, org.telegram.messenger.za zaVar, int i7) {
        this.f44238a = i7;
        this.f44239b = pa0Var;
        this.f44240c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f44238a) {
            case 0:
                pa0 pa0Var = this.f44239b;
                org.telegram.messenger.za zaVar = this.f44240c;
                if (pa0Var.G != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25566b);
                        ((a8.r7) pa0Var.G).p(new da0(pa0Var, 0));
                        pa0Var.f48753w0 = true;
                        if (pa0Var.f48755x0) {
                            ((a8.r7) pa0Var.G).z();
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
                pa0 pa0Var2 = this.f44239b;
                org.telegram.messenger.za zaVar2 = this.f44240c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ba0(pa0Var2, zaVar2, 0));
                return;
        }
    }
}
