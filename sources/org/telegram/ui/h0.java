package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class h0 extends org.telegram.ui.ActionBar.i5 {
    public final int f33228f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f33228f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f33228f) {
            case 0:
                j4 j4Var = (j4) this.h;
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                if (s9Var != null && s9Var.y()) {
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
        switch (this.f33228f) {
            case 1:
                ((org.telegram.ui.Components.sq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
