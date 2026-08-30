package org.telegram.ui;
public final class qe0 implements Runnable {
    public final int f37733a;
    public final se0 f37734b;

    public qe0(se0 se0Var, int i10) {
        this.f37733a = i10;
        this.f37734b = se0Var;
    }

    @Override
    public final void run() {
        switch (this.f37733a) {
            case 0:
                se0 se0Var = this.f37734b;
                org.telegram.ui.Components.jj0 jj0Var = se0Var.e;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                vd0 vd0Var = se0Var.f38312a;
                if (vd0Var != null) {
                    vd0Var.f40565f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                se0 se0Var2 = this.f37734b;
                int i10 = 0;
                se0Var2.f38319w = false;
                while (true) {
                    bs[] bsVarArr = se0Var2.f38312a.f40565f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                se0 se0Var3 = this.f37734b;
                se0Var3.postDelayed(new qe0(se0Var3, 3), 150L);
                qe0 qe0Var = se0Var3.f38320x;
                se0Var3.removeCallbacks(qe0Var);
                se0Var3.postDelayed(qe0Var, 3000L);
                se0Var3.f38319w = true;
                return;
            default:
                vd0 vd0Var2 = this.f37734b.f38312a;
                int i11 = 0;
                vd0Var2.e = false;
                vd0Var2.f40565f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = vd0Var2.f40565f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
