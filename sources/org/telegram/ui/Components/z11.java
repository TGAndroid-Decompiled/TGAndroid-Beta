package org.telegram.ui.Components;
public final class z11 implements Runnable {
    public final int f40826a;
    public final org.telegram.messenger.v10 f40827b;
    public final String f40828c;

    public z11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f40826a = i7;
        this.f40827b = v10Var;
        this.f40828c = str;
    }

    @Override
    public final void run() {
        switch (this.f40826a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f40827b;
                if (v10Var != null) {
                    v10Var.a(this.f40828c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f40827b.a(null, this.f40828c);
                return;
            default:
                this.f40827b.a(null, this.f40828c);
                return;
        }
    }
}
