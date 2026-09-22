package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class g0 extends org.telegram.ui.ActionBar.g5 {
    public final int f33800f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f33800f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f33800f) {
            case 0:
                h4 h4Var = (h4) this.h;
                org.telegram.ui.Cells.r9 r9Var = h4Var.P0;
                if (r9Var != null && r9Var.y()) {
                    h4Var.P0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f33800f) {
            case 1:
                ((org.telegram.ui.Components.wq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
