package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ah implements Runnable {
    public final int f34213a;
    public final org.telegram.ui.ActionBar.a2[] f34214b;

    public ah(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f34213a = i10;
        this.f34214b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f34213a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f34214b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f34214b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah(this.f34214b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah(this.f34214b, 5));
                return;
            case 4:
                this.f34214b[0].dismiss();
                return;
            default:
                this.f34214b[0].dismiss();
                return;
        }
    }
}
