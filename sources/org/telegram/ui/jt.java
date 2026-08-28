package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class jt implements NotificationCenter.NotificationCenterDelegate {
    public final int f39624a;
    public final View f39625b;

    public jt(int i9, View view) {
        this.f39624a = i9;
        this.f39625b = view;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object[] objArr) {
        switch (this.f39624a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f39625b;
                if (i9 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((jj0) this.f39625b).invalidate();
                return;
        }
    }
}
