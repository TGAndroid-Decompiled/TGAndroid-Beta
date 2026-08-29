package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi implements NotificationCenter.NotificationCenterDelegate {
    public final int f41424a;
    public final ag.z1 f41425b;
    public final tn f41426c;
    public final tn d;

    public pi(tn tnVar, int i10, ag.z1 z1Var, tn tnVar2) {
        this.d = tnVar;
        this.f41424a = i10;
        this.f41425b = z1Var;
        this.f41426c = tnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f41424a) {
            this.f41425b.run();
            AndroidUtilities.runOnUIThread(new j3.f0(this.f41426c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
