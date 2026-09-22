package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class op0 implements o1.g {
    public final int f27168a;
    public final int[] f27169b;
    public final NotificationCenter.NotificationCenterDelegate f27170c;
    public final View d;

    public op0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27168a = i10;
        this.f27170c = notificationCenterDelegate;
        this.d = view;
        this.f27169b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27168a) {
            case 0:
                ((wq0) this.f27170c).Q0((org.telegram.ui.Cells.h7) this.d, this.f27169b, f7 / 1000.0f);
                return;
            default:
                ((dq0) this.f27170c).d.Q0(this.d, this.f27169b, f7 / 1000.0f);
                return;
        }
    }
}
