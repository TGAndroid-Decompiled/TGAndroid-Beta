package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ProfileActivity;

public final class u40 extends Paint {

    public final int f32966a;

    public final NotificationCenter.NotificationCenterDelegate f32967b;

    public u40(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        super(1);
        this.f32966a = i10;
        this.f32967b = notificationCenterDelegate;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32966a) {
            case 0:
                super.setAlpha(i10);
                ((k50) this.f32967b).invalidate();
                break;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f32967b).fragmentView.invalidate();
                break;
        }
    }
}
