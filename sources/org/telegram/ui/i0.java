package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class i0 extends org.telegram.ui.ActionBar.g5 {
    public final int f34311f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public i0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f34311f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f34311f) {
            case 0:
                j4 j4Var = (j4) this.h;
                org.telegram.ui.Cells.q9 q9Var = j4Var.P0;
                if (q9Var != null && q9Var.y()) {
                    j4Var.P0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f34311f) {
            case 1:
                ((org.telegram.ui.Components.vq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
