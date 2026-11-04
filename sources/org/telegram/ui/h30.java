package org.telegram.ui;
public final class h30 implements Runnable {
    public final int f45793a;
    public final i30 f45794b;

    public h30(i30 i30Var, int i3) {
        this.f45793a = i3;
        this.f45794b = i30Var;
    }

    @Override
    public final void run() {
        switch (this.f45793a) {
            case 0:
                i30 i30Var = this.f45794b;
                org.telegram.ui.Components.voip.r0 r0Var = i30Var.f46045b;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new h30(i30Var, 2), 16L);
                return;
            case 1:
                org.telegram.ui.Components.voip.r0 r0Var2 = this.f45794b.f46045b;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
