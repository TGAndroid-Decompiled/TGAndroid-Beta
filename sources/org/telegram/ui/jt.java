package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class jt implements NotificationCenter.NotificationCenterDelegate {
    public final int f38698a;
    public final View f38699b;

    public jt(int i10, View view) {
        this.f38698a = i10;
        this.f38699b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f38698a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f38699b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((nj0) this.f38699b).invalidate();
                return;
        }
    }
}
