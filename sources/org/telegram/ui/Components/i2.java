package org.telegram.ui.Components;
public final class i2 implements Runnable {
    public final int f35867a;
    public final org.telegram.ui.ActionBar.t1 f35868b;

    public i2(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f35867a = i7;
        this.f35868b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f35867a) {
            case 0:
                try {
                    this.f35868b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f35868b.dismiss();
                return;
        }
    }
}
