package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class to0 implements o1.h {
    public final int f33016a;
    public final int[] f33017b;
    public final NotificationCenter.NotificationCenterDelegate f33018c;
    public final View d;

    public to0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f33016a = i10;
        this.f33018c = notificationCenterDelegate;
        this.d = view;
        this.f33017b = iArr;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.f33016a) {
            case 0:
                ((dq0) this.f33018c).Q0((org.telegram.ui.Cells.c7) this.d, this.f33017b, f9 / 1000.0f);
                return;
            default:
                ((jp0) this.f33018c).d.Q0(this.d, this.f33017b, f9 / 1000.0f);
                return;
        }
    }
}
