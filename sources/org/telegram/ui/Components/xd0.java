package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class xd0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34701a;
    public final Utilities.Callback f34702b;
    public final NotificationCenter.NotificationCenterDelegate[] f34703c;

    public xd0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f34701a = i10;
        this.f34702b = callback;
        this.f34703c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f34701a) {
                Utilities.Callback callback = this.f34702b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f34703c[0], i12);
            }
        }
    }
}
