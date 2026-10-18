package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ht implements NotificationCenter.NotificationCenterDelegate {
    public final int f37603a;
    public final View f37604b;

    public ht(int i10, View view) {
        this.f37603a = i10;
        this.f37604b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37603a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37604b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((kj0) this.f37604b).invalidate();
                return;
        }
    }
}
