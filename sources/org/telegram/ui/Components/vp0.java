package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class vp0 implements o1.g {
    public final int f31899a;
    public final int[] f31900b;
    public final NotificationCenter.NotificationCenterDelegate f31901c;
    public final View d;

    public vp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f31899a = i10;
        this.f31901c = notificationCenterDelegate;
        this.d = view;
        this.f31900b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31899a) {
            case 0:
                ((dr0) this.f31901c).R0((org.telegram.ui.Cells.e7) this.d, this.f31900b, f7 / 1000.0f);
                return;
            default:
                ((kq0) this.f31901c).d.R0(this.d, this.f31900b, f7 / 1000.0f);
                return;
        }
    }
}
