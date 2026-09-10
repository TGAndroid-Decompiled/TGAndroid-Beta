package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class aj implements NotificationCenter.NotificationCenterDelegate {
    public final int f31013a;
    public final di.q f31014b;
    public final eo f31015c;
    public final eo d;

    public aj(eo eoVar, int i10, di.q qVar, eo eoVar2) {
        this.d = eoVar;
        this.f31013a = i10;
        this.f31014b = qVar;
        this.f31015c = eoVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f31013a) {
            this.f31014b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f31015c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
