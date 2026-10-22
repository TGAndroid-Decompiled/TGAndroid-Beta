package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class we0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f32097a;
    public final Utilities.Callback f32098b;
    public final NotificationCenter.NotificationCenterDelegate[] f32099c;

    public we0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f32097a = i10;
        this.f32098b = callback;
        this.f32099c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f32097a) {
                Utilities.Callback callback = this.f32098b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f32099c[0], i12);
            }
        }
    }
}
