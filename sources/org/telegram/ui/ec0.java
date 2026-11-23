package org.telegram.ui;
public final class ec0 implements Runnable {
    public final int f47501a;
    public final gc0 f47502b;

    public ec0(gc0 gc0Var, int i7) {
        this.f47501a = i7;
        this.f47502b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47501a) {
            case 0:
                gc0 gc0Var = this.f47502b;
                org.telegram.ui.Components.qh0 qh0Var = gc0Var.f48226e;
                qh0Var.getAnimatedDrawable().N(0, false, false);
                qh0Var.d();
                lb0 lb0Var = gc0Var.f48223a;
                if (lb0Var != null) {
                    lb0Var.f46491f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                gc0 gc0Var2 = this.f47502b;
                int i7 = 0;
                gc0Var2.f48232x = false;
                while (true) {
                    er[] erVarArr = gc0Var2.f48223a.f46491f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                gc0 gc0Var3 = this.f47502b;
                gc0Var3.postDelayed(new ec0(gc0Var3, 3), 150L);
                ec0 ec0Var = gc0Var3.f48233y;
                gc0Var3.removeCallbacks(ec0Var);
                gc0Var3.postDelayed(ec0Var, 3000L);
                gc0Var3.f48232x = true;
                return;
            default:
                lb0 lb0Var2 = this.f47502b.f48223a;
                int i10 = 0;
                lb0Var2.f46490e = false;
                lb0Var2.f46491f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = lb0Var2.f46491f;
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
