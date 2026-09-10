package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kp0 implements o1.g {
    public final int f24790a;
    public final int[] f24791b;
    public final NotificationCenter.NotificationCenterDelegate f24792c;
    public final View d;

    public kp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f24790a = i10;
        this.f24792c = notificationCenterDelegate;
        this.d = view;
        this.f24791b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f24790a) {
            case 0:
                ((sq0) this.f24792c).Q0((org.telegram.ui.Cells.h7) this.d, this.f24791b, f7 / 1000.0f);
                return;
            default:
                ((yp0) this.f24792c).d.Q0(this.d, this.f24791b, f7 / 1000.0f);
                return;
        }
    }
}
