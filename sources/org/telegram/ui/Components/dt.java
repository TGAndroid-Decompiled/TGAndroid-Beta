package org.telegram.ui.Components;
public final class dt implements Runnable {
    public final int f25461a;
    public final org.telegram.ui.ActionBar.a2[] f25462b;

    public dt(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f25461a = i10;
        this.f25462b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25461a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25462b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f25462b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f25462b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
