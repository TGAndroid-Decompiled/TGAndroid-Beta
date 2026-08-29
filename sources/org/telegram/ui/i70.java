package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class i70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.c2 f39141a;
    public final k70 f39142b;

    public i70(k70 k70Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f39142b = k70Var;
        this.f39141a = c2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f39141a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new q00(this, 12), 100L);
        }
    }
}
