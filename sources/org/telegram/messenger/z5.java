package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n70;
public final class z5 implements Runnable {
    public final int f19806a;
    public final float f19807b;
    public final NotificationCenter.NotificationCenterDelegate f19808c;
    public final Object d;

    public z5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f19806a = i10;
        this.f19808c = notificationCenterDelegate;
        this.d = obj;
        this.f19807b = f7;
    }

    @Override
    public final void run() {
        switch (this.f19806a) {
            case 0:
                ((MediaController) this.f19808c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f19807b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f19808c;
                n70 n70Var = (n70) this.d;
                i4Var.f37220h0.M.c(0.0f, true);
                n70Var.f28655p = new org.telegram.ui.b0(i4Var, this.f19807b, 0);
                n70Var.Z();
                return;
        }
    }
}
