package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40546a;
    public final ai.db f40547b;
    public final sn f40548c;
    public final sn d;

    public pi(sn snVar, int i10, ai.db dbVar, sn snVar2) {
        this.d = snVar;
        this.f40546a = i10;
        this.f40547b = dbVar;
        this.f40548c = snVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40546a) {
            this.f40547b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f40548c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
