package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class fq0 implements o1.g {
    public final int f28294a;
    public final int[] f28295b;
    public final NotificationCenter.NotificationCenterDelegate f28296c;
    public final View d;

    public fq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f28294a = i10;
        this.f28296c = notificationCenterDelegate;
        this.d = view;
        this.f28295b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28294a) {
            case 0:
                ((mr0) this.f28296c).S0((org.telegram.ui.Cells.k7) this.d, this.f28295b, f7 / 1000.0f);
                return;
            default:
                ((tq0) this.f28296c).d.S0(this.d, this.f28295b, f7 / 1000.0f);
                return;
        }
    }
}
