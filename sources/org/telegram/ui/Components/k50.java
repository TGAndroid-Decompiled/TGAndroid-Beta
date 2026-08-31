package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class k50 extends Paint {
    public final int f28271a;
    public final NotificationCenter.NotificationCenterDelegate f28272b;

    public k50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f28271a = i10;
        this.f28272b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28271a) {
            case 0:
                super.setAlpha(i10);
                ((z50) this.f28272b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28272b).fragmentView.invalidate();
                return;
        }
    }
}
