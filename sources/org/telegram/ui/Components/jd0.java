package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class jd0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f29719a;
    public final Utilities.Callback f29720b;
    public final NotificationCenter.NotificationCenterDelegate[] f29721c;

    public jd0(int i9, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f29719a = i9;
        this.f29720b = callback;
        this.f29721c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.activityPermissionsGranted;
        if (i9 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f29719a) {
                Utilities.Callback callback = this.f29720b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f29721c[0], i11);
            }
        }
    }
}
