package org.telegram.ui;
public final class qg implements Runnable {
    public final int f40771a;
    public final org.telegram.ui.ActionBar.x1[] f40772b;

    public qg(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.f40771a = i10;
        this.f40772b = x1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40771a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f40772b;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.f40772b;
                try {
                    x1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                x1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.i0.g3(new qg(this.f40772b, 4));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new qg(this.f40772b, 5));
                return;
            case 4:
                this.f40772b[0].dismiss();
                return;
            default:
                this.f40772b[0].dismiss();
                return;
        }
    }
}
