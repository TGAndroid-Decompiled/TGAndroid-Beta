package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class a80 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.b2 f32006a;
    public final d80 f32007b;

    public a80(d80 d80Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f32007b = d80Var;
        this.f32006a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f32006a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new g10(this, 12), 100L);
        }
    }
}
