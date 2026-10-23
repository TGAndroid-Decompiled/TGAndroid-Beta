package org.telegram.ui.Components;
public final class vs implements Runnable {
    public final int f32046a;
    public final org.telegram.ui.ActionBar.c2[] f32047b;

    public vs(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f32046a = i10;
        this.f32047b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f32046a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f32047b[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f32047b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f32047b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
        }
    }
}
