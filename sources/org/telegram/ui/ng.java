package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ng implements Runnable {
    public final int f39588a;
    public final org.telegram.ui.ActionBar.b2[] f39589b;

    public ng(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f39588a = i10;
        this.f39589b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f39588a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39589b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39589b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ng(this.f39589b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ng(this.f39589b, 5));
                return;
            case 4:
                this.f39589b[0].dismiss();
                return;
            default:
                this.f39589b[0].dismiss();
                return;
        }
    }
}
