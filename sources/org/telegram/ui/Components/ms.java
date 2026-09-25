package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26575a;
    public final org.telegram.ui.ActionBar.a2[] f26576b;

    public ms(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f26575a = i10;
        this.f26576b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26575a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26576b[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f26576b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f26576b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
        }
    }
}
