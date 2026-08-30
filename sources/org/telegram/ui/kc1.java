package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kc1 extends k7.y5 {
    public final int f35620a;
    public final NotificationCenter.NotificationCenterDelegate f35621b;

    public kc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35620a = i10;
        this.f35621b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f35620a) {
            case 1:
                ((ai1) this.f35621b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z4;
        switch (this.f35620a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                boolean z10 = false;
                if (point.x <= point.y) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i10 <= i11) {
                    z10 = true;
                }
                if (z4 == z10) {
                    ((cd1) this.f35621b).f33338u0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
