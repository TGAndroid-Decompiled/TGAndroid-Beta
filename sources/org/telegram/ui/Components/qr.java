package org.telegram.ui.Components;
public final class qr implements Runnable {
    public final int f37513a;
    public final org.telegram.ui.ActionBar.s1[] f37514b;

    public qr(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3) {
        this.f37513a = i3;
        this.f37514b = s1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f37513a) {
            case 0:
                org.telegram.ui.ActionBar.s1 s1Var = this.f37514b[0];
                if (s1Var != null) {
                    s1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f37514b;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.f37514b;
                try {
                    s1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                s1VarArr2[0] = null;
                return;
        }
    }
}
