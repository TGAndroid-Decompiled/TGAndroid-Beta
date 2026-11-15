package org.telegram.ui;
public final class ec0 implements Runnable {
    public final int f46678a;
    public final gc0 f46679b;

    public ec0(gc0 gc0Var, int i7) {
        this.f46678a = i7;
        this.f46679b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46678a) {
            case 0:
                gc0 gc0Var = this.f46679b;
                org.telegram.ui.Components.fh0 fh0Var = gc0Var.f47414e;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                lb0 lb0Var = gc0Var.f47411a;
                if (lb0Var != null) {
                    lb0Var.f45491f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                gc0 gc0Var2 = this.f46679b;
                int i7 = 0;
                gc0Var2.f47420x = false;
                while (true) {
                    dr[] drVarArr = gc0Var2.f47411a.f45491f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 2:
                gc0 gc0Var3 = this.f46679b;
                gc0Var3.postDelayed(new ec0(gc0Var3, 3), 150L);
                ec0 ec0Var = gc0Var3.f47421y;
                gc0Var3.removeCallbacks(ec0Var);
                gc0Var3.postDelayed(ec0Var, 3000L);
                gc0Var3.f47420x = true;
                return;
            default:
                lb0 lb0Var2 = this.f46679b.f47411a;
                int i10 = 0;
                lb0Var2.f45490e = false;
                lb0Var2.f45491f[0].requestFocus();
                while (true) {
                    dr[] drVarArr2 = lb0Var2.f45491f;
                    if (i10 < drVarArr2.length) {
                        drVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
