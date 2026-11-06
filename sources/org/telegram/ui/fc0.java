package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f45599a;
    public final hc0 f45600b;

    public fc0(hc0 hc0Var, int i7) {
        this.f45599a = i7;
        this.f45600b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45599a) {
            case 0:
                hc0 hc0Var = this.f45600b;
                org.telegram.ui.Components.ch0 ch0Var = hc0Var.f46330e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var = hc0Var.f46327a;
                if (lb0Var != null) {
                    lb0Var.f52309f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                hc0 hc0Var2 = this.f45600b;
                int i7 = 0;
                hc0Var2.f46336x = false;
                while (true) {
                    br[] brVarArr = hc0Var2.f46327a.f52309f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.f45600b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.f46337y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.f46336x = true;
                return;
            default:
                lb0 lb0Var2 = this.f45600b.f46327a;
                int i10 = 0;
                lb0Var2.f52308e = false;
                lb0Var2.f52309f[0].requestFocus();
                while (true) {
                    br[] brVarArr2 = lb0Var2.f52309f;
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
