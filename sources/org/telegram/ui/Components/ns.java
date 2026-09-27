package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26887a;
    public final org.telegram.ui.ActionBar.c2[] f26888b;

    public ns(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f26887a = i10;
        this.f26888b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26887a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f26888b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f26888b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f26888b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
