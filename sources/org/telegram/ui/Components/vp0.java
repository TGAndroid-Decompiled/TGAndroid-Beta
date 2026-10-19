package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class vp0 implements o1.g {
    public final int f31901a;
    public final int[] f31902b;
    public final NotificationCenter.NotificationCenterDelegate f31903c;
    public final View d;

    public vp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f31901a = i10;
        this.f31903c = notificationCenterDelegate;
        this.d = view;
        this.f31902b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31901a) {
            case 0:
                ((er0) this.f31903c).S0((org.telegram.ui.Cells.e7) this.d, this.f31902b, f7 / 1000.0f);
                return;
            default:
                ((kq0) this.f31903c).d.S0(this.d, this.f31902b, f7 / 1000.0f);
                return;
        }
    }
}
