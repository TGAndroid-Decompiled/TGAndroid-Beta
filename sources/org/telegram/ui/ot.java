package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ot implements NotificationCenter.NotificationCenterDelegate {
    public final int f36344a;
    public final View f36345b;

    public ot(int i10, View view) {
        this.f36344a = i10;
        this.f36345b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f36344a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f36345b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((tj0) this.f36345b).invalidate();
                return;
        }
    }
}
