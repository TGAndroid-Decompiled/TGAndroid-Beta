package org.telegram.ui;
public final class cg implements Runnable {
    public final int f44823a;
    public final org.telegram.ui.ActionBar.u1[] f44824b;

    public cg(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f44823a = i7;
        this.f44824b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f44823a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f44824b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f44824b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new cg(this.f44824b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new cg(this.f44824b, 5));
                return;
            case 4:
                this.f44824b[0].dismiss();
                return;
            default:
                this.f44824b[0].dismiss();
                return;
        }
    }
}
