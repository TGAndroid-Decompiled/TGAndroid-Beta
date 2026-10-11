package org.telegram.ui.Components;
public final class ct implements Runnable {
    public final int f25316a;
    public final org.telegram.ui.ActionBar.a2[] f25317b;

    public ct(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f25316a = i10;
        this.f25317b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25316a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25317b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f25317b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f25317b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
