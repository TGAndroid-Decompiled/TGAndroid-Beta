package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40496a;
    public final ai.db f40497b;
    public final sn f40498c;
    public final sn d;

    public pi(sn snVar, int i10, ai.db dbVar, sn snVar2) {
        this.d = snVar;
        this.f40496a = i10;
        this.f40497b = dbVar;
        this.f40498c = snVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40496a) {
            this.f40497b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f40498c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
