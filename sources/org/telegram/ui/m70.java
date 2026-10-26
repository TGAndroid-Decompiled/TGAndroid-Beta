package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.e2 f41483a;
    public final p70 f41484b;

    public m70(p70 p70Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f41484b = p70Var;
        this.f41483a = e2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f41483a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new p00(this, 12), 100L);
        }
    }
}
