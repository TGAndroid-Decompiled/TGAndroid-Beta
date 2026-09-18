package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f23779a;
    public final NotificationCenter.NotificationCenterDelegate f23780b;

    public f50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f23779a = i10;
        this.f23780b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f23779a) {
            case 0:
                super.setAlpha(i10);
                ((w50) this.f23780b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f23780b).fragmentView.invalidate();
                return;
        }
    }
}
