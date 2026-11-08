package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f31667a;
    public final org.telegram.ui.ActionBar.u1 f31668b;

    public a2(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f31667a = i7;
        this.f31668b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f31667a) {
            case 0:
                try {
                    this.f31668b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f31668b.dismiss();
                return;
        }
    }
}
