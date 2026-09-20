package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ke0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f25765a;
    public final Utilities.Callback f25766b;
    public final NotificationCenter.NotificationCenterDelegate[] f25767c;

    public ke0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f25765a = i10;
        this.f25766b = callback;
        this.f25767c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f25765a) {
                Utilities.Callback callback = this.f25766b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f25767c[0], i12);
            }
        }
    }
}
