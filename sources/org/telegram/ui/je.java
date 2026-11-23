package org.telegram.ui;
public final class je implements Runnable {
    public final int f48977a;
    public final bn f48978b;
    public final org.telegram.ui.Components.yk0 f48979c;
    public final String d;

    public je(bn bnVar, org.telegram.ui.Components.yk0 yk0Var, String str, int i7) {
        this.f48977a = i7;
        this.f48978b = bnVar;
        this.f48979c = yk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.f48977a;
        String str = this.d;
        org.telegram.ui.Components.yk0 yk0Var = this.f48979c;
        bn bnVar = this.f48978b;
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
                i7 = 2131742955;
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
                i7 = 2131743420;
                break;
        }
        org.telegram.messenger.o10.t(null, i7, b02);
    }
}
