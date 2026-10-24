package org.telegram.ui.Components;
public final class ts implements Runnable {
    public final int f30881a;
    public final org.telegram.ui.ActionBar.c2[] f30882b;

    public ts(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f30881a = i10;
        this.f30882b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30881a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f30882b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f30882b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f30882b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
