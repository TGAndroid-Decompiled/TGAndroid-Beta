package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26574a;
    public final org.telegram.ui.ActionBar.a2[] f26575b;

    public ms(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f26574a = i10;
        this.f26575b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26574a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26575b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f26575b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f26575b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
