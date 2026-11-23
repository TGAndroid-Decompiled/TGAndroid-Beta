package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f34115a;
    public final org.telegram.ui.ActionBar.t1[] f34116b;

    public cs(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f34115a = i7;
        this.f34116b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f34115a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f34116b[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f34116b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f34116b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
        }
    }
}
