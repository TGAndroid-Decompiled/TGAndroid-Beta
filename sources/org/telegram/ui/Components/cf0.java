package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class cf0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f23723a;
    public final Utilities.Callback f23724b;
    public final NotificationCenter.NotificationCenterDelegate[] f23725c;

    public cf0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f23723a = i10;
        this.f23724b = callback;
        this.f23725c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f23723a) {
                Utilities.Callback callback = this.f23724b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f23725c[0], i12);
            }
        }
    }
}
