package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f29241a;
    public final org.telegram.ui.ActionBar.d2[] f29242b;

    public ms(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f29241a = i10;
        this.f29242b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29241a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f29242b[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f29242b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f29242b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
        }
    }
}
