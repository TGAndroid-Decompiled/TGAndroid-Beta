package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f26269a;
    public final org.telegram.ui.ActionBar.b2[] f26270b;

    public ms(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f26269a = i10;
        this.f26270b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26269a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f26270b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f26270b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f26270b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
