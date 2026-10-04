package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class sp0 implements o1.g {
    public final int f30846a;
    public final int[] f30847b;
    public final NotificationCenter.NotificationCenterDelegate f30848c;
    public final View d;

    public sp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f30846a = i10;
        this.f30848c = notificationCenterDelegate;
        this.d = view;
        this.f30847b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30846a) {
            case 0:
                ((zq0) this.f30848c).N0((org.telegram.ui.Cells.g7) this.d, this.f30847b, f7 / 1000.0f);
                return;
            default:
                ((gq0) this.f30848c).d.N0(this.d, this.f30847b, f7 / 1000.0f);
                return;
        }
    }
}
