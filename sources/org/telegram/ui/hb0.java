package org.telegram.ui;
public final class hb0 implements Runnable {
    public final int f37884a;
    public final yb0 f37885b;
    public final org.telegram.messenger.za f37886c;

    public hb0(yb0 yb0Var, org.telegram.messenger.za zaVar, int i10) {
        this.f37884a = i10;
        this.f37885b = yb0Var;
        this.f37886c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f37884a) {
            case 0:
                yb0 yb0Var = this.f37885b;
                org.telegram.messenger.za zaVar = this.f37886c;
                if (yb0Var.I != null && yb0Var.getParentActivity() != null) {
                    try {
                        ((bh.d) zaVar).z();
                        ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.f19025b);
                        ((bh.d) yb0Var.I).w(new jb0(yb0Var, 0));
                        yb0Var.C0 = true;
                        if (yb0Var.D0) {
                            ((bh.d) yb0Var.I).F();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                yb0 yb0Var2 = this.f37885b;
                org.telegram.messenger.za zaVar2 = this.f37886c;
                try {
                    ((bh.d) zaVar2).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new hb0(yb0Var2, zaVar2, 0));
                return;
        }
    }
}
