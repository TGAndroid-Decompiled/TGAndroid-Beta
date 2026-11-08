package org.telegram.ui.Components;
public final class in0 implements Runnable {
    public final int f34775a;
    public final mo0 f34776b;

    public in0(mo0 mo0Var, int i7) {
        this.f34775a = i7;
        this.f34776b = mo0Var;
    }

    @Override
    public final void run() {
        switch (this.f34775a) {
            case 0:
                mo0 mo0Var = this.f34776b;
                mo0Var.f36062s2 = true;
                s00 s00Var = mo0Var.f36058q2;
                s00Var.f37824r.setText("");
                org.telegram.messenger.g0.K3(s00Var.f37824r);
                return;
            default:
                vs vsVar = new vs(5);
                mo0 mo0Var2 = this.f34776b;
                if (mo0Var2.d) {
                    s00 s00Var2 = mo0Var2.f36058q2;
                    if (s00Var2 != null) {
                        org.telegram.messenger.g0.v1(s00Var2.f37824r);
                    }
                    org.telegram.messenger.g0.i3(vsVar, 300L);
                    return;
                }
                vsVar.run();
                return;
        }
    }
}
