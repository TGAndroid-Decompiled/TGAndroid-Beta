package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ce0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f24994a;
    public final Utilities.Callback f24995b;
    public final NotificationCenter.NotificationCenterDelegate[] f24996c;

    public ce0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f24994a = i10;
        this.f24995b = callback;
        this.f24996c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f24994a) {
                Utilities.Callback callback = this.f24995b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f24996c[0], i12);
            }
        }
    }
}
