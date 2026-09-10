package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class p50 extends Paint {
    public final int f26039a;
    public final NotificationCenter.NotificationCenterDelegate f26040b;

    public p50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f26039a = i10;
        this.f26040b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f26039a) {
            case 0:
                super.setAlpha(i10);
                ((f60) this.f26040b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f26040b).fragmentView.invalidate();
                return;
        }
    }
}
