package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n70;
public final class z5 implements Runnable {
    public final int f19833a;
    public final float f19834b;
    public final NotificationCenter.NotificationCenterDelegate f19835c;
    public final Object d;

    public z5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f19833a = i10;
        this.f19835c = notificationCenterDelegate;
        this.d = obj;
        this.f19834b = f7;
    }

    @Override
    public final void run() {
        switch (this.f19833a) {
            case 0:
                ((MediaController) this.f19835c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f19834b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f19835c;
                n70 n70Var = (n70) this.d;
                i4Var.f37248h0.M.c(0.0f, true);
                n70Var.f28683p = new org.telegram.ui.b0(i4Var, this.f19834b, 0);
                n70Var.Z();
                return;
        }
    }
}
