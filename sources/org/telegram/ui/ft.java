package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ft implements NotificationCenter.NotificationCenterDelegate {
    public final int f37070a;
    public final View f37071b;

    public ft(int i10, View view) {
        this.f37070a = i10;
        this.f37071b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37070a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37071b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((jj0) this.f37071b).invalidate();
                return;
        }
    }
}
