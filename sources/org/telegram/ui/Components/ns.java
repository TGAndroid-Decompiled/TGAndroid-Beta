package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26853a;
    public final org.telegram.ui.ActionBar.a2[] f26854b;

    public ns(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f26853a = i10;
        this.f26854b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26853a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26854b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f26854b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f26854b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
