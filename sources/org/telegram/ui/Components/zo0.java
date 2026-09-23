package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zo0 implements o1.g {
    public final int f30633a;
    public final int[] f30634b;
    public final NotificationCenter.NotificationCenterDelegate f30635c;
    public final View d;

    public zo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30633a = i10;
        this.f30635c = notificationCenterDelegate;
        this.d = view;
        this.f30634b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30633a) {
            case 0:
                ((hq0) this.f30635c).Q0((org.telegram.ui.Cells.f7) this.d, this.f30634b, f7 / 1000.0f);
                return;
            default:
                ((op0) this.f30635c).d.Q0(this.d, this.f30634b, f7 / 1000.0f);
                return;
        }
    }
}
