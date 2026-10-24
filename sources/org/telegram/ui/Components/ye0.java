package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ye0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f32901a;
    public final Utilities.Callback f32902b;
    public final NotificationCenter.NotificationCenterDelegate[] f32903c;

    public ye0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f32901a = i10;
        this.f32902b = callback;
        this.f32903c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f32901a) {
                Utilities.Callback callback = this.f32902b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f32903c[0], i12);
            }
        }
    }
}
