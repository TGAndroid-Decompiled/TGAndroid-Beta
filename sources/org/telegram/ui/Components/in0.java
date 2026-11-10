package org.telegram.ui.Components;
public final class in0 implements Runnable {
    public final int f34708a;
    public final mo0 f34709b;

    public in0(mo0 mo0Var, int i7) {
        this.f34708a = i7;
        this.f34709b = mo0Var;
    }

    @Override
    public final void run() {
        switch (this.f34708a) {
            case 0:
                mo0 mo0Var = this.f34709b;
                mo0Var.f36056v2 = true;
                r00 r00Var = mo0Var.f36052t2;
                r00Var.f37446r.setText("");
                org.telegram.messenger.g0.K3(r00Var.f37446r);
                return;
            default:
                us usVar = new us(5);
                mo0 mo0Var2 = this.f34709b;
                if (mo0Var2.d) {
                    r00 r00Var2 = mo0Var2.f36052t2;
                    if (r00Var2 != null) {
                        org.telegram.messenger.g0.v1(r00Var2.f37446r);
                    }
                    org.telegram.messenger.g0.i3(usVar, 300L);
                    return;
                }
                usVar.run();
                return;
        }
    }
}
