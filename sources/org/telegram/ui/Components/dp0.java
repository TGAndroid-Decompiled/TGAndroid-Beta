package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class dp0 implements o1.g {
    public final int f24342a;
    public final int[] f24343b;
    public final NotificationCenter.NotificationCenterDelegate f24344c;
    public final View d;

    public dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f24342a = i10;
        this.f24344c = notificationCenterDelegate;
        this.d = view;
        this.f24343b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f24342a) {
            case 0:
                ((lq0) this.f24344c).Q0((org.telegram.ui.Cells.e7) this.d, this.f24343b, f10 / 1000.0f);
                return;
            default:
                ((sp0) this.f24344c).d.Q0(this.d, this.f24343b, f10 / 1000.0f);
                return;
        }
    }
}
