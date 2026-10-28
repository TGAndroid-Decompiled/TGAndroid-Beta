package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class xe0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34744a;
    public final Utilities.Callback f34745b;
    public final NotificationCenter.NotificationCenterDelegate[] f34746c;

    public xe0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f34744a = i10;
        this.f34745b = callback;
        this.f34746c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f34744a) {
                Utilities.Callback callback = this.f34745b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f34746c[0], i12);
            }
        }
    }
}
