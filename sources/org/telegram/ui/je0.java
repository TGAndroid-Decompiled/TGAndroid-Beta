package org.telegram.ui;
public final class je0 implements Runnable {
    public final int f40519a;
    public final le0 f40520b;

    public je0(le0 le0Var, int i10) {
        this.f40519a = i10;
        this.f40520b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f40519a) {
            case 0:
                le0 le0Var = this.f40520b;
                org.telegram.ui.Components.bk0 bk0Var = le0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                nd0 nd0Var = le0Var.f41092a;
                if (nd0Var != null) {
                    nd0Var.f45772f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                le0 le0Var2 = this.f40520b;
                int i10 = 0;
                le0Var2.f41099w = false;
                while (true) {
                    zr[] zrVarArr = le0Var2.f41092a.f45772f;
                    if (i10 < zrVarArr.length) {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                le0 le0Var3 = this.f40520b;
                le0Var3.postDelayed(new je0(le0Var3, 3), 150L);
                je0 je0Var = le0Var3.f41100x;
                le0Var3.removeCallbacks(je0Var);
                le0Var3.postDelayed(je0Var, 3000L);
                le0Var3.f41099w = true;
                return;
            default:
                nd0 nd0Var2 = this.f40520b.f41092a;
                int i11 = 0;
                nd0Var2.e = false;
                nd0Var2.f45772f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr2 = nd0Var2.f45772f;
                    if (i11 < zrVarArr2.length) {
                        zrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
