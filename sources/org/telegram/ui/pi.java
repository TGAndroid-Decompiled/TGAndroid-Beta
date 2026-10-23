package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40243a;
    public final ai.cb f40244b;
    public final qn f40245c;
    public final qn d;

    public pi(qn qnVar, int i10, ai.cb cbVar, qn qnVar2) {
        this.d = qnVar;
        this.f40243a = i10;
        this.f40244b = cbVar;
        this.f40245c = qnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40243a) {
            this.f40244b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f40245c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
