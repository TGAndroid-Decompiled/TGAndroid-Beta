package org.telegram.ui;
public final class ke implements Runnable {
    public final int f47279a;
    public final cn f47280b;
    public final org.telegram.ui.Components.jk0 f47281c;
    public final String d;

    public ke(cn cnVar, org.telegram.ui.Components.jk0 jk0Var, String str, int i7) {
        this.f47279a = i7;
        this.f47280b = cnVar;
        this.f47281c = jk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.gc a02;
        int i7;
        int i10 = this.f47279a;
        String str = this.d;
        org.telegram.ui.Components.jk0 jk0Var = this.f47281c;
        cn cnVar = this.f47280b;
        switch (i10) {
            case 0:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131746335;
                break;
            case 1:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131743201;
                break;
            case 2:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131752553;
                break;
            default:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
