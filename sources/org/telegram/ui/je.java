package org.telegram.ui;
public final class je implements Runnable {
    public final int f49100a;
    public final bn f49101b;
    public final org.telegram.ui.Components.yk0 f49102c;
    public final String d;

    public je(bn bnVar, org.telegram.ui.Components.yk0 yk0Var, String str, int i7) {
        this.f49100a = i7;
        this.f49101b = bnVar;
        this.f49102c = yk0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.kc b02;
        int i7;
        int i10 = this.f49100a;
        String str = this.d;
        org.telegram.ui.Components.yk0 yk0Var = this.f49102c;
        bn bnVar = this.f49101b;
        switch (i10) {
            case 0:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131746139;
                break;
            case 1:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131742950;
                break;
            case 2:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131752541;
                break;
            default:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131743418;
                break;
        }
        org.telegram.messenger.m10.t(null, i7, b02);
    }
}
