package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class qi implements NotificationCenter.NotificationCenterDelegate {
    public final int f42853a;
    public final ai.h1 f42854b;
    public final un f42855c;
    public final un d;

    public qi(un unVar, int i10, ai.h1 h1Var, un unVar2) {
        this.d = unVar;
        this.f42853a = i10;
        this.f42854b = h1Var;
        this.f42855c = unVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f42853a) {
            this.f42854b.run();
            AndroidUtilities.runOnUIThread(new i2.b0(this.f42855c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
