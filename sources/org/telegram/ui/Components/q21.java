package org.telegram.ui.Components;
public final class q21 implements Runnable {
    public final int f38769a;
    public final org.telegram.messenger.q10 f38770b;
    public final String f38771c;

    public q21(String str, int i7, org.telegram.messenger.q10 q10Var) {
        this.f38769a = i7;
        this.f38770b = q10Var;
        this.f38771c = str;
    }

    @Override
    public final void run() {
        switch (this.f38769a) {
            case 0:
                org.telegram.messenger.q10 q10Var = this.f38770b;
                if (q10Var != null) {
                    q10Var.a(this.f38771c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38770b.a(null, this.f38771c);
                return;
            case 2:
                this.f38770b.a(null, this.f38771c);
                return;
            default:
                this.f38770b.a(null, this.f38771c);
                return;
        }
    }
}
