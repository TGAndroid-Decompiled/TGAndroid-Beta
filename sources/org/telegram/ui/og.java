package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class og implements Runnable {
    public final int f42088a;
    public final org.telegram.ui.ActionBar.e2[] f42089b;

    public og(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.f42088a = i10;
        this.f42089b = e2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f42088a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.f42089b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.f42089b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new og(this.f42089b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new og(this.f42089b, 5));
                return;
            case 4:
                this.f42089b[0].dismiss();
                return;
            default:
                this.f42089b[0].dismiss();
                return;
        }
    }
}
