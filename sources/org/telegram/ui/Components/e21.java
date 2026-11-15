package org.telegram.ui.Components;
public final class e21 implements Runnable {
    public final int f34157a;
    public final org.telegram.messenger.s10 f34158b;
    public final String f34159c;

    public e21(String str, int i7, org.telegram.messenger.s10 s10Var) {
        this.f34157a = i7;
        this.f34158b = s10Var;
        this.f34159c = str;
    }

    @Override
    public final void run() {
        switch (this.f34157a) {
            case 0:
                org.telegram.messenger.s10 s10Var = this.f34158b;
                if (s10Var != null) {
                    s10Var.a(this.f34159c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f34158b.a(null, this.f34159c);
                return;
            default:
                this.f34158b.a(null, this.f34159c);
                return;
        }
    }
}
