package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class k70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.c2 f38812a;
    public final n70 f38813b;

    public k70(n70 n70Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38813b = n70Var;
        this.f38812a = c2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f38812a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new fz(this, 13), 100L);
        }
    }
}
