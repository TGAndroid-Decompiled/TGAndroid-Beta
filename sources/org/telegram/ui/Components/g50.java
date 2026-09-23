package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class g50 extends Paint {
    public final int f24167a;
    public final NotificationCenter.NotificationCenterDelegate f24168b;

    public g50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f24167a = i10;
        this.f24168b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24167a) {
            case 0:
                super.setAlpha(i10);
                ((x50) this.f24168b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24168b).fragmentView.invalidate();
                return;
        }
    }
}
