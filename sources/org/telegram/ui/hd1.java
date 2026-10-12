package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class hd1 extends w7.h0 {
    public final int f38334a;
    public final NotificationCenter.NotificationCenterDelegate f38335b;

    public hd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38334a = i10;
        this.f38335b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f38334a) {
            case 1:
                ((xi1) this.f38335b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f38334a) {
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
                    ((zd1) this.f38335b).f44792x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
