package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f25999a;
    public final org.telegram.ui.ActionBar.b2[] f26000b;

    public ls(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f25999a = i10;
        this.f26000b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25999a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f26000b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f26000b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f26000b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
