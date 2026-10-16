package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class e80 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.a2 f35217a;
    public final h80 f35218b;

    public e80(h80 h80Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f35218b = h80Var;
        this.f35217a = a2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f35217a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new zz(this, 13), 100L);
        }
    }
}
