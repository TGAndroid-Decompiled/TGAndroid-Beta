package org.telegram.ui.Components;
public final class uk0 implements Runnable {
    public final int f40370a;
    public final wk0 f40371b;

    public uk0(wk0 wk0Var, int i7) {
        this.f40370a = i7;
        this.f40371b = wk0Var;
    }

    @Override
    public final void run() {
        switch (this.f40370a) {
            case 0:
                wk0 wk0Var = this.f40371b;
                wk0Var.getClass();
                org.telegram.messenger.g0.g3(new uk0(wk0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new uk0(this.f40371b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
