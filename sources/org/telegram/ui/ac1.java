package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ac1 extends org.telegram.ui.Components.gb1 {
    public final int f37711c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public ac1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37711c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public void M() {
        switch (this.f37711c) {
            case 1:
                ((ph1) this.d).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void P(int i10, int i11) {
        boolean z10;
        switch (this.f37711c) {
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
                    ((tc1) this.d).f43799y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
