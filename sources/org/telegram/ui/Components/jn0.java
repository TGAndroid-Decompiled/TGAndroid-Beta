package org.telegram.ui.Components;
public final class jn0 implements Runnable {
    public final int f35099a;
    public final no0 f35100b;

    public jn0(no0 no0Var, int i7) {
        this.f35099a = i7;
        this.f35100b = no0Var;
    }

    @Override
    public final void run() {
        switch (this.f35099a) {
            case 0:
                no0 no0Var = this.f35100b;
                no0Var.f36456s2 = true;
                s00 s00Var = no0Var.f36452q2;
                s00Var.f37857r.setText("");
                org.telegram.messenger.g0.K3(s00Var.f37857r);
                return;
            default:
                vs vsVar = new vs(5);
                no0 no0Var2 = this.f35100b;
                if (no0Var2.d) {
                    s00 s00Var2 = no0Var2.f36452q2;
                    if (s00Var2 != null) {
                        org.telegram.messenger.g0.v1(s00Var2.f37857r);
                    }
                    org.telegram.messenger.g0.i3(vsVar, 300L);
                    return;
                }
                vsVar.run();
                return;
        }
    }
}
