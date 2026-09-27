package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class op0 implements o1.g {
    public final int f27177a;
    public final int[] f27178b;
    public final NotificationCenter.NotificationCenterDelegate f27179c;
    public final View d;

    public op0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27177a = i10;
        this.f27179c = notificationCenterDelegate;
        this.d = view;
        this.f27178b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27177a) {
            case 0:
                ((vq0) this.f27179c).N0((org.telegram.ui.Cells.g7) this.d, this.f27178b, f7 / 1000.0f);
                return;
            default:
                ((cq0) this.f27179c).d.N0(this.d, this.f27178b, f7 / 1000.0f);
                return;
        }
    }
}
