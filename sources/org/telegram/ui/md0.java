package org.telegram.ui;
public final class md0 implements Runnable {
    public final int f39649a;
    public final od0 f39650b;

    public md0(od0 od0Var, int i10) {
        this.f39649a = i10;
        this.f39650b = od0Var;
    }

    @Override
    public final void run() {
        switch (this.f39649a) {
            case 0:
                od0 od0Var = this.f39650b;
                org.telegram.ui.Components.ei0 ei0Var = od0Var.e;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                uc0 uc0Var = od0Var.f40232a;
                if (uc0Var != null) {
                    uc0Var.f44219f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                od0 od0Var2 = this.f39650b;
                int i10 = 0;
                od0Var2.f40240x = false;
                while (true) {
                    bs[] bsVarArr = od0Var2.f40232a.f44219f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                od0 od0Var3 = this.f39650b;
                od0Var3.postDelayed(new md0(od0Var3, 3), 150L);
                md0 md0Var = od0Var3.f40241y;
                od0Var3.removeCallbacks(md0Var);
                od0Var3.postDelayed(md0Var, 3000L);
                od0Var3.f40240x = true;
                return;
            default:
                uc0 uc0Var2 = this.f39650b.f40232a;
                int i11 = 0;
                uc0Var2.e = false;
                uc0Var2.f44219f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = uc0Var2.f44219f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
