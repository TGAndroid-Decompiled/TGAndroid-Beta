package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class f70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.c2 f38148a;
    public final i70 f38149b;

    public f70(i70 i70Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38149b = i70Var;
        this.f38148a = c2Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.reloadInterface) {
            this.f38148a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i9);
            AndroidUtilities.runOnUIThread(new o00(this, 12), 100L);
        }
    }
}
