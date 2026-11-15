package org.telegram.ui.Components;
public final class mn0 implements Runnable {
    public final int f37327a;
    public final po0 f37328b;

    public mn0(po0 po0Var, int i7) {
        this.f37327a = i7;
        this.f37328b = po0Var;
    }

    @Override
    public final void run() {
        switch (this.f37327a) {
            case 0:
                po0 po0Var = this.f37328b;
                po0Var.f38371w2 = true;
                v00 v00Var = po0Var.f38367u2;
                v00Var.f40202r.setText("");
                org.telegram.messenger.g0.J3(v00Var.f40202r);
                return;
            default:
                ih ihVar = new ih(9);
                po0 po0Var2 = this.f37328b;
                if (po0Var2.d) {
                    v00 v00Var2 = po0Var2.f38367u2;
                    if (v00Var2 != null) {
                        org.telegram.messenger.g0.v1(v00Var2.f40202r);
                    }
                    org.telegram.messenger.g0.i3(ihVar, 300L);
                    return;
                }
                ihVar.run();
                return;
        }
    }
}
