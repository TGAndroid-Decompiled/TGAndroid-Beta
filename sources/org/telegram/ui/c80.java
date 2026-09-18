package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class c80 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.c2 f32696a;
    public final f80 f32697b;

    public c80(f80 f80Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f32697b = f80Var;
        this.f32696a = c2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f32696a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new i10(this, 12), 100L);
        }
    }
}
