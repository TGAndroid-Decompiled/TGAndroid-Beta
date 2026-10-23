package org.telegram.ui.Components;
public final class vs implements Runnable {
    public final int f31865a;
    public final org.telegram.ui.ActionBar.b2[] f31866b;

    public vs(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f31865a = i10;
        this.f31866b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f31865a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f31866b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f31866b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f31866b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
