package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f26048a;
    public final org.telegram.ui.ActionBar.d2[] f26049b;

    public js(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f26048a = i10;
        this.f26049b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26048a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f26049b[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f26049b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f26049b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
        }
    }
}
