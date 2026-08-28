package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class j0 extends org.telegram.ui.ActionBar.e5 {
    public final int f39328f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public j0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f39328f = i9;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f39328f) {
            case 0:
                l4 l4Var = (l4) this.h;
                org.telegram.ui.Cells.n9 n9Var = l4Var.L0;
                if (n9Var != null && n9Var.y()) {
                    l4Var.L0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f39328f) {
            case 1:
                ((org.telegram.ui.Components.rp0) this.h).U = true;
                return;
            default:
                return;
        }
    }
}
