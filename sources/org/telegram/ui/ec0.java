package org.telegram.ui;
public final class ec0 implements Runnable {
    public final int f47203a;
    public final gc0 f47204b;

    public ec0(gc0 gc0Var, int i7) {
        this.f47203a = i7;
        this.f47204b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47203a) {
            case 0:
                gc0 gc0Var = this.f47204b;
                org.telegram.ui.Components.ph0 ph0Var = gc0Var.f48036e;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                lb0 lb0Var = gc0Var.f48033a;
                if (lb0Var != null) {
                    lb0Var.f46283f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                gc0 gc0Var2 = this.f47204b;
                int i7 = 0;
                gc0Var2.f48042x = false;
                while (true) {
                    er[] erVarArr = gc0Var2.f48033a.f46283f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                gc0 gc0Var3 = this.f47204b;
                gc0Var3.postDelayed(new ec0(gc0Var3, 3), 150L);
                ec0 ec0Var = gc0Var3.f48043y;
                gc0Var3.removeCallbacks(ec0Var);
                gc0Var3.postDelayed(ec0Var, 3000L);
                gc0Var3.f48042x = true;
                return;
            default:
                lb0 lb0Var2 = this.f47204b.f48033a;
                int i10 = 0;
                lb0Var2.f46282e = false;
                lb0Var2.f46283f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = lb0Var2.f46283f;
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
