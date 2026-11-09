package org.telegram.ui;
public final class ke implements Runnable {
    public final int f47274a;
    public final cn f47275b;
    public final org.telegram.ui.Components.kk0 f47276c;
    public final String d;

    public ke(cn cnVar, org.telegram.ui.Components.kk0 kk0Var, String str, int i7) {
        this.f47274a = i7;
        this.f47275b = cnVar;
        this.f47276c = kk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hc a02;
        int i7;
        int i10 = this.f47274a;
        String str = this.d;
        org.telegram.ui.Components.kk0 kk0Var = this.f47276c;
        cn cnVar = this.f47275b;
        switch (i10) {
            case 0:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131746335;
                break;
            case 1:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131743201;
                break;
            case 2:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131752553;
                break;
            default:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
