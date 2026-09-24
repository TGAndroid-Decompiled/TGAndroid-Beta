package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26567a;
    public final org.telegram.ui.ActionBar.a2[] f26568b;

    public ms(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f26567a = i10;
        this.f26568b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26567a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26568b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f26568b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f26568b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
