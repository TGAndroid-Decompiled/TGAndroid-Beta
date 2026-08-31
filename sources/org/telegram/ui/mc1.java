package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class mc1 extends k7.z5 {
    public final int f39078a;
    public final NotificationCenter.NotificationCenterDelegate f39079b;

    public mc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39078a = i10;
        this.f39079b = notificationCenterDelegate;
    }

    @Override
    public void a() {
        switch (this.f39078a) {
            case 1:
                ((ci1) this.f39079b).v.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z4;
        switch (this.f39078a) {
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
                    ((ed1) this.f39079b).f36538u0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
