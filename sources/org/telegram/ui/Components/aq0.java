package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class aq0 implements o1.g {
    public final int f23607a;
    public final int[] f23608b;
    public final NotificationCenter.NotificationCenterDelegate f23609c;
    public final View d;

    public aq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f23607a = i10;
        this.f23609c = notificationCenterDelegate;
        this.d = view;
        this.f23608b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f23607a) {
            case 0:
                ((jr0) this.f23609c).R0((org.telegram.ui.Cells.g7) this.d, this.f23608b, f7 / 1000.0f);
                return;
            default:
                ((qq0) this.f23609c).d.R0(this.d, this.f23608b, f7 / 1000.0f);
                return;
        }
    }
}
