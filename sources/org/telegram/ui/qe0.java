package org.telegram.ui;
public final class qe0 implements Runnable {
    public final int f40447a;
    public final se0 f40448b;

    public qe0(se0 se0Var, int i10) {
        this.f40447a = i10;
        this.f40448b = se0Var;
    }

    @Override
    public final void run() {
        switch (this.f40447a) {
            case 0:
                se0 se0Var = this.f40448b;
                org.telegram.ui.Components.kj0 kj0Var = se0Var.f41142e;
                kj0Var.getAnimatedDrawable().L(0, false, false);
                kj0Var.d();
                wd0 wd0Var = se0Var.f41139a;
                if (wd0Var != null) {
                    wd0Var.f44011f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                se0 se0Var2 = this.f40448b;
                int i10 = 0;
                se0Var2.f41147w = false;
                while (true) {
                    cs[] csVarArr = se0Var2.f41139a.f44011f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                se0 se0Var3 = this.f40448b;
                se0Var3.postDelayed(new qe0(se0Var3, 3), 150L);
                qe0 qe0Var = se0Var3.f41148x;
                se0Var3.removeCallbacks(qe0Var);
                se0Var3.postDelayed(qe0Var, 3000L);
                se0Var3.f41147w = true;
                return;
            default:
                wd0 wd0Var2 = this.f40448b.f41139a;
                int i11 = 0;
                wd0Var2.f44010e = false;
                wd0Var2.f44011f[0].requestFocus();
                while (true) {
                    cs[] csVarArr2 = wd0Var2.f44011f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
