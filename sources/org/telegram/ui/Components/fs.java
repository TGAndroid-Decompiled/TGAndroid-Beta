package org.telegram.ui.Components;
public final class fs implements Runnable {
    public final int f35309a;
    public final org.telegram.ui.ActionBar.t1[] f35310b;

    public fs(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f35309a = i7;
        this.f35310b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f35309a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f35310b[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f35310b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f35310b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
        }
    }
}
