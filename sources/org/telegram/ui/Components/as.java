package org.telegram.ui.Components;
public final class as implements Runnable {
    public final int f24481a;
    public final org.telegram.ui.ActionBar.x1[] f24482b;

    public as(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.f24481a = i10;
        this.f24482b = x1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f24481a) {
            case 0:
                org.telegram.ui.ActionBar.x1 x1Var = this.f24482b[0];
                if (x1Var != null) {
                    x1Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f24482b;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.f24482b;
                try {
                    x1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                x1VarArr2[0] = null;
                return;
        }
    }
}
