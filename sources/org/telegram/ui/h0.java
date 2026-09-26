package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class h0 extends org.telegram.ui.ActionBar.e5 {
    public final int f34092f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f34092f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f34092f) {
            case 0:
                i4 i4Var = (i4) this.h;
                org.telegram.ui.Cells.q9 q9Var = i4Var.P0;
                if (q9Var != null && q9Var.y()) {
                    i4Var.P0.f(false);
                    return false;
                }
                return true;
            default:
                return super.g();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f34092f) {
            case 1:
                ((org.telegram.ui.Components.vq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
