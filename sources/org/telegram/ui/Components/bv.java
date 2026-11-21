package org.telegram.ui.Components;
public final class bv implements Runnable {
    public final int f33936a;
    public final cv f33937b;

    public bv(cv cvVar, int i7) {
        this.f33936a = i7;
        this.f33937b = cvVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33936a;
        cv cvVar = this.f33937b;
        switch (i7) {
            case 0:
                cvVar.f34313f.dismiss();
                return;
            default:
                ev evVar = cvVar.f34313f;
                evVar.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754432, lc.b0(g2Var), null);
                    return;
                }
                return;
        }
    }
}
