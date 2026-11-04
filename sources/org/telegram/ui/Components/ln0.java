package org.telegram.ui.Components;
public final class ln0 implements Runnable {
    public final int f35796a;
    public final oo0 f35797b;

    public ln0(oo0 oo0Var, int i3) {
        this.f35796a = i3;
        this.f35797b = oo0Var;
    }

    @Override
    public final void run() {
        switch (this.f35796a) {
            case 0:
                oo0 oo0Var = this.f35797b;
                oo0Var.f36902t2 = true;
                n00 n00Var = oo0Var.f36898r2;
                n00Var.f36302r.setText("");
                org.telegram.messenger.g0.K3(n00Var.f36302r);
                return;
            default:
                go goVar = new go(7);
                oo0 oo0Var2 = this.f35797b;
                if (oo0Var2.d) {
                    n00 n00Var2 = oo0Var2.f36898r2;
                    if (n00Var2 != null) {
                        org.telegram.messenger.g0.v1(n00Var2.f36302r);
                    }
                    org.telegram.messenger.g0.i3(goVar, 300L);
                    return;
                }
                goVar.run();
                return;
        }
    }
}
