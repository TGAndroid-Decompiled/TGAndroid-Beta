package org.telegram.ui.Components;
public final class z11 implements Runnable {
    public final int f40836a;
    public final org.telegram.messenger.v10 f40837b;
    public final String f40838c;

    public z11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f40836a = i7;
        this.f40837b = v10Var;
        this.f40838c = str;
    }

    @Override
    public final void run() {
        switch (this.f40836a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f40837b;
                if (v10Var != null) {
                    v10Var.a(this.f40838c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f40837b.a(null, this.f40838c);
                return;
            default:
                this.f40837b.a(null, this.f40838c);
                return;
        }
    }
}
