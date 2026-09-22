package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zo0 implements o1.g {
    public final int f30627a;
    public final int[] f30628b;
    public final NotificationCenter.NotificationCenterDelegate f30629c;
    public final View d;

    public zo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30627a = i10;
        this.f30629c = notificationCenterDelegate;
        this.d = view;
        this.f30628b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30627a) {
            case 0:
                ((hq0) this.f30629c).Q0((org.telegram.ui.Cells.f7) this.d, this.f30628b, f7 / 1000.0f);
                return;
            default:
                ((op0) this.f30629c).d.Q0(this.d, this.f30628b, f7 / 1000.0f);
                return;
        }
    }
}
