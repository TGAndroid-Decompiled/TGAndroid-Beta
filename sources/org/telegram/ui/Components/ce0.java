package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class ce0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f23076a;
    public final Utilities.Callback f23077b;
    public final NotificationCenter.NotificationCenterDelegate[] f23078c;

    public ce0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f23076a = i10;
        this.f23077b = callback;
        this.f23078c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f23076a) {
                Utilities.Callback callback = this.f23077b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f23078c[0], i12);
            }
        }
    }
}
