package org.telegram.ui.Components;
public final class ds implements Runnable {
    public final int f34491a;
    public final org.telegram.ui.ActionBar.u1[] f34492b;

    public ds(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f34491a = i7;
        this.f34492b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f34491a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.f34492b[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f34492b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f34492b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
        }
    }
}
