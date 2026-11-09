package org.telegram.ui.Components;
public final class a21 implements Runnable {
    public final int f31684a;
    public final org.telegram.messenger.v10 f31685b;
    public final String f31686c;

    public a21(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.f31684a = i7;
        this.f31685b = v10Var;
        this.f31686c = str;
    }

    @Override
    public final void run() {
        switch (this.f31684a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.f31685b;
                if (v10Var != null) {
                    v10Var.a(this.f31686c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f31685b.a(null, this.f31686c);
                return;
            default:
                this.f31685b.a(null, this.f31686c);
                return;
        }
    }
}
