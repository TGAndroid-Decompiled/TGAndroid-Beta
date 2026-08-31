package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qg implements Runnable {
    public final int f40470a;
    public final org.telegram.ui.ActionBar.d2[] f40471b;

    public qg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f40470a = i10;
        this.f40471b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40470a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f40471b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f40471b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qg(this.f40471b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qg(this.f40471b, 5));
                return;
            case 4:
                this.f40471b[0].dismiss();
                return;
            default:
                this.f40471b[0].dismiss();
                return;
        }
    }
}
