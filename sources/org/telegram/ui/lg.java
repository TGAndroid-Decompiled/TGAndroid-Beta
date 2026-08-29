package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lg implements Runnable {
    public final int f40197a;
    public final org.telegram.ui.ActionBar.c2[] f40198b;

    public lg(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f40197a = i10;
        this.f40198b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40197a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f40198b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f40198b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new lg(this.f40198b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lg(this.f40198b, 5));
                return;
            case 4:
                this.f40198b[0].dismiss();
                return;
            default:
                this.f40198b[0].dismiss();
                return;
        }
    }
}
