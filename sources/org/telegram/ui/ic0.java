package org.telegram.ui;
public final class ic0 implements Runnable {
    public final int f46613a;
    public final kc0 f46614b;

    public ic0(kc0 kc0Var, int i7) {
        this.f46613a = i7;
        this.f46614b = kc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46613a) {
            case 0:
                kc0 kc0Var = this.f46614b;
                org.telegram.ui.Components.ch0 ch0Var = kc0Var.f47259e;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                ob0 ob0Var = kc0Var.f47256a;
                if (ob0Var != null) {
                    ob0Var.f44118f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                kc0 kc0Var2 = this.f46614b;
                int i7 = 0;
                kc0Var2.f47265x = false;
                while (true) {
                    er[] erVarArr = kc0Var2.f47256a.f44118f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                kc0 kc0Var3 = this.f46614b;
                kc0Var3.postDelayed(new ic0(kc0Var3, 3), 150L);
                ic0 ic0Var = kc0Var3.f47266y;
                kc0Var3.removeCallbacks(ic0Var);
                kc0Var3.postDelayed(ic0Var, 3000L);
                kc0Var3.f47265x = true;
                return;
            default:
                ob0 ob0Var2 = this.f46614b.f47256a;
                int i10 = 0;
                ob0Var2.f44117e = false;
                ob0Var2.f44118f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = ob0Var2.f44118f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
