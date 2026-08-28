package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class io0 implements o1.g {
    public final int f29493a;
    public final int[] f29494b;
    public final NotificationCenter.NotificationCenterDelegate f29495c;
    public final View d;

    public io0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i9) {
        this.f29493a = i9;
        this.f29495c = notificationCenterDelegate;
        this.d = view;
        this.f29494b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f29493a) {
            case 0:
                ((rp0) this.f29495c).Q0((org.telegram.ui.Cells.e7) this.d, this.f29494b, f10 / 1000.0f);
                return;
            default:
                ((yo0) this.f29495c).d.Q0(this.d, this.f29494b, f10 / 1000.0f);
                return;
        }
    }
}
