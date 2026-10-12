package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class bf0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f23750a;
    public final Utilities.Callback f23751b;
    public final NotificationCenter.NotificationCenterDelegate[] f23752c;

    public bf0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f23750a = i10;
        this.f23751b = callback;
        this.f23752c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f23750a) {
                Utilities.Callback callback = this.f23751b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f23752c[0], i12);
            }
        }
    }
}
