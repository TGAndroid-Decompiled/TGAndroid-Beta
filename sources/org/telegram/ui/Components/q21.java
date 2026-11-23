package org.telegram.ui.Components;
public final class q21 implements Runnable {
    public final int f38763a;
    public final org.telegram.messenger.r10 f38764b;
    public final String f38765c;

    public q21(String str, int i7, org.telegram.messenger.r10 r10Var) {
        this.f38763a = i7;
        this.f38764b = r10Var;
        this.f38765c = str;
    }

    @Override
    public final void run() {
        switch (this.f38763a) {
            case 0:
                org.telegram.messenger.r10 r10Var = this.f38764b;
                if (r10Var != null) {
                    r10Var.a(this.f38765c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38764b.a(null, this.f38765c);
                return;
            case 2:
                this.f38764b.a(null, this.f38765c);
                return;
            default:
                this.f38764b.a(null, this.f38765c);
                return;
        }
    }
}
