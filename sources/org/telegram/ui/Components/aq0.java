package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class aq0 implements o1.g {
    public final int f23284a;
    public final int[] f23285b;
    public final NotificationCenter.NotificationCenterDelegate f23286c;
    public final View d;

    public aq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f23284a = i10;
        this.f23286c = notificationCenterDelegate;
        this.d = view;
        this.f23285b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f23284a) {
            case 0:
                ((ir0) this.f23286c).R0((org.telegram.ui.Cells.f7) this.d, this.f23285b, f7 / 1000.0f);
                return;
            default:
                ((pq0) this.f23286c).d.R0(this.d, this.f23285b, f7 / 1000.0f);
                return;
        }
    }
}
