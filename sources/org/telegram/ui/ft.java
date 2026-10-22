package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ft implements NotificationCenter.NotificationCenterDelegate {
    public final int f37080a;
    public final View f37081b;

    public ft(int i10, View view) {
        this.f37080a = i10;
        this.f37081b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37080a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f37081b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((jj0) this.f37081b).invalidate();
                return;
        }
    }
}
