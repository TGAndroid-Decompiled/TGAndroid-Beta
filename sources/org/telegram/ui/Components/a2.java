package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f31650a;
    public final org.telegram.ui.ActionBar.u1 f31651b;

    public a2(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f31650a = i7;
        this.f31651b = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f31650a) {
            case 0:
                try {
                    this.f31651b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f31651b.dismiss();
                return;
        }
    }
}
