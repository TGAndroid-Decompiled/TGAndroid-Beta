package org.telegram.ui;
public final class je implements Runnable {
    public final int f48973a;
    public final bn f48974b;
    public final org.telegram.ui.Components.yk0 f48975c;
    public final String d;

    public je(bn bnVar, org.telegram.ui.Components.yk0 yk0Var, String str, int i7) {
        this.f48973a = i7;
        this.f48974b = bnVar;
        this.f48975c = yk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.f48973a;
        String str = this.d;
        org.telegram.ui.Components.yk0 yk0Var = this.f48975c;
        bn bnVar = this.f48974b;
        switch (i10) {
            case 0:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131746139;
                break;
            case 1:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131742957;
                break;
            case 2:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131752541;
                break;
            default:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131743422;
                break;
        }
        org.telegram.messenger.n10.t(null, i7, b02);
    }
}
