package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class cp0 implements o1.g {
    public final int f24008a;
    public final int[] f24009b;
    public final NotificationCenter.NotificationCenterDelegate f24010c;
    public final View d;

    public cp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f24008a = i10;
        this.f24010c = notificationCenterDelegate;
        this.d = view;
        this.f24009b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f24008a) {
            case 0:
                ((lq0) this.f24010c).Q0((org.telegram.ui.Cells.d7) this.d, this.f24009b, f10 / 1000.0f);
                return;
            default:
                ((rp0) this.f24010c).d.Q0(this.d, this.f24009b, f10 / 1000.0f);
                return;
        }
    }
}
