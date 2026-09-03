package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class k50 extends Paint {
    public final int f28274a;
    public final NotificationCenter.NotificationCenterDelegate f28275b;

    public k50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f28274a = i10;
        this.f28275b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28274a) {
            case 0:
                super.setAlpha(i10);
                ((z50) this.f28275b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28275b).fragmentView.invalidate();
                return;
        }
    }
}
