package org.telegram.ui.Components;
public final class wr implements Runnable {
    public final int f41427a;
    public final org.telegram.ui.ActionBar.t1[] f41428b;

    public wr(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f41427a = i7;
        this.f41428b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f41427a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f41428b[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f41428b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f41428b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
        }
    }
}
