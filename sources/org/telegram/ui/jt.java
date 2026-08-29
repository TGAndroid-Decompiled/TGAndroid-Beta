package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class jt implements NotificationCenter.NotificationCenterDelegate {
    public final int f39685a;
    public final View f39686b;

    public jt(int i10, View view) {
        this.f39685a = i10;
        this.f39686b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f39685a) {
            case 0:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.f39686b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    y9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((hj0) this.f39686b).invalidate();
                return;
        }
    }
}
