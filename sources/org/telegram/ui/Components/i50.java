package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class i50 extends Paint {
    public final int f25557a;
    public final NotificationCenter.NotificationCenterDelegate f25558b;

    public i50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f25557a = i10;
        this.f25558b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25557a) {
            case 0:
                super.setAlpha(i10);
                ((x50) this.f25558b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25558b).fragmentView.invalidate();
                return;
        }
    }
}
