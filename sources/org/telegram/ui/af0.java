package org.telegram.ui;
public final class af0 implements Runnable {
    public final int f32067a;
    public final cf0 f32068b;

    public af0(cf0 cf0Var, int i10) {
        this.f32067a = i10;
        this.f32068b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f32067a) {
            case 0:
                cf0 cf0Var = this.f32068b;
                org.telegram.ui.Components.nj0 nj0Var = cf0Var.e;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                fe0 fe0Var = cf0Var.f32754a;
                if (fe0Var != null) {
                    fe0Var.f33145f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                cf0 cf0Var2 = this.f32068b;
                int i10 = 0;
                cf0Var2.f32761w = false;
                while (true) {
                    gs[] gsVarArr = cf0Var2.f32754a.f33145f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                cf0 cf0Var3 = this.f32068b;
                cf0Var3.postDelayed(new af0(cf0Var3, 3), 150L);
                af0 af0Var = cf0Var3.f32762x;
                cf0Var3.removeCallbacks(af0Var);
                cf0Var3.postDelayed(af0Var, 3000L);
                cf0Var3.f32761w = true;
                return;
            default:
                fe0 fe0Var2 = this.f32068b.f32754a;
                int i11 = 0;
                fe0Var2.e = false;
                fe0Var2.f33145f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = fe0Var2.f33145f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
