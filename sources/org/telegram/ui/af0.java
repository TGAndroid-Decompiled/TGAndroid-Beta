package org.telegram.ui;
public final class af0 implements Runnable {
    public final int f31847a;
    public final cf0 f31848b;

    public af0(cf0 cf0Var, int i10) {
        this.f31847a = i10;
        this.f31848b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f31847a) {
            case 0:
                cf0 cf0Var = this.f31848b;
                org.telegram.ui.Components.bj0 bj0Var = cf0Var.e;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                fe0 fe0Var = cf0Var.f32780a;
                if (fe0Var != null) {
                    fe0Var.f33753f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                cf0 cf0Var2 = this.f31848b;
                int i10 = 0;
                cf0Var2.f32787w = false;
                while (true) {
                    is[] isVarArr = cf0Var2.f32780a.f33753f;
                    if (i10 < isVarArr.length) {
                        isVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                cf0 cf0Var3 = this.f31848b;
                cf0Var3.postDelayed(new af0(cf0Var3, 3), 150L);
                af0 af0Var = cf0Var3.f32788x;
                cf0Var3.removeCallbacks(af0Var);
                cf0Var3.postDelayed(af0Var, 3000L);
                cf0Var3.f32787w = true;
                return;
            default:
                fe0 fe0Var2 = this.f31848b.f32780a;
                int i11 = 0;
                fe0Var2.e = false;
                fe0Var2.f33753f[0].requestFocus();
                while (true) {
                    is[] isVarArr2 = fe0Var2.f33753f;
                    if (i11 < isVarArr2.length) {
                        isVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
