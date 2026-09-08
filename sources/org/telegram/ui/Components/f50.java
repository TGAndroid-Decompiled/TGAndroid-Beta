package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f25942a;
    public final NotificationCenter.NotificationCenterDelegate f25943b;

    public f50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f25942a = i10;
        this.f25943b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25942a) {
            case 0:
                super.setAlpha(i10);
                ((w50) this.f25943b).invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25943b).fragmentView.invalidate();
                return;
        }
    }
}
