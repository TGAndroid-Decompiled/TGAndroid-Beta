package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f45537a;
    public final hc0 f45538b;

    public fc0(hc0 hc0Var, int i7) {
        this.f45537a = i7;
        this.f45538b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45537a) {
            case 0:
                hc0 hc0Var = this.f45538b;
                org.telegram.ui.Components.ch0 ch0Var = hc0Var.f46336e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var = hc0Var.f46333a;
                if (lb0Var != null) {
                    lb0Var.f52289f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                hc0 hc0Var2 = this.f45538b;
                int i7 = 0;
                hc0Var2.f46342x = false;
                while (true) {
                    br[] brVarArr = hc0Var2.f46333a.f52289f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.f45538b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.f46343y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.f46342x = true;
                return;
            default:
                lb0 lb0Var2 = this.f45538b.f46333a;
                int i10 = 0;
                lb0Var2.f52288e = false;
                lb0Var2.f52289f[0].requestFocus();
                while (true) {
                    br[] brVarArr2 = lb0Var2.f52289f;
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
