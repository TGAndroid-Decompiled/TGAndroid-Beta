package org.telegram.ui.Components;
public final class q21 implements Runnable {
    public final int f38716a;
    public final org.telegram.messenger.r10 f38717b;
    public final String f38718c;

    public q21(String str, int i7, org.telegram.messenger.r10 r10Var) {
        this.f38716a = i7;
        this.f38717b = r10Var;
        this.f38718c = str;
    }

    @Override
    public final void run() {
        switch (this.f38716a) {
            case 0:
                org.telegram.messenger.r10 r10Var = this.f38717b;
                if (r10Var != null) {
                    r10Var.a(this.f38718c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38717b.a(null, this.f38718c);
                return;
            case 2:
                this.f38717b.a(null, this.f38718c);
                return;
            default:
                this.f38717b.a(null, this.f38718c);
                return;
        }
    }
}
