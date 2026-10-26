package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qg implements Runnable {
    public final int f42833a;
    public final org.telegram.ui.ActionBar.e2[] f42834b;

    public qg(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.f42833a = i10;
        this.f42834b = e2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f42833a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f42834b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f42834b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qg(this.f42834b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new qg(this.f42834b, 5));
                return;
            case 4:
                this.f42834b[0].dismiss();
                return;
            default:
                this.f42834b[0].dismiss();
                return;
        }
    }
}
