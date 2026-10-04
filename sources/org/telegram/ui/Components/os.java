package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f29441a;
    public final org.telegram.ui.ActionBar.b2[] f29442b;

    public os(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f29441a = i10;
        this.f29442b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29441a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f29442b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f29442b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f29442b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
