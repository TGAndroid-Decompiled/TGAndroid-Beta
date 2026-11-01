package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f37441a;
    public final xb0 f37442b;
    public final org.telegram.messenger.ab f37443c;

    public gb0(xb0 xb0Var, org.telegram.messenger.ab abVar, int i10) {
        this.f37441a = i10;
        this.f37442b = xb0Var;
        this.f37443c = abVar;
    }

    @Override
    public final void run() {
        switch (this.f37441a) {
            case 0:
                xb0 xb0Var = this.f37442b;
                org.telegram.messenger.ab abVar = this.f37443c;
                if (xb0Var.I != null && xb0Var.getParentActivity() != null) {
                    try {
                        ((bh.d) abVar).z();
                        ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.f18945b);
                        ((bh.d) xb0Var.I).w(new ib0(xb0Var, 0));
                        xb0Var.C0 = true;
                        if (xb0Var.D0) {
                            ((bh.d) xb0Var.I).F();
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
                xb0 xb0Var2 = this.f37442b;
                org.telegram.messenger.ab abVar2 = this.f37443c;
                try {
                    ((bh.d) abVar2).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new gb0(xb0Var2, abVar2, 0));
                return;
        }
    }
}
