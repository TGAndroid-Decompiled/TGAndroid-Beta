package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class og implements Runnable {

    public final int f41085a;

    public final org.telegram.ui.ActionBar.b2[] f41086b;

    public og(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f41085a = i10;
        this.f41086b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f41085a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f41086b;
                try {
                    b2VarArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f41086b;
                try {
                    b2VarArr2[0].dismiss();
                    break;
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new og(this.f41086b, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new og(this.f41086b, 5));
                break;
            case 4:
                this.f41086b[0].dismiss();
                break;
            default:
                this.f41086b[0].dismiss();
                break;
        }
    }
}
