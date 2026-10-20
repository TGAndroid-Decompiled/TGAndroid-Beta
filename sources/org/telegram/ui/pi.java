package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40239a;
    public final ai.cb f40240b;
    public final qn f40241c;
    public final qn d;

    public pi(qn qnVar, int i10, ai.cb cbVar, qn qnVar2) {
        this.d = qnVar;
        this.f40239a = i10;
        this.f40240b = cbVar;
        this.f40241c = qnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40239a) {
            this.f40240b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f40241c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
