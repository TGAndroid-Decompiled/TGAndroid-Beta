package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qg implements Runnable {
    public final int f40466a;
    public final org.telegram.ui.ActionBar.d2[] f40467b;

    public qg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f40466a = i10;
        this.f40467b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40466a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f40467b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f40467b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qg(this.f40467b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qg(this.f40467b, 5));
                return;
            case 4:
                this.f40467b[0].dismiss();
                return;
            default:
                this.f40467b[0].dismiss();
                return;
        }
    }
}
