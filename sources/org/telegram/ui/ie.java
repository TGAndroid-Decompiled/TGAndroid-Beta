package org.telegram.ui;
public final class ie implements Runnable {
    public final int f46253a;
    public final wm f46254b;
    public final org.telegram.ui.Components.nk0 f46255c;
    public final String d;

    public ie(wm wmVar, org.telegram.ui.Components.nk0 nk0Var, String str, int i3) {
        this.f46253a = i3;
        this.f46254b = wmVar;
        this.f46255c = nk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fc a02;
        int i3;
        int i10 = this.f46253a;
        String str = this.d;
        org.telegram.ui.Components.nk0 nk0Var = this.f46255c;
        wm wmVar = this.f46254b;
        switch (i10) {
            case 0:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131746343;
                break;
            case 1:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131743211;
                break;
            case 2:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131752553;
                break;
            default:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131743675;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i3, a02);
    }
}
