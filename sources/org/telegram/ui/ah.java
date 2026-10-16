package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ah implements Runnable {
    public final int f33902a;
    public final org.telegram.ui.ActionBar.a2[] f33903b;

    public ah(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f33902a = i10;
        this.f33903b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f33902a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f33903b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f33903b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah(this.f33903b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah(this.f33903b, 5));
                return;
            case 4:
                this.f33903b[0].dismiss();
                return;
            default:
                this.f33903b[0].dismiss();
                return;
        }
    }
}
