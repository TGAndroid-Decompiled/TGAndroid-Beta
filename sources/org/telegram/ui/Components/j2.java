package org.telegram.ui.Components;
public final class j2 implements Runnable {
    public final int f36358a;
    public final org.telegram.ui.ActionBar.t1 f36359b;

    public j2(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f36358a = i7;
        this.f36359b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f36358a) {
            case 0:
                try {
                    this.f36359b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f36359b.dismiss();
                return;
        }
    }
}
