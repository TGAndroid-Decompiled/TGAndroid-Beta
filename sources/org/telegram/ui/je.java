package org.telegram.ui;
public final class je implements Runnable {
    public final int f48958a;
    public final bn f48959b;
    public final org.telegram.ui.Components.wk0 f48960c;
    public final String d;

    public je(bn bnVar, org.telegram.ui.Components.wk0 wk0Var, String str, int i7) {
        this.f48958a = i7;
        this.f48959b = bnVar;
        this.f48960c = wk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.f48958a;
        String str = this.d;
        org.telegram.ui.Components.wk0 wk0Var = this.f48960c;
        bn bnVar = this.f48959b;
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
