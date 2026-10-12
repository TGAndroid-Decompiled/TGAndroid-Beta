package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kd1 extends w7.x5 {
    public final int f37627a;
    public final NotificationCenter.NotificationCenterDelegate f37628b;

    public kd1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37627a = i10;
        this.f37628b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f37627a) {
            case 1:
                ((dj1) this.f37628b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f37627a) {
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
                    ((ce1) this.f37628b).f34915x0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
