package org.telegram.ui.Components;
public final class u11 implements Runnable {
    public final int f38611a;
    public final org.telegram.messenger.n10 f38612b;
    public final String f38613c;

    public u11(String str, int i3, org.telegram.messenger.n10 n10Var) {
        this.f38611a = i3;
        this.f38612b = n10Var;
        this.f38613c = str;
    }

    @Override
    public final void run() {
        switch (this.f38611a) {
            case 0:
                org.telegram.messenger.n10 n10Var = this.f38612b;
                if (n10Var != null) {
                    n10Var.a(this.f38613c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f38612b.a(null, this.f38613c);
                return;
            default:
                this.f38612b.a(null, this.f38613c);
                return;
        }
    }
}
