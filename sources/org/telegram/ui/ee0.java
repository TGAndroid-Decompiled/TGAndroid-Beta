package org.telegram.ui;
public final class ee0 implements Runnable {
    public final int f36649a;
    public final ge0 f36650b;

    public ee0(ge0 ge0Var, int i10) {
        this.f36649a = i10;
        this.f36650b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f36649a) {
            case 0:
                ge0 ge0Var = this.f36650b;
                org.telegram.ui.Components.xj0 xj0Var = ge0Var.e;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                id0 id0Var = ge0Var.f37298a;
                if (id0Var != null) {
                    id0Var.f40961f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ge0 ge0Var2 = this.f36650b;
                int i10 = 0;
                ge0Var2.f37305w = false;
                while (true) {
                    tr[] trVarArr = ge0Var2.f37298a.f40961f;
                    if (i10 < trVarArr.length) {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ge0 ge0Var3 = this.f36650b;
                ge0Var3.postDelayed(new ee0(ge0Var3, 3), 150L);
                ee0 ee0Var = ge0Var3.f37306x;
                ge0Var3.removeCallbacks(ee0Var);
                ge0Var3.postDelayed(ee0Var, 3000L);
                ge0Var3.f37305w = true;
                return;
            default:
                id0 id0Var2 = this.f36650b.f37298a;
                int i11 = 0;
                id0Var2.e = false;
                id0Var2.f40961f[0].requestFocus();
                while (true) {
                    tr[] trVarArr2 = id0Var2.f40961f;
                    if (i11 < trVarArr2.length) {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
