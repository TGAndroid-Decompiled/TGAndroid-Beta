package org.telegram.ui.Components;
public final class i2 implements Runnable {
    public final int f36027a;
    public final org.telegram.ui.ActionBar.u1 f36028b;

    public i2(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f36027a = i7;
        this.f36028b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f36027a) {
            case 0:
                try {
                    this.f36028b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f36028b.dismiss();
                return;
        }
    }
}
