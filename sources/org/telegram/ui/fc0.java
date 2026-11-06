package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f45600a;
    public final hc0 f45601b;

    public fc0(hc0 hc0Var, int i7) {
        this.f45600a = i7;
        this.f45601b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45600a) {
            case 0:
                hc0 hc0Var = this.f45601b;
                org.telegram.ui.Components.ch0 ch0Var = hc0Var.f46331e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var = hc0Var.f46328a;
                if (lb0Var != null) {
                    lb0Var.f52311f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                hc0 hc0Var2 = this.f45601b;
                int i7 = 0;
                hc0Var2.f46337x = false;
                while (true) {
                    br[] brVarArr = hc0Var2.f46328a.f52311f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.f45601b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.f46338y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.f46337x = true;
                return;
            default:
                lb0 lb0Var2 = this.f45601b.f46328a;
                int i10 = 0;
                lb0Var2.f52310e = false;
                lb0Var2.f52311f[0].requestFocus();
                while (true) {
                    br[] brVarArr2 = lb0Var2.f52311f;
                    if (i10 < brVarArr2.length) {
                        brVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
