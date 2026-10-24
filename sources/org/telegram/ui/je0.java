package org.telegram.ui;
public final class je0 implements Runnable {
    public final int f38546a;
    public final le0 f38547b;

    public je0(le0 le0Var, int i10) {
        this.f38546a = i10;
        this.f38547b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f38546a) {
            case 0:
                le0 le0Var = this.f38547b;
                org.telegram.ui.Components.ak0 ak0Var = le0Var.e;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                nd0 nd0Var = le0Var.f39215a;
                if (nd0Var != null) {
                    nd0Var.f41792f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                le0 le0Var2 = this.f38547b;
                int i10 = 0;
                le0Var2.f39222w = false;
                while (true) {
                    vr[] vrVarArr = le0Var2.f39215a.f41792f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 2:
                le0 le0Var3 = this.f38547b;
                le0Var3.postDelayed(new je0(le0Var3, 3), 150L);
                je0 je0Var = le0Var3.f39223x;
                le0Var3.removeCallbacks(je0Var);
                le0Var3.postDelayed(je0Var, 3000L);
                le0Var3.f39222w = true;
                return;
            default:
                nd0 nd0Var2 = this.f38547b.f39215a;
                int i11 = 0;
                nd0Var2.e = false;
                nd0Var2.f41792f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = nd0Var2.f41792f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
