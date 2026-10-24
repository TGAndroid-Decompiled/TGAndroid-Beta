package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ng implements Runnable {
    public final int f39818a;
    public final org.telegram.ui.ActionBar.c2[] f39819b;

    public ng(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f39818a = i10;
        this.f39819b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f39818a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39819b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39819b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ng(this.f39819b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ng(this.f39819b, 5));
                return;
            case 4:
                this.f39819b[0].dismiss();
                return;
            default:
                this.f39819b[0].dismiss();
                return;
        }
    }
}
