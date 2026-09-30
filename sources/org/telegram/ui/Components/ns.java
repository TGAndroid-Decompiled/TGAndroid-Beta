package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26851a;
    public final org.telegram.ui.ActionBar.a2[] f26852b;

    public ns(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f26851a = i10;
        this.f26852b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26851a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26852b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f26852b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f26852b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
