package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class g0 extends org.telegram.ui.ActionBar.g5 {
    public final int f36543f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36543f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f36543f) {
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
        switch (this.f36543f) {
            case 1:
                ((org.telegram.ui.Components.hq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
