package org.telegram.ui;
public final class cg implements Runnable {
    public final int f44802a;
    public final org.telegram.ui.ActionBar.u1[] f44803b;

    public cg(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f44802a = i7;
        this.f44803b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f44802a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f44803b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f44803b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new cg(this.f44803b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new cg(this.f44803b, 5));
                return;
            case 4:
                this.f44803b[0].dismiss();
                return;
            default:
                this.f44803b[0].dismiss();
                return;
        }
    }
}
