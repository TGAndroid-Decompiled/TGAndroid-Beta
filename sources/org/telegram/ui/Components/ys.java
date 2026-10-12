package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f31678a;
    public final org.telegram.ui.ActionBar.a2[] f31679b;

    public ys(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f31678a = i10;
        this.f31679b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f31678a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f31679b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f31679b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f31679b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
