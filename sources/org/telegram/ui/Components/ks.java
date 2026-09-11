package org.telegram.ui.Components;
public final class ks implements Runnable {
    public final int f27895a;
    public final org.telegram.ui.ActionBar.b2[] f27896b;

    public ks(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f27895a = i10;
        this.f27896b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27895a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f27896b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f27896b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f27896b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
