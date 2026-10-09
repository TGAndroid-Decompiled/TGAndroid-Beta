package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class fd1 extends w7.i0 {
    public final int f37518a;
    public final NotificationCenter.NotificationCenterDelegate f37519b;

    public fd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37518a = i10;
        this.f37519b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f37518a) {
            case 1:
                ((wi1) this.f37519b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f37518a) {
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
                    ((xd1) this.f37519b).f44000x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
