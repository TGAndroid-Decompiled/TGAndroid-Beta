package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.e2 f42005a;
    public final r70 f42006b;

    public o70(r70 r70Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f42006b = r70Var;
        this.f42005a = e2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f42005a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new r00(this, 12), 100L);
        }
    }
}
