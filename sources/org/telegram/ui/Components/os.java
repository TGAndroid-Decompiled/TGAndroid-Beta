package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27169a;
    public final org.telegram.ui.ActionBar.a2[] f27170b;

    public os(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f27169a = i10;
        this.f27170b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27169a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f27170b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f27170b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f27170b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
