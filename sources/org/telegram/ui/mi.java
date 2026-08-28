package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class mi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40473a;
    public final c3.d f40474b;
    public final qn f40475c;
    public final qn d;

    public mi(qn qnVar, int i9, c3.d dVar, qn qnVar2) {
        this.d = qnVar;
        this.f40473a = i9;
        this.f40474b = dVar;
        this.f40475c = qnVar2;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        int i12 = NotificationCenter.messagesDidLoad;
        if (i9 == i12 && ((Integer) objArr[10]).intValue() == this.f40473a) {
            this.f40474b.run();
            AndroidUtilities.runOnUIThread(new h3.e0(this.f40475c, i9, i10, objArr), 50L);
            i11 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i11).removeObserver(this, i12);
        }
    }
}
