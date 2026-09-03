package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class dp0 implements o1.g {
    public final int f26346a;
    public final int[] f26347b;
    public final NotificationCenter.NotificationCenterDelegate f26348c;
    public final View d;

    public dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26346a = i10;
        this.f26348c = notificationCenterDelegate;
        this.d = view;
        this.f26347b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26346a) {
            case 0:
                ((lq0) this.f26348c).Q0((org.telegram.ui.Cells.e7) this.d, this.f26347b, f10 / 1000.0f);
                return;
            default:
                ((sp0) this.f26348c).d.Q0(this.d, this.f26347b, f10 / 1000.0f);
                return;
        }
    }
}
