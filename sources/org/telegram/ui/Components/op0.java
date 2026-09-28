package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class op0 implements o1.g {
    public final int f27154a;
    public final int[] f27155b;
    public final NotificationCenter.NotificationCenterDelegate f27156c;
    public final View d;

    public op0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f27154a = i10;
        this.f27156c = notificationCenterDelegate;
        this.d = view;
        this.f27155b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27154a) {
            case 0:
                ((wq0) this.f27156c).Q0((org.telegram.ui.Cells.g7) this.d, this.f27155b, f7 / 1000.0f);
                return;
            default:
                ((dq0) this.f27156c).d.Q0(this.d, this.f27155b, f7 / 1000.0f);
                return;
        }
    }
}
