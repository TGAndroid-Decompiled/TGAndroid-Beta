package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ft implements NotificationCenter.NotificationCenterDelegate {
    public final int f37076a;
    public final View f37077b;

    public ft(int i10, View view) {
        this.f37076a = i10;
        this.f37077b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37076a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37077b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((ij0) this.f37077b).invalidate();
                return;
        }
    }
}
