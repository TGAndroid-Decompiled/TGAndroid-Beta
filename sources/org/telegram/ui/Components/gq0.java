package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class gq0 implements o1.g {
    public final int f28718a;
    public final int[] f28719b;
    public final NotificationCenter.NotificationCenterDelegate f28720c;
    public final View d;

    public gq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f28718a = i10;
        this.f28720c = notificationCenterDelegate;
        this.d = view;
        this.f28719b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28718a) {
            case 0:
                ((nr0) this.f28720c).S0((org.telegram.ui.Cells.k7) this.d, this.f28719b, f7 / 1000.0f);
                return;
            default:
                ((uq0) this.f28720c).d.S0(this.d, this.f28719b, f7 / 1000.0f);
                return;
        }
    }
}
