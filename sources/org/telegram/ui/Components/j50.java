package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class j50 extends Paint {
    public final int f25843a;
    public final NotificationCenter.NotificationCenterDelegate f25844b;

    public j50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f25843a = i10;
        this.f25844b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25843a) {
            case 0:
                super.setAlpha(i10);
                ((y50) this.f25844b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25844b).fragmentView.invalidate();
                return;
        }
    }
}
