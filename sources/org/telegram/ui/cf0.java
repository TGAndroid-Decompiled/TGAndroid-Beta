package org.telegram.ui;
public final class cf0 implements Runnable {
    public final int f34649a;
    public final ef0 f34650b;

    public cf0(ef0 ef0Var, int i10) {
        this.f34649a = i10;
        this.f34650b = ef0Var;
    }

    @Override
    public final void run() {
        switch (this.f34649a) {
            case 0:
                ef0 ef0Var = this.f34650b;
                org.telegram.ui.Components.bk0 bk0Var = ef0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ge0 ge0Var = ef0Var.f35277a;
                if (ge0Var != null) {
                    ge0Var.f36645f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ef0 ef0Var2 = this.f34650b;
                int i10 = 0;
                ef0Var2.f35284w = false;
                while (true) {
                    ks[] ksVarArr = ef0Var2.f35277a.f36645f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ef0 ef0Var3 = this.f34650b;
                ef0Var3.postDelayed(new cf0(ef0Var3, 3), 150L);
                cf0 cf0Var = ef0Var3.f35285x;
                ef0Var3.removeCallbacks(cf0Var);
                ef0Var3.postDelayed(cf0Var, 3000L);
                ef0Var3.f35284w = true;
                return;
            default:
                ge0 ge0Var2 = this.f34650b.f35277a;
                int i11 = 0;
                ge0Var2.e = false;
                ge0Var2.f36645f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr2 = ge0Var2.f36645f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
