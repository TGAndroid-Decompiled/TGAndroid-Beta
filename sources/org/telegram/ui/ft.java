package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ft implements NotificationCenter.NotificationCenterDelegate {
    public final int f37077a;
    public final View f37078b;

    public ft(int i10, View view) {
        this.f37077a = i10;
        this.f37078b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37077a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37078b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((jj0) this.f37078b).invalidate();
                return;
        }
    }
}
