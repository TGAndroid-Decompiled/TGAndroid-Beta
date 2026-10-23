package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ze0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f33206a;
    public final Utilities.Callback f33207b;
    public final NotificationCenter.NotificationCenterDelegate[] f33208c;

    public ze0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f33206a = i10;
        this.f33207b = callback;
        this.f33208c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f33206a) {
                Utilities.Callback callback = this.f33207b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f33208c[0], i12);
            }
        }
    }
}
