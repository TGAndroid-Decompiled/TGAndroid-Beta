package org.telegram.ui.Components;
public final class p21 implements Runnable {
    public final int f38372a;
    public final org.telegram.messenger.p10 f38373b;
    public final String f38374c;

    public p21(String str, int i7, org.telegram.messenger.p10 p10Var) {
        this.f38372a = i7;
        this.f38373b = p10Var;
        this.f38374c = str;
    }

    @Override
    public final void run() {
        switch (this.f38372a) {
            case 0:
                org.telegram.messenger.p10 p10Var = this.f38373b;
                if (p10Var != null) {
                    p10Var.a(this.f38374c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38373b.a(null, this.f38374c);
                return;
            case 2:
                this.f38373b.a(null, this.f38374c);
                return;
            default:
                this.f38373b.a(null, this.f38374c);
                return;
        }
    }
}
