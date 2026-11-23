package org.telegram.ui.Components;
public final class bv implements Runnable {
    public final int f33929a;
    public final cv f33930b;

    public bv(cv cvVar, int i7) {
        this.f33929a = i7;
        this.f33930b = cvVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33929a;
        cv cvVar = this.f33930b;
        switch (i7) {
            case 0:
                cvVar.f34307f.dismiss();
                return;
            default:
                ev evVar = cvVar.f34307f;
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
