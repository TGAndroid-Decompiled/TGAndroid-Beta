package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class gt implements NotificationCenter.NotificationCenterDelegate {
    public final int f39775a;
    public final View f39776b;

    public gt(int i10, View view) {
        this.f39775a = i10;
        this.f39776b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f39775a) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.f39776b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    gaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((kj0) this.f39776b).invalidate();
                return;
        }
    }
}
