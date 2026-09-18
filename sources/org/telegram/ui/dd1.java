package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class dd1 extends w7.j0 {
    public final int f32945a;
    public final NotificationCenter.NotificationCenterDelegate f32946b;

    public dd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f32945a = i10;
        this.f32946b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f32945a) {
            case 1:
                ((si1) this.f32946b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f32945a) {
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
                    ((vd1) this.f32946b).f38529x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
