package org.telegram.ui.Components;
public final class xs implements Runnable {
    public final int f34808a;
    public final org.telegram.ui.ActionBar.e2[] f34809b;

    public xs(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.f34808a = i10;
        this.f34809b = e2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f34808a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f34809b[0];
                if (e2Var != null) {
                    e2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f34809b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f34809b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                return;
        }
    }
}
