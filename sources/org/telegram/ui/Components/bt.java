package org.telegram.ui.Components;
public final class bt implements Runnable {
    public final int f25099a;
    public final org.telegram.ui.ActionBar.b2[] f25100b;

    public bt(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f25099a = i10;
        this.f25100b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25099a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f25100b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f25100b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f25100b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
