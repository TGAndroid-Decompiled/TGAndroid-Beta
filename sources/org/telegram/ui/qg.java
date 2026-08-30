package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qg implements Runnable {
    public final int f37750a;
    public final org.telegram.ui.ActionBar.d2[] f37751b;

    public qg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f37750a = i10;
        this.f37751b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f37750a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f37751b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f37751b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qg(this.f37751b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qg(this.f37751b, 5));
                return;
            case 4:
                this.f37751b[0].dismiss();
                return;
            default:
                this.f37751b[0].dismiss();
                return;
        }
    }
}
