package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

public final class lt implements NotificationCenter.NotificationCenterDelegate {

    public final int f40246a;

    public final View f40247b;

    public lt(int i10, View view) {
        this.f40246a = i10;
        this.f40247b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f40246a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f40247b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    x9Var.getTextView().invalidate();
                }
                break;
            default:
                ((lj0) this.f40247b).invalidate();
                break;
        }
    }
}
