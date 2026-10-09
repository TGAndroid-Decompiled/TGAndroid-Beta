package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class eq0 implements o1.g {
    public final int f26146a;
    public final int[] f26147b;
    public final NotificationCenter.NotificationCenterDelegate f26148c;
    public final View d;

    public eq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26146a = i10;
        this.f26148c = notificationCenterDelegate;
        this.d = view;
        this.f26147b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26146a) {
            case 0:
                ((mr0) this.f26148c).R0((org.telegram.ui.Cells.g7) this.d, this.f26147b, f7 / 1000.0f);
                return;
            default:
                ((tq0) this.f26148c).d.R0(this.d, this.f26147b, f7 / 1000.0f);
                return;
        }
    }
}
