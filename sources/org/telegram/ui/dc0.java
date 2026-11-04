package org.telegram.ui;
public final class dc0 implements Runnable {
    public final int f44626a;
    public final fc0 f44627b;

    public dc0(fc0 fc0Var, int i3) {
        this.f44626a = i3;
        this.f44627b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44626a) {
            case 0:
                fc0 fc0Var = this.f44627b;
                org.telegram.ui.Components.fh0 fh0Var = fc0Var.f45250e;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                ib0 ib0Var = fc0Var.f45247a;
                if (ib0Var != null) {
                    ib0Var.f52078f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                fc0 fc0Var2 = this.f44627b;
                int i3 = 0;
                fc0Var2.f45256x = false;
                while (true) {
                    zq[] zqVarArr = fc0Var2.f45247a.f52078f;
                    if (i3 < zqVarArr.length) {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    } else {
                        return;
                    }
                }
            case 2:
                fc0 fc0Var3 = this.f44627b;
                fc0Var3.postDelayed(new dc0(fc0Var3, 3), 150L);
                dc0 dc0Var = fc0Var3.f45257y;
                fc0Var3.removeCallbacks(dc0Var);
                fc0Var3.postDelayed(dc0Var, 3000L);
                fc0Var3.f45256x = true;
                return;
            default:
                ib0 ib0Var2 = this.f44627b.f45247a;
                int i10 = 0;
                ib0Var2.f52077e = false;
                ib0Var2.f52078f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr2 = ib0Var2.f52078f;
                    if (i10 < zqVarArr2.length) {
                        zqVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
