package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class i0 extends org.telegram.ui.ActionBar.i5 {
    public final int f37712f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public i0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37712f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f37712f) {
            case 0:
                l4 l4Var = (l4) this.h;
                org.telegram.ui.Cells.m9 m9Var = l4Var.M0;
                if (m9Var != null && m9Var.y()) {
                    l4Var.M0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f37712f) {
            case 1:
                ((org.telegram.ui.Components.mq0) this.h).V = true;
                return;
            default:
                return;
        }
    }
}
