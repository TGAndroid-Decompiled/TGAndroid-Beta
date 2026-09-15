package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class dd1 extends w7.i0 {
    public final int f32994a;
    public final NotificationCenter.NotificationCenterDelegate f32995b;

    public dd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f32994a = i10;
        this.f32995b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f32994a) {
            case 1:
                ((ti1) this.f32995b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f32994a) {
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
                    ((vd1) this.f32995b).f38575x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
