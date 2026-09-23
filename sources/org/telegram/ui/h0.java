package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class h0 extends org.telegram.ui.ActionBar.f5 {
    public final int f33694f;
    public final NotificationCenter.NotificationCenterDelegate h;

    public h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f33694f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override
    public boolean g() {
        switch (this.f33694f) {
            case 0:
                i4 i4Var = (i4) this.h;
                org.telegram.ui.Cells.r9 r9Var = i4Var.P0;
                if (r9Var != null && r9Var.y()) {
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
        switch (this.f33694f) {
            case 1:
                ((org.telegram.ui.Components.hq0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
