package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zp0 implements o1.g {
    public final int f33331a;
    public final int[] f33332b;
    public final NotificationCenter.NotificationCenterDelegate f33333c;
    public final View d;

    public zp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f33331a = i10;
        this.f33333c = notificationCenterDelegate;
        this.d = view;
        this.f33332b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33331a) {
            case 0:
                ((hr0) this.f33333c).V0((org.telegram.ui.Cells.g7) this.d, this.f33332b, f7 / 1000.0f);
                return;
            default:
                ((oq0) this.f33333c).d.V0(this.d, this.f33332b, f7 / 1000.0f);
                return;
        }
    }
}
