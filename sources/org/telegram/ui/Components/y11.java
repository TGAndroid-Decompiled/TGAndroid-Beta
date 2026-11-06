package org.telegram.ui.Components;
public final class y11 implements Runnable {
    public final int f40491a;
    public final org.telegram.messenger.v10 f40492b;
    public final String f40493c;

    public y11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f40491a = i7;
        this.f40492b = v10Var;
        this.f40493c = str;
    }

    @Override
    public final void run() {
        switch (this.f40491a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f40492b;
                if (v10Var != null) {
                    v10Var.a(this.f40493c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f40492b.a(null, this.f40493c);
                return;
            default:
                this.f40492b.a(null, this.f40493c);
                return;
        }
    }
}
