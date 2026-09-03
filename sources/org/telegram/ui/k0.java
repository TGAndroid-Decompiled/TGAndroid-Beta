package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class k0 extends org.telegram.ui.ActionBar.h5 {
    public final int f35394f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35394f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f35394f) {
            case 0:
                n4 n4Var = (n4) this.h;
                org.telegram.ui.Cells.l9 l9Var = n4Var.M0;
                if (l9Var != null && l9Var.y()) {
                    n4Var.M0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f35394f) {
            case 1:
                ((org.telegram.ui.Components.lq0) this.h).V = true;
                return;
            default:
                return;
        }
    }
}
