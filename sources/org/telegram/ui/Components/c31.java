package org.telegram.ui.Components;
public final class c31 implements Runnable {
    public final int f24994a;
    public final org.telegram.messenger.k20 f24995b;
    public final String f24996c;

    public c31(String str, int i10, org.telegram.messenger.k20 k20Var) {
        this.f24994a = i10;
        this.f24995b = k20Var;
        this.f24996c = str;
    }

    @Override
    public final void run() {
        switch (this.f24994a) {
            case 0:
                org.telegram.messenger.k20 k20Var = this.f24995b;
                if (k20Var != null) {
                    k20Var.a(this.f24996c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f24995b.a(null, this.f24996c);
                return;
            default:
                this.f24995b.a(null, this.f24996c);
                return;
        }
    }
}
