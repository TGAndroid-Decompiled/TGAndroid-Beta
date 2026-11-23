package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f47667a;
    public final hc0 f47668b;

    public fc0(hc0 hc0Var, int i7) {
        this.f47667a = i7;
        this.f47668b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47667a) {
            case 0:
                hc0 hc0Var = this.f47668b;
                org.telegram.ui.Components.rh0 rh0Var = hc0Var.f48321e;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                mb0 mb0Var = hc0Var.f48318a;
                if (mb0Var != null) {
                    mb0Var.f46301f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                hc0 hc0Var2 = this.f47668b;
                int i7 = 0;
                hc0Var2.f48327x = false;
                while (true) {
                    er[] erVarArr = hc0Var2.f48318a.f46301f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.f47668b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.f48328y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.f48327x = true;
                return;
            default:
                mb0 mb0Var2 = this.f47668b.f48318a;
                int i10 = 0;
                mb0Var2.f46300e = false;
                mb0Var2.f46301f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = mb0Var2.f46301f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
