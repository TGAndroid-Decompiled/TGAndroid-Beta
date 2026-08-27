package org.telegram.ui.Components;

public final class as implements Runnable {

    public final int f26812a;

    public final org.telegram.ui.ActionBar.b2[] f26813b;

    public as(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f26812a = i10;
        this.f26813b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26812a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f26813b[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f26813b;
                try {
                    b2VarArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f26813b;
                try {
                    b2VarArr2[0].dismiss();
                    break;
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                break;
        }
    }
}
