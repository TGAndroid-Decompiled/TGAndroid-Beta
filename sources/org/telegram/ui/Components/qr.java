package org.telegram.ui.Components;
public final class qr implements Runnable {
    public final int f37493a;
    public final org.telegram.ui.ActionBar.u1[] f37494b;

    public qr(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f37493a = i7;
        this.f37494b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f37493a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.f37494b[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f37494b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f37494b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
        }
    }
}
