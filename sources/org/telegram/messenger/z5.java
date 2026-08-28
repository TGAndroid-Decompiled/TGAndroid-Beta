package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.x60;
public final class z5 implements Runnable {
    public final int f22300a;
    public final float f22301b;
    public final NotificationCenter.NotificationCenterDelegate f22302c;
    public final Object d;

    public z5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i9) {
        this.f22300a = i9;
        this.f22302c = notificationCenterDelegate;
        this.d = obj;
        this.f22301b = f10;
    }

    @Override
    public final void run() {
        switch (this.f22300a) {
            case 0:
                ((MediaController) this.f22302c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f22301b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f22302c;
                x60 x60Var = (x60) this.d;
                l4Var.f40014d0.I.c(0.0f, true);
                x60Var.f34575p = new org.telegram.ui.d0(l4Var, this.f22301b, 0);
                x60Var.Z();
                return;
        }
    }
}
