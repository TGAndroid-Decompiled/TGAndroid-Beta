package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f25965a;
    public final org.telegram.ui.ActionBar.c2[] f25966b;

    public ls(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f25965a = i10;
        this.f25966b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25965a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f25966b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f25966b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f25966b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
