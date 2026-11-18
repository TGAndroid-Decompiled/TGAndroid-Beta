package org.telegram.ui.Components;
public final class n21 implements Runnable {
    public final int f37701a;
    public final org.telegram.messenger.q10 f37702b;
    public final String f37703c;

    public n21(String str, int i7, org.telegram.messenger.q10 q10Var) {
        this.f37701a = i7;
        this.f37702b = q10Var;
        this.f37703c = str;
    }

    @Override
    public final void run() {
        switch (this.f37701a) {
            case 0:
                org.telegram.messenger.q10 q10Var = this.f37702b;
                if (q10Var != null) {
                    q10Var.a(this.f37703c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f37702b.a(null, this.f37703c);
                return;
            case 2:
                this.f37702b.a(null, this.f37703c);
                return;
            default:
                this.f37702b.a(null, this.f37703c);
                return;
        }
    }
}
