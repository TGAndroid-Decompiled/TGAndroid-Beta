package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cf0 implements Runnable {
    public final int f32702a;
    public final df0 f32703b;

    public cf0(df0 df0Var, int i10) {
        this.f32702a = i10;
        this.f32703b = df0Var;
    }

    @Override
    public final void run() {
        switch (this.f32702a) {
            case 0:
                df0 df0Var = this.f32703b;
                ef0 ef0Var = df0Var.d;
                if (df0Var.f32955b) {
                    boolean z10 = ef0Var.K;
                    org.telegram.ui.Components.kj0 kj0Var = ef0Var.J;
                    kd kdVar = ef0Var.f33253n;
                    if (z10 && System.currentTimeMillis() - df0Var.f32954a >= 10000) {
                        kdVar.setAnimation(kj0Var);
                        kj0Var.N(0, false, false);
                        kj0Var.f25770t0 = new cf0(df0Var, 1);
                        kdVar.d();
                        df0Var.f32954a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(df0Var.f32956c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cf0(this.f32703b, 2));
                return;
            default:
                ef0 ef0Var2 = this.f32703b.d;
                org.telegram.ui.Components.kj0 kj0Var2 = ef0Var2.I;
                kj0Var2.N(0, false, false);
                ef0Var2.f33253n.setAnimation(kj0Var2);
                return;
        }
    }
}
