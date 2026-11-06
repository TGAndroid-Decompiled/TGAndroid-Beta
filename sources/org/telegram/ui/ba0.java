package org.telegram.ui;
public final class ba0 implements Runnable {
    public final int f44218a;
    public final pa0 f44219b;
    public final org.telegram.messenger.za f44220c;

    public ba0(pa0 pa0Var, org.telegram.messenger.za zaVar, int i7) {
        this.f44218a = i7;
        this.f44219b = pa0Var;
        this.f44220c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f44218a) {
            case 0:
                pa0 pa0Var = this.f44219b;
                org.telegram.messenger.za zaVar = this.f44220c;
                if (pa0Var.G != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25555b);
                        ((a8.r7) pa0Var.G).p(new da0(pa0Var, 0));
                        pa0Var.f48764w0 = true;
                        if (pa0Var.f48766x0) {
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
                pa0 pa0Var2 = this.f44219b;
                org.telegram.messenger.za zaVar2 = this.f44220c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ba0(pa0Var2, zaVar2, 0));
                return;
        }
    }
}
