package org.telegram.ui.Components;
public final class dt implements Runnable {
    public final int f25458a;
    public final org.telegram.ui.ActionBar.a2[] f25459b;

    public dt(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f25458a = i10;
        this.f25459b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25458a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25459b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f25459b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f25459b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
