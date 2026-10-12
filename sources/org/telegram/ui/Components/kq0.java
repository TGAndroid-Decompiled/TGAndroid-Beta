package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kq0 implements o1.g {
    public final int f27926a;
    public final int[] f27927b;
    public final NotificationCenter.NotificationCenterDelegate f27928c;
    public final View d;

    public kq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27926a = i10;
        this.f27928c = notificationCenterDelegate;
        this.d = view;
        this.f27927b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27926a) {
            case 0:
                ((sr0) this.f27928c).R0((org.telegram.ui.Cells.f7) this.d, this.f27927b, f7 / 1000.0f);
                return;
            default:
                ((zq0) this.f27928c).d.R0(this.d, this.f27927b, f7 / 1000.0f);
                return;
        }
    }
}
