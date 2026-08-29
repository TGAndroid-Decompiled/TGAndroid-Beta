package org.telegram.ui.Components;
public final class gs implements Runnable {
    public final int f28974a;
    public final org.telegram.ui.ActionBar.c2[] f28975b;

    public gs(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f28974a = i10;
        this.f28975b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f28974a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f28975b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f28975b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f28975b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
