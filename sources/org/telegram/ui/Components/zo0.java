package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zo0 implements o1.g {
    public final int f30630a;
    public final int[] f30631b;
    public final NotificationCenter.NotificationCenterDelegate f30632c;
    public final View d;

    public zo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30630a = i10;
        this.f30632c = notificationCenterDelegate;
        this.d = view;
        this.f30631b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30630a) {
            case 0:
                ((hq0) this.f30632c).Q0((org.telegram.ui.Cells.f7) this.d, this.f30631b, f7 / 1000.0f);
                return;
            default:
                ((op0) this.f30632c).d.Q0(this.d, this.f30631b, f7 / 1000.0f);
                return;
        }
    }
}
