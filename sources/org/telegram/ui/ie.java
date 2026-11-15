package org.telegram.ui;
public final class ie implements Runnable {
    public final int f48026a;
    public final an f48027b;
    public final org.telegram.ui.Components.ok0 f48028c;
    public final String d;

    public ie(an anVar, org.telegram.ui.Components.ok0 ok0Var, String str, int i7) {
        this.f48026a = i7;
        this.f48027b = anVar;
        this.f48028c = ok0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i7;
        int i10 = this.f48026a;
        String str = this.d;
        org.telegram.ui.Components.ok0 ok0Var = this.f48028c;
        an anVar = this.f48027b;
        switch (i10) {
            case 0:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131746335;
                break;
            case 1:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131743201;
                break;
            case 2:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131752553;
                break;
            default:
                ok0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.cc.a0(anVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.i20.s(null, i7, a02);
    }
}
