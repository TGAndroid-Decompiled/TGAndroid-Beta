package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class fd1 extends w7.i0 {
    public final int f33622a;
    public final NotificationCenter.NotificationCenterDelegate f33623b;

    public fd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f33622a = i10;
        this.f33623b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f33622a) {
            case 1:
                ((ti1) this.f33623b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f33622a) {
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
                    ((xd1) this.f33623b).f39598x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
