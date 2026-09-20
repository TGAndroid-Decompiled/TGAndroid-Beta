package org.telegram.ui;
public final class af0 implements Runnable {
    public final int f32046a;
    public final cf0 f32047b;

    public af0(cf0 cf0Var, int i10) {
        this.f32046a = i10;
        this.f32047b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f32046a) {
            case 0:
                cf0 cf0Var = this.f32047b;
                org.telegram.ui.Components.kj0 kj0Var = cf0Var.e;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                fe0 fe0Var = cf0Var.f32734a;
                if (fe0Var != null) {
                    fe0Var.f33125f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                cf0 cf0Var2 = this.f32047b;
                int i10 = 0;
                cf0Var2.f32741w = false;
                while (true) {
                    gs[] gsVarArr = cf0Var2.f32734a.f33125f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                cf0 cf0Var3 = this.f32047b;
                cf0Var3.postDelayed(new af0(cf0Var3, 3), 150L);
                af0 af0Var = cf0Var3.f32742x;
                cf0Var3.removeCallbacks(af0Var);
                cf0Var3.postDelayed(af0Var, 3000L);
                cf0Var3.f32741w = true;
                return;
            default:
                fe0 fe0Var2 = this.f32047b.f32734a;
                int i11 = 0;
                fe0Var2.e = false;
                fe0Var2.f33125f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = fe0Var2.f33125f;
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
