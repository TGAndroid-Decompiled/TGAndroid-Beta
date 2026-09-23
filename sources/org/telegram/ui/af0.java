package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class af0 implements Runnable {
    public final int f31780a;
    public final bf0 f31781b;

    public af0(bf0 bf0Var, int i10) {
        this.f31780a = i10;
        this.f31781b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f31780a) {
            case 0:
                bf0 bf0Var = this.f31781b;
                cf0 cf0Var = bf0Var.d;
                if (bf0Var.f32101b) {
                    boolean z10 = cf0Var.K;
                    org.telegram.ui.Components.yi0 yi0Var = cf0Var.J;
                    id idVar = cf0Var.f32333n;
                    if (z10 && System.currentTimeMillis() - bf0Var.f32100a >= 10000) {
                        idVar.setAnimation(yi0Var);
                        yi0Var.N(0, false, false);
                        yi0Var.f30282t0 = new af0(bf0Var, 1);
                        idVar.d();
                        bf0Var.f32100a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(bf0Var.f32102c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new af0(this.f31781b, 2));
                return;
            default:
                cf0 cf0Var2 = this.f31781b.d;
                org.telegram.ui.Components.yi0 yi0Var2 = cf0Var2.I;
                yi0Var2.N(0, false, false);
                cf0Var2.f32333n.setAnimation(yi0Var2);
                return;
        }
    }
}
