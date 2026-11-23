package org.telegram.ui.Components;
public final class fs implements Runnable {
    public final int f35311a;
    public final org.telegram.ui.ActionBar.t1[] f35312b;

    public fs(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f35311a = i7;
        this.f35312b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f35311a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f35312b[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f35312b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f35312b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
        }
    }
}
