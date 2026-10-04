package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class sp0 implements o1.g {
    public final int f30845a;
    public final int[] f30846b;
    public final NotificationCenter.NotificationCenterDelegate f30847c;
    public final View d;

    public sp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30845a = i10;
        this.f30847c = notificationCenterDelegate;
        this.d = view;
        this.f30846b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30845a) {
            case 0:
                ((zq0) this.f30847c).N0((org.telegram.ui.Cells.g7) this.d, this.f30846b, f7 / 1000.0f);
                return;
            default:
                ((gq0) this.f30847c).d.N0(this.d, this.f30846b, f7 / 1000.0f);
                return;
        }
    }
}
