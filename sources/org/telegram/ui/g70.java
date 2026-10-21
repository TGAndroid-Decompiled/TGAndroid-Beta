package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class g70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.b2 f37210a;
    public final j70 f37211b;

    public g70(j70 j70Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f37211b = j70Var;
        this.f37210a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f37210a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new dz(this, 13), 100L);
        }
    }
}
