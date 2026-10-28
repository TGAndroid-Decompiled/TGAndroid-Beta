package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kb1;
public final class h6 extends kb1 {
    @Override
    public final void P(int i10, int i11) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        boolean z11 = true;
        if (point.x <= point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 > i11) {
            z11 = false;
        }
        if (z10 == z11) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }
}
