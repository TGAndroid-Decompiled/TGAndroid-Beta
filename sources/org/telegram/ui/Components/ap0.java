package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ap0 implements o1.g {
    public final int f24436a;
    public final int[] f24437b;
    public final NotificationCenter.NotificationCenterDelegate f24438c;
    public final View d;

    public ap0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f24436a = i10;
        this.f24438c = notificationCenterDelegate;
        this.d = view;
        this.f24437b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f24436a) {
            case 0:
                ((hq0) this.f24438c).Q0((org.telegram.ui.Cells.f7) this.d, this.f24437b, f7 / 1000.0f);
                return;
            default:
                ((op0) this.f24438c).d.Q0(this.d, this.f24437b, f7 / 1000.0f);
                return;
        }
    }
}
