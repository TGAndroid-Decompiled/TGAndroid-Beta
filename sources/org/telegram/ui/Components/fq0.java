package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class fq0 implements o1.g {
    public final int f28292a;
    public final int[] f28293b;
    public final NotificationCenter.NotificationCenterDelegate f28294c;
    public final View d;

    public fq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f28292a = i10;
        this.f28294c = notificationCenterDelegate;
        this.d = view;
        this.f28293b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28292a) {
            case 0:
                ((mr0) this.f28294c).S0((org.telegram.ui.Cells.k7) this.d, this.f28293b, f7 / 1000.0f);
                return;
            default:
                ((tq0) this.f28294c).d.S0(this.d, this.f28293b, f7 / 1000.0f);
                return;
        }
    }
}
