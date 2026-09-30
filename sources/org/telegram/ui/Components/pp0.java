package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class pp0 implements o1.g {
    public final int f27440a;
    public final int[] f27441b;
    public final NotificationCenter.NotificationCenterDelegate f27442c;
    public final View d;

    public pp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27440a = i10;
        this.f27442c = notificationCenterDelegate;
        this.d = view;
        this.f27441b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27440a) {
            case 0:
                ((xq0) this.f27442c).Q0((org.telegram.ui.Cells.g7) this.d, this.f27441b, f7 / 1000.0f);
                return;
            default:
                ((eq0) this.f27442c).d.Q0(this.d, this.f27441b, f7 / 1000.0f);
                return;
        }
    }
}
