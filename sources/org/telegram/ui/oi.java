package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class oi implements NotificationCenter.NotificationCenterDelegate {

    public final int f41113a;

    public final ag.k0 f41114b;

    public final rn f41115c;
    public final rn d;

    public oi(rn rnVar, int i10, ag.k0 k0Var, rn rnVar2) {
        this.d = rnVar;
        this.f41113a = i10;
        this.f41114b = k0Var;
        this.f41115c = rnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.messagesDidLoad;
        if (i10 == i12 && ((Integer) objArr[10]).intValue() == this.f41113a) {
            this.f41114b.run();
            AndroidUtilities.runOnUIThread(new h3.f0(this.f41115c, i10, i11, objArr), 50L);
            NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) this.d).currentAccount).removeObserver(this, i12);
        }
    }
}
