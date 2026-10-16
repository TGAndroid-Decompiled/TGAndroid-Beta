package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f31356a;
    public final org.telegram.ui.ActionBar.a2[] f31357b;

    public ys(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f31356a = i10;
        this.f31357b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f31356a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f31357b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f31357b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f31357b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
