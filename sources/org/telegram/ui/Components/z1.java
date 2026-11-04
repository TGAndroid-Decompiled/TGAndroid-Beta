package org.telegram.ui.Components;
public final class z1 implements Runnable {
    public final int f40889a;
    public final org.telegram.ui.ActionBar.s1 f40890b;

    public z1(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f40889a = i3;
        this.f40890b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f40889a) {
            case 0:
                try {
                    this.f40890b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f40890b.dismiss();
                return;
        }
    }
}
