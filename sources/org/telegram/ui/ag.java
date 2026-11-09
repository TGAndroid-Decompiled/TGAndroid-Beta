package org.telegram.ui;
public final class ag implements Runnable {
    public final int f43682a;
    public final org.telegram.ui.ActionBar.u1[] f43683b;

    public ag(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f43682a = i7;
        this.f43683b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f43682a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f43683b;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f43683b;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ag(this.f43683b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ag(this.f43683b, 5));
                return;
            case 4:
                this.f43683b[0].dismiss();
                return;
            default:
                this.f43683b[0].dismiss();
                return;
        }
    }
}
