package org.telegram.ui.Components;
public final class b31 implements Runnable {
    public final int f24519a;
    public final org.telegram.messenger.j20 f24520b;
    public final String f24521c;

    public b31(String str, int i10, org.telegram.messenger.j20 j20Var) {
        this.f24519a = i10;
        this.f24520b = j20Var;
        this.f24521c = str;
    }

    @Override
    public final void run() {
        switch (this.f24519a) {
            case 0:
                org.telegram.messenger.j20 j20Var = this.f24520b;
                if (j20Var != null) {
                    j20Var.a(this.f24521c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f24520b.a(null, this.f24521c);
                return;
            default:
                this.f24520b.a(null, this.f24521c);
                return;
        }
    }
}
