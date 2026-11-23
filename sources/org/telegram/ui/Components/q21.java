package org.telegram.ui.Components;
public final class q21 implements Runnable {
    public final int f38762a;
    public final org.telegram.messenger.r10 f38763b;
    public final String f38764c;

    public q21(String str, int i7, org.telegram.messenger.r10 r10Var) {
        this.f38762a = i7;
        this.f38763b = r10Var;
        this.f38764c = str;
    }

    @Override
    public final void run() {
        switch (this.f38762a) {
            case 0:
                org.telegram.messenger.r10 r10Var = this.f38763b;
                if (r10Var != null) {
                    r10Var.a(this.f38764c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38763b.a(null, this.f38764c);
                return;
            case 2:
                this.f38763b.a(null, this.f38764c);
                return;
            default:
                this.f38763b.a(null, this.f38764c);
                return;
        }
    }
}
