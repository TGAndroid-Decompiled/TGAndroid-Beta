package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cj implements NotificationCenter.NotificationCenterDelegate {
    public final int f34672a;
    public final bi.n8 f34673b;
    public final fo f34674c;
    public final fo d;

    public cj(fo foVar, int i10, bi.n8 n8Var, fo foVar2) {
        this.d = foVar;
        this.f34672a = i10;
        this.f34673b = n8Var;
        this.f34674c = foVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f34672a) {
            this.f34673b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f34674c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
