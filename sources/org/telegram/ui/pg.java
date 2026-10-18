package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pg implements Runnable {
    public final int f40107a;
    public final org.telegram.ui.ActionBar.b2[] f40108b;

    public pg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f40107a = i10;
        this.f40108b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40107a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f40108b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f40108b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pg(this.f40108b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new pg(this.f40108b, 5));
                return;
            case 4:
                this.f40108b[0].dismiss();
                return;
            default:
                this.f40108b[0].dismiss();
                return;
        }
    }
}
