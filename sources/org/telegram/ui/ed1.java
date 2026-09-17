package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ed1 extends w7.i0 {
    public final int f36004a;
    public final NotificationCenter.NotificationCenterDelegate f36005b;

    public ed1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36004a = i10;
        this.f36005b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f36004a) {
            case 1:
                ((ui1) this.f36005b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f36004a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 <= i11) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((wd1) this.f36005b).f41978x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
