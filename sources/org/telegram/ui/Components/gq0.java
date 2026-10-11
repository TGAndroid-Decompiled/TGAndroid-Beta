package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class gq0 implements o1.g {
    public final int f26805a;
    public final int[] f26806b;
    public final NotificationCenter.NotificationCenterDelegate f26807c;
    public final View d;

    public gq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26805a = i10;
        this.f26807c = notificationCenterDelegate;
        this.d = view;
        this.f26806b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26805a) {
            case 0:
                ((or0) this.f26807c).R0((org.telegram.ui.Cells.g7) this.d, this.f26806b, f7 / 1000.0f);
                return;
            default:
                ((vq0) this.f26807c).d.R0(this.d, this.f26806b, f7 / 1000.0f);
                return;
        }
    }
}
