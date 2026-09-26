package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class np0 implements o1.g {
    public final int f26863a;
    public final int[] f26864b;
    public final NotificationCenter.NotificationCenterDelegate f26865c;
    public final View d;

    public np0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26863a = i10;
        this.f26865c = notificationCenterDelegate;
        this.d = view;
        this.f26864b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26863a) {
            case 0:
                ((vq0) this.f26865c).Q0((org.telegram.ui.Cells.g7) this.d, this.f26864b, f7 / 1000.0f);
                return;
            default:
                ((cq0) this.f26865c).d.Q0(this.d, this.f26864b, f7 / 1000.0f);
                return;
        }
    }
}
