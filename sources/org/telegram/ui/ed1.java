package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ed1 extends w7.i0 {
    public final int f36030a;
    public final NotificationCenter.NotificationCenterDelegate f36031b;

    public ed1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36030a = i10;
        this.f36031b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f36030a) {
            case 1:
                ((ui1) this.f36031b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f36030a) {
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
                    ((wd1) this.f36031b).f42004x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
