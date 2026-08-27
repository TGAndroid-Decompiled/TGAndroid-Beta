package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

public final class k0 extends org.telegram.ui.ActionBar.e5 {

    public final int f39551f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39551f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f39551f) {
            case 0:
                m4 m4Var = (m4) this.h;
                org.telegram.ui.Cells.j9 j9Var = m4Var.L0;
                if (j9Var == null || !j9Var.y()) {
                    return true;
                }
                m4Var.L0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f39551f) {
            case 1:
                ((org.telegram.ui.Components.sp0) this.h).U = true;
                break;
        }
    }
}
