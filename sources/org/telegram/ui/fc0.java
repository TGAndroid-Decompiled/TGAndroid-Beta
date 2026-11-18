package org.telegram.ui;
public final class fc0 implements Runnable {
    public final int f47594a;
    public final hc0 f47595b;

    public fc0(hc0 hc0Var, int i7) {
        this.f47594a = i7;
        this.f47595b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47594a) {
            case 0:
                hc0 hc0Var = this.f47595b;
                org.telegram.ui.Components.ph0 ph0Var = hc0Var.f48243e;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                mb0 mb0Var = hc0Var.f48240a;
                if (mb0Var != null) {
                    mb0Var.f46274f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                hc0 hc0Var2 = this.f47595b;
                int i7 = 0;
                hc0Var2.f48249x = false;
                while (true) {
                    er[] erVarArr = hc0Var2.f48240a.f46274f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                hc0 hc0Var3 = this.f47595b;
                hc0Var3.postDelayed(new fc0(hc0Var3, 3), 150L);
                fc0 fc0Var = hc0Var3.f48250y;
                hc0Var3.removeCallbacks(fc0Var);
                hc0Var3.postDelayed(fc0Var, 3000L);
                hc0Var3.f48249x = true;
                return;
            default:
                mb0 mb0Var2 = this.f47595b.f48240a;
                int i10 = 0;
                mb0Var2.f46273e = false;
                mb0Var2.f46274f[0].requestFocus();
                while (true) {
                    er[] erVarArr2 = mb0Var2.f46274f;
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
