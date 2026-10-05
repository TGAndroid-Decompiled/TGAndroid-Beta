package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tp0 implements o1.g {
    public final int f31206a;
    public final int[] f31207b;
    public final NotificationCenter.NotificationCenterDelegate f31208c;
    public final View d;

    public tp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f31206a = i10;
        this.f31208c = notificationCenterDelegate;
        this.d = view;
        this.f31207b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31206a) {
            case 0:
                ((br0) this.f31208c).N0((org.telegram.ui.Cells.g7) this.d, this.f31207b, f7 / 1000.0f);
                return;
            default:
                ((iq0) this.f31208c).d.N0(this.d, this.f31207b, f7 / 1000.0f);
                return;
        }
    }
}
