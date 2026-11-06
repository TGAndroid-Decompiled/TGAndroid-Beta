package org.telegram.ui;
public final class ke implements Runnable {
    public final int f47174a;
    public final an f47175b;
    public final org.telegram.ui.Components.jk0 f47176c;
    public final String d;

    public ke(an anVar, org.telegram.ui.Components.jk0 jk0Var, String str, int i7) {
        this.f47174a = i7;
        this.f47175b = anVar;
        this.f47176c = jk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hc a02;
        int i7;
        int i10 = this.f47174a;
        String str = this.d;
        org.telegram.ui.Components.jk0 jk0Var = this.f47176c;
        an anVar = this.f47175b;
        switch (i10) {
            case 0:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131746334;
                break;
            case 1:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131743202;
                break;
            case 2:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131752553;
                break;
            default:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131743666;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
