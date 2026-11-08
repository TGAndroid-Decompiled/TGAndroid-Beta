package org.telegram.ui.Components;
public final class z11 implements Runnable {
    public final int f40855a;
    public final org.telegram.messenger.v10 f40856b;
    public final String f40857c;

    public z11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f40855a = i7;
        this.f40856b = v10Var;
        this.f40857c = str;
    }

    @Override
    public final void run() {
        switch (this.f40855a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f40856b;
                if (v10Var != null) {
                    v10Var.a(this.f40857c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f40856b.a(null, this.f40857c);
                return;
            default:
                this.f40856b.a(null, this.f40857c);
                return;
        }
    }
}
