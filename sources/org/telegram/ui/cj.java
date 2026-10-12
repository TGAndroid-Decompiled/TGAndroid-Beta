package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cj implements NotificationCenter.NotificationCenterDelegate {
    public final int f34958a;
    public final bi.n8 f34959b;
    public final fo f34960c;
    public final fo d;

    public cj(fo foVar, int i10, bi.n8 n8Var, fo foVar2) {
        this.d = foVar;
        this.f34958a = i10;
        this.f34959b = n8Var;
        this.f34960c = foVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f34958a) {
            this.f34959b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f34960c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
