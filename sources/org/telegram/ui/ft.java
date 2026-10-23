package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ft implements NotificationCenter.NotificationCenterDelegate {
    public final int f37081a;
    public final View f37082b;

    public ft(int i10, View view) {
        this.f37081a = i10;
        this.f37082b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37081a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37082b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((jj0) this.f37082b).invalidate();
                return;
        }
    }
}
