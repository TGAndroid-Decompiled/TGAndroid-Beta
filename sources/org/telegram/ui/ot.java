package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ot implements NotificationCenter.NotificationCenterDelegate {
    public final int f36341a;
    public final View f36342b;

    public ot(int i10, View view) {
        this.f36341a = i10;
        this.f36342b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f36341a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f36342b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((tj0) this.f36342b).invalidate();
                return;
        }
    }
}
