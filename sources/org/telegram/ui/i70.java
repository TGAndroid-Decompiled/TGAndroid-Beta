package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class i70 implements NotificationCenter.NotificationCenterDelegate {

    public final org.telegram.ui.ActionBar.b2 f38988a;

    public final l70 f38989b;

    public i70(l70 l70Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f38989b = l70Var;
        this.f38988a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f38988a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new r00(this, 12), 100L);
        }
    }
}
