package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class aq0 implements o1.g {
    public final int f24825a;
    public final int[] f24826b;
    public final NotificationCenter.NotificationCenterDelegate f24827c;
    public final View d;

    public aq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f24825a = i10;
        this.f24827c = notificationCenterDelegate;
        this.d = view;
        this.f24826b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f24825a) {
            case 0:
                ((ir0) this.f24827c).V0((org.telegram.ui.Cells.g7) this.d, this.f24826b, f7 / 1000.0f);
                return;
            default:
                ((pq0) this.f24827c).d.V0(this.d, this.f24826b, f7 / 1000.0f);
                return;
        }
    }
}
