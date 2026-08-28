package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f27560a;
    public final org.telegram.ui.ActionBar.c2[] f27561b;

    public cs(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9) {
        this.f27560a = i9;
        this.f27561b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27560a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f27561b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f27561b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f27561b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
