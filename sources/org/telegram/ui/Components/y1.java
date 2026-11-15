package org.telegram.ui.Components;
public final class y1 implements Runnable {
    public final int f41839a;
    public final org.telegram.ui.ActionBar.t1 f41840b;

    public y1(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f41839a = i7;
        this.f41840b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f41839a) {
            case 0:
                try {
                    this.f41840b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f41840b.dismiss();
                return;
        }
    }
}
