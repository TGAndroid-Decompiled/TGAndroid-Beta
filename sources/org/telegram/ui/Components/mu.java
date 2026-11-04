package org.telegram.ui.Components;
public final class mu implements Runnable {
    public final int f36252a;
    public final nu f36253b;

    public mu(nu nuVar, int i3) {
        this.f36252a = i3;
        this.f36253b = nuVar;
    }

    @Override
    public final void run() {
        int i3 = this.f36252a;
        nu nuVar = this.f36253b;
        switch (i3) {
            case 0:
                nuVar.f36625f.dismiss();
                return;
            default:
                pu puVar = nuVar.f36625f;
                puVar.dismiss();
                org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                if (d2Var != null && d2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, fc.a0(d2Var), null);
                    return;
                }
                return;
        }
    }
}
