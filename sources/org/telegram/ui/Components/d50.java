package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class d50 extends Paint {
    public final int f27660a;
    public final NotificationCenter.NotificationCenterDelegate f27661b;

    public d50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f27660a = i10;
        this.f27661b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27660a) {
            case 0:
                super.setAlpha(i10);
                ((s50) this.f27661b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f27661b).fragmentView.invalidate();
                return;
        }
    }
}
