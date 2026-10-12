package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cj implements NotificationCenter.NotificationCenterDelegate {
    public final int f36446a;
    public final ai.d9 f36447b;
    public final eo f36448c;
    public final eo d;

    public cj(eo eoVar, int i10, ai.d9 d9Var, eo eoVar2) {
        this.d = eoVar;
        this.f36446a = i10;
        this.f36447b = d9Var;
        this.f36448c = eoVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f36446a) {
            this.f36447b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f36448c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
