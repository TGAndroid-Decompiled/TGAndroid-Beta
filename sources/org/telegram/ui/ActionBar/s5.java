package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s5 extends k7.z5 {
    @Override
    public final void b(int i10, int i11) {
        boolean z4;
        Point point = AndroidUtilities.displaySize;
        boolean z10 = true;
        if (point.x <= point.y) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 > i11) {
            z10 = false;
        }
        if (z4 == z10) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }
}
