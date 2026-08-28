package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class p40 extends Paint {
    public final int f31539a;
    public final NotificationCenter.NotificationCenterDelegate f31540b;

    public p40(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        super(1);
        this.f31539a = i9;
        this.f31540b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f31539a) {
            case 0:
                super.setAlpha(i9);
                ((f50) this.f31540b).invalidate();
                return;
            default:
                super.setAlpha(i9);
                ((ProfileActivity) this.f31540b).fragmentView.invalidate();
                return;
        }
    }
}
