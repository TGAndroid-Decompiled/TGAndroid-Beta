package org.telegram.ui.Components;
public final class h0 implements Runnable {
    public final int f34249a;
    public final org.telegram.ui.ActionBar.s2 f34250b;

    public h0(org.telegram.ui.ActionBar.s2 s2Var, int i3) {
        this.f34249a = i3;
        this.f34250b = s2Var;
    }

    @Override
    public final void run() {
        switch (this.f34249a) {
            case 0:
                this.f34250b.invalidateSelf();
                return;
            default:
                org.telegram.ui.ActionBar.s2 s2Var = this.f34250b;
                ((u5) s2Var.d).e(true, 0.0f);
                s2Var.invalidateSelf();
                return;
        }
    }
}
