package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class me0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f26434a;
    public final Utilities.Callback f26435b;
    public final NotificationCenter.NotificationCenterDelegate[] f26436c;

    public me0(int i10, Utilities.Callback callback, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        this.f26434a = i10;
        this.f26435b = callback;
        this.f26436c = notificationCenterDelegateArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.activityPermissionsGranted;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.f26434a) {
                Utilities.Callback callback = this.f26435b;
                if (callback != null) {
                    callback.run(iArr);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this.f26436c[0], i12);
            }
        }
    }
}
