package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mp0 implements o1.g {
    public final int f26560a;
    public final int[] f26561b;
    public final NotificationCenter.NotificationCenterDelegate f26562c;
    public final View d;

    public mp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26560a = i10;
        this.f26562c = notificationCenterDelegate;
        this.d = view;
        this.f26561b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26560a) {
            case 0:
                ((uq0) this.f26562c).Q0((org.telegram.ui.Cells.g7) this.d, this.f26561b, f7 / 1000.0f);
                return;
            default:
                ((bq0) this.f26562c).d.Q0(this.d, this.f26561b, f7 / 1000.0f);
                return;
        }
    }
}
