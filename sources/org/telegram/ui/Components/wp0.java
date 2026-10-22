package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class wp0 implements o1.g {
    public final int f32224a;
    public final int[] f32225b;
    public final NotificationCenter.NotificationCenterDelegate f32226c;
    public final View d;

    public wp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f32224a = i10;
        this.f32226c = notificationCenterDelegate;
        this.d = view;
        this.f32225b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32224a) {
            case 0:
                ((fr0) this.f32226c).S0((org.telegram.ui.Cells.e7) this.d, this.f32225b, f7 / 1000.0f);
                return;
            default:
                ((lq0) this.f32226c).d.S0(this.d, this.f32225b, f7 / 1000.0f);
                return;
        }
    }
}
