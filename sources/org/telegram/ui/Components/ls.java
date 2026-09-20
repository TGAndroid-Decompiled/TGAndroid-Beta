package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f26228a;
    public final org.telegram.ui.ActionBar.b2[] f26229b;

    public ls(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f26228a = i10;
        this.f26229b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26228a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f26229b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f26229b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f26229b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
        }
    }
}
