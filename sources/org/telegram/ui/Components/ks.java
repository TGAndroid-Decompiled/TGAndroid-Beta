package org.telegram.ui.Components;
public final class ks implements Runnable {
    public final int f26378a;
    public final org.telegram.ui.ActionBar.d2[] f26379b;

    public ks(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f26378a = i10;
        this.f26379b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26378a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f26379b[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f26379b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f26379b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
        }
    }
}
