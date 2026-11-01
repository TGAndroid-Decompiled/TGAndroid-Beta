package org.telegram.ui.Components;
public final class zu implements Runnable {
    public final int f33225a;
    public final av f33226b;

    public zu(av avVar, int i10) {
        this.f33225a = i10;
        this.f33226b = avVar;
    }

    @Override
    public final void run() {
        int i10 = this.f33225a;
        av avVar = this.f33226b;
        switch (i10) {
            case 0:
                avVar.f24577f.dismiss();
                return;
            default:
                cv cvVar = avVar.f24577f;
                cvVar.dismiss();
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25243j1;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    org.telegram.messenger.m5.o(null, 2131754435, cc.a0(k2Var), null);
                    return;
                }
                return;
        }
    }
}
