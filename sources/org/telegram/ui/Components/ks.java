package org.telegram.ui.Components;
public final class ks implements Runnable {
    public final int f27923a;
    public final org.telegram.ui.ActionBar.b2[] f27924b;

    public ks(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f27923a = i10;
        this.f27924b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27923a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f27924b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f27924b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f27924b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
