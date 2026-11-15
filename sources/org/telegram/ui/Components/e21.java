package org.telegram.ui.Components;
public final class e21 implements Runnable {
    public final int f34170a;
    public final org.telegram.messenger.s10 f34171b;
    public final String f34172c;

    public e21(String str, int i7, org.telegram.messenger.s10 s10Var) {
        this.f34170a = i7;
        this.f34171b = s10Var;
        this.f34172c = str;
    }

    @Override
    public final void run() {
        switch (this.f34170a) {
            case 0:
                org.telegram.messenger.s10 s10Var = this.f34171b;
                if (s10Var != null) {
                    s10Var.a(this.f34172c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f34171b.a(null, this.f34172c);
                return;
            default:
                this.f34171b.a(null, this.f34172c);
                return;
        }
    }
}
