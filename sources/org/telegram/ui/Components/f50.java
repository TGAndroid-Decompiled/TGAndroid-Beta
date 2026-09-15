package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f23820a;
    public final NotificationCenter.NotificationCenterDelegate f23821b;

    public f50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f23820a = i10;
        this.f23821b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f23820a) {
            case 0:
                super.setAlpha(i10);
                ((w50) this.f23821b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f23821b).fragmentView.invalidate();
                return;
        }
    }
}
