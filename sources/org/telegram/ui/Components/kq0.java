package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kq0 implements o1.g {
    public final int f27912a;
    public final int[] f27913b;
    public final NotificationCenter.NotificationCenterDelegate f27914c;
    public final View d;

    public kq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27912a = i10;
        this.f27914c = notificationCenterDelegate;
        this.d = view;
        this.f27913b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27912a) {
            case 0:
                ((sr0) this.f27914c).R0((org.telegram.ui.Cells.f7) this.d, this.f27913b, f7 / 1000.0f);
                return;
            default:
                ((zq0) this.f27914c).d.R0(this.d, this.f27913b, f7 / 1000.0f);
                return;
        }
    }
}
