package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class id1 extends w7.x5 {
    public final int f33649a;
    public final NotificationCenter.NotificationCenterDelegate f33650b;

    public id1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f33649a = i10;
        this.f33650b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f33649a) {
            case 1:
                ((zi1) this.f33650b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f33649a) {
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
                    ((ae1) this.f33650b).f30976x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
