package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ep0 implements o1.g {
    public final int f26623a;
    public final int[] f26624b;
    public final NotificationCenter.NotificationCenterDelegate f26625c;
    public final View d;

    public ep0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26623a = i10;
        this.f26625c = notificationCenterDelegate;
        this.d = view;
        this.f26624b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26623a) {
            case 0:
                ((mq0) this.f26625c).Q0((org.telegram.ui.Cells.e7) this.d, this.f26624b, f10 / 1000.0f);
                return;
            default:
                ((tp0) this.f26625c).d.Q0(this.d, this.f26624b, f10 / 1000.0f);
                return;
        }
    }
}
