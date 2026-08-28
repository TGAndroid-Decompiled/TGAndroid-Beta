package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mg implements Runnable {
    public final int f40419a;
    public final org.telegram.ui.ActionBar.c2[] f40420b;

    public mg(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9) {
        this.f40419a = i9;
        this.f40420b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f40419a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f40420b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f40420b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new mg(this.f40420b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new mg(this.f40420b, 5));
                return;
            case 4:
                this.f40420b[0].dismiss();
                return;
            default:
                this.f40420b[0].dismiss();
                return;
        }
    }
}
