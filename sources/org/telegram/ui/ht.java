package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ht implements NotificationCenter.NotificationCenterDelegate {
    public final int f37628a;
    public final View f37629b;

    public ht(int i10, View view) {
        this.f37628a = i10;
        this.f37629b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37628a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37629b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((lj0) this.f37629b).invalidate();
                return;
        }
    }
}
