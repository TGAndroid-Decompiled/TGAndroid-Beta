package org.telegram.ui;
public final class ld0 implements Runnable {
    public final int f39195a;
    public final nd0 f39196b;

    public ld0(nd0 nd0Var, int i10) {
        this.f39195a = i10;
        this.f39196b = nd0Var;
    }

    @Override
    public final void run() {
        switch (this.f39195a) {
            case 0:
                nd0 nd0Var = this.f39196b;
                org.telegram.ui.Components.fi0 fi0Var = nd0Var.e;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                tc0 tc0Var = nd0Var.f39859a;
                if (tc0Var != null) {
                    tc0Var.f44045f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                nd0 nd0Var2 = this.f39196b;
                int i10 = 0;
                nd0Var2.f39867x = false;
                while (true) {
                    bs[] bsVarArr = nd0Var2.f39859a.f44045f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                nd0 nd0Var3 = this.f39196b;
                nd0Var3.postDelayed(new ld0(nd0Var3, 3), 150L);
                ld0 ld0Var = nd0Var3.f39868y;
                nd0Var3.removeCallbacks(ld0Var);
                nd0Var3.postDelayed(ld0Var, 3000L);
                nd0Var3.f39867x = true;
                return;
            default:
                tc0 tc0Var2 = this.f39196b.f39859a;
                int i11 = 0;
                tc0Var2.e = false;
                tc0Var2.f44045f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = tc0Var2.f44045f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
