package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f24269a;
    public final org.telegram.ui.ActionBar.x1 f24270b;

    public a2(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f24269a = i10;
        this.f24270b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f24269a) {
            case 0:
                try {
                    this.f24270b.dismiss();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                this.f24270b.dismiss();
                return;
        }
    }
}
