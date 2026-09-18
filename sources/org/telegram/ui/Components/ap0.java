package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ap0 implements o1.g {
    public final int f22457a;
    public final int[] f22458b;
    public final NotificationCenter.NotificationCenterDelegate f22459c;
    public final View d;

    public ap0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f22457a = i10;
        this.f22459c = notificationCenterDelegate;
        this.d = view;
        this.f22458b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f22457a) {
            case 0:
                ((iq0) this.f22459c).Q0((org.telegram.ui.Cells.f7) this.d, this.f22458b, f7 / 1000.0f);
                return;
            default:
                ((pp0) this.f22459c).d.Q0(this.d, this.f22458b, f7 / 1000.0f);
                return;
        }
    }
}
