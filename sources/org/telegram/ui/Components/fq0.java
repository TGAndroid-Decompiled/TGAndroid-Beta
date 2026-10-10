package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class fq0 implements o1.g {
    public final int f26492a;
    public final int[] f26493b;
    public final NotificationCenter.NotificationCenterDelegate f26494c;
    public final View d;

    public fq0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i10) {
        this.f26492a = i10;
        this.f26494c = notificationCenterDelegate;
        this.d = view;
        this.f26493b = iArr;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26492a) {
            case 0:
                ((nr0) this.f26494c).R0((org.telegram.ui.Cells.g7) this.d, this.f26493b, f7 / 1000.0f);
                return;
            default:
                ((uq0) this.f26494c).d.R0(this.d, this.f26493b, f7 / 1000.0f);
                return;
        }
    }
}
