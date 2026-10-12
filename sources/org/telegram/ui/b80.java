package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class b80 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.a2 f36107a;
    public final f80 f36108b;

    public b80(f80 f80Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f36108b = f80Var;
        this.f36107a = a2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f36107a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new wz(this, 13), 100L);
        }
    }
}
