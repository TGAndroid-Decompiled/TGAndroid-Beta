package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class fq0 implements o1.g {
    public final int f26541a;
    public final int[] f26542b;
    public final NotificationCenter.NotificationCenterDelegate f26543c;
    public final View d;

    public fq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26541a = i10;
        this.f26543c = notificationCenterDelegate;
        this.d = view;
        this.f26542b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26541a) {
            case 0:
                ((nr0) this.f26543c).R0((org.telegram.ui.Cells.g7) this.d, this.f26542b, f7 / 1000.0f);
                return;
            default:
                ((uq0) this.f26543c).d.R0(this.d, this.f26542b, f7 / 1000.0f);
                return;
        }
    }
}
