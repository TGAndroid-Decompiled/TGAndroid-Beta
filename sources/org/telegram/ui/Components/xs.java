package org.telegram.ui.Components;
public final class xs implements Runnable {
    public final int f34811a;
    public final org.telegram.ui.ActionBar.e2[] f34812b;

    public xs(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.f34811a = i10;
        this.f34812b = e2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f34811a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f34812b[0];
                if (e2Var != null) {
                    e2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f34812b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f34812b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                return;
        }
    }
}
