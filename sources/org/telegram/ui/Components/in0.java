package org.telegram.ui.Components;
public final class in0 implements Runnable {
    public final int f34738a;
    public final mo0 f34739b;

    public in0(mo0 mo0Var, int i7) {
        this.f34738a = i7;
        this.f34739b = mo0Var;
    }

    @Override
    public final void run() {
        switch (this.f34738a) {
            case 0:
                mo0 mo0Var = this.f34739b;
                mo0Var.f36080s2 = true;
                r00 r00Var = mo0Var.f36076q2;
                r00Var.f37557r.setText("");
                org.telegram.messenger.g0.K3(r00Var.f37557r);
                return;
            default:
                l10 l10Var = new l10(3);
                mo0 mo0Var2 = this.f34739b;
                if (mo0Var2.d) {
                    r00 r00Var2 = mo0Var2.f36076q2;
                    if (r00Var2 != null) {
                        org.telegram.messenger.g0.v1(r00Var2.f37557r);
                    }
                    org.telegram.messenger.g0.i3(l10Var, 300L);
                    return;
                }
                l10Var.run();
                return;
        }
    }
}
