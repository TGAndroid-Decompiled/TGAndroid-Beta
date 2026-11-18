package org.telegram.ui;
public final class je implements Runnable {
    public final int f48948a;
    public final bn f48949b;
    public final org.telegram.ui.Components.wk0 f48950c;
    public final String d;

    public je(bn bnVar, org.telegram.ui.Components.wk0 wk0Var, String str, int i7) {
        this.f48948a = i7;
        this.f48949b = bnVar;
        this.f48950c = wk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.f48948a;
        String str = this.d;
        org.telegram.ui.Components.wk0 wk0Var = this.f48950c;
        bn bnVar = this.f48949b;
        switch (i10) {
            case 0:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131746140;
                break;
            case 1:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131742963;
                break;
            case 2:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131752542;
                break;
            default:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131743428;
                break;
        }
        org.telegram.messenger.n10.t(null, i7, b02);
    }
}
