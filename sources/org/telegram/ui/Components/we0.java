package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class we0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34428a;
    public final Utilities.Callback f34429b;
    public final NotificationCenter.NotificationCenterDelegate[] f34430c;

    public we0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f34428a = i10;
        this.f34429b = callback;
        this.f34430c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f34428a) {
                Utilities.Callback callback = this.f34429b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f34430c[0], i12);
            }
        }
    }
}
