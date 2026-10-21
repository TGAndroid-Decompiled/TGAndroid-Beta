package org.telegram.ui;
public final class ee0 implements Runnable {
    public final int f36647a;
    public final ge0 f36648b;

    public ee0(ge0 ge0Var, int i10) {
        this.f36647a = i10;
        this.f36648b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f36647a) {
            case 0:
                ge0 ge0Var = this.f36648b;
                org.telegram.ui.Components.yj0 yj0Var = ge0Var.e;
                yj0Var.getAnimatedDrawable().N(0, false, false);
                yj0Var.d();
                id0 id0Var = ge0Var.f37299a;
                if (id0Var != null) {
                    id0Var.f40959f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                ge0 ge0Var2 = this.f36648b;
                int i10 = 0;
                ge0Var2.f37306w = false;
                while (true) {
                    tr[] trVarArr = ge0Var2.f37299a.f40959f;
                    if (i10 < trVarArr.length) {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                ge0 ge0Var3 = this.f36648b;
                ge0Var3.postDelayed(new ee0(ge0Var3, 3), 150L);
                ee0 ee0Var = ge0Var3.f37307x;
                ge0Var3.removeCallbacks(ee0Var);
                ge0Var3.postDelayed(ee0Var, 3000L);
                ge0Var3.f37306w = true;
                return;
            default:
                id0 id0Var2 = this.f36648b.f37299a;
                int i11 = 0;
                id0Var2.e = false;
                id0Var2.f40959f[0].requestFocus();
                while (true) {
                    tr[] trVarArr2 = id0Var2.f40959f;
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
