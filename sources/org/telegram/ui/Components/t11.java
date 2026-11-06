package org.telegram.ui.Components;
public final class t11 implements Runnable {
    public final int f38229a;
    public final org.telegram.messenger.v10 f38230b;
    public final String f38231c;

    public t11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f38229a = i7;
        this.f38230b = v10Var;
        this.f38231c = str;
    }

    @Override
    public final void run() {
        switch (this.f38229a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f38230b;
                if (v10Var != null) {
                    v10Var.a(this.f38231c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38230b.a(null, this.f38231c);
                return;
            default:
                this.f38230b.a(null, this.f38231c);
                return;
        }
    }
}
