package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class fd1 extends w7.i0 {
    public final int f37562a;
    public final NotificationCenter.NotificationCenterDelegate f37563b;

    public fd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37562a = i10;
        this.f37563b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f37562a) {
            case 1:
                ((wi1) this.f37563b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f37562a) {
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
                    ((xd1) this.f37563b).f44044x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
