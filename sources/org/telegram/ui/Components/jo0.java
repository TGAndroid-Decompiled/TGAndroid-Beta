package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

public final class jo0 implements o1.g {

    public final int f29769a;

    public final int[] f29770b;

    public final NotificationCenter.NotificationCenterDelegate f29771c;
    public final View d;

    public jo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f29769a = i10;
        this.f29771c = notificationCenterDelegate;
        this.d = view;
        this.f29770b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f29769a) {
            case 0:
                ((sp0) this.f29771c).Q0((org.telegram.ui.Cells.b7) this.d, this.f29770b, f10 / 1000.0f);
                break;
            default:
                ((yo0) this.f29771c).d.Q0(this.d, this.f29770b, f10 / 1000.0f);
                break;
        }
    }
}
