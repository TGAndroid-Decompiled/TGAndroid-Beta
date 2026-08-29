package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class k0 extends org.telegram.ui.ActionBar.e5 {
    public final int f39716f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39716f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f39716f) {
            case 0:
                m4 m4Var = (m4) this.h;
                org.telegram.ui.Cells.k9 k9Var = m4Var.L0;
                if (k9Var != null && k9Var.y()) {
                    m4Var.L0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f39716f) {
            case 1:
                ((org.telegram.ui.Components.dq0) this.h).U = true;
                return;
            default:
                return;
        }
    }
}
