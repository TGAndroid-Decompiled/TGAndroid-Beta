package org.telegram.ui.Components;
public final class ct implements Runnable {
    public final int f25407a;
    public final org.telegram.ui.ActionBar.b2[] f25408b;

    public ct(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f25407a = i10;
        this.f25408b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25407a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f25408b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f25408b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f25408b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
