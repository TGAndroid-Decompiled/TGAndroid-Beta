package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f24263a;
    public final org.telegram.ui.ActionBar.x1 f24264b;

    public a2(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f24263a = i10;
        this.f24264b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f24263a) {
            case 0:
                try {
                    this.f24264b.dismiss();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                this.f24264b.dismiss();
                return;
        }
    }
}
