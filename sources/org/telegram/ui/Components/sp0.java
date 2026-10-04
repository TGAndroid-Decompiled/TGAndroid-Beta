package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class sp0 implements o1.g {
    public final int f30852a;
    public final int[] f30853b;
    public final NotificationCenter.NotificationCenterDelegate f30854c;
    public final View d;

    public sp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30852a = i10;
        this.f30854c = notificationCenterDelegate;
        this.d = view;
        this.f30853b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30852a) {
            case 0:
                ((zq0) this.f30854c).N0((org.telegram.ui.Cells.g7) this.d, this.f30853b, f7 / 1000.0f);
                return;
            default:
                ((gq0) this.f30854c).d.N0(this.d, this.f30853b, f7 / 1000.0f);
                return;
        }
    }
}
