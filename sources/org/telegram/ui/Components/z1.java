package org.telegram.ui.Components;
public final class z1 implements Runnable {
    public final int f40821a;
    public final org.telegram.ui.ActionBar.u1 f40822b;

    public z1(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f40821a = i7;
        this.f40822b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f40821a) {
            case 0:
                try {
                    this.f40822b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f40822b.dismiss();
                return;
        }
    }
}
